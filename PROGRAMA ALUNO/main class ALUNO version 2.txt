import java.time.LocalDate;

class Aluno{
    private int id;
    private String nome;
    
    public Aluno(int id, String nome){
        this.id = id;
        this.nome = nome;
    
        
    }
    
    public String getNome() {
    return nome;
}

     public int getId() {
    return id;
    }
    
    public void matricular(){
        System.out.println("Aluno matriculado.");
    }
    
    @Override
    public String toString(){
        return "\nId: " + id +" | Nome: " + nome;
    }
    
}