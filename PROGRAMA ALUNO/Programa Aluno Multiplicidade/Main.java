import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        // Inicialização das listas
        List<Aluno> listaAlunos = new ArrayList<>();
        List<Disciplina> listaDisciplinas = new ArrayList<>();
        List<Matricula> listaMatriculas = new ArrayList<>();

        // 1. Criando os Alunos e guardando em variáveis para facilitar
        Aluno antonio = new Aluno(1, "Antonio");
        Aluno aya = new Aluno(2, "Aya");
        
        listaAlunos.add(antonio);
        listaAlunos.add(aya);

        // 2. Criando as Disciplinas
        Disciplina d1 = new Disciplina(101, "Modelagem e Desenv. OO");
        Disciplina d2 = new Disciplina(102, "Programação Orientada a Objetos");
        Disciplina d3 = new Disciplina(103, "Banco de Dados");
        
        listaDisciplinas.add(d1);
        listaDisciplinas.add(d2);
        listaDisciplinas.add(d3);

        // 3. MATRICULANDO O MESMO ALUNO EM VÁRIAS DISCIPLINAS
        // Aqui está o segredo: usamos o mesmo objeto 'antonio' em matrículas diferentes
        
        // Dennis na Disciplina 1
        listaMatriculas.add(new Matricula(LocalDate.now(), 8.0, 9.0, antonio, d1));
        
        // Dennis na Disciplina 2
        listaMatriculas.add(new Matricula(LocalDate.now(), 7.5, 10.0, antonio, d2));
        
        // Dennis na Disciplina 3
        listaMatriculas.add(new Matricula(LocalDate.now(), 10.0, 10.0, antonio, d3));

        // Exemplo: Matriculando a Aya também
        listaMatriculas.add(new Matricula(LocalDate.now(), 9.5, 9.5, aya, d2));

        // 4. Exibição dos Resultados
      /* System.out.println("======= RELATÓRIO ACADÊMICO =======");
        for (Matricula m : listaMatriculas) {
            System.out.println(m);
            System.out.println("---------------------------------");
        }*/
        
        //Exibi apenas os Resultados da aluna Aya
       /* System.out.println("======= RELATÓRIO DA ALUNA AYA =======");
        for (Matricula m : listaMatriculas) {
        // Compara o nome do aluno da matrícula com "Aya"
        if (m.getAluno().getNome().equals("Aya")) {
        //System.out.println(m);
        m.getSituacao();
       // 2. Opcional: Se o seu toString não tiver a média, você imprime aqui:
        System.out.println("Média calculada: " + m.calcularMedia());
        System.out.println("---------------------------------");
            }
        }*/
        
        System.out.println("======= RELATÓRIO DOS ALUNOS de Programação Orientada a Objetos =======");
        for (Matricula m : listaMatriculas) {
        // Retorna uma lista de todos os alunos de  Programação Orientada a Objetos
        if (m.getDisciplina().getNome().equals("Programação Orientada a Objetos")) {
        System.out.println(m);
        System.out.println("---------------------------------");
            }
        }
        
        System.out.println("======= RELATÓRIO DO ALUNO ANTONIO (POO) =======");
            for (Matricula m : listaMatriculas) {
            // 1. Verifica se o aluno é o Antonio
            // 2. Verifica se a disciplina é Programação Orientada a Objetos
            if (m.getAluno().getNome().equals("Antonio") && 
            m.getDisciplina().getNome().equals("Programação Orientada a Objetos")) {
        
        System.out.println(m);
        System.out.println("---------------------------------");
        
               }
            }
    }
}
        
        
    
 
