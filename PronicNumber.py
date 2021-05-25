s = input()
r = []
for i in s:
    x = int(i)
    if str(x+1) in s:
        if str(x * (x+1)) in s:
            r.append(x*(x+1))
if len(r) > 0:
    print(r)
else:
    print('-1')