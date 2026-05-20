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

        //saldo inicial da conta
        double saldoConta=500;

        //inicialização da conta bancaria
        moldeContaBanco contaBanco = new moldeContaBanco(saldoConta);
        String usuarioBanco = usuario;
        System.out.println("Bem vindo de volta "+usuarioBanco);

        List<String> contador = new ArrayList<>();
        Scanner numeroDigitado = new Scanner(System.in);

        contador.add("Saque");
        contador.add("Deposito");
        contador.add("Extrato");
        contador.add("Conta");
        contador.add("Alterar usuario ou senha");
        contador.add("Sair");
        String digite;

        //Menu de Serviço
        do {


            System.out.println("Qual serviço você ira utilizar hoje?");

            System.out.println("Saque");
            System.out.println("Deposito");
            System.out.println("Extrato?");
            System.out.println("Conta");
            System.out.println("Sair");
            System.out.println("Digite");
            digite = numeroDigitado.nextLine();

            Scanner valorDigitado = new Scanner(System.in);

            switch (digite) {

                case "Saque":
                    System.out.println("digite o valor do saque: ");
                    double quantiaSaque = valorDigitado.nextDouble();

                    if (quantiaSaque > 1000) {
                        System.out.println("Entre em contato com o banco para mais informações");

                    } else {
                        System.out.println("aguarde um momento estamos contado suas cedulas.... ");
                        System.out.println("valor de: " + quantiaSaque + " sacado com sucesso!!");

                        double saldoAtualizado = contaBanco.setSaldoSaque(quantiaSaque);
                        System.out.println("Saldo atual: " + saldoAtualizado);
                    }
                    break;
                case "Deposito":

                    List<String> tiposDepositos = new ArrayList<>();
                    tiposDepositos.add("Conta Corrente");
                    tiposDepositos.add("Conta Poupança");
                    Scanner sc = new Scanner(System.in);
                    String digiteTipoDeposito;

                    do {

                        System.out.println("Escolha qual tipo de deposito sera feito");

                        System.out.println("Conta Corrente");
                        System.out.println("Conta Poupança");
                        digiteTipoDeposito = sc.nextLine();

                        switch (digiteTipoDeposito) {

                            case "Conta Corrente":
                                System.out.println("Insira a quantia a ser depositada em sua conta corrente");
                                double quantiaDepositoCorrente = valorDigitado.nextDouble();
                                System.out.println("Tudo certo");
                                double saldoAtualizado = contaBanco.setSaldoDepositoCorrente(quantiaDepositoCorrente);
                                System.out.println("Agradecemos por escolher o Bancos&Julios!!");
                                System.out.println("Saldo: " + saldoAtualizado);
                                break;

                            case "Conta Poupança":

                                System.out.println("Insira a quantia a ser depositada em sua poupança");
                                double quantiaDepositoPoupanca = valorDigitado.nextDouble();
                                System.out.println("Tudo certo");
                                double saldoAtualizadoPoupanca = contaBanco.setSaldoDepositoPoupanca(0, quantiaDepositoPoupanca);
                                System.out.println("Agradecemos por escolher o Bancos&Julios!!");
                                System.out.println("Saldo: " + saldoAtualizadoPoupanca);
                                break;

                        }
                    } while (!tiposDepositos.contains(digiteTipoDeposito));

                    break;
                case "Extrato":
                    contaBanco.mostrarExtratoCorrente();
                    break;




                case "Conta":
                    List<String>conta = new ArrayList<>();
                    Scanner acaoDigitada = new Scanner(System.in);
                    conta.add("Trocar Usuario");
                    conta.add("Trocar Senha");


                    System.out.println("Trocar Usuario?");
                    System.out.println("Trocar Senha?");
                    String escolhaAcao = acaoDigitada.nextLine();


                do{
                    switch(escolhaAcao) {


                        case "Trocar Usuario":

                            Scanner usuarios = new Scanner(System.in);
                            System.out.println("Insira seu novo Usuario");
                            String alterarUsuario = usuarios.nextLine();
                            contaBanco.setUsuario(alterarUsuario);
                            System.out.println("Seu usuario é "+alterarUsuario);
                            break;

                        case "Trocar Senha":

                            Scanner senhaNova = new Scanner(System.in);

                            System.out.println("Insira sua nova senha");
                            String insiraSenha = senhaNova.nextLine();
                            System.out.println("Senha nova alterada");
                            contaBanco.setSenha(insiraSenha);
                            break;
                    }

                }while(!conta.contains(escolhaAcao));

                case "Sair":
            }

        }while(!digite.equals("Sair"));
    }
}
