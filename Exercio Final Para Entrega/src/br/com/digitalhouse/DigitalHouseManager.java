package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    List<Aluno> listaAlunos;
    List<Professor> listaProfessor ;
    List<ProfessorAdjuntos> listaProfessorAdj ;
    List<ProfessorTitular> listaProfessorTitu;

    List<Curso> listaCurso;
    List<Matricula> listaMatricula ;

    public DigitalHouseManager(List<Aluno> listaAlunos, List<Professor> listaProfessor, List<ProfessorAdjuntos> listaProfessorAdj, List<ProfessorTitular> listaProfessorTitu, List<Curso> listaCurso, List<Matricula> listaMatricula) {
        this.listaAlunos = listaAlunos;
        this.listaProfessor = listaProfessor;
        this.listaProfessorAdj = listaProfessorAdj;
        this.listaProfessorTitu = listaProfessorTitu;
        this.listaCurso = listaCurso;
        this.listaMatricula = listaMatricula;
    }

    public List<ProfessorAdjuntos> getListaProfessorAdj() {
        return listaProfessorAdj;
    }

    public void setListaProfessorAdj(List<ProfessorAdjuntos> listaProfessorAdj) {
        this.listaProfessorAdj = listaProfessorAdj;
    }

    public List<ProfessorTitular> getListaProfessorTitu() {
        return listaProfessorTitu;
    }

    public void setListaProfessorTitu(List<ProfessorTitular> listaProfessorTitu) {
        this.listaProfessorTitu = listaProfessorTitu;
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public List<Professor> getListaProfessor() {
        return listaProfessor;
    }

    public void setListaProfessor(List<Professor> listaProfessor) {
        this.listaProfessor = listaProfessor;
    }

    public List<Curso> getListaCurso() {
        return listaCurso;
    }

    public void setListaCurso(List<Curso> listaCurso) {
        this.listaCurso = listaCurso;
    }

    public List<Matricula> getListaMatricula() {
        return listaMatricula;
    }

    public void setListaMatricula(List<Matricula> listaMatricula) {
        this.listaMatricula = listaMatricula;
    }
    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos){
        Curso novoCurso= new Curso(nome,codigoCurso,quantidadeMaximaDeAlunos);
        this.listaCurso.add(novoCurso);
    }
    public void excluirCurso(Integer codigoCurso){
        for (Curso d :this.listaCurso){
            if (d.getCodigocurso()!= null && d.getCodigocurso() ==codigoCurso){
                this.listaCurso.remove(d);
            }
        }
    }


    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras){
        ProfessorAdjuntos novoprofadj = new ProfessorAdjuntos(nome,sobrenome,0,codigoProfessor,quantidadeDeHoras);
        this.listaProfessor.add(novoprofadj);
        this.listaProfessorAdj.add(novoprofadj);
    }


    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade){
        ProfessorTitular novoproftitu = new ProfessorTitular(nome,sobrenome,0,codigoProfessor,especialidade);
        this.listaProfessor.add(novoproftitu);
        this.listaProfessorTitu.add(novoproftitu);
    }
    public boolean excluirProfessor(Integer codigoProfessor){
        for (Professor d :this.listaProfessor){
            if (d.getCodigoprofessor()!= null && d.getCodigoprofessor() == codigoProfessor){
                this.listaProfessor.remove(d);
            }
        }
        return true;

    }
    public boolean matricularAluno(String nome, String sobrenome, Integer codigoAluno){
        Aluno novoAluno = new Aluno(nome,sobrenome,codigoAluno);
        this.listaAlunos.add(novoAluno);
        return true;
    }
    public void matricularAluno(Integer codigoAluno, Integer codigoCurso){
        for (Curso d :this.listaCurso){
            if (d.getCodigocurso()!= null && d.getCodigocurso() == codigoCurso){
                for (Aluno x :this.listaAlunos){
                    if (x.getCodigoaluno()!= null && x.getCodigoaluno() == codigoAluno){
                        if (d.getListaAlunosMatriculados().size()< d.getMaxAlunos()){
                            d.getListaAlunosMatriculados().add(x);
                            System.out.println("Matrícula efetuada com sucesso.");
                        }
                        else{
                            System.out.println("Não há vagas disponiveis no momento para este curso.");
                        }

                    }
                    }
            }
        }
    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto){
        for ( ProfessorTitular x :this.listaProfessorTitu){
            if (x.getCodigoprofessor()!= null && x.getCodigoprofessor() == codigoProfessorTitular){
                for (ProfessorAdjuntos d :this.listaProfessorAdj){
                    if (d.getCodigoprofessor()!= null && d.getCodigoprofessor() == codigoProfessorAdjunto){
                        for (Curso h :this.listaCurso){
                            if (h.getCodigocurso()!= null && h.getCodigocurso() == codigoCurso){
                                h.setProfTitular(x);
                                h.setProAdjunto(d);
                            }
                        }
                    }
                }
            }
        }
    }


}
