#include <iostream>
#include <vector>
#include <unordered_map>
using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> numMap; // Stores number and its index

        for (int i = 0; i < nums.size(); i++) {
            int complement = target - nums[i];

            if (numMap.find(complement) != numMap.end()) {
                // Found the pair
                return {numMap[complement], i};
            }

            // Store the current number with its index
            numMap[nums[i]] = i;
        }

        return {}; // No solution found
    }
};
