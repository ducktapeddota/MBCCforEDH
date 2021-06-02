package mbcc;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class MBCCFunc implements ActionListener {
	
	private int color;
	public static int [] toggleStatus = new int[5];
	public static Set<Lands> lands = new HashSet<Lands>();
	private static int prelaunchCalc = 0;

	
	public static void populateList() {

	}
	
	public static void storeLands() throws IOException {
		JFileChooser fc = new JFileChooser();
		fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		fc.setCurrentDirectory(new java.io.File("."));
		fc.setDialogTitle("Choose a file path to export list");
		fc.setAcceptAllFileFilterUsed(false);
		if (ColorCalc.isListGenerated() == true) {
		   if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) { 
			      System.out.println("getCurrentDirectory(): " 
			         +  fc.getCurrentDirectory());
			      System.out.println("getSelectedFile() : " 
			         +  fc.getSelectedFile());
			      if (toggleStatus[0] == 1 || toggleStatus[1] == 1 || toggleStatus[2] == 1 || toggleStatus[3] == 1 || toggleStatus[4] == 1) {
			      PrintWriter writer = new PrintWriter(new FileWriter(new File(fc.getSelectedFile(), "lands to obtain.txt")));
			      for (int i = 0; i < MBCCButtons.listModel.toArray().length; i++) {
			    	  writer.println(MBCCButtons.listModel.getElementAt(i));
			      	}
			      writer.close();
			      }
			     }
			    else {
					JOptionPane.showMessageDialog(null, "No Directory has been selected."
							, "Program Usage", JOptionPane.INFORMATION_MESSAGE);
			      }
			     
		}
		else {
			JOptionPane.showMessageDialog(null, "No list has been generated yet."
					, "Program Usage", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	

	public MBCCFunc(int white) {
		// TODO Auto-generated constructor stub
		this.color = white;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		switch (color) {
		case 0:
			if (toggleStatus[0] == 0) {
				MBCCButtons.W.setBackground(Color.WHITE);
				toggleStatus[0] = 1;
			}
			else {
				toggleStatus[0] = 0;
				MBCCButtons.W.setBackground(Color.GRAY);
			}
			break;
		case 1:
			if (toggleStatus[1] == 0) {
				MBCCButtons.U.setBackground(Color.BLUE);
				toggleStatus[1] = 1;
			}
			else {
				toggleStatus[1] = 0;
				MBCCButtons.U.setBackground(Color.GRAY);
			}
			break;
		case 2:
			if (toggleStatus[2] == 0) {
				MBCCButtons.B.setBackground(Color.BLACK);
				toggleStatus[2] = 1;
			}
			else {
				toggleStatus[2] = 0;
				MBCCButtons.B.setBackground(Color.GRAY);
			}
			break;
		case 3:
			if (toggleStatus[3] == 0) {
				MBCCButtons.R.setBackground(Color.RED);
				toggleStatus[3] = 1;
			}
			else {
				toggleStatus[3] = 0;
				MBCCButtons.R.setBackground(Color.GRAY);
			}
			break;
		case 4:
			if (toggleStatus[4] == 0) {
				MBCCButtons.G.setBackground(Color.GREEN);
				toggleStatus[4] = 1;
			}
			else {
				toggleStatus[4] = 0;
				MBCCButtons.G.setBackground(Color.GRAY);
			}
			break;
			
			
			
			
			
		}
	}
	

}
