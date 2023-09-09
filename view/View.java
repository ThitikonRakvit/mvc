package view;

import java.util.*;
import javax.swing.*;

import java.awt.Color;

/*** 64050067 ฐิติกร รักวิทย์ ***/
public class View {

    /*** JFrame ***/
    private JFrame frame_window;
    private JPanel panel_input;
    private JPanel panel_output_1;
    private JPanel panel_output_2;

    /*** input ***/
    private JTextArea textArea_input;
    private JLabel label_input;

    /*** output_1 ***/
    private JTextArea textArea_output_1;
    private JLabel label_output_1;

    /*** output_2 ***/
    private JTextArea textArea_output_2;
    private JLabel label_output_2;

    /*** constructor ***/
    public View() {
        /*** window ***/
        frame_window = new JFrame("MVC");
        frame_window.setSize(600, 700);
        frame_window.setLayout(null);
        frame_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*** input ***/
        panel_input = new JPanel();
        panel_input.setBounds(0, 0, 200, 700);
        panel_input.setBackground(Color.gray);
        panel_input.setLayout(null);
        addInputComponent();
        frame_window.add(panel_input);

        /*** output 1 ***/
        panel_output_1 = new JPanel();
        panel_output_1.setBounds(201, 0, 200, 700);
        panel_output_1.setBackground(Color.lightGray);
        panel_output_1.setLayout(null);
        addOutput_1_Component();
        frame_window.add(panel_output_1);

        /*** output 2 ***/
        panel_output_2 = new JPanel();
        panel_output_2.setBounds(401, 0, 200, 700);
        panel_output_2.setBackground(Color.lightGray);
        panel_output_2.setLayout(null);
        addOutput_2_Component();
        frame_window.add(panel_output_2);
    }

    /*** private methods ***/
    private void addInputComponent() {
        /*** input textArea ***/
        textArea_input = new JTextArea();
        textArea_input.setBounds(5, 55, 190, 700);
        panel_input.add(textArea_input);

        /*** input label ***/
        label_input = new JLabel("Input");
        label_input.setBounds(10, 5, 100, 50);
        panel_input.add(label_input);
    }

    private void addOutput_1_Component() {
        /*** output textArea ***/
        textArea_output_1 = new JTextArea();
        textArea_output_1.setBounds(5, 55, 190, 700);
        panel_output_1.add(textArea_output_1);

        /*** output label ***/
        label_output_1 = new JLabel("Output 1");
        label_output_1.setBounds(10, 5, 100, 50);
        panel_output_1.add(label_output_1);
    }

    private void addOutput_2_Component() {
        /*** output textArea ***/
        textArea_output_2 = new JTextArea();
        textArea_output_2.setBounds(5, 55, 190, 700);
        panel_output_2.add(textArea_output_2);

        /*** output label ***/
        label_output_2 = new JLabel("Output 2");
        label_output_2.setBounds(10, 5, 100, 50);
        panel_output_2.add(label_output_2);
    }

    /*** public methods ***/
    public void display() {
        frame_window.setVisible(true);
    }

    public void setInputDisplay(List<String> data) {
        textArea_input.setText("");
        for (String item : data) {
            textArea_input.append(item + "\n");
        }
    }

    public void setOutput_1Display(List<String> data) {
        textArea_output_1.setText("");
        for (String item : data) {
            textArea_output_1.append(item + "\n");
        }
    }

    public void setOutput_2Display(List<String> data) {
        textArea_output_2.setText("");
        for (String item : data) {
            textArea_output_2.append(item + "\n");
        }
    }

}
