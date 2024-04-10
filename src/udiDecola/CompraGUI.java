package udiDecola;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CompraGUI extends JFrame{
	private JLabel ida, retorno, cliente, hotel, quantidadePassagens, quantidadeQuartosSingle, 
	quantidadeQuartosDuplo, quantidadeQuartosTriplo, quantidadeQuartosLuxo;
	private JTextField idatxt, retornotxt, clientetxt, hoteltxt, quantidadePassagenstxt, quantidadeQuartosSingletxt, 
	quantidadeQuartosDuplotxt, quantidadeQuartosTriplotxt, quantidadeQuartosLuxotxt;
	private JButton botaoCompra;
	
	public CompraGUI(){
		this.setTitle("Cadastro de Compras");
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setSize(720,520);
		
        JPanel panel = new JPanel();
        panel.setLayout(null);
		
        ida = new JLabel("Ida: ");
        ida.setBounds(10, 14, 121, 21);
        panel.add(ida);

        idatxt = new JTextField(14);
        idatxt.setBounds(158, 11, 285, 27);
        panel.add(idatxt);
                
        retorno = new JLabel("Retorno: ");
        retorno.setBounds(10, 55, 121, 21);
        panel.add(retorno);
        
        retornotxt = new JTextField(14);
        retornotxt.setBounds(158, 49, 285, 27);
        panel.add(retornotxt);

        cliente = new JLabel("Cliente: ");
        cliente.setBounds(10, 93, 138, 21);
        panel.add(cliente);

        clientetxt = new JTextField(14);
        clientetxt.setBounds(158, 87, 285, 27);
        panel.add(clientetxt);

        hotel = new JLabel("Hotel: ");
        hotel.setBounds(10, 131, 138, 21);
        panel.add(hotel);

        hoteltxt = new JTextField(10);
        hoteltxt.setBounds(158, 125, 285, 27);
        panel.add(hoteltxt);
        
        quantidadePassagens = new JLabel("Qtd Passagens: ");
        quantidadePassagens.setBounds(10, 169, 138, 21);
        panel.add(quantidadePassagens);

        quantidadePassagenstxt = new JTextField(10);
        quantidadePassagenstxt.setBounds(158, 163, 285, 27);
        panel.add(quantidadePassagenstxt);
        
        quantidadeQuartosSingle = new JLabel("Qtd Quartos Single: ");
        quantidadeQuartosSingle.setBounds(10, 207, 138, 21);
        panel.add(quantidadeQuartosSingle);

        quantidadeQuartosSingletxt = new JTextField(10);
        quantidadeQuartosSingletxt.setBounds(158, 201, 285, 27);
        panel.add(quantidadeQuartosSingletxt);
        
        quantidadeQuartosDuplo = new JLabel("Qtd Quartos Duplo: ");
        quantidadeQuartosDuplo.setBounds(10, 245, 138, 21);
        panel.add(quantidadeQuartosDuplo);

        quantidadeQuartosDuplotxt = new JTextField(10);
        quantidadeQuartosDuplotxt.setBounds(158, 239, 285, 27);
        panel.add(quantidadeQuartosDuplotxt);
        
        quantidadeQuartosTriplo = new JLabel("Qtd Quartos Triplo: ");
        quantidadeQuartosTriplo.setBounds(10, 283, 138, 21);
        panel.add(quantidadeQuartosTriplo);

        quantidadeQuartosTriplotxt = new JTextField(10);
        quantidadeQuartosTriplotxt.setBounds(158, 277, 285, 27);
        panel.add(quantidadeQuartosTriplotxt);
        
        quantidadeQuartosLuxo = new JLabel("Qtd Quartos Luxo: ");
        quantidadeQuartosLuxo.setBounds(10, 321, 138, 21);
        panel.add(quantidadeQuartosLuxo);

        quantidadeQuartosLuxotxt = new JTextField(10);
        quantidadeQuartosLuxotxt.setBounds(158, 315, 285, 27);
        panel.add(quantidadeQuartosLuxotxt);

        botaoCompra = new JButton("Ok");
        botaoCompra.setBounds(280, 387, 63, 35);
        botaoCompra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        panel.add(botaoCompra);
        

        getContentPane().add(panel);
        
        this.setVisible(false);
		
	}
}
