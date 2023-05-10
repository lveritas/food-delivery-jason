package fooddeliveryjason.domain;

import fooddeliveryjason.domain.*;
import fooddeliveryjason.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String foodId;
    private String option;
    private String address;
    private String customerId;
    private String storeId;
    private String status;

    public OrderPlaced(Order aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}
