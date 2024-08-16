import java.util.ArrayList;
import java.util.List;

public final class Carro {
    private String modelo;
    private float codigo;
    private int ano;
    private double precoDiaria;
    private boolean disponivel;

    public Carro(String modelo, float codigo, int ano, double precoDiaria, boolean disponivel) {
        this.modelo = modelo;
        this.codigo = codigo;
        this.ano = ano;
        setPrecoDiaria(precoDiaria);
        this.disponivel = disponivel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getCodigo() {
        return codigo;
    }

    public void setCodigo(float codigo) {
        this.codigo = codigo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        if (precoDiaria <= 0) {
            System.out.println("Preço da diária deve ser maior que zero.");
            this.precoDiaria = 0.0;
        } else {
            this.precoDiaria = precoDiaria;
        }
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Carro [Modelo=" + modelo + ", Ano= " + ano + ", Preço da Diária=" + precoDiaria + ", Disponível=" + disponivel + "]";
    }

    public static void main(String[] args) {
        List<Carro> Carro = new ArrayList<>();

        Carro.add(new Carro("Honda Civic", 1, 2021, 150.00, true));
        Carro.add(new Carro("Toyota Corolla", 2, 2020, 140.00, false));
        Carro.add(new Carro("Ford Focus", 3, 2019, 130.00, true));
        Carro.add(new Carro("Chevrolet Cruze", 4, 2018, 120.00, true));
        Carro.add(new Carro("Hyundai Elantra", 5, 2022, 160.00, false));

        // Exibir a lista de carros
        for (Carro carro : Carro) {
            System.out.println(carro);
        }
    }
}
