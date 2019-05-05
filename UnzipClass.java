package be.intecbrussel.groepswerk;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnzipClass {
    public static void main(String[] args) {

        try{

            // **** Returns the zipfiles in a directory
            Stream<Path> streamOfPaths = Files.walk(Paths.get("D:/JavaGroepswerk/Recourse_unsorted"))
                  .filter(Files::isRegularFile).filter(UnzipClass::filterZip);

            // **** Prints out all zip files in the directory
            //streamOfPaths.forEach(System.out::println)


            Set<Path> setZip = streamOfPaths.collect(Collectors.toSet());
            String destDir = "D:/JavaGroepswerk/unzippedFiles";
            setZip.forEach(s->unzip(s.toString(), destDir));
            setZip.forEach(s->setZip.remove(s));

          //  String zipFilePath = "D:/JavaGroepswerk/Recourse_unsorted/test_pictures.zip";
            //String destDir = "D:/JavaGroepswerk/unzippedFiles";

            //unzip(zipFilePath, destDir);
        }catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }}

            private static void unzip(String zipFilePath, String destDir) {
            File dir = new File(destDir);

            // create output directory if it doesn't exist
            if(!dir.exists()) dir.mkdirs();


            FileInputStream fis;
            //buffer for read and write data to file
            byte[] buffer = new byte[1024];
            try {
                fis = new FileInputStream(zipFilePath);
                ZipInputStream zis = new ZipInputStream(fis);
                ZipEntry ze = zis.getNextEntry();
                while(ze != null){
                    String fileName = ze.getName();
                    File newFile = new File(destDir + File.separator + fileName);
                    System.out.println("Unzipping to "+newFile.getAbsolutePath());

                    //create directories for sub directories in zip
                    new File(newFile.getParent()).mkdirs();
                    FileOutputStream fos = new FileOutputStream(newFile);
                    int len;
                    while ((len = zis.read(buffer)) > 0) {
                        fos.write(buffer, 0, len);
                    }
                    fos.close();

                    //close this ZipEntry
                    zis.closeEntry();
                    ze = zis.getNextEntry();
                }
                //close last ZipEntry
                zis.closeEntry();
                zis.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }






 /*   } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

    }
*/

    static boolean filterZip(Path path) {
        boolean outcome = false;
        String pathString = path.getFileName().toString();
        if (pathString.substring(pathString.lastIndexOf(".")).equals(".zip")) {
            outcome = true;
        }
        return outcome;


    }

    static Path getPathZipFile(Path path) {

        try {  if(filterZip(path))
               throw new IOException("IOException");

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } return path;
    }
}