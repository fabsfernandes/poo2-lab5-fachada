/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufu.poo.lab5.hometheater;

/**
 *
 * @author fabiola
 */
public class Main {
    
    public static void main(String ... args){
        
        Amplificador amp = new Amplificador();
        Luzes luzes = new Luzes();
        MaquinaPipoca pipoqueira = new MaquinaPipoca();
        Projetor projetor = new Projetor();
        StreamingPlayer player = new StreamingPlayer();
        Telao telao = new Telao();
        
        
        HomeTheaterFachada homeTheater = 
				new HomeTheaterFachada(amp, player, projetor, luzes, telao, pipoqueira);
 
		homeTheater.assistirFilme("Barbie");
                homeTheater.fimDoFilme();
    }
}
