public class MembroONG {

    private String nome;
    private String cpf;
    private int diasAtuacao;

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getDiasAtuacao() {
        return diasAtuacao;
    }

    public void setDiasAtuacao(int diasAtuacao) {
        if (diasAtuacao >= 0) {
            this.diasAtuacao = diasAtuacao;
        } else {
            System.out.println("Erro: Dias de atuação não podem ser negativos.");
        }
    }

    public void exibirResumo() {
        System.out.println("Nome: " + nome);
        System.out.println("Dias de atuação: " + diasAtuacao);
    }
}