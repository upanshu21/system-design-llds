package com.patterns.lld.examples.filesearch.v1.file;


public class File extends FileSystemItem {
    private String extension;
    private long size;
    
    public File(String name, String extension, long size) {
        super(name);
        this.extension = extension;
        this.size = size;
    }
    
    public String getExtension() {
        return extension;
    }
    
    public long getSize() {
        return size;
    }
}
