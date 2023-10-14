public class AadharCardTest {
    
    public static void main(String[] args){
        AadharCard aadharCardObj1 = new AadharCard("9090-7654-7664","john","Banglore" ,3);
        AadharCard aadharCardObj2 = new AadharCard("8765-6542-7653","ram","Mysore",7 );
        AadharCard aadharCardObj3 = new AadharCard("9842-5677-8653","sandy","Hubli",1 );
        aadharCardObj1.identify();
        aadharCardObj2.identify();
        aadharCardObj3.identify();

    }
            
}
class Card{
 
  
}
    
class AadharCard extends Card{
    private String cardNumber;
    private String name;
    private String address;
    private int bioMetricYear;
    

    public AadharCard(String cardNumber,String name,String address,int bioMetricYear)
    {
        this.cardNumber = cardNumber;
        this.name = name;
        this.address = address;
        this.bioMetricYear =bioMetricYear;
    }
    
     public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public int getBioMetricYear() {
        return bioMetricYear;
    }

    public void setBioMetricYear(int bioMetricYear) {
        this.bioMetricYear = bioMetricYear;
    }

   
    /**
     * 
     */
    void identify()
    {
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("This is an aadhar card with a number: "+getCardNumber());
        System.out.println("Name : "+getName());
        System.out.println("Address : "+getAddress());
        if(bioMetricYear <=5){
            System.out.println("BioMetrics are updated " +bioMetricYear+" year ago and valid for Identification");
        }
        else{
            System.out.println("BioMetric was updated "+bioMetricYear+ "years ago, Please update the same for unique Identification.");
        }
}

}
    

