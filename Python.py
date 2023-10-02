#Declare SET in python
set2={1,2,3,3}
set3=set([1,2,3,3])
for i in set3:
    print(i)

# SET is mutable nut Elemente in SET is Immutable

a = lambda x, y, z : (x + y + z)  
print(a(4, 5, 5))  

#Lambda Function

class h:
    def __init__(self,n,m) -> None: #constructor
        self.name=n
        self.age=m
    def ho(self):   # 'self' is used to access the current instance 'value'
        print(self.name)
        print(self.age)
    class Student:  
        def __init__(self):  
            print("The First Constructor")  
        def __init__(self):  
            print("The second contructor")  # Constructor overloading is not supported in python
  

obj=h(23,25)
obj.ho()
on=h.Student()
print(obj.name)
print(obj.age)

# class and object

class Animal:  
    def speak(self):  
        print("Animal Speaking")  
        #child class Dog inherits the base class Animal  
class Dog(Animal):  
    def bark(self):  
        print("dog barking")  
d = Dog()  
d.bark()  
d.speak()  


class Calculation1:  
    def Summation(self,a,b):  
        return a+b;  
class Calculation2:  
    def Multiplication(self,a,b):  
        return a*b;                                 
class Derived(Calculation1,Calculation2):  
    def Divide(self,a,b):  
        return a/b;  
d = Derived()  
print(d.Summation(10,20))  
print(d.Multiplication(10,20))  
print(d.Divide(10,20))  

#Inheritance

from abc import ABC
class Car(ABC):   
    def mileage(self):   
        pass  
  
class Tesla(Car):   
    def mileage(self):   
        print("The mileage is 30kmph")   
class Suzuki(Car):   
    def mileage(self):   
        print("The mileage is 25kmph ")   
class Duster(Car):   
     def mileage(self):   
          print("The mileage is 24kmph ")   
  
class Renault(Car):   
    def mileage(self):   
            print("The mileage is 27kmph ")   
          
t= Tesla ()   
t.mileage()   
  
r = Renault()   
r.mileage()   
  
s = Suzuki()   
s.mileage()   
d = Duster()   
d.mileage()  


# In Python, the pass keyword is a placeholder statement that does nothing. 
# It is often used when a statement is syntactically required but you don't want to execute 
# any code or when you are in the process of writing code and want to leave a function, class, or other code block empty temporarily.

#Abstraction
x, y = input("Enter two values: ").split()
print("Number of boys: ", x)
print("Number of girls: ", y)

x = list(map(int, input("Enter multiple values: ").split()))
print("List of students: ", x)
# Spilt function in python