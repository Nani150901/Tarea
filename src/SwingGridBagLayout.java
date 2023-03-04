import java.awt.*; 
import javax.swing.*;

class VentanaInicio1 extends JFrame{
	GridBagLayout gbl1 = new GridBagLayout(), gbl2 = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	JPanel panel1;
	public VentanaInicio1() {
		getContentPane().setLayout(gbl1);  
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(300,400);
		setTitle("Formulario");
		setVisible(true);
	
		//componentes graficos (CREAR -> CONGIGURAR -> AGREGAR )
		JLabel lbl1 = new JLabel("The Classic Form includes all visible fields for");
		metodoCoordenada(0, 0, 2, 1, GridBagConstraints.HORIZONTAL);
		metodoAdd1(lbl1, 1);
		
		JLabel lbl2 = new JLabel("this list");
		metodoCoordenada(0, 1, 2, 1, GridBagConstraints.HORIZONTAL);
		metodoAdd1(lbl2, 1);

		
		JLabel lbl01 = new JLabel(" ");
		metodoCoordenada(0, 2, 2, 1, GridBagConstraints.HORIZONTAL);
		metodoAdd1(lbl01, 1);
		
		JLabel lbl3 = new JLabel("Form options");
		lbl3.setFont(new Font("Arial", Font.BOLD, 16));
		metodoCoordenada(0, 4, 2, 1, GridBagConstraints.HORIZONTAL);
		metodoAdd1(lbl3, 1);
		
		JLabel lbl4 = new JLabel("Include the following:");
		metodoCoordenada(0, 5, 2, 1, GridBagConstraints.HORIZONTAL);
		metodoAdd1(lbl4, 1);
		
		JCheckBox check1 = new JCheckBox("a title for you form");
		metodoCoordenada(0, 6, 2, 1, GridBagConstraints.HORIZONTAL);
		metodoAdd1(check1, 1);
		
		JTextField caja1 = new JTextField();
		metodoCoordenada(0, 7, 2, 1, GridBagConstraints.HORIZONTAL);
		metodoAdd1(caja1, 1);
		
		JLabel lbl02 = new JLabel(" ");
		metodoCoordenada(0, 8, 2, 1, GridBagConstraints.HORIZONTAL);
		metodoAdd1(lbl02, 1);
		
		ButtonGroup btng = new ButtonGroup();
		JRadioButton radio1 = new JRadioButton("only required fields");
		btng.add(radio1);
		metodoCoordenada(0, 9, 2, 1, GridBagConstraints.HORIZONTAL);
		metodoAdd1(radio1, 1);
		JRadioButton radio2 = new JRadioButton("all fields");
		btng.add(radio2);
		metodoCoordenada(0, 10, 2, 1, GridBagConstraints.HORIZONTAL);
		metodoAdd1(radio2, 1);
		
		JLabel lbl5 = new JLabel("   (edit required fields in the form builder)");
		metodoCoordenada(0, 11, 2, 1, GridBagConstraints.HORIZONTAL);
		metodoAdd1(lbl5, 1);
		
		JLabel lbl03 = new JLabel(" ");
		metodoCoordenada(0, 12, 2, 1, GridBagConstraints.HORIZONTAL);
		metodoAdd1(lbl03, 1);
		
		JCheckBox check2 = new JCheckBox("interest group fields");
		metodoCoordenada(0, 13, 2, 1, GridBagConstraints.HORIZONTAL);
		metodoAdd1(check2, 1);
		
		JCheckBox check3 = new JCheckBox("required field indicators");
		metodoCoordenada(0, 14, 2, 1, GridBagConstraints.HORIZONTAL);
		metodoAdd1(check3, 1);
		
		JLabel lbl04 = new JLabel(" ");
		metodoCoordenada(0, 15, 2, 1, GridBagConstraints.HORIZONTAL);
		metodoAdd1(lbl04, 1);
		
		JLabel lbl6 = new JLabel("Set form width");
		metodoCoordenada(0, 16, 2, 1, GridBagConstraints.HORIZONTAL);
		metodoAdd1(lbl6, 1);
		
		JTextField caja2 = new JTextField();
		metodoCoordenada(0, 17, 2, 1, GridBagConstraints.HORIZONTAL);
		metodoAdd1(caja2, 1);
		
		JLabel lbl05 = new JLabel(" ");
		metodoCoordenada(0, 18, 2, 1, GridBagConstraints.HORIZONTAL);
		metodoAdd1(lbl05, 1);
		
		JLabel lbl7 = new JLabel("Enhance your form");
		metodoCoordenada(0, 19, 2, 1, GridBagConstraints.HORIZONTAL);
		metodoAdd1(lbl7, 1);
		
		JCheckBox check4 = new JCheckBox("eneable evil popup mode");
		metodoCoordenada(0, 20, 2, 1, GridBagConstraints.HORIZONTAL);
		metodoAdd1(check4, 1);
		
		JCheckBox check5 = new JCheckBox("disable all JavaScript (i)Info");
		metodoCoordenada(0, 21, 2, 1, GridBagConstraints.HORIZONTAL);
		metodoAdd1(check5, 1);
		
		JCheckBox check6 = new JCheckBox("include archive link (i)Info");
		metodoCoordenada(0, 22, 2, 1, GridBagConstraints.HORIZONTAL);
		metodoAdd1(check6, 1);
		
		JCheckBox check7 = new JCheckBox("include MonkeyRewards link");
		metodoCoordenada(0, 23, 2, 1, GridBagConstraints.HORIZONTAL);
		metodoAdd1(check7, 1);
				
		JLabel lbl8 = new JLabel("         ");
		metodoCoordenada(2, 0, 1, 1, GridBagConstraints.HORIZONTAL);
		metodoAdd1(lbl8, 1);
		
		JLabel lbl9 = new JLabel("Preview");
		lbl9.setFont(new Font("Arial", Font.BOLD, 16));
		metodoCoordenada(3, 0, 4, 1, GridBagConstraints.HORIZONTAL);
		metodoAdd1(lbl9, 1);
		
		panel1 = new JPanel();
		panel1.setLayout(gbl2);
		panel1.setBackground(new Color(200, 200, 200));
		metodoCoordenada(3, 1, 4, 9, GridBagConstraints.BOTH);
		gbc.fill = GridBagConstraints.VERTICAL;
		metodoAdd1(panel1, 1);
		

		JLabel lbl06 = new JLabel("                                                                                                                                    ");
		metodoCoordenada(0, 0, 4, 1, GridBagConstraints.HORIZONTAL);
		metodoAdd1(lbl06, 2);
		
		JLabel lbl10 = new JLabel("Email Address");
		metodoCoordenada(0, 1, 4, 1, GridBagConstraints.HORIZONTAL);
		metodoAdd1(lbl10, 2);
		
		JTextField caja3 = new JTextField();
		metodoCoordenada(0, 2, 4, 1, GridBagConstraints.HORIZONTAL);
		metodoAdd1(caja3, 2);
		
		JLabel lbl11 = new JLabel("First Name");
		metodoCoordenada(0, 3, 4, 1, GridBagConstraints.HORIZONTAL);
		metodoAdd1(lbl11, 2);
		
		JTextField caja4 = new JTextField();
		metodoCoordenada(0, 4, 4, 1, GridBagConstraints.HORIZONTAL);
		metodoAdd1(caja4, 2);
		
		JLabel lbl12 = new JLabel("Last Name");
		metodoCoordenada(0, 5, 4, 1, GridBagConstraints.HORIZONTAL);
		metodoAdd1(lbl12, 2);
		
		JTextField caja5 = new JTextField();
		metodoCoordenada(0, 6, 4, 1, GridBagConstraints.HORIZONTAL);
		metodoAdd1(caja5, 2);
		
		JButton btn1 = new JButton("Suscribe");
		metodoCoordenada(0, 7, 4, 1, 0);
		gbc.anchor = GridBagConstraints.WEST;
		metodoAdd1(btn1, 2);
		
		JLabel lbl07 = new JLabel(" ");
		metodoCoordenada(0, 8, 4, 1, GridBagConstraints.HORIZONTAL);
		metodoAdd1(lbl07, 2);
		
		JLabel lbl08 = new JLabel(" ");
		metodoCoordenada(0, 10, 4, 1, GridBagConstraints.HORIZONTAL);
		metodoAdd1(lbl08, 1);
		
		JLabel lbl13 = new JLabel("Copy/paste onto your site");
		metodoCoordenada(3, 11, 4, 1, GridBagConstraints.HORIZONTAL);
		metodoAdd1(lbl13, 1);
		
		JTextArea a1 = new JTextArea();
		metodoCoordenada(3, 12, 4, 8, GridBagConstraints.BOTH);
		a1.setText("enter the text....");
		a1.setLineWrap(true);
		a1.setWrapStyleWord(true);
		metodoAdd1(a1, 1);
		
		pack();
				
		System.gc();
	}//constructor
	
	public void metodoCoordenada(int x, int y, int w, int h, int f) {
		gbc.gridx=x;
		gbc.gridy=y;
		gbc.gridwidth=w;
		gbc.gridheight=h;
		gbc.fill=f;
	}
	public void metodoAdd1(Component c, int r) {
		if(r == 1) {
			gbl1.setConstraints(c, gbc);	
			add(c);
		}
		else if(r == 2) {
			gbl2.setConstraints(c, gbc);
			panel1.add(c);	
		}
	}
}//class ventana inicio

public class SwingGridBagLayout {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaInicio1();
			}
		});
	}

}
