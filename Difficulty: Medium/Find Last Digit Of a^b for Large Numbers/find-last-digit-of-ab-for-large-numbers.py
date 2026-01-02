#User function Template for python3


class Solution:
    def getLastDigit(self, a, b):
        # code here 
        x = int(a)
        y = int(b)
        res = pow(x,y,10)
        return res