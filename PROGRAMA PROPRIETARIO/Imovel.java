class Imovel {
    private int id;
    private String endereco;
    private String tipo;
    private double valorAluguel;
    private boolean disponivel;

    public Imovel(int id, String endereco, String tipo, double valorAluguel) {
        this.id = id;
        this.endereco = endereco;
        this.tipo = tipo;
        this.valorAluguel = valorAluguel;
        this.disponivel = true;
    }

    public void disponibilizar() { 
        this.disponivel = true; 
        
    }
    
    public void indisponibilizar() { 
        this.disponivel = false; 
        
    }

    // Getters necessários
    public String getEndereco() { 
        return endereco;
    }
    
    public String getTipo() { 
        return tipo; 
        
    }
    public double getValorAluguel() { 
        return valorAluguel;
    }
    
    public boolean isDisponivel() { 
        return disponivel; 
        
    }

    public void atualizarValor(double novoValor) {
        this.valorAluguel = novoValor;
    }
}