
# enumerate Demo
#每一个下标和对应元素形成一个元组
'''
a = [1, 2, 3]
enumerate(a)
for i in enumerate(a):
    print(i)
'''



# Shopping Demo
product_list = [
    ('MacPro',16000),
    ('Mate 20X',5800),
    ('AirPods',1200),
    ('Surface',9800)
]
shopping_List = []   #购物车空链表
print("\n*************     Welcome to Shop     ***********")
salary = input("Please enter your salary: ")

if salary.isdigit():
    salary = int (salary)
    while True:
        for index,item in enumerate(product_list):
            print(index,item)
        userChoice = input("Select your goods: >>> ")
        if userChoice.isdigit():
            userChoice = int(userChoice)
            if userChoice < len(product_list) and userChoice >= 0:
                pindex = product_list[userChoice]  #获取到商品价格
                if pindex[1] < salary:  # 买得起("Mac",16000) ,pindex[1]为价格
                    shopping_List.append(pindex) 
                    salary -= pindex[1]
                    print("Add %s into shopping cart, your current balance is %s" %(pindex,salary))
                else :
                    print("Your account [%s] is not enough..." %salary)
            else :
                print("goods [%s] is not exist!!!" %userChoice)
        elif userChoice =='Q':
            print("-----------     Shop List     -----------")
            for i in shopping_List :
                print(i)
            print("Your currrent banance is: ",salary)
            exit()
        else :
            print("Input is Error...")
else :
    print("Input is Error,Please try again...")
