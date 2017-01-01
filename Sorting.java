	public static void SelectionSort(String[] names){
		for (int i = 0; i < names.length - 1; i++){
			int small = i;
			for (int j = i + 1; j < names.length; j++){
				if (names[j].compareTo(names[small]) < 0){
					small = j;
				}
			}
			int temp = names[i];
			names[i] = names[small];
			names[small] = temp;
		}
