import java.util.ArrayList;

class Agenda {
    private ArrayList<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<Contato>();
    }

    public void adicionarContato(Contato contato) {
        this.contatos.add(contato);
    }

    public int contarFavoritos() {
        int count = 0;
        for (Contato contato : contatos) {
            if (contato.isFavorito()) {
                count++;
            }
        }
        return count;
    }
    
    //toLowerCase() retorna uma nova string com todas as letras convertidas para minúsculo
    public int contarLetra(String letra) {
        int count = 0;
        for (Contato contato : contatos) {
            if (contato.getNome().toLowerCase().startsWith(letra.toLowerCase())) {
                count++;
            }
        }
        return count;
    }
}


