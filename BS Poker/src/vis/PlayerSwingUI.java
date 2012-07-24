package vis;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.WindowConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import poker.Playable;
import poker.Player;
import poker.RoundState;

/**
 * this PlayerUI provides a view for the Player, as well as controls for it.
 * {@link Player}
 * 
 * @author ajc
 * 
 */
public class PlayerSwingUI extends JFrame implements ListSelectionListener,
		PlayerUI {

	private DefaultListModel handTypeModel;
	private JList handTypeList;

	private DefaultListModel value1;
	private JList value1List;

	private DefaultListModel value2;
	private JList value2List;

	// private JList list;
	// private DefaultListModel listModel;

	private PlayerStats playerstats;

	FlowLayout experimentLayout = new FlowLayout();

	public PlayerSwingUI(Player player) {
		// super(new BorderLayout());

		playerstats = new PlayerStats(player);

		handTypeModel = new DefaultListModel();
		handTypeModel.addElement("High");
		handTypeModel.addElement("Pair");
		handTypeModel.addElement("Two Pair");
		handTypeModel.addElement("Three of a kind");
		handTypeModel.addElement("Straight");
		handTypeModel.addElement("Flush");
		handTypeModel.addElement("Full house");
		handTypeModel.addElement("Four of a kind");
		handTypeModel.addElement("Straight flush");
		handTypeModel.addElement("Royal flush");

		handTypeList = new JList(handTypeModel);
		handTypeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		handTypeList.setSelectedIndex(0);
		handTypeList.setVisibleRowCount(10);
		handTypeList.addListSelectionListener(this);

		value1 = new DefaultListModel();
		value1.addElement("Please select below...");
		value1List = new JList(value1);
		value1List.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		value1List.setSelectedIndex(0);
		value1List.setVisibleRowCount(10);

		value2 = new DefaultListModel();
		value2.addElement("Please select below...");
		value2List = new JList(value2);
		value2List.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		value2List.setSelectedIndex(0);
		value2List.setVisibleRowCount(10);

		final JPanel compsToExperiment = new JPanel();
		compsToExperiment.setLayout(experimentLayout);
		// experimentLayout.setAlignment(FlowLayout.TRAILING);

		JPanel controls = new JPanel();
		controls.setLayout(new FlowLayout());

		compsToExperiment.add(handTypeList);
		compsToExperiment.add(value1List);
		compsToExperiment.add(value2List);
		controls.add(playerstats);

		compsToExperiment
				.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

		getContentPane().add(compsToExperiment, BorderLayout.AFTER_LINE_ENDS);
		getContentPane().add(controls, BorderLayout.NORTH);

		// handTypeModel.addElement("lol");

		handTypeList.clearSelection();

		setTitle("PlayerUI");
		pack();
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// System.out.println(e);
		if (!e.getValueIsAdjusting() && e.getSource() == handTypeList) {
			value1.removeAllElements();
			for (int i = 2; i < 14; i++) {
				int index = handTypeList.getSelectedIndex();
				if (index != 0) {
					value1.addElement(handTypeModel.get(index) + "" + i);
				}
			}
			// System.out.println(handTypeList.getSelectedIndex());
		}
		// TODO Auto-generated method stub

	}

	@Override
	public Playable getPlay(RoundState state) {
		handTypeList.clearSelection();
		// TODO Auto-generated method stub
		return null;
	}

}
