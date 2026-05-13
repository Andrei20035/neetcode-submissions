class Solution {
    public boolean isValidSudoku(char[][] board) {

        Map<Integer, Set<Integer>> rows = new HashMap<>();
        Map<Integer, Set<Integer>> columns = new HashMap<>();
        Map<List<Integer>, Set<Integer>> subBoxes = new HashMap<>();

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                int number = Character.getNumericValue(board[i][j]);

                if(number != -1) {
                    rows.putIfAbsent(number, new HashSet<>());
                    columns.putIfAbsent(number, new HashSet<>());
                    
                    int boxi = i / 3;
                    int boxj = j / 3;

                    List<Integer> key = Arrays.asList(boxi, boxj);
                    subBoxes.putIfAbsent(key, new HashSet<>());

                    int initialRowSize = rows.get(number).size();
                    int initialColumnSize = columns.get(number).size();
                    int initialBoxSize = subBoxes.get(key).size();

                    rows.get(number).add(i);
                    columns.get(number).add(j);
                    subBoxes.get(key).add(number);


                    if(rows.get(number).size() == initialRowSize || columns.get(number).size() == initialColumnSize || subBoxes.get(key).size() == initialBoxSize) {
                        return false;
                    }                
                }
            }
        }
        return true;
    }
}
