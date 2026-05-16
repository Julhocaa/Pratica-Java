package Projeto.CadastroELogin;
public class MoldeCL {

    //Atributos

    private String usuario;
    private String senha;

    public MoldeCL(String usuario, String senha){


        this.usuario = usuario;
        this.senha = senha;

        System.out.println("Ola "+usuario +" que bom em ter você conosco!!!");

    }

    public MoldeCL(){

    }

    public boolean login(String usuarioDigitado, String senhaDigitada){

        return this.usuario.equals(usuarioDigitado) && this.senha.equals(senhaDigitada);

    }

    public String getUsuario(){
        return usuario;

    }

    public void setUsuario(String usuario){

        this.usuario = usuario;
    }

    public void setSenha(String senha){
        this.senha =senha;

    }
}

