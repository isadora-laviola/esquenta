public class Filme {
    private String nome;
    private Integer anoLancamento;
    private Integer nota;
    private Diretor diretor;
    private Genero genero;

    
    public Ator[] getAtor() {
        return ator;
    }

    public void setAtor(Ator[] ator) {
        this.ator = ator;
    }

    private Ator[] ator;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

}

