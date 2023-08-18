package japbook.jpastudy1.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue
    @Column (name = "member_id")
    private Long id;

    private String name;

    @Embedded
    private Address address;

    @OneToMany
    @JoinColumn(name = "member_id")
    private List<Order> orders = new ArrayList<>();

}
