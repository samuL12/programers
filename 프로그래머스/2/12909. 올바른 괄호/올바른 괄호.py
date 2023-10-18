def solution(s):
    answer = True
    temp = []
    for i in s:
        if len(temp) == 0:
            temp.append(i)
        elif temp[-1] == '(':
            if i == '(':
                temp.append(i)
            else:
                del temp[-1]
        else:
            return False
    if len(temp) != 0:
        return False
    return True