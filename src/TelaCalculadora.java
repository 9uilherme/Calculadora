import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaCalculadora extends javax.swing.JFrame {

	private static final long serialVersionUID = 1066723182631333473L;
	 private JButton numero1;
	    private JButton numero2; 
	    private JButton numero3;
	    private JButton numero4;	 
	    private JButton numero5;
	    private JButton numero6;	 
	    private JButton numero7;
	    private JButton numero8;	 
	    private JButton numero9;
	    private JButton numero0;
	    private JButton pt;
	    private JButton subtrair;
	    private JButton dividir;
	    private JButton multiplicar;
	    private JButton somar;
	    private JButton igual;
	    private JButton clear;
	    
	    private JTextField display;
	    
	    private int leitura;
	    private int memoria;
	    private char operacao;

	    public TelaCalculadora() {
	        this.setTitle("Exemplo Botão Somar");
	        this.setBounds(0, 0, 500, 600);
	        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	        this.getContentPane().setLayout(null);

	        leitura = 0;
	        memoria = 0;

	        somar = new JButton();
	        somar.setText("+");
	        somar.setBounds(205, 70, 45, 45);
	        this.add(somar);

	        subtrair = new JButton();
	        subtrair.setText("-");
	        subtrair.setBounds(205, 130, 45, 45);
	        this.add(subtrair);

	        multiplicar = new JButton();
	        multiplicar.setText("x");
	        multiplicar.setBounds(205, 190, 45, 45);
	        this.add(multiplicar);
	        
	        dividir = new JButton();
	        dividir.setText("/");
	        dividir.setBounds(205, 250, 45, 45);
	        this.add(dividir);
	        
	        somar = new JButton();
	        somar.setText("+");
	        somar.setBounds(205, 70, 45, 45);
	        this.add(somar);

	        
	        somar = new JButton();
	        somar.setText("+");
	        somar.setBounds(205, 70, 45, 45);
	        this.add(somar);


	        numero7 = new JButton();
	        numero7.setText("7");
	        numero7.setBounds(25, 70, 45, 45);
	        this.add(numero7);

	        numero4 = new JButton();
	        numero4.setText("4");
	        numero4.setBounds(25, 130, 45, 45);
	        this.add(numero4);

	        numero1 = new JButton();
	        numero1.setText("1");
	        numero1.setBounds(25, 190, 45, 45);
	        this.add(numero1);

	        pt = new JButton();
	        pt.setText(".");
	        pt.setBounds(25, 250, 45, 45);
	        this.add(pt);

	        
	        
	        /*separa*/
	        
	        
	        numero8 = new JButton();
	        numero8.setText("8");
	        numero8.setBounds(85, 70, 45, 45);
	        this.add(numero8);

	        numero5 = new JButton();
	        numero5.setText("5");
	        numero5.setBounds(85, 130, 45, 45);
	        this.add(numero5);

	        numero2 = new JButton();
	        numero2.setText("2");
	        numero2.setBounds(85, 190, 45, 45);
	        this.add(numero2);

	        numero0 = new JButton();
	        numero0.setText("0");
	        numero0.setBounds(85, 250, 45, 45);
	        this.add(numero0);


	        /*separa*/
	        

	        numero9 = new JButton();
	        numero9.setText("9");
	        numero9.setBounds(145, 70, 45, 45);
	        this.add(numero9);
	        
	        numero6 = new JButton();
	        numero6.setText("6");
	        numero6.setBounds(145, 130, 45, 45);
	        this.add(numero6);
	        
	        numero3 = new JButton();
	        numero3.setText("3");
	        numero3.setBounds(145, 190, 45, 45);
	        this.add(numero3);

	        igual = new JButton();
	        igual.setText("=");
	        igual.setBounds(145, 250, 45, 45);
	        this.add(igual);
	        
	        clear = new JButton();
	        clear.setText("Clear");
	        clear.setBounds(25, 310, 225, 45);
	        this.add(clear);

	        display = new JTextField();
	        display.setBounds(25, 25, 225, 30);
	        this.add(display);

	        numero1.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	                leitura *= 10;
	                leitura += 1;
	                display.setText(display.getText() + "1");
	            }
	        });

	        numero2.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	                leitura *= 10;
	                leitura += 2;
	                display.setText(display.getText() + "2");
	            }
	        });
	        numero3.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	                leitura *= 10;
	                leitura += 3;
	                display.setText(display.getText() + "3");
	            }
	        });

	        numero4.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	                leitura *= 10;
	                leitura += 4;
	                display.setText(display.getText() + "4");
	            }
	        });
	        numero5.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	                leitura *= 10;
	                leitura += 5;
	                display.setText(display.getText() + "5");
	            }
	        });

	        numero6.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	                leitura *= 10;
	                leitura += 6;
	                display.setText(display.getText() + "6");
	            }
	        });
	        numero7.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	                leitura *= 10;
	                leitura += 7;
	                display.setText(display.getText() + "7");
	            }
	        });

	        numero8.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	                leitura *= 10;
	                leitura += 8;
	                display.setText(display.getText() + "8");
	            }
	        });
	        numero9.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	                leitura *= 10;
	                leitura += 9;
	                display.setText(display.getText() + "9");
	            }
	        });

	        numero0.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	                leitura *= 10;
	                display.setText(display.getText() + "0");
	            }
	        });

	        clear.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	                display.setText("");
	            }
	        });

	        somar.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	                operacao = '+';
	                memoria += leitura;
	                leitura = 0;
	                display.setText("");
	            }
	        });


	        subtrair.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	                operacao = '-';
	                memoria += leitura;
	                leitura = 0;
	                display.setText("");
	            }
	        });


	        multiplicar.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	                operacao = 'x';
	                memoria += leitura;
	                leitura = 0;
	                display.setText("");
	            }
	        });


	        dividir.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	                operacao = '/';
	                memoria += leitura;
	                leitura = 0;
	                display.setText("");
	            }
	        });

	        igual.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	                switch (operacao) {
                    case '+': {
                        memoria += leitura;
                        break;
                    }
                    case '-': {
                        memoria -= leitura;
                        break;
                    }
                    case 'x': {
                        memoria *= leitura;
                        break;
                    }
                    case '/': {
            	    	try{
            	    		divide();
            	    	} catch(DivisaoPorZeroException e){
            	    		JOptionPane.showMessageDialog(null, e.getMessage());
            	    	}
                        break;
                    }
	                }
	                leitura = 0;
	                display.setText("" + memoria);
	            }
	        });
	    } // construtor
	    public void divide(){
	    	if(leitura == 0)
	    		throw new DivisaoPorZeroException("Não é possível dividir por 0!");
       		memoria /= leitura;
	    	
	    }
	    public static void main(String[] args) {
		    	TelaCalculadora exemplo = new TelaCalculadora();
		        exemplo.setVisible(true);
	    }
}
