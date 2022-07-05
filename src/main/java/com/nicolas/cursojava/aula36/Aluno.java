/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nicolas.cursojava.aula36;

/**
 *
 * @author Nicolas
 */
public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the notas
     */
    public double[] getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    public String obterInfo() {
        String info = "Nome Aluno: " + nome + ";";
        info += " Matricula: " + matricula + ";";
        info += " Notas: ";
        
        double soma = 0;
        for(double nota : notas){
            soma += nota;
            info += nota + " ";
        }
        double media = soma/4;
        
        info += "\n" + "Média: " + media + " - ";
        if(media >= 7) {
            info += "Aprovado";
        }else {
            info += "Reprovado";
        }
        
        return info;
    }
    
    public double obterMedia() {
        double soma = 0;
        for(double nota : notas){
            soma += nota;
        }
        return soma/4;
    }
}
