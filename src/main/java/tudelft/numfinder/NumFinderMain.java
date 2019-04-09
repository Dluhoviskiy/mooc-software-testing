package tudelft.numfinder;

public class NumFinderMain {

    public static void main (String[] args) {
        NumFinder nf = new NumFinder();

        // this works
        // nf.find(new int[] {4, 25, 7, 9});

        // this crashes
        nf.find(new int[] {3, 9, 0, 3, -5});

        System.out.println("The largest number = " + nf.getLargest());
        System.out.println("The smallest number = " + nf.getSmallest());
    }
}
