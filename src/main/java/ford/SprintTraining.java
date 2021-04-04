package main.java.ford;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class SprintTraining {

	public static void main(String[] args) {
		System.out.println(getMostVisited(5, Arrays.asList(1, 5, 10, 3))); // 5
		System.out.println(getMostVisited(5, Arrays.asList(2, 4, 1, 3))); // 2
	}

	private static int getMostVisited(int noOfSprint, List<Integer> sprints) {

		HashMap<Integer, Integer> visitedSprintMap = new HashMap<>();
		int start = 0;
		int end = 0;

		// loop to iterate sprints
		for (int j = 1; j < sprints.size(); j++) {
			// stand & end variable to add value to the sprints
			if (sprints.get(j - 1) > sprints.get(j)) {
				start = sprints.get(j);
				end = sprints.get(j - 1);
			} else {
				start = sprints.get(j - 1);
				end = sprints.get(j);
			}

			// swap start and end based on higher/lower value
			int k = start;
			while (k != end + 1) {
				visitedSprintMap.put(k, visitedSprintMap.get(k) == null ? 1 : visitedSprintMap.get(k) + 1);
				k++;
			}
		}
		return mostVisitedSprint(visitedSprintMap);
	}

	// method to get higher sprint's value for lowest sprint
	private static int mostVisitedSprint(HashMap<Integer, Integer> visitedSprintMap) {
		int mostVisitedSprint = 1;
		int mostVisitedSprintValue = 0;
		for (Entry<Integer, Integer> entry : visitedSprintMap.entrySet()) {
			if (mostVisitedSprint >= entry.getKey() || mostVisitedSprintValue < entry.getValue()) {
				mostVisitedSprintValue = entry.getValue();
				mostVisitedSprint = entry.getKey();
			}
		}
		return mostVisitedSprint;
	}
}

/**
 * Questions will be available in 'questions/ford' folder.
 */
