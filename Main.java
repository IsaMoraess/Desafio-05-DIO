import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso Java", "Descrição do curso Java", 8);
        Curso curso2 = new Curso("Curso JavaScript", "Descrição do curso JavaScript", 4);

        Mentoria mentoria1 = new Mentoria("Mentoria Java", "Descrição da mentoria Java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição do Bootcamp Java Developer");
        bootcamp.adicionarCurso(curso1);
        bootcamp.adicionarCurso(curso2);
        bootcamp.adicionarMentoria(mentoria1);

        Dev devCamila = new Dev("Camila");
        devCamila.inscreverCurso(curso1);
        devCamila.inscreverCurso(curso2);
        System.out.println("Cursos inscritos Camila: " + devCamila.getCursosInscritos());
        devCamila.concluirCurso(curso1);
        System.out.println("Cursos inscritos Camila após concluir um curso: " + devCamila.getCursosInscritos());
        System.out.println("Cursos concluídos Camila: " + devCamila.getCursosConcluidos());
    }
}
