public class Carro {
   
    private int codigo;
    private String modelo;
    private int ano;
    private double precoDiaria;
    private boolean disponivel;

    
    public Carro(int codigo, String modelo, int ano, double precoDiaria, boolean disponivel) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.ano = ano;
        setPrecoDiaria(precoDiaria); 
        this.disponivel = disponivel;
    }

   
    public int getCodigo() {
        return codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setPrecoDiaria(double precoDiaria) {
        if (precoDiaria < 0) {
            System.out.println("O preço da diária não pode ser negativo. Definindo para 0.0.");
            this.precoDiaria = 0.0;
        } else {
            this.precoDiaria = precoDiaria;
        }
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    
    public void exibirInformacoes() {
        System.out.println("Código: " + codigo);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Preço Diária: " + precoDiaria);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
    }
}
