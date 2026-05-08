package Logica;

public class MoldeCL {

    //Atributos

    private String usuario;
    private String senha;

    public MoldeCL(String usuario, String senha){

        System.out.println("Bem vindo ao Sistemas&Julios insira suas credencias por gentiliza");
        do{




        }while(usuario ==usuario && senha==senha);

        this.usuario = usuario;
        this.senha = senha;
    }

    public boolean login(String usuarioDigitado, String senhaDigitada){
        return this.usuario.equals(usuarioDigitado) && this.senha.equals(senhaDigitada);
    }
}
