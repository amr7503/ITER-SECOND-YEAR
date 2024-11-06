'''
Write a Python function that takes two file names, file1 and file2 as input. The function 
should read the contents of the file file1 line by line and should write them to another 
file file2 after adding a newline at the end of each line.
'''

f1=open("file1.txt","r")
f2=open("file2.txt","w")
data=f1.readlines()
for line in data:
    f2.write(line+'\n')

'''
#To run go to the same directory on terminal and type :  python 11_read_from_a_file_write_to_another_file.py

#Contents of file1::::

Hello World
This is line 2
This is line 3
Last line 

#Contents of file2::::

Hello World

This is line 2

This is line 3

Last line 

'''