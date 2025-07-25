# Desafio-Banco-Digital

🏦 Desafio Banco Digital em Java
Bem-vindo ao Desafio Banco Digital, um projeto simples em Java que simula operações básicas de um sistema bancário no terminal. Ideal para iniciantes, este projeto explora estruturas de repetição, entrada de dados com Scanner e lógica condicional para gerenciar saldo de uma conta bancária.

📌 Sobre o Projeto
Este programa simula um menu interativo para um cliente bancário fictício. Com ele, é possível:

Consultar o saldo atual

Receber depósitos

Realizar transferências

Sair do sistema

O projeto foi feito com fins educacionais para treinar os fundamentos da linguagem Java.

💻 Código-Fonte
java
Copiar
Editar
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        String nome = "Marcelo de Carvalho";
        String tipoConta = "Corrente";
        double saldo = 2500.00;

        System.out.println("*********************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo inicial: " + "R$" + saldo);
        System.out.println("\n*********************************");

        int opcao = 0;
        String menu = """
                Operações

                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair

                **Digite a opção desejada:**
                """;

        Scanner leitura = new Scanner(System.in);
        double recebeTransferencia;
        double fazTransferencia;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo: R$" + saldo);
            } else if (opcao == 2) {
                System.out.println("Informe o valor a receber: ");
                recebeTransferencia = leitura.nextDouble();
                saldo += recebeTransferencia;
                System.out.println("Saldo atualizado: R$" + saldo);
            } else if (opcao == 3) {
                System.out.println("Informe o valor que deseja transferir: ");
                fazTransferencia = leitura.nextDouble();

                if (fazTransferencia > saldo) {
                    System.out.println("Não há saldo suficiente para fazer a transferência.");
                } else {
                    saldo -= fazTransferencia;
                    System.out.println("Saldo atualizado: R$" + saldo);
                }
            } else if (opcao == 4) {
                System.out.println("Encerrada a aplicação");
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }
}
🛠️ Requisitos
Para rodar o projeto, você precisará:

Java JDK 17 ou superior instalado

Um terminal ou prompt de comando

Um editor de código como IntelliJ IDEA, VS Code ou outro de sua preferência

🚀 Como Executar
Clone o repositório:

bash
Copiar
Editar
git clone https://github.com/seu-usuario/desafio-banco-java.git
Acesse o diretório do projeto:

bash
Copiar
Editar
cd desafio-banco-java
Compile o código:

bash
Copiar
Editar
javac Desafio.java
Execute o programa:

bash
Copiar
Editar
java Desafio
✨ Funcionalidades
✅ Exibir nome, tipo de conta e saldo inicial
✅ Consultar o saldo atual
✅ Receber valores e atualizar o saldo
✅ Transferir valores com verificação de saldo disponível
✅ Menu interativo com tratamento de opções inválidas
✅ Encerramento do sistema de forma limpa

📚 Conceitos Praticados
Declaração de variáveis e constantes

Entrada de dados com Scanner

Estrutura de repetição while

Condicionais if, else if, else

Conversão e manipulação de tipos numéricos

Organização e boas práticas em Java

📦 Próximos Passos
Tornar os dados do usuário dinâmicos com entrada via teclado

Modularizar o código com métodos (consultarSaldo(), receberValor(), etc.)

Criar uma classe ContaBancaria para introduzir POO

Adicionar autenticação simples (ex: senha)

Salvar dados em arquivos locais ou banco de dados

🧑‍💻 Autor
Feito com ☕ por Arthur Carvalho.
💡 Em aprendizado constante no universo da programação!

📄 Licença
Este projeto está sob a licença MIT — sinta-se livre para utilizá-lo como base nos seus estudos.
