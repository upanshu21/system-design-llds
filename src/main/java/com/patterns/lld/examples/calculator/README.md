Core Requirements
	1.	Implement basic arithmetic operations (addition, subtraction, multiplication, division)
	2.	Design for extensibility to easily add new operations in the future
	3.	Handle input validation and error cases
	4.	Implement a user interface for input and output
Design Considerations
Operation Abstraction
	•	Create an interface or abstract class for operations
	•	Implement concrete classes for each arithmetic operation
Calculator Core
	•	Design a main Calculator class that can perform operations
	•	Implement a method to accept input and return results
Input Parsing
	•	Develop a mechanism to parse user input into operands and operators
	•	Handle different input formats (e.g., infix notation)


    Arithmetic perform = new Arithmetic();

    perform.add(a,b,c,d);




You are given two Facebook profiles, "Gordon" and "Stephen".
I would like to find out how to get from Gordon's profile to Stephen's profile by navigating through Gordon's friends, then friends of friends and so on.
For example:

Gordon
Shantel (who is friends with Gordon)
Maria (who is friends with Shantel)
David (who is friends with Maria)
Stephen (who is friends with David)
I would like you to create an algorithm to automatically generate a list of profiles, each of who is a friend of the previous entry, which link the starting profile to the end profile. The algorithm will return the list of selected profiles.




Gordon -> Shantel
Shantel -> Maria
Maria -> David
David -> Stephen












