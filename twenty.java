Public class Twenty{
    public static void main(String [] args){
        long fac=1;
        for(long i=10; i>1;i-- ){
            fac*=i;
        }
        int sum=0;
        while(fac>0){
            sum+=(fac % 10);
            fac/=10;
        }
        System.out.println(sum);
    }
}
