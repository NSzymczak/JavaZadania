package Lista8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Zadanie3  extends JFrame implements ActionListener{
    private JLabel labelNick, labelPlec,labelImie,labelNazwisko,labelEmail;
    private JTextField textNick, textPlec, textImie, textNazwisko, textEmail;
    private JButton buttonOK;
    private JRadioButton radioButtonZenska, radioButtonMeskie, radioButtonInne;
    public Zadanie3() //OKNO
    {
        setSize(350,280);
        setTitle("Rejestracja");
        setLayout(null);

        labelNick = new JLabel("Nick: ");
        labelNick.setBounds(5,10,150,30);
        add(labelNick);

        textNick = new JTextField("");
        textNick.setBounds(125,10,200,30);
        add(textNick);

        labelImie = new JLabel("Imie i nazwisko");
        labelImie.setBounds(5,45,150,30);
        add(labelImie);

        textImie = new JTextField("");
        textImie.setBounds(125,45,100,30);
        add(textImie);

        textNazwisko = new JTextField("");
        textNazwisko.setBounds(225,45,100,30);
        add(textNazwisko);

        labelEmail = new JLabel("E-mail: ");
        labelEmail.setBounds(5,80,150,30);
        add(labelEmail);

        textEmail = new JTextField("");
        textEmail.setBounds(125,80,200,30);
        add(textEmail);

        labelPlec = new JLabel("Twoje imie jest stereotypowo: ");
        labelPlec.setBounds(5,110,150,30);
        add(labelPlec);

        radioButtonZenska = new JRadioButton("Żeńskie");
        radioButtonZenska.setBounds(125,110,100,30);
        add(radioButtonZenska);
        radioButtonMeskie = new JRadioButton("Męskie");
        radioButtonMeskie.setBounds(125,130,100,30);
        add(radioButtonMeskie);
        radioButtonInne = new JRadioButton("Inne");
        radioButtonInne.setBounds(125,150,100,30);
        add(radioButtonInne);

        ButtonGroup group = new ButtonGroup();
        group.add(radioButtonZenska);
        group.add(radioButtonMeskie);
        group.add(radioButtonInne);

        buttonOK = new JButton("Ok");
        buttonOK.setBounds(180,190,90,30);
        buttonOK.addActionListener(this);
        add(buttonOK);
    }

    private String nick,zaimki, imie, nazwisko, email;

    @Override
    public void actionPerformed(ActionEvent e)
    {
        int ok=0;
        if (e.getSource() == buttonOK)
        {
            if(textNick.getText().length()!=0 && textImie.getText().length()!=0 &&
                    textNazwisko.getText().length()!=0 && textEmail.getText().length()!=0 &&
                    (radioButtonInne.isSelected() || radioButtonMeskie.isSelected() || radioButtonZenska.isSelected()))
            {
                try {
                    sprawdzNick(textNick.getText());
                    nick=textNick.getText();
                    ok++;
                } catch (DlugoscNicku ex)           {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Exception", JOptionPane.INFORMATION_MESSAGE);
                    textNick.setText("");
                } catch (ZawieraCyfre ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Exception", JOptionPane.INFORMATION_MESSAGE);
                    textNick.setText("");
                }
                try {
                    sprawdzImieNazwisko(textImie.getText());
                    imie=textImie.getText();
                    ok++;
                } catch (ZaczynaSieNaDuzaLitere ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Exception", JOptionPane.INFORMATION_MESSAGE);
                    textImie.setText("");
                    textNazwisko.setText("");
                } catch (NieLitery ex)    {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Exception", JOptionPane.INFORMATION_MESSAGE);
                    textImie.setText("");
                    textNazwisko.setText("");
                }
                try {
                    sprawdzImieNazwisko(textNazwisko.getText());
                    nazwisko=textNazwisko.getText();
                    ok++;
                } catch (ZaczynaSieNaDuzaLitere ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Exception", JOptionPane.INFORMATION_MESSAGE);
                    textImie.setText("");
                    textNazwisko.setText("");
                } catch (NieLitery ex)    {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Exception", JOptionPane.INFORMATION_MESSAGE);
                    textImie.setText("");
                    textNazwisko.setText("");
                }
                try {
                    sprawdzEmail(textEmail.getText());
                    email=textEmail.getText();
                    ok++;
                } catch (Domena ex)                 {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Exception", JOptionPane.INFORMATION_MESSAGE);
                    textEmail.setText("");
                }
                if(radioButtonZenska.isSelected()){zaimki="żeńskie";}
                else if(radioButtonMeskie.isSelected()){zaimki="męskie";}
                else if(radioButtonInne.isSelected()){zaimki="inne";}
                else{zaimki="brak";}
                try {
                    sprawdzImie(imie,zaimki);
                    ok++;
                } catch (StereotypImienia ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage() ,
                            "Exception" , JOptionPane.INFORMATION_MESSAGE);
                }
                if(ok==5)
                {
                    Formularz formularz = new Formularz(nick,imie,nazwisko,email,zaimki);
                    JOptionPane.showMessageDialog(null, "Formularz przyjęty" ,
                            "Formularz" , JOptionPane.INFORMATION_MESSAGE);
                    formularz.toString();
                }
            }else { JOptionPane.showMessageDialog(null, "Uzupełnij cały formularz" ,
                    "Exception" , JOptionPane.INFORMATION_MESSAGE);}
        }
    }

    static void sprawdzEmail(String email) throws Domena {
        int dlugosc=email.length();
        String test="@gra.pl";
        for (int i=0; i<7; i++)
        {
            if(email.charAt(dlugosc-1-i)!=test.charAt(6-i)){
                throw new Domena(email);
            }
        }
    }
    static void sprawdzImieNazwisko(String napis) throws ZaczynaSieNaDuzaLitere, NieLitery {
        if(!Character.isUpperCase(napis.charAt(0))){
            throw new ZaczynaSieNaDuzaLitere(napis);
        }
        for(int i=0; i<napis.length();i++){
            if(!Character.isLetter(napis.charAt(i))){
                throw new NieLitery(napis);
            }
        }
    }
    static void sprawdzNick(String napis) throws ZawieraCyfre, DlugoscNicku {
        if(napis.length()!=6){
            throw new DlugoscNicku();
        }
        boolean s=false;
        for(int i=0; i<napis.length();i++){
            if(Character.isDigit(napis.charAt(i))){
                s=true;
                break;
            }
        }
        if(s==false){
            throw new ZawieraCyfre(napis);
        }
    }
    static void sprawdzImie(String imie, String zaimki) throws StereotypImienia {
        int dlugosc=imie.length();
        if(zaimki.equals("żeńskie"))
        {
            if(!(imie.substring(dlugosc-2,dlugosc).equals("ta") || imie.substring(dlugosc-2,dlugosc).equals("na")))
            {
                throw new StereotypImienia();
            }
        }else if(zaimki.equals("męskie"))
        {
            if(!(imie.substring(dlugosc-3,dlugosc).equals("usz") || imie.substring(dlugosc-2,dlugosc).equals("ek")))
            {
                throw new StereotypImienia();
            }
        }
    }
    public static void main(String[] args){
        Zadanie3 aplikacja = new Zadanie3();
        aplikacja.setLocationRelativeTo(null);
        aplikacja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplikacja.setVisible(true);
    }
}
