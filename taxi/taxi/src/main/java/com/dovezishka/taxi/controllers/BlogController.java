package com.dovezishka.taxi.controllers;


import com.dovezishka.taxi.models.Post;
import com.dovezishka.taxi.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BlogController {

    @Autowired
    private PostRepository PostRepository;

    @GetMapping("/reviews")
    public String blogMain(Model model){
        Iterable<Post> posts= PostRepository.findAll();
        model.addAttribute("posts", posts);
        return "reviews";
    }
    @GetMapping("/addreview")
    public String addReviewn(Model model){
        return "addreview";
    }
    @PostMapping("/addreview")
    public String addPostaddreview(@RequestParam String title,@RequestParam String author,@RequestParam String full_text, Model model){
        Post post = new Post(title, author, full_text);
        PostRepository.save(post);
        return "redirect:/reviews";
    }
}
