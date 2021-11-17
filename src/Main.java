public class Main {

    public static void main(String[] args) {

        Phone phone[]=new Phone[3];
        phone[0]=new Phone(1,"Samsung","Japan","001","5555","2");
        phone[1]=new Phone(2,"Apple","USA","002","4444","1");
        phone[2]=new Phone(3,"Huawei","Japan","003","3333","3");

        for (int i = 0; i <phone.length ; i++) {
            System.out.println(phone[i].toString());
        }

    }
}