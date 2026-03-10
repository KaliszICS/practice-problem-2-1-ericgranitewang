public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int find(int[] array, int number) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				return i;
			}
		}
		return -1;
	}

	public static int findLast(String[] array, String string) {
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i].equals(string)) {
				return i;
			}
		}
		return -1;
	}

	public static int findSecond(char[] array, char character) {
		int index = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == character) {
				if (index == -1) {
					index = i;
				} else {
					return i;
				}
			}
		}
		return index;
	}

	public static int[] findAll(double[] array, double number) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
		 	if (array[i] == number) {
		 		count++;
		 	}
		}
		int index = 0;
		int[] indices = new int[count];
		for (int i = 0 ; i < array.length; i++ ) {
			if (array[i] == number) {
				indices[index] = i;
				index++;
			}
		}
		return indices;
		// ArrayList<Integer> indices = new ArrayList<Integer>();
		// for (int i = 0; i < array.length; i++) {
		// 	if (array[i] == number) {
		// 		indices.add(i);
		// 	}
		// }
		// if (indices.size() == 0) {
		// 	return new int[]{};
		// }
		// int[] indexArray = new int[indices.size()];
		// for (int i = 0; i < indices.size(); i++) {
		// 	indexArray[i] = indices.get(i);
		// }
		// return indexArray;
	}

}
