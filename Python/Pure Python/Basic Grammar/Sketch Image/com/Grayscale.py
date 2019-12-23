# !/usr/bin/env python
# -*- coding:utf-8 -*-
# Author: Mr.Q

from PIL import Image
import numpy as np
import cv2

# 将原图像转换为灰度图像,并将其像素值放入列表并转存到数组中
# asarray() 转换输入为数组array
# convert() 将图像转换为灰色图像
# astype() 转换数据类型
a = np.asarray(Image.open("F:/Code-and-Notes/Python/Pure Python/Basic Grammar/Sketch Image/img/Annie1.jpg").convert('L')).astype('float')

depth = 10.  # (0-100)
grad = np.gradient(a)  # 取图像灰度的梯度值
grad_x, grad_y = grad  # 分别取横纵图像梯度值
grad_x = grad_x * depth / 100.
grad_y = grad_y * depth / 100.
A = np.sqrt(grad_x ** 2 + grad_y ** 2 + 1.)
uni_x = grad_x / A
uni_y = grad_y / A
uni_z = 1. / A

vec_el = np.pi / 2.2  # 光源的俯视角度,弧度值
vec_az = np.pi / 4.  # 光源的方位角度,弧度值
dx = np.cos(vec_el) * np.cos(vec_az)  # 光源对 x轴的影响
dy = np.cos(vec_el) * np.sin(vec_az)  # 光源对 y轴的影响
dz = np.sin(vec_el)  # 光源对z 轴的影响

b = 255 * (dx * uni_x + dy * uni_y + dz * uni_z)  # 光源归一化
b = b.clip(0, 255)

im = Image.fromarray(b.astype('uint8'))  # 重构图像
im.save("F:/Code-and-Notes/Python/Pure Python/Basic Grammar/Sketch Image/img/Annie.jpg")
print("保存成功查看")