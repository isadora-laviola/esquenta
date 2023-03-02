public class Diretor extends Pessoa{
    private Integer quantidadePremios;
    private Filme[] listaFilmes;

    public Integer getQuantidadePremios() {
        return quantidadePremios;
    }

    public void setQuantidadePremios(Integer quantidadePremios) {
        this.quantidadePremios = quantidadePremios;
    }

    public Filme[] getListaFilmes() {
        return listaFilmes;
    }

    public void setListaFilmes(Filme[] listaFilmes) {
        this.listaFilmes = listaFilmes;
    }
}
