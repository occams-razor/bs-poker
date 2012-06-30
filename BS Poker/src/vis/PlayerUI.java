package vis;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.WindowConstants;

import poker.Player;

/**
 * this PlayerUI provides a view for the Player, as well as controls for it.
 * {@link Player}
 * 
 * @author ajc
 * 
 */
public class PlayerUI extends JFrame {
	private JList list;
	private DefaultListModel listModel;

	private static final String hireString = "Hire";
	private static final String fireString = "Fire";
	private JButton fireButton;
	private JTextField employeeName;

	private PlayerStats playerstats;

	FlowLayout experimentLayout = new FlowLayout();

	public PlayerUI(Player player) {
		// super(new BorderLayout());

		playerstats = new PlayerStats(player);

		listModel = new DefaultListModel();
		listModel.addElement("Jane Doe");
		listModel.addElement("John Smith");
		listModel.addElement("Kathy Green");

		// Create the list and put it in a scroll pane.
		list = new JList(listModel);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setSelectedIndex(0);
		// list.addListSelectionListener(this);
		list.setVisibleRowCount(5);
		JScrollPane listScrollPane = new JScrollPane(playerstats);

		JList list2 = new JList(listModel);
		list2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list2.setSelectedIndex(0);
		// list.addListSelectionListener(this);
		list2.setVisibleRowCount(10);

		/**
		 * 
		 * 
		 * 
		 */

		final JPanel compsToExperiment = new JPanel();
		compsToExperiment.setLayout(experimentLayout);
		// experimentLayout.setAlignment(FlowLayout.TRAILING);

		JPanel controls = new JPanel();
		controls.setLayout(new FlowLayout());

		compsToExperiment.add(list);
		compsToExperiment.add(list2);
		controls.add(playerstats);

		compsToExperiment
				.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

		getContentPane().add(compsToExperiment, BorderLayout.AFTER_LINE_ENDS);
		getContentPane().add(controls, BorderLayout.NORTH);
		// compsToExperiment.validate();
		// compsToExperiment.repaint();
		//
		// JButton hireButton = new JButton(hireString);
		// // HireListener hireListener = new HireListener(hireButton);
		// // hireButton.setActionCommand(hireString);
		// // hireButton.addActionListener(hireListener);
		// // hireButton.setEnabled(false);
		//
		// fireButton = new JButton(fireString);
		// fireButton.setActionCommand(fireString);
		// // fireButton.addActionListener(new FireListener());
		//
		// employeeName = new JTextField(10);
		// // employeeName.addActionListener(hireListener);
		// // employeeName.getDocument().addDocumentListener(hireListener);
		// // String name = listModel.getElementAt(list.getSelectedIndex())
		// // .toString();
		//
		// // Create a panel that uses BoxLayout.
		// JPanel buttonPane = new JPanel();
		// buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.LINE_AXIS));
		// buttonPane.add(fireButton);
		// buttonPane.add(Box.createHorizontalStrut(5));
		// buttonPane.add(new JSeparator(SwingConstants.VERTICAL));
		// buttonPane.add(Box.createHorizontalStrut(5));
		// buttonPane.add(employeeName);
		// buttonPane.add(hireButton);
		// buttonPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

		// BoxLayout boxLayout = new BoxLayout(getContentPane(),
		// BoxLayout.Y_AXIS); // top
		// // to
		// // bottom
		// setLayout(boxLayout);
		// add(playerstats);
		// add(list);
		// add(list2);

		// int align = FlowLayout.CENTER; // or LEFT, RIGHT
		// JPanel panel = new JPanel(new FlowLayout(align));
		// FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		// getContentPane().setLayout(layout);
		// getContentPane().add(playerstats);
		// getContentPane().add(list);
		// panel.add(component1);
		// panel.add(component2);

		// GroupLayout layout = new GroupLayout(getContentPane());
		// getContentPane().setLayout(layout);
		// layout.setAutoCreateGaps(true);
		// layout.setAutoCreateContainerGaps(true);

		// layout.setHorizontalGroup(layout.createSequentialGroup()
		// .addComponent(playerstats).addComponent(list));

		// layout.createSequentialGroup()
		// .add(playerstats)
		// .addPreferredGap(LayoutStyle.RELATED, GroupLayout.DEFAULT_SIZE,
		// Short.MAX_VALUE).add(list);

		// layout.setHorizontalGroup(layout.createSequentialGroup()
		// .addComponent(list).addComponent(playerstats));

		// layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
		// .add(playerstats, GroupLayout.DEFAULT_SIZE,
		// GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		// .add(list, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
		// Short.MAX_VALUE);

		// layout.setHorizontalGroup(layout
		// .createSequentialGroup()
		// .addComponent(playerstats)
		// .addGroup(
		// layout.createParallelGroup(LEADING)
		// .addComponent(textField)
		// .addGroup(
		// layout.createSequentialGroup()
		// .addGroup(
		// layout.createParallelGroup(
		// LEADING)
		// .addComponent(
		// caseCheckBox)
		// .addComponent(
		// wholeCheckBox))
		// .addGroup(
		// layout.createParallelGroup(
		// LEADING)
		// .addComponent(
		// wrapCheckBox)
		// .addComponent(
		// backCheckBox))))
		// .addGroup(
		// layout.createParallelGroup(LEADING)
		// .addComponent(findButton)
		// .addComponent(cancelButton)));

		setTitle("PlayerUI");
		pack();
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
