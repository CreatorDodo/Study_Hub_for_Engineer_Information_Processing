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

class Soojebi:
    li = ["Seoul", "Kyeonggi", "Inchon", "Daejeon", "Daegu", "Pusan"]
    
s = Soojebi()
str01 = ""
for i in s.li:
    str01 = str01 + i[0]
    
print(str01)    