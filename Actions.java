import java.io.File;

public class Actions{
    private String path;

    public Actions(){
        this.path = "/home/";
    }


    public void cd(String dir){
        if(dir.charAt(0) == '/')
            this.path = dir;
        else
            this.path = this.path + dir + '/';
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
        byte[] buffer = new byte [BUFFER_LENGTH];
        try {
            ZipOutputStream out = new ZipOutputStream(new FileOutputStream(path + "/" + archiveName));
            BufferedInputStream fin = new BufferedInputStream(new FileInputStream(path + "/" + name));
            out.putNextEntry(new ZipEntry(name));
            int read;
            while ((read = fin.read(buffer, 0, BUFFER_LENGTH)) != -1) {
                out.write(buffer, 0, read);
            }
            out.close();
            fin.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }

    }
    public void unzip(String name){
        System.out.println("Unzip... " + name);
    }

    public void copy(String name){
        System.out.println("Copyng... " + name);
    }

    public String getPath(){
        return this.path;
    }
}
