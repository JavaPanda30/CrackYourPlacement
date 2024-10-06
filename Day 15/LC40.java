class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        LinkedList<Integer> comb = new LinkedList<>();
        Arrays.sort(candidates);
        backtrack(candidates, comb, target, 0, results);
        return results;
    }

    private void backtrack(int[] candidates,LinkedList<Integer> comb,Integer remain,Integer curr,List<List<Integer>> results) {
        if (remain == 0) {
            results.add(new ArrayList<Integer>(comb));
            return;
        }
        for (int i = curr; i < candidates.length; ++i) {
            if (i > curr && candidates[i] == candidates[i - 1])
                continue;
            Integer pick = candidates[i];
            if (remain - pick < 0)
                break;
            comb.addLast(pick);
            backtrack(candidates, comb, remain - pick, i + 1, results);
            comb.removeLast();
        }
    }
}