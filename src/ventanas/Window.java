package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Window {

	private JFrame frame;
	private JTextField textField;
	Double first;
	Double second;
	Double resultado;
	String operation = "";
	Boolean borrar = false;
	Calculadora c = new Calculadora();
	private JTextField textoSuperior;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
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
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void cleaner() {
		first = null;
		second = null;
		operation = "";
		resultado = null;
		textField.setText("");
		borrar = false;
		textoSuperior.setText("");
	}

	private double calcula(double a, double b) {
		double sol = 0;
		if (operation.equals("+")) {
			sol = c.suma(a, b);
		} else if (operation.equals("-")) {
			sol = c.resta(a, b);
		} else if (operation.equals("*")) {
			sol = c.mult(a, b);
		} else if (operation.equals("/")) {
			sol = c.divide(a, b);
		}
		return sol;
	}

	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 339, 527);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton b1 = new JButton("1");
		b1.setBounds(24, 334, 63, 47);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (borrar)
					cleaner();
				String number = textField.getText() + b1.getText();
				textField.setText(number);
			}
		});
		frame.getContentPane().setLayout(null);

		b1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(b1);

		JButton b2 = new JButton("2");
		b2.setBounds(97, 334, 63, 47);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (borrar)
					cleaner();
				String number = textField.getText() + b2.getText();
				textField.setText(number);
			}
		});
		b2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(b2);

		JButton b3 = new JButton("3");
		b3.setBounds(170, 334, 63, 47);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (borrar)
					cleaner();
				String number = textField.getText() + b3.getText();
				textField.setText(number);
			}
		});
		b3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(b3);

		JButton b4 = new JButton("4");
		b4.setBounds(24, 277, 63, 47);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (borrar)
					cleaner();
				String number = textField.getText() + b4.getText();
				textField.setText(number);
			}
		});
		b4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(b4);

		JButton b5 = new JButton("5");
		b5.setBounds(97, 277, 63, 47);
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (borrar)
					cleaner();
				String number = textField.getText() + b5.getText();
				textField.setText(number);
			}
		});
		b5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(b5);

		JButton b6 = new JButton("6");
		b6.setBounds(170, 277, 63, 47);
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (borrar)
					cleaner();
				String number = textField.getText() + b6.getText();
				textField.setText(number);
			}
		});
		b6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(b6);

		JButton b7 = new JButton("7");
		b7.setBounds(24, 220, 63, 47);
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (borrar)
					cleaner();
				String number = textField.getText() + b7.getText();
				textField.setText(number);
			}
		});
		b7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(b7);

		JButton b8 = new JButton("8");
		b8.setBounds(97, 220, 63, 47);
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (borrar)
					cleaner();
				String number = textField.getText() + b8.getText();
				textField.setText(number);
			}
		});
		b8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(b8);

		JButton b9 = new JButton("9");
		b9.setBounds(170, 220, 63, 47);
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (borrar)
					cleaner();
				String number = textField.getText() + b9.getText();
				textField.setText(number);
			}
		});
		b9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(b9);

		JButton b0 = new JButton("0");
		b0.setBounds(24, 391, 63, 47);
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (borrar)
					cleaner();
				String number = textField.getText() + b0.getText();
				textField.setText(number);
			}
		});
		b0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(b0);

		JButton bdel = new JButton("del");
		bdel.setBounds(24, 163, 63, 47);
		bdel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (borrar)
					cleaner();
				String back = null;
				if (textField.getText().length() > 0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(str.length() - 1);
					textField.setText(str.toString());
				}
			}
		});
		bdel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(bdel);

		JButton bclear = new JButton("AC");
		bclear.setBounds(97, 163, 63, 47);
		bclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cleaner();
			}
		});
		bclear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(bclear);

		JButton bsum = new JButton("+");
		bsum.setBounds(243, 163, 63, 47);
		bsum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (borrar) {
						cleaner();
					}
					if (first == null && !textField.getText().equals("")) {
						first = Double.parseDouble(textField.getText());
						textoSuperior.setText(first.toString());
						textField.setText(null);
						operation = "+";
						textoSuperior.setText(textoSuperior.getText()+" "+ operation+" ");

					} else if (second == null && !textField.getText().equals("")) {
						second = Double.parseDouble(textField.getText());
						first = calcula(first, second);
						textoSuperior.setText(first.toString());
						operation = "+";
						second = null;
						textField.setText(null);
					} else {
						// textField.setText("+");
					}
				} catch (IllegalArgumentException x) {
					textField.setText("Math Error");
					borrar = true;
				}
			}

		});
		bsum.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(bsum);

		JButton bsub = new JButton("-");
		bsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					if (borrar) {
						cleaner();
					}
					if (first == null && !textField.getText().equals("") && !textField.getText().equals("-")) {
						first = Double.parseDouble(textField.getText());
						textoSuperior.setText(first.toString());
						textField.setText(null);
						operation = "-";
						textoSuperior.setText(textoSuperior.getText()+" "+ operation+" ");
					} else if (second == null && !textField.getText().equals("") && !textField.getText().equals("-")) {
						second = Double.parseDouble(textField.getText());
						first = calcula(first, second);
						textoSuperior.setText(first.toString());
						operation = "-";
						second = null;
						textField.setText(null);

					} else {

						textField.setText("-");

					}
				} catch (IllegalArgumentException x) {
					textField.setText("Math Error");
					borrar = true;
				}

			}
		});
		bsub.setBounds(243, 220, 63, 47);
		bsub.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(bsub);

		JButton bmul = new JButton("*");
		bmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (borrar) {
						cleaner();
					}
					if (first == null && !textField.getText().equals("")) {
						first = Double.parseDouble(textField.getText());
						textField.setText(null);
						textoSuperior.setText(first.toString());
						operation = "*";
						textoSuperior.setText(textoSuperior.getText()+" "+ operation+" ");
					} else if (second == null && !textField.getText().equals("")) {
						second = Double.parseDouble(textField.getText());
						first = calcula(first, second);
						textoSuperior.setText(first.toString());
						operation = "*";
						second = null;
						textField.setText(null);
					} else {
						// textField.setText("+");
					}
				} catch (IllegalArgumentException x) {
					textField.setText("Math Error");
					borrar = true;
				}
			}
		});
		bmul.setBounds(243, 277, 63, 47);
		bmul.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(bmul);

		JButton bdiv = new JButton("/");
		bdiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (borrar) {
						cleaner();
					}
					if (first == null && !textField.getText().equals("")) {
						first = Double.parseDouble(textField.getText());
						textField.setText(null);
						textoSuperior.setText(first.toString());
						operation = "/";
						textoSuperior.setText(textoSuperior.getText()+" "+ operation+" ");
					} else if (second == null && !textField.getText().equals("")) {
						second = Double.parseDouble(textField.getText());
						first = calcula(first, second);
						textoSuperior.setText(first.toString());
						operation = "/";
						second = null;
						textField.setText(null);
					} else {
						// textField.setText("+");
					}
				} catch (IllegalArgumentException x) {
					textField.setText("Math Error");
					borrar = true;
				}
			}
		});
		bdiv.setBounds(243, 334, 63, 47);
		bdiv.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(bdiv);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setForeground(Color.BLACK);
		textField.setBounds(24, 71, 282, 58);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton bfact = new JButton("!");
		bfact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (first == null && !textField.getText().equals("")) {
						first = Double.parseDouble(textField.getText());
						if ((first - Math.floor(first) != 0)) {
							textField.setText("Math Error");
							borrar = true;
						} else {
							first = Double.parseDouble(textField.getText());
							resultado = (double) c.fact(first.intValue());
							textoSuperior.setText("("+textField.getText()+")"+"!");
							textField.setText(resultado.toString());
							first = null;
							second = null;
						}
					}
					if (first != null && !textField.getText().equals("")) {
						if (borrar)
							cleaner();
						second = Double.parseDouble(textField.getText());
						if (operation.equals("")) {
							resultado = Double.parseDouble(textField.getText());
						}

						resultado = calcula(first, second);
						if (resultado - Math.floor(resultado) != 0) {
							textField.setText("Math Error");
							borrar = true;
						} else {
							resultado = (double) c.fact(resultado.intValue());
							textField.setText(resultado.toString());
							textoSuperior.setText("("+textoSuperior.getText()+")"+"!");
							first = null;
							second = null;
						}
					}
				} catch (IllegalArgumentException f) {
					textField.setText("Math Error");
					borrar = true;
				}
			}
		});

		bfact.setBounds(243, 391, 63, 47);
		bfact.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(bfact);

		JButton b00 = new JButton("00");
		b00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (borrar)
					cleaner();
				String number = textField.getText() + b00.getText();
				textField.setText(number);
			}
		});
		b00.setBounds(170, 163, 63, 47);
		b00.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(b00);

		JButton bpoint = new JButton(".");
		bpoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (borrar)
					cleaner();
				String number = textField.getText() + bpoint.getText();
				textField.setText(number);
			}
		});
		bpoint.setBounds(97, 391, 63, 47);
		bpoint.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(bpoint);

		JButton bequ = new JButton("=");
		bequ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (first != null && !textField.getText().equals("")) {
					
					if (borrar)
						cleaner();
					second = Double.parseDouble(textField.getText());
					if (operation.equals("")) {
						resultado = Double.parseDouble(textField.getText());
					}
					try {
						resultado = calcula(first, second);
						textoSuperior.setText(textoSuperior.getText()+textField.getText());
						textField.setText(resultado.toString());
						first = null;
						second = null;
					} catch (IllegalArgumentException f) {
						textField.setText("Math Error");
						borrar = true;
					}
				}
			}
		});
		bequ.setBounds(24, 443, 282, 47);
		bequ.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(bequ);

		JButton bPrim = new JButton("pri");
		bPrim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (first == null && !textField.getText().equals("")) {
						first = Double.parseDouble(textField.getText());
						if ((first - Math.floor(first) != 0)) {
							textField.setText("Math Error");
							borrar = true;
						} else {
							first = Double.parseDouble(textField.getText());
							boolean x =c.esPrimo((first.intValue()));
							textoSuperior.setText("("+first+")"+"esPrimo");
							textField.setText(""+x);
							first = null;
							second = null;
						}
					}
					if (first != null && !textField.getText().equals("")) {
						if (borrar)
							cleaner();
						second = Double.parseDouble(textField.getText());
						if (operation.equals("")) {
							resultado = Double.parseDouble(textField.getText());
						}

						resultado = calcula(first, second);
						if (resultado - Math.floor(resultado) != 0) {
							textField.setText("Math Error");
							borrar = true;
						} else {
							boolean x =c.esPrimo((resultado.intValue()));
							textoSuperior.setText("("+textoSuperior.getText()+")"+"esPrimo");
							textField.setText(""+x);
							first = null;
							second = null;
						}
					}
				} catch (IllegalArgumentException f) {
					textField.setText("Math Error");
					borrar = true;
				}
				borrar=true;
			}
		});
		bPrim.setFont(new Font("Tahoma", Font.PLAIN, 20));
		bPrim.setBounds(170, 391, 63, 47);
		frame.getContentPane().add(bPrim);
		
		textoSuperior = new JTextField();
		textoSuperior.setHorizontalAlignment(SwingConstants.RIGHT);
		textoSuperior.setForeground(Color.BLACK);
		textoSuperior.setColumns(10);
		textoSuperior.setBounds(24, 44, 282, 26);
		frame.getContentPane().add(textoSuperior);
	}
}
