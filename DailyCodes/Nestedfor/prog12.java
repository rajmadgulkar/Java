class ForDemo{
    public static void main(String[] args) {
        int x=1;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(" "+x++);
            }
            System.out.println();
        }
    }
}