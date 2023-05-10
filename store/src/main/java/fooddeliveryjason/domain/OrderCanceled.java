package fooddeliveryjason.domain;

import fooddeliveryjason.domain.*;
import fooddeliveryjason.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private String foodId;
    private Object options;
    private String address;
    private String customerId;
    private String storeId;
    private String status;
}
