/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.App;

import br.edu.ifes.control.ControleUniversal;
import br.edu.ifes.view.ComandCarroDesligar;
import br.edu.ifes.view.ComandCarroLigar;
import br.edu.ifes.view.CommandPortaoAbrir;
import br.edu.ifes.view.CommandPortaoFechar;

/**
 *
 * @author Henrique
 * 
 */
public class App {

    public static void main(String[] args) {
        
        
        ControleUniversal controla;
        controla = new ControleUniversal(new ComandCarroLigar());
        controla = new ControleUniversal(new ComandCarroDesligar());
        controla = new ControleUniversal(new CommandPortaoAbrir());
        controla = new ControleUniversal(new CommandPortaoFechar());
    }
    
}
