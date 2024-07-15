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
            png(); // Run png method if creates file manager folder
            jpg();
            mp4();
            mkv();
            txt();
            jar();

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
    public static void png() {
        File pngFolder = new File("D:\\FileManager\\Png");
        String extension = "png";
        File desktop = FileSystemView.getFileSystemView().getHomeDirectory();

        if (pngFolder.exists() || pngFolder.mkdir()) {

            System.out.println("Folder " + pngFolder.getName() + " created successfully");
            System.out.println(pngFolder);
            File[] files = desktop.listFiles();
            List<File> pngFiles = Arrays.stream(files).filter(f -> f.getName().endsWith(extension)).toList();
            pngFiles.forEach(pngFile -> {
                try {
                    Files.move(Paths.get(pngFile.getAbsolutePath()), Paths.get(pngFolder.getAbsolutePath(), pngFile.getName()), StandardCopyOption.REPLACE_EXISTING);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

            });

        } else {
            System.out.println("Folder " + pngFolder.getName() + "In " + pngFolder.getPath() + " could not be created");
        }
    }

    public static void jpg() {
        File jpgFolder = new File("D:\\FileManager\\Jpg");
        String extension = "jpg";
        File desktop = FileSystemView.getFileSystemView().getHomeDirectory();

        if (jpgFolder.exists() || jpgFolder.mkdir()) {

            System.out.println("Folder " + jpgFolder.getName() + " created successfully");
            System.out.println(jpgFolder);
            File[] files = desktop.listFiles();
            List<File> jpgFiles = Arrays.stream(files).filter(f -> f.getName().endsWith(extension)).toList();
            jpgFiles.forEach(jpgFile -> {
                try {
                    Files.move(Paths.get(jpgFile.getAbsolutePath()), Paths.get(jpgFolder.getAbsolutePath(), jpgFile.getName()), StandardCopyOption.REPLACE_EXISTING);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

            });

        } else {
            System.out.println("Folder " + jpgFolder.getName() + "In " + jpgFolder.getPath() + " could not be created");
        }


    }

    public static void mp4() {
        File mp4Folder = new File("D:\\FileManager\\Mp4");
        String extension = "mp4";
        File desktop = FileSystemView.getFileSystemView().getHomeDirectory();

        if (mp4Folder.exists() || mp4Folder.mkdir()) {

            System.out.println("Folder " + mp4Folder.getName() + " created successfully");
            System.out.println(mp4Folder);
            File[] files = desktop.listFiles();
            List<File> mp4Files = Arrays.stream(files).filter(f -> f.getName().endsWith(extension)).toList();
            mp4Files.forEach(mp4File -> {
                try {
                    Files.move(Paths.get(mp4File.getAbsolutePath()), Paths.get(mp4Folder.getAbsolutePath(), mp4File.getName()), StandardCopyOption.REPLACE_EXISTING);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

            });

        } else {
            System.out.println("Folder " + mp4Folder.getName() + "In " + mp4Folder.getPath() + " could not be created");
        }


    }

    public static void mkv() {
        File mkvFolder = new File("D:\\FileManager\\Mkv");
        String extension = "mkv";
        File desktop = FileSystemView.getFileSystemView().getHomeDirectory();

        if (mkvFolder.exists() || mkvFolder.mkdir()) {

            System.out.println("Folder " + mkvFolder.getName() + " created successfully");
            System.out.println(mkvFolder);
            File[] files = desktop.listFiles();
            List<File> mkvFiles = Arrays.stream(files).filter(f -> f.getName().endsWith(extension)).toList();
            mkvFiles.forEach(mkvFile -> {
                try {
                    Files.move(Paths.get(mkvFile.getAbsolutePath()), Paths.get(mkvFolder.getAbsolutePath(), mkvFile.getName()), StandardCopyOption.REPLACE_EXISTING);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

            });

        } else {
            System.out.println("Folder " + mkvFolder.getName() + "In " + mkvFolder.getPath() + " could not be created");
        }


    }
    public static void txt() {
        File txtFolder = new File("D:\\FileManager\\Txt");
        String extension = "txt";
        File desktop = FileSystemView.getFileSystemView().getHomeDirectory();

        if (txtFolder.exists() || txtFolder.mkdir()) {

            System.out.println("Folder " + txtFolder.getName() + " created successfully");
            System.out.println(txtFolder);
            File[] files = desktop.listFiles();
            List<File> txtFiles = Arrays.stream(files).filter(f -> f.getName().endsWith(extension)).toList();
            txtFiles.forEach(txtFile -> {
                try {
                    Files.move(Paths.get(txtFile.getAbsolutePath()), Paths.get(txtFolder.getAbsolutePath(), txtFile.getName()), StandardCopyOption.REPLACE_EXISTING);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

            });

        } else {
            System.out.println("Folder " + txtFolder.getName() + "In " + txtFolder.getPath() + " could not be created");
        }


    }
    public static void jar() {
        File jarFolder = new File("D:\\FileManager\\Jar");
        String extension = "jar";
        File desktop = FileSystemView.getFileSystemView().getHomeDirectory();

        if (jarFolder.exists() || jarFolder.mkdir()) {

            System.out.println("Folder " + jarFolder.getName() + " created successfully");
            System.out.println(jarFolder);
            File[] files = desktop.listFiles();
            List<File> jarFiles = Arrays.stream(files).filter(f -> f.getName().endsWith(extension)).toList();
            jarFiles.forEach(jarFile -> {
                try {
                    Files.move(Paths.get(jarFile.getAbsolutePath()), Paths.get(jarFolder.getAbsolutePath(), jarFile.getName()), StandardCopyOption.REPLACE_EXISTING);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

            });

        } else {
            System.out.println("Folder " + jarFolder.getName() + "In " + jarFolder.getPath() + " could not be created");
        }


    }


}