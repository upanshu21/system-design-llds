package com.patterns.lld.examples.filesearch.v1.specification;

import com.patterns.lld.examples.filesearch.v1.file.File;

public class ExtensionSpecification implements Specification {
    private String extension;
    
    public ExtensionSpecification(String extension) {
        this.extension = extension;
    }
    
    public boolean isSatisfiedBy(File file) {
        return file.getExtension().equalsIgnoreCase(extension);
    }

}