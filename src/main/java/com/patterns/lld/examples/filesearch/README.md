Problem statement:
Design Unix File Search API to search file with different arguments as "extension", "name", "size" ...
The design should be maintainable to add new contraints.


Which pattern you should use?
Answer: Specification pattern, create for each criteria a specification class


Follow up: How would you handle if some contraints should support AND, OR conditionals.
I did not provided it yet. Even though below solution took 30 minutes. Solution: use Specification pattern.




Directory/[file1, file2, file3]

directory1/[file, directory/[filee]]


Directory {

    String name;
    
}







Demo {



    
}