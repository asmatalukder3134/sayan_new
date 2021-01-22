package macys;

public class UU {
     @Test
	public void click() {
		int a[]= {88,99,44,55,22,1231};
		int max=a[0];
		int smax=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
				smax=a[0];
			}else(){
			a[i]>smax;
			smax=a[i];
			}
			System.out.println("max:"+" "+max);
			System.out.println("smax:"+" "+smax);
		}
		
	}

}
