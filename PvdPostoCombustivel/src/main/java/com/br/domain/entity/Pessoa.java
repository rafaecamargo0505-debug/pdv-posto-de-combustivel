
package com.br.domain.entity;

import java.util.date;

public class Pessoa() {

    // atributos
    private String nomeCompleto;

    private String cpfCnpj;

    private Date dataNascimento;

    private Integer numeroCtps;


    //constutor
    public Pessoa(String nomeCompleto){
        this.nomeCompleto = nomeCompleto;
    }



    //getters
    public String getNomeCompleto(){
        return nomeCompleto;
    }

    // setters
     public void setNomeCompleto(String nomeCompleto){
         this.nomeCompleto = nomeCompleto;
    }


