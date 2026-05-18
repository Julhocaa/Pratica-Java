package Projeto;

import Projeto.CadastroELogin.MoldeCL;
import java.util.ArrayList;
import java.util.List;

public class moldeContaBanco extends MoldeCL {



    double saldo;
    double saque;
    List<String>extrato = new ArrayList<>();



    public moldeContaBanco(double saldo){
       this.saldo=saldo;

        System.out.println("Saldo Atual: "+saldo);

    }

    public double setSaldoSaque(double saldoNovo){

        extrato.add("Saque "+saldoNovo);
        return this.saldo -=saldoNovo;
    }
    public double setSaldoDepositoCorrente(double saldoNovo){

        extrato.add("Deposito "+saldoNovo);
        return this.saldo+= saldoNovo;

    }
    public double setSaldoDepositoPoupanca(double saldoAntigo, double saldoNovo){
         saldoNovo+=saldoAntigo;
         extrato.add("Deposito: "+ saldoNovo);
         return saldoNovo;
    }

    public void mostrarExtratoCorrente(){
        for(String registroDaConta: extrato){
            System.out.println(registroDaConta);

        }

    }

}
