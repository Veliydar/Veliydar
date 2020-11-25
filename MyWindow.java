import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame
{
    public MyWindow()
    {
        setBounds(500, 500, 400, 300);
        setTitle("Задание 8");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton button = new JButton("Верхняя кнопка");
        add(button, BorderLayout.PAGE_START);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Нажата верхняя кнопка");
            }
        });

        button = new JButton("Нижняя кнопка");
        add(button, BorderLayout.PAGE_END);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Нажата нижняя кнопка");
            }
        });

        JTextField centralField = new JTextField();
        add(centralField);
        centralField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("В поле введен текст: " + centralField.getText());
            }
        });

        setVisible(true);

    }
}