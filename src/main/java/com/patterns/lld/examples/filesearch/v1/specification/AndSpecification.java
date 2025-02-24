package com.patterns.lld.examples.filesearch.v1.specification;

import com.patterns.lld.examples.filesearch.v1.file.File;

public class AndSpecification implements Specification {
    private Specification spec1;
    private Specification spec2;
    
    public AndSpecification(Specification spec1, Specification spec2) {
        this.spec1 = spec1;
        this.spec2 = spec2;
    }
    
    public boolean isSatisfiedBy(File file) {
        return spec1.isSatisfiedBy(file) && spec2.isSatisfiedBy(file);
    }

}
