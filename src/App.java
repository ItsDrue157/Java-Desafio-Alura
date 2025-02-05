import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String nome = "Carlos";
        String tipoDeConta = "corrente";
        double saldo = 1500;

        boolean menu = true;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("******************************");
        System.out.println("Nome do Cliente " + nome);
        System.out.println("Tipo de conta "+ tipoDeConta);
        System.out.println("Saldo atua "+ saldo);
        System.out.println("******************************");

        while (menu) {
            System.out.println("Menu de opcoes: ");
            System.out.println("1. para saldo");
            System.out.println("2. para depositar");
            System.out.println("3. para sacar");
            System.out.println("4. para sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Seu Saldo atual: "+ saldo);
                    break;
            
                case 2:
                    System.out.println("digite quanto queira depositar");
                    double valorDepositado = scanner.nextDouble();
                    saldo += valorDepositado; 
                    System.out.println("Seu saldo atualizado eh de "+saldo);
                    break;
                case 3:
                    System.out.println("digite quanto queira sacar");
                    double valorSacado = scanner.nextDouble();
                    if (valorSacado > saldo){
                        System.out.println("Voce nao pode sacar mais do que voce possui. ");
                        break;
                    }
                    saldo -= valorSacado; 
                    System.out.println("Seu saldo atualizado eh de "+saldo);
                    break;
                case 4:
                    break;
            }

            
        }
        
        
    }

}
