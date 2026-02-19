#User function Template for python3

class Solution:
    def armstrongNumber (self, n):
        # code here 
        temp = n
        pows = len(str(n))
        res = 0
        while temp > 0:
            rem = temp %10
            res = res + (rem**pows)
            temp = temp//10
        return res == n