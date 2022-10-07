import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        //Mostrar uma medida em metros

        Scanner sc = new Scanner (System.in);

        System.out.print("Digite uma medida em metros: ");

        double metros = sc.nextDouble();

        sc.close();

        //Converter em centímetros 

        double centímetros = metros * 100;

        System.out.println(metros + " metros, corresponde á " + centímetros + " centímetros");
    }
}
