package Projeto;
import Projeto.CadastroELogin.MoldeCL;

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

        do {
            if (!senha.equals(senhaDigitada)) {
                System.out.println("repita novamento o processo");

                System.out.println("Senha: ");
                senha = loginUser.nextLine();

                System.out.println("repita sua senha: ");
                senhaDigitada = loginUser.nextLine();
            }

        } while (!senha.equals(senhaDigitada));

        MoldeCL cadastrarLogar = new MoldeCL(usuario, senha);


        System.out.println("Usuario: ");
        String usuarioLog = loginUser.nextLine();

        System.out.println("Senha: ");
        String senhaLog = loginUser.nextLine();

        //login usuario

        while (!usuarioLog.equals(usuario) || !senhaLog.equals(senha)) {

            if (cadastrarLogar.login(usuarioLog, senhaLog)) {

                break;
            } else {
                System.out.println("seu usuario ou a senha estão incorretos... tente novamente porfavor");

                System.out.println("Usuario: ");
                usuarioLog = loginUser.nextLine();

                System.out.println("Senha: ");
                senhaLog = loginUser.nextLine();

            }

        }


        moldeContaBanco contaBanco = new moldeContaBanco(500);
        String usuarioBanco = usuario;
        System.out.println("Bem vindo de volta "+usuarioBanco);



        List<String> contador = new ArrayList<>();
        Scanner numeroDigitado = new Scanner(System.in);

        contador.add("Saque");
        contador.add("Deposito");
        contador.add("Extrato");
        contador.add("usuario");
        contador.add("senha");
        contador.add("pix");



        String digite;
        do {

            System.out.println("Qual serviço você ira utilizar hoje?");

            System.out.println("Saque");
            System.out.println("Deposito");
            System.out.println("Pix");
            System.out.println("Extrato?");
            System.out.println("Troca usuario ou senha");
            System.out.println("Digite");
            digite = numeroDigitado.nextLine();
        } while (!contador.contains(digite));

        Scanner valorDigitado = new Scanner(System.in);
        switch (digite) {

            case "Saque":
                System.out.println("digite o valor do saque: ");

                double quantiaSaque = valorDigitado.nextDouble();

                if (quantiaSaque > 1000) {
                    System.out.println("Entre em contato com o banco para mais informações");
                    break;
                }else{
                    System.out.println("aguarde um momento estamos contado suas cedulas.... ");
                    System.out.println("valor de: " +quantiaSaque +" sacado com sucesso!!");

                }
            case "Deposito":

                System.out.println("quanto você quer depositar?");
                double quantiaDeposito = valorDigitado.nextDouble();

                if(quantiaDeposito>5000){
                    System.out.println("Não aceitamos depostios maiores que 5000, por favor procurar um de nossos atendentes para fazer a verificação do seu caso");

                }else if(quantiaDeposito<5000){
                    System.out.println("Fazendo calculos das cedulas...");
                        if(quantiaDeposito==4999){
                            System.out.println("Tudo certo, agora você só podera fazer deposito mês que vem");
                            return;
                        }
                    System.out.println("Tudo certo");
                }



        }
    }
}
