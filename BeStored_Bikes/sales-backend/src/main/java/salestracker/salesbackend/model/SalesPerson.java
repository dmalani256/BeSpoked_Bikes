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
@Table(name = "SalesPerson")
public class SalesPerson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int salesPersonId;

    @Column(name = "first_name")
    public String first_name;

    @Column(name = "last_name")
    public String last_name;

    @Column(name = "address")
    public String address;

    @Column(name = "phone_number")
    public String phone_number;

    @Column(name = "start_date")
    public Date start_date;

    @Column(name = "termination_date")
    public Date termination_date;

    @Column(name = "manager")
    public String manager;
}
