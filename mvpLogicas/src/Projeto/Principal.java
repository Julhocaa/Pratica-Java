package Projeto;
import Projeto.CadastroELogin.MoldeCL;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Principal {


    //cadastro usuario
    public static void main(String[] args) {
        Scanner loginUser = new Scanner(System.in);
        System.out.println("Bem-vindo ao Sistema do Banco&Julios insira suas credencias por gentiliza pra estarmos fazendo seu cadastro");

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
        contador.add("Alterar usuario ou senha");
        String digite;




        do {

            System.out.println("Qual serviço você ira utilizar hoje?");

            System.out.println("Saque");
            System.out.println("Deposito");
            System.out.println("Extrato?");
            System.out.println("Alterar usuario ou senha");
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

                }else{
                    System.out.println("aguarde um momento estamos contado suas cedulas.... ");
                    System.out.println("valor de: " +quantiaSaque +" sacado com sucesso!!");

                    double saldoAtualizado=contaBanco.setSaldoSaque(500, quantiaSaque);
                    System.out.println("Saldo atual: "+saldoAtualizado);
                }
                break;
            case "Deposito":

                List<String>tiposDepositos = new ArrayList<>();
                tiposDepositos.add("Conta corrente");
                tiposDepositos.add("Conta Poupança");
                Scanner sc = new Scanner(System.in);
                String digiteTipoDeposito;

                do {


                    System.out.println("Escolha qual tipo de deposito sera feito");

                    System.out.println("Conta Corrente");
                    System.out.println("Conta Poupança");
                    digiteTipoDeposito = sc.nextLine();

                    switch (digiteTipoDeposito){

                        case "Conta Corrente":
                            System.out.println("Insira a quantia a ser depositada em sua conta corrente");
                            double quantiaDepositoCorrente = valorDigitado.nextDouble();
                                        System.out.println("Tudo certo");
                                        double saldoAtualizado = contaBanco.setSaldoDepositoCorrente(500,quantiaDepositoCorrente);
                                        System.out.println("Agradecemos por escolher o Bancos&Julios!!");
                            System.out.println("Saldo: "+saldoAtualizado);
                            break;
                        case "Conta Poupança":

                            System.out.println("Insira a quantia a ser depositada em sua poupança");
                            double quantiaDepositoPoupanca = valorDigitado.nextDouble();
                            System.out.println("Tudo certo");
                            double saldoAtualizadoPoupanca = contaBanco.setSaldoDepositoPoupanca(0,quantiaDepositoPoupanca);
                            System.out.println("Agradecemos por escolher o Bancos&Julios!!");
                            System.out.println("Saldo: "+saldoAtualizadoPoupanca);
                            break;

                    }
                }while(!tiposDepositos.contains(digiteTipoDeposito));

                break;
            case "Extrato":


        }


    }
}
