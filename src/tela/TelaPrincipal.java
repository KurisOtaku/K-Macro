package tela;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JTextField;

public class TelaPrincipal extends javax.swing.JFrame{
	private JTextField textField;
	public TelaPrincipal() {
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblSelecioneOnde = new JLabel("1. Selecione onde salvar o arquivo. (Ser\u00E1 salvo na extens\u00E3o \"CSV\" )");
		panel.add(lblSelecioneOnde);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
	}

}
