package com.patterns.lld.examples.filesearch.v1.file;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemItem {
    
    private List<FileSystemItem> children = new ArrayList<>();
    
    public Directory(String name) {
        super(name);
    }
    
    public void add(FileSystemItem item) {
        children.add(item);
    }
    
    public List<FileSystemItem> getChildren() {
        return children;
    }
}