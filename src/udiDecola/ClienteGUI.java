package udiDecola;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class ClienteGUI extends JFrame {
		private JLabel nome, cpf, dataNasc, dataCadas, endereco, email, vip, dataVip, nroCompras, ehFunc;
		private JCheckBox viptxt, ehFunctxt;
		private JTextField nometxt, cpftxt, dataNasctxt, dataCadastxt, enderecotxt, emailtxt, dataViptxt, nroComprastxt;
		private JButton botaoCadas;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		public ClienteGUI() {
			this.setTitle("Cadastro de Cliente");
			this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			this.setSize(520,500);
			
	        JPanel panel = new JPanel();
	        panel.setLayout(null);
			
	        nome = new JLabel("Nome Completo: ");
	        nome.setBounds(10, 14, 121, 21);
	        panel.add(nome);

	        nometxt = new JTextField(14);
	        nometxt.setBounds(158, 11, 285, 27);
	        panel.add(nometxt);
	                
	        cpf = new JLabel("CPF: ");
	        cpf.setBounds(10, 55, 121, 21);
	        panel.add(cpf);
	        
	        cpftxt = new JTextField(14);
	        cpftxt.setBounds(158, 49, 285, 27);
	        panel.add(cpftxt);

	        dataNasc = new JLabel("Data de Nascimento: ");
	        dataNasc.setBounds(10, 93, 138, 21);
	        panel.add(dataNasc);

	        dataNasctxt = new JTextField(14);
	        dataNasctxt.setBounds(158, 87, 285, 27);
	        panel.add(dataNasctxt);

	        dataCadas = new JLabel("Data de Cadastro: ");
	        dataCadas.setBounds(10, 131, 138, 21);
	        panel.add(dataCadas);

	        dataCadastxt = new JTextField(10);
	        dataCadastxt.setBounds(158, 125, 285, 27);
	        panel.add(dataCadastxt);
	        
	        endereco = new JLabel("Endereço: ");
	        endereco.setBounds(10, 169, 138, 21);
	        panel.add(endereco);

	        enderecotxt = new JTextField(10);
	        enderecotxt.setBounds(158, 163, 285, 27);
	        panel.add(enderecotxt);
	        
	        email = new JLabel("E-mail: ");
	        email.setBounds(10, 207, 138, 21);
	        panel.add(email);

	        emailtxt = new JTextField(10);
	        emailtxt.setBounds(158, 207, 285, 27);
	        panel.add(emailtxt);
	        
	        vip = new JLabel("VIP: ");
	        vip.setBounds(10, 245, 138, 21);
	        panel.add(vip);

	        viptxt = new JCheckBox("Sim");
	        viptxt.setBounds(158, 245, 285, 27);
	        panel.add(viptxt);
	        
	        dataVip = new JLabel("Data VIP: ");
	        dataVip.setBounds(10, 283, 138, 21);
	        panel.add(dataVip);

	        dataViptxt = new JTextField(10);
	        dataViptxt.setBounds(158, 283, 285, 27);
	        panel.add(dataViptxt);
	        
	        nroCompras = new JLabel("Número de Compras: ");
	        nroCompras.setBounds(10, 321, 138, 21);
	        panel.add(nroCompras);

	        nroComprastxt = new JTextField(10);
	        nroComprastxt.setBounds(158, 321, 285, 27);
	        panel.add(nroComprastxt);
	        
	        ehFunc= new JLabel("É funcionário?: ");
	        ehFunc.setBounds(10, 359, 138, 21);
	        panel.add(ehFunc);

	        ehFunctxt = new JCheckBox("Sim");
	        ehFunctxt.setBounds(158, 359, 285, 27);
	        panel.add(ehFunctxt);
	        
	        botaoCadas = new JButton("Cadastrar");
	        botaoCadas.setBounds(220, 397, 110, 35);
	        botaoCadas.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	
	            	Cliente c = new Cliente(nometxt.getText(), cpftxt.getText(), LocalDate.parse(dataNasctxt.getText(), formatter),
	            			LocalDate.parse(dataCadastxt.getText(),formatter), enderecotxt.getText(), emailtxt.getText(),
	            			viptxt.isSelected(), LocalDate.parse(dataViptxt.getText(), formatter), Integer.parseInt(nroComprastxt.getText()),
	            			ehFunctxt.isSelected());
	            	DAOCliente.cadastrar(c);
	            	JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso", "udiDecola", JOptionPane.INFORMATION_MESSAGE);
	            }
	        });
	        panel.add(botaoCadas);
	        

	        getContentPane().add(panel);
	        
	        this.setVisible(false);
			}
}
