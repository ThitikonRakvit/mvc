package controller;

import view.View;
import model.Model_1;
import model.Model_2;

/*** 64050067 ฐิติกร รักวิทย์ ***/
public class Controller {

    /*** constructor ***/
    public Controller(View view, Model_1 model_1, Model_2 model_2) {
        
        //set dispaly
        view.setInputDisplay(model_1.getInput());
        view.setOutput_1Display(model_1.getOutput());
        view.setOutput_2Display(model_2.getOutput());
    }
}