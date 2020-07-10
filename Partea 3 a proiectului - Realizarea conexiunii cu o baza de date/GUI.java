package clase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GUI implements ActionListener {
    private JLabel labelButonCarti;
    private JButton butonAfisareNumeBibliotecari;

    public GUI() {
        JFrame frame = new JFrame();

//        String e[] = new String[100];
//        for (int i = 0; i < 100; i++)
//            e[i] = "elem " + i;
//        JList l = new JList(e);
//        JScrollPane sp = new JScrollPane(l);

        JButton b = new JButton("push me");
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //your actions
            }
        });


        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));


        frame.add(panel, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Biblioteca");
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}




//package clase;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class GUI implements ActionListener {
////    private int x;
//    private JLabel labelButonCarti;
//    private JButton butonAfisareNumeBibliotecari;
//
//    public GUI() {
//        JFrame frame = new JFrame();
//
//        JPanel panel1 = new JPanel();
//        butonAfisareNumeBibliotecari = new JButton("Afisare bibliotecari");
//        panel1.add(butonAfisareNumeBibliotecari);
//        butonAfisareNumeBibliotecari.addActionListener(this);
//
////        JButton buttonAfisareNume = new JButton("Afisare carti");
////        buttonAfisareCarti.addActionListener(this);
//
////        JButton buttonAfisareCarti2 = new JButton("Afisare carti");
////        buttonAfisareCarti2.addActionListener(this);
//
////        labelButonCarti = new JLabel("Nu ati apasat niciun buton.");
//
//        JPanel panel = new JPanel();
//        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
////        panel.setLayout(new GridLayout(0, 1));
////        panel.add(buttonAfisareCarti);
////        panel.add(labelButonCarti);
////        panel.add(buttonAfisareCarti2);
//
//        frame.add(panel, BorderLayout.CENTER);
//
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setTitle("Biblioteca");
//        frame.pack();
//        frame.setVisible(true);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        ConexiuneBD bd = null;
//        try {
//            bd = new ConexiuneBD();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        JList elemente = new JList(bd.stringBibliotecari());
//        JScrollPane sp = new JScrollPane(elemente);
//        try {
//            bd.close();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//    }
//}
