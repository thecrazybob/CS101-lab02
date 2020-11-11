Create a new project called Lab02d. Design and implement a program that computes and then reports the maximum number of flowers that can be planted in a triangular-shaped garden having sides of length a, b and c meters, assuming at most 17 flowers can be planted in each square meter. You can use Heron's formula (below) to compute the area of the garden, but when computing the number of flowers, remember that partial flowers will die! Tip: the Math class has a function Math.sqrt that you can use to compute the square root of a value.

Heron's formula: the area of a triangle whose sides have lengths a, b, and c is

A = \sqrt{s(s-a)(s-b)(s-c)},

where s is the semi-perimeter of the triangle; that is

s=\frac{a+b+c}{2}.