package com.example.design.service.composite;

public class FileSystemDemo {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("resume.pdf");
        FileSystemComponent file2 = new File("photo.jpg");
        FileSystemComponent file3 = new File("notes.txt");

        Folder documents = new Folder("Documents");
        documents.add(file1);
        documents.add(file3);

        Folder images = new Folder("Images");
        images.add(file2);

        Folder root = new Folder("Root");
        root.add(documents);
        root.add(images);

        root.showDetails("");
    }
}
