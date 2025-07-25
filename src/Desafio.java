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

        int opcao= 0;
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


            if (opcao == 1){
                System.out.println("Saldo: " + "R$" + saldo);
            } else if (opcao == 2) {
                System.out.println("Informe o valor a receber: ");
                recebeTransferencia = leitura.nextDouble();
                saldo +=recebeTransferencia;
                System.out.println("Saldo atualizado: " +"R$"+ saldo);
            } else if (opcao == 3) {
                System.out.println("Informe o valor que deseja transferir: ");
                fazTransferencia = leitura.nextDouble();

                if (fazTransferencia > saldo){
                    System.out.println("Não há saldo suficiente para fazer a transferência.");
                } else {
                    saldo -= fazTransferencia;
                    System.out.println("Saldo atualizado: " + "R$" + saldo);
                }
            } else if (opcao == 4) {
                System.out.println("Encerrada a aplicação");
            }else if (opcao > 4) {
                System.out.println("Opção inválida!");
            }
        }

    }
}
