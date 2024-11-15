import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        //Novo desafio - Extrato bancário
        //1. Inicializar dados do cliente ----- ok!
        //2. Menu de opções ------------------- ok!
        //3. Visualização do saldo ------------ ok!
        //4. Envia valor ---------------------- ok!
        //5. Recebe valor --------------------- ok!

        Scanner scanner = new Scanner(System.in);

        String nome = "Janaína";
        String tipoConta = "Corrente";
        Double saldo = 2500.00;

        System.out.println("*****************************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("\nNome do cliente: " + nome); // \n pula linha
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo inicial: " + saldo);
        System.out.println("\n*****************************************************");


        int opcao = 0;
        //Para criar bloco de texto, usa-se  """ (três aspas duplas) para declarar uma String de várias linhas
        String menu = """
                Operações
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                Digite a opção desejada:
                
                """;

         while (opcao != 4) {
            System.out.println(menu);
             opcao = scanner.nextInt();

            double valor = 0;

            if (opcao == 1) {
                System.out.println("O valor atual é R$ " + saldo);
                //saldo = scanner.nextDouble(); ----> não precisa adicionar essa linha aqui, já tem lá em cima
            } else if (opcao == 2) {
                System.out.println("Informe o valor a receber:");
                valor = scanner.nextDouble();
                saldo += valor; // saldo = valor + saldo
                System.out.println("Saldo atualizado R$ " + saldo);
            } else if (opcao == 3) {
                System.out.println("Informe o valor que deseja transferir:");
                valor = scanner.nextDouble();
                //double transferirValor = saldo - valor;
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar transferência");
                } else {
                    saldo -= valor; // saldo = saldo - valor;
                    System.out.println("Saldo atualizado R$ " + saldo);
                }
            } else if (opcao == 4) {
                System.out.println("Programa encerrado!");
            } else {
                System.out.println("Opção inválida!");
            }


        }
    }
}