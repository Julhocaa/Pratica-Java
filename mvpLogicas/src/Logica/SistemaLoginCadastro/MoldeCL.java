package Logica.SistemaLoginCadastro;
public class MoldeCL {

    //Atributos

    private String usuario;
    private String senha;

    public MoldeCL(String usuario, String senha){


        this.usuario = usuario;
        this.senha = senha;

        System.out.println("Ola "+usuario +" que bom em ter você conosco!!!");

    }

    public boolean login(String usuarioDigitado, String senhaDigitada){

        return this.usuario.equals(usuarioDigitado) && this.senha.equals(senhaDigitada);

    }
}
