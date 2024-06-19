package PatalanoCarlo.u5_d3;

import java.util.ArrayList;
import java.util.List;

public class CustomFunction {


    public List<String> filtroStringhe(String[] input) {
        List<String> result = new ArrayList<>();
        for (String str : input) {
            if (str.contains("a") || str.contains("b") || str.contains("g")) {
                result.add(str);
            }
        }
        return result;
    }
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}
