package com.patterns.lld.examples.filesearch.v1;

import java.util.List;

import com.patterns.lld.examples.filesearch.v1.file.Directory;
import com.patterns.lld.examples.filesearch.v1.file.File;
import com.patterns.lld.examples.filesearch.v1.specification.*;

public class SimpleFileSearchExample {
    public static void main(String[] args) {
        // Build a simple file system.
        Directory root = new Directory("root");
        root.add(new File("annual_report.txt", "txt", 1200));
        root.add(new File("notes.doc", "doc", 800));

        Directory subDir = new Directory("subdir");
        subDir.add(new File("monthly_report.txt", "txt", 900));
        subDir.add(new File("summary.pdf", "pdf", 1500));
        root.add(subDir);

        // Create specifications: search for files with .txt extension and "report" in the name.
        Specification spec = new AndSpecification(
            new ExtensionSpecification("txt"),
            new NameSpecification("report")
        );

        // Perform the search.
        FileSearchService service = new FileSearchService();
        List<File> foundFiles = service.search(root, spec);

        // Print results.
        for (File file : foundFiles) {
            System.out.println("Found: " + file.getName());
        }
    }
}