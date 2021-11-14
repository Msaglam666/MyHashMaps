
public class MyHashMaps<Key, Val> {

	String[] Key;
	String[] HashMap;

	public MyHashMaps() {
		Key = new String[0];
		HashMap = new String[0];

	}

	public void put(String key, String value) {
		String[] tempKey = new String[HashMap.length + 1];
		String[] tempHashmap = new String[HashMap.length + 1];

		for (int i = 0; i < HashMap.length; i++) {
			tempKey[i] = Key[i];
			tempHashmap[i] = HashMap[i];
		}
		tempKey[HashMap.length] = key;
		tempHashmap[HashMap.length] = key + value;

		Key = new String[tempKey.length];
		HashMap = new String[tempHashmap.length];

		for (int i = 0; i < tempHashmap.length; i++) {
			Key[i] = tempKey[i];
			HashMap[i] = tempHashmap[i];

		}

	}

	public void get(Object key) {
		int index = -1;
		for (int i = 0; i < Key.length; i++) {
			if (Key[i] == key) {
				index = i;
			}
		}
		for (int i = 0; i < HashMap.length + 1; i++) {
			if (i == index) {
				System.out.println(HashMap[i]);
			}
		}
	}

	public void remove(String object) {
		String[] tempHashmap = new String[HashMap.length];
		for (int i = 0; i < HashMap.length; i++) {
			tempHashmap[i] = HashMap[i];
		}
		HashMap = new String[tempHashmap.length - 1];
		int alllist = 0;
		for (int i = 0; i < HashMap.length + 1; i++) {
			if (Key[i] == object) {

				continue;
			} else {
				HashMap[alllist] = tempHashmap[i];
				alllist++;
			}

		}

	}

	public void remove(int index) {
		String[] tempHashmap = new String[HashMap.length];
		for (int i = 0; i < HashMap.length; i++) {
			tempHashmap[i] = HashMap[i];
		}
		HashMap = new String[tempHashmap.length - 1];
		int alllist = 0;
		for (int i = 0; i < HashMap.length + 1; i++) {
			if (i == index) {
				continue;
			} else {
				HashMap[alllist] = tempHashmap[i];
				alllist++;

			}
		}
	}

	public void getAll() {
		for (String List : HashMap) {
			System.out.println(List);
		}
	}

	public void size() {
		System.out.println(HashMap.length);
	}

}
