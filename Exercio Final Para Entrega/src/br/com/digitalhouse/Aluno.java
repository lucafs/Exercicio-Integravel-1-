package br.com.digitalhouse;

public class Aluno implements Estudioso{
    private String nome;
    private String sobrenome;
    private Integer codigoaluno;

    public Aluno(String nome, String sobrenome, Integer codigoaluno) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigoaluno = codigoaluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getCodigoaluno() {
        return codigoaluno;
    }

    public void setCodigoaluno(Integer codigoaluno) {
        this.codigoaluno = codigoaluno;
    }

    @Override
    public float getNivelDeEstudo() {
        float nivel =this.getCodigoaluno()*20;
        return nivel;
    }
}
