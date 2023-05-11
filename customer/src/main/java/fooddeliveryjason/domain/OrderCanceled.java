package fooddeliveryjason.domain;

import fooddeliveryjason.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private String foodId;
    private String option;
    private String address;
    private String customerId;
    private String storeId;
    private String status;
}
