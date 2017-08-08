//package test.services;
//
//
//
//import org.springframework.stereotype.Service;
//import test.models.Post;
////import test.models.User;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//@Service
//public class PostServiceStubImpl implements PostService {
//    private List<Post> posts = new ArrayList<Post>();
//
//    @Override
//    public List<Post> findLatest5() {
//        return this.posts.stream()
//                .sorted((a, b) -> b.getDate().compareTo(a.getDate()))
//                .limit(3)
//                .collect(Collectors.toList());
//    }
//
////    @Override
////    public List<Post> findAll() {
////        return this.posts;
////    }
//
//
//
////    @Override
////    public Post findById(Long id) {
////        return this.posts.stream()
////                .filter(p -> Objects.equals(p.getId(), id))
////                .findFirst()
////                .orElse(null);
////    }
//
//}