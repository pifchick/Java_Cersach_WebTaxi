package com.taxifinal.proectTaxi.controller;

import com.taxifinal.proectTaxi.models.Post;
import com.taxifinal.proectTaxi.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BlogController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/feedback")
    public String feedback( Model model) {
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "feedback";
    }
    @GetMapping("/feedback/add")
    public String feedbackAdd( Model model) {
        return "blog-add";
    }

    @PostMapping("/blog-add")
    public String feedbackPostAdd(@RequestParam String title, @RequestParam String full_text, Model model){
        Post post= new Post(title, full_text);
        postRepository.save(post);
        return "redirect:/blog-add";
    }
}
