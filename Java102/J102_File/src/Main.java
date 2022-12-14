
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        
        try {
            // Creating an object of a file  
            File f0 = new File("D:FileOperationExample.txt");   
            if (f0.createNewFile()) {
                System.out.println("File " + f0.getName() + " is created successfully.");  
            } else {
                System.out.println("File is already exist in the directory.");  
            }
        } catch (IOException exception) {
            System.out.println("An unexpected error is occurred.");  
            exception.printStackTrace();
        }
        
        System.out.println("--------------------------------");
        
        File f0 = new File("D:FileOperationExample.txt");   
        if (f0.exists()) {  
            // Getting file name  
            System.out.println("The name of the file is: " + f0.getName());  
   
            // Getting path of the file   
            System.out.println("The absolute path of the file is: " + f0.getAbsolutePath());     
   
            // Checking whether the file is writable or not  
            System.out.println("Is file writeable?: " + f0.canWrite());    
   
            // Checking whether the file is readable or not  
            System.out.println("Is file readable " + f0.canRead());    
   
            // Getting the length of the file in bytes  
            System.out.println("The size of the file in bytes is: " + f0.length());    
        } else {  
            System.out.println("The file does not exist.");  
        }
        
        // DELETE 
        System.out.println("--------------------------------");
        if (f0.delete()) {
            System.out.println("The File is deleted.");
        } else {
            System.out.println("The File is not deleted.");
        }
        
        // CREATE FOLDER
        System.out.println("--------------------------------");
        File f1 = new File("D:\\New PHP");
        if (f1.mkdir()) {
            System.out.println("Directory is created");
        }else {
            System.out.println("Directory cannot be created");
        }
        
        // LIST THE FILES IN FOLDER
        File allFiles = new File("D:/");
        String[] fileList = allFiles.list();

        for(String str : fileList) {
            System.out.println(str);
        }
        
    }
}  
