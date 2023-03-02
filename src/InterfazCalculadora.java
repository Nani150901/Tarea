import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import javax.swing.*;
import javax.swing.border.LineBorder;
import static java.awt.Font.PLAIN;

class VentanaInicioCalculadora extends JFrame implements ActionListener{
	GridBagConstraints gbc= new GridBagConstraints();
	GridBagLayout gbl= new GridBagLayout();
    JLabel txtResultado;
    int totalBtn=18;
    JButton botones[] = new JButton[totalBtn];
    String textoBotones[] = {"RESULTADO","7","8","9","/","4","5","6","*","1","2","3","-","ce","0",".","+","c"};
    int numerosBotones[] = {14, 9, 10, 11, 5, 6, 7, 1, 2, 3};
	 boolean nuevoNumero = true;
	 boolean puntoDecimal = false;
	 double operando1 = 0;
	    double operando2 = 0;
	    double resultado = 0;
	    
    String operacion = "";
    
	public  VentanaInicioCalculadora() {
		getContentPane().setLayout(gbl); 
        setTitle("Calculadora"); //Título del JFrame
        setSize(300,400); //Dimensiones del JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar proceso al cerrar ventana
        getContentPane().setBackground(Color.BLACK); //Color de fondo
        setVisible(true); //Mostrar JFrame
        
        pantalla();
        btnNum();
        eventosOperaciones();
        botones[13].addActionListener(this);
        botones[17].addActionListener(this);
        
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
	}
	public void pantalla() {
		txtResultado = new JLabel("0"); //Inicio JLabel
		metodoMagico(txtResultado,0,0,4,1);
        txtResultado.setOpaque(true); //Para poder darle un color de fondo
        txtResultado.setBackground(Color.WHITE); //Color de fondo
        txtResultado.setForeground(Color.BLUE); //Color de fuente
        txtResultado.setBorder(new LineBorder(Color.DARK_GRAY)); //Borde
        txtResultado.setFont(new Font("MONOSPACED", PLAIN, 30)); //Fuente
        txtResultado.setHorizontalAlignment(SwingConstants.RIGHT); //Alineamiento horizontal derecha
        add(txtResultado); //Añado el JLabel al JFrame
	}
	public void estiloBtn(JButton c) {
		c.setFont(new Font("MONOSPACED",PLAIN,30));
		c.setOpaque(true); //Para poder darle un color de fondo
        c.setBackground(Color.DARK_GRAY); //Color de fondo
        c.setForeground(Color.WHITE); //Color de fuente
        c.setBorder(new LineBorder(Color.BLUE)); //Borde
        add(c);
	}
	public void metodoMagico(Component c,int x, int y, int w, int h) {
		gbc.gridx=x;
		gbc.gridy=y;
		gbc.gridwidth=w;
		gbc.gridheight=h;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbl.setConstraints(c, gbc);
	}
	public void btnNum() {
		   int yBotones[] = {1,   2,  2,  2,  2,  3,  3,  3,  3,  4,  4,  4,  4,  5,  5,  5,  5, 1};
		   int xBotones[] = {0,   0,  1,  2,  3,  0,  1,  2,  3,  0,  1,  2,  3,  0,  1,  2,  3, 3};
		 int anchoBoton[] = {3,   1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 1};
		  int altoBoton[] = {1,   1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 1};
		
		for (int i = 0; i < totalBtn; i++){
			 botones[i] = new JButton(textoBotones[i]);
			 metodoMagico(botones[i],xBotones[i],yBotones[i],anchoBoton[i],altoBoton[i]);
			 estiloBtn(botones[i]);
			}
		eventosNumeros();
		eventoDecimal();
        }
	 private void eventosNumeros() {
	        for (int i = 0; i < 10; i++){
	            int numBoton = numerosBotones[i];
	            botones[numBoton].addActionListener(new ActionListener(){
	                @Override
	                public void actionPerformed(ActionEvent e) {
	                    if (nuevoNumero){
	                        if (!textoBotones[numBoton].equals("0")){
	                            txtResultado.setText(textoBotones[numBoton]);
	                            nuevoNumero = false; //Ya no es un nuevo número
	                        }
	                    }
	                    else{
	                    	txtResultado.setText(txtResultado.getText() + textoBotones[numBoton]);
	                    }
	                }
	            });
	        }
	    }
	 private void eventoDecimal(){

	        botones[15].addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                if (!puntoDecimal){
	                	txtResultado.setText(txtResultado.getText() + textoBotones[15]);
	                    puntoDecimal = true; 
	                    nuevoNumero = false;
	                } else if(puntoDecimal = true) {
	                	JOptionPane.showMessageDialog(null, "ya ingresaste un punto decimal");
	                }
	            }
	        });

	    }
	 
	 private void eventosOperaciones() {
		 int[]  operacionesBotones = {16, 12, 8, 4, 0};
	        for (int numBoton : operacionesBotones) { 
	            botones[numBoton].addActionListener(new ActionListener() {
	                @Override
	                public void actionPerformed(ActionEvent e) {
	                    //Si no tenía ninguna operación pendiente de realizar
	                    if (operacion.equals("")) {
	                        //Asocio la operación del botón a la variable
	                        operacion = textoBotones[numBoton];
	                        //Asigno a operando2 el valor del display (como double)
	                        operando2 = Double.parseDouble(txtResultado.getText());
	                        //Reseteo para poder introducir otro número y otro decimal
	                        nuevoNumero = true;
	                        puntoDecimal = false;
	                    //Si tenía alguna pendiente, calculo el resultado de la anterior y luego me guardo la actual
	                    } else {
	                        operando2 = resultado(); //Se almacena en operando2 para poder encadenar operaciones posteriores
	                        operacion = textoBotones[numBoton];
	                    }
	                    //SOUT para comprobar que estoy guardando los valores adecuados
	                    System.out.println(operando2 + " " + operacion + " " + operando1);

	                }
	            });
	        }
	    }
	 private double resultado(){
	        operando1 = Double.parseDouble(txtResultado.getText());
	        switch (operacion){

	            case "+" :  resultado = operando2 + operando1;
	                break;
	            case "-" :  resultado = operando2 - operando1;
	                break;
	            case "*" :  resultado = operando2 * operando1;
	                break;
	            case "/" :  resultado = operando2 / operando1;
	                break;
	            case "resultado":
	            	txtResultado.setText(""+resultado);
	            	break;
	        }
	        //Formateo y muestro en el resultado
	        Locale localeActual = Locale.GERMAN;
	        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(localeActual);
	        simbolos.setDecimalSeparator('.');
	        DecimalFormat formatoResultado = new DecimalFormat("#.######", simbolos);
	        txtResultado.setText(String.valueOf(formatoResultado.format(resultado)));

	        limpiar();
	        return resultado;

	    }
	 private void limpiar(){
	        operando1 = operando2 = 0;
	        operacion = "";
	        nuevoNumero = true;
	        puntoDecimal = false;
	    }
	@Override
	public void actionPerformed(ActionEvent e) {
		Component c=(Component) e.getSource();
		if(c== botones[13]) {
			txtResultado.setText("0");
			limpiar();
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
