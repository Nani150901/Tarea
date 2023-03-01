import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class VentanaInicioCalculadora extends JFrame implements ActionListener{
	GridBagConstraints gbc= new GridBagConstraints();
	GridBagLayout gbl= new GridBagLayout();
	JButton btnSuma,btnResta,btnMulti,btnDivicion,btnIgual;
	JTextField resultado;
	public  VentanaInicioCalculadora() {
		getContentPane().setLayout(gbl);  
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(300,400);
		setTitle("Calculadora");
		//componentes graficos (CREAR -> CONGIGURAR -> AGREGAR )
		resultado = new JTextField(" ");
		metodoMagico(resultado,0,0,4,1,GridBagConstraints.HORIZONTAL);
		
		btnSuma= new JButton("+");
		metodoMagico(btnSuma,0,1,1,1,GridBagConstraints.HORIZONTAL);
		btnSuma.addActionListener(this);//paso 2
		
		 btnResta= new JButton("-");
		metodoMagico(btnResta,1,1,1,1,GridBagConstraints.HORIZONTAL);
		btnResta.addActionListener(this);//paso 2
		
		 btnMulti= new JButton("*");
		metodoMagico(btnMulti,2,1,1,1,GridBagConstraints.HORIZONTAL);
		btnMulti.addActionListener(this);//paso 2
		
		 btnDivicion= new JButton("/");
		metodoMagico(btnDivicion,3,1,1,1,GridBagConstraints.HORIZONTAL);
		btnDivicion.addActionListener(this);//paso 2
		

		setVisible(true);
		pack();
				setLocationRelativeTo(null);
	}
	public void metodoMagico(Component c,int x, int y, int w, int h, int f) {
		gbc.gridx=x;
		gbc.gridy=y;
		gbc.gridwidth=w;
		gbc.gridheight=h;
		gbc.fill=f;
		gbl.setConstraints(c, gbc);
		add(c);
	}
	@Override
		public void actionPerformed(ActionEvent e) {
		String operacion = resultado.getText();
		 if (e.getSource()==btnSuma) {
			 resultado.setText(operacion+"+");
		      }
		      if (e.getSource()==btnResta) {
		    	  resultado.setText(operacion+"-");
		      }
		      if (e.getSource()==btnMulti) {
		    	  resultado.setText(operacion+"*");
		      }
		      if (e.getSource()==btnDivicion) {
		    	  resultado.setText(operacion+"/");
		      }
		      if (e.getSource()==btnIgual) {
		    	  resultado.setText(operacion+"=");
		      }
		}
	
}
public class InterfazCalculadora {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaInicioCalculadora();
			}
		});
	}

}
