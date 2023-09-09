package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*** 64050067 ฐิติกร รักวิทย์ ***/
public class Model_1 {

    // List to store the data
    private List<String> input = new ArrayList<>();
    private List<String> output = new ArrayList<>();

    String dataFile = "input.txt";

    /*** constructor ***/
    public Model_1() {
        loadDataFromFile(dataFile);
        lexical();
    }

    /*** private methods ***/

    // Load data from a file
    private void loadDataFromFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                input.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void lexical() {
        for (String item : input) {
            // check this line is not comment
            if (!item.trim().startsWith("//")) {

                String[] obj = item.split(" ");

                // check line is not space
                if (!item.equals("")) {
                    if ("declare".equals(obj[0])) {
                        output.add("declare is Keyword");
                        output.add(obj[1] + " is Identifier");
                    } else {
                        for (String find : obj) {
                            try {
                                Integer.parseInt(find);
                                output.add(find + " is Literal");
                            } catch (NumberFormatException e) {
                                if ("=".equals(find) || "+".equals(find)) {
                                    output.add(find + " is Symbol");
                                } else {
                                    output.add(find + " is Identifier");
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /*** public methods ***/
    public List<String> getInput() {
        return input;
    }

    public List<String> getOutput() {
        return output;
    }

}
