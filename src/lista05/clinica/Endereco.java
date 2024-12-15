package lista05.clinica;

public class Endereco {

    private String rua;
    private String logradouro;
    private String bairro;
    private String cep;
    private String estado;
    private String cidade;

    public Endereco(String rua, String logradouro, String bairro, String cep, String estado, String cidade) {
        this.rua = rua;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }

    public String getEstado() {
        return estado;
    }

    public String getCidade() {
        return cidade;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cep='" + cep + '\'' +
                ", estado='" + estado + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}
