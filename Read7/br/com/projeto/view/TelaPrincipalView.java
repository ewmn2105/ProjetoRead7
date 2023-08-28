package br.com.projeto.view;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
public class TelaPrincipalView extends JFrame{
	public JButton b,b1,b2,b3,b4, btnVoltar;
	private JPanel p, p1, p2;
	private JLabel fundo1, image, image1, image2, r, fundop2;
	private ImageIcon fundo, H, H2, H3, H4, fundo2;
	private Container container;
	private Font fonte1 = new Font("Calibri", Font.BOLD, 25);
	private Font fonte2 = new Font ("Calibri", Font.BOLD, 45);
	private Font fonte3 = new Font ("Calibri", Font.BOLD, 12);
	public TelaPrincipalView() {
		inicializarEventos();
		defineEventos();
	}
	public void inicializarEventos() {
		setTitle("Read7");
		setLayout(null);
		container = getContentPane();
		H4 = new ImageIcon("Imagens/Realismo.jpg");
		H3 = new ImageIcon("Imagens/Jornalistico.png");
		H2 = new ImageIcon("Imagens/Pequeno.jpg");
		H = new ImageIcon ("Imagens/Romantismo.jpg");
		fundo = new ImageIcon ("Imagens/fundoTP.png");
		fundo1 = new JLabel (fundo);
		fundo2 = new ImageIcon ("Imagens/Fundo.jpg");
		fundop2 = new JLabel(fundo2);
		image = new JLabel(H);
		image.setPreferredSize(new Dimension(1000,350));
		image1 = new JLabel (H2);
		r = new JLabel("Romantismo");
		r.setFont(fonte2);
		r.setBounds(450,285,1000,1000);
		p = new JPanel();
		p1 = new JPanel();
		p2 = new JPanel();
		p1.add(image);
		p1.setBounds(650, 145, 890,350);
		p2.setBounds(0,530, 1800, 270);
		r.setBounds(250, 250, 500,150);
		b = new JButton ("Romantismo");
		b1 = new JButton ("Quinhetismo");
		b2 = new JButton ("Trovadorismo");
		b3 = new JButton ("Realismo");
		btnVoltar = new JButton ("Sair");
		b.setBounds(160, 550, 250, 90);
		b1.setBounds(500, 550, 250, 90);
		b2.setBounds(840, 550, 250, 90);
		b3.setBounds(1180, 550, 250, 90);
		b.setBackground(Color.white);
		b1.setBackground(Color.white);
		b2.setBackground(Color.white);
		b3.setBackground(Color.white);
		btnVoltar.setBackground(new Color(227,227,227));
		p2.setBackground(new Color(217, 217, 217));
		b.setFont(fonte1);
		b1.setFont(fonte1);
		b2.setFont(fonte1);
		b3.setFont(fonte1);
		btnVoltar.setBounds(1290, 85, 130, 27);
		add(r);
		add(b);
		add(b1);
		add(b2);
		add(b3);
		add(btnVoltar);
		add(p1);
		add(p2);
		container.add(fundo1);
	}
		public void defineEventos() {
			b.addMouseListener(new MouseListener() {
					public void mouseClicked(MouseEvent e) {
						
			    }
			    public void mousePressed(MouseEvent e) {
			    	RomantismoView view = new RomantismoView();
					container.removeAll();
					container.add(view);
					update(getGraphics());
					container.validate();
			    }
			    public void mouseReleased(MouseEvent e) {
			    	
			    }

			    public void mouseEntered(MouseEvent e) {
			    	b.setBackground(new Color(255, 205, 85));
			    	b.setSize(b.getWidth() + 10, b.getHeight() + 5);
			    	image.setIcon(H);
			    	p1.setBackground(new Color(255, 205, 85));
			    	container.setBackground(new Color(255, 205, 85));
			    	r.setText("Romantismo");
			    }

			    public void mouseExited(MouseEvent e) {
			    	b.setBackground(Color.white);	
			    	b.setSize(b.getWidth() - 10, b.getHeight() - 5);
			    }
			});
			b1.addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent e) {
		    }

		    public void mousePressed(MouseEvent e) {
		    	QuinhetismoView view = new QuinhetismoView();
		    	container.removeAll();
				container.add(view);
				update(getGraphics());
				container.validate();
		    }

		    public void mouseReleased(MouseEvent e) {
		    }

		    public void mouseEntered(MouseEvent e) {
		    	b1.setBackground(new Color(255, 254, 145));
		    	image.setIcon(H2);
		    	p1.setBackground(new Color(255, 254, 145));
		    	container.setBackground(new Color(255, 254, 145));
		    	r.setText("Quinhetismo");
		    }

		    public void mouseExited(MouseEvent e) {
		    	b1.setBackground(Color.white);
		    }
		});
			b2.addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent e) {
		    }

		    public void mousePressed(MouseEvent e) {
		    	TrovadorismoView view = new TrovadorismoView();
		    	container.removeAll();
				container.add(view);
				update(getGraphics());
				container.validate();
		    }

		    public void mouseReleased(MouseEvent e) {
		    	
		    }

		    public void mouseEntered(MouseEvent e) {
		    	b2.setBackground(new Color(133, 197, 245));
		    	image.setIcon(H3);
		    	p1.setBackground(new Color(133, 197, 245));
		    	container.setBackground(new Color(133, 197, 245));
		    	r.setText("Trovadorismo");	    	
		    }

		    public void mouseExited(MouseEvent e) {
		    	b2.setBackground(Color.white);
		    }
		});
		b3.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
	    }

	    public void mousePressed(MouseEvent e) {
	    	RealismoView view = new RealismoView();
	    	container.removeAll();
			container.add(view);
			update(getGraphics());
			container.validate();
	    }

	    public void mouseReleased(MouseEvent e) {
	    }

	    public void mouseEntered(MouseEvent e) {
	    	b3.setBackground(Color.red);
	    	image.setIcon(H4);
	    	p1.setBackground(Color.red);
	    	container.setBackground(Color.red);
	    	r.setText("Realismo");
	    }

	    public void mouseExited(MouseEvent e) {
	    	b3.setBackground(Color.white);
	    }
	   });
		btnVoltar.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				btnVoltar.setBackground(Color.red);
				btnVoltar.setForeground(Color.white);
		    }
		    public void mousePressed(MouseEvent e) {
		    	btnVoltar.setBackground(Color.LIGHT_GRAY);
		    	dispose();
		    }
			public void mouseReleased(MouseEvent e) {
				btnVoltar.setBackground(Color.LIGHT_GRAY);
			}
			public void mouseEntered(MouseEvent e) {
				btnVoltar.setBackground(Color.red);
				btnVoltar.setForeground(Color.white);
			}
			public void mouseExited(MouseEvent e) {
				btnVoltar.setBackground(new Color(227,227,227));
				btnVoltar.setForeground(Color.black);
			}			
		});
	}	
}