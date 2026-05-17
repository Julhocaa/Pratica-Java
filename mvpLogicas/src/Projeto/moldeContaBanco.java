package Projeto;

import Projeto.CadastroELogin.MoldeCL;

public class moldeContaBanco extends MoldeCL {



    double saldo;
    double saque;



    public moldeContaBanco(double saldo){
       this.saldo=saldo;

        System.out.println("Saldo Atual: "+saldo);

    }

    public double setSaldoSaque(double saldoAntigo, double saldoNovo){
        return this.saldo = saldoAntigo-saldoNovo;
    }
    public double setSaldoDepositoCorrente(double saldoAntigo, double saldoNovo){
        return this.saldo=saldoAntigo + saldoNovo;

    }
    public double setSaldoDepositoPoupanca(double saldoAntigo, double saldoNovo){
        return saldoAntigo+saldoNovo;

    }

}
