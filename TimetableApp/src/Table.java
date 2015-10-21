import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.GridBagLayout;
import javax.swing.JTable;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class Table extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Table frame = new Table();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Table() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 11, 102, 50);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setHgap(50);
		flowLayout.setAlignment(FlowLayout.LEFT);
		getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(100, 11, 102, 50);
		
		flowLayout.setHgap(50);
		flowLayout.setAlignment(FlowLayout.LEFT);
		getContentPane().add(panel_1);

	}

}
