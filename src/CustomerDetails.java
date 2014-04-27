public class CustomerDetails {
        
        private String fName;
        private String fStreet;
        private String fZipCode;
        private String fTown;
        private String fCountry;
        
        
        public CustomerDetails(String fName, String fStreet, String fZipCode,
                        String fTown, String fCountry) {
                super();
                this.fName = fName;
                this.fStreet = fStreet;
                this.fZipCode = fZipCode;
                this.fTown = fTown;
                this.fCountry = fCountry;
        }



        
        
        public String getfName() {
                return fName;
        }

        public void setfName(String fName) {
                this.fName = fName;
        }

        public String getfStreet() {
                return fStreet;
        }

        public void setfStreet(String fStreet) {
                this.fStreet = fStreet;
        }

        public String getfZipCode() {
                return fZipCode;
        }

        public void setfZipCode(String fZipCode) {
                this.fZipCode = fZipCode;
        }

        public String getfTown() {
                return fTown;
        }

        public void setfTown(String fTown) {
                this.fTown = fTown;
        }

        public String getfCountry() {
                return fCountry;
        }

        public void setfCountry(String fCountry) {
                this.fCountry = fCountry;
        }

            
        
        
        

}
