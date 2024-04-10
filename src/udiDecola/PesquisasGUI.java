package udiDecola;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PesquisasGUI extends JFrame{
	private JLabel origem, destino, dataInicio, dataFim, horaPesquisa, cliente;
	private JTextField origemtxt, destinotxt, dataIniciotxt, dataFimtxt, horaPesquisatxt, clientetxt;
	private JButton botaoPesq;
	
	public PesquisasGUI() {
		this.setTitle("Pesquisas");
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setSize(620,420);
		
        JPanel panel = new JPanel();
        panel.setLayout(null);
		
        origem = new JLabel("Origem: ");
        origem.setBounds(10, 14, 121, 21);
        panel.add(origem);

        origemtxt = new JTextField(14);
        origemtxt.setBounds(158, 11, 285, 27);
        panel.add(origemtxt);
                
        destino = new JLabel("Destino: ");
        destino.setBounds(10, 55, 121, 21);
        panel.add(destino);
        
        destinotxt = new JTextField(14);
        destinotxt.setBounds(158, 49, 285, 27);
        panel.add(destinotxt);

        dataInicio = new JLabel("Data de Inicio: ");
        dataInicio.setBounds(10, 93, 138, 21);
        panel.add(dataInicio);

        dataIniciotxt = new JTextField(14);
        dataIniciotxt.setBounds(158, 87, 285, 27);
        panel.add(dataIniciotxt);

        dataFim = new JLabel("Data do Fim: ");
        dataFim.setBounds(10, 131, 138, 21);
        panel.add(dataFim);

        dataFimtxt = new JTextField(10);
        dataFimtxt.setBounds(158, 125, 285, 27);
        panel.add(dataFimtxt);
        
        horaPesquisa = new JLabel("Hora da Pesquisa: ");
        horaPesquisa.setBounds(10, 169, 138, 21);
        panel.add(horaPesquisa);

        horaPesquisatxt = new JTextField(10);
        horaPesquisatxt.setBounds(158, 163, 285, 27);
        panel.add(horaPesquisatxt);
        
        cliente = new JLabel("Cliente: ");
        cliente.setBounds(10, 207, 138, 21);
        panel.add(cliente);

        clientetxt = new JTextField(10);
        clientetxt.setBounds(158, 201, 285, 27);
        panel.add(clientetxt);
        
        botaoPesq = new JButton("Ok");
        botaoPesq.setBounds(230, 287, 63, 35);
        botaoPesq.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        panel.add(botaoPesq);
        

        getContentPane().add(panel);
        
        this.setVisible(false);
	}

}
