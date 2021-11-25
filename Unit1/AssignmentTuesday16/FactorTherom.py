import math

def formatLetters(inputText):
    """
    This function takes a string of letters and returns a list of integers
    and, split by spaces, converts them into integers and returns a list of
    floats.
    """
    return [float(i) for i in inputText.split()]

def factors(n):
    """
    This function finds the factors of a number
    """
    factors = []
    for i in range(1, math.ceil(math.sqrt(abs(n)))):
        if abs(n) % i == 0:
            factors.append(i)
            potential = int(abs(n) / i)
            if potential in factors:
                continue
            else:
                factors.append(potential)
    return list(sorted(factors))

def findPotentialZeroes(p, q):
    """
    This function takes the potential zeroes of a polynomial and returns a list of zeroes
    """
    potentialFactors = []
    for i in range(len(p)):
        for j in range(len(q)):
            if p[i]/q[j] in potentialFactors:
                continue
            potentialFactors.append(p[i]/q[j])
    return potentialFactors

def plugZeroes(equation, zeroes):
    """
    This function takes an equation and a list of potential zeroes and returns the equation with the zeroes plugged in
    """
    zeroes = []
    for i in range(len(zeroes)):
        val = 0
        for j in range(len(equation)):
            if j < len(equation) - 1:
                val += equation[j] * zeroes[i] ** (len(equation) - j - 1)
            else:
                val += equation[j]
        if val == 0 and val not in zeroes:
            zeroes.append(zeroes[i])
    return zeroes

def findZeroes(equation):
    """
    This function finds the zeroes of a polynomial
    """
    pFactors = factors(equation[0])
    qFactors = factors(equation[-1])
    potentialZeroes = findPotentialZeroes(pFactors, qFactors)
    zeroes = plugZeroes(equation, potentialZeroes)
    return zeroes

def main():
   print(findZeroes(formatLetters(input("Enter the equation: "))))
    



if __name__ == '__main__':
    main()