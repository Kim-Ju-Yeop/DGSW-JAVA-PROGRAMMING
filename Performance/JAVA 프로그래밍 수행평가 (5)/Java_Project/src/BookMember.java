
public class BookMember {
    private int memberNumber;

    public BookMember(int memberNumber){
        setMemberNumber(memberNumber);
    }

    public BookMember(){

    }

    protected void setMemberNumber(int memberNumber) {
        this.memberNumber = memberNumber;
    }
    protected int getMemberNumber() {
        return memberNumber;
    }
}
