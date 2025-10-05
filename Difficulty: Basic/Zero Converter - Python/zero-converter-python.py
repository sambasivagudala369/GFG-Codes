def pos(n):
    ## Write the code
    for i in range(n-1, -1, -1 ):
        print(i, end=" ")
    
def neg(n):
    ##Write the code
    for i in range(n, 1, 1):
        print(i, end=" ")

def zer(n):
    if n == 0:
        print("alreaady Zero")