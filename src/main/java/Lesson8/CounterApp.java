package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp extends JFrame {

private int value; // текущее значение счётчика

    private static final String COUNTER_NORMAL = "Счётчик в норме";
    private static final String COUNTER_IS_TOO_BIG = "Счётчик слишком большой";
    private static final String COUNTER_IS_TOO_LOW = "Вы натыкали очень мало";
    private static final String EVEN_NUMBER = "Чётное число";
    private static final String ODD_NUMBER = "Нечётное число";


    public CounterApp(int initialValue) {
        this.value = initialValue;
        setBounds(500,500,1000,200);
        setTitle("Simple counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

//Создадим шрифт
        Font font = new Font("Arial", Font.BOLD,70);
//Создадим сам счётчик
        JLabel counterValue = new JLabel(String.valueOf(initialValue));
        counterValue.setFont(font);
        counterValue.setHorizontalAlignment(SwingConstants.CENTER);
        JPanel wPanel = new JPanel();
        JPanel cPanel = new JPanel();
        JPanel ePanel = new JPanel();
        add(wPanel, BorderLayout.WEST);
        add(cPanel, BorderLayout.CENTER);
        add(ePanel, BorderLayout.EAST);
        cPanel.add(counterValue);


        JLabel infoPane = new JLabel(COUNTER_NORMAL);
        add(infoPane, BorderLayout.NORTH);


        //уменьшение значения
        JButton decrement = new JButton("<");
        decrement.setFont(font);
        wPanel.add(decrement);

        //увеличение значения
        JButton increment = new JButton(">");
        increment.setFont(font);
        ePanel.add(increment);
        //add(increment, BorderLayout.EAST);

        //Добавляем слушателей
        decrement.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value --;
                counterValue.setText(String.valueOf(value));
                if (value %2 ==0){
                    infoPane.setText(EVEN_NUMBER);
                } else {
                    infoPane.setText(ODD_NUMBER);
                }
               /* if(value <10) {
                    infoPane.setText(COUNTER_IS_TOO_LOW);
                } else {
                    infoPane.setText(COUNTER_NORMAL);
                }*/
            }
        });
 increment.addActionListener(new ActionListener() {
     @Override
     public void actionPerformed(ActionEvent e) {
         value++;
         counterValue.setText(String.valueOf(value));
         if (value%2 ==0){
             infoPane.setText(EVEN_NUMBER);
         } else {
             infoPane.setText(ODD_NUMBER);
         }
         /*if(value > 10) {
             infoPane.setText(COUNTER_IS_TOO_BIG);
         }else {
             infoPane.setText(COUNTER_NORMAL);
         }*/
     }
 });

 JButton decrement10 = new JButton ("<10");
        decrement10.setFont(font);
        wPanel.add(decrement10);

        JButton increment10 = new JButton ("10>");
        increment10.setFont(font);
        ePanel.add(increment10);

        decrement10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value -=10;
                counterValue.setText(String.valueOf(value));
                if (value%2 ==0){
                    infoPane.setText(EVEN_NUMBER);
                } else {
                    infoPane.setText(ODD_NUMBER);
                }
            }
        });
      increment10.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        value +=10;
        counterValue.setText(String.valueOf(value));
        if (value%2 ==0){
            infoPane.setText(EVEN_NUMBER);
        } else {
            infoPane.setText(ODD_NUMBER);
        }
    }
});

        setVisible(true);
    }

    public static void main(String[] args) {
        new CounterApp(0);
    }
}
