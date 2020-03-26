public class AreaStringOutputter{

    private SumProvider sp;

    public AreaStringOutputter(SumProvider sp) {
        this.sp = sp;
    }

    public String output(){
        return "Sum of areas: " + sp.sum();
    }
}
