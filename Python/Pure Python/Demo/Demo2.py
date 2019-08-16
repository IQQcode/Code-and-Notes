# 查看数据类型
num = 10.0
print(type(num))


#字符串的内容用单，双引号
#字符窜中包含了引号，就可以灵活使用
name = 'My name is "Mr.Q",age is 20'
print(name)

# and or not 逻辑运算


# 列表(list),可变对象
a = [1, 2, 3,"hehe", 4]
a[4] = 100
print(a[4])    #切片操作 print(a[1:-1])


#元组(tuple),不可变对象
b = (9, 2, 5, 8)
print(b[-1])



#字典(dict) 哈希表
#JSON
d = {
    'ip': '127.0.0.1',
    'port': 80
}
print(d['ip'])


#if语句
""" result = input("你会认真敲代码吗？ 1 is Yes, 0 is No")
if result == "1":
    print("会拿到好Offer")
elif result == "0":
    print("回家卖红薯...")
else:
    print("输入有误！！！") """


# 打印 0 - 9

# while循环
""" num = 0
while num < 10:
    print(num)
    num += 1
 """

# for循环
""" for number in range(0, 10):
     print(number)
 """



# 要求： 给定一个列表，列表中是一些数字，需要把其中的数字生成一个新的列表.
# 例如按照乘方的形式变换
""" arr = [1, 2, 3, 4, 5, 6]
brr = []
for num in arr:
    if num %2  == 0:
        continue
    num = num * num
    brr.append(num)
print(brr) """


arr = [1, 2, 3, 4, 5, 6]
brr = [num ** 2 for num in arr if num % 2 ==1]
print

