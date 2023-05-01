public class Product {

        int pid;
        String pname;
        int qat;
        int price;
        public int getPid() {
            return pid;
        }

        public void setPid(int pid) {
            this.pid = pid;
        }

        public String getPname() {
            return pname;
        }

        public void setPname(String pname) {
            this.pname = pname;
        }

        public int getQat() {
            return qat;
        }

        public void setQat(int qat) {
            this.qat = qat;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public Product(int pid, String pname, int qat, int price) {
            this.pid = pid;
            this.pname = pname;
            this.qat = qat;
            this.price = price;
        }
    }


