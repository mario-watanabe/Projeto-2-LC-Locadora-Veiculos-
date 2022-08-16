public class PessoaJuridica extends Cliente {
    private String nome;
    final String tipoCliente = "PJ";

    public PessoaJuridica(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "PessoaJuricia [nome=" + nome + "]";
    }

}
