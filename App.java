import java.util.Scanner;

public class App {

    public static Scanner  scan;
    private static Apostas aposta;

    private static String menu(){
        String str = "";
        str+="1 - Iniciar uma aposta\n";
        str+="2 - Adicionar número na Aposta\n";
        str+="3 - Finalizar uma Aposta\n";
        str+="4 - Ver jogos \n";
        str+="5 - Ver resultados\n";
        
        str+="0 - Sair\n";

        return str;
    }
    private static void iniciarAposta(){
        Integer numeros; 
        Apostas aposta;

        System.out.println("###Digite sua Aposta com seis dezenas###");
        System.out.println("Digite os numeros:");
        numeros = scan.nextInt();

        boolean ret = aposta.iniciarAposta();
        if(ret){
            System.out.println("");
        }else{
            System.out.println("");
        }

    }    

    public static void main(String[] args) {
        
        scan = new Scanner(System.in);

        aposta = new Apostas();
        
        int opcao;

        do{
            System.out.println(menu());
            opcao = scan.nextInt(); scan.nextLine();

            switch(opcao){
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

        }while(opcao != 0);

    }
    private static void verResultdos() {
    }
    private static void verJogos() {
    }
    private static void finalizarUmaAposta() {
    }
    private static void adicionarNumeroAposta() {
    }


}

