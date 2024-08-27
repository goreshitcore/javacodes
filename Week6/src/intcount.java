
    public static int count(int[] array) {
        int count = 0;
        for (int i : array) {
            if (i < 0) {
                count++;
            }
        }
        return count;
    }
}
