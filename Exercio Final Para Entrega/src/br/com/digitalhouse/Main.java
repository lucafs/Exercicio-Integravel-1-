package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProfessorAdjuntos jorge = new ProfessorAdjuntos("Jorge","Gonsalva",0,314,20);
        ProfessorAdjuntos henrrique = new ProfessorAdjuntos("Henrrique","Silva",0,31231,30);
        ProfessorTitular paula = new ProfessorTitular("Paula","Fernandes",0,2231,"IA");
        ProfessorTitular paulo = new ProfessorTitular("Paulo","Faraday",0,5678,"Data Science");
        List<Aluno> listaalunosFullStack = new ArrayList<Aluno>();
        List<Aluno> listaalunosAndroid = new ArrayList<Aluno>();


        Curso Fullstack = new Curso("Full Stack",20001,paula,jorge,3,listaalunosFullStack);
        Curso Android = new Curso("Android",20002,paulo,henrrique,2,listaalunosAndroid);

        Aluno aluno1 = new Aluno("Pedro","Silva",67894);
        Aluno aluno2 = new Aluno("Paulo","Pedrira",65784933);
        Aluno aluno3 = new Aluno("Silva","Lore",7381947);
        Aluno aluno4 = new Aluno("Lorena","Silva",78942);
        Aluno aluno5 = new Aluno("Rafael","Assis",79183);

        Fullstack.adicionarUmAluno(aluno1);
        Fullstack.adicionarUmAluno(aluno2);
        Android.adicionarUmAluno(aluno3);
        Android.adicionarUmAluno(aluno4);
        Android.adicionarUmAluno(aluno5);
        try {
            DigitalException.matriculaDH(aluno1);
        }
       catch (OtherException e) {
            e.printStackTrace();
           System.out.println("Falar com os alunos");

       } catch (DHException e) {
            e.printStackTrace();
            System.out.println("Vir ao co-learning");

        }

    }
}