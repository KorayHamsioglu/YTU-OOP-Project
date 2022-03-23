package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;



import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Date;

public class GUI extends JFrame {
//Member field of the JFrame class
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	/**
	 * Launch the application.
	 */
	private ServiceProvider serviceprovider=null;
	private SubscriptionPlan[] subscriptionplans;
	private Date date;
	private Subscription subscription;
//GUI launching via run method inside of the main method of JFrame	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	//Constructor of GUI JFrame class
	public GUI() {
	//We set all features about member field components like boundaries, coordinates,colors and texts for labels and buttons.	
		setTitle("Subscribe");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 853, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(205, 92, 92));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Add Subscription Plan(s)");
		
		btnNewButton.setBounds(128, 279, 177, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("( for companies)");
		lblNewLabel.setBounds(168, 313, 123, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Service Provider Information And Subscribe System");
		lblNewLabel_1.setForeground(new Color(85, 107, 47));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(257, 21, 369, 29);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Subscribe");
		btnNewButton_1.setBounds(539, 279, 177, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("( for customers)");
		lblNewLabel_2.setBounds(584, 313, 123, 14);
		contentPane.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(277, 121, 86, 24);
		contentPane.add(comboBox);
		comboBox.addItem("GSM");
		comboBox.addItem("Cable");
		
		JLabel lblNewLabel_3 = new JLabel("Type Of Service Provider : ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(56, 126, 163, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(56, 191, 167, 14);
		contentPane.add(lblNewLabel_4);
		lblNewLabel_4.setVisible(false);
		textField = new JTextField();
		textField.setBounds(277, 188, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setVisible(false);
		
		textField_1 = new JTextField();
		
		
		textField_1.setBounds(277, 220, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		textField_1.setVisible(false);
		
		JLabel lblNewLabel_5 = new JLabel("Number Of Subscription Plans: ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(56, 223, 211, 14);
		contentPane.add(lblNewLabel_5);
		lblNewLabel_5.setVisible(false);
		
		JLabel lblNewLabel_6 = new JLabel("(Max=3)");
		lblNewLabel_6.setBounds(373, 223, 60, 14);
		contentPane.add(lblNewLabel_6);
		lblNewLabel_6.setVisible(false);
		
		JLabel lblNewLabel_7 = new JLabel("Name Of The Plan #1:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7.setBounds(56, 254, 167, 14);
		contentPane.add(lblNewLabel_7);
		lblNewLabel_7.setVisible(false);
		
		JLabel lblNewLabel_8 = new JLabel("Name Of The Plan #2");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_8.setBounds(56, 283, 163, 14);
		contentPane.add(lblNewLabel_8);
		lblNewLabel_8.setVisible(false);
		
		JLabel lblNewLabel_9 = new JLabel("Name Of The Plan #3: ");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_9.setBounds(56, 313, 177, 14);
		contentPane.add(lblNewLabel_9);
		lblNewLabel_9.setVisible(false);
		
		textField_2 = new JTextField();
		textField_2.setBounds(277, 251, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		textField_2.setVisible(false);
		
		textField_3 = new JTextField();
		textField_3.setBounds(277, 280, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		textField_3.setVisible(false);
		
		textField_4 = new JTextField();
		textField_4.setBounds(277, 310, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		textField_4.setVisible(false);
		
		JLabel lblNewLabel_10 = new JLabel("Customer Citizenship Number: ");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_10.setBounds(472, 126, 189, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Customer Name:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_11.setBounds(472, 161, 180, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Name Of The Plan: ");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_12.setBounds(472, 191, 180, 14);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Start Date (MM/DD/YYYY): ");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_13.setBounds(472, 223, 189, 14);
		contentPane.add(lblNewLabel_13);
		
		textField_5 = new JTextField();
		textField_5.setBounds(662, 123, 114, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(662, 158, 114, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(662, 188, 114, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(662, 220, 114, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Service Provider Information");
		lblNewLabel_14.setForeground(new Color(85, 107, 47));
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_14.setBounds(128, 490, 224, 14);
		contentPane.add(lblNewLabel_14);
		lblNewLabel_14.setVisible(false);
		
		JLabel lblNewLabel_15 = new JLabel("Type: ");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_15.setBounds(56, 543, 291, 14);
		contentPane.add(lblNewLabel_15);
		lblNewLabel_15.setVisible(false);
		
		JLabel lblNewLabel_16 = new JLabel("Name: ");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_16.setBounds(56, 574, 296, 14);
		contentPane.add(lblNewLabel_16);
		lblNewLabel_16.setVisible(false);
		
		JLabel lblNewLabel_17 = new JLabel("Name Of The Plan 1:");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_17.setBounds(56, 609, 291, 14);
		contentPane.add(lblNewLabel_17);
		lblNewLabel_17.setVisible(false);
		
		JLabel lblNewLabel_18 = new JLabel("Name Of The Plan 2: ");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_18.setBounds(56, 644, 291, 14);
		contentPane.add(lblNewLabel_18);
		lblNewLabel_18.setVisible(false);
		
		JLabel lblNewLabel_19 = new JLabel("Name Of The Plan 3: ");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_19.setBounds(56, 677, 307, 14);
		contentPane.add(lblNewLabel_19);
		lblNewLabel_19.setVisible(false);
		
		JLabel lblNewLabel_20 = new JLabel("Subscribed Customer Information");
		lblNewLabel_20.setForeground(new Color(85, 107, 47));
		lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_20.setBounds(509, 490, 328, 14);
		contentPane.add(lblNewLabel_20);
		lblNewLabel_20.setVisible(false);
		
		JLabel lblNewLabel_21 = new JLabel("Citizenship Number: ");
		lblNewLabel_21.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_21.setBounds(450, 543, 326, 14);
		contentPane.add(lblNewLabel_21);
		lblNewLabel_21.setVisible(false);
		
		JLabel lblNewLabel_22 = new JLabel("Name: ");
		lblNewLabel_22.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_22.setBounds(450, 574, 326, 14);
		contentPane.add(lblNewLabel_22);
		lblNewLabel_22.setVisible(false);
		
		JLabel lblNewLabel_23 = new JLabel("Subscribed Plan Name: ");
		lblNewLabel_23.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_23.setBounds(450, 609, 345, 14);
		contentPane.add(lblNewLabel_23);
		lblNewLabel_23.setVisible(false);
		
		JLabel lblNewLabel_24 = new JLabel("Start Date Of Subscription: ");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_24.setBounds(450, 644, 345, 14);
		contentPane.add(lblNewLabel_24);
		lblNewLabel_24.setVisible(false);
		
		
		
		//DocumentListener used for choosing how many plans will service provider have
		textField_1.getDocument().addDocumentListener(new DocumentListener() {
			
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				int i;
				if (textField_1.getText().equals("")!=true) {
					 i=Integer.parseInt(textField_1.getText());
				}
				else {
					i=0;
				}
				if(i==1) {
					lblNewLabel_7.setVisible(true);
					textField_2.setVisible(true);
				}
				else if(i==2) {
					lblNewLabel_7.setVisible(true);
					textField_2.setVisible(true);
					lblNewLabel_8.setVisible(true);
					textField_3.setVisible(true);
					btnNewButton.setBounds(128, 310, 177, 23);
					lblNewLabel.setBounds(168, 340, 123, 14);
					
				}
				else if(i==3) {
					lblNewLabel_7.setVisible(true);
					textField_2.setVisible(true);
					lblNewLabel_8.setVisible(true);
					textField_3.setVisible(true);
					lblNewLabel_9.setVisible(true);
					textField_4.setVisible(true);
					btnNewButton.setBounds(128, 337, 177, 23);
					lblNewLabel.setBounds(168, 367, 123, 14);
					
				}
				
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		//Instead of typing GSM or Cable we can choose the service provider type via combobox
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem().equals("GSM")) {
					lblNewLabel_4.setText("GSM service provider : ");
					lblNewLabel_4.setVisible(true);
					textField.setVisible(true);
					lblNewLabel_5.setVisible(true);
					lblNewLabel_6.setVisible(true);
					textField_1.setVisible(true);
				}
				else if(comboBox.getSelectedItem().equals("Cable")) {
					lblNewLabel_4.setText("Cable service provider : ");
					lblNewLabel_4.setVisible(true);
					textField.setVisible(true);
					lblNewLabel_5.setVisible(true);
					lblNewLabel_6.setVisible(true);
					textField_1.setVisible(true);
				}
			}
		});
		//Operations setting when we click the buttons inside of GUI via addActionListener method 
		//We type all textfields and with getText method we take typed strings and create object of classes that informed about it in main class
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("") || textField_1.getText().equals("")) {
					Popup.popup("fail");
					return;
				}
				if(comboBox.getSelectedItem().equals("GSM")==true) {
					int  i=Integer.parseInt(textField_1.getText());
					serviceprovider=new GSMProvider(textField.getText());
					if(i==1) {
						subscriptionplans=new SubscriptionPlan[1];
						subscriptionplans[0]=new SubscriptionPlan(textField_2.getText(),serviceprovider);
						lblNewLabel_14.setVisible(true);
						lblNewLabel_15.setVisible(true);
						lblNewLabel_15.setText("Type: GSM");
						lblNewLabel_16.setVisible(true);
						lblNewLabel_16.setText("Name: "+textField_1.getText());
						lblNewLabel_17.setVisible(true);
						lblNewLabel_17.setText("Name Of The Plan 1: "+textField_2.getText());
						serviceprovider.addSubscriptionPlan(subscriptionplans[0]);
					}
					else if(i==2) {
						subscriptionplans=new SubscriptionPlan[2];
						subscriptionplans[0]=new SubscriptionPlan(textField_2.getText(),serviceprovider);
						subscriptionplans[1]=new SubscriptionPlan(textField_3.getText(),serviceprovider);
						lblNewLabel_14.setVisible(true);
						lblNewLabel_15.setVisible(true);
						lblNewLabel_15.setText("Type: GSM");
						lblNewLabel_16.setVisible(true);
						lblNewLabel_16.setText("Name: "+textField_1.getText());
						lblNewLabel_17.setVisible(true);
						lblNewLabel_17.setText("Name Of The Plan 1: "+textField_2.getText());
						lblNewLabel_18.setVisible(true);
						lblNewLabel_18.setText("Name Of The Plan 2: "+textField_3.getText());
						serviceprovider.addSubscriptionPlan(subscriptionplans[0]);
						serviceprovider.addSubscriptionPlan(subscriptionplans[1]);
					}
					else if(i==3) {
						subscriptionplans=new SubscriptionPlan[3];
						subscriptionplans[0]=new SubscriptionPlan(textField_2.getText(),serviceprovider);
						subscriptionplans[1]=new SubscriptionPlan(textField_3.getText(),serviceprovider);
						subscriptionplans[2]=new SubscriptionPlan(textField_3.getText(),serviceprovider);
						lblNewLabel_14.setVisible(true);
						lblNewLabel_15.setVisible(true);
						lblNewLabel_15.setText("Type: GSM");
						lblNewLabel_16.setVisible(true);
						lblNewLabel_16.setText("Name: "+textField_1.getText());
						lblNewLabel_17.setVisible(true);
						lblNewLabel_17.setText("Name Of The Plan 1: "+textField_2.getText());
						lblNewLabel_18.setVisible(true);
						lblNewLabel_18.setText("Name Of The Plan 2: "+textField_3.getText());
						lblNewLabel_19.setVisible(true);
						lblNewLabel_19.setText("Name Of The Plan 3: "+textField_4.getText());
						serviceprovider.addSubscriptionPlan(subscriptionplans[0]);
						serviceprovider.addSubscriptionPlan(subscriptionplans[1]);
						serviceprovider.addSubscriptionPlan(subscriptionplans[2]);
					}
					else {
						Popup.popup("fail1");
						return;
					}
				}
				if(comboBox.getSelectedItem().equals("Cable")==true) {
					int  i=Integer.parseInt(textField_1.getText());
					serviceprovider=new CableProvider(textField.getText());
					if(i==1) {
						subscriptionplans=new SubscriptionPlan[1];
						subscriptionplans[0]=new SubscriptionPlan(textField_2.getText(),serviceprovider);
						lblNewLabel_14.setVisible(true);
						lblNewLabel_15.setVisible(true);
						lblNewLabel_15.setText("Type: Cable");
						lblNewLabel_16.setVisible(true);
						lblNewLabel_16.setText("Name: "+textField_1.getText());
						lblNewLabel_17.setVisible(true);
						lblNewLabel_17.setText("Name Of The Plan 1: "+textField_2.getText());
						serviceprovider.addSubscriptionPlan(subscriptionplans[0]);
					}
					else if(i==2) {
						subscriptionplans=new SubscriptionPlan[2];
						subscriptionplans[0]=new SubscriptionPlan(textField_2.getText(),serviceprovider);
						subscriptionplans[1]=new SubscriptionPlan(textField_3.getText(),serviceprovider);
						lblNewLabel_14.setVisible(true);
						lblNewLabel_15.setVisible(true);
						lblNewLabel_15.setText("Type: Cable");
						lblNewLabel_16.setVisible(true);
						lblNewLabel_16.setText("Name: "+textField_1.getText());
						lblNewLabel_17.setVisible(true);
						lblNewLabel_17.setText("Name Of The Plan 1: "+textField_2.getText());
						lblNewLabel_18.setVisible(true);
						lblNewLabel_18.setText("Name Of The Plan 2: "+textField_3.getText());
						serviceprovider.addSubscriptionPlan(subscriptionplans[0]);
						serviceprovider.addSubscriptionPlan(subscriptionplans[1]);
					}
					else if(i==3) {
						subscriptionplans=new SubscriptionPlan[3];
						subscriptionplans[0]=new SubscriptionPlan(textField_2.getText(),serviceprovider);
						subscriptionplans[1]=new SubscriptionPlan(textField_3.getText(),serviceprovider);
						subscriptionplans[2]=new SubscriptionPlan(textField_3.getText(),serviceprovider);
						lblNewLabel_14.setVisible(true);
						lblNewLabel_15.setVisible(true);
						lblNewLabel_15.setText("Type: Cable");
						lblNewLabel_16.setVisible(true);
						lblNewLabel_16.setText("Name: "+serviceprovider.getName());
						lblNewLabel_17.setVisible(true);
						lblNewLabel_17.setText("Name Of The Plan 1: "+subscriptionplans[0].getName());
						lblNewLabel_18.setVisible(true);
						lblNewLabel_18.setText("Name Of The Plan 2: "+subscriptionplans[1].getName());
						lblNewLabel_19.setVisible(true);
						lblNewLabel_19.setText("Name Of The Plan 3: "+subscriptionplans[2].getName());
						serviceprovider.addSubscriptionPlan(subscriptionplans[0]);
						serviceprovider.addSubscriptionPlan(subscriptionplans[1]);
						serviceprovider.addSubscriptionPlan(subscriptionplans[2]);
					}
					else {
						Popup.popup("fail1");
						return;
					}
					
				}
				Popup.popup("success");
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				ExistingCustomer customer=new ExistingCustomer(textField_5.getText());
				customer.setName(textField_6.getText());
				if(textField_5.getText().equals("")||textField_6.getText().equals("")||textField_7.getText().equals("")) {
					Popup.popup("fail");
					return;
				}
				else if(serviceprovider.findSubscriptionPlan(textField_7.getText())==null) {
					Popup.popup("fail2");
					return;
				}
				else {
					SubscriptionPlan customerSubscription=serviceprovider.findSubscriptionPlan(textField_7.getText());
					date=new Date(textField_8.getText());
					Subscription subscription=new Subscription(date,customerSubscription);
					customer.setSubscription(subscription);
					lblNewLabel_20.setVisible(true);
					lblNewLabel_21.setText("Citizenship Number: "+customer.getCitizenshipNr());
					lblNewLabel_21.setVisible(true);
					lblNewLabel_22.setText("Customer Name: "+customer.getName());
					lblNewLabel_22.setVisible(true);
					lblNewLabel_23.setText("Subscribed Plan Name: "+customer.getSubscription().getSubscriptionPlan().getName());
					lblNewLabel_23.setVisible(true);
					lblNewLabel_24.setText("Subscription Start Date: "+(customer.getSubscription().getSubscriptionStartDate().getMonth()+1) +"/"+customer.getSubscription().getSubscriptionStartDate().getDate()+"/"+(customer.getSubscription().getSubscriptionStartDate().getYear()+1900));
					lblNewLabel_24.setVisible(true);
				}
				Popup.popup("success");
			}
		});
	}
}
