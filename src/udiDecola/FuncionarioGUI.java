package udiDecola;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FuncionarioGUI extends JFrame{
	private JLabel nome, cpf, dataNasc, dataCadas, endereco, carteiraTrabalho, salario;
	private JTextField nometxt, cpftxt, dataNasctxt, dataCadastxt, enderecotxt, carteiraTrabalhotxt, salariotxt;
	private JButton botaoFunc;
	
	public FuncionarioGUI() {
		this.setTitle("Funcionarios");
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setSize(620,420);
		
        JPanel panel = new JPanel();
        panel.setLayout(null);
		
        nome = new JLabel("Nome: ");
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

        dataNasc = new JLabel("data de Nascimento: ");
        dataNasc.setBounds(10, 93, 138, 21);
        panel.add(dataNasc);

        dataNasctxt = new JTextField(14);
        dataNasctxt.setBounds(158, 87, 285, 27);
        panel.add(dataNasctxt);

        dataCadas = new JLabel("data de Cadastro: ");
        dataCadas.setBounds(10, 131, 138, 21);
        panel.add(dataCadas);

        dataCadastxt = new JTextField(10);
        dataCadastxt.setBounds(158, 125, 285, 27);
        panel.add(dataCadastxt);
        
        endereco = new JLabel("Endereco: ");
        endereco.setBounds(10, 169, 138, 21);
        panel.add(endereco);

        enderecotxt = new JTextField(10);
        enderecotxt.setBounds(158, 163, 285, 27);
        panel.add(enderecotxt);
        
        carteiraTrabalho = new JLabel("Carteira de Trabralho: ");
        carteiraTrabalho.setBounds(10, 207, 138, 21);
        panel.add(carteiraTrabalho);

        carteiraTrabalhotxt = new JTextField(10);
        carteiraTrabalhotxt.setBounds(158, 201, 285, 27);
        panel.add(carteiraTrabalhotxt);
        
        salario = new JLabel("Salario: ");
        salario.setBounds(10, 245, 138, 21);
        panel.add(salario);

        salariotxt = new JTextField(10);
        salariotxt.setBounds(158, 239, 285, 27);
        panel.add(salariotxt);

        botaoFunc = new JButton("Ok");
        botaoFunc.setBounds(220, 287, 63, 35);
        botaoFunc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        panel.add(botaoFunc);
        

        getContentPane().add(panel);
        
        this.setVisible(false);
		
	}
}

	


