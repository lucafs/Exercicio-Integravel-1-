package br.com.digitalhouse;

public abstract class Professor  {
    private String nome;
    private String sobrenome;
    private Integer tempodecasa;
    private Integer codigoprofessor;

    public Professor(String nome, String sobrenome, Integer tempodecasa, Integer codigoprofessor) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tempodecasa = tempodecasa;
        this.codigoprofessor = codigoprofessor;
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

    public Integer getTempodecasa() {
        return tempodecasa;
    }

    public void setTempodecasa(Integer tempodecasa) {
        this.tempodecasa = tempodecasa;
    }

    public Integer getCodigoprofessor() {
        return codigoprofessor;
    }

    public void setCodigoprofessor(Integer codigoprofessor) {
        this.codigoprofessor = codigoprofessor;
    }
}
