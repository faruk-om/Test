package Arrays;

public class strogeasManyArrays {

	public static void main(String[] args) {

		int a[] = { 100, 200, 300, 400, 500 }; // can storage as many arrays we want no limitation but will will hold as
												// many will be declared with out any limts

		int sum = 0; //

		for (int i : a) {
			System.out.println(i);
			sum = sum + i; // will add 100 to each sum and it the i value

		}
		System.out.println(sum);

	}

}
