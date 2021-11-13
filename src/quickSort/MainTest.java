package quickSort;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] dizi = {22 , 33 , 35 , 29 , 19 , 12 , 26};
		
		QuickSort quickSort = new QuickSort();
		
		quickSort.sort(dizi, 0, 6); // 0 ve 6 dizinin sıralanmasını istediğimiz aralıkları belirtir.
		
		System.out.println(dizi);

	}

}
