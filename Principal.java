package com.senac.view;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String opc = JOptionPane.showInputDialog("Digite uma opção: 1- Produtos, 2-Funcionarios");
		int o = Integer.parseInt(opc);
		if (o == 1){
			MenuProduto.menuProdutos();
		} else if (o == 2){
			MenuFuncionario.menuFuncionarios();
		} else {
			
		}
	}

}
