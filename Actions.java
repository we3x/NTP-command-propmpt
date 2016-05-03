import java.io.File;

public class Actions{
    private String path = "/home/wex/";

    public void cd(){
        System.out.println("Change dir without params");
    }

    public void cd(String dir){
        System.out.println("change dir to with" + dir);
    }

    public void dir(){
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println(listOfFiles[i].getName());
            } else if (listOfFiles[i].isDirectory()) {
                System.out.println(listOfFiles[i].getName() + "/");
            }
        }
    }

    public void zip(String name,String arhiveName){
        System.out.println("Ziping... " + name +" to " + arhiveName);
    }
    public void unzip(String name){
        System.out.println("Unzip... " + name);
    }

    public void copy(String name){
        System.out.println("Copyng... " + name);
    }
}
