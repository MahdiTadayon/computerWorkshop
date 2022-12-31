while(True):
    try:
        n =int(input('Enter an integer: '))
        break
    except ValueError :
        pass 

Sum = 0 
for number in range(1, n+1):
    if number % 2 == 1 :
        Sum += number 

print("sum: ",Sum)