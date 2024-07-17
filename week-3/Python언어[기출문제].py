# a = {'일본', '중국', '한국'}
# a.add('베트남')
# a.add('중국')
# a.remove('일본')
# a.update({'홍콩', '한국', '태국'})
# print(a)

# lol=[[1,2,3],[4,5],[6,7,8,9]]
# print(lol[0])
# print(lol[2][1])
# for sub in lol:
#     for item in sub:
#         print(item, end='')
#     print()

# class Soojebi:
#     li = ["Seoul", "Kyeonggi", "Inchon", "Daejeon", "Daegu", "Pusan"]
    
# s = Soojebi()
# str01 = ""
# for i in s.li:
#     str01 = str01 + i[0]
    
# print(str01)    

# a = []
# for i in range(1, 5):
#     a.append(i)
# print(a)

# s = "soojebi"
# t = s[:-4] + s[2:]
# print(t)

# dict = {
#     "name": "수제비",
#     "book": ["정보처리기사", "정보처리산업기사", "정보처리기능사", "빅데이터분석기사"],
#     "site": "www.soojebi.com"
# }

# dict["book"][0] = "정보처리기사 실기"

# for i in range(len(dict["book"]) + 1):
#     if i < len(dict["book"]):
#         print("book:", dict["book"][i])
#     else:
#         print("book:", dict["book"][i % len(dict["book"])])

# a = 10
# b = 'text'
# print(type(a))
# print(type(b))

# def f(n):
#     return lambda a: a * n

# k = f(3)

# print(k(10))

def af(a, b):
    return a + b

def sf(a, b):
    return a - b

print(sf(af(4, 5), 6))