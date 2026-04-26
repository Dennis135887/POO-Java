import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Criando objetos
        Proprietario p = new Proprietario(1, "Carlos da Silva", "123.456.789-00", "9999-9999");

        Imovel im = new Imovel(1, "Rua A, 123", "Apartamento", 1500);
        Imovel im2 = new Imovel(2, "Rua B, 1234", "Apartamento", 1700);
        
        p.cadastrarImovel(im);
        p.cadastrarImovel(im2);

        Inquilino inq = new Inquilino(1, "João", "456.789.123-11", "8888-8888");

        // O contrato vincula o Imóvel ao Inquilino
        ContratoLocacao contrato = new ContratoLocacao(
                1,
                "01/01/2025",
                "01/01/2026",
                1500,
                im,
                inq
        );
        
        // DADOS DO INQUILINO
        System.out.println("------------------------------------------");
        System.out.println("=== Dados do inquilino ===");
        System.out.println(inq);
        System.out.println("------------------------------------------\n");
        
        // Usando o sistema
        contrato.gerarContrato();
        inq.pagarAluguel(1500);

        System.out.println("O imóvel está disponível? " + (im.isDisponivel() ? "Sim" : "Não"));
        
        contrato.encerrarContrato();
        System.out.println("Após encerrar, o imóvel está disponível? " + (im.isDisponivel() ? "Sim" : "Não"));
        
        // DADOS ATUALIZADOS DO INQUILINO
        System.out.println("\n------------------------------------------");
        System.out.println("=== Atualizando Dados do Inquilino ===");
        inq.atualizarDados("João da Silva", "258.896.663-33", "14.757-7854");
        System.out.println("------------------------------------------");

        // RENOVAR CONTRATO 
        System.out.println("\nRENOVAÇÃO DE CONTRATO");
        contrato.renovarContrato("01/01/2027");
        contrato.atualizarAluguel(1700);
        
        // Lista de imoveis do Proprietario
        System.out.println("\n------------------------------------------");
        System.out.println("Lista de imoveis do Proprietario: " + p.getNome());
        p.listarImoveis();
         
        // Dados do Proprietario
        System.out.println("------------------------------------------");
        System.out.println("DADOS DO PROPRIETÁRIO");
        System.out.println(p);
    }
}
