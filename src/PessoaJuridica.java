public class PessoaJuridica extends Contribuinte {

    public Integer numeroFuncionarios;

    public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios){
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
        this.impostoTotal = calcularQuantidadeImposto();

    }

    private Double calcularQuantidadeImposto() {
        double imposto = 0d;
        if (this.numeroFuncionarios > 10){
            imposto =  rendaAnual * 14/100;
        } else {
            imposto = rendaAnual * 16/100;
        }

        return imposto;
    }
}
