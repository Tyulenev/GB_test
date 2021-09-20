package ru.GB.Java2.lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatUserWindow extends JFrame {
    private JTextArea jta;
    private JTextField jtf_textInput;
    private JScrollPane jsp;
    private JButton jbSend;
    private JButton jbClear;

    public ChatUserWindow() {
        setBounds(300,300,300,500);
        setTitle("Чат. Клиент");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jta = new JTextArea();
        jtf_textInput = new JTextField("???");
        jsp = new JScrollPane(jta);
        jbSend = new JButton("SEND");
        jbClear = new JButton("CLEAR");
        jta.setEditable(false);

        add(jbClear, BorderLayout.EAST);
//Панель центральная : Основное окно чата
        JPanel jPanelCenter = new JPanel();
        jPanelCenter.setLayout(new BorderLayout());
        jPanelCenter.setBackground(Color.GRAY);
        jPanelCenter.add(jsp,BorderLayout.CENTER);
        add(jPanelCenter,BorderLayout.CENTER);
//Панель нижняя: поле ввода сообщения и кнопка
        JPanel jPanelSouth = new JPanel(new BorderLayout());
        jPanelSouth.setBackground(Color.GREEN);
        //jPanelSouth.setLayout(new BoxLayout(getContentPane(),BoxLayout.X_AXIS));
        jPanelSouth.add(jtf_textInput,BorderLayout.CENTER);
        jPanelSouth.add(jbSend, BorderLayout.EAST);
        add(jPanelSouth, BorderLayout.SOUTH);


        ActionListener sendMessage = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = jtf_textInput.getText();
                if (!str.isEmpty()) {
                    jta.append(str + "\n");
                    jtf_textInput.setText("");
                    jtf_textInput.grabFocus();
                } else System.out.println("Введите что-нибудь");
            }
        };
        ActionListener clearAllChat = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.setText("");
            }
        };

        //Очистка окна чата
        jbClear.addActionListener(clearAllChat);
        //Отправка сообщения
        jbSend.addActionListener(sendMessage);
        jtf_textInput.addActionListener(sendMessage);

        setVisible(true);
    }


}
