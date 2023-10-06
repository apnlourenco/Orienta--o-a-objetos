import java.util.Scanner;

public class App {

    public static Scanner scan;
    private static Aposta aposta;

    private static String menu() {
        String str = "";
        str += "1 - Iniciar uma aposta\n";
        str += "2 - Adicionar número na Aposta\n";
        str += "3 - Finalizar uma Aposta\n";
        str += "4 - Ver jogos \n";
        str += "5 - Ver resultados\n";

        str += "0 - Sair\n";

        return str;
    }

    private static void iniciarAposta() {
        Integer numeros;
        Aposta aposta;

        System.out.println("###Digite sua Aposta###");
        System.out.println("Digite os numeros:");
        numeros = scan.nextInt();

        Integer boolean ret = aposta.iniciarAposta();
        if (ret) {
            System.out.println("Aposta Valida");
        } else {
            System.out.println("Aposta Invalida");
        }

    }

    public static void adicionarNumeroAposta () {
    
        Integer numero;

        System.out.println("Digite o numero da Aposta");
        numero = scan.nextInt();
    }
    
    public static void finalizarUmaAposta () {

    }

    public static void verJogos() {
        System.out.println("Jogos");
        System.out.println(aposta.verJogos());

    }

    public static void verResultdos () {
        System.out.println("Resultados");
        System.out.println(aposta.verResultdos());

    }

    public static void main(String[] args) {

        scan = new Scanner(System.in);

        aposta = new Aposta();

        int opcao;

        do {
            System.out.println(menu());
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    iniciarAposta();
                    break;
                case 2:
                    adicionarNumeroAposta();
                    break;
                case 3:
                    finalizarUmaAposta();
                    break;
                case 4:
                    verJogos();
                    break;
                case 5:
                    verResultdos();
                    break;

            }

        } while (opcao != 0);

    }

   

    

    

}
