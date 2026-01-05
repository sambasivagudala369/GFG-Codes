class Solution:
    def reverseexponentiation(self, n):
        # code here
        str1 = str(n)
        rev = int(str1[:: -1])
        res = pow(n, rev)
        return res
        