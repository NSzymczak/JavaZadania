package Lista7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Zadanie4 extends JFrame implements ActionListener {
    public JTextField insertFirstName, insertLastName, insertPesel;
    public JButton add;
    private JLabel peselLabel, nameLabel, lastNameLabel;
    JToolTip tipPesel;


    public Zadanie4(){
        setSize(350,250);
        setTitle("Zadanie4");
        setLayout(null);

        insertFirstName = new JTextField(16);
        insertFirstName.setBounds(100,40,200,30);
        insertFirstName.setFont(new Font("Times New Roman",Font.BOLD,11));
        insertFirstName.addActionListener(this);
        insertFirstName.setToolTipText("Podaj swoje imie");
        insertFirstName.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(insertFirstName.getText().equals("Podaj swoje imie")){
                    insertFirstName.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if(insertFirstName.getText().length()==0){
                    insertFirstName.setText("Podaj swoje imie");
                }

            }
        });
        add(insertFirstName);


        insertLastName = new JTextField(16);
        insertLastName.setBounds(100,80,200,30);
        insertLastName.setFont(new Font("Times New Roman",Font.BOLD,11));
        insertLastName.addActionListener(this);
        insertLastName.setToolTipText("Podaj swoje nazwisko");
        insertLastName.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(insertLastName.getText().equals("Podaj swoje nazwisko")){
                    insertLastName.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if(insertLastName.getText().length()==0){
                    insertLastName.setText("Podaj swoje nazwisko");
                }

            }
        });
        add(insertLastName);

        insertPesel = new JTextField(16);
        insertPesel.setBounds(100,120,200,30);
        insertPesel.setFont(new Font("Times New Roman",Font.BOLD,11));
        insertPesel.addActionListener(this);
        insertPesel.setToolTipText("Wpisz PESEL");
        add(insertPesel);

        nameLabel = new JLabel("Imię: ");
        nameLabel.setBounds(30,40,150,20);
        add(nameLabel);

        lastNameLabel = new JLabel("Nazwisko: ");
        lastNameLabel.setBounds(30,80,150,20);
        add(lastNameLabel);

        peselLabel = new JLabel("PESEL: ");
        peselLabel.setBounds(30,120,150,20);
        add(peselLabel);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add = new JButton("Dodaj");
        add.setBounds(130,170,80,30);
        add.addActionListener(this);
        add(add);

    }

    public static void main(String[] args){
        Zadanie4 app = new Zadanie4();
        app.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String napis= insertFirstName.getText()+" "+insertLastName.getText()+" "+peselinfo(insertPesel.getText());
        if(e.getSource()==add){

            JOptionPane.showMessageDialog(null, napis ,
                    "Informacje" , JOptionPane.INFORMATION_MESSAGE);
            ;
        }
    }

    static public String peselinfo(String napis)
    {
        String dzielenie="1379", napiskoncowy="";
        int suma=0,l1,l2;
        int liczba[]=new int[10];
        for (int j = 0; j < 10; j++)
        {
            l1=napis.charAt(j)-48; //dlaczego 48
            l2=dzielenie.charAt(j%4)-48;
            liczba[j]=l1*l2;
            if(liczba[j]>10)
            {
                liczba[j]=liczba[j]%10;
            }
            suma+=liczba[j];
        }
        suma=suma%10;
        suma=10-suma;
        if(napis.charAt(10)-48==suma)
        {
            int rok = Integer.parseInt((napis.substring(0, 2)));
            int miesiac = Integer.parseInt((napis.substring(2, 4)));
            int dzien = Integer.parseInt((napis.substring(4, 6)));
            int plec = (napis.charAt(9) - 48) % 2;
            if (80 < miesiac && miesiac < 93) {
                miesiac = miesiac - 80;
                rok = 1800 + rok;
            }
            if (0 < miesiac && miesiac < 13) {
                rok = 1900 + rok;
            }
            if (20 < miesiac && miesiac < 33) {
                miesiac = miesiac - 20;
                rok = 2000 + rok;
            }
            if (40 < miesiac && miesiac < 53) {
                miesiac = miesiac - 40;
                rok = 2100 + rok;
            }
            if (60 < miesiac && miesiac < 73) {
                miesiac = miesiac - 60;
                rok = 2200 + rok;
            }
            napiskoncowy = "Data urodzenia: "+rok + "." + miesiac + "." + dzien+". ";
            switch (plec) {
                case 0:
                    napiskoncowy+="Twój pesel wzkazuje na płeć żeńską";
                    break;
                case 1:
                    napiskoncowy+="Twój pesel wzkazuje na płeć męską";
                    break;
            }
        }
        else
        {
            napiskoncowy="Twój pesel jest niepoprawny";
        }
        return napiskoncowy;
    }
}
