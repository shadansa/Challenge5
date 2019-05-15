package Challenge5;

public class Challenge5 {
	
	private static final String RED_WINS = "Red wins";
	private static final String YELLOW_WINS = "Yellow wins";
	private static final String RED_PLAYS_NEXT = "Red plays next";
	private static final String YELLOW_PLAYS_NEXT = "Yellow plays next";
	
	public static void main(String[] args) {
		String gridData = "";
		for (int i=0;i<args.length;i++) {
			gridData = gridData + args[i];
		}
		System.out.println(new Challenge5().getGridStatus(gridData));
	}
	
	public String getGridStatus(String gridData) {
		gridData = gridData.replaceAll(" ", "").replace("[", "").replace("]", "");
		gridData = gridData.replaceAll("\"", "");
		String[] gridLines = gridData.split(",", -1);
		for (int row = 0;  row < gridLines.length; row++) {
			char[] gridColumns = gridLines[row].toCharArray();
			for (int column = 0; column < gridColumns.length; column++) {
				String currentGridValue = String.valueOf(gridColumns[column]);
				if (!currentGridValue.equals(".")) {
					// Check Vertical 4
					if (row <= 2) {
						if (currentGridValue.equalsIgnoreCase(String.valueOf(gridLines[row+1].toCharArray()[column])) 
								&& currentGridValue.equalsIgnoreCase(String.valueOf(gridLines[row+2].toCharArray()[column]))
								&& currentGridValue.equalsIgnoreCase(String.valueOf(gridLines[row+3].toCharArray()[column]))) {
							if (currentGridValue.contains("r") || currentGridValue.contains("R")) {
								return RED_WINS;
							} else {
								return YELLOW_WINS;
							}
						}
					}
					// Check Horizontal 4
					if (column <= 3) {
						if (currentGridValue.equalsIgnoreCase(String.valueOf(gridColumns[column+1])) 
								&& currentGridValue.equalsIgnoreCase(String.valueOf(gridColumns[column+2]))
								&& currentGridValue.equalsIgnoreCase(String.valueOf(gridColumns[column+3]))) {
							if (currentGridValue.contains("r") || currentGridValue.contains("R")) {
								return RED_WINS;
							} else {
								return YELLOW_WINS;
							}
						}
					}
					// Check Diagonal - Left->Right
					if (row <= 2 && column <= 3) {
						if (currentGridValue.equalsIgnoreCase(String.valueOf(gridLines[row+1].toCharArray()[column+1]))
								&& currentGridValue.equalsIgnoreCase(String.valueOf(gridLines[row+2].toCharArray()[column+2]))
								&& currentGridValue.equalsIgnoreCase(String.valueOf(gridLines[row+3].toCharArray()[column+3]))) {
							if (currentGridValue.contains("r") || currentGridValue.contains("R")) {
								return RED_WINS;
							} else {
								return YELLOW_WINS;
							}
						}
					}
					// Check Diagonal - Right->Left
					if (row <= 2 && column >= 3) {
						if (currentGridValue.equalsIgnoreCase(String.valueOf(gridLines[row+1].toCharArray()[column-1]))
								&& currentGridValue.equalsIgnoreCase(String.valueOf(gridLines[row+2].toCharArray()[column-2]))
								&& currentGridValue.equalsIgnoreCase(String.valueOf(gridLines[row+3].toCharArray()[column-3]))) {
							if (currentGridValue.contains("r") || currentGridValue.contains("R")) {
								return RED_WINS;
							} else {
								return YELLOW_WINS;
							}
						}
					}
				}
			}
		}
		if (gridData != null && !gridData.isEmpty()) {
			if (gridData.contains("R")) {
				return YELLOW_PLAYS_NEXT;
			} else {
				return RED_PLAYS_NEXT;
			}	
		} else {
			return "Please provide input argument";
		}
	}
}
