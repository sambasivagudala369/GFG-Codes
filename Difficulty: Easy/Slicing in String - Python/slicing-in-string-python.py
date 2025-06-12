# Function to join given bound_by and tag
def join_middle(bound_by, tag_name):
  # complete the statement below to return the string as required
    N=len(bound_by)//2
    return bound_by[0 : N ] + tag_name + bound_by[N:  ]