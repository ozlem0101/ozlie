package be.intecbrussel.groepswerk;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributes;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.ZipFile;


public class TestClassIO3 {
    public static void main(String[] args) //throws IOException,UnsupportedOperationException,SecurityException
    {

        try {

            Path root = Paths.get("D:/IdeaProjects/Groepswerk_IO/src/resources/unsorted");
            Stream<Path> streamOfPaths = Files.walk(Paths.get("D:/JavaGroepswerk/Recourse_unsorted"));

          //  List<Path> listOfPaths = streamOfPaths.filter(Files::isRegularFile)
            //                        .collect(Collectors.toList());
            //.forEach(Files.toFile);

            Set<String> HashSetOfExtensions = new HashSet<>();
            Set<String> listOfStrings=  streamOfPaths.filter(Files::isRegularFile)
                                        .map(path1 -> path1.getFileName().toString()
                                                .substring(path1.getFileName().toString().lastIndexOf(".")))

                                        .collect(Collectors.toSet());
            listOfStrings.forEach(System.out::println);






           // Predicate<Path> predicate = p->Files.readAttributes(p, DosFileAttributes.class).isHidden();
            //Predicate<Path> predicate2 = p->Files.isHidden(p);

            // Will give a list of file extensions




         //  list.forEach(p->{if(filterHidden(p)) return p;})
         //         .forEach(System.out::println);

           /* System.out.println("\nHerewith the hidden files:");
            for(Path p :listOfPaths){
                if (filterHidden(p)) System.out.println(p);
            }
*/


        }catch (IOException ex3){
            System.out.println(ex3.getMessage());
        }catch (UnsupportedOperationException usoe){
            System.out.println(usoe.getMessage());
        }catch (SecurityException se){
            System.out.println(se.getMessage());
        }


    }

    static boolean filterHidden(Path path) throws IOException, SecurityException{
        boolean outcome = false;
        if(Files.isHidden(path)) outcome = true;
        return outcome;
    }




}
