package reservarestaurante;

import java.util.Scanner;

public class ReservaRestaurante {


    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);//declarando um Scanner
        Cliente cli = new Cliente();//Instanciando a classe cliente.
        Mesa ms = new Mesa();//Instanciando a classe mesa.

        System.out.println("Seja Bem Vindo");
        int opcao = 0;
        do {
            System.out.println("1. Fazer Uma Reserva");
            System.out.println("2. Consultar Reserva");
            System.out.println("3. Fazer pedido");
            System.out.println("4. cadastrar Produtos ");
            System.out.println("5. cadastrar Funcionarios");
            System.out.println("6. cadastrar mesa");
            System.out.println("7. cadastar cardapio");
            System.out.println("8. fechar conta/comanda");
            System.out.println("9. gerar relatorio");
            System.out.println("0. Para sair");
            opcao = read.nextInt();

            switch (opcao) {
                case 1:
                    
                    System.out.println("Infome o nome do Cliente");
                    read.nextLine();
                    String nomecli = read.nextLine();
                    cli.setnome(nomecli);
                    
                    System.out.println("Infome o CPF");
                    double cpf = read.nextDouble();
                    cli.setCPF(cpf);
                    
                    System.out.println("Informe o numero de Telefone");
                    double tel = read.nextDouble();
                    cli.setTelefone(tel);
                    
                    System.out.println("infome o Email para contato");
                    read.nextLine();
                    String email = read.nextLine();
                    cli.setEmail(email); 
                    
                    System.out.println("Informe o numero da mesa");
                    int numeroMesa = read.nextInt();
                    ms.setmesa(numeroMesa);
                    break;
                case 2:

                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Volte sempre!!!!!!");
            }
        } while (opcao != 0);
    }

}
