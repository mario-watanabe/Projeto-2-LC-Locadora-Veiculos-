public enum Veiculo {
    PEQUENO ("Pequeno"),
    MEDIO ("Medio"),
    SUV ("SUV");

    private String descricao;

    Veiculo(final String descricao) {
        this.descricao = descricao;
    }
   
    public String getDescricao() {
        return descricao;
    }

    
}
