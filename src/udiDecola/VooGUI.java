package udiDecola;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VooGUI extends JFrame{
	private JLabel tre, data, hrChegada, hrPartida, numVagas, precoPassagem;
	private JTextField tretxt, datatxt, hrChegadatxt, hrPartidatxt, numVagastxt, precoPassagemtxt;
	private JButton botaoTrec;
	
	public VooGUI() {
		this.setTitle("Cadastro de Vôos");
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setSize(520,420);
		
        JPanel panel = new JPanel();
        panel.setLayout(null);
		
        tre = new JLabel("Trecho de Voo: ");
        tre.setBounds(10, 14, 121, 21);
        panel.add(tre);

        tretxt = new JTextField(14);
        tretxt.setBounds(158, 11, 285, 27);
        panel.add(tretxt);
                
        data = new JLabel("Data: ");
        data.setBounds(10, 55, 121, 21);
        panel.add(data);
        
        datatxt = new JTextField(14);
        datatxt.setBounds(158, 49, 285, 27);
        panel.add(datatxt);

        hrChegada = new JLabel("Hora de Chegada: ");
        hrChegada.setBounds(10, 93, 138, 21);
        panel.add(hrChegada);

        hrChegadatxt = new JTextField(14);
        hrChegadatxt.setBounds(158, 87, 285, 27);
        panel.add(hrChegadatxt);

        hrPartida = new JLabel("Hora de partida: ");
        hrPartida.setBounds(10, 131, 138, 21);
        panel.add(hrPartida);

        hrPartidatxt = new JTextField(10);
        hrPartidatxt.setBounds(158, 125, 285, 27);
        panel.add(hrPartidatxt);
        
        numVagas = new JLabel("Número de Vagas: ");
        numVagas.setBounds(10, 169, 138, 21);
        panel.add(numVagas);

        numVagastxt = new JTextField(10);
        numVagastxt.setBounds(158, 163, 285, 27);
        panel.add(numVagastxt);
        
        precoPassagem = new JLabel("Preço da Passagem: ");
        precoPassagem.setBounds(10, 207, 138, 21);
        panel.add(precoPassagem);

        precoPassagemtxt = new JTextField(10);
        precoPassagemtxt.setBounds(158, 207, 285, 27);
        panel.add(precoPassagemtxt);
        
        botaoTrec = new JButton("Cadastrar");
        botaoTrec.setBounds(220, 287, 110, 35);
        botaoTrec.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        panel.add(botaoTrec);
        

        getContentPane().add(panel);
        
        this.setVisible(false);
		
	}
}
