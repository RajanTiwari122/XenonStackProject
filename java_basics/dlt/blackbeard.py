def srinks(mat, row, col, tsunami):
    srink = 0
    if mat[row][col] == 0:
        if row != 0 and mat[row - 1][col] in range(1, tsunami + 1):
            srink += 1

        if row != len(mat[0]) and mat[row + 1][col] in range(1, tsunami + 1):
            srink += 1
        
        if col != 0 and mat[row][col-1] in range(1, tsunami + 1):
            srink += 1
        
        if col != len(mat) and mat[row][col+1] in range(1, tsunami + 1):
            srink += 1
    return srink

m, n = map(int, input().split())
mat = []
for roww in range(m):
    res = list(map(int, input().split()))
    mat.append(res)

tup = tuple(map(int, input().split()))
tsunami = int(input())

srink = srinks(mat, tup[0], tup[1], tsunami)
print(srink)