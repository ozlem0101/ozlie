package be.intecbrussel.groepswerk;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class ExtensionFolders {

    public static void main(String[] args) {

        try {

            Path root = Paths.get("D:/IdeaProjects/Groepswerk_IO/src/resources/unsorted");

            // ****  Results in a set of extensions
          Stream<Path> streamOfPaths=  Files.walk(Paths.get("D:/JavaGroepswerk/Recourse_unsorted"))
                                        .filter(Files::isRegularFile);

            Set<String> setOfExtensions= streamOfPaths.map(path1 -> path1.getFileName().toString()
                                             .substring(path1.getFileName().toString().lastIndexOf(".")))
                                        .collect(Collectors.toSet());
            setOfExtensions.forEach(System.out::println);


            // **** Create folders per extention name in a destination directory

            Path destination = Paths.get("D:/JavaGroepswerk/sorted/");
             // setOfExtensions.forEach(p->Files.createDirectories(destination.resolve("p")));
                    for(String s : setOfExtensions){
                      Files.createDirectories(destination.resolve(s));
                }






        }catch (IOException ex3){
            System.out.println(ex3.getMessage());
        }catch (UnsupportedOperationException usoe){
            System.out.println(usoe.getMessage());
        }catch (SecurityException se){
            System.out.println(se.getMessage());
        }


    }
}
