/*package br.com.projeto.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import br.com.projeto.model.dao.RomantismoDAO;
import br.com.projeto.view.RomantismoView;

public class RomantismoController {
	private RomantismoView view;
	private RomantismoDAO Rdao;
	public RomantismoController (RomantismoView view, RomantismoDAO Rdao) {
		this.view = view;
		this.Rdao = Rdao;
		view.addBtnPegaTxt(new txtListener());
	}
	class txtListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String texto = Rdao.pegaTexto();
			view.setTexto(texto);
		}
	}
}*/
