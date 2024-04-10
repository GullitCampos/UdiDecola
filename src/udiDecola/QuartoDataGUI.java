package udiDecola;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class QuartoDataGUI extends JFrame{
	private JLabel data, qtdSingle, qtdDuplo, qtdTriplo, qtdLuxo, diariaSingle, diariaDuplo, 
	diariaTriplo, diariaLuxo, desconto, temDesconto, cancelamento;
	private JTextField datatxt, qtdSingletxt, qtdDuplotxt, qtdTriplotxt, qtdLuxotxt, diariaSingletxt, diariaDuplotxt, 
	diariaTriplotxt, diariaLuxotxt, descontotxt;
	private JButton botaoQuarto;
	private JCheckBox temDescontotxt, cancelamentotxt;
	
	public QuartoDataGUI() {
		this.setTitle("Cadastro de Datas do Hotel");
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setSize(520,620);
		
        JPanel panel = new JPanel();
        panel.setLayout(null);
		
        data = new JLabel("Data: ");
        data.setBounds(10, 14, 121, 21);
        panel.add(data);

        datatxt = new JTextField(14);
        datatxt.setBounds(158, 11, 285, 27);
        panel.add(datatxt);
                
        qtdSingle = new JLabel("Quantidade single: ");
        qtdSingle.setBounds(10, 55, 121, 21);
        panel.add(qtdSingle);
        
        qtdSingletxt = new JTextField(14);
        qtdSingletxt.setBounds(158, 49, 285, 27);
        panel.add(qtdSingletxt);

        qtdDuplo = new JLabel("Quantidade duplo: ");
        qtdDuplo.setBounds(10, 93, 138, 21);
        panel.add(qtdDuplo);

        qtdDuplotxt = new JTextField(14);
        qtdDuplotxt.setBounds(158, 87, 285, 27);
        panel.add(qtdDuplotxt);

        qtdTriplo = new JLabel("Quantidade triplo: ");
        qtdTriplo.setBounds(10, 131, 138, 21);
        panel.add(qtdTriplo);

        qtdTriplotxt = new JTextField(10);
        qtdTriplotxt.setBounds(158, 125, 285, 27);
        panel.add(qtdTriplotxt);
        
        qtdLuxo = new JLabel("Quantidade luxo: ");
        qtdLuxo.setBounds(10, 169, 138, 21);
        panel.add(qtdLuxo);

        qtdLuxotxt = new JTextField(10);
        qtdLuxotxt.setBounds(158, 163, 285, 27);
        panel.add(qtdLuxotxt);
        
        diariaSingle = new JLabel("Diaria single: ");
        diariaSingle.setBounds(10, 207, 138, 21);
        panel.add(diariaSingle);

        diariaSingletxt = new JTextField(10);
        diariaSingletxt.setBounds(158, 201, 285, 27);
        panel.add(diariaSingletxt);
        
        diariaDuplo = new JLabel("Diaria duplo: ");
        diariaDuplo.setBounds(10, 245, 138, 21);
        panel.add(diariaDuplo);

        diariaDuplotxt = new JTextField(10);
        diariaDuplotxt.setBounds(158, 239, 285, 27);
        panel.add(diariaDuplotxt);
        
        diariaTriplo = new JLabel("Diaria triplo: ");
        diariaTriplo.setBounds(10, 283, 138, 21);
        panel.add(diariaTriplo);

        diariaTriplotxt = new JTextField(10);
        diariaTriplotxt.setBounds(158, 277, 285, 27);
        panel.add(diariaTriplotxt);
        
        diariaLuxo = new JLabel("Diaria luxo: ");
        diariaLuxo.setBounds(10, 321, 138, 21);
        panel.add(diariaLuxo);

        diariaLuxotxt = new JTextField(10);
        diariaLuxotxt.setBounds(158, 315, 285, 27);
        panel.add(diariaLuxotxt);

        desconto = new JLabel("Desconto: ");
        desconto.setBounds(10, 359, 138, 21);
        panel.add(desconto);

        descontotxt = new JTextField(10);
        descontotxt.setBounds(158, 353, 285, 27);
        panel.add(descontotxt);
        
        temDesconto = new JLabel("Tem desconto: ");
        temDesconto.setBounds(10, 397, 138, 21);
        panel.add(temDesconto);

        temDescontotxt = new JCheckBox("Sim");
        temDescontotxt.setBounds(158, 391, 285, 27);
        panel.add(temDescontotxt);
        
        cancelamento = new JLabel("Cancelamento: ");
        cancelamento.setBounds(10, 435, 138, 21);
        panel.add(cancelamento);

        cancelamentotxt = new JCheckBox("Sim");
        cancelamentotxt.setBounds(158, 429, 285, 27);
        panel.add(cancelamentotxt);
        
        botaoQuarto = new JButton("Cadastrar");
        botaoQuarto.setBounds(238, 488, 63, 35);
        botaoQuarto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        panel.add(botaoQuarto);
        

        getContentPane().add(panel);
        
        this.setVisible(true);
	}
}
