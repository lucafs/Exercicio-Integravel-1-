package br.com.digitalhouse;

public class ProfessorTitular extends Professor {
    private String especialiadade;

    public ProfessorTitular(String nome, String sobrenome, Integer tempodecasa, Integer codigoprofessor, String especialiadade) {
        super(nome, sobrenome, tempodecasa, codigoprofessor);
        this.especialiadade = especialiadade;
    }

    public String getEspecialiadade() {
        return especialiadade;
    }

    public void setEspecialiadade(String especialiadade) {
        this.especialiadade = especialiadade;
    }
}
