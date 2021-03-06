package laith.first.springit.domain;

import lombok.*;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter
@ToString
public class Link extends  Auditable{
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String title;
    @NonNull
    private String url;
    // comments
    @OneToMany(mappedBy = "link")
    private List<Comment> comments=new ArrayList<>();
  /*  public Link(@NonNull String title, @NonNull String url) {
        this.title = title;
        this.url = url;
    }*/
    public void addComment(Comment comment){
        comments.add(comment);
    }
}
