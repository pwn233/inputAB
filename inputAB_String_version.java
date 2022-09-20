/*63050206 ANUWATR TREECHAROENRAT */
import java.util.Scanner;
public class inputAB_String_version {
    static Scanner sc = new Scanner(System.in);
    static String dummy = "";
    public static void main(String args[]) {
        System.out.print("Input String : ");
        dummy = sc.nextLine();
        String state = "q0";
        int m = 0;
        if(!dummy.equals("")) {
            while(m < dummy.length()) {
            switch(state){
                case "q0": {
                    System.out.println(state);
                    if(dummy.charAt(m) == 'a') {
                        state = "q1";
                        m++;
                        break;
                    } else if(dummy.charAt(m) == 'b') {
                        state = "q3";
                        m++;
                        break;
                    } else {
                        System.out.println("Reject! Input Error on state q[0].");
                        System.exit(1);
                    }
                }
                case "q1" : {
                    System.out.println(state);
                    if(dummy.charAt(m) == 'a') {
                        state = "q3";
                        m++;
                        break;
                    }
                    else if(dummy.charAt(m) == 'b') {
                        state = "q2";
                        m++;
                        break;
                    } else {
                        System.out.println("Reject! Input Error on state q[1].");
                        System.exit(1);
                    }
                }
                case "q3" : {
                    System.out.println(state);
                    if(dummy.charAt(m) == 'a' || dummy.charAt(m) == 'b') {
                        state = "q3";
                        m++;
                        break;
                    }else{
                        System.out.println("Reject! Input Error on state q[3].");
                        System.exit(1);
                    }
                }
                case "q2" : {
                    System.out.println(state);
                    if(dummy.charAt(m) == 'a' || dummy.charAt(m) == 'b'){
                        state = "q2";
                        m++;
                        if(m == (dummy.length()-1)) {
                            System.out.println("Accept!");
                            System.exit(1);
                        } else break;
                    }  
                }
            }
            }
        }
    }
}
