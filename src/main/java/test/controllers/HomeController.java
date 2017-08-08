package test.controllers;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.RequestMapping;
        import test.models.Post;
        import test.models.RoamingAllSubscribers;
        import test.services.PostService;
        import test.services.RoamingAllSubsribersService;

        import java.util.List;
        import java.util.stream.Collectors;

@Controller
public class HomeController {
    @Autowired
    private PostService postService;

//    @Autowired
//    private RoamingAllSubsribersService roamingAllSubsribersService;

    @RequestMapping("/")
    public String index(Model model) {

        List<Post> latest5Posts = postService.findLatest5();
//        List<RoamingAllSubscribers> latest1String = roamingAllSubsribersService.findLatest1();

        model.addAttribute("latest5posts", latest5Posts);
        List<Post> latestControlPosts = latest5Posts.stream()
                .limit(14).collect(Collectors.toList());
        model.addAttribute("latestControlPosts", latestControlPosts);

//        model.addAttribute("latest1String", latest1String);
//        List<RoamingAllSubscribers>latestControlRoamingAllSubscribers=latest1String.stream()
//                .limit(1).collect(Collectors.toList());
//        model.addAttribute("latestControlRoamingAllSubscribers", latestControlRoamingAllSubscribers);

        return "index";
    }



}