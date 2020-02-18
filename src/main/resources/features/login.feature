# language: pt
Funcionalidade: Logar no app

  Cenário: Tela esqueci minha senha
    Dado Que eu abri o Firefox no credenciamento em UAT
    Quando Eu clico no hiperlink "Esqueci minha senha"
    Entao Eu devo ver o campo "CPF"
    E Eu devo ver o botão "Enviar link de recuperação para e-mail"
    E Eu devo ver o botão "Voltar"

  Cenário: Enviar email de recuperação de senha
    Dado Que eu abri o Firefox no credenciamento em UAT
    Quando Eu clico no hiperlink "Esqueci minha senha"
    E Eu digitar um CPF válido
    E Eu clicar no botão "Enviar link de recuperação para e-mail"
    Entao Eu devo esperar o carregamento
    E Eu devo ver o paragrafo "Um link de recuperação de senha foi enviado para o e-mail cadastrado"

  Cenário: Mensagem de usuário inválido email de recuperação de senha
    Dado Que eu abri o Firefox no credenciamento em UAT
    Quando Eu clico no hiperlink "Esqueci minha senha"
    E Eu digitar um CPF inválido
    E Eu clicar no botão "Enviar link de recuperação para e-mail"
    Entao Eu devo esperar o carregamento
    E Eu devo ver o paragrafo "Usuário não encontrado"