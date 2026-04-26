class Inquilino {
    private int id;
    private String nome;
    private String cpf;
    private String telefone;

    public Inquilino(int id, String nome, String cpf, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    
    public int getId() { 
        return id; 
        
    }
    public void setId(int id) { 
        this.id = id; 
        
    }
    
    public String getNome() { 
        return nome; 
        
    }
    public void setNome(String nome) { 
        this.nome = nome; 
        
    }

    public void pagarAluguel(double valor) {
        System.out.println("Pagamento: " + nome + " efetuou o pagamento de R$ " + valor);
    }
    
    public void atualizarDados(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        System.out.println("\nNome: " + nome + "\nCPF: " + cpf + "\nTEL: " + telefone);
    }
    
    @Override
    public String toString() {
        return "ID: " + id + "\nNome: " + nome + "\nCPF: " + cpf + "\nTEL: " + telefone;
    }
}
