public class ProdutoFisico implements IProduto{
    @Override
    public void adicionarAoCarrinho(Produto produto) {
        if (produto.getEndereco().equals("CE")){
            System.out.println("FRETE GRASTIS: " + produto.getValor());
        } else {
            double valorFrete;

            valorFrete = produto.getValor() + 5;

            produto.setValor(valorFrete) ;
            System.out.println("FRETE DE 5 REAIS: " + produto.getValor());
        }
    }
}
