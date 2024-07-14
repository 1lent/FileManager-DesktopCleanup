package org.example;
import org.apache.commons.io.FilenameUtils;

import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.List;


/**
 * Abosolute path: root directory
 * Relative Path: Shortcut path . (Period)
 *
 */

public class FileManager {
    public static void main(String[] args) {


        File folder = new File("D:\\FileManager");
        if (folder.exists() || folder.mkdir()) {
            System.out.println("Folder " + folder.getName() + " created successfully");
            mp3(); // Run mp3 method if creates folder

        } else {
            System.out.println("Folder " + folder.getName() + "In " + folder.getPath() + " could not be created");
        }

    }

// ctrl ? = comment line

    public static void mp3() {
        File mp3Folder = new File("D:\\FileManager\\Mp3");
        String extension = "mp3";
//        File desktop = new File(System.getProperty("user.home") + "/Desktop");
        File desktop = FileSystemView.getFileSystemView().getHomeDirectory();
//        String desk = FilenameUtils.getExtension("%userprofile%\\Desktop");

        if (mp3Folder.exists() || mp3Folder.mkdir()) {
            System.out.println("Folder " + mp3Folder.getName() + " created successfully");

            System.out.println(desktop);
            File[] files = desktop.listFiles();
            List<File> mp3Files = Arrays.stream(files).filter(f -> f.getName().endsWith(extension)).toList();
            mp3Files.forEach(mp3File -> {
                try {
                    Files.move(Paths.get(mp3File.getAbsolutePath()), Paths.get(mp3Folder.getAbsolutePath(), mp3File.getName()), StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException e) {
                    throw new RuntimeException(e);

                }
            });

        } else {
            System.out.println("Folder " + mp3Folder.getName() + "In " + desktop.getPath() + " could not be created");
        }

    }


}