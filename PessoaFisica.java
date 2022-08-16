public class PessoaFisica extends Cliente {
    private String nome;
    final String tipoCliente = "PF";
    
    public PessoaFisica(String nome) {
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
        return "PessoaFisica [nome=" + nome + "]";
    }
}
