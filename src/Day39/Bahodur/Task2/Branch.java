package Day39.Bahodur.Task2;

public class Branch {
    int branchId;
    int zipCode;

    public Branch(int branchId) {
        this.branchId = branchId;
    }

    public Branch(int branchId, int zipCode) {
        this(branchId);
        this.zipCode = zipCode;
    }



    @Override
    public String toString() {
        return "Branch{" +
                "branchId=" + branchId +
                ", zipCode=" + zipCode +
                '}';
    }
}
