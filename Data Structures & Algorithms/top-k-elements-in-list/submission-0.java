

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
            // Step 1: Count frequencies using HashMap
                    Map<Integer, Integer> count = new HashMap<>();
                            for (int num : nums) {
                                        count.put(num, count.getOrDefault(num, 0) + 1);
                                                }
                                                        
                                                                // Step 2: Convert to List and sort by frequency
                                                                        List<Integer> elements = new ArrayList<>(count.keySet());
                                                                                elements.sort((a, b) -> count.get(b) - count.get(a));
                                                                                        
                                                                                                // Step 3: Extract top k elements
                                                                                                        int[] result = new int[k];
                                                                                                                for (int i = 0; i < k; i++) {
                                                                                                                            result[i] = elements.get(i);
                                                                                                                                    }
                                                                                                                                            
                                                                                                                                                    return result;
                                                                                                                                                        }
                                                                                                                                                        }
