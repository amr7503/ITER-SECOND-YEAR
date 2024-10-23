str=input("Enter a string : ")
c1=0
c2=0
for w in  str.split():
    if len(w)%2==0:
        c1+=1
    else:
        c2+=1
print("Number of words with even length : ",c1)
print("Number of words with odd length : ",c2)