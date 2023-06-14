import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxWeightDiff {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Shopping items =");
		int qun= sc.nextInt();
		System.out.println("Enter Shopping items weights ");
		List <Integer> list = new ArrayList<>();
		//int [] wi =new int[qun];
		for(int i=0;i<qun;i++) {
			//wi[i]=sc.nextInt();
			list.add(sc.nextInt());
		}
		System.out.print("Enter K =");
		int k=sc.nextInt();
		int kSum=0;
		for(int i=0;i<k;i++) {
			int min = list.get(0);
			for(int j=0;j<list.size();j++) {
				if(list.get(j)<min) {
					min=list.get(j);
				}
			}
			kSum=kSum+min;
			list.remove(list.indexOf(min));
			
		}
		int fSum=0;
		for(int i=0;i<list.size();i++) {
			fSum=fSum+list.get(i);
		}
		System.out.print("Output="+(fSum-kSum));
		
		
	}

}
