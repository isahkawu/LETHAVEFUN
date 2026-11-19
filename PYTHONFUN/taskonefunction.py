def students_score(*values):

    sum = 0
    for score in range (1, 11):
	    score = int(input("Enter students scores: "))
	    sum = sum + score
    
    return sum

print(students_score())




