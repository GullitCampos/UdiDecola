package udiDecola;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HotelGUI extends JFrame{
	private JLabel cnpj, nomeOficial, nomeDivulg, endereco, anoCriacao, numEstrelas, pets, nroQuartos, checkIn, 
	checkOut, msgDivulg, func;
	private JTextField cnpjtxt, nomeOficialtxt, nomeDivulgtxt, enderecotxt, anoCriacaotxt, numEstrelastxt, petstxt, 
	nroQuartostxt, checkIntxt, checkOuttxt, msgDivulgtxt, functxt;
	private JButton botaoHotel;

	
	public HotelGUI() {
		this.setTitle("Hotel");
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setSize(620,620);
		
        JPanel panel = new JPanel();
        panel.setLayout(null);
		
        cnpj = new JLabel("CNPJ: ");
        cnpj.setBounds(10, 14, 121, 21);
        panel.add(cnpj);

        cnpjtxt = new JTextField(14);
        cnpjtxt.setBounds(158, 11, 285, 27);
        panel.add(cnpjtxt);
                
        nomeOficial = new JLabel("Nome Oficial: ");
        nomeOficial.setBounds(10, 55, 121, 21);
        panel.add(nomeOficial);
        
        nomeOficialtxt = new JTextField(14);
        nomeOficialtxt.setBounds(158, 49, 285, 27);
        panel.add(nomeOficialtxt);

        nomeDivulg = new JLabel("Nome de Divulgação: ");
        nomeDivulg.setBounds(10, 93, 138, 21);
        panel.add(nomeDivulg);

        nomeDivulgtxt = new JTextField(14);
        nomeDivulgtxt.setBounds(158, 87, 285, 27);
        panel.add(nomeDivulgtxt);

        endereco = new JLabel("Endereco: ");
        endereco.setBounds(10, 131, 138, 21);
        panel.add(endereco);

        enderecotxt = new JTextField(10);
        enderecotxt.setBounds(158, 125, 285, 27);
        panel.add(enderecotxt);
        
        anoCriacao = new JLabel("Ano de Criação: ");
        anoCriacao.setBounds(10, 169, 138, 21);
        panel.add(anoCriacao);

        anoCriacaotxt = new JTextField(10);
        anoCriacaotxt.setBounds(158, 163, 285, 27);
        panel.add(anoCriacaotxt);
        
        numEstrelas = new JLabel("Número de Estrelas: ");
        numEstrelas.setBounds(10, 207, 138, 21);
        panel.add(numEstrelas);

        numEstrelastxt = new JTextField(10);
        numEstrelastxt.setBounds(158, 201, 285, 27);
        panel.add(numEstrelastxt);
        
        pets = new JLabel("Pets: ");
        pets.setBounds(10, 245, 138, 21);
        panel.add(pets);

        petstxt = new JTextField(10);
        petstxt.setBounds(158, 239, 285, 27);
        panel.add(petstxt);
        
        nroQuartos = new JLabel("Número de Quartos: ");
        nroQuartos.setBounds(10, 283, 138, 21);
        panel.add(nroQuartos);

        nroQuartostxt = new JTextField(10);
        nroQuartostxt.setBounds(158, 277, 285, 27);
        panel.add(nroQuartostxt);
        
        checkIn = new JLabel("Check-In: ");
        checkIn.setBounds(10, 321, 138, 21);
        panel.add(checkIn);

        checkIntxt = new JTextField(10);
        checkIntxt.setBounds(158, 315, 285, 27);
        panel.add(checkIntxt);

        checkOut = new JLabel("Check-Out: ");
        checkOut.setBounds(10, 359, 138, 21);
        panel.add(checkOut);

        checkOuttxt = new JTextField(10);
        checkOuttxt.setBounds(158, 353, 285, 27);
        panel.add(checkOuttxt);
        
        msgDivulg = new JLabel("Mensagem de Divulgação: ");
        msgDivulg.setBounds(10, 397, 138, 21);
        panel.add(msgDivulg);

        msgDivulgtxt = new JTextField(10);
        msgDivulgtxt.setBounds(158, 391, 285, 27);
        panel.add(msgDivulgtxt);
        
        func = new JLabel("Funcionarios: ");
        func.setBounds(10, 435, 138, 21);
        panel.add(func);

        functxt = new JTextField(10);
        functxt.setBounds(158, 429, 285, 27);
        panel.add(functxt);
        
        botaoHotel = new JButton("Ok");
        botaoHotel.setBounds(380, 487, 63, 35);
        botaoHotel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        panel.add(botaoHotel);
        

        getContentPane().add(panel);
        
        this.setVisible(false);
	}
}
