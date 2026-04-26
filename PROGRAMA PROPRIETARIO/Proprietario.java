import java.util.ArrayList;
import java.util.List;

class Proprietario {
    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private List<Imovel> imoveis = new ArrayList<>();

    public Proprietario(int id, String nome, String cpf, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public void cadastrarImovel(Imovel imovel) {
        imoveis.add(imovel);
    }

    public void listarImoveis() {
        if (imoveis.isEmpty()) {
            System.out.println("Nenhum imóvel cadastrado.");
        } else {
            for (Imovel i : imoveis) {
                System.out.println("- " + i.getEndereco() + " (" + i.getTipo() + ") | Valor: R$ " + i.getValorAluguel());
            }
        }
    }
    
    // Getters e Setters corrigidos
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
    
    public String getCpf() { 
        return cpf; 
        
    }
    public void setCpf(String cpf) { 
        this.cpf = cpf; 
        
    }
    
    public String getTelefone() { 
        return telefone; 
        
    }
    public void setTelefone(String telefone) { 
        this.telefone = telefone; 
        
    }
    
    @Override
    public String toString() {
        return "ID: " + id + "\nNome: " + nome + "\nCPF: " + cpf + "\nTEL: " + telefone;
    }
}