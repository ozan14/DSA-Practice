class Solution {
    public boolean checkValid(int[][] matrix) {
        for(int i = 0; i< matrix.length; i++){
            HashMap<Integer, Boolean> map = new HashMap<>();
            for (int j = 0; j<matrix.length;j++){
                map.put(matrix[i][j],true);
            }
            if (map.size()<matrix.length){
                return false;
            }
        }
        for(int i = 0; i< matrix.length; i++){
            HashMap<Integer, Boolean> map = new HashMap<>();
            for (int j = 0; j<matrix.length;j++){
                map.put(matrix[j][i],true);
            }
            if (map.size()<matrix.length){
                return false;
            }
        }
        return true;
    }
}