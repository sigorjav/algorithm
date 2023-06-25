package org.sigorjav.programmers.lessons181926.lessons181927;

public class Lessons181926 {
    public static void main(String[] args) {
        int n = 0;
        String control = "wsdawsdassw";

        for(char c: control.toCharArray()){
            if(c=='w'){
                n=n+1;
            }
            else if(c=='s'){
                n=n-1;
            }
            else if(c=='d'){
                n=n+10;
            }
            else if(c=='a'){
                n=n-10;
            }
        }

        System.out.println(n);

    }
}
