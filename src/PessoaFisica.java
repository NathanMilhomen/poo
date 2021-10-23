public class PessoaFisica extends Contribuinte  {

    public Double gastoComSaude;
    public Double impostoRenda;
    public Double descontoSaude;

    public PessoaFisica(String nome, Double rendaAnual, Double gastoComSaude){
        super(nome,rendaAnual);
        this.gastoComSaude = gastoComSaude;
        impostoRenda = this.calcularQuantidadeImposto();
        descontoSaude = this.calcularDescontoSaude();

        impostoTotal = impostoRenda - descontoSaude;
    }

    private Double calcularQuantidadeImposto() {
        double imposto = 0d;

        if (this.rendaAnual < 20000d){
            imposto = rendaAnual * 15/100;
        } else {
            imposto = rendaAnual * 25/100;
        }
        return imposto;
    }

    private Double calcularDescontoSaude(){
        if (this.gastoComSaude > 0){
            return gastoComSaude * 50/100;
        } else {
            return 0d;
        }
    }
}
