package mbcc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;




public class MBCCButtons extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -467143462033701730L;
	private String selectedColors = "";
	public static JPanel colorPanel = new JPanel();
	public static JLabel W = new JLabel("");
	public static JLabel U = new JLabel("");
	public static JLabel B = new JLabel("");
	public static JLabel R = new JLabel("");
	public static JLabel G = new JLabel("");
	public static DefaultListModel listModel;
	public static JList list;
	public static Integer budget = 11210;
	private static Boolean[] typeOfLandCheck = new Boolean[7]; 

	private static final int abur = 0;
	private static final int shock = 1;
	private static final int battle = 2;
	private static final int pain = 3;
	private static final int triTap = 4;
	private static final int check = 5;
	private static final int fiveC = 6;
	
	public static int getfiveC() {
		return fiveC;
	}
	
	public static int getCheck() {
		return check;
	}
	
	public static int getAbur() {
		return abur;
	}

	public static int getShock() {
		return shock;
	}

	public static int getBattle() {
		return battle;
	}

	public static int getPain() {
		return pain;
	}

	public static int getTritap() {
		return triTap;
	}

	public static Boolean[] getTypeOfLandCheck() {
		return typeOfLandCheck;
	}

	public void setTypeOfLandCheck(Boolean[] typeOfLandCheck) {
		this.typeOfLandCheck = typeOfLandCheck;
	}
	
	public String getSelectedColors() {
		return selectedColors;
	}

	public void setSelectedColors(String selectedColors) {
		this.selectedColors = selectedColors;
	}

	public MBCCButtons() {
		super("Mana Base Cost Crafter");
		JOptionPane.showMessageDialog(null, "To use this program, select which colors your deck uses, then click calculate. When"
				+ " calculate is pressed, it will show an optimal list of lands, however they can be deselected to cater to budget. All prices are lowest possible in CAD."
				, "Program Usage", JOptionPane.INFORMATION_MESSAGE);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new BorderLayout());
		final JButton[] MBCCB = new JButton[6];
		JPanel panel = new JPanel();
		JPanel colorPanel = new JPanel();
		JPanel calcPanel = new JPanel();
		JPanel bPanel = new JPanel();
		setBackground(Color.WHITE);
		final int white = 0;
		final int blue = 1;
		final int black = 2;
		final int red = 3;
		final int green = 4;

		
		
		MBCCB[0] = new JButton("White");
		MBCCB[1] = new JButton("Blue");
		MBCCB[2] = new JButton("Black");
		MBCCB[3] = new JButton("Red");
		MBCCB[4] = new JButton("Green");
		MBCCB[5] = new JButton("Calculate Cost");
		
		// color id: 0 = W, 1 = U, 2 = B, 3 = R, 4 = G
		
		panel.setLayout(new GridLayout(1, 5, 3, 3));
		panel.add(MBCCB[0]);
		panel.add(MBCCB[1]);
		panel.add(MBCCB[2]);
		panel.add(MBCCB[3]);
		panel.add(MBCCB[4]);
		
		

		
		for (int i = 0; i < MBCCB.length; i++) {
			MBCCB[i].setPreferredSize(new Dimension(150, 70));
		}
		
		
		MBCCB[0].addActionListener(new MBCCFunc(white));
		MBCCB[1].addActionListener(new MBCCFunc(blue));
		MBCCB[2].addActionListener(new MBCCFunc(black));
		MBCCB[3].addActionListener(new MBCCFunc(red));
		MBCCB[4].addActionListener(new MBCCFunc(green));
		

		
	
		colorPanel.setLayout(new GridLayout(1, 5, 3, 3));
		colorPanel.add(W);
		colorPanel.add(U);
		colorPanel.add(B);
		colorPanel.add(R);
		colorPanel.add(G);
		colorPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		W.setOpaque(true);
		U.setOpaque(true);
		B.setOpaque(true);
		R.setOpaque(true);
		G.setOpaque(true);
		
		W.setPreferredSize(new Dimension(200, 70));
		U.setPreferredSize(new Dimension(200, 70));
		B.setPreferredSize(new Dimension(200, 70));
		R.setPreferredSize(new Dimension(200, 70));
		G.setPreferredSize(new Dimension(200, 70));
		JPanel tPanel = new JPanel();
		tPanel.setLayout(new GridLayout(2,1,3,3));
		tPanel.add(panel, BorderLayout.NORTH);
		tPanel.add(colorPanel, BorderLayout.SOUTH);
		getContentPane().add(tPanel, BorderLayout.NORTH);
		colorPanel.setBackground(Color.GRAY);
		panel.setBackground(Color.ORANGE);
		
		MBCCB[5].addActionListener(new ColorCalc());
		
		listModel = new DefaultListModel();
		listModel.addElement("No selections have been made yet.");
		list = new JList<String>(listModel);
	    list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
	    list.setSelectedIndex(0);
	    list.setVisibleRowCount(5);
	    JScrollPane listScrollPane = new JScrollPane(list);
	    ButtonGroup group = new ButtonGroup();
	    final JRadioButton radUnl = new JRadioButton("Dolan Budget", true);
	    final JRadioButton radMid = new JRadioButton("High-Mid Budget");
	    final JRadioButton radLow = new JRadioButton("Low Budget");
	    
	    radUnl.addItemListener(new ItemListener() {
	         public void itemStateChanged(ItemEvent e) {         
	        	 budget = 10000;
	         }           
	      });
	    radMid.addItemListener(new ItemListener() {
	         public void itemStateChanged(ItemEvent e) {         
	        	 budget = 50;
	         }           
	      });
	    radLow.addItemListener(new ItemListener() {
	         public void itemStateChanged(ItemEvent e) {         
	        	 budget = 5;
	         }           
	      });
	    
	    typeOfLandCheck[abur] = true;
	    typeOfLandCheck[shock] = true;
	    typeOfLandCheck[battle] = true;
	    typeOfLandCheck[pain] = false;
	    typeOfLandCheck[triTap] = false;
	    typeOfLandCheck[check] = false;
	    typeOfLandCheck[fiveC] = true;
	    
	    
	    
	    JCheckBox dolands = new JCheckBox("ABUR Duals", true);
	    dolands.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AbstractButton abstractButton = (AbstractButton) e.getSource();
				typeOfLandCheck[abur] = abstractButton.getModel().isSelected();
			}
	    	
	    });
	    JCheckBox shocks = new JCheckBox("Shock Lands", true);
	    shocks.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AbstractButton abstractButton = (AbstractButton) e.getSource();
				typeOfLandCheck[shock] = abstractButton.getModel().isSelected();
			}
	    		
			
	    });
	    
	    JCheckBox checks = new JCheckBox("Check Lands", true);
	    shocks.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AbstractButton abstractButton = (AbstractButton) e.getSource();
				typeOfLandCheck[check] = abstractButton.getModel().isSelected();
			}
	    	
	    
	    });
	    JCheckBox battleLands = new JCheckBox("Battle Lands", true);
	    battleLands.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AbstractButton abstractButton = (AbstractButton) e.getSource();
				typeOfLandCheck[battle] = abstractButton.getModel().isSelected();
			}
	    	
	    });
	    JCheckBox triTaps = new JCheckBox("Tri Tap Lands", false);
	    triTaps.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AbstractButton abstractButton = (AbstractButton) e.getSource();
				typeOfLandCheck[triTap] = abstractButton.getModel().isSelected();
			}
	    	
	    });
	    JCheckBox painLands = new JCheckBox("Pain Lands", false);
	    painLands.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AbstractButton abstractButton = (AbstractButton) e.getSource();
				typeOfLandCheck[pain] = abstractButton.getModel().isSelected();
			}
	    	
	    });
	    JCheckBox fiveColor = new JCheckBox("5 Color Lands", true);
	    painLands.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AbstractButton abstractButton = (AbstractButton) e.getSource();
				typeOfLandCheck[fiveC] = abstractButton.getModel().isSelected();
			}
	    	
	    });
	    
	    JPanel typePanel = new JPanel();
	    typePanel.setLayout(new GridLayout(6,1,3,3));
	    typePanel.add(dolands);
	    typePanel.add(shocks);
	    typePanel.add(battleLands);
	    typePanel.add(triTaps);
	    typePanel.add(painLands);
	    typePanel.add(fiveColor);
	    typePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	    
	    group.add(radUnl);
	    group.add(radMid);
	    group.add(radLow);
	    JLabel radLabel = new JLabel("Select a cost type.");
	    JButton exportBtn = new JButton("Export to txt.");
	    exportBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("test");
				try {
					MBCCFunc.storeLands();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	    	
	    });
	    bPanel.setLayout(new GridLayout(4, 1, 3, 3));
	    bPanel.add(radLabel);
	    bPanel.add(radUnl);
	    bPanel.add(radMid);
	    bPanel.add(radLow);
	    bPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	    calcPanel.add(bPanel);
	    calcPanel.add(typePanel);
	    calcPanel.add(exportBtn);
	    calcPanel.add(MBCCB[5]);
	    calcPanel.setLayout(new GridLayout(4, 1, 3, 3));
	    listScrollPane.setPreferredSize(new Dimension(1000, 600));
		getContentPane().add(listScrollPane, BorderLayout.WEST);
		getContentPane().add(calcPanel, BorderLayout.CENTER);
	}

	
}
