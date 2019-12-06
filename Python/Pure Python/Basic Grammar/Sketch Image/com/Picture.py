# !/usr/bin/env python
# -*- coding:utf-8 -*-
# Author: Mr.Q

from PIL import Image
import numpy as np

# 将原图像转换为灰度图像,并将其像素值放入列表并转存到数组中
# asarray() 转换输入为数组array
# convert() 将图像转换为灰色图像
# astype() 转换数据类型
out1 = np.asarray(Image.open("F:/Code-and-Notes/Python/Pure Python/Basic Grammar/Sketch Image/img/Tiger.jpg").convert('L')).astype('float')
depth = 10
grad = np.gradient(out1)
grad_x,grad_y = grad
grad_x = grad_x*depth/100.
grad_y = grad_y*depth/100.
A = np.sqrt(grad_x**2 + grad_y**2 +1.)
uni_x = grad_x/A
uni_y = grad_y/A
uni_z = 1./A
vec_el = np.pi/2.2
vec_az = np.pi/4.
dx = np.cos(vec_el)*np.cos(vec_az)
dy = np.cos(vec_el)*np.sin(vec_az)
dz = np.sin(vec_el)
b = 255*(dx*uni_x + dy*uni_y + dz*uni_z)
b = b.clip(0,255)
im = Image.fromarray(b.astype('uint8'))
im.save("F:/Code-and-Notes/Python/Pure Python/Basic Grammar/Sketch Image/img/Tiger1.jpg")
print("图片处理成功,请查看...")