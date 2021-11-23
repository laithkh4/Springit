package laith.first.springit.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter
@ToString

public class Comment extends  Auditable{
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String body;
    //Link
    @ManyToOne
    @NonNull
    private Link link;

  /*  public Comment(@NonNull String body, Link link) {
        this.body = body;
        this.link = link;
    }*/
}
