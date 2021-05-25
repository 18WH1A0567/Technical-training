s = input()
r = s[::-1]
while(r != s):
    t1 = int(s) + int(r)
    s = str(t1)
    r = s[::-1]
print(len(s))
