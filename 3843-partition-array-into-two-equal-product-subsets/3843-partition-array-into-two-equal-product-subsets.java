class Solution {
    public boolean checkEqualPartitions(int[] inputArray, long targetProduct) {
        int totalElements = inputArray.length;
        int totalSubsets = 1 << totalElements;  // 2^n possible subsets

        for (int subsetMask = 1; subsetMask < totalSubsets - 1; subsetMask++) {
            long productOfFirstSubset = 1;
            long productOfSecondSubset = 1;
            boolean isFirstSubsetValid = true;
            boolean isSecondSubsetValid = true;

            // First subset product calculation
            for (int index = 0; index < totalElements; index++) {
                if ((subsetMask & (1 << index)) != 0) {
                    productOfFirstSubset *= inputArray[index];
                    if (productOfFirstSubset > targetProduct) {
                        isFirstSubsetValid = false;
                        break;
                    }
                }
            }

            if (!isFirstSubsetValid || productOfFirstSubset != targetProduct) continue;

            // Second subset product calculation
            for (int index = 0; index < totalElements; index++) {
                if ((subsetMask & (1 << index)) == 0) {
                    productOfSecondSubset *= inputArray[index];
                    if (productOfSecondSubset > targetProduct) {
                        isSecondSubsetValid = false;
                        break;
                    }
                }
            }

            if (isSecondSubsetValid && productOfSecondSubset == targetProduct) {
                return true;
            }
        }

        return false;
    }
}