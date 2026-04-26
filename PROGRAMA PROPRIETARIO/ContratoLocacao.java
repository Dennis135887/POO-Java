class ContratoLocacao {
    private int id;
    private String dataInicio;
    private String dataFim;
    private double valorMensal;
    private Imovel imovel;
    private Inquilino inquilino;

    public ContratoLocacao(int id, String dataInicio, String dataFim, double valorMensal, Imovel imovel, Inquilino inquilino) {
        this.id = id;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valorMensal = valorMensal;
        this.imovel = imovel;
        this.inquilino = inquilino;
        // Ao criar contrato, o imóvel fica ocupado
        this.imovel.indisponibilizar();
    }

    public void gerarContrato() {
        System.out.println(">>> CONTRATO EMITIDO <<<");
        System.out.println("Imóvel: " + imovel.getEndereco());
        System.out.println("Inquilino: " + inquilino.getNome());
        System.out.println("Vigência: " + dataInicio + " até " + dataFim);
    }

    public void encerrarContrato() {
        System.out.println("Atenção: Contrato #" + id + " encerrado.");
        imovel.disponibilizar();
    }
    
    public void renovarContrato(String novaDataFim) {
        this.dataFim = novaDataFim;
        System.out.println("Contrato renovado com sucesso até: " + novaDataFim);
    }
     
    public void atualizarAluguel(double novoValor) {
        this.valorMensal = novoValor;
        System.out.println("Reajuste aplicado: Novo valor mensal R$ " + valorMensal);
    }
}