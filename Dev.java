import java.util.HashSet;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Curso> cursosInscritos = new HashSet<>();
    private Set<Curso> cursosConcluidos = new HashSet<>();

    public Dev(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Curso> getCursosInscritos() {
        return cursosInscritos;
    }

    public Set<Curso> getCursosConcluidos() {
        return cursosConcluidos;
    }

    public void inscreverCurso(Curso curso) {
        cursosInscritos.add(curso);
    }

    public void concluirCurso(Curso curso) {
        if (cursosInscritos.remove(curso)) {
            cursosConcluidos.add(curso);
        } else {
            System.out.println("Curso não encontrado nos cursos inscritos.");
        }
    }
}
