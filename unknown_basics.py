from typing import Self
from datetime import datetime

print(datetime.now())

Pi: Final[float] = 3.14 # used in developer mode only the developer can know when he intended to change the value

PI = 4.1
class Hello:
    
    
    def __init__(self, color: str, rating: int) -> None:
        self.color = color
        self.rating = rating 
        
    # Dunder method -> when we try to print the object we can get the details declared in the below func
    def __str__(self) -> str:
        return f'{self.color},{self.rating}*'
        
    def getvalue(self, var: int) -> None:
        print(f"hello : variable => {var}")
        
    def __add__(self, other: Self):
        print(f"{self.color} & {other.color}")
        
print(PI)
h1 = Hello("Green",3)
# print(h1.color)
h2: Hello = Hello("Blue",7)
# print(h1.color)
h1.getvalue(10)

print(h1+h2)
print(Hello)
print(h1)
