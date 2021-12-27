import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class TelaJogo {

	private JFrame frame;
	private JTextField campJogador;
	public boolean jogador1 = true;
	public boolean jogador2 = true;
	public int contposi = 0;
	public int k = 0;
	public int i = 0;
	int op = 0;
	public String l1, l2, l3, c1, c2, c3, d1, d2;
	String[][] posicao = new String[3][3];

	public static void main(String[] args) {
		TelaJogo window = new TelaJogo();
		window.frame.setVisible(true);
	}

	public TelaJogo() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 626, 371);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton bt11 = new JButton("");
		bt11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificarJogador();
				if (op == 1) {
					bt11.setText(" X ");
					posicao[0][0] = "X";

				} else {
					bt11.setText(" O ");
					posicao[0][0] = " O	";

				}
				bt11.setEnabled(false);
				empate();
				verificarGanhador();

			}
		});
		bt11.setFont(new Font("Tahoma", Font.BOLD, 14));
		bt11.setBounds(52, 10, 95, 91);
		frame.getContentPane().add(bt11);

		JButton bt12 = new JButton("");
		bt12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificarJogador();
				if (op == 1) {
					bt12.setText(" X ");
					posicao[0][1] = "X";

				} else {
					bt12.setText(" O ");
					posicao[0][1] = " O	";

				}
				bt12.setEnabled(false);
				empate();
				verificarGanhador();
			}
		});
		bt12.setFont(new Font("Tahoma", Font.BOLD, 14));
		bt12.setBounds(181, 10, 95, 91);
		frame.getContentPane().add(bt12);

		JButton bt13 = new JButton("");
		bt13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificarJogador();
				if (op == 1) {
					bt13.setText(" X ");
					posicao[0][2] = "X";

				} else {
					bt13.setText(" O ");
					posicao[0][2] = " O	";

				}
				bt13.setEnabled(false);
				empate();
				verificarGanhador();
			}
		});
		bt13.setFont(new Font("Tahoma", Font.BOLD, 14));
		bt13.setBounds(317, 10, 95, 91);
		frame.getContentPane().add(bt13);

		JButton bt21 = new JButton("");
		bt21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificarJogador();
				if (op == 1) {
					bt21.setText(" X ");
					posicao[1][0] = "X";

				} else {
					bt21.setText(" O ");
					posicao[1][0] = " O	";

				}
				bt21.setEnabled(false);
				empate();
				verificarGanhador();
			}
		});
		bt21.setFont(new Font("Tahoma", Font.BOLD, 14));
		bt21.setBounds(52, 132, 95, 91);
		frame.getContentPane().add(bt21);

		JButton bt22 = new JButton("");
		bt22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificarJogador();
				if (op == 1) {
					bt22.setText(" X ");
					posicao[1][1] = "X";

				} else {
					bt22.setText(" O ");
					posicao[1][1] = " O	";

				}
				bt22.setEnabled(false);
				empate();
				verificarGanhador();
			}
		});
		bt22.setFont(new Font("Tahoma", Font.BOLD, 14));
		bt22.setBounds(181, 132, 95, 91);
		frame.getContentPane().add(bt22);

		JButton bt23 = new JButton("");
		bt23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificarJogador();
				if (op == 1) {
					bt23.setText(" X ");
					posicao[1][2] = "X";

				} else {
					bt23.setText(" O ");
					posicao[1][2] = " O	";

				}
				bt23.setEnabled(false);
				empate();
				verificarGanhador();
			}
		});
		bt23.setFont(new Font("Tahoma", Font.BOLD, 14));
		bt23.setBounds(317, 132, 95, 91);
		frame.getContentPane().add(bt23);

		JButton bt31 = new JButton("");
		bt31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificarJogador();
				if (op == 1) {
					bt31.setText(" X ");
					posicao[2][0] = "X";

				} else {
					bt31.setText(" O ");
					posicao[2][0] = " O	";

				}
				bt31.setEnabled(false);
				empate();
				verificarGanhador();
			}
		});
		bt31.setFont(new Font("Tahoma", Font.BOLD, 14));
		bt31.setBounds(52, 243, 95, 91);
		frame.getContentPane().add(bt31);

		JButton bt32 = new JButton("");
		bt32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificarJogador();
				if (op == 1) {
					bt32.setText(" X ");
					posicao[2][1] = "X";

				} else {
					bt32.setText(" O ");
					posicao[2][1] = " O	";

				}
				bt32.setEnabled(false);
				empate();
				verificarGanhador();
			}
		});
		bt32.setFont(new Font("Tahoma", Font.BOLD, 14));
		bt32.setBounds(181, 243, 95, 91);
		frame.getContentPane().add(bt32);

		JButton bt33 = new JButton("");
		bt33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificarJogador();
				if (op == 1) {
					bt33.setText(" X ");
					posicao[2][2] = "X";

				} else {
					bt33.setText(" O ");
					posicao[2][2] = " O	";

				}
				bt33.setEnabled(false);
				empate();
				verificarGanhador();
			}
		});
		bt33.setFont(new Font("Tahoma", Font.BOLD, 14));
		bt33.setBounds(317, 243, 95, 91);
		frame.getContentPane().add(bt33);

		JButton btLimpar = new JButton("Limpar mesa");
		btLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bt11.setText("");
				bt11.setEnabled(true);
				bt12.setText("");
				bt12.setEnabled(true);
				bt13.setText("");
				bt13.setEnabled(true);
				bt21.setText("");
				bt21.setEnabled(true);
				bt22.setText("");
				bt22.setEnabled(true);
				bt23.setText("");
				bt23.setEnabled(true);
				bt31.setText("");
				bt31.setEnabled(true);
				bt32.setText("");
				bt32.setEnabled(true);
				bt33.setText("");
				bt33.setEnabled(true);
				limparPosicoes();
				campJogador.setText("");
				verificarGanhador();
				jogador1 = true;
				jogador2 = true;

			}
		});
		btLimpar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btLimpar.setBounds(430, 154, 160, 46);
		frame.getContentPane().add(btLimpar);

		campJogador = new JTextField();
		campJogador.setHorizontalAlignment(SwingConstants.CENTER);
		campJogador.setFont(new Font("Tahoma", Font.BOLD, 12));
		campJogador.setBounds(436, 10, 154, 57);
		frame.getContentPane().add(campJogador);
		campJogador.setColumns(10);
	}

	public void verificarJogador() {
		if (jogador1 == true && jogador2 == true) {
			this.op = 1;
			jogador1 = false;
			jogador2 = true;
			campJogador.setText("Rodada jogador O");
		} else if (jogador2 == false) {
			this.op = 1;
			jogador1 = false;
			jogador2 = true;
			campJogador.setText("Rodada jogador O");
		} else {
			this.op = 2;
			jogador1 = true;
			jogador2 = false;
			campJogador.setText("Rodada jogador X");
		}

	}

	public void limparPosicoes() {
		for (i = 0; i < 3; i++) {
			for (k = 0; k < 3; k++) {
				posicao[i][k] = "";
			}
		}
	}

	public void verificarGanhador() {
		l1 = posicao[0][0] + posicao[0][1] + posicao[0][2];
		l2 = posicao[1][0] + posicao[1][1] + posicao[1][2];
		l3 = posicao[2][0] + posicao[2][1] + posicao[2][2];

		c1 = posicao[0][0] + posicao[1][0] + posicao[2][0];
		c2 = posicao[0][1] + posicao[1][1] + posicao[2][1];
		c3 = posicao[0][2] + posicao[1][2] + posicao[2][2];

		d1 = posicao[0][0] + posicao[1][1] + posicao[2][2];
		d2 = posicao[0][2] + posicao[1][1] + posicao[2][0];

		if (l1.equals("XXX") || l2.equals("XXX") || l3.equals("XXX")) {
			campJogador.setText("O jogador X Venceu!");
		} else if (c1.equals("XXX") || c2.equals("XXX") || c3.equals("XXX")) {
			campJogador.setText("O jogador X Venceu!");
		} else if (d1.equals("XXX") || d2.equals("XXX")) {
			campJogador.setText("O jogador X Venceu!");
		} else if (l1.equals("OOO") || l2.equals("OOO") || l3.equals("OOO")) {
			campJogador.setText("Jogador O venceu!");
		} else if (c1.equals("OOO") || c2.equals("OOO") || c3.equals("OOO")) {
			campJogador.setText("Jogador O venceu!");
		} else if (d1.equals("OOO") || d2.equals("OOO")) {
			campJogador.setText("Jogador O venceu!");
		} else if (contposi == 9) {
			campJogador.setText("Deu velha ou sseja empate!");
		}
	}
	
	public void empate() {
		contposi = 0;
		for (i = 0; i < 3; i++) {
			for (k = 0; k < 3; k++) {
				if (posicao[i][k] == "X" || posicao[i][k] == "O")
					contposi = 1;
			}
		}
	}
	
}
