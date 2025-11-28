# Sistema-Bancario
Resumo: Simulação de operações bancárias básicas como abertura de conta, depósitos, saques e transferências entre usuários.

Este é um sistema bancário desktop desenvolvido em Java, utilizando a biblioteca Swing para a interface gráfica, 
MySQL para persistência de dados e integração com API externa para consulta de CEP. 
O projeto segue uma arquitetura em camadas para separar a visão, a regra de negócio e a persistência.

O MySQL foi desenvolvido por Inteligência Artificial somente para realizar a conexão e deixar o App mais legal de interagir.

Foram baixados algumas depêndencias no projeto, sendo eles: 
    MySQL Connector (mysql-connector-j-8.3.0.jar) para realizar a conexão com o Banco Ficticio.

    FlatLaf (flatlaf-3-5-1.jar)para o visual moderno da interface.

    Gson (gson-2.10.1.jar) para utilizar a API Via Cep (https://viacep.com.br).

O projeto inicia no LoginVisao.java sendo seu main, tendo a opção de realizar o login ou sair diretamente do APP. Em caso
de não ter login foi alocado um botão Cadastre-se para direcionar o usuário para a tela de cadastro.

--------------------------------------------------------------------------------------------------

Como arquitetura temos:
visao.menus - Gráficos, parte visual das telas iniciais.
    Tela de Login - [LoginVisao]
    Tela de Cadastro - [InicioLoginVisao]

visao - Gráficos porém para as operações já dentro do sistema.
    Tela Inicial após o Login - [InicioLoginVisao]
    Tela de Depósito - [DepositoVisao]
    Tela de Saque - [SaqueVisao]
    Tela de Transferencia - [TransferenciaVisao]
    Tela de Extrato - [ExtratoVisao]

regraNegocio - Parte operacional, de validações.
    ContaRN
    OperacoesRN

persistencia - parte que faz a conexão do Banco com o App, lá se encontra os Insertse Updates.
    ContaPers
    OperacoesPers

VO - parte onde ficam classes bagagens que irão transportar os dados.
    ContaVO
    TransacaoVO

--------------------------------------------------------------------------------------------------

