package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String userid;
    private String productname;
    private String addr;
    private String productid;
    private String qty;
    private String status;

    public OrderPlaced(Order aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}
//>>> DDD / Domain Event