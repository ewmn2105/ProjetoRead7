package br.com.projeto.view;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RomantismoView extends JPanel{
	private JLabel image1, image2, image3, txt1;
	private JPanel p, p1, p2;
	private JButton b, btnSalvar, btnLer, btnLimpar, btnTxt1, btnTxt2, btnTxt3;
	private Container container;
	private ImageIcon i1, i2, i3;
	private Font fonte = new Font("Verdana", Font.BOLD, 20);
	private Font fonte1 = new Font("Calibri", Font.BOLD, 15);
	private Font fonte2 = new Font("Verdana", Font.BOLD, 9);
    private JTextArea nome, text;
    private JScrollPane pane, pane1;
    private JPasswordField senha;
    private JButton btnLogin, btnCriarCadastro;
    private String texto;
    public RomantismoView() {
    	inicializaComponentes();    	
    }
    public void inicializaComponentes() {
      	 setBounds(0,0,1900,900);
         setLayout(null);
         b = new JButton("Voltar");
         btnSalvar = new JButton ("Salvar");
         btnLer = new JButton ("Ler");
         btnLimpar = new JButton ("Limpar");
         btnTxt1 = new JButton ("Texto 1");
         btnTxt2 = new JButton ("Texto 2");
         btnTxt3 = new JButton ("Texto 3");
         nome = new JTextArea();
    	 text = new JTextArea();
         senha = new JPasswordField("Senha");
         pane = new JScrollPane(nome);
         pane1 = new JScrollPane(text);
         btnLogin = new JButton("Login");
         btnCriarCadastro = new JButton ("Criar");
         txt1 = new JLabel ("Não possui cadastro?");
         i1 = new ImageIcon ("Imagens/Fundo2.jpg");
         i2 = new ImageIcon("Imagens/Fundo1.jpg");
         i3 = new ImageIcon ("Imagens/read.png");
    	 image1 = new JLabel (i1);
    	 image2 = new JLabel(i2);
    	 image3 = new JLabel(i3);
    	 p = new JPanel();
    	    
         pane.setBounds(880, 150, 590, 500);
         pane1.setBounds(270, 150, 590, 500);
         nome.setLineWrap(true);
         text.setLineWrap(true);
         senha.setBounds(597, 395, 350, 45);
         image1.setBounds(0,-95,1920, 1090); 
         image3.setBounds(575, 65, 390, 320);
         txt1.setBounds(740, 537, 125, 20);
         p.setBounds(575, 250, 390, 315);
         b.setBounds(1290, 85, 130, 27);
         btnSalvar.setBounds(880, 657, 190, 27);
         btnLer.setBounds(1080, 657, 190, 27);
         btnLimpar.setBounds(1280, 657, 190, 27);
         btnTxt1.setBounds(90, 297, 100, 50);
         btnTxt2.setBounds(90, 357, 100, 50);
         btnTxt3.setBounds(90, 417, 100, 50);
         p.add(image2);
         
         btnLogin.setBackground(Color.BLUE); 
         btnLogin.setForeground(Color.WHITE);
         btnLogin.setFont(fonte);
         nome.setFont(fonte);
         text.setFont(fonte);
         senha.setFont(fonte1);
         add(b);
         add(btnSalvar);
         add(btnLer);
         add(btnLimpar);
         add(btnTxt1);
         add(btnTxt2);
         add(btnTxt3);
         add(pane);
         add(pane1);
         add(image1);
         b.addActionListener(new ActionListener() {
        	 public void actionPerformed(ActionEvent e) {
        		 TelaPrincipalViewVolta tela = new TelaPrincipalViewVolta();
 				 removeAll();
 				 add(tela);
 				 update(getGraphics());
 				 validate();
        	 }
         });
         btnLimpar.addActionListener(new ActionListener() {
        	 public void actionPerformed(ActionEvent e) {
        		 nome.setText("");
        	 }
         });
         btnTxt1.addActionListener(new ActionListener() {
        	 public void actionPerformed(ActionEvent e) {
        		 try {
        		 String sql = "SELECT texto1 FROM Acao WHERE id = 1";
        		 Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/Textos", "root", "root");
        		 PreparedStatement statement = conexao.prepareStatement(sql);
        		 ResultSet resultado = statement.executeQuery(sql);
        		 if (resultado.next()) {
        			 texto = resultado.getNString("texto1");
        			 text.setText(texto);
        		 }
        		 }catch(SQLException slcte) {}
        	 }
         });
         btnSalvar.addActionListener(new ActionListener() {
        	 public void actionPerformed(ActionEvent e) {
        		 try {
        			 String texto = nome.getText();
        			 String url = "jdbc:mysql://localhost:3306/READ7NOVO";
        			 Connection conexao = DriverManager.getConnection (url, "root", "root");
        			 String sql = "INSERT INTO texto(Resumo) VALUES ('"+texto+"')";
        			 PreparedStatement statement = conexao.prepareStatement(sql);
        			 statement.executeUpdate();
        			 JOptionPane.showMessageDialog(null, "Salvo");
        		      } catch (SQLException sqle) {      		        
        		        }
        		}
        	 });
    }        

    public String getText() {
        return nome.getText();
    }
    public String getTexto() {
        return text.getText();
    }
    public void setTexto(String texto) {
    	this.texto = texto;
    }
    public void addBtnPegaTxt(ActionListener listener) {
    	btnTxt1.addActionListener(listener);
    }
    public void addBtnSalvar(ActionListener listener) {
    	btnSalvar.addActionListener(listener);
    }
    public void mensagem(String mensagem) {
    	JOptionPane.showMessageDialog(null, mensagem);
    }
    public void mostrarMensagem(String mensagem) {
    	JOptionPane.showMessageDialog(null, mensagem, "Erro ao logar", JOptionPane.ERROR_MESSAGE);
    }
}

