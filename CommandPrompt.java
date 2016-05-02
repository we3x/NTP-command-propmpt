import java.io.BufferedReader;
import java.io.InputStreamReader;

class CommandPrompt {
    public static void main(String args[]){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        Actions dispatch = new Actions();
        while(true){
            try {
                System.out.print(">");
                s = in.readLine();
                String[] params = s.split("[ ]");
                if(s.equals("exit"))
                    return;
                else if (params[0].equals("cd")){
                    dispatch.cd();
                }
                else if (params[0].equals("dir")){
                    dispatch.dir();
                }
                else if (params[0].equals("zip")){
                    dispatch.zip(params[1], params[2]);
                }
                else if (params[0].equals("unzip")){
                    dispatch.unzip(params[1]);
                }
                else if (params[0].equals("copy")){
                    dispatch.copy(params[1]);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
