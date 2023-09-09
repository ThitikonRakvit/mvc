package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*** 64050067 ฐิติกร รักวิทย์ ***/
public class Model_2 {

    // List to store the data
    private List<String> input = new ArrayList<>();
    private List<String> output = new ArrayList<>();

    String dataFile = "input.txt";

    /*** constructor ***/
    public Model_2() {
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
                    if (obj.length > 1 && "declare".equals(obj[0])) {
                        output.add("declare is Keyword and Sign");
                        output.add(obj[1] + " is Variable");
                    } else {
                        for (String find : obj) {
                            try {
                                Integer.parseInt(find);
                                output.add(find + " is Integer");
                            } catch (NumberFormatException e) {
                                if ("+".equals(find)) {
                                    output.add(find + " is Keyword and Sign");
                                } else if ("=".equals(find)) {
                                    output.add(find + " is Assignment");
                                } else {
                                    output.add(find + " is Variable");
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /*** public methods ***/
    public List<String> getOutput() {
        return output;
    }

}
