// package com.patterns.lld.examples.filesearch.v2;

// import java.util.List;

// import com.patterns.lld.examples.filesearch.V1.ExtensionSpecification;
// import com.patterns.lld.examples.filesearch.V1.NameSpecification;
// import com.patterns.lld.examples.filesearch.V1.Specification;

// public class FileSystemDemo {

//     // Create specifications
//     Specification<File> extensionSpec = new ExtensionSpecification("txt");
//     Specification<File> nameSpec = new NameSpecification("report");
//     Specification<File> combinedSpec = new AndSpecification<>(extensionSpec, nameSpec);

//     // Build a sample file system
//     Directory root = new Directory("root");
//     root.add(new File("annual_report.txt", "txt", 1200));
//     root.add(new File("notes.doc", "doc", 800));

//     Directory subDir = new Directory("subdir");
//     subDir.add(new File("monthly_report.txt", "txt", 900));
//     subDir.add(new File("summary.pdf", "pdf", 1500));

//     root.add(subDir);

//     // Search the file system
//     FileSearchService searchService = new FileSearchService();
//     List<File> foundFiles = searchService.search(root, combinedSpec);

//     // foundFiles will contain "annual_report.txt" and "monthly_report.txt" if they match the criteria.

    
// }
