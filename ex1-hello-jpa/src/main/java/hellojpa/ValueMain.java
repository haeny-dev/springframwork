package hellojpa;

import hellojpa.domain.Address;

public class ValueMain {
    public static void main(String[] args) {

        int a = 10;
        int b = 10;

        System.out.println("(a == b) = " + (a == b));

        Address address1 = new Address("seoul", "street", "zipcode");
        Address address2 = new Address("seoul", "street", "zipcode");

        System.out.println("(address1 == address2) = " + (address1.equals(address2)));
    }
}
