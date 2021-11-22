package swingExample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class Component1 {

	private JFrame frame;
	private JTextField fn;
	private JTextField rn;
	private JPasswordField pass;
	private JRadioButton rb1,rb2,rb3;
	private JCheckBox cb1,cb2,cb3;
	DefaultTableModel model;
	private JTable table_1;
	private JScrollPane liv;
	private JTextField mn;
	private JTextField ln;
	private JTextField mno;
	private JTextField eid;
	private JLabel lblName;
	private JLabel lblNewLabel_1;
	private JLabel image2;
	private JLabel image2_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Component1 window = new Component1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Component1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(169, 169, 169));
		frame.setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 1195, 784);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sign Up");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 33));
		lblNewLabel.setBounds(337, 68, 754, 60);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel fname = new JLabel("First Name:");
		fname.setFont(new Font("Tahoma", Font.BOLD, 16));
		fname.setBounds(58, 137, 122, 36);
		frame.getContentPane().add(fname);
		
		JLabel rollno = new JLabel("Roll No.:");
		rollno.setFont(new Font("Tahoma", Font.BOLD, 16));
		rollno.setBounds(58, 323, 122, 36);
		frame.getContentPane().add(rollno);
		
		JLabel password = new JLabel("Password:");
		password.setFont(new Font("Tahoma", Font.BOLD, 16));
		password.setBounds(58, 370, 122, 36);
		frame.getContentPane().add(password);
		
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Thank you, your form has been submitted.");
				
				String first=fn.getText();
				String middle=mn.getText();
				String last=ln.getText();
				String roll=rn.getText();
				String password=pass.getText();
				String mobile=mno.getText();
				String email=eid.getText();
				//String gen=
				
			}
		});
		submit.setFont(new Font("Tahoma", Font.BOLD, 18));
		submit.setBounds(559, 653, 124, 36);
		frame.getContentPane().add(submit);
		
		fn = new JTextField();
		fn.setBounds(190, 139, 216, 36);
		frame.getContentPane().add(fn);
		fn.setColumns(10);
		
		rn = new JTextField();
		rn.setBounds(190, 325, 216, 36);
		frame.getContentPane().add(rn);
		rn.setColumns(10);
		
		pass = new JPasswordField();
		pass.setBounds(190, 372, 216, 34);
		frame.getContentPane().add(pass);
		mn = new JTextField();
		mn.setColumns(10);
		mn.setBounds(190, 184, 216, 36);
		frame.getContentPane().add(mn);
		
		ln = new JTextField();
		ln.setColumns(10);
		ln.setBounds(190, 231, 216, 36);
		frame.getContentPane().add(ln);
		
		JLabel mname = new JLabel("Middle Name:");
		mname.setFont(new Font("Tahoma", Font.BOLD, 16));
		mname.setBounds(58, 182, 122, 36);
		frame.getContentPane().add(mname);
		
		JLabel lname = new JLabel("Last Name:");
		lname.setFont(new Font("Tahoma", Font.BOLD, 16));
		lname.setBounds(58, 229, 122, 36);
		frame.getContentPane().add(lname);
		
		JTextArea fullname = new JTextArea();
		fullname.setEditable(false);
		fullname.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				fullname.setText(fn.getText()+" "+mn.getText()+" "+ln.getText());
			}
		});
		fullname.setBounds(189, 278, 217, 36);
		frame.getContentPane().add(fullname);
		
		JLabel mobile = new JLabel("Mobile No.:");
		mobile.setFont(new Font("Tahoma", Font.BOLD, 16));
		mobile.setBounds(58, 417, 122, 36);
		frame.getContentPane().add(mobile);
		
		JLabel email = new JLabel("Email ID:");
		email.setFont(new Font("Tahoma", Font.BOLD, 16));
		email.setBounds(58, 462, 122, 36);
		frame.getContentPane().add(email);
		
		
		
		JLabel gender = new JLabel("Gender:");
		gender.setFont(new Font("Tahoma", Font.BOLD, 16));
		gender.setBounds(58, 502, 122, 36);
		frame.getContentPane().add(gender);
		
		rb1 = new JRadioButton("Male");
		rb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rb1.isSelected())
				{
					rb2.setSelected(false);
					rb3.setSelected(false);
				}
			}
		});
		rb1.setFont(new Font("Tahoma", Font.BOLD, 16));
		rb1.setBounds(165, 509, 90, 23);
		frame.getContentPane().add(rb1);
		
		rb2 = new JRadioButton("Female");
		rb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rb2.isSelected())
				{
					rb1.setSelected(false);
					rb3.setSelected(false);
				}
			}
		});
		rb2.setFont(new Font("Tahoma", Font.BOLD, 16));
		rb2.setBounds(257, 509, 90, 23);
		frame.getContentPane().add(rb2);
		
		cb1 = new JCheckBox("B.Tech");
		cb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cb1.isSelected())
				{
					cb2.setSelected(false);
					cb3.setSelected(false);
					
				}
			}
		});
		cb1.setFont(new Font("Tahoma", Font.BOLD, 16));
		cb1.setBounds(165, 539, 90, 23);
		frame.getContentPane().add(cb1);
		
		cb2 = new JCheckBox("M.Tech");
		cb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cb2.isSelected())
				{
					cb1.setSelected(false);
					cb3.setSelected(false);
				}
				
			}
		});
		cb2.setFont(new Font("Tahoma", Font.BOLD, 16));
		cb2.setBounds(257, 539, 90, 23);
		frame.getContentPane().add(cb2);
		
		cb3 = new JCheckBox("Phd");
		cb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cb3.isSelected())
				{
					cb1.setSelected(false);
					cb2.setSelected(false);
					
				}
				
			}
		});
		cb3.setFont(new Font("Tahoma", Font.BOLD, 16));
		cb3.setBounds(349, 539, 90, 23);
		frame.getContentPane().add(cb3);
		
		
		rb3 = new JRadioButton("Others");
		rb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rb3.isSelected())
				{
					rb2.setSelected(false);
					rb1.setSelected(false);
				}
			}
		});
		rb3.setFont(new Font("Tahoma", Font.BOLD, 16));
		rb3.setBounds(349, 509, 90, 23);
		frame.getContentPane().add(rb3);
		
		JLabel course = new JLabel("Course:");
		course.setFont(new Font("Tahoma", Font.BOLD, 16));
		course.setBounds(58, 534, 97, 32);
		frame.getContentPane().add(course);
		
		
		
		
		liv = new JScrollPane();
		liv.setEnabled(false);
		liv.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		liv.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		liv.setBounds(445, 133, 726, 386);
		frame.getContentPane().add(liv);
		
		table_1 = new JTable();
		
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i= table_1.getSelectedRow();
				fn.setText(model.getValueAt(i,0).toString());
				mn.setText(model.getValueAt(i,1).toString());
				ln.setText(model.getValueAt(i,2).toString());
				fullname.setText(fn.getText()+" "+mn.getText()+" "+ln.getText());
				rn.setText(model.getValueAt(i,3).toString());
				pass.setText(model.getValueAt(i,4).toString());
				String sex=model.getValueAt(i,5).toString();
				if(sex.equals("Male"))
				{
					rb1.setSelected(true);
					rb2.setSelected(false);
					rb3.setSelected(false);
				}
				else if(sex.equals("Female"))
						{
					       rb2.setSelected(true);
					       rb1.setSelected(false);
					       rb3.setSelected(false);
						}
				else if(sex.equals("Others"))
				{
					rb1.setSelected(false);
					rb2.setSelected(false);
					
					rb3.setSelected(true);
				}
				String course=model.getValueAt(i,6).toString();
				if(course.equals("B.Tech"))
				{
					cb1.setSelected(true);
					cb2.setSelected(false);
					cb3.setSelected(false);
					
				}
				else if(course.equals("M.Tech"))
				{
					cb2.setSelected(true);
					cb1.setSelected(false);
					cb3.setSelected(false);
				}
				else if(course.equals("Phd"))
				{
					cb2.setSelected(false);
					cb1.setSelected(false);
					cb3.setSelected(true);
				}
				mno.setText(model.getValueAt(i,7).toString());
				eid.setText(model.getValueAt(i,8).toString());
				
				
				
				
				
				
				
			}
		});
		model=new DefaultTableModel();
		Object[] column= {"Fname","Mname","Lname","Roll No.","Password","Gender","Course","Mobile No.","Email ID"};
		Object[] row=new Object[11];
		model.setColumnIdentifiers(column);
		table_1.setModel(model);
		liv.setViewportView(table_1);
		table_1.setBackground(Color.GRAY);
		
		
		
		JButton update = new JButton("Update");
		update.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				//cb1.getStateChange()==0;
			}
		});
//		update.addChangeListener(new ChangeListener() {
//			public void itemStateChanged(ChangeEvent e) {
//				
//				 cb1.isSelected( (e.getStateChange()==1?true:false));
//			              
//				
//				
//			}
//		});
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i= table_1.getSelectedRow();
				if(i>=0)
				{
					if(fn.getText().equals("")||(mn.getText().equals("")&&ln.getText().equals(""))|| rn.getText().equals("")||
							pass.getText().equals("")||mno.getText().equals("")||eid.getText().equals(""))
					{
						JOptionPane.showMessageDialog(null,"Please select row from above the table once again and fill all the informations");
					}
									
					else
					{
						model.setValueAt(fn.getText(),i,0);
						model.setValueAt(mn.getText(),i,1);
						model.setValueAt(ln.getText(),i,2);
						model.setValueAt(rn.getText(),i,3);
						model.setValueAt(pass.getText(),i,4);
					
						if(rb1.getModel().isSelected())
						{
							model.setValueAt(rb1.getText(),i,5);
						}
						else if(rb2.getModel().isSelected())
						{
							model.setValueAt(rb2.getText(),i,5);
						}
						else if(rb3.getModel().isSelected())
						{
							model.setValueAt(rb3.getText(),i,5);
							
						}
						
						if(cb1.getModel().isSelected())
						{
							model.setValueAt(cb1.getText(),i,6);
						}
						else if(cb2.getModel().isSelected())
						{
							model.setValueAt(cb2.getText(),i,6);
							
						}
						else if(cb3.getModel().isSelected())
						{
							model.setValueAt(cb3.getText(),i,6);
							
						}
						model.setValueAt(mno.getText(),i,7);
						model.setValueAt(eid.getText(),i,8);
						
						
						
						JOptionPane.showMessageDialog(null,"Updated successfully.");
					}
					
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Pease select row from the Table.");
				}
				
			}
			
		});
		update.setFont(new Font("Tahoma", Font.BOLD, 16));
		update.setBounds(676, 576, 99, 36);
		frame.getContentPane().add(update);
		
		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fn.setText("");
				mn.setText("");
				ln.setText("");
				rn.setText("");
				fullname.setText("");
				pass.setText("");
				cb1.setSelected(false);
				cb2.setSelected(false);
				cb3.setSelected(false);
				rb1.setSelected(false);
				rb2.setSelected(false);
				rb3.setSelected(false);
				mno.setText("");
				eid.setText("");
				
		
			}
		});
		
		 
		clear.setFont(new Font("Tahoma", Font.BOLD, 16));
		clear.setBounds(785, 576, 99, 36);
		frame.getContentPane().add(clear);
		
		JButton add = new JButton("Add");
		add.setFont(new Font("Tahoma", Font.BOLD, 16));
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(fn.getText().equals("")||(mn.getText().equals("")&&ln.getText().equals(""))|| rn.getText().equals("")||
						pass.getText().equals("")||mno.getText().equals("")||eid.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Please fill all the informations");
				}
				else
				{
					row[0]=(fn.getText());
					row[1]=(mn.getText());
					row[2]=(ln.getText());
					
					row[3]=rn.getText();
					row[4]=pass.getText();
					if(rb1.getModel().isSelected())
					{
						row[5]=rb1.getText();
					}
					else if(rb2.getModel().isSelected())
					{
						row[5]=rb2.getText();
					}
					else if(rb3.getModel().isSelected())
					{
						row[5]=rb3.getText();
					}
					if(cb1.getModel().isSelected())
					{
						row[6]=cb1.getText();
					}
					else if(cb2.getModel().isSelected())
					{
						row[6]=cb2.getText();
					}
					else if(cb3.getModel().isSelected())
					{
						row[6]=cb3.getText();
					}
					
					
					row[7]=mno.getText();
					row[8]=eid.getText();
					model.addRow(row);
					
					fn.setText("");
					mn.setText("");
					ln.setText("");
					fullname.setText("");
					rn.setText("");
					pass.setText("");
					cb1.setSelected(false);
					cb2.setSelected(false);
					cb3.setSelected(false);
					rb1.setSelected(false);
					rb2.setSelected(false);
					rb3.setSelected(false);
					mno.setText("");
					eid.setText("");
					
					
					
					JOptionPane.showMessageDialog(null,"Saved successfully.");
				}
				
				
			}
		});
		add.setBounds(676, 534, 99, 36);
		frame.getContentPane().add(add);
		
		JButton delete = new JButton("Delete");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=table_1.getSelectedRow();
				if(i>=0)
				{
					model.removeRow(i);
					JOptionPane.showMessageDialog(null,"Deleted successfully.");
					fn.setText("");
					mn.setText("");
					ln.setText("");
					fullname.setText("");
					rn.setText("");
					pass.setText("");
					cb1.setSelected(false);
					cb2.setSelected(false);
					cb3.setSelected(false);
					rb1.setSelected(false);
					rb2.setSelected(false);
					rb3.setSelected(false);
					mno.setText("");
					eid.setText("");
					
					
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Please select row from the table.");
				}
				
			}
		});
		delete.setFont(new Font("Tahoma", Font.BOLD, 16));
		delete.setBounds(785, 534, 99, 36);
		frame.getContentPane().add(delete);
		
		mno = new JTextField();
		mno.setColumns(10);
		mno.setBounds(190, 417, 216, 36);
		frame.getContentPane().add(mno);
		
		eid = new JTextField();
		eid.setColumns(10);
		eid.setBounds(190, 464, 216, 36);
		frame.getContentPane().add(eid);
		
		lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblName.setBounds(58, 276, 122, 36);
		frame.getContentPane().add(lblName);
		
		lblNewLabel_1 = new JLabel("NIT Jalandhar ");
		lblNewLabel_1.setForeground(new Color(220, 20, 60));
		lblNewLabel_1.setBackground(new Color(176, 196, 222));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 37));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(337, -1, 754, 81);
		frame.getContentPane().add(lblNewLabel_1);
		
		image2 = new JLabel("");
		image2.setHorizontalAlignment(SwingConstants.CENTER);
		image2.setIcon(new ImageIcon(Component1.class.getResource("/Image/index-2.jpg")));
		
		image2.setBounds(148, -1, 276, 123);
		frame.getContentPane().add(image2);
		
		image2_1 = new JLabel("");
		image2_1.setVerticalAlignment(SwingConstants.TOP);
		image2_1.setIcon(new ImageIcon(Component1.class.getResource("/Image/nitjlogo.jpg")));
		image2_1.setHorizontalAlignment(SwingConstants.CENTER);
		image2_1.setBounds(1009, 5, 141, 123);
		frame.getContentPane().add(image2_1);

	}
}
