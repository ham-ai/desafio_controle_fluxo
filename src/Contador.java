import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametro1 = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int parametro2 = terminal.nextInt();

        try{
            contar(parametro1, parametro2);
        }catch(ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{

        int contagem = parametro2 - parametro1;

        if (parametro1 > parametro2){
            throw new ParametrosInvalidosException();
        }else{
            for( int i = 0; i < contagem;i++){
                System.out.println("Imprimindo o número "+i);
            }
        }
    }
}


