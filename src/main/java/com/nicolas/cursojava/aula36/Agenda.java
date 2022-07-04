/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nicolas.cursojava.aula36;

/**
 *
 * @author Nicolas
 */
public class Agenda {
    
    private String nome;
    private Contato[] contatos;

    public Agenda() {
        
    }
    
    public Agenda(String nome) {
        this.nome = nome;
    }

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
     * @return the contatos
     */
    public Contato[] getContatos() {
        return contatos;
    }

    /**
     * @param contatos the contatos to set
     */
    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }
    
    public String obterInfo(){
       String info = "Agenda: " + nome + "\n";
       
       if(contatos != null) {
           for(Contato c : contatos){
               info += c.obterInfo() + "\n"; 
           }
       }
       
       return info;
    }
}
