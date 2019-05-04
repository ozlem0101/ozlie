package be.intecbrussel.groepswerk;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class TestClassIO2 {
    public static void main(String[]args){

        Path path = Paths.get("D:/IdeaProjects/Groepswerk_IO/src/resources/unsorted");
        File root = new File("D:/IdeaProjects/Groepswerk_IO/src/resources/unsorted");

        File[] hiddenFiles = new File("D:/JavaGroepswerk/Recourse_unsorted")
                .listFiles(File::isHidden);

        System.out.println("Total hidden Files:- " + hiddenFiles.length);
        Stream<File> fileStream = Arrays.stream(hiddenFiles);
        fileStream.forEach(file -> System.out.println("File Name:- " + file.getAbsolutePath() + " isHidden() ? :- " + file.isHidden()));

    }
}