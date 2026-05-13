package Projeto;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Principal {


    //cadastro usuario
   public static void main(String[] args) {
       Scanner loginUser = new Scanner(System.in);
       System.out.println("Bem vindo ao Sistemas&Julios insira suas credencias por gentiliza");

       System.out.println("Nome de Usuario: ");
       String usuario = loginUser.nextLine();

       System.out.println("Senha: ");
       String senha = loginUser.nextLine();

       System.out.println("repita sua senha: ");
       String senhaDigitada = loginUser.nextLine();

       do{
           if(!senha.equals(senhaDigitada)) {
               System.out.println("repita novamento o processo");

               System.out.println("Senha: ");
               senha = loginUser.nextLine();

               System.out.println("repita sua senha: ");
               senhaDigitada = loginUser.nextLine();
           }

           }while(!senha.equals(senhaDigitada));

       MoldeCL cadastrarLogar = new MoldeCL(usuario,senha);


       System.out.println("Usuario: ");
       String usuarioLog = loginUser.nextLine();

       System.out.println("Senha: ");
       String senhaLog = loginUser.nextLine();

       //login usuario

       while(!usuarioLog.equals(usuario) || !senhaLog.equals(senha)){

           if(cadastrarLogar.login(usuarioLog, senhaLog)){

                break;
           }else {
               System.out.println("seu usuario ou a senha estão incorretos... tente novamente porfavor");

               System.out.println("Usuario: ");
               usuarioLog = loginUser.nextLine();

               System.out.println("Senha: ");
               senhaLog = loginUser.nextLine();

           }

       }
            System.out.println("Bem vindo de voltar: "+usuarioLog+"!!!!!");

       List<String> contador = new ArrayList<>();
       Scanner numeroDigitado = new Scanner(System.in);

       contador.add("Saque");
       contador.add("Depostio");
       contador.add("Extrato");
       contador.add("usuario");
       contador.add("senha");
       contador.add("pix");

       String digite;
       do{

           System.out.println("Qual serviço você ira utilizar hoje?");

           System.out.println("Saque");
           System.out.println("Deposito");
           System.out.println("pix");
           System.out.println("Extrato?");
           System.out.println("Troca usuario ou senha");
           System.out.println("Qual você escolheria?");
           digite = numeroDigitado.nextLine();

       }while(!contador.contains(digite));




    }

}
