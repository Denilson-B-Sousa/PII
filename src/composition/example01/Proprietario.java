package composition.example01;

import java.util.ArrayList;

public class Proprietario {
    private String nome;
    private String cpf;
    private String rg;
    private String telefone;
    private ArrayList<Endereco> enderecos;

    public Proprietario(String nome, String cpf, String rg, String telefone, ArrayList<Endereco> endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.enderecos = endereco;
    }

    public void adicionarEndereco() {
        Endereco endereco = new Endereco("", "", "", "", "", "", 8);

        enderecos.add(endereco);
    }

    public void mostrarEndereco() {
        System.out.println("Endereços de " + this.nome + ": ");
        for(Endereco endereco : enderecos) {
            System.out.println(endereco);
        }

    }

    public ArrayList<Endereco> getEndereco() {
        return enderecos;
    }

    public void setEndereco(ArrayList<Endereco> endereco) {
        this.enderecos = endereco;
    }


}
