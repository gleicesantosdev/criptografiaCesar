import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Programa de força bruta | Cifra de César");
        System.out.printf("\nDigite o texto a ser decriptado\n");
        String textoOriginal = entrada.nextLine();
        System.out.printf("\nResultado:\n");
        String texto;
        for (int chave=1;chave<=26;chave++){
            // texto = decriptar(i, textoOriginal);
            //começo descriptografia
            String textoNormal = "";
            int tamanhoTexto = textoOriginal.length();
            int letraDecriptada; //decripta um caractere por vez
            for(int c=0; c<tamanhoTexto; c++){
                //transforma em ascii e decripta
                int letraNormal = (int) textoOriginal.charAt(c);
                letraDecriptada = (letraNormal - chave);
                // transforma ascci criptado em caractere ao novo texto
                textoNormal  +=  (char) letraDecriptada;
            }
            System.out.println("Chave " + chave + ":" + textoNormal);
        }
    }
}

