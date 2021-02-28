/*
Fibonacci Sequence:
F_n = F_(n-1) + F_(n-2)
*/

def fib(n: Int): Int = {
    def go(n: Int, last: Int, acc: Int): Int = {
        if (n <= 0) last
        else go(n - 1, acc, acc + last)
    }
    go(n-1, 0, 1)
}