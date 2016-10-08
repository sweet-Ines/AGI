import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;

public class Grafik implements ActionListener {

	public Grafik (){
		JFrame frame = new JFrame("Game of Life");
		frame.setSize(500, 500);
		frame.setVisible(true);
		JPanel panel = new JPanel();
		JTextField breitenEingabe = new JTextField("Bitte Breite eingeben.");
		panel.add(breitenEingabe);
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		

	}

}
