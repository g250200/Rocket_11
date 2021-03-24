package TestingSystem_Assignment_3;

import java.util.Comparator;

public class Department implements Comparator<Department>{
		int Id;
		String Name;
		/* 
		* @see java.lang.Object#toString()
		*/
		@Override
		public String toString() {
			return "Department [Id=" + Id + ", Name=" + Name + "]";
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Department other = (Department) obj;
			if (Name == null) {
				if (other.Name != null)
					return false;
			} else if (!Name.equals(other.Name))
				return false;
			return true;
		}
		
		/* 
		* @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
		*/
		@Override
		public int compare(Department o1, Department o2) {
			return o1.Name.compareTo(o2.Name);
		}
		
}
