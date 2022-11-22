package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {
    @GetMapping
    public String hello(){
        return "<h2>HELLO WORD !!!</h2>";
    }
    @GetMapping("/bsms")
    public String hello_2(){
        return "<h1>BSM`S GENERATION BRASIL</h1>" +
                "<P>1- RESPONSABILIDADE PESSOAL</P>" +
                "<P>2- MENTALIDADE DE CRESCIMENTO</P>" +
                "<P>3- ORIENTAÇÃO PARA O FUTURO</P>" +
                "<P>4- PERSISTÊNCIA</P>" +
                "<P>5- COMUNICAÇÃO</P>" +
                "<P>6- ADAPTABILIDADE</P>" +
                "<P>7- TRABALHO EM EQUIPE</P>" +
                "<P>8- TRABALHO EM EQUIPE</P>";

    }
    @GetMapping("/aprendizagem")
    public String hello_3(){
        return "<h1>OBJETIVOS DE APRENDIZAGEM DA SEMANA</h1>" +
                "<P>* REVER VIDEO SOBRE MATERIA SPRING NA PLATAFORMA GENERATION.</P>" +
                "<P>* ATUALIZAR EXERCICIOS.</P>" +
                "<P>* MELHORAR COMUNICAÇÃO EM RELAÇÃO A EXPLICAR PROJETO</P>" +
                "<P>* ATUALIZAR TRELLO PROJETO INTEGRADOR</P>";

    }

}
