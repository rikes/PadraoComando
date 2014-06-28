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
public class CommandPortaoAbrir implements InterfaceControleUniversal{

    public void AbrirPortao(){
        System.out.println("pi pi pi pi  - Portão Aberto");
    }
    
    @Override
    public void executaSolicitacao() {
        this.AbrirPortao();
    }

}
