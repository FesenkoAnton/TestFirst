package test.controllers;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.RequestMapping;
        import test.models.*;
        import test.services.*;

        import java.util.List;
        import java.util.stream.Collectors;

@Controller
public class HomeController {
    @Autowired
    private PostService postService;

    @Autowired
    private RoamingAllSubsribersService roamingAllSubsribersService;

    @Autowired
    private RoamingCountriesService roamingCountriesService;

    @Autowired
    private RoamingOperatorsService roamingOperatorsService;

    @Autowired
    private Top5OperatorsInAtoService top5OperatorsInAtoService;

    @Autowired
    private MscNsnService mscNsnService;

    @Autowired
    private MscHuaweiService mscHuaweiService;

    @RequestMapping("/")
    public String index(Model model) {

        List<Post> latest5Posts = postService.findLatest5();
        List<RoamingAllSubscribers> latest1String = roamingAllSubsribersService.findLatest1();
        List<RoamingCountries> latest11String = roamingCountriesService.findLatest11();
        List<RoamingOperators> latest14String = roamingOperatorsService.findLatest14();
        List<Top5OperatorsInAto> latest6String = top5OperatorsInAtoService.findLatest6();
        List<MscNsn> latest8String = mscNsnService.findLatest8();
        List<MscHuawei> latest4String = mscHuaweiService.findLatest4();


        model.addAttribute("latest5posts", latest5Posts);
        List<Post> latestControlPosts = latest5Posts.stream()
                .limit(14).collect(Collectors.toList());
        model.addAttribute("latestControlPosts", latestControlPosts);

        model.addAttribute("latest1String", latest1String);
        List<RoamingAllSubscribers>latestControlRoamingAllSubscribers=latest1String.stream()
                .limit(1).collect(Collectors.toList());
        model.addAttribute("latestControlRoamingAllSubscribers", latestControlRoamingAllSubscribers);

        model.addAttribute("latest11String", latest11String);
        List<RoamingCountries>latestControlRoamingCountries=latest11String.stream()
                .limit(12).collect(Collectors.toList());
        model.addAttribute("latestControlRoamingCountries", latestControlRoamingCountries);

        model.addAttribute("latest14String", latest14String);
        List<RoamingOperators>latestControlRoamingOperators=latest14String.stream()
                .limit(14).collect(Collectors.toList());
        model.addAttribute("latestControlRoamingOperators", latestControlRoamingOperators);

        model.addAttribute("latest6String", latest6String);
        List<Top5OperatorsInAto>latestControlTop5OperatorsInAto=latest6String.stream()
                .limit(6).collect(Collectors.toList());
        model.addAttribute("latestControlTop5OperatorsInAto", latestControlTop5OperatorsInAto);

        model.addAttribute("latest8String", latest8String);
        List<MscNsn>latestControlMscNsn=latest8String.stream()
                .limit(8).collect(Collectors.toList());
        model.addAttribute("latestControlMscNsn", latestControlMscNsn);

        model.addAttribute("latest4String", latest4String);
        List<MscHuawei>latestControlMscHuawei=latest4String.stream()
                .limit(4).collect(Collectors.toList());
        model.addAttribute("latestControlMscHuawei", latestControlMscHuawei);

        return "index";
    }



}