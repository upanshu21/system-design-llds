package com.patterns.lld.examples.filesearch.v1.specification;

import com.patterns.lld.examples.filesearch.v1.file.File;

public interface Specification {

    boolean isSatisfiedBy(File file);
}


