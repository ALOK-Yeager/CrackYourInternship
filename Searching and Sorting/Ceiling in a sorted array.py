def ceil_search(arr, x):
   
    if x <= arr[0]:
        return arr[0]
    
    for i in range(len(arr) - 1):
        
        if arr[i] == x:
            return arr[i]
        
        
        if arr[i] < x and arr[i + 1] >= x:
            return arr[i + 1]
    
   
    return -1


arr = [1, 2, 8, 10, 10, 12, 19]
x = 3

result = ceil_search(arr, x)

if result == -1:
    print(f"Ceiling of {x} doesn't exist in the array.")
else:
    print(f"Ceiling of {x} is {result}.")
