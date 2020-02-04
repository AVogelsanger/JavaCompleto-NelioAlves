package entities;

public class Carro {
	
    private int id;
    private String marca;
    private String modelo;
    private int qtdePessoas;

    public Carro() {
    }

    public Carro(int id, String marca, String modelo, int qtdePessoas) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.qtdePessoas = qtdePessoas;
    }

    public Carro(String marca, String modelo, int qtdePessoas) {

        this.marca = marca;
        this.modelo = modelo;
        this.qtdePessoas = qtdePessoas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQtdePessoas() {
        return qtdePessoas;
    }

    public void setQtdePessoas(int qtdePessoas) {
        this.qtdePessoas = qtdePessoas;
    }

    @Override
    public String toString() {
        return marca
                + " - "
                + modelo
                + " - "
                + qtdePessoas;
    }

    // metodos
    public void addPessoa(int pessoa) {
        qtdePessoas += pessoa;
    }

    public void removePessoa(int pessoa) {
        qtdePessoas -= pessoa;
    }
}
