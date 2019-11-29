
public class User extends BookMember {

    private String name;
    private String phoneNumber;
    private String address;

    public User(String name, String phoneNumber, String address, int memberNumber) {
        super(memberNumber);
        setName(name);
        setPhoneNumber(phoneNumber);
        setAddress(address);
    }

    public User(){

    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public int getMemberNumber() {
        return super.getMemberNumber();
    }

    @Override
    protected void setMemberNumber(int memberNumber) {
        super.setMemberNumber(memberNumber);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

//    @Override
//    protected void setMemberNumber(int memberNumber) {
//        super.setMemberNumber(memberNumber);
//    }

    public void setAddress(String address) {
        this.address = address;
    }
}
