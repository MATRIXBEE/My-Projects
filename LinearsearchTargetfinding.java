public class LinearsearchTargetfinding {
    public static void main(String[] args) {
        int[] arr = {4,3,1,9,8,7};
        int target = 9;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Target " + target + " found in the array.");
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }
}


