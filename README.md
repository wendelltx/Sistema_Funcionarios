# Sistema de Cadastro de Funcionários

### 1. Descrição do Projeto
Este sistema é uma aplicação Java desenvolvida para gerenciar o cadastro de funcionários de um departamento. O software permite cadastrar novos colaboradores, aplicar reajustes salariais, realizar demissões e calcular automaticamente a folha de pagamento total do setor, considerando apenas os funcionários que estão ativos no momento.

### 2. Tecnologias Utilizadas
* **Linguagem:** Java 21
* **IDE utilizada:** Eclipse IDE
* **Ferramenta de Versão:** Git

### 3. Como Executar o Projeto
Para compilar e rodar o projeto via terminal/console, siga estes passos:

1. Abra o terminal na pasta raiz do projeto.
2. Compile todos os arquivos Java:
   ```bash
   javac -d bin src/*.java
   ```
3. Execute a classe principal:
   ```bash
   java -cp bin TesteSistema
   ```

### 4. Descrição das Classes
* **Funcionario.java**: Responsável por armazenar os dados individuais de cada colaborador (nome, CPF, cargo, salário e status). Contém os métodos para atualizar dados, aplicar aumento salarial e realizar demissões.
* **Departamento.java**: Gerencia um grupo de funcionários através de um array. É responsável por adicionar novos membros à equipe, listar todos os cadastrados e realizar o somatório dos salários para o cálculo da folha mensal.
* **TesteSistema.java**: Classe que contém o método `main`. Ela executa o roteiro de testes solicitado pelo professor para validar se todas as regras de negócio estão funcionando corretamente.

### 5. Identificação do Aluno
* **Nome:** Wendell Henrique Teixeira
* **Turma:** Informática 2º Período - CEFET-MG
* **Professor:** MSc Rodrigo de Lima Cunha
