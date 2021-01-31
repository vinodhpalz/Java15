//Collections - Grouping of Objects
// Generics - Applying Generics will make your code type safe.
// Wrapper Classes - Byte, Short, Integer, Long, Float, Double, Boolean, Character
// AutoBoxing and AutoUnBoxing - Converting primitive type to an Object automatically and vice versa.
// Boxing - Converting primitive data type to an Object
// UnBoxing - Converting Object to an primitive Data type.
// How to sort user defined objects which are added inside a collection.

import java.util.*;
class TestColl
{
	public static void main(String[] args)
	{
		Comparator<Student> ag = new AgeComparator();
		TreeSet<Student> al = new TreeSet<Student>(ag);
		al.add(new Student("Vinodh",20));
		al.add(new Student("Sundar", 19));
		al.add(new Student("Jeya",18));
		al.add(new Student("Arun", 43));
		al.add(new Student("Jiva",20));
		for(Student st : al)
		{
			System.out.println(st.getName()+" "+st.getAge());
		}
	}
}

