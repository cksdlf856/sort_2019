package sist.com.sort;

public class Heap {
	int[] heap = { 10, 4, 2, 1, 11, 21 };

	public void sort() {

		for (int i = 1; i < heap.length; i++) {
			int x = i;
			do {
				int root = (x - 1) / 2;
				if (heap[root] < heap[x]) {
					int imsi = heap[root];
					heap[root] = heap[x];
					heap[x] = imsi;
				}
				x = root;
			} while (x != 0);

		}
		
		for(int p: heap) {
			System.out.print(p);
			System.out.print(",");
		}

	}
	
	public void sort2() {
		for (int i = (heap.length - 1); i >= 0; i--) {
			int imsi = heap[0];
			heap[0] = heap[i];
			heap[i] = imsi;
			int root = 0;
			int xx = 1;
			do {
				xx = 2 * root + 1;
				if ((heap[xx] < heap[xx + 1]) && (xx < i - 1)) {
					xx++;
				}
				if ((heap[root] < heap[xx]) && xx < i) {
					int imsi2 = heap[root];
					heap[root] = heap[xx];
					heap[xx] = imsi2;
				}
				root = xx;
			} while (xx < i);
		}
		for(int p: heap) {
			System.out.print(p);
			System.out.print(",");
		}
	}

	public static void main(String[] args) {
		Heap s = new Heap();
		s.sort();
	}
}
