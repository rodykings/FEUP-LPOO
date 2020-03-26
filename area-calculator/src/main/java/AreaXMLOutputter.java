public class AreaXMLOutputter {

    private SumProvider sp;

    public AreaXMLOutputter(SumProvider sp) {
        this.sp = sp;
    }

    public String output(){
        return "<area>"+ sp.sum()+ "</area>";
    }
}
