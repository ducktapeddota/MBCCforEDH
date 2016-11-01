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
	// a guaranteed value of 0 is given for arrays of integers
	
	public static void populateList() {
		
		String name;
		Integer cost;
		String colors;
		int type;
		while (prelaunchCalc < 60) { // yes i know it should be stored elsewhere, but i will implement that later when i figure out how to extract online data
			// TODO: fetch live pricing data from TCGPlayer using java.net.URL
		if (prelaunchCalc == 0) {
			name = "Tundra";
			colors = "wu";
			cost = 200;
			type = MBCCButtons.getAbur();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);	
		}
		else if (prelaunchCalc == 1) {
			name = "Underground Sea";
			colors = "ub";
			cost = 420;
			type = MBCCButtons.getAbur();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 2) {
			name = "Badlands";
			colors = "br";
			cost = 80;
			type = MBCCButtons.getAbur();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 3) {
			name = "Taiga";
			colors = "rg";
			cost = 70;
			type = MBCCButtons.getAbur();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 4) {
			name = "Savannah";
			colors = "wg";
			cost = 90;
			type = MBCCButtons.getAbur();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 5) {
			name = "Scrubland";
			colors = "wb";
			cost = 60;
			type = MBCCButtons.getAbur();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 6) {
			name = "Volcanic Island";
			colors = "ur";
			cost = 240;
			type = MBCCButtons.getAbur();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 7) {
			name = "Bayou";
			colors = "bg";
			cost = 130;
			type = MBCCButtons.getAbur();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 8) {
			name = "Plateau";
			colors = "wr";
			cost = 50;
			type = MBCCButtons.getAbur();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 9) {
			name = "Tropical Island";
			colors = "ug";
			cost = 170;
			type = MBCCButtons.getAbur();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 10) {
			name = "Hallowed Fountain";
			colors = "wu";
			cost = 7;
			type = MBCCButtons.getShock();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 11) {
			name = "Watery Grave";
			colors = "ub";
			cost = 8;
			type = MBCCButtons.getShock();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 12) {
			name = "Blood Crypt";
			colors = "br";
			cost = 7;
			type = MBCCButtons.getShock();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 13) {
			name = "Stomping Ground";
			colors = "rg";
			cost = 12;
			type = MBCCButtons.getShock();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 14) {
			name = "Temple Gardern";
			colors = "wg";
			cost = 7;
			type = MBCCButtons.getShock();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 15) {
			name = "Godless Shrine";
			colors = "wb";
			cost = 8;
			type = MBCCButtons.getShock();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 16) {
			name = "Steam Vents";
			colors = "ur";
			cost = 9;
			type = MBCCButtons.getShock();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 17) {
			name = "Overgrown Tomb";
			colors = "bg";
			cost = 7;
			type = MBCCButtons.getShock();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 18) {
			name = "Sacred Foundry";
			colors = "wr";
			cost = 9;
			type = MBCCButtons.getShock();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 19) {
			name = "Breeding Pool";
			colors = "ug";
			cost = 10;
			type = MBCCButtons.getShock();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 20) {
			name = "Glacial Fortress";
			colors = "wu";
			cost = 2;
			type = MBCCButtons.getCheck();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 21) {
			name = "Drowned Catacomb";
			colors = "ub";
			cost = 2;
			type = MBCCButtons.getCheck();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 22) {
			name = "Dragonskull Summit";
			colors = "br";
			cost = 1;
			type = MBCCButtons.getCheck();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 23) {
			name = "Rootbound Crag";
			colors = "rg";
			cost = 1;
			type = MBCCButtons.getCheck();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 24) {
			name = "Sunpetal Grove";
			colors = "wg";
			cost = 1;
			type = MBCCButtons.getCheck();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 25) {
			name = "Clifftop Retreat";
			colors = "wr";
			cost = 3;
			type = MBCCButtons.getCheck();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 26) {
			name = "Isolated Chapel";
			colors = "wb";
			cost = 3;
			type = MBCCButtons.getCheck();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 27) {
			name = "Woodland Cemetery";
			colors = "bg";
			cost = 4;
			type = MBCCButtons.getCheck();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 28) {
			name = "Sulfur Falls";
			colors = "ur";
			cost = 7;
			type = MBCCButtons.getCheck();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 29) {
			name = "Hinterland Harbor";
			colors = "ug";
			cost = 5;
			type = MBCCButtons.getCheck();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}		
		else if (prelaunchCalc == 30) {
			name = "Prairie Stream";
			colors = "wu";
			cost = 3;
			type = MBCCButtons.getBattle();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 31) {
			name = "Sunken Hollow";
			colors = "ub";
			cost = 2;
			type = MBCCButtons.getBattle();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 32) {
			name = "Smoldering Marsh";
			colors = "br";
			cost = 2;
			type = MBCCButtons.getBattle();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);			
		}
		else if (prelaunchCalc == 33) {
			name = "Cinder Glade";
			colors = "rg";
			cost = 2;
			type = MBCCButtons.getBattle();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 34) {
			name = "Canopy Vista";
			colors = "wg";
			cost = 2;
			type = MBCCButtons.getBattle();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 35) {
			name = "Adarkar Wastes";
			colors = "wu";
			cost = 9;
			type = MBCCButtons.getPain();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 36) {
			name = "Underground River";
			colors = "ub";
			cost = 5;
			type = MBCCButtons.getPain();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 37) {
			name = "Sulfurous Springs";
			colors = "br";
			cost = 4;
			type = MBCCButtons.getPain();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 38) {
			name = "Karplusan Forest";
			colors = "rg";
			cost = 9;
			type = MBCCButtons.getPain();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 39) {
			name = "Brushland";
			colors = "wg";
			cost = 12;
			type = MBCCButtons.getPain();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 40) {
			name = "Cave of Koilos";
			colors = "wb";
			cost = 1;
			type = MBCCButtons.getPain();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 41) {
			name = "Shivan Reef";
			colors = "ur";
			cost = 2;
			type = MBCCButtons.getPain();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 42) {
			name = "Llanowar Wastes";
			colors = "bg";
			cost = 1;
			type = MBCCButtons.getPain();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 43) {
			name = "Battlefield Forge";
			colors = "wr";
			cost = 1;
			type = MBCCButtons.getPain();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 44) {
			name = "Yavimaya Coast";
			colors = "ug";
			cost = 1;
			type = MBCCButtons.getPain();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 45) {
			name = "Seaside Citadel";
			colors = "wug";
			cost = 1;
			type = MBCCButtons.getTritap();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 46) {
			name = "Arcane Sanctum";
			colors = "wub";
			cost = 1;
			type = MBCCButtons.getTritap();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 47) {
			name = "Crumbling Necropolis";
			colors = "ubr";
			cost = 1;
			type = MBCCButtons.getTritap();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 48) {
			name = "Savage Lands";
			colors = "brg";
			cost = 1;
			type = MBCCButtons.getTritap();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 49) {
			name = "Jungle Shrine";
			colors = "wrg";
			cost = 1;
			type = MBCCButtons.getTritap();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 50) {
			name = "Sandsteppe Citadel";
			colors = "wbg";
			cost = 1;
			type = MBCCButtons.getTritap();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 51) {
			name = "Mystic Monastery";
			colors = "wur";
			cost = 1;
			type = MBCCButtons.getTritap();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 52) {
			name = "Opulent Palace";
			colors = "ubg";
			cost = 1;
			type = MBCCButtons.getTritap();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 53) {
			name = "Nomad Outpost";
			colors = "wbr";
			cost = 1;
			type = MBCCButtons.getTritap();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 54) {
			name = "Frontier Bivouac";
			colors = "urg";
			cost = 1;
			type = MBCCButtons.getTritap();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 55) {
			name = "Murmoring Bosk";
			colors = "wbg";
			cost = 2;
			type = MBCCButtons.getTritap();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 56) {
			name = "Command Tower";
			colors = "wubrg";
			cost = 2;
			type = MBCCButtons.getfiveC();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 57) {
			name = "City of Brass";
			colors = "wubrg";
			cost = 4;
			type = MBCCButtons.getfiveC();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		else if (prelaunchCalc == 58) {
			name = "Mana Confluence";
			colors = "wubrg";
			cost = 8;
			type = MBCCButtons.getfiveC();
			Lands land = new Lands(name, cost, colors,type);
			lands.add(land);
		}
		prelaunchCalc++;
		}
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
