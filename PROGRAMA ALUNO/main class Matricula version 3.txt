import java.time.LocalDate;

class Matricula{
    private LocalDate dataMatricula;
    //private String status;
    private double av1,av2;
    
    private Aluno aluno;
    private Disciplina disciplina;
    
   public Matricula(LocalDate dataMatricula /*String status*/,
                 double av1, double av2,
                 Aluno aluno, Disciplina disciplina) {
    this.dataMatricula = dataMatricula;
    //this.status = status;
    this.av1 = av1;
    this.av2 = av2;
    this.aluno = aluno;
    this.disciplina = disciplina;
}
    
    
    public Aluno getAluno() {
    return aluno;
    }
    
     public Disciplina getDisciplina() {
    return disciplina;
    }
    
     // NOVO MÉTODO: A lógica de cálculo agora vive aqui dentro
    public double calcularMedia() {
       return (this.av1 + this.av2) / 2;
        
    }

        // Usa o resultado do cálculo para decidir o que imprimir
        public void getSituacao() {
        // Chamamos o método calcularMedia() para obter o valor atual
        if (calcularMedia() >= 6) {
            System.out.println("Situação: Aluno aprovado.");
        } else {
            System.out.println("Situação: Aluno reprovado.");
        }
    }
   
    
    public void trancar(){
        System.out.println("Matricula trancanda.");
    }
    
    @Override
    public String toString(){
        return "\nData de matricula: " + dataMatricula +
               "\nAluno: " + aluno +
               "\nDisciplina: " + disciplina + 
              // "\nStatus: " + status +
               "\nNota av1: " + av1 +
               "\nNota av2: " + av2 +
               "\nMedia: " + calcularMedia(); 
    }
    
}