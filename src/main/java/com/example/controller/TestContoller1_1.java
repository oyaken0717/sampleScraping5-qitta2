package com.example.controller;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class TestContoller1_1 {

	@RequestMapping("")
	public String toStart(Model model) {
		
	    try {//try-catch文が必要
	    		    	
	    	String url = "https://employment.en-japan.com/search/search_list/?occupation_back=400000&caroute=0701&occupation=401000_401500_402000_402500_403000_403500_404000_404500_405000_405500_409000&keywordtext=Java";//■ 1.HTML全体を取得
	        Document documents = Jsoup.connect(url).get();
	        
	        model.addAttribute("documents",documents);
	        
	    }catch(IOException e) {//例外処理
	        e.printStackTrace();
	    }
		
		return "start1";
	}
}
