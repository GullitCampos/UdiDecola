package udiDecola;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CompanhiaAereaGUI extends JFrame{
	private JLabel cnpj, oficial, nomeDivul, dataCria;
	private JTextField cnpjtxt, oficialtxt, nomeDivultxt, dataCriatxt;
	private JButton botaoComp;
	String cnpj1;
    String oficial1;
    String nomeDivul1;
    LocalDate dataCria1;

	public CompanhiaAereaGUI(){
		this.setTitle("Companhia Aerea");
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setSize(520,320);
		
        JPanel panel = new JPanel();
        panel.setLayout(null);
		
        cnpj = new JLabel("CNPJ: ");
        cnpj.setBounds(10, 14, 121, 21);
        panel.add(cnpj);

        cnpjtxt = new JTextField(14);
        cnpjtxt.setBounds(158, 11, 285, 27);
        panel.add(cnpjtxt);
                
        oficial = new JLabel("Oficial: ");
        oficial.setBounds(10, 55, 121, 21);
        panel.add(oficial);
        
        oficialtxt = new JTextField(14);
        oficialtxt.setBounds(158, 49, 285, 27);
        panel.add(oficialtxt);

        nomeDivul = new JLabel("Nome Divulgação: ");
        nomeDivul.setBounds(10, 93, 138, 21);
        panel.add(nomeDivul);

        nomeDivultxt = new JTextField(14);
        nomeDivultxt.setBounds(158, 87, 285, 27);
        panel.add(nomeDivultxt);

        dataCria = new JLabel("Data: ");
        dataCria.setBounds(10, 131, 138, 21);
        panel.add(dataCria);

        dataCriatxt = new JTextField(10);
        dataCriatxt.setBounds(158, 125, 285, 27);
        panel.add(dataCriatxt);

        botaoComp = new JButton("Ok");
        botaoComp.setBounds(219, 194, 63, 35);
        botaoComp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        panel.add(botaoComp);
        

        getContentPane().add(panel);
        
        this.setVisible(false);
		
	}

    
}
