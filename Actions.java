public class Actions{
    private String path = "~";

    public void cd(){
        System.out.println("Change dir without params");
    }

    public void cd(String dir){
        System.out.println("change dir to with" + dir);
    }

    public void dir(){
        System.out.println("show all files and folders");
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
