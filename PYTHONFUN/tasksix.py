def students_score():
	
    
    total = 0
    for score in range (1, 11):
        score = int(input("Enter students scores: "))
        
        if score % 2 == 0:
        	total = total + score
        	average = total / 10
        	
    return average	 
average = students_score()     	
print("The Average scores Collected is:", average) 

        	
        	
        	
  



