package test.services;

        import test.models.Post;
        import java.util.List;

public interface PostService {
    List<Post> findLatest5();

}