def is_possible(a, b, n, k):
    # Sort array a[] in decreasing order
    a_sorted = sorted(a, reverse=True)

    # Sort array b[] in increasing order
    b_sorted = sorted(b)

    # Check condition on each index
    for i in range(n):
        if a_sorted[i] + b_sorted[i] < k:
            return False

    return True

# Driver code
if __name__ == "__main__":
    a = [2, 1, 3]
    b = [7, 8, 9]
    k = 10
    n = len(a)

    if is_possible(a, b, n, k):
        print("Yes")
    else:
        print("No")
