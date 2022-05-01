package Lista7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Zadanie3 extends JFrame implements ActionListener
{
    public  JTextField insertText;
    private final JButton  button1,button2,button3,
            button4,button5,button6,
            button7,button8,button9,
            button0, buttonComa, buttonPlus,
            buttonMinus, buttonTimes, buttonDivide,
            buttonDelete, buttonSolve;

    public double firstNumber, secondNumber, solvedNumber;
    boolean add=false;
    boolean minus=false;
    boolean multi=false;
    boolean div=false;
    boolean coma=false;
    String displayText;

    public Zadanie3()
    {
        setSize(225,305);
        setTitle("Kalkulator - zadanie 3");
        setLayout(null);

        insertText = new JTextField(16);
        insertText.setBounds(5,5,200,50);
        insertText.setFont(new Font("Times New Roman",Font.BOLD,20));
        insertText.setHorizontalAlignment(JTextField.RIGHT);
        insertText.setEditable(false);
        add(insertText);


        button9 = new JButton("9");
        button9.setBounds(105,60,50,50);
        add(button9);
        button9.addActionListener(this);

        button8 = new JButton("8");
        button8.setBounds(55,60,50,50);
        add(button8);
        button8.addActionListener(this);

        button7 = new JButton("7");
        button7.setBounds(5,60,50,50);
        add(button7);
        button7.addActionListener(this);

        button6 = new JButton("6");
        button6.setBounds(105,110,50,50);
        add(button6);
        button6.addActionListener(this);

        button5 = new JButton("5");
        button5.setBounds(55,110,50,50);
        add(button5);
        button5.addActionListener(this);

        button4 = new JButton("4");
        button4.setBounds(5,110,50,50);
        add(button4);
        button4.addActionListener(this);

        button3 = new JButton("3");
        button3.setBounds(105,160,50,50);
        add(button3);
        button3.addActionListener(this);

        button2 = new JButton("2");
        button2.setBounds(55,160,50,50);
        add(button2);
        button2.addActionListener(this);

        button1 = new JButton("1");
        button1.setBounds(5,160,50,50);
        add(button1);
        button1.addActionListener(this);

        button0 = new JButton("0");
        button0.setBounds(55,210,50,50);
        add(button0);
        button0.addActionListener(this);

        buttonComa = new JButton(".");
        buttonComa.setBounds(5,210,50,50);
        add(buttonComa);
        buttonComa.addActionListener(this);

        buttonSolve = new JButton("=");
        buttonSolve.setBounds(105,210,50,50);
        add(buttonSolve);
        buttonSolve.addActionListener(this);

        buttonDelete = new JButton("C");
        buttonDelete.setBounds(155,60,50,40);
        add(buttonDelete);
        buttonDelete.addActionListener(this);

        buttonDivide = new JButton("/");
        buttonDivide.setBounds(155,100,50,40);
        add(buttonDivide);
        buttonDivide.addActionListener(this);

        buttonTimes = new JButton("*");
        buttonTimes.setBounds(155,140,50,40);
        add(buttonTimes);
        buttonTimes.addActionListener(this);

        buttonMinus = new JButton("-");
        buttonMinus.setBounds(155,180,50,40);
        add(buttonMinus);
        buttonMinus.addActionListener(this);

        buttonPlus = new JButton("+");
        buttonPlus.setBounds(155,220,50,40);
        add(buttonPlus);
        buttonPlus.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button0){
            displayText = insertText.getText();
            insertText.setText(displayText + "0");
        }
        if(e.getSource()==button1){
            displayText = insertText.getText();
            insertText.setText(displayText + "1");
        }
        if(e.getSource()==button2){
            displayText = insertText.getText();
            insertText.setText(displayText + "2");
        }
        if(e.getSource()==button3){
            displayText = insertText.getText();
            insertText.setText(displayText + "3");
        }
        if(e.getSource()==button4){
            displayText = insertText.getText();
            insertText.setText(displayText + "4");
        }
        if(e.getSource()==button5){
            displayText = insertText.getText();
            insertText.setText(displayText + "5");
        }
        if(e.getSource()==button6){
            displayText = insertText.getText();
            insertText.setText(displayText + "6");
        }
        if(e.getSource()==button7){
            displayText = insertText.getText();
            insertText.setText(displayText + "7");
        }
        if(e.getSource()==button8){
            displayText = insertText.getText();
            insertText.setText(displayText + "8");
        }
        if(e.getSource()==button9){
            displayText = insertText.getText();
            insertText.setText(displayText + "9");
        }
        if(e.getSource()==buttonComa && coma==false){
            displayText = insertText.getText();
            insertText.setText(displayText + ".");
            coma = true;
        }
        if(e.getSource()==buttonPlus){
            firstNumber=Double.parseDouble(insertText.getText());
            insertText.setText("");
            add=true;
        }
        if(e.getSource()==buttonMinus){
            firstNumber=Double.parseDouble(insertText.getText());
            insertText.setText("");
            minus=true;
        }
        if(e.getSource()==buttonDivide){
            firstNumber=Double.parseDouble(insertText.getText());
            insertText.setText("");
            div=true;
        }
        if(e.getSource()==buttonTimes){
            firstNumber=Double.parseDouble(insertText.getText());
            insertText.setText("");
            multi=true;
        }
        if(e.getSource()==buttonSolve){
            secondNumber = Double.parseDouble(insertText.getText());
            if(add==true)
                firstNumber=firstNumber+secondNumber;
            if(minus==true)
                firstNumber=firstNumber-secondNumber;
            if(multi==true)
                firstNumber=firstNumber*secondNumber;
            if(div==true)
                firstNumber=firstNumber/secondNumber;
            insertText.setText(String.valueOf(firstNumber));
        }
        if(e.getSource()==buttonDelete){
            insertText.setText("");
            coma=false;
        }

    }

    public static void  main(String[] args)
    {
        Zadanie3 app = new Zadanie3();
    }
}
