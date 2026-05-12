package Logica;
import java.util.*;

public class FervuraAgua {

   public static void main(String[] args) {

       Scanner receberDado = new Scanner(System.in);

       System.out.println("quanto a temperatura?");
       int celsius = receberDado.nextInt();

       if(celsius>=100){
           System.out.println("Not boiling");

       }else {
           System.out.println("Boiling");

       }


    }

}
