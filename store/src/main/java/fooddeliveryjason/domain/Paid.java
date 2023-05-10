package fooddeliveryjason.domain;

import fooddeliveryjason.domain.*;
import fooddeliveryjason.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Paid extends AbstractEvent {

    private Long id;
    private String orderId;
    private String status;
    private String foodId;
    private String address;
}
