#User function Template for python3
arr = tuple(map(int, input().split()))
count=0
for i in range(0,len(arr)-1):
    for j in range(i+1,len(arr)):
        if(arr[i]==arr[j]):
           count+=1
if(count!=0):
    print("False")
else:
    print("True")

########### Write your code below ###############
# Print "True" if all elements of tuple are different, otherwise print "False"

########### Write your code above ###############