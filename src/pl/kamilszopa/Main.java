package pl.kamilszopa;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

    public static void main(String[] args) {

        List<String> zips = new ArrayList<>();

        zips.add("12345");
        zips.add("5435241-123");
        zips.add("12312-123");
        zips.add("213");
        zips.add("96-500");
        zips.add("231");
        zips.add("23-432");
        zips.add("255.255.10.1");

        String regex = "[0-9]{2}\\-[0-9]{3}";

        Pattern pattern = Pattern.compile(regex);



        for(String zip : zips){
            Matcher matcher = pattern.matcher(zip);
            System.out.println(matcher.matches());
        }


	// write your code here
    }
}
