
public class deleteFromArray {

	public static void main(String[] args) {
		int[] data = { 10, 20, 30, 40, 50 };
		int indexToDelete = 2;

		data = toDelete(indexToDelete, data);

		printArray(data);
		int indexToInsert = 2;
		int newValue = -10;

		data = toInsert(indexToInsert, newValue, data);
		printArray(data);

	}
// method which deletes a value
	public static int[] toDelete(int indToDelete, int[] array) {
		int[] newArray = new int[array.length - 1];
		for (int oi = 0, ci = 0; oi < array.length; oi++) {
			if (oi != indToDelete) {
				newArray[ci++] = array[oi];
			}
		}
		return newArray;
	}
// method which inserts a value
	public static int[] toInsert(int indToInsert, int newValue, int[] array) {
		int[] newArray = new int[array.length + 1];
		for (int oi = 0, ci = 0; oi < array.length + 1; oi++) {
			if (oi < indToInsert) {
				newArray[ci++] = array[oi];
			} else if (oi == indToInsert) {
				newArray[ci++] = newValue;
			} else {
				newArray[ci++] = array[oi - 1];
			}
		}
		return newArray;
	}
// method which prints array
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
		System.out.println();
    }
}
