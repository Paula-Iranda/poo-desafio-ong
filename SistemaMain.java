public class SistemaMain {

    public static void main(String[] args) {

        // Criando Voluntário
        Voluntario voluntario = new Voluntario();
        voluntario.setNome("Maria Silva");
        voluntario.setCpf("123.456.789-00");
        voluntario.setDiasAtuacao(120);
        voluntario.setSetor("Logística");

        // Criando Doador
        Doador doador = new Doador();
        doador.setNome("João Santos");
        doador.setCpf("987.654.321-00");
        doador.setDiasAtuacao(365);
        doador.setValorDoadoMensal(150.00);

        // Criando Projeto Social
        ProjetoSocial projeto = new ProjetoSocial();
        projeto.setNomeDoProjeto("Educação para Todos");
        projeto.setMetaImpacto(500);
        projeto.setLider(voluntario);

        // Testando os métodos
        voluntario.exibirResumo();
        System.out.println();

        doador.exibirResumo();
        System.out.println();

        projeto.iniciarProjeto();
    }
}