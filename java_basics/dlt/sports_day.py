def max_eff(num: list):
    maxx = max(num)
    new_list = []
    for i in num:
        if i <= maxx and i >= -maxx:
            new_list.append(i)
        else:
            continue
    new_list.sort()
    res = 0
    for i in range(len(new_list)):
        res += (new_list[i] * (i+1))
    return res

num = list(map(int, input().split()))
print(max_eff(num), end="")