package cinesElorrieta.views;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import cinesElorrieta.bbdd.pojo.Ticket;
import cinesElorrieta.views.panels.CheckoutPanel;
import cinesElorrieta.views.panels.CinemasPanel;
import cinesElorrieta.views.panels.LoginPanel;

import cinesElorrieta.views.panels.RegisterPanel;
import cinesElorrieta.views.panels.TicketPanel;
import cinesElorrieta.views.panels.WelcomePanel;

/**
 * Define la ventana principal del programa
 */
public class MainFrame {

	private JFrame frame;

	private ArrayList<JPanel> panels = null;
	private ArrayList<Ticket> selectedSessions = null;

	/**
	 * Default Constructor
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initializes components of the Frame
	 */
	public void initialize() {

		frame = new JFrame();
		frame.setTitle("CINE ELORRIETA GRUPO2");
		frame.setIconImage(null);
		frame.setBounds(100, 100, 1250, 780);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		panels = new ArrayList<JPanel>();
		selectedSessions = new ArrayList<Ticket>();

		// Panel 0
		WelcomePanel gestorpanel0 = new WelcomePanel(panels);
		JPanel welcomePanel = gestorpanel0.getPanel();
		welcomePanel.setVisible(true);
		panels.add(welcomePanel);
		frame.getContentPane().add(welcomePanel);

		// Panel 1
		RegisterPanel gestorpanel1 = new RegisterPanel(panels);
		JPanel panelRegister = gestorpanel1.getPanel();
		panelRegister.setVisible(false);
		panels.add(panelRegister);
		frame.getContentPane().add(panelRegister);

		// Panel 2
		LoginPanel gestorpanel2 = new LoginPanel(panels, selectedSessions);
		JPanel loginPanel = gestorpanel2.getLoginPanel();
		loginPanel.setVisible(false);
		panels.add(loginPanel);
		frame.getContentPane().add(loginPanel);

		// Panel 3
		CinemasPanel gestorpanel3 = new CinemasPanel(panels, selectedSessions);
		JPanel cinemasPanel = gestorpanel3.getCinemasPanel();
		cinemasPanel.setVisible(false);
		panels.add(cinemasPanel);
		frame.getContentPane().add(cinemasPanel);

		// Panel 4
		CheckoutPanel gestorpanel4 = new CheckoutPanel(panels, selectedSessions);
		JPanel checkoutPanel = gestorpanel4.getCheckoutPanel();
		checkoutPanel.setVisible(false);
		panels.add(checkoutPanel);
		frame.getContentPane().add(checkoutPanel);

		// Panel 5
		TicketPanel gestorpanel5 = new TicketPanel(panels, selectedSessions);
		JPanel ticketPanel = gestorpanel5.getTicketPanel();
		ticketPanel.setVisible(false);
		panels.add(ticketPanel);
		frame.getContentPane().add(ticketPanel);

		frame.setVisible(true);
	}
}
