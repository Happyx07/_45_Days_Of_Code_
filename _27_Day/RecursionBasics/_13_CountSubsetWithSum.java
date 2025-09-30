package _27_Day.RecursionBasics;

import java.util.ArrayList;

public class _13_CountSubsetWithSum {
  public static void main(String[] args) {

    int[] arr = {1, 2, 3, 3};
        int target = 6;
    System.out.println(countSubset(arr, 0, target));
    
  }
  public static int countSubset(int[] arr, int index, int sum){

    if(index == arr.length){
      if(sum==0) return 1;
      else return 0;
    }

    int exclude = countSubset(arr, index+1, sum);

    int include = countSubset(arr, index+1, sum-arr[index]);

    return exclude + include;


  }

  

}
/*
 * Perfect! Let’s solve the **“Count subsets with given sum”** problem using recursion and backtracking. I’ll explain step by step.

---

## **Problem Statement**

Given an array `arr` of integers and a target sum `S`, **count the number of subsets** of `arr` whose sum equals `S`.

**Example:**

```
arr = [1, 2, 3], targetSum = 3
Subsets with sum 3: [1,2], [3]
Output: 2
```

---

## **Step 1: Understand the Pattern**

For each element, we have **two choices**:

1. **Include the element** in the subset → subtract its value from remaining sum.
2. **Exclude the element** → keep remaining sum unchanged.

We continue recursively until we reach the end of the array.

---

### **Base Case**

At `index == arr.length`:

* If the remaining sum is 0 → valid subset → return 1
* Else → invalid subset → return 0

---

## **Step 2: Recursive Approach**

```java
public static int countSubsets(int[] arr, int index, int sum) {
    // Base case: reached end of array
    if (index == arr.length) {
        if (sum == 0) return 1; // valid subset
        else return 0;           // invalid
    }
    
    // Option 1: exclude current element
    int exclude = countSubsets(arr, index + 1, sum);
    
    // Option 2: include current element
    int include = countSubsets(arr, index + 1, sum - arr[index]);
    
    return exclude + include;
}
```

---

## **Step 3: Main Function**

```java
public class CountSubsetSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int targetSum = 3;
        
        int count = countSubsets(arr, 0, targetSum);
        System.out.println("Number of subsets with sum " + targetSum + ": " + count);
    }
}
```

---

### **Step 4: Dry Run**

`arr = [1,2,3], targetSum = 3`

Recursion tree (simplified):

```
Index 0, sum 3
├── Exclude 1 → sum 3
│   ├── Exclude 2 → sum 3
│   │   ├── Exclude 3 → sum 3 → invalid
│   │   └── Include 3 → sum 0 → valid ✅
│   └── Include 2 → sum 1
│       ├── Exclude 3 → sum 1 → invalid
│       └── Include 3 → sum -2 → invalid
└── Include 1 → sum 2
    ├── Exclude 2 → sum 2
    │   ├── Exclude 3 → sum 2 → invalid
    │   └── Include 3 → sum -1 → invalid
    └── Include 2 → sum 0 → valid ✅
```

**Valid subsets:** `[3]` and `[1,2]` → count = 2 ✅

---

### **Step 5: Notes / Tips**

1. **Time Complexity:** `O(2^n)` — for each element, 2 choices.
2. **Space Complexity:** `O(n)` recursion stack.
3. Can be optimized using **DP (Memoization)** for larger arrays.

---

If you want, I can **also show a version that prints all subsets with the target sum** (not just counts), which is often asked in interviews.

Do you want me to do that?

 * 
 * 
 */


