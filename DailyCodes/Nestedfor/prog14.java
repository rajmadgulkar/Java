class ForDemo{
    public static void main(String[] args) {

        for(int i=0;i<3;i++){
            int x=1;
            for(int j=0;j<3;j++){
                System.out.print(" "+(x*x));
                x++;
            }
            System.out.println();
        }
    }
}