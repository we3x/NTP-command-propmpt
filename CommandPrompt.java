import java.io.BufferedReader;
import java.io.InputStreamReader;

class CommandPrompt {
    public static void main(String args[]){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        while(true){
            try {
                System.out.print(">");
                s = in.readLine();
                if(s.equals("exit"))
                    return;
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
