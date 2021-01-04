import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateValue {

	public Set<Integer> findEvenNumberOfDuplicateValue(List<Integer> inputArray) {
		Set<Integer> resultSet = new HashSet<Integer>(inputArray);
		
		for (int i : inputArray) {
			if(!resultSet.add(i))
				resultSet.remove(i);
		}
		return resultSet;
	}

	public void testDuplicate() {
		List<Integer> inputArray = new ArrayList<Integer>();
		inputArray.add(1);
		inputArray.add(2);
		inputArray.add(3);
		inputArray.add(2);
		System.out.println(findEvenNumberOfDuplicateValue(inputArray));
	}

	public static void main(String[] args) {
		new DuplicateValue().testDuplicate();
	}

}
