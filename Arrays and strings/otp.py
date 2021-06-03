s = input()
l = len(s)
res = ''
for i in range(1, l, 2):
    res += str(pow(int(s[i]), 2))
if len(res) > 4:
    print(res[:4])
else:
    temp = 4 - len(res)
    temp_str = temp * '0'
    res = temp_str + res
    print(res)