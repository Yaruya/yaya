package shuzu;

public class shu {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//a
		int[] f = new int[7];
		System.out.println(f[6]);
		//b
		int g[] = {8,8,8,8,8};
		//c
		float[] c = new float[100];
		float sum = 0;
        for(int i = 0;i<c.length;i++) {
        	sum += c[i];
        }
        System.out.println(sum);
        //d
        int a[] = {1,2,3,4,5,6,7,8,9,10,11};
        int b[] = {11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,3940,41,42,43,44};
        for(int i = 0;i<a.length;i++) {
        	b[i] = a[i];
        	System.out.println(b[i]+"\t");
        }
        System.out.println("\n");
        //e
        float[] w = new float[99];
        float min = w[0];
        float max = w[0];
        float t;
        for(int k = 0;k<w.length;k++) {
        	if(w[k]<min) {
        		t = w[k];
        		w[k] = min;
        		min = t;
        	}if(w[k]>max) {
        		t = w[k];
        		w[k] = max;
        		max = t;
        	}
        	
        }
	}

}
