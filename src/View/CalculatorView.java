package View;

import Controller.CalculatorController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.annotation.Native;

public class CalculatorView {
    private CalculatorController calculatorController;

    private JTextField textField2;
    private JTextField textField1;
    private JTextField textField3;
    private JTextField textField4;
    private JLabel operator;
    private JLabel resultNum;
    private JLabel resultDenom;
    private JButton addition;
    private JButton subtraction;
    private JPanel fractionPanel;
    private JPanel mainPanel;
    private JButton multiplication;
    private JButton division;
    private JButton shorten;
    private JButton[] jButtons;
    //TODO: Erzeuge die Buttons zur Multiplikation und Division von Brüchen

    public CalculatorView(CalculatorController cC) {
        calculatorController = cC;
        jButtons = new JButton[]{addition, subtraction, multiplication, division};
        createButtons();
    }

    public JPanel getPanel() {
        return mainPanel;
    }

    private void createButtons() {
        for (JButton b : jButtons) {
            b.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    mathOperation(b.getText());
                }
            });
        }
        shorten.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shorten();
            }
        });
        //TODO: Füge die ActionListener für die anderen Buttons hinzu.
    }

    /**
     * <p>
     * Processes given Operation for fractions in textFields 1-4 and makes View display correct operator and result
     * <p/>
     * @author Julius
     * @since 22.9.2023
     * @see CalculatorController
     * @param operatorString The operation to do as a string: +,-,*,/
     */
    private void mathOperation(String operatorString) {

        calculatorController.createFractionF1(Integer.parseInt(textField1.getText()), Integer.parseInt(textField2.getText()));
        calculatorController.createFractionF2(Integer.parseInt(textField3.getText()), Integer.parseInt(textField4.getText()));
        switch (operatorString) {
            case ("+") -> calculatorController.add();
            case ("-") -> calculatorController.subtract();
            case ("*") -> calculatorController.multiply();
            case ("/") -> calculatorController.divide();
        }
        resultNum.setText(Integer.toString(calculatorController.getResult().getNum()));
        resultDenom.setText(Integer.toString(calculatorController.getResult().getDenom()));
        operator.setText(operatorString);
    }
    private void shorten(){
        calculatorController.createFractionF1(Integer.parseInt(textField1.getText()), Integer.parseInt(textField2.getText()));
        calculatorController.shorten();
        resultNum.setText(Integer.toString(calculatorController.getResult().getNum()));
        resultDenom.setText(Integer.toString(calculatorController.getResult().getDenom()));
        operator.setText("\u2658");

    }
    private void addition() {
        calculatorController.createFractionF1(Integer.parseInt(textField1.getText()), Integer.parseInt(textField2.getText()));
        calculatorController.createFractionF2(Integer.parseInt(textField3.getText()), Integer.parseInt(textField4.getText()));
        calculatorController.add();
        resultNum.setText(Integer.toString(calculatorController.getResult().getNum()));
        resultDenom.setText(Integer.toString(calculatorController.getResult().getDenom()));
        operator.setText("+");
    }

    private void subtraction() {
        calculatorController.createFractionF1(Integer.parseInt(textField1.getText()), Integer.parseInt(textField2.getText()));
        calculatorController.createFractionF2(Integer.parseInt(textField3.getText()), Integer.parseInt(textField4.getText()));
        calculatorController.subtract();
        resultNum.setText(Integer.toString(calculatorController.getResult().getNum()));
        resultDenom.setText(Integer.toString(calculatorController.getResult().getDenom()));
        operator.setText("-");
    }

    private void multiplication() {
        calculatorController.createFractionF1(Integer.parseInt(textField1.getText()), Integer.parseInt(textField2.getText()));
        calculatorController.createFractionF2(Integer.parseInt(textField3.getText()), Integer.parseInt(textField4.getText()));
        calculatorController.multiply();
        resultNum.setText(Integer.toString(calculatorController.getResult().getNum()));
        resultDenom.setText(Integer.toString(calculatorController.getResult().getDenom()));
        operator.setText("*");
    }

    private void division() {
        calculatorController.createFractionF1(Integer.parseInt(textField1.getText()), Integer.parseInt(textField2.getText()));
        calculatorController.createFractionF2(Integer.parseInt(textField3.getText()), Integer.parseInt(textField4.getText()));
        calculatorController.divide();
        resultNum.setText(Integer.toString(calculatorController.getResult().getNum()));
        resultDenom.setText(Integer.toString(calculatorController.getResult().getDenom()));
        operator.setText("/");
    }
}
