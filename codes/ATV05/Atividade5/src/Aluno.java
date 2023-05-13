public class Aluno {
    private String nome;
    private int anoNascimento;
    private double mediaGlobal;
    
    public Aluno(String nome, int anoNascimento, double mediaGlobal) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.mediaGlobal = mediaGlobal;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getAnoNascimento() {
        return anoNascimento;
    }
    
    public double getMediaGlobal() {
        return mediaGlobal;
    }
    
    public void setMediaGlobal(double mediaGlobal) {
        this.mediaGlobal = mediaGlobal;
    }
    
    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Nascimento: " + anoNascimento);
        System.out.println("Média Global: " + mediaGlobal);
    }
}
