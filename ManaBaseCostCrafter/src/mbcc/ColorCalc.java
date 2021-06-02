package mbcc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;

public class ColorCalc implements ActionListener{
	
	public static String[] selectedColors = new String[]{"", "", "", "", ""};
	private String[] excludedColors = new String[]{"","","","",""};
	private int totalCost = 0;
	private int landCount = 0;
	private boolean firstList = true;

	public ColorCalc() {

	}
	
	private static boolean listGenerated = false;
	
	

	public static boolean isListGenerated() {
		return listGenerated;
	}



	public static void setListGenerated(boolean listGen) {
		listGenerated = listGen;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		MBCCButtons.listModel.clear();
		
		totalCost = 0;
		landCount = 0;
		Boolean[] bool = MBCCButtons.getTypeOfLandCheck();
	
		
		for (Lands land : MBCCFunc.lands) {
			for(int b = 0; b < bool.length; b++) {
				if (land.getCost() < MBCCButtons.budget) {

				}
			}
		}
		
		if (firstList == true) {
			JOptionPane.showMessageDialog(null, "Note, that depending on your selections, more than 30-40 lands may be suggested. It is up to you to"
					+ " determine how many lands your deck needs based on number of mana rocks, and the deck's mana curve, as well as the type of lands needed."
					, "Program Usage", JOptionPane.INFORMATION_MESSAGE);
			firstList = false;
		}
		
		
		if (totalCost > 0) {
			MBCCButtons.listModel.addElement("");
			MBCCButtons.listModel.addElement("-------------------------------------------------------------------------------------------------");
			MBCCButtons.listModel.addElement("");
			MBCCButtons.listModel.addElement("Total Cost: $" + Integer.toString(totalCost));
			MBCCButtons.listModel.addElement("Total Lands Suggested: " + Integer.toString(landCount));
			listGenerated = true;
		}
		else {
			listGenerated = false;
		}
		
		
		
		
	}

}
