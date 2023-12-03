import java.util.Random;
import java.util.Scanner;

/**
 * App
 */
public class Caballo {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();

        System.out.print("Di un nombre: ");
        String nombre = sc.nextLine();
        String caballo1="1",caballo2 = "2";
        int meta = 0;
        boolean salir = false;
        int aleatorio = 0;

        for (int i = 0; i < nombre.length(); i++) {
            meta += nombre.charAt(i);
        }

        System.out.println("Meta en: "+meta);



        while (caballo1.length() != meta && caballo2.length() != meta) {

            aleatorio = r.nextInt(1,3);

            if (aleatorio==1) {
                caballo1+="1";
            }
            if (aleatorio==2) {
                caballo2+="2";
            }

            System.out.println(caballo1);
            System.out.println(caballo2);
            System.out.println();
            Thread.sleep(100);
        }
        
        if (caballo1.length()>caballo2.length()) {
            System.out.println("Ha ganado el caballo 1");          
        } else {
            System.out.println("Ha ganado el caballo 2");
        }
  

        sc.close();
    }

    

    







}