class main1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n / 2; i++) {
            for (int j = i + 1; i <= n / 2; j++) {
                if (i * j == n) {
                    System.out.println("yes");
                    break;
                } else {
                    System.out.println("no");
                    break;
                }
            }
        }
    }

}
