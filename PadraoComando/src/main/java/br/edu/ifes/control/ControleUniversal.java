/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.control;

import br.edu.ifes.view.InterfaceControleUniversal;

/**
 *
 * @author Henrique
 */
public class ControleUniversal {
    
    public ControleUniversal(InterfaceControleUniversal controle){
        controle.executaSolicitacao();
    }
}
