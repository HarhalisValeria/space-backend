package dev.kharkhalisvaleria.spacebackend;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "objects")
@Data //lombok getters and setters
@AllArgsConstructor //lombok constructor takes all the params
@NoArgsConstructor //lombok constructor takes no params
public class Movie {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private List<String> genres;
    private String poster;
    private List<String> backdrops;
    @DocumentReference  //cause db to store only the ids and the actual reviews
    private List<Review> reviewIds;
}
