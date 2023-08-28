package br.com.projeto.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JOptionPane;

import br.com.projeto.controller.LembrarSenhaController.lembraListener;
import br.com.projeto.model.bo.ADMBO;
import br.com.projeto.model.bo.CadastroBO;
import br.com.projeto.model.bo.LembrarSenhaBO;
import br.com.projeto.model.vo.CadastroVO;
import br.com.projeto.model.vo.LembrarSenhaVO;
import br.com.projeto.view.CadastroView;
import br.com.projeto.view.LembrarSenhaView;
import br.com.projeto.view.TelaADMView;
import br.com.projeto.model.vo.ADMVO;
	public class ADMController {
		private TelaADMView view;
		private ADMBO admBO;
		public ADMController (TelaADMView view, Connection conexao) {
			this.view = view;
			admBO = new ADMBO ();
			view.addBtnADM(new removeListener());
		}
		class removeListener implements ActionListener{
			public void actionPerformed (ActionEvent e) {
	          	 String email = view.getEmail();
	          	 ADMVO removeLogin = new ADMVO();
	          	 removeLogin.setEmail(email);
	          	 boolean removido = admBO.removeLogin(removeLogin);
	          	 if (removido == true) {
	          	 	 view.mensagem("Usuário removido.");
	          	 	 view.mensagem("ADM, verifique no banco de dados se a remoção foi feita corretamente");
	          	 } else if (removido == false){
	          		 view.mensagemErro("O e-mail informado não está de acordo com os registros");
	          	}
	   	 }
		}

	}
