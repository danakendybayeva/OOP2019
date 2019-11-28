package task3;

interface MyCollection {
	void showElements();
	int size();
	void addElement(Object o);
	void deleteElement(Object o);
	void clear();
	boolean contains(Object o);
	boolean equals(Object o);
	boolean isEmpty(Object o);
	int hashCode();
}
