"""
This is a program that I built to devide Polynomial Functions by other Polynomial Functions.
"""


from typing import List, Union

def formatLetters(inputText: str) -> List[Union[int, float]]:
    """
    This function takes a string of letters and returns a list of integers
    and, split by spaces, converts them into integers and returns a list of
    floats.
    """
    return [float(i) for i in inputText.split()]

## Function that converts a float to an int if it is exactly equal to an int
def convertToInt(num: float) -> Union[int, float]:
    if num == int(num):
        return int(num)
    else:
        return num
        
def listToEquation(list):
    """
    This function takes a list of floats and returns a string that is the
    equation of the list.
    """
    equation = "("
    for i in range(len(list)):
        if list[i] < 0:
            equation += "- "
        elif list[i] == 0:
            continue
        else:
            if i != 0:
                equation += "+ "
        if i == len(list) - 1:
            equation += str(convertToInt(abs(list[i])))
        else:
            if list[i] != 1:
                equation += str(convertToInt(abs(list[i])))
        if i != len(list) - 1:
            equation += "x"
            if i < len(list) - 2:
                equation += "^{} ".format(len(list) - i - 1)
            else:
                equation += " "
    equation += ")"
    return equation
    

def syntheticSolve(dividend: List[float], divisor: List[float]) -> str:
    """
    This function takes two lists of floats and returns a list of floats that
    were the result of synthetic division.
    """
    result = []

    # Complete f(x)=d(x) of resulting equation 
    finalString = listToEquation(dividend)
    finalString += " = "
    finalString += listToEquation(divisor)
    
    # If divisor[0] is bigger than 1 then 
    # Bring Divisor[0] to one by dividing then entire divisor list after divisor[0] by divisor[0]
    if divisor[0] > 1:
        for i in range(1, len(divisor)):
            divisor[i] = divisor[i] / divisor[0]

    def smallFunc(x):
        return [0 for i in range(x)]
    balance = [smallFunc(i+1) for i in range(len(divisor)-1)]
    print(balance)
    
    # Add index i of the divisor with index i of balance times the reverse of divisor[1]
    # and append the result to the result array and multiply the result by the divisor and append it to the balance array
    for i in range(len(dividend)):
        resultOfMath = 0
        for j in range(len(balance)):
            resultOfMath += balance[j][i]
        resultOfMath += dividend[i]
        result.append(resultOfMath)
        for j in range(len(balance)): # 5 - (5 - 5 + 1) = 5 - 1
            currIndex = len(dividend) - (len(dividend) - (i) + (j+1))
            if len(balance[j]) - (j+1) >= len(divisor):
                balance[j].append(0)
            elif currIndex < len(dividend) - (1+j):
                balance[j].append(resultOfMath * divisor[j+1] * -1)
                

    print(balance)
    print(result)

    # Set Remainder to the last element of the result array then remove it from the result array
    remainder = result[(len(divisor)-1)*-1:]
    [result.pop() for i in range(len(divisor))]

    # Divide the result array by divisor[0]
    for i in range(len(result)):
        result[i] = result[i] / divisor[0]

    finalString += listToEquation(result)
    finalString += " + {}".format(listToEquation(remainder))

    if "None" in finalString:
        finalString = "Error"

    return finalString

def main():
    dividend = formatLetters(input("Enter the dividend: "))
    divisor = formatLetters(input("Enter the divisor: "))
    print(syntheticSolve(dividend, divisor))

if __name__ == "__main__":
    main()