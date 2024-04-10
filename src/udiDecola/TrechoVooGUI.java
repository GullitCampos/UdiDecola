package udiDecola;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TrechoVooGUI extends JFrame{
	private JLabel codigo, origem, destino, horaSaida, horaChegada, cAearea, listaVoos;
	private JTextField codigotxt, origemtxt, destinotxt, horaSaidatxt, horaChegadatxt, cAeareatxt, listaVoostxt;
	private JButton botaoTrec;
	
	public TrechoVooGUI() {
		this.setTitle("Trecho de Voo");
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setSize(620,420);
		
        JPanel panel = new JPanel();
        panel.setLayout(null);
		
        codigo = new JLabel("Código: ");
        codigo.setBounds(10, 14, 121, 21);
        panel.add(codigo);

        codigotxt = new JTextField(14);
        codigotxt.setBounds(158, 11, 285, 27);
        panel.add(codigotxt);
                
        origem = new JLabel("Código de origem: ");
        origem.setBounds(10, 55, 121, 21);
        panel.add(origem);
        
        origemtxt = new JTextField(14);
        origemtxt.setBounds(158, 49, 285, 27);
        panel.add(origemtxt);

        destino = new JLabel("Código de destino: ");
        destino.setBounds(10, 93, 138, 21);
        panel.add(destino);

        destinotxt = new JTextField(14);
        destinotxt.setBounds(158, 87, 285, 27);
        panel.add(destinotxt);

        horaSaida = new JLabel("Hora de saída: ");
        horaSaida.setBounds(10, 131, 138, 21);
        panel.add(horaSaida);

        horaSaidatxt = new JTextField(10);
        horaSaidatxt.setBounds(158, 125, 285, 27);
        panel.add(horaSaidatxt);
        
        horaChegada = new JLabel("Hora de chegada: ");
        horaChegada.setBounds(10, 169, 138, 21);
        panel.add(horaChegada);

        horaChegadatxt = new JTextField(10);
        horaChegadatxt.setBounds(158, 163, 285, 27);
        panel.add(horaChegadatxt);
        
        cAearea = new JLabel("Companhia aerea: ");
        cAearea.setBounds(10, 207, 138, 21);
        panel.add(cAearea);

        cAeareatxt = new JTextField(10);
        cAeareatxt.setBounds(158, 201, 285, 27);
        panel.add(cAeareatxt);
        
        listaVoos = new JLabel("Lista de Voos: ");
        listaVoos.setBounds(10, 245, 138, 21);
        panel.add(listaVoos);

        listaVoostxt = new JTextField(10);
        listaVoostxt.setBounds(158, 239, 285, 27);
        panel.add(listaVoostxt);

        botaoTrec = new JButton("Ok");
        botaoTrec.setBounds(220, 287, 63, 35);
        botaoTrec.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        panel.add(botaoTrec);
        

        getContentPane().add(panel);
        
        this.setVisible(false);
		
	}

}
