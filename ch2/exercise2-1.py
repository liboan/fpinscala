def fib(n):
    # def fib_n(n):
    #     if n == 1:
    #         return 0
    #     elif n == 2:
    #         return 1
    #     else:
    #         return fib_n(n-1) + fib_n(n-2)
    # return fib_n(n)

    def go(n, last, acc):
        print('last', last, 'acc', acc)
        if n <= 0:
            return last
        else:
            return go(n - 1, acc, acc + last)
    return go(n-1, 0, 1)    


print(fib(6))


def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n-1)


def factorial_tail(n, acc=1):
    if n == 0:
        return 1
    else:
        return factorial_tail(n - 1, n * acc)