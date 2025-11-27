/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  narja
 * Created: 26 de nov. de 2025
 */

DROP TABLE IF EXISTS transacoes;
DROP TABLE IF EXISTS contas;
CREATE TABLE contas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    cpf VARCHAR(14) NOT NULL UNIQUE,
    numero_conta VARCHAR(20) NOT NULL UNIQUE,
    titular VARCHAR(100) NOT NULL,
    email VARCHAR(100),
    
    cep VARCHAR(10),
    rua VARCHAR(100),
    bairro VARCHAR(100), -- Campo bairro adicionado aqui
    numero VARCHAR(10),
    complemento VARCHAR(50),
    cidade VARCHAR(50),
    estado CHAR(2),
    
    senha VARCHAR(50) NOT NULL,
    saldo DECIMAL(20, 2) DEFAULT 0.00,
    tipo_conta VARCHAR(20) DEFAULT 'CORRENTE'
);

CREATE TABLE transacoes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    conta_id INT NOT NULL,
    tipo_operacao VARCHAR(20) NOT NULL,
    valor DECIMAL(20, 2) NOT NULL,
    data_hora DATETIME DEFAULT CURRENT_TIMESTAMP,
    detalhes VARCHAR(255),
    
    FOREIGN KEY (conta_id) REFERENCES contas(id)
);

-- Exemplo de INSERT atualizado com um bairro fictício ("Centro")
INSERT INTO contas (cpf, numero_conta, titular, email, cep, rua, bairro, numero, complemento, cidade, estado, senha, saldo, tipo_conta)
VALUES ('123.456.789-10', '1001', 'Admin', 'admin@ufms.br', '79300-000', 'Rua Cuiabá', 'Centro', '123', 'Apto 10', 'Corumbá', 'MS', '1234', 1000.00, 'CORRENTE');