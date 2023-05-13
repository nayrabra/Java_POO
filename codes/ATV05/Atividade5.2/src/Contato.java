
class Contato {
    private String nome;
    private String telefone;
    private boolean favorito;

    public Contato(String nome, String telefone, boolean favorito) {
        this.nome = nome;
        this.telefone = telefone;
        this.favorito = favorito;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public boolean isFavorito() {
        return favorito;
    }
}




