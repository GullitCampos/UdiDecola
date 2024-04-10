package udiDecola;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ClienteGUI2 extends JFrame {
	private JLabel nome, cpf, dataNasc, endereco, email;
	private JTextField nometxt, cpftxt, dataNasctxt, enderecotxt, emailtxt;
	private JButton botaoCadas;
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public ClienteGUI2() {
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
        
        endereco = new JLabel("Endereço: ");
        endereco.setBounds(10, 131, 138, 21);
        panel.add(endereco);

        enderecotxt = new JTextField(10);
        enderecotxt.setBounds(158, 125, 285, 27);
        panel.add(enderecotxt);
        
        email = new JLabel("E-mail: ");
        email.setBounds(10, 169, 138, 21);
        panel.add(email);

        emailtxt = new JTextField(10);
        emailtxt.setBounds(158, 163, 285, 27);
        panel.add(emailtxt);
        
        botaoCadas = new JButton("Cadastrar");
        botaoCadas.setBounds(220, 201, 110, 35);
        botaoCadas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Cliente c = new Cliente(nometxt.getText(), cpftxt.getText(), LocalDate.parse(dataNasctxt.getText(),formatter),
            			enderecotxt.getText(), emailtxt.getText());
            	DAOCliente.cadastrar(c);
            	JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso", "udiDecola", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        panel.add(botaoCadas);
        

        getContentPane().add(panel);
        
        this.setVisible(false);
		}
}
