# !/usr/bin/env python
# -*- coding:utf-8 -*-
# Author: Mr.Q

# 格式化输出

name = input("name: ")
age = input("age: ")
print(type(age))
job = input("job:")
salary = input("salary:")
info = """
--------------  info of %s -------------
Name:%s
Age:%s
Job:%s
Salary:%s
""" % (name,name, age, job, salary)
print(info)

