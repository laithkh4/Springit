package laith.first.springit.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter
@ToString
public class Vote {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private int vote;



}