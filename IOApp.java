package be.intecbrussel.groepswerk;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.*;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Stream;

public class IOApp {
    public static void main(String[] args) {/*
        Path unsorted = Paths.get("C:/Users/ozlemo/IdeaProjects/be.intecbrussel.FileIOGroepswerk/src/resources");
        // System.out.println(unsorted);
        try {

            Stream<Path> unsortedPathStream = Files.walk(unsorted, Integer.MAX_VALUE);
            Stream<Files> unsortedFilesStream;

        // Files unsortedFiles = Files.createDirectories(unsorted.getParent());
        // Files.list(unsorted).forEach(System.out::println);
        // Files.walk(unsorted,Integer.MAX_VALUE).forEach(System.out::println);

           Set extentions = new LinkedHashSet<Path>();

        // Geeft alle hidden bestanden
        // Files.walk(unsorted,Integer.MAX_VALUE).forEach(p->{Files.isHidden(p);
        // catch(IOException ex1){ex1.getMessage()}}).forEach(System.out::println);

        // Geeft een STREAM? van extentions van alle bestanden
           unsortedPathStream = Files.walk(unsorted,Integer.MAX_VALUE);
        // unsortedFilesStream =

        for(Path paths: unsortedPathStream) {
            paths.toFile();
        };

        }catch (IOException ex) {
         System.out.println("error");
         ex.getMessage(); }

        Files file;
        Path path01

        private static String getFileExtension(Path path01){
         String extension = "";
        try {
         if (file != null && file.exists()) {
         String name = path01.toFile().getName();
         extension = name.substring(name.lastIndexOf(".")); }
         } catch (Exception e) {
            extension = "";
        } return extension; } }


*/
    }
}
