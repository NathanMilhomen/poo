import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcao;
        Scanner sc = new Scanner(System.in);
        imprimirMenu();

        double impostoTotal = 0d;

        while (true) {
            opcao = sc.nextInt();

            if (opcao == 0) {
                break;
            }

            System.out.println("Digite o nome: ");
            String nome = sc.next();

            System.out.println("Digite a renda anual: ");
            double rendaAnual = sc.nextDouble();

            Contribuinte contribuinte = null;

            if (opcao == 1) {
                System.out.println("Digite o gasto com saúde: ");
                double gastoComSaude = sc.nextDouble();
                contribuinte = new PessoaFisica(nome, rendaAnual, gastoComSaude);

            } else if (opcao == 2) {
                System.out.println("Digite o numero de funcionários: ");
                int numeroFuncionarios = sc.nextInt();
                contribuinte = new PessoaJuridica(nome, rendaAnual, numeroFuncionarios);

            } else {
                System.out.println("Opção inválida");
                imprimirMenu();
            }

            if (contribuinte != null) {
                double imposto = contribuinte.imprimirImpostoPago();

                System.out.println("O imposto pago por " + contribuinte.nome + " foi " + imposto);
                impostoTotal += imposto;
                imprimirMenu();
            }

        }
        sc.close();
        System.out.println("O total foi de : " + impostoTotal);
    }

    private static void imprimirMenu() {
        System.out.println("#################################");
        System.out.println("0 - Sair");
        System.out.println("1 - Adicionar pessoa física");
        System.out.println("2 - Adicionar pessoa jurídica");
        System.out.println("#################################");
    }
}
