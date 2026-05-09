package Logica;
import java.util.*;

public class MoldeCL {

    //Atributos

    private String usuario;
    private String senha;
    private String senhaDigitada;

    public MoldeCL(String usuario, String senha, String senhaDigitada){
        Scanner sc =new Scanner(System.in);

        do{

            if(!senha.equals(senhaDigitada)){
                System.out.println("repita novamento o processo");

                System.out.println("Senha: ");
                senha = sc.nextLine();

                System.out.println("repita sua senha: ");
                senhaDigitada = sc.nextLine();

            }

        }while(!senha.equals(senhaDigitada));

        this.usuario = usuario;
        this.senha = senha;

        System.out.println("Ola "+usuario +"que bom em ter você conosco!!!");

    }

//    public boolean login(String usuarioDigitado, String senhaDigitada){
//        return this.usuario.equals(usuarioDigitado) && this.senha.equals(senhaDigitada);
//    }
}
