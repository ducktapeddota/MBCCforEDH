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
					if (bool[b] == true && land.getType() == b) {
					if (MBCCFunc.toggleStatus[0] == 1 && MBCCFunc.toggleStatus[1] == 1 && MBCCFunc.toggleStatus[2] == 0 && MBCCFunc.toggleStatus[3] == 0 && MBCCFunc.toggleStatus[4] == 0) {
					// azorius
						if (land.getColors() == "wu"){
							MBCCButtons.listModel.addElement(land.getName());
							totalCost = totalCost + land.getCost();
							landCount = landCount + 1;
						}
					}
					else if (MBCCFunc.toggleStatus[0] == 1 && MBCCFunc.toggleStatus[1] == 0 && MBCCFunc.toggleStatus[2] == 1 && MBCCFunc.toggleStatus[3] == 0 && MBCCFunc.toggleStatus[4] == 0) {
					// orzhov
						if (land.getColors() == "wb") {
							MBCCButtons.listModel.addElement(land.getName());
							totalCost = totalCost + land.getCost();
							landCount = landCount + 1;
						}
					}
					else if (MBCCFunc.toggleStatus[0] == 1 && MBCCFunc.toggleStatus[1] == 0 && MBCCFunc.toggleStatus[2] == 0 && MBCCFunc.toggleStatus[3] == 1 && MBCCFunc.toggleStatus[4] == 0) {
					// boros
						if (land.getColors() == "wr") {
							MBCCButtons.listModel.addElement(land.getName());
							totalCost = totalCost + land.getCost();
							landCount = landCount + 1;
						}
					}
					else if (MBCCFunc.toggleStatus[0] == 1 && MBCCFunc.toggleStatus[1] == 0 && MBCCFunc.toggleStatus[2] == 0 && MBCCFunc.toggleStatus[3] == 0 && MBCCFunc.toggleStatus[4] == 1) {
					// selesnya
						if (land.getColors() == "wg") {
							MBCCButtons.listModel.addElement(land.getName());
							totalCost = totalCost + land.getCost();
							landCount = landCount + 1;
						}
					}
					else if (MBCCFunc.toggleStatus[0] == 0 && MBCCFunc.toggleStatus[1] == 1 && MBCCFunc.toggleStatus[2] == 1 && MBCCFunc.toggleStatus[3] == 0 && MBCCFunc.toggleStatus[4] == 0) {
					// dimir
						if (land.getColors() == "ub") {
							MBCCButtons.listModel.addElement(land.getName());
							totalCost = totalCost + land.getCost();
							landCount = landCount + 1;
						}
					}
					else if (MBCCFunc.toggleStatus[0] == 0 && MBCCFunc.toggleStatus[1] == 1 && MBCCFunc.toggleStatus[2] == 0 && MBCCFunc.toggleStatus[3] == 1 && MBCCFunc.toggleStatus[4] == 0) {
					// izzet
						if (land.getColors() == "ur") {
							MBCCButtons.listModel.addElement(land.getName());
							totalCost = totalCost + land.getCost();
							landCount = landCount + 1;
						}
					}
					else if (MBCCFunc.toggleStatus[0] == 0 && MBCCFunc.toggleStatus[1] == 1 && MBCCFunc.toggleStatus[2] == 0 && MBCCFunc.toggleStatus[3] == 0 && MBCCFunc.toggleStatus[4] == 1) {
					// simic
						if (land.getColors() == "ug") {
							MBCCButtons.listModel.addElement(land.getName());
							totalCost = totalCost + land.getCost();
							landCount = landCount + 1;
						}
					}
					else if (MBCCFunc.toggleStatus[0] == 0 && MBCCFunc.toggleStatus[1] == 0 && MBCCFunc.toggleStatus[2] == 1 && MBCCFunc.toggleStatus[3] == 1 && MBCCFunc.toggleStatus[4] == 0) {
					// rakdos
						if (land.getColors() == "br") {
							MBCCButtons.listModel.addElement(land.getName());
							totalCost = totalCost + land.getCost();
							landCount = landCount + 1;
						}
					}
					else if (MBCCFunc.toggleStatus[0] == 0 && MBCCFunc.toggleStatus[1] == 0 && MBCCFunc.toggleStatus[2] == 0 && MBCCFunc.toggleStatus[3] == 1 && MBCCFunc.toggleStatus[4] == 1) {
					// gruul
						if (land.getColors() == "rg") {
							MBCCButtons.listModel.addElement(land.getName());
							totalCost = totalCost + land.getCost();
							landCount = landCount + 1;
						}
					}
					else if (MBCCFunc.toggleStatus[0] == 0 && MBCCFunc.toggleStatus[1] == 0 && MBCCFunc.toggleStatus[2] == 1 && MBCCFunc.toggleStatus[3] == 0 && MBCCFunc.toggleStatus[4] == 1) {
					// golgari
						if (land.getColors() == "bg") {
							MBCCButtons.listModel.addElement(land.getName());
							totalCost = totalCost + land.getCost();
							landCount = landCount + 1;
						}
					} // end of 2 color, start of 3 color shards
					else if (MBCCFunc.toggleStatus[0] == 1 && MBCCFunc.toggleStatus[1] == 1 && MBCCFunc.toggleStatus[2] == 0 && MBCCFunc.toggleStatus[3] == 0 && MBCCFunc.toggleStatus[4] == 1) {
					// bant
						if (land.getColors() == "wu" || land.getColors() == "ug" || land.getColors() == "wg" || land.getColors() == "wug") {
							MBCCButtons.listModel.addElement(land.getName());
							totalCost = totalCost + land.getCost();
							landCount = landCount + 1;
						}
					}
					else if (MBCCFunc.toggleStatus[0] == 1 && MBCCFunc.toggleStatus[1] == 1 && MBCCFunc.toggleStatus[2] == 1 && MBCCFunc.toggleStatus[3] == 0 && MBCCFunc.toggleStatus[4] == 0) {
					// esper
						if (land.getColors() == "wu" || land.getColors() == "ub" || land.getColors() == "wb" || land.getColors() == "wub") {
							MBCCButtons.listModel.addElement(land.getName());
							totalCost = totalCost + land.getCost();
							landCount = landCount + 1;}
					}
					else if (MBCCFunc.toggleStatus[0] == 0 && MBCCFunc.toggleStatus[1] == 1 && MBCCFunc.toggleStatus[2] == 1 && MBCCFunc.toggleStatus[3] == 1 && MBCCFunc.toggleStatus[4] == 0) {
					// grixis
						if (land.getColors() == "ub" || land.getColors() == "ur" || land.getColors() == "br" || land.getColors() == "ubr") {
							MBCCButtons.listModel.addElement(land.getName());
							totalCost = totalCost + land.getCost();
							landCount = landCount + 1;}
					}
					else if (MBCCFunc.toggleStatus[0] == 0 && MBCCFunc.toggleStatus[1] == 0 && MBCCFunc.toggleStatus[2] == 1 && MBCCFunc.toggleStatus[3] == 1 && MBCCFunc.toggleStatus[4] == 1) {
					// jund
						if (land.getColors() == "bg" || land.getColors() == "br" || land.getColors() == "rg" || land.getColors() == "brg") {
							MBCCButtons.listModel.addElement(land.getName());
							totalCost = totalCost + land.getCost();
							landCount = landCount + 1;}
					}
					else if (MBCCFunc.toggleStatus[0] == 1 && MBCCFunc.toggleStatus[1] == 0 && MBCCFunc.toggleStatus[2] == 0 && MBCCFunc.toggleStatus[3] == 1 && MBCCFunc.toggleStatus[4] == 1) {
					// naya
						if (land.getColors() == "wr" || land.getColors() == "wg" || land.getColors() == "rg" || land.getColors() == "wrg") {
							MBCCButtons.listModel.addElement(land.getName());
							totalCost = totalCost + land.getCost();
							landCount = landCount + 1;}
					} // end of 3 color shards, start of 3 color wedges
					else if (MBCCFunc.toggleStatus[0] == 1 && MBCCFunc.toggleStatus[1] == 0 && MBCCFunc.toggleStatus[2] == 1 && MBCCFunc.toggleStatus[3] == 0 && MBCCFunc.toggleStatus[4] == 1) {
					// abzan
						if (land.getColors() == "wb" || land.getColors() == "wg" || land.getColors() == "bg" || land.getColors() == "wbg"){
							MBCCButtons.listModel.addElement(land.getName());
							totalCost = totalCost + land.getCost();
							landCount = landCount + 1;}
					}
					else if (MBCCFunc.toggleStatus[0] == 1 && MBCCFunc.toggleStatus[1] == 1 && MBCCFunc.toggleStatus[2] == 0 && MBCCFunc.toggleStatus[3] == 1 && MBCCFunc.toggleStatus[4] == 0) {
					// jeskai
						if (land.getColors() == "wu" || land.getColors() == "wr" || land.getColors() == "ur" || land.getColors() =="wur") {
							MBCCButtons.listModel.addElement(land.getName());
							totalCost = totalCost + land.getCost();
							landCount = landCount + 1;}
					}
					else if (MBCCFunc.toggleStatus[0] == 0 && MBCCFunc.toggleStatus[1] == 1 && MBCCFunc.toggleStatus[2] == 1 && MBCCFunc.toggleStatus[3] == 0 && MBCCFunc.toggleStatus[4] == 1) {
					// sultai
						if (land.getColors() == "bg" || land.getColors() == "ub" || land.getColors() == "ug" || land.getColors() == "ubg"){
							MBCCButtons.listModel.addElement(land.getName());
							totalCost = totalCost + land.getCost();
							landCount = landCount + 1;}
					}
					else if (MBCCFunc.toggleStatus[0] == 1 && MBCCFunc.toggleStatus[1] == 0 && MBCCFunc.toggleStatus[2] == 1 && MBCCFunc.toggleStatus[3] == 1 && MBCCFunc.toggleStatus[4] == 0) {
					// mardu
						if (land.getColors() == "wr" || land.getColors() == "wb" || land.getColors() == "br" || land.getColors() == "wbr"){
							MBCCButtons.listModel.addElement(land.getName());
							totalCost = totalCost + land.getCost();
							landCount = landCount + 1;}
					}
					else if (MBCCFunc.toggleStatus[0] == 0 && MBCCFunc.toggleStatus[1] == 1 && MBCCFunc.toggleStatus[2] == 0 && MBCCFunc.toggleStatus[3] == 1 && MBCCFunc.toggleStatus[4] == 1) {
					// temr
						if (land.getColors() == "ur" || land.getColors() == "ug" || land.getColors() == "rg" || land.getColors() == "urg"){
							MBCCButtons.listModel.addElement(land.getName());
							totalCost = totalCost + land.getCost();
							landCount = landCount + 1;}
					} // end of 3 colors, start of 4 colors
					else if (MBCCFunc.toggleStatus[0] == 1 && MBCCFunc.toggleStatus[1] == 1 && MBCCFunc.toggleStatus[2] == 1 && MBCCFunc.toggleStatus[3] == 1 && MBCCFunc.toggleStatus[4] == 0) {
					// non-green
						if (land.getColors() == "wr" || land.getColors() == "wb" || land.getColors() == "br" || land.getColors() == "ur" 
								|| land.getColors() == "ub" || land.getColors() == "wu" || land.getColors() == "wub" || land.getColors() == "ubr" || land.getColors() == "wur" || land.getColors() == "wbr") {
							MBCCButtons.listModel.addElement(land.getName());
							totalCost = totalCost + land.getCost();
							landCount = landCount + 1;}
					}
					else if (MBCCFunc.toggleStatus[0] == 1 && MBCCFunc.toggleStatus[1] == 1 && MBCCFunc.toggleStatus[2] == 1 && MBCCFunc.toggleStatus[3] == 0 && MBCCFunc.toggleStatus[4] == 1) {
					// non-red
						if (land.getColors() == "wg" || land.getColors() == "wb" || land.getColors() == "bg" || land.getColors() == "ug" || land.getColors() == "ub" 
								|| land.getColors() == "wu" || land.getColors() == "wub" || land.getColors() == "wbg" || land.getColors() == "wug" || land.getColors() == "ubg") {
							MBCCButtons.listModel.addElement(land.getName());
							totalCost = totalCost + land.getCost();
							landCount = landCount + 1;}
					}
					else if (MBCCFunc.toggleStatus[0] == 1 && MBCCFunc.toggleStatus[1] == 1 && MBCCFunc.toggleStatus[2] == 0 && MBCCFunc.toggleStatus[3] == 1 && MBCCFunc.toggleStatus[4] == 1) {
					// non-black
						if (land.getColors() == "wg" || land.getColors() == "wr" || land.getColors() == "rg" || land.getColors() == "ug" || land.getColors() == "ur" 
								|| land.getColors() == "wu" || land.getColors() == "wug" || land.getColors() == "wrg" || land.getColors() == "wur" || land.getColors() == "urg") {
							MBCCButtons.listModel.addElement(land.getName());
							totalCost = totalCost + land.getCost();
							landCount = landCount + 1;}
					}
					else if (MBCCFunc.toggleStatus[0] == 1 && MBCCFunc.toggleStatus[1] == 0 && MBCCFunc.toggleStatus[2] == 1 && MBCCFunc.toggleStatus[3] == 1 && MBCCFunc.toggleStatus[4] == 1) {
					// non-blue
						if (land.getColors() == "wg" || land.getColors() == "wr" || land.getColors() == "rg" || land.getColors() == "bg" || land.getColors() == "br" 
								|| land.getColors() == "wb" || land.getColors() == "brg" || land.getColors() == "wrg" || land.getColors() == "wbg" || land.getColors() == "wbr") {
							MBCCButtons.listModel.addElement(land.getName());
							totalCost = totalCost + land.getCost();
							landCount = landCount + 1;}
					}
					else if (MBCCFunc.toggleStatus[0] == 0 && MBCCFunc.toggleStatus[1] == 1 && MBCCFunc.toggleStatus[2] == 1 && MBCCFunc.toggleStatus[3] == 1 && MBCCFunc.toggleStatus[4] == 1) {
					// non-white
						if (land.getColors() == "ug" || land.getColors() == "ur" || land.getColors() == "rg" || land.getColors() == "bg" || land.getColors() == "br" 
								|| land.getColors() == "ub" || land.getColors() == "ubr" || land.getColors() == "brg" || land.getColors() == "ubg" || land.getColors() == "urg") {
							MBCCButtons.listModel.addElement(land.getName());
							totalCost = totalCost + land.getCost();
							landCount = landCount + 1;}
					}
					else if (MBCCFunc.toggleStatus[0] == 1 && MBCCFunc.toggleStatus[1] == 1 && MBCCFunc.toggleStatus[2] == 1 && MBCCFunc.toggleStatus[3] == 1 && MBCCFunc.toggleStatus[4] == 1) {
					// 5 color
						if (land.getColors() == "wg" || land.getColors() == "wr" || land.getColors() == "rg" || land.getColors() == "bg" || land.getColors() == "br" || 
								land.getColors() == "wb" || land.getColors() == "ur" || land.getColors() == "ub" || land.getColors() == "ug" || land.getColors() == "wu"
								 || land.getColors() == "wub" || land.getColors() == "wug" || land.getColors() == "ubr" || land.getColors() == "brg" || land.getColors() == "wrg"
								 || land.getColors() == "wbg" || land.getColors() == "wur" || land.getColors() == "ubg" || land.getColors() == "wbr" || land.getColors() == "urg") {
							MBCCButtons.listModel.addElement(land.getName());
							totalCost = totalCost + land.getCost();
							landCount = landCount + 1;
								}
							}
					 
					if (MBCCFunc.toggleStatus[0] == 1 || MBCCFunc.toggleStatus[1] == 1 || MBCCFunc.toggleStatus[2] == 1 || MBCCFunc.toggleStatus[3] == 1 || MBCCFunc.toggleStatus[4] == 1) {
					// 5 color (command tower and 5 color lands)
						if (land.getColors() == "wubrg") {
							MBCCButtons.listModel.addElement(land.getName());
							totalCost = totalCost + land.getCost();
							landCount = landCount + 1;
								}
							}
				}
				// end of giant if else
				
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
