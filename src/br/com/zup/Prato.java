package br.com.zup;

import java.util.List;
import java.util.ArrayList;

public class Prato {
    private String nome;
    private List <Ingrediente> ingredientes = new ArrayList<>();
    private String valor;

    public Prato(String nome, String valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    public void adicionarIngredientes(Ingrediente novoIngrediente){

    }

    @Override
    public String toString() {
       StringBuilder retorno = new StringBuilder();
       retorno.append("\n Nome do prato: " + nome);
       retorno.append("\n Ingredientes: " + ingredientes);
       retorno.append("\n Valor: " + valor);
       return retorno.toString();
    }
}
