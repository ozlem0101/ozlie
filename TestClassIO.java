package be.intecbrussel.groepswerk;

import java.io.FileFilter;
import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.File;

public class TestClassIO {
    public static void main(String[] args) throws IOException{
            Path path = Paths.get("D:/IdeaProjects/Groepswerk_IO/src/resources/unsorted");
        try (Stream<Path> paths = Files.walk(Paths.get("D:/IdeaProjects/Groepswerk_IO/src/resources/unsorted")))
         {


            /*List<String> list =
                    paths.filter(Files::isRegularFile)
                    .map(path1 -> path1.toString())
                    .collect(Collectors.toList());
            //.forEach(Files.toFile);
            list.forEach(System.out::println);
*/
        //   ​paths.map(p->{if(Files.isHidden(p)) {return p;}  return "";}).forEach(System.out::println);

       /*     // Trying to find hidden files in a directory
            Path path2 = null;
            DosFileAttributes attrib = Files.readAttributes(path2, DosFileAttributes.class);
            Predicate<Path> predicate = path3 -> attrib.isHidden();
            paths.filter(predicate).forEach(System.out::println);
            paths.filter(p->Files.readAttributes(p,DosFileAttributes.class).isHidden())
                    .forEach(System.out::println);

            BiPredicate<Path, BasicFileAttributes> matcher = path -> Files.readAttributes(path,DosFileAttributes.class).isHidden();
            Files.find(paths,Integer.MAX_VALUE,matcher);
*/
        //Geeft alle hidden files weer
        System.out.println("Hidden Files:");




        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
