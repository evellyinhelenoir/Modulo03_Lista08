package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    List<Prato> pratoes = new ArrayList<>();

    public void adiconarPratos(Prato novoPrato){
        pratoes.add(novoPrato);
    }

        @Override
        public String toString() {
            StringBuilder retorno = new StringBuilder();
            retorno.append("\n Quantidade de pratos: " + pratoes.size());
            retorno.append("\n Pratos: ");
            retorno.append("\n " + pratoes);
            return retorno.toString();
        }
    }
