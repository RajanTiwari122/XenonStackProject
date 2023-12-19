def max_points(chocolates, initial):
    chocolates.sort()
    points = 1
    l = [1]
    i = 0
    while i < len(chocolates):
        if chocolates[i] <= initial:
            initial = initial - chocolates[i]
            points += 1
            i += 1
        else:
            points -= 1
            initial += chocolates[-i]
            chocolates.pop()
        l.append(points)
    return max(l)

chocolotes = list(map(int, input().split()))
initial = int(input())
res = max_points(chocolotes, initial)
print(res, end="")