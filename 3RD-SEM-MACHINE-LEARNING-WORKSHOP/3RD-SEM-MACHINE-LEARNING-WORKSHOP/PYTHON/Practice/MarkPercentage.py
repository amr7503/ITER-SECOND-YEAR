n=int(input("Number of subjects: "))
Totalmark=0 
for i in range(1,n+1):
    mark=int(input(f"Subject {i} : "))
    Totalmark=Totalmark+mark
percentage=(Totalmark/n)
print("Percentage scored = ",percentage)
