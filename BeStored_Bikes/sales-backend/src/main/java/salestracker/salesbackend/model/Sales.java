package salestracker.salesbackend.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Sales")
public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long salesId;

    @Column(name = "product")
    public String product;

    @Column(name = "salesperson")
    public String salesperson;

    @Column(name = "customer")
    public String customer;

    @Column(name = "sales_date")
    public Date sales_date;

}
