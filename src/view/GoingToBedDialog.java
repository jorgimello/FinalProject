package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.Window;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class GoingToBedDialog extends Dialog {
	private static final long serialVersionUID = 1L;

	public GoingToBedDialog(Window owner, String title, ActionListener l) {
		super(owner, title, l);
		setupDialog();
	}

	@Override
	public void setupDialog() {
		JPanel contentPanel = new JPanel();
		JPanel btnPanel = new JPanel();
		contentPanel.setLayout(new GridBagLayout());
		btnPanel.setLayout(new FlowLayout());
		
		contentPanel.add(new JLabel(" Data recorded! Have a good night! "));
		btnPanel.add(btnOK);
		
		this.add(contentPanel, BorderLayout.CENTER);
		this.add(btnPanel, BorderLayout.SOUTH);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
