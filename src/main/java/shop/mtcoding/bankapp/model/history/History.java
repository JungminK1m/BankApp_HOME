package shop.mtcoding.bankapp.model.history;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

public class History {

    @Getter
    @Setter
    private Integer id;
    private Long amount;
    private Long wBalance;
    private Long dBalance;
    private Long wAccountLongid;
    private Long dAccountId;
    private Timestamp createdAt;
}
