package cinesElorrieta.views.panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class WelcomePanel {

	private JPanel welcomePanel = null;

	private JLabel lblTitulo = null;
	private JLabel lblTitulo_fondo = null;
	private JLabel lblNewLabel = null;
	private JLabel lblNewLabel_fondo = null;
	private JButton btnRegister = null;

	public WelcomePanel(ArrayList<JPanel> paneles) {

		welcomePanel = new JPanel();
		welcomePanel.setBackground(new Color(255, 66, 70));
		welcomePanel.setBounds(0, 0, 1234, 741);
		welcomePanel.setLayout(null);

		lblTitulo = new JLabel("BIENVENIDO A CINES ELORRIETA");
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 40));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(255, 249, 723, 130);
		welcomePanel.add(lblTitulo);

		lblTitulo_fondo = new JLabel("BIENVENIDO A CINES ELORRIETA");
		lblTitulo_fondo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo_fondo.setForeground(new Color(0, 0, 0));
		lblTitulo_fondo.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 40));
		lblTitulo_fondo.setBounds(250, 249, 723, 130);
		welcomePanel.add(lblTitulo_fondo);

		lblNewLabel = new JLabel("PULSA DONDE QUIERAS PARA CONTINUAR");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(379, 347, 476, 51);
		welcomePanel.add(lblNewLabel);

		lblNewLabel_fondo = new JLabel("PULSA DONDE QUIERAS PARA CONTINUAR");
		lblNewLabel_fondo.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_fondo.setForeground(Color.BLACK);
		lblNewLabel_fondo.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		lblNewLabel_fondo.setBounds(379, 347, 473, 51);
		welcomePanel.add(lblNewLabel_fondo);

		btnRegister = new JButton("register");
		btnRegister.setBackground(Color.RED);
		btnRegister.setForeground(Color.WHITE);
		btnRegister.setBounds(0, 718, 64, 23);
		welcomePanel.add(btnRegister);

		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

//				try {
//					Thread.sleep(3000);
//				} catch (InterruptedException a) {
//					// No hacer nada
//				}

				paneles.get(0).setVisible(false);
				paneles.get(1).setVisible(true);
				paneles.get(2).setVisible(false);
				paneles.get(3).setVisible(false);
				paneles.get(4).setVisible(false);
				paneles.get(5).setVisible(false);
			}
		});

		welcomePanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				paneles.get(0).setVisible(false);
				paneles.get(1).setVisible(false);
				paneles.get(2).setVisible(false);
				paneles.get(3).setVisible(true);
				paneles.get(4).setVisible(false);
				paneles.get(5).setVisible(false);
			}
		});

	}

	public JPanel getPanel() {
		return welcomePanel;
	}

}
