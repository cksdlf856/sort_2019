package sist.com.sort;

public class Quick {
	//(11����)
	//10,3,11,98,66,1 (11�� ���� ������ ������ �״�� �ΰ� �������� ũ�� �״�� �ΰ� ������ 11�� ��ġ�� �ٲ۴�.
	//10,3,1 ,98,66,11 (�� �ٽ� 1�� �������� ������ ������ �״�� ũ�� ��ġ�� �ٲ۴�. �׸��� �����ʰ� ���Ͽ� ũ�� �״�� �ΰ� ������ �ٲ۴�.
	//1, 3,10,98,66,11 (���ȣ���� �Ἥ �������� �ϴ� ��ġ�� �ٲ۴�. ������ 10��ġ���� �������� �ٿ����� ���������� �÷����� ���ȣ�� 2������ ����.
	
	//(3����)
	//1, 3,10,98,66,11 (3�������� ������ �� ������ �״�� �ΰ� �������� ũ�� �״�� �д�.
	
	//(98����)
	//1, 3,10,11,66,98 (98�� �������� ������ �� ������ �״�� �ΰ� �������� ũ�� �״�� ������ ��ġ�� �ٲ۴�. �׷��� 98�� 11�� ��ġ�� �ٲ�
	//1, 3,10,11,66,98 (11�� �������� ������ ������ �״�� �ΰ� �������� ũ�� �״�� �д�
	
	//(1����)
	//1, 3,10,11,66,98 (1�� �������� �������� �� ũ�� �״�� �д�.
	
	//(66����)
	//1, 3,10,11,66,98 (66�� �������� ������ �� ������ �״�� �ΰ� �������� ũ�� �״�� �д�.
	
	//(98����)
	//1, 3,10,11,66,98 (98�� �������� ������ �� ������ �״�� �д�.
	
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
		
		if(s>0)quicksort(x,s-1,end);//������
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
		if(s<temp.length-1)left(temp,s+1,end);//������
	}	
	public static void main(String []args) {
		Quick q=new Quick();
		int[]x= {99,98,3,1,2,4};
		q.quicksort(x,2,x.length-1);			
	}
}
