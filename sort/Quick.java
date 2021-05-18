package sist.com.sort;

public class Quick {
	//(11기준)
	//10,3,11,98,66,1 (11을 기준 왼쪽이 작으면 그대로 두고 오른쪽이 크면 그대로 두고 작으면 11과 위치를 바꾼다.
	//10,3,1 ,98,66,11 (또 다시 1을 기준으로 왼쪽이 작으면 그대로 크면 위치를 바꾼다. 그리고 오른쪽과 비교하여 크면 그대로 두고 작으면 바꾼다.
	//1, 3,10,98,66,11 (재귀호출을 써서 기준으로 하는 위치를 바꾼다. 기준을 10위치에서 왼쪽으로 줄여가고 오른쪽으로 늘려가는 재귀호출 2가지를 쓴다.
	
	//(3기준)
	//1, 3,10,98,66,11 (3기준으로 왼쪽은 다 작으니 그대로 두고 오른쪽은 크니 그대로 둔다.
	
	//(98기준)
	//1, 3,10,11,66,98 (98을 기준으로 왼쪽은 다 작으니 그대로 두고 오른쪽은 크면 그대로 작으면 위치를 바꾼다. 그래서 98과 11이 위치를 바꿈
	//1, 3,10,11,66,98 (11을 기준으로 왼쪽은 작으니 그대로 두고 오른쪽은 크니 그대로 둔다
	
	//(1기준)
	//1, 3,10,11,66,98 (1을 기준으로 오른쪽은 다 크니 그대로 둔다.
	
	//(66기준)
	//1, 3,10,11,66,98 (66을 기준으로 왼쪽은 다 작으니 그대로 두고 오른쪽은 크니 그대로 둔다.
	
	//(98기준)
	//1, 3,10,11,66,98 (98을 기준으로 왼쪽은 다 작으니 그대로 둔다.
	
    int []temp=new int [6];
	public void quicksort(int []x,int start, int end) {
		int imsi=0;
		int s=start;
		for (int k = 0; k < x.length; k++) {
			int j=x.length-1;
			int i=0;
			while(start>i) {
			if(x[start]<x[i]) {
				imsi=x[start];
				x[start]=x[i];
				x[i]=imsi;
			}
			i++;
			}
			while(start<j) {
			if(x[start]>x[end]) {
				imsi=x[start];
				x[start]=x[end];
				x[end]=imsi;
			}
			j--;
			}
		}
		for (int i = 0; i < x.length; i++) {
			temp[i]=x[i];
		}
		for(int ii:x) {
			System.out.printf("%3d",ii);
		}System.out.println();
		
		if(s>0)quicksort(x,s-1,end);//오류뜸
		left(temp,2,end);
	}
	public void left(int []temp,int start,int end) {
		int imsi=0;
		int s=start;		
		for (int k = 0; k < temp.length; k++) {
			int j=temp.length-1;
			int i=0;
			while(start>i) {
			if(temp[start]<temp[i]) {
				imsi=temp[start];
				temp[start]=temp[i];
				temp[i]=imsi;
			}
			i++;
			}
			while(start<j) {
			if(temp[start]>temp[end]) {
				imsi=temp[start];
				temp[start]=temp[end];
				temp[end]=imsi;
			}
			j--;
			}
		}
		for(int ii:temp) {
			System.out.printf("%3d",ii);
		}System.out.println();
		if(s<temp.length-1)left(temp,s+1,end);//오류뜸
	}	
	public static void main(String []args) {
		Quick q=new Quick();
		int[]x= {99,98,3,1,2,4};
		q.quicksort(x,2,x.length-1);			
	}
}
