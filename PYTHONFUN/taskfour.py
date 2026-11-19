def students_score():
	
    
    total = 0
    for score in range (1, 11):
        score = int(input("Enter students scores: "))
        
        if score % 2 == 0:
        	total = total + score
        	
    return total	
total = students_score()     	
print("sum of the Even Number is:", total)        	
        	
        	
        	
  



