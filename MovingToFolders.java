package be.intecbrussel.groepswerk;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MovingToFolders {
    public static void main(String[] args) {


        for (String ext : setOfExtensions) {
            List<Path> ext_List = new ArrayList<>();
            // Files.newDirectoryStream(Paths.get("D:/JavaGroepswerk/Recourse_unsorted"),
            //         path -> path.toString().endsWith(".pdf")).forEach(System.out::println);

            streamOfPaths.filter(path -> path.toString().endsWith(ext))
                    .forEach(filePath -> ext_List.add(filePath));

            ext_List.forEach(System.out::println);
            // Files.move(source, target, REPLACE_EXISTING);
        }

    }
}
