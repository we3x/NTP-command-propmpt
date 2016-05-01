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
                String[] params = s.split("[ ]");
                if(s.equals("exit"))
                    return;
                else if (params[0].equals("cd"))
                    System.out.println("Change dir");
                else if (params[0].equals("dir"))
                    System.out.println("Show files and folders");
                else if (params[0].equals("zip"))
                    System.out.println("Zip files");
                else if (params[0].equals("unzip"))
                    System.out.println("Unzip files");
                else if (params[0].equals("copy"))
                    System.out.println("Copying files");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
