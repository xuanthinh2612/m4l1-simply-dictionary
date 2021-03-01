package controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/search")
public class DictionaryController {
    public static Map<String,String> wordList = new HashMap<>();
    static {
        wordList.put("hello","xin chao");
        wordList.put("hi","xin chao");
        wordList.put("name","ten");
        wordList.put("age","tuoi");
        wordList.put("identity","danh tinh");
    }

    @GetMapping("")
    public ModelAndView translate(@RequestParam String word){
      ModelAndView modelAndView = new ModelAndView("translate");
      String meaning = (String) wordList.get(word);
      modelAndView.addObject("meaning",meaning);
      return modelAndView;

    }


}
