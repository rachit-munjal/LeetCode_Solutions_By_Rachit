class Solution:
    def isPalindrome(self, x: int) -> bool:
        rev = 0 #To store reverse of the number
        number = x #Store the number in other variable
        if(x < 0):
            return False
        while number != 0:
            rev = (rev*10) + number % 10 #Basic algorithm to find reverse of any number
            number = number // 10
        if (x == rev):
            return True
        return False