import numpy as np

def levensh(s1, s2):
    rows = len(s1) + 1
    cols = len(s2) + 1
    distance = np.zeros((rows, cols),dtype=int)
    for i in range(1, rows):
        for k in range(1, cols):
            distance[i][0] = i
            distance[0][k] = k
    for col in range(1, cols):
        for row in range(1, rows):
            if s1[row-1] == s2[col-1]:
                cost = 0
            else:
                cost = 2
            distance[row][col] = min(distance[row-1][col] + 1, distance[row][col-1] + 1, distance[row-1][col-1] + cost)
    ratio = ((len(s1)+len(s2)) - distance[row][col]) / (len(s1)+len(s2))
    return ratio

test1 = "Eric"
test2 = "Eri kc"
print(levensh(test1, test2))