def separate_by_vowels(word):
    vowels = 'aeiouAEIOU'
    for vowel in vowels:
        word = word.replace(vowel, ' ')
    
    result = word.split()
    return result


test = input("Enter a word : ")
print(separate_by_vowels(test))