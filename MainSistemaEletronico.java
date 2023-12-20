public class MainSistemaEletronico {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("cavalo");
        produto.setValor(400);
        produto.setEndereco("SP");

        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.adicionarAoCarrinho(produto);
    }
}

