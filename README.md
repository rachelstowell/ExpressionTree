# ExpressionTree

I. Input

   All input data are from a file "in.dat". The file contains a
sequence of postfix form expressions, one per line. The character '$' 
is an end mark. Anything after the end mark is comment and ignored. 
For example, the following file has four postfix form expressions:

   1 2 3 4 5 == ! ^ * + $
   3 6 4 5 * - 1 + * 2 2 3 ^ ^ + $
   77 2 1 - 80 4 / + > $
   2 3 4 * + 10 6 % >= ! 20 30 != && 45 5 / 3 3 * == || $

whose corresponding infix form expressions are:

   1 + 2 * 3 ^ ! ( 4 == 5 ) $
   3 * ( 6 - 4 * 5 + 1 ) + 2 ^ 2 ^ 3 $
   77 > ( 2 - 1 ) + 80 / 4 $
   ! ( 2 + 3 * 4 >= 10 % 6 ) && 20 != 30 || 45 / 5 == 3 * 3 $

Each expression is a sequence of tokens (i.e., constant integers,
operators, and the end mark) separated by spaces. 


II. Output

   Output data and related information are sent to the screen.
This program will do the following for each expression:

   (1) printing the expression before it is manipulated;
   (2) showing the expression tree;
   (3) printing the fully parenthesized infix form expression;
   (4) reporting the value of the expression.


III. Operators

   The following operators are considered. They are listed in the
decreasing order of precedence.

   Token            Operator            Associativity

    !               logical not         right-to-left
    ^               exponentiation      right-to-left
    *  /  %         multiplicative      left-to-right
    +  -            additive            left-to-right
    <  <=  >  >=    relational          left-to-right
    ==  !=          equality            left-to-right
    &&              logical and         left-to-right
    ||              logical or          left-to-right


