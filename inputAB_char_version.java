/*63050206 ANUWATR TREECHAROENRAT */
import java.util.Scanner;
class inputAB {
    public static String text = "";
    public static String dummy = "";
    public static Boolean valid = true;
    public static int cnt = 0;
    public static Boolean[] q = {false, false, false, false};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[Start] Display : nothing\n[Start] Q["+cnt+"]\n");
        while(valid == true){
            System.out.print("[Input] char {'a', 'b', empty string(for ending progress)} : ");
            dummy = sc.nextLine();
            nodeCheck(dummy);
            if(!valid) System.out.println("[Final] Display : "+text+"\n[Final] Q["+cnt+"]\n");
            else System.out.println("[In progess] Display : "+text+"\n[In progess] Q["+cnt+"]\n");
        } 
        sc.close();
    }
    public static void errorFound(int cnt) {
        System.out.println("!-- Error! Input can not end on node Q["+cnt+"], try again. --!");
    }
    public static void nodeCheck(String dummy) {
        /*q0*/
        if(cnt == 0 && q[cnt] == false) { 
            if(dummy.equals("")) {
                errorFound(cnt);
            } else {
                q[cnt] = true;
                if(dummy.equals("a")) {
                    cnt = 1;
                    text += dummy.charAt(0);
                } else if(dummy.equals("b")) {
                    cnt = 3;
                    text += dummy.charAt(0);
                }
            }
        } 
        /*q1*/
        else if(cnt == 1 && q[cnt] == false) {
            if(dummy.equals("")) {
                errorFound(cnt);
            } else {
                q[cnt] = true;
                if(dummy.equals("a")) {
                    cnt = 3;
                    text += dummy.charAt(0);
                } else if(dummy.equals("b")) {
                    cnt = 2;
                    text += dummy.charAt(0);
                }
            }
        } 
        /*q3*/
        else if(cnt == 3 && q[cnt] == false) {
            if(dummy.equals("")) {
                errorFound(cnt);
            } else {
                if(dummy.equals("a") || dummy.equals("b") ) {
                    cnt = 3;
                    text += dummy.charAt(0);
                } 
            }
        }
        /*q2*/ 
        else if(cnt == 2 && q[cnt] == false) {
            if(dummy.equals("")) valid = false;
            else {
                if(dummy.equals("a")) {
                    cnt = 2;
                    text += dummy.charAt(0);
                } else if(dummy.equals("b")) {
                    cnt = 2;
                    text += dummy.charAt(0);
                }
            }
        } 
    }
}