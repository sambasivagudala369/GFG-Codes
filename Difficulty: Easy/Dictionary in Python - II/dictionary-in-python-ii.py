# Function to check if pair
# with given sum exists
def pair_sum(dict, arr, sum):
    for num in arr:
        if (sum - num) in dict:
            if ((num == (sum-num)) and (dict[num]>=2)):
                return True
            elif ((num == (sum-num)) and (dict[num]<2)):
                pass
            else:    
                return True
    return False