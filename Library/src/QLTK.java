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
		panel_4.setBounds(10, 10, 694, 481);
		add(panel_4);
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setBounds(31, 99, 634, 307);
		panel_4.add(table);
		
		JButton btnNewButton = new JButton("S\u1EEDa");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(392, 36, 100, 30);
		panel_4.add(btnNewButton);
		
		JButton btnXa = new JButton("X\u00F3a");
		btnXa.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnXa.setBounds(528, 36, 100, 30);
		panel_4.add(btnXa);

	}
}
