'''
Examine the following function percentage: 
Determine the output for the following function calls: 
(a) percentage(150.0, 200.0) 
(b) percentage(150.0, 0.0) 
(c) percentage('150.0', '200.0')
'''

def percentage(marks, total):
    try: 
        percent = (marks / total) * 100 
    except ValueError: 
        print('ValueError') 
    except TypeError: 
        print('TypeError') 
    except ZeroDivisionError:
        print('ZeroDivisionError') 
    except: 
        print('Any other Error') 
    else: 
        print(percent) 
    finally: 
        print('Function percentage completed')


percentage(150.0, 200.0) 
percentage(150.0, 0.0) 
percentage('150.0', '200.0') 

'''
75.0
Function percentage completed
ZeroDivisionError
Function percentage completed
TypeError
Function percentage completed
'''