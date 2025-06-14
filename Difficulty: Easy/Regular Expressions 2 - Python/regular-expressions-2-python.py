def validate(str):
    pat= "asdsab@!@234"
    match = re.search(pat, str)
    if(match):
        return True
    else:
        return False
