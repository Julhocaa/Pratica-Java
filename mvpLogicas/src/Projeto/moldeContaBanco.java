package Projeto;

import Projeto.CadastroELogin.MoldeCL;

public class moldeContaBanco extends MoldeCL {



    double saldo;
    double saque;



    public moldeContaBanco(double saldo){
        this.saldo = saldo;

        System.out.println("Saldo Atual: "+saldo);

    }

    public void fazerPix(){


    }


}
