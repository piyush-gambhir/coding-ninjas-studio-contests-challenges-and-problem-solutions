/*
Problem statement
Tommy loves collecting toys, so he goes to the toy shop and wants to buy all the available toys.

In the toy shop, there are 'N' toys numbered from 0 to 'N - 1'. The price of the 'i'th toy is 'P[i]' rupees. Also, there are 'M' special offers; the 'i'th offer is defined by two integers 'X[i]' and 'Y[i]'. This means that he will get a discount of 'Y[i]' rupees if buys exactly 'X[i]' contiguously numbered toys together, in other words, he will get the discount if he buys the toys numbered from 'j' till 'j + X[i] - 1' such that '0 <= j <= N - X[i]'.

While buying toys, he has to follow these rules:

1) He has to buy all the available toys.
2) He can only buy a toy once by either using an offer or buying a single toy without any offer.
3) He can't use the same offer more than once.
4) It is also possible that some offers are not used.
5) The discount price may even be more than the cost of buying toys. In that case, he will have to pay a negative price.
Your task is to return the minimum price Tommy has to pay to buy all the toys.

For Example :
Let's say 'N' = 5, 'P' = {7, 1, 2, 6, 3}, 'M' = 2, 'X' = {3, 4}, and 'Y' = {8, 1}

He will use the first offer to buy the first three items, worth '7 + 1 + 2 = 10', and gets a discount of 8 rupees. So, he finally pays '10 - 8 = 2' rupees.
He cannot use the second offer as it requires four toys, but only two remain. So he buys them individually without any offer costing him '6 + 3 = 9' rupees.
Finally, he will have to pay '2 + 9 = 11' rupees.
*/

import java.util.* ;
import java.io.*; 
public class Solution {
    static long minimumPrice(int[]p, int[] x, int[] y) {
        // Write your code here.
    }
}