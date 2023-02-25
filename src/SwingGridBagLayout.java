import java.awt.*; 
import javax.swing.*;

class VentanaInicio1 extends JFrame{
	GridBagConstraints gbc= new GridBagConstraints();
	GridBagLayout gbl= new GridBagLayout();
	public VentanaInicio1() {
		getContentPane().setLayout(gbl);  
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(300,400);
		setTitle("Formulario");
		setVisible(true);
	
		//componentes graficos (CREAR -> CONGIGURAR -> AGREGAR )
				JTextArea area1 = new JTextArea("text area1");
				metodoMagico(area1,0,0,1,3,GridBagConstraints.VERTICAL);
				
				JButton btn1= new JButton("boton 1");
				metodoMagico(btn1,1,0,2,1,GridBagConstraints.HORIZONTAL);
				
		System.gc();
	}//constructor
	public void metodoMagico(Component c,int x, int y, int w, int h, int f) {
		gbc.gridx=x;
		gbc.gridy=y;
		gbc.gridwidth=w;
		gbc.gridheight=h;
		gbc.fill=f;
		gbl.setConstraints(c, gbc);
		add(c);
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
