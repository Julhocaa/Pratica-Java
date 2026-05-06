package polimorfismo;


//Polimorfismo de sobrecarga
public class PolimorfismoPrincipal {
public static void main(String [] args){
        int sabaoPo = 2;
        int mamao = 2;
        double sabonete = 2.50;
        double arroz =5.90;
        Integer batata = 6;
        Integer cenoura = 7;
        Integer melancia = 5;

        //cliclk esquerdo do mouse + crtl
        int total = Calculadora.somar(sabaoPo , mamao);
        double totalDoule = Calculadora.somar(sabonete, arroz);
        Integer totalInteger = Calculadora.somar(batata,cenoura,melancia);

}

}
