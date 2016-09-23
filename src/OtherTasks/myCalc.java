package OtherTasks;

import javax.swing.*;
import java.awt.*;

/*
* Created by Олександр Шаповал on 08.06.2016
*
* Создаем кальулятор при помощи Swing
 */

public class myCalc {
    public static void main(String[] args) {
        //создаем панель
        JPanel windowContent = new JPanel();

        //задаем мееджер для нашей панели
        FlowLayout fl = new FlowLayout();
        windowContent.setLayout(fl);

        //создаем компоненты в памяти
        JLabel Label1 = new JLabel("Цифра 1");
        JTextField field1 = new JTextField(10);
        JLabel Label2 = new JLabel("Цифра 2");
        JTextField field2 = new JTextField(10);
        JLabel Label3 = new JLabel("Сумма");
        JTextField result = new JTextField(5);
        JButton go = new JButton("Add");

        //добавили компоненты на нашу панель
        windowContent.add(Label1);
        windowContent.add(field1);
        windowContent.add(Label2);
        windowContent.add(field2);
        windowContent.add(Label3);
        windowContent.add(result);
        windowContent.add(go);

        //задаем фрейм и задаем для фрейма нашу панель
        JFrame frame = new JFrame("Мой калькулятор");
        frame.setContentPane(windowContent);

        //задаем размеры и делаем его видимым
        frame.setSize(400, 100);
        frame.setVisible(true);
    }
}