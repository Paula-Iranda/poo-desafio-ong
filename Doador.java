public class Doador extends MembroONG {

    private double valorDoadoMensal;

    public double getValorDoadoMensal() {
        return valorDoadoMensal;
    }

    public void setValorDoadoMensal(double valorDoadoMensal) {
        this.valorDoadoMensal = valorDoadoMensal;
    }

    @Override
    public void exibirResumo() {
        System.out.println("=== DOADOR ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Status: Doador Ativo");
        System.out.println("Valor mensal: R$ " + valorDoadoMensal);
    }
}