package view;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class MainView extends JFrame {
	private JLabel labelNrOfQuestions;
	private JLabel labelMinNumber;
	private JLabel labelMAxNumber;
	private JLabel labelNrOfDecimals;
	private JLabel labelOperators;
	
	private JTextField tfNrOfQuestions;
	private JTextField tfMinNumber;
	private JTextField tfMaxNumber;
	private JTextField tfNrOfDecimals;
	
	private JCheckBox rbAddition;
	private JCheckBox rbSubstraction;
	private JCheckBox rbMultiplication;
	private JCheckBox rbDivision;
	
	private JButton startExercises;

	private SpringLayout layout;
	
	public MainView(){
		setUp();
	}
	
	private void setUp(){
		labelNrOfQuestions = new JLabel("Aantal vragen: ");
		labelMinNumber = new JLabel("Minimum bereik: ");
		labelMAxNumber = new JLabel("Maximum bereik: ");
		labelNrOfDecimals = new JLabel("Aantal decimalen: ");
		labelOperators = new JLabel("Bewerkingen: ");
		
		tfNrOfDecimals = new JTextField(3);
		tfNrOfQuestions = new JTextField(3);
		tfMaxNumber = new JTextField(3);
		tfMinNumber = new JTextField(3);
		
		rbAddition = new JCheckBox("+");
		rbSubstraction = new JCheckBox("-");
		rbMultiplication = new JCheckBox("*");
		rbDivision = new JCheckBox("/");
		
		startExercises = new JButton("Start");
		
		layout = new SpringLayout();
		layout.putConstraint(SpringLayout.NORTH, rbDivision, -4, SpringLayout.NORTH, labelNrOfQuestions);
		layout.putConstraint(SpringLayout.WEST, rbDivision, 6, SpringLayout.EAST, rbMultiplication);
		layout.putConstraint(SpringLayout.NORTH, rbSubstraction, -4, SpringLayout.NORTH, labelNrOfQuestions);
		layout.putConstraint(SpringLayout.WEST, rbSubstraction, 6, SpringLayout.EAST, rbAddition);
		layout.putConstraint(SpringLayout.WEST, rbMultiplication, 41, SpringLayout.EAST, rbAddition);
		layout.putConstraint(SpringLayout.WEST, tfNrOfQuestions, 37, SpringLayout.EAST, labelNrOfQuestions);
		layout.putConstraint(SpringLayout.NORTH, labelMinNumber, 11, SpringLayout.SOUTH, labelNrOfQuestions);
		layout.putConstraint(SpringLayout.NORTH, rbMultiplication, 6, SpringLayout.NORTH, getContentPane());
		layout.putConstraint(SpringLayout.NORTH, rbAddition, 6, SpringLayout.NORTH, getContentPane());
		layout.putConstraint(SpringLayout.NORTH, tfNrOfQuestions, 7, SpringLayout.NORTH, getContentPane());
		layout.putConstraint(SpringLayout.NORTH, labelOperators, 10, SpringLayout.NORTH, getContentPane());
		layout.putConstraint(SpringLayout.WEST, labelMinNumber, 10, SpringLayout.WEST, getContentPane());
		layout.putConstraint(SpringLayout.NORTH, labelNrOfQuestions, 0, SpringLayout.NORTH, labelOperators);
		layout.putConstraint(SpringLayout.WEST, rbAddition, 6, SpringLayout.EAST, labelOperators);
		layout.putConstraint(SpringLayout.NORTH, startExercises, -4, SpringLayout.NORTH, labelNrOfDecimals);
		layout.putConstraint(SpringLayout.WEST, startExercises, 0, SpringLayout.WEST, labelOperators);
		layout.putConstraint(SpringLayout.NORTH, tfNrOfDecimals, -3, SpringLayout.NORTH, labelNrOfDecimals);
		layout.putConstraint(SpringLayout.WEST, tfNrOfDecimals, 0, SpringLayout.WEST, tfMaxNumber);
		layout.putConstraint(SpringLayout.NORTH, labelNrOfDecimals, 16, SpringLayout.SOUTH, labelMAxNumber);
		layout.putConstraint(SpringLayout.WEST, labelNrOfDecimals, 0, SpringLayout.WEST, labelMAxNumber);
		layout.putConstraint(SpringLayout.NORTH, tfMinNumber, -3, SpringLayout.NORTH, labelMinNumber);
		layout.putConstraint(SpringLayout.EAST, tfMinNumber, 0, SpringLayout.EAST, tfMaxNumber);
		layout.putConstraint(SpringLayout.NORTH, tfMaxNumber, -3, SpringLayout.NORTH, labelMAxNumber);
		layout.putConstraint(SpringLayout.WEST, tfMaxNumber, 0, SpringLayout.WEST, tfNrOfQuestions);
		layout.putConstraint(SpringLayout.NORTH, labelMAxNumber, 16, SpringLayout.SOUTH, labelMinNumber);
		layout.putConstraint(SpringLayout.WEST, labelMAxNumber, 0, SpringLayout.WEST, labelMinNumber);
		layout.putConstraint(SpringLayout.WEST, labelOperators, 42, SpringLayout.EAST, tfNrOfQuestions);
		layout.putConstraint(SpringLayout.WEST, labelNrOfQuestions, 10, SpringLayout.WEST, getContentPane());
		
		getContentPane().setLayout(layout);
		getContentPane().add(labelMAxNumber);
		getContentPane().add(labelMinNumber);
		getContentPane().add(labelNrOfQuestions);
		getContentPane().add(labelNrOfDecimals);
		getContentPane().add(labelOperators);
		getContentPane().add(tfMaxNumber);
		getContentPane().add(tfNrOfQuestions);
		getContentPane().add(tfNrOfDecimals);
		getContentPane().add(tfMinNumber);
		getContentPane().add(startExercises);
		getContentPane().add(rbAddition);
		getContentPane().add(rbDivision);
		getContentPane().add(rbMultiplication);
		getContentPane().add(rbSubstraction);
	}
}
