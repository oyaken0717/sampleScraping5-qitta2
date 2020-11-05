package com.example.controller;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/1-2")
public class TestContoller1_2 {

	@RequestMapping("/1-2")
	public String toStart(Model model) {
		
	    try {//try-catch文が必要
	    		    	
	    	String url = "https://employment.en-japan.com/search/search_list/?occupation_back=400000&caroute=0701&occupation=401000_401500_402000_402500_403000_403500_404000_404500_405000_405500_409000&keywordtext=Java";//■ 1.HTML全体を取得
	        Document documents = Jsoup.connect(url).get();
	        Elements elements = documents.select("*");
	        
	        model.addAttribute("elements",elements);
	        
	    }catch(IOException e) {//例外処理
	        e.printStackTrace();
	    }
		
		return "start2";
	}
}
