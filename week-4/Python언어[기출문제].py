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

# def af(a, b):
#     return a + b

# def sf(a, b):
#     return a - b

# print(sf(af(4, 5), 6))

# a = 10
# b = 15
# if a > b:
#     m = b
# else:
#     m = a

# for i in range(m, 0, -1):
#     if a % i == 0 and b % i == 0:
#         print(i)
#         break

# temp = 0
# min_index = 0
# a = [4, 2, 3, 5, 1]
# for i in range(0, 4):
#     min_index = i
    
#     for j in range(i + 1, 5):
#         if a[j] < a[min_index]:
#             min_index = j
            
#     temp = a[min_index]
#     a[min_index] = a[i]
#     a[i] = temp
    
# print(a)
    
# a =['Hello', 'Python', "World"]
# print(a[0][3:], a[2][:-3])

# class A:
#     a = 0
#     def __init__(self):
#         self.a += 2

#     def fn(self):
#         self.a += 3
        
# class B(A):
#     def __init__(self):
#         self.a += 5

#     def fn(self):
#         self.a += 7
        
# a = B()
# a.fn()
# print(a.a)

# d = {'A':5, 'B':4}
# d['B'] = 7
# d['C'] = 6
# print(d)

# a = ["Hello", "Python", "World"]
# for i in a:
#     print("abc")

# a = [10, 20, 30, 40, 50, 60, 70, 80, 90]
# print(a[3])
# print(a[-5])
# print(a[:7:2])
# print(a[3:])
# print(a[:5])

# sum = 0
# a = [1, 2, 3, 4, 5, 6, 7, 8]
# b = a[::2]
# for i in range(0, 3):
#     sum += b[i]
# print(sum)

def fn(x):
    n = len(x)
    
    for i in range(1, n):
        now = x[i]
        j = i - 1
        while j >= 0 and x[j] > now:
            x[j + 1] = x[j]
            j -= 1
        x[j + 1] = now
        
x = [5, 8, 2, 1, 4, 3]
fn(x)
print(x)
