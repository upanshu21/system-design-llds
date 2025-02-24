package com.patterns.lld.examples.filesearch.v1.file;

public abstract class FileSystemItem {

    protected String name;

    public FileSystemItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
}
