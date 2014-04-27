public class Card {

        
        protected String fName;
        protected String fStreet;
        protected String fTown;
        protected String fzipCode;
        protected String fCountry;
        
        
        
        public Card(CustomerDetails cust_obj){
                this.fName = cust_obj.getfName();
                this.fStreet = cust_obj.getfStreet();
                this.fzipCode = cust_obj.getfZipCode();
                this.fTown = cust_obj.getfTown();
                this.fCountry = cust_obj.getfCountry();
                
                
        }
        
}
