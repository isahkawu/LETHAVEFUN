def students_score():

    sum = 0
    for score in range (1, 11):
        score = int(input("Enter students scores: "))
        sum = sum + score
    average = sum / 10
		

    return sum, average
    
sum, average = students_score()
print("sum:", sum)
print("average:", average)




