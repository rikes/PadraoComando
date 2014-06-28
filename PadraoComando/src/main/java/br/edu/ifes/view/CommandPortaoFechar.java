/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.view;

/**
 *
 * @author Henrique
 */
public class CommandPortaoFechar implements InterfaceControleUniversal{

    public void FecharPortao(){
        System.out.println("Tan tan tan  - Portão Fechado");
    }
    @Override
    public void executaSolicitacao() {
        this.FecharPortao();
    }
    
}
