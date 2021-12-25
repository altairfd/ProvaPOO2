package interfaceg;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import classes.Funcionario;
import classes.Cliente;

public class interfaceg {

	private JFrame frame;
	private JTextField campNome;
	private JTextField campSobrenome;
	private JTextField campEndereco;
	private JTextField campCpf;
	private  Cliente c1;
	private Funcionario f1;

	public static void main(String[] args) {
		interfaceg window = new interfaceg();
		window.frame.setVisible(true);

	}

	public interfaceg() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 367, 566);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel abaRegistrar = new JPanel();
		abaRegistrar.setBackground(new Color(255, 51, 0));
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 353, 529);
		tabbedPane.setBackground(new Color(255, 51, 0));
		tabbedPane.setFont(new Font("Tahoma", Font.BOLD, 14));
		tabbedPane.addTab("Registrar", abaRegistrar);
		abaRegistrar.setLayout(null);
		
		JLabel lbTitulo = new JLabel("Registre-se");
		lbTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbTitulo.setBounds(10, 10, 328, 32);
		abaRegistrar.add(lbTitulo);
		
		JLabel lbNome = new JLabel("Nome:");
		lbNome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbNome.setBounds(10, 52, 70, 32);
		abaRegistrar.add(lbNome);
		
		campNome = new JTextField();
		campNome.setBackground(new Color(255, 255, 0));
		campNome.setForeground(new Color(0, 0, 0));
		campNome.setFont(new Font("Tahoma", Font.BOLD, 14));
		campNome.setBounds(115, 52, 223, 33);
		abaRegistrar.add(campNome);
		campNome.setColumns(10);
		
		JLabel lbSobrenome = new JLabel("Sobrenome:");
		lbSobrenome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbSobrenome.setBounds(10, 95, 88, 32);
		abaRegistrar.add(lbSobrenome);
		
		campSobrenome = new JTextField();
		campSobrenome.setForeground(Color.BLACK);
		campSobrenome.setFont(new Font("Tahoma", Font.BOLD, 14));
		campSobrenome.setColumns(10);
		campSobrenome.setBackground(Color.YELLOW);
		campSobrenome.setBounds(115, 95, 223, 33);
		abaRegistrar.add(campSobrenome);
		
		JLabel lblEndereco = new JLabel("Endereco:");
		lblEndereco.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEndereco.setBounds(10, 137, 88, 32);
		abaRegistrar.add(lblEndereco);
		
		campEndereco = new JTextField();
		campEndereco.setForeground(Color.BLACK);
		campEndereco.setFont(new Font("Tahoma", Font.BOLD, 14));
		campEndereco.setColumns(10);
		campEndereco.setBackground(Color.YELLOW);
		campEndereco.setBounds(115, 138, 223, 33);
		abaRegistrar.add(campEndereco);
		
		JLabel lbCpf = new JLabel("CPF:");
		lbCpf.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbCpf.setBounds(10, 179, 88, 32);
		abaRegistrar.add(lbCpf);
		
		campCpf = new JTextField();
		campCpf.setForeground(Color.BLACK);
		campCpf.setFont(new Font("Tahoma", Font.BOLD, 14));
		campCpf.setColumns(10);
		campCpf.setBackground(Color.YELLOW);
		campCpf.setBounds(115, 181, 223, 33);
		abaRegistrar.add(campCpf);
		
		JCheckBox boxFun = new JCheckBox("Funcionario");
		boxFun.setBackground(new Color(255, 255, 0));
		boxFun.setHorizontalAlignment(SwingConstants.CENTER);
		boxFun.setFont(new Font("Tahoma", Font.BOLD, 14));
		boxFun.setBounds(115, 227, 111, 32);
		abaRegistrar.add(boxFun);
		
		JCheckBox boxCliente = new JCheckBox("Clente");
		boxCliente.setHorizontalAlignment(SwingConstants.CENTER);
		boxCliente.setFont(new Font("Tahoma", Font.BOLD, 14));
		boxCliente.setBackground(Color.YELLOW);
		boxCliente.setBounds(228, 227, 111, 32);
		abaRegistrar.add(boxCliente);
		
		JLabel lbStatus = new JLabel("CPF:");
		lbStatus.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbStatus.setBounds(10, 227, 88, 32);
		abaRegistrar.add(lbStatus);
		
		JButton btRegistrar = new JButton("Registrar");
		btRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (boxCliente.isSelected() == true) {
					String nome = campNome.getText();
					String sobrenome = campSobrenome.getText();
					String endereco = campEndereco.getText();
					String cpf = campCpf.getText();
					if (cpf.equals("11111111111") || cpf.equals("01234567891")) {
						JOptionPane.showMessageDialog(null, "Informe um CPF válido", "CPF inválido:", JOptionPane.ERROR_MESSAGE);
					} else {
						c1 = new Cliente(nome, sobrenome, endereco, cpf);
						JOptionPane.showMessageDialog(null, "Bem-vindo Sr(a):  " + c1.getNome(), "Registrado com sucesso!", JOptionPane.INFORMATION_MESSAGE);
					}

				} else if (boxFun.isSelected() == true) {
					String nome = campNome.getText();
					String sobrenome = campSobrenome.getText();
					String endereco = campEndereco.getText();
					String cpf = campCpf.getText();
					if (cpf.equals("11111111111") || cpf.equals("01234567891")) {
						JOptionPane.showMessageDialog(null, "Informe um CPF válido", "CPF inválido:", JOptionPane.ERROR_MESSAGE);
					} else {
						f1 = new Funcionario(nome, sobrenome, endereco, cpf);
						JOptionPane.showMessageDialog(null, "Bom-vindo a nossa equipe, Sayajhin: " + f1.getNome() , "Registro de funcionairo", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
		});
		frame.getContentPane().setLayout(null);
		btRegistrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btRegistrar.setBackground(new Color(255, 255, 0));
		btRegistrar.setBounds(89, 406, 164, 49);
		abaRegistrar.add(btRegistrar);
		frame.getContentPane().add(tabbedPane);
		
		JPanel abaPedidos = new JPanel();
		abaPedidos.setBackground(new Color(255, 51, 0));
		tabbedPane.addTab("Pedidos", abaPedidos);
		abaPedidos.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fa\u00E7a seu pedido!");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 328, 32);
		abaPedidos.add(lblNewLabel);
		
		JLabel lbPao = new JLabel("P\u00E3o:");
		lbPao.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbPao.setBounds(10, 52, 85, 32);
		abaPedidos.add(lbPao);
		
		JCheckBox boxPIntegral = new JCheckBox("Integral");
		boxPIntegral.setBackground(new Color(255, 255, 0));
		boxPIntegral.setFont(new Font("Tahoma", Font.BOLD, 14));
		boxPIntegral.setBounds(150, 48, 93, 33);
		abaPedidos.add(boxPIntegral);
		
		JCheckBox boxPFrances = new JCheckBox("Frances");
		boxPFrances.setFont(new Font("Tahoma", Font.BOLD, 14));
		boxPFrances.setBackground(Color.YELLOW);
		boxPFrances.setBounds(245, 48, 93, 33);
		abaPedidos.add(boxPFrances);
		
		JLabel lbHamburg = new JLabel("Hamburguer:");
		lbHamburg.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbHamburg.setBounds(10, 94, 98, 32);
		abaPedidos.add(lbHamburg);
		
		JCheckBox boxHvegano = new JCheckBox("Vegano");
		boxHvegano.setFont(new Font("Tahoma", Font.BOLD, 14));
		boxHvegano.setBackground(Color.YELLOW);
		boxHvegano.setBounds(150, 93, 93, 33);
		abaPedidos.add(boxHvegano);
		
		JCheckBox boxHcarne = new JCheckBox("Carne");
		boxHcarne.setFont(new Font("Tahoma", Font.BOLD, 14));
		boxHcarne.setBackground(Color.YELLOW);
		boxHcarne.setBounds(245, 93, 93, 33);
		abaPedidos.add(boxHcarne);
		
		JLabel lbMaionese = new JLabel("Maionese:");
		lbMaionese.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbMaionese.setBounds(10, 138, 98, 32);
		abaPedidos.add(lbMaionese);
		
		JCheckBox boxMcaseira = new JCheckBox("Caseira");
		boxMcaseira.setFont(new Font("Tahoma", Font.BOLD, 14));
		boxMcaseira.setBackground(Color.YELLOW);
		boxMcaseira.setBounds(150, 137, 93, 33);
		abaPedidos.add(boxMcaseira);
		
		JCheckBox boxMpadrao = new JCheckBox("Padrao");
		boxMpadrao.setFont(new Font("Tahoma", Font.BOLD, 14));
		boxMpadrao.setBackground(Color.YELLOW);
		boxMpadrao.setBounds(249, 137, 93, 33);
		abaPedidos.add(boxMpadrao);
		
		JButton btPedido = new JButton("Finalizar pedido");
		btPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int preco = 0;
				if (boxPFrances.isSelected() == true) {
					preco += 0.50;
				} if (boxPIntegral.isSelected() == true) {
					preco += 0.75;
				} 
				if (boxPFrances.isSelected() == true && boxPIntegral.isSelected() == true) {
					JOptionPane.showMessageDialog(null, "Selecione apenas um tipo de pão", "Seleção inválida:", JOptionPane.ERROR_MESSAGE);
				} 
				if (boxHcarne.isSelected() == true) {
					preco += 3.50;
				} 
				if (boxHvegano.isSelected() == true) {
					preco += 4.50;
				} 
				if (boxHcarne.isSelected() == true && boxHvegano.isSelected() == true) {
					preco += 8.00;
				} 

				if (boxMpadrao.isSelected() == true) {
					preco += 0.75;
					JOptionPane.showMessageDialog(null, "Pedido realizado com sucesso!", "Pedido finalizado", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "Sr(a): " + c1.getNome() + " seu lanche será entregue em:" + "\n" + c1.getEndereco() + 
					" no vlaor de: R$" + preco + ",0", "Finlizado", JOptionPane.INFORMATION_MESSAGE);
				} 
			
				if (boxMcaseira.isSelected() == true) {
					preco += 1.25;
					JOptionPane.showMessageDialog(null, "Pedido realizado com sucesso!", "Pedido finalizado", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "Sr(a): " + c1.getNome() + " seu lanche será entregue em:" + "\n" + c1.getEndereco() + 
					" no vlaor de: R$" + preco + ",0", "Finlizado", JOptionPane.INFORMATION_MESSAGE);
				}

			}
		});
		btPedido.setBackground(new Color(255, 255, 0));
		btPedido.setFont(new Font("Tahoma", Font.BOLD, 14));
		btPedido.setBounds(89, 406, 164, 49);
		abaPedidos.add(btPedido);
		
		JPanel abaFuncionario = new JPanel();
		abaFuncionario.setBackground(new Color(255, 51, 0));
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Funcionario", abaFuncionario);	
		abaFuncionario.setLayout(null);
		
		JLabel lbTituloF = new JLabel("Area Funcionario");
		lbTituloF.setHorizontalAlignment(SwingConstants.CENTER);
		lbTituloF.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbTituloF.setBounds(10, 10, 328, 32);
		abaFuncionario.add(lbTituloF);
		
		JLabel lbPromover = new JLabel("Promover:");
		lbPromover.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbPromover.setBounds(10, 52, 85, 32);
		abaFuncionario.add(lbPromover);
		
		JCheckBox boxPromover = new JCheckBox("Realizar promocao");
		boxPromover.setFont(new Font("Tahoma", Font.BOLD, 14));
		boxPromover.setBackground(Color.YELLOW);
		boxPromover.setBounds(136, 52, 172, 33);
		abaFuncionario.add(boxPromover);
		
		JLabel lbDesligamento = new JLabel("Desligar funcionario");
		lbDesligamento.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbDesligamento.setBounds(10, 102, 146, 32);
		abaFuncionario.add(lbDesligamento);
		
		JCheckBox boxDesligar = new JCheckBox("Desligamento");
		boxDesligar.setFont(new Font("Tahoma", Font.BOLD, 14));
		boxDesligar.setBackground(Color.YELLOW);
		boxDesligar.setBounds(184, 102, 124, 33);
		abaFuncionario.add(boxDesligar);
		
		JButton btFuncionario = new JButton("Finalizar");
		btFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (boxPromover.isSelected() == true) {
					JOptionPane.showMessageDialog(null, "O funcionario: " + f1.getNome() + "\n" + 
					" receberá um aumento de salário no próximo mês", "Detalhes da promoção", JOptionPane.INFORMATION_MESSAGE);
				}

				if (boxDesligar.isSelected() == true) {
					JOptionPane.showMessageDialog(null, "Obrigado Sayajhin: " + f1.getNome() + "\n" + 
					" por trabalhar conosco.", "Desligamento", JOptionPane.INFORMATION_MESSAGE);
				}

			}
		});
		btFuncionario.setFont(new Font("Tahoma", Font.BOLD, 14));
		btFuncionario.setBackground(Color.YELLOW);
		btFuncionario.setBounds(89, 406, 164, 49);
		abaFuncionario.add(btFuncionario);}
}
