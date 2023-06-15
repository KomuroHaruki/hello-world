import java.util.Random;


class dice{
    public static void main(String args[]){

	Random rd = new Random();
	int[] num = new int[2];
        int total=0;
	

	for(int i=0;i<2;i++)
	    {
		num[i] = rd.nextInt(6)+1;
		total =total +  num[i];
		System.out.println("Die " + i+1 + ":" + num[i] );
	    }
	
	System.out.println("Total value: " + total);

    }
}
	
