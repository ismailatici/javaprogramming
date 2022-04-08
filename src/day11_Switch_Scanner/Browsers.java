package day11_Switch_Scanner;

public class Browsers {
    public static void main(String[] args) {
        String browserName="firefox",
                result="";
        boolean validBrowser = browserName== "chrome"||browserName=="firefox"||browserName=="opera"
                ||browserName=="safari"||browserName=="edge";
        if (validBrowser){
            if (browserName=="Chrome"){
                result="Chrome Browser select";
            }else if (browserName=="firefox"){
                result="Fire fox Browser is selected";
            }else if (browserName=="opera"){
                result="opera Browser Selected";
            }else if (browserName=="safari"){
                result="safari Browser Selected";
            }else{
                result="edge Browser Selected";
            }

        }else{
            result="Invalid Browser Name";
        }

        System.out.println(result);




    }
}
