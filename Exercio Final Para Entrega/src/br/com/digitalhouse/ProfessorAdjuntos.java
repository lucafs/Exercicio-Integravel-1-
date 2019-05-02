package br.com.digitalhouse;

public class ProfessorAdjuntos extends Professor {
    private Integer horasDeMonitoria;

    public ProfessorAdjuntos(String nome, String sobrenome, Integer tempodecasa, Integer codigoprofessor, Integer horasDeMonitoria) {
        super(nome, sobrenome, tempodecasa, codigoprofessor);
        this.horasDeMonitoria = horasDeMonitoria;

    }

    public Integer getHorasDeMonitoria() {
        return horasDeMonitoria;
    }

    public void setHorasDeMonitoria(Integer horasDeMonitoria) {
        this.horasDeMonitoria = horasDeMonitoria;
    }
}
