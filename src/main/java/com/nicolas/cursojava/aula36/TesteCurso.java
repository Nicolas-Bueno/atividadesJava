/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nicolas.cursojava.aula36;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class TesteCurso {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o nome do curso: ");
        String nomeCurso = scan.nextLine();
        
        System.out.println("Entre com o horário do curso: ");
        String horario = scan.nextLine();
        
        System.out.println("Informe o nome do professor: ");
        String nomeProf = scan.nextLine();
        
        System.out.println("\n Informe o departamento do professor: ");
        String depProf = scan.nextLine();
        
        System.out.println("Informe o email do professor: ");
        String email = scan.nextLine();
        
        Curso curso = new Curso();
        curso.setNome(nomeCurso);
        curso.setHorario(horario);
        
        Professor prof = new Professor();
        prof.setNome(nomeProf);
        prof.setDepartamento(depProf);
        prof.setEmail(email);
        
        curso.setProfessor(prof);
        
        System.out.println("------Alunos------");
        
        Aluno[] alunos = new Aluno[5];
        
        for(int i=0; i<4; i++){
            
            scan.nextLine();
            
          System.out.println("\n Informe o nome do aluno: " +(i+1));
          String nomeAluno = scan.nextLine();
          
          System.out.println("Informe a matricula do aluno: ");
          String matricula = scan.nextLine();
          
          double[] notas = new double[4];
           for(int j=0; j<4; j++){
             System.out.println("Informe a " + (j+1) + " nota: " );
             notas[j] = scan.nextDouble();
           }
           
           Aluno aluno = new Aluno();
           aluno.setNome(nomeAluno);
           aluno.setMatricula(matricula);
           aluno.setNotas(notas);
           alunos[i] = aluno;
           
        }
        curso.setAlunos(alunos);
        
        System.out.println(curso.obterInfo());
    }
}
