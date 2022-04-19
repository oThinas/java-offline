package br.com.abc.introducao.controlefluxo;

public class ControleFluxo1 {
    public static void main(String[] args) {
        //Se a idade for menor do que 15, a categoria será infantil;
        //Se a idade estiver entre 15 e 18, a categoria será juvenil;
        //Se a idade for maior ddo que 18, a categoria será adulta;

        int idade = 18;
        String categoria = "";


        if(idade < 15){ //if(boolean)
            categoria = "Infantil";
        }
        else if (15 <= idade && idade < 18){
            categoria = "Juvenil";
        }
        else {
            categoria = "Adulta";
        }
        System.out.println(categoria);
    }
}
