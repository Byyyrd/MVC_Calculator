package View;

import Controller.CalculatorController;

import javax.swing.*;

public class MainView extends JFrame {

    // Attribute

    // Referenzen
    private CalculatorController calculatorController;
    private JPanel calculatorPanel;

    /**
     * Konstruktor
     * @param calculatorController Ein Referenz auf ein Controller-Objekt.
     */
    public MainView(CalculatorController calculatorController) {

        this.calculatorController = calculatorController;
        this.calculatorPanel = new CalculatorView(calculatorController).getPanel();

        this.getContentPane().add(calculatorPanel);

        this.setLocation(50,50);
        this.setSize(750,500);
        this.setResizable(false);
        this.setTitle("Fraction_Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
