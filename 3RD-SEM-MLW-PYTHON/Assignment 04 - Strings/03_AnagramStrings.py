def is_anagram(str1, str2):
    return sorted(str1) == sorted(str2)
str1 = input("Enter the first string: ")
str2 = input("Enter the second string: ")
if(is_anagram(str1, str2)):
    print("The strings are anagrams")
else:
    print("The strings are not anagrams")

'''
Write a function that takes two strings and returns True if they are anagrams and False 
otherwise. A pair of strings is anagrams if the letters in one word can be arranged to form 
the second one.

'''