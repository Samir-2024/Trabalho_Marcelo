import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Carro carro1 = new Carro(1, "Audi", 2023, 800.0, true);
        
        
        Carro carro2 = new Carro(2, "BMW", 2024, 1000.0, true);

        
        System.out.println("Informações do Carro 1:");
        carro1.exibirInformacoes();
        
        
        System.out.println("\nInformações do Carro 2:");
        carro2.exibirInformacoes();

        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o novo preço da diária para o Carro 1: ");
        double novoPreco1 = scanner.nextDouble();
        carro1.setPrecoDiaria(novoPreco1);

        
        scanner.nextLine(); 

        
        System.out.print("Deseja tornar o Carro 1 indisponível? (sim/não): ");
        String resposta1 = scanner.nextLine();
        if (resposta1.trim().equalsIgnoreCase("não")) {
            carro1.setDisponivel(false);
        }

        
        System.out.println("\nInformações do Carro 1 após alterações:");
        carro1.exibirInformacoes();

        
        System.out.print("\nDigite o novo preço da diária para o Carro 2: ");
        double novoPreco2 = scanner.nextDouble();
        carro2.setPrecoDiaria(novoPreco2);

        
        scanner.nextLine(); 

        
        System.out.print("Deseja tornar o Carro 2 indisponível?: ");
        String resposta2 = scanner.nextLine();
        if (resposta2.trim().equalsIgnoreCase("não")) {
            carro2.setDisponivel(false);
        }

        
        System.out.println("\nInformações do Carro 2 após alterações:");
        carro2.exibirInformacoes();

        
        scanner.close();
    }
}
