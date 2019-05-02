package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private Integer codigocurso;
    private ProfessorTitular profTitular;
    private ProfessorAdjuntos proAdjunto;
    private Integer maxAlunos;
    private List<Aluno> listaAlunosMatriculados;

    public Curso(String nome, Integer codigocurso, Integer maxAlunos) {
        this.nome = nome;
        this.codigocurso = codigocurso;
        this.maxAlunos = maxAlunos;
    }

    public Curso(String nome, Integer codigocurso, ProfessorTitular profTitular, ProfessorAdjuntos proAdjunto, Integer maxAlunos, List<Aluno> listaAlunosMatriculados) {
        this.nome = nome;
        this.codigocurso = codigocurso;
        this.profTitular = profTitular;
        this.proAdjunto = proAdjunto;
        this.maxAlunos = maxAlunos;
        this.listaAlunosMatriculados = listaAlunosMatriculados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigocurso() {
        return codigocurso;
    }

    public void setCodigocurso(Integer codigocurso) {
        this.codigocurso = codigocurso;
    }

    public ProfessorTitular getProfTitular() {
        return profTitular;
    }

    public void setProfTitular(ProfessorTitular profTitular) {
        this.profTitular = profTitular;
    }

    public ProfessorAdjuntos getProAdjunto() {
        return proAdjunto;
    }

    public void setProAdjunto(ProfessorAdjuntos proAdjunto) {
        this.proAdjunto = proAdjunto;
    }

    public Integer getMaxAlunos() {
        return maxAlunos;
    }

    public void setMaxAlunos(Integer maxAlunos) {
        this.maxAlunos = maxAlunos;
    }

    public List<Aluno> getListaAlunosMatriculados() {
        return listaAlunosMatriculados;
    }

    public void setListaAlunosMatriculados(List<Aluno> listaAlunosMatriculados) {
        this.listaAlunosMatriculados = listaAlunosMatriculados;
    }
    public Boolean adicionarUmAluno(Aluno umAluno){
        if (this.listaAlunosMatriculados.size() < this.maxAlunos){
            this.listaAlunosMatriculados.add(umAluno);
            return true;
        }
        else{ return false; }
    }

     public void excluirAluno(Aluno umAluno){
        if (this.listaAlunosMatriculados.contains(umAluno)){
            this.listaAlunosMatriculados.remove(umAluno);
        }
     }
}
