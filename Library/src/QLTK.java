import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Font;

public class QLTK extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public QLTK() {
		setLayout(null);
		setBounds(100, 100, 714, 521);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(36, 41, 559, 314);
		add(panel_4);
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setBounds(36, 99, 482, 160);
		panel_4.add(table);
		
		JButton btnNewButton = new JButton("S\u1EEDa");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(205, 37, 100, 30);
		panel_4.add(btnNewButton);
		
		JButton btnXa = new JButton("X\u00F3a");
		btnXa.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnXa.setBounds(341, 37, 100, 30);
		panel_4.add(btnXa);

	}
}
