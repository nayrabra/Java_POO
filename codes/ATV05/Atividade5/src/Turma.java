	import java.util.ArrayList;

	public class Turma {
		
    private ArrayList<Aluno> alunos;
    private String curso;
    
	public Turma(String curso) {
        this.alunos = new ArrayList<Aluno>();
        this.curso = curso;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public Aluno alunoComMaiorMedia() {
        Aluno alunoMaiorMedia = null;
        for (Aluno aluno : alunos) {
            if (alunoMaiorMedia == null || aluno.getMediaGlobal() > alunoMaiorMedia.getMediaGlobal()) {
                alunoMaiorMedia = aluno;
            }
        }
        return alunoMaiorMedia;
    }

    public Aluno alunoMaisNovo() {
        Aluno alunoMaisNovo = null;
        for (Aluno aluno : alunos) {
            if (alunoMaisNovo == null || aluno.getAnoNascimento() > alunoMaisNovo.getAnoNascimento()) {
                alunoMaisNovo = aluno;
            }
        }
        return alunoMaisNovo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}