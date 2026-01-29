//three sum such that sum is zero
// C# program to find all triplets with zero sum
using System;
using System.Collections.Generic;

class GfG {

    // Function to find all triplets with zero sum
    static List<List<int>> findTriplets(int[] arr) {
        
        // Dictionary to store indices for each value
        Dictionary<int, List<int>> map = new Dictionary<int, List<int>>();
        
        // Resultant list
        List<List<int>> ans = new List<List<int>>();
        
        // Check for all pairs i, j
        for (int j = 0; j < arr.Length; j++) {
            for (int k = j + 1; k < arr.Length; k++) {
                
                // Value of third index should be 
                int val = -1 * (arr[j] + arr[k]);
                
                // If such indices exist
                if (map.ContainsKey(val)) {
                    
                    // Append the i, j, k
                    foreach (int i in map[val]) {
                        ans.Add(new List<int> { i, j, k });
                    }
                }
            }
            
            // After j'th index is traversed
            // We can use it as i.
            if (!map.ContainsKey(arr[j])) {
                map[arr[j]] = new List<int>();
            }
            map[arr[j]].Add(j);
        }
        
        return ans;
    }

    static void Main(string[] args) {
        int[] arr = { 0, -1, 2, -3, 1 };
        List<List<int>> res = findTriplets(arr);
        foreach (var triplet in res) {
            Console.WriteLine(triplet[0] + " " + triplet[1] + " " + triplet[2]);
        }
    }
}