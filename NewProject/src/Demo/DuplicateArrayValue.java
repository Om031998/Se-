package Demo;

public class DuplicateArrayValue {

	public static void main(String[] args) {
		int temp=0;
		int a[]= {1,5,3,5,8,4,3};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.print(a[i]+" ");
//					temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
				}
			}
		}

	}

}
