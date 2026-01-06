class Solution:
    def gcd(self, a, b):
        # code here
        
        while b != 0:
            res = a%b
            a = b
            b = res
        return a