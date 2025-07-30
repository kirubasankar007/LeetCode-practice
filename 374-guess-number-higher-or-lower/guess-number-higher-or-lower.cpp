#include<iostream>
using namespace std;
class Solution {
public:
    int guessNumber(int n) {
        int left = 1, right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;  // prevent overflow
            int res = guess(mid);

            if (res == 0) 
                return mid;        // found the pick
            else if (res < 0) 
                right = mid - 1;   // pick is lower
            else 
                left = mid + 1;    // pick is higher
        }
        return -1;  // should never reach here
    }
};
