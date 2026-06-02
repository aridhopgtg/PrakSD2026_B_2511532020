package pekan8_2511532020;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class BubbleSortGUI_2511532020 extends JFrame {

	private static final long serialVersionUID = 1L;
	private int[] array_2020;
	private JLabel[] labelArray_2020;
	private JButton stepButton_2020, resetButton_2020, setButton_2020;
	private JTextField inputField_2020;
	private JPanel panelArray_2020;
	private JTextArea stepArea_2020;

	private int i_2020 = 0, j_2020 = 0;
	private boolean sorting_2020 = false;
	private int stepCount_2020 = 1;

	public BubbleSortGUI_2511532020() {
		setTitle("Buble Sort Langkah per Langkah");
		setSize(750, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());

		// panel input
		JPanel inputPanel_2020 = new JPanel(new FlowLayout());
		inputField_2020 = new JTextField(30);
		setButton_2020 = new JButton("Set Array");
		inputPanel_2020.add(new JLabel("Masukan angka (pisahkan dengan koma)"));
		inputPanel_2020.add(inputField_2020);
		inputPanel_2020.add(setButton_2020);

		// panel array visual
		panelArray_2020 = new JPanel();
		panelArray_2020.setLayout(new FlowLayout());

		// panel kontrol
		JPanel controlPanel_2020 = new JPanel();
		stepButton_2020 = new JButton("Langkah selanjutnya");
		resetButton_2020 = new JButton("Reset");
		controlPanel_2020.add(stepButton_2020);
		controlPanel_2020.add(resetButton_2020);

		// area text untuk log langkah langkah
		stepArea_2020 = new JTextArea(8, 60);
		stepArea_2020.setEditable(false);
		stepArea_2020.setFont(new Font("Monospaced", Font.PLAIN, 14));
		JScrollPane scrollPane_2020 = new JScrollPane(stepArea_2020);

		// tambahkan panel ke frame
		add(inputPanel_2020, BorderLayout.NORTH);
		add(panelArray_2020, BorderLayout.CENTER);
		add(controlPanel_2020, BorderLayout.SOUTH);
		add(scrollPane_2020, BorderLayout.EAST);

		// event set array
		setButton_2020.addActionListener(e -> setArrayFromInput_2020());

		// event selanjutnya
		stepButton_2020.addActionListener(e -> performStep_2020());

		// event reset
		resetButton_2020.addActionListener(e -> reset_2020());
	}

	private void setArrayFromInput_2020() {
		String text_2020 = inputField_2020.getText().trim();
		if (text_2020.isEmpty()) return;
		String[] parts_2020 = text_2020.split(",");
		array_2020 = new int[parts_2020.length];
		try {
			for (int k = 0; k < parts_2020.length; k++) {
				array_2020[k] = Integer.parseInt(parts_2020[k].trim());
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Masukkan hanya angka "
					+ "yang dipisahkan koma!", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}

		i_2020 = 0;
		j_2020 = 0;
		stepCount_2020 = 1;
		sorting_2020 = true;
		stepButton_2020.setEnabled(true);
		stepArea_2020.setText("");
		panelArray_2020.removeAll();
		labelArray_2020 = new JLabel[array_2020.length];
		for (int k = 0; k < array_2020.length; k++) {
			labelArray_2020[k] = new JLabel(String.valueOf(array_2020[k]));
			labelArray_2020[k].setFont(new Font("Arial", Font.BOLD, 24));
			labelArray_2020[k].setOpaque(true);
			labelArray_2020[k].setBackground(Color.WHITE);
			labelArray_2020[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			labelArray_2020[k].setPreferredSize(new Dimension(50, 50));
			labelArray_2020[k].setHorizontalAlignment(SwingConstants.CENTER);
			panelArray_2020.add(labelArray_2020[k]);
		}

		panelArray_2020.revalidate();
		panelArray_2020.repaint();
	}

	private void performStep_2020() {
		if (!sorting_2020 || i_2020 >= array_2020.length - 1) {
			sorting_2020 = false;
			stepButton_2020.setEnabled(false);
			JOptionPane.showMessageDialog(this, "Sorting selesai!");
			return;
		}

		resetHighlights_2020();
		StringBuilder stepLog_2020 = new StringBuilder();

		labelArray_2020[j_2020].setBackground(Color.CYAN);
		labelArray_2020[j_2020 + 1].setBackground(Color.CYAN);

		if (array_2020[j_2020] > array_2020[j_2020 + 1]) {
			// Swap
			int temp_2020 = array_2020[j_2020];
			array_2020[j_2020] = array_2020[j_2020 + 1];
			array_2020[j_2020 + 1] = temp_2020;
			labelArray_2020[j_2020].setBackground(Color.RED);
			labelArray_2020[j_2020 + 1].setBackground(Color.RED);
			stepLog_2020.append("Langkah ").append(stepCount_2020).append(": Menukar elemen ke-")
					.append(j_2020).append(" (").append(array_2020[j_2020 + 1]).append(") dengan ke-")
					.append(j_2020 + 1).append(" (").append(array_2020[j_2020]).append(")\n");
		} else {
			stepLog_2020.append("Langkah ").append(stepCount_2020).append(": Tidak ada pertukaran antara ke-")
					.append(j_2020).append(" dan ke-").append(j_2020 + 1).append("\n");
		}

		stepLog_2020.append("Hasil: ").append(arrayToString_2020(array_2020)).append("\n\n");
		stepArea_2020.append(stepLog_2020.toString());
		updateLabels_2020();

		j_2020++;
		if (j_2020 >= array_2020.length - i_2020 - 1) {
			j_2020 = 0;
			i_2020++;
		}
		stepCount_2020++;

		if (i_2020 >= array_2020.length - 1) {
			sorting_2020 = false;
			stepButton_2020.setEnabled(false);
			JOptionPane.showMessageDialog(this, "Sorting selesai!");
		}
	}

	private void updateLabels_2020() {
		for (int k = 0; k < array_2020.length; k++) {
			labelArray_2020[k].setText(String.valueOf(array_2020[k]));
		}
	}

	private void resetHighlights_2020() {
		for (JLabel label : labelArray_2020) {
			label.setBackground(Color.WHITE);
		}
	}

	private void reset_2020() {
		inputField_2020.setText("");
		panelArray_2020.removeAll();
		panelArray_2020.revalidate();
		panelArray_2020.repaint();
		stepArea_2020.setText("");
		stepButton_2020.setEnabled(false);
		sorting_2020 = false;
		i_2020 = 0;
		j_2020 = 0;
		stepCount_2020 = 1;
	}

	private String arrayToString_2020(int[] arr) {
		StringBuilder sb_2020 = new StringBuilder();
		for (int k = 0; k < arr.length; k++) {
			sb_2020.append(arr[k]);
			if (k < arr.length - 1) sb_2020.append(", ");
		}
		return sb_2020.toString();
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			BubbleSortGUI_2511532020 gui = new BubbleSortGUI_2511532020();
			gui.setVisible(true);
		});
	}
}