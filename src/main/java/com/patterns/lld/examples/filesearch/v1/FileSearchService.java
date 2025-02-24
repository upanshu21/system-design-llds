package com.patterns.lld.examples.filesearch.v1;

import java.util.ArrayList;
import java.util.List;

import com.patterns.lld.examples.filesearch.v1.file.*;
import com.patterns.lld.examples.filesearch.v1.specification.Specification;


class FileSearchService {

    public List<File> search(FileSystemItem item, Specification spec) {
        
        List<File> result = new ArrayList<>();
        if (item instanceof File) {
            File file = (File) item;
            if (spec.isSatisfiedBy(file)) {
                result.add(file);
            }
        } else if (item instanceof Directory) {
            for (FileSystemItem child : ((Directory) item).getChildren()) {
                result.addAll(search(child, spec));
            }
        }
        
        return result;
    }
}
