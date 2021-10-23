public class Contribuinte {

    public String nome;
    public Double rendaAnual;
    public Double impostoTotal;

    public Contribuinte(String nome, Double rendaAnual){
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public Double imprimirImpostoPago(){
       return this.impostoTotal;
    }
}
