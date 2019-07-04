package zad.queqe.apteka;

import java.util.Comparator;

public class CopmaratorCustomer  implements Comparator<Customer> {
    public int compare(Customer o1, Customer o2) {
        if (!o1.isWCiązy() && (o2.isWCiązy())) {
            return 1;
        }
        if (o1.isWCiązy() && (!o2.isWCiązy())) {
            return -1;
        }
        if ((o1.getWiek() > 60) && (o2.getWiek() < 60)) {
            return -1;
        }
        if ((o1.getWiek() < 60) && (o2.getWiek() > 60)){
            return 1;
        }
        return 0;
    }
}
