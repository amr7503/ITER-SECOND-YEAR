def pigLatin(word):
    vowels = ['a','e','i','o','u']
    if word[0].lower() in vowels:
        return word + "way"
    else:
        return word[1:] + word[0] + "ay"
    
w=input("Enter a word: ")
print(pigLatin(w))


'''
Pig Latin takes the first consonant of a word, moves it to the end of the word and adds 
on an “ay”. If a word begins with a vowel you just add “way” to the end. For example, 
pig  becomes  igpay,  banana  becomes  ananabay,  and  aadvark  becomes  aadvarkway. 
Create a program that will ask the user to enter a word and change it into Pig Latin. 
Make sure the new word is displayed in lower case.
'''