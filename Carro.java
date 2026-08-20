public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    public void acelerar(){
        System.out.println("Carro" + modelo + "anda");
    }
    public void frear(){
        System.out.println("Carro" + modelo + "freia a cueca");
    }
    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2026);

        System.out.println("Marca: " + carro1.getMarca());

        carro1.setMarca("Toyota so que 2");

        System.out.println("Marca: " + carro1.getMarca());
        
        System.out.println("Modelo: " + carro1.getModelo());

        carro1.setModelo("fuskas");

        System.out.println("Modelo: " + carro1.getMarca());
        
        System.out.println("ano: " + carro1.getAno());

        carro1.setAno(2012);

        System.out.println("ano: " + carro1.getAno());
        carro1.acelerar();
        carro1.frear();
    }
    }