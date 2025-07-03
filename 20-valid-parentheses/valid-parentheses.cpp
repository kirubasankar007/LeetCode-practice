#include <iostream>
#include <stack>
using namespace std;

class Solution {
public:
    bool isValid(string s) {
        stack<char> st;
        for (char ch : s) {
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);  // push opening brackets
            } else {
                if (st.empty()) return false;

                if ((ch == ')' && st.top() != '(') ||
                    (ch == '}' && st.top() != '{') ||
                    (ch == ']' && st.top() != '[')) {
                    return false;
                }
                st.pop();  
            }
        }
        return st.empty();  // valid if stack is empty
    }
};
