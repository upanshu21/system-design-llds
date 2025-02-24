package com.patterns.lld.examples.filesearch.v1.specification;

import com.patterns.lld.examples.filesearch.v1.file.File;

public class NameSpecification implements Specification {
    private String namePart;
    
    public NameSpecification(String namePart) {
        this.namePart = namePart;
    }
    
    public boolean isSatisfiedBy(File file) {
        return file.getName().contains(namePart);
    }

 
}