package mbcc;

import java.awt.Container;

public class ProgramGUI {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MBCCButtons mb = new MBCCButtons();
		@SuppressWarnings("unused")
		Container window = mb.getContentPane();
		MBCCFunc.populateList();
		mb.setTitle("Mana Base Cost Calculator");
		mb.pack();
		mb.setVisible(true);
		mb.setResizable(false);
	}
	
	
}
