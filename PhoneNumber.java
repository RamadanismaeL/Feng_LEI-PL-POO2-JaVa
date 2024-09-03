/**
 * @author Ramadan ismaeL
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class PhoneNumber {
    private static JFrame frame;
    @SuppressWarnings("static-access")
    private static void view() {  
        frame = new JFrame();

        frame.setTitle("TPC: enunciado");
        frame.setSize(350, 460);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        tools();
        frame.setVisible(true);
    }

    private static void tools() {
        JLabel tela = new JLabel();
        int quant = 12;
        JButton btn[] = new JButton[quant];
        JButton btnD[] = new JButton[2];

        tela.setText("5122299");
        tela.setFont(new Font("Times New Roman", 0, 25));
        tela.setForeground(Color.black);
        tela.setBackground(Color.white);
        tela.setPreferredSize(new Dimension(200, 50));
        tela.setHorizontalAlignment(SwingConstants.RIGHT);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(tela, BorderLayout.NORTH); 

        JPanel panelGrid = new JPanel();
        panelGrid.setLayout(new GridLayout(4, 2));
        for(int i = 0; i < quant; i++) {
            btn[i] = new JButton();
            btn[i].setText(""+(i+1));

            btn[i].setFont(new Font("Times New Roman", 0, 20));
            btn[i].setForeground(Color.black);

            if(i == 9) {
                btn[9].setText("*");                
            } else if(i == 10) {
                btn[10].setText("0");                
            } else if(i == 11) {
                btn[11].setText("#");
            }
            panelGrid.add(btn[i]);
        }
        panel.add(panelGrid, BorderLayout.CENTER);

        JPanel flow = new JPanel();
        flow.setLayout(new FlowLayout());
        for(int i = 0; i < 2; i++) {
            btnD[i] = new JButton();
            btnD[i].setFont(new Font("Times New Roman", 0, 20));
            btnD[i].setForeground(Color.black);

            if(i == 0) {
                btnD[0].setText("Send");
            } else {                
                btnD[1].setText("end");
            }
            flow.add(btnD[i]);
        }
        panel.add(flow, BorderLayout.SOUTH);

        frame.getContentPane().add(panel);
    }
    public static void main(String[] args) {
        view();
    }
}