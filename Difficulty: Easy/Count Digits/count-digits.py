#User function Template for python3

class Solution:
    def evenlyDivides(self, n):
        # code here
        l = []
        temp = n
        while temp>0:
            rem = temp%10
            l.append(rem)
            temp //=10
        c = 0
        for i in l:
            if i != 0 and n%i==0:
                c +=1
        return c
            