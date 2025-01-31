def separate_by_vowels(word):
    vowels = 'aeiouAEIOU'
    for vowel in vowels:
        word = word.replace(vowel, ' ')
    
    result = word.split()
    return result


test = input("Enter a word : ")
print(separate_by_vowels(test))


'''

Write a python program to separate an input word according to the vowels present in the 
string. 
For Example:  
test = ‘KlaGt’  
Result: [‘Kl’, ‘Gt’] 
 


'''