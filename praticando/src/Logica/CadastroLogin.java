package Logica;
import java.util.*;

public class CadastroLogin {

   public static void main(String[] args) {
       Scanner loginUser = new Scanner(System.in);
       System.out.println("Bem vindo ao Sistemas&Julios insira suas credencias por gentiliza");

       System.out.println("Nome de Usuario: ");
       String usuario = loginUser.nextLine();

       System.out.println("Senha: ");
       String senha = loginUser.nextLine();

       System.out.println("repita sua senha: ");
       String senhaDigitada = loginUser.nextLine();

        MoldeCL cadastrarLogar = new MoldeCL(usuario,senha,senhaDigitada);


    }

}
