package com.example.controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/1-1")
public class TestContoller1_1 {

	@RequestMapping("/1-1")
	public String toStart(Model model) {
        
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        String format1 = localDateTime.format(formatter);
        System.out.println(format1);
		
	    try {//try-catch文が必要
	    		    	
//	    	String url = "https://employment.en-japan.com/search/search_list/?occupation_back=400000&caroute=0701&occupation=401000_401500_402000_402500_403000_403500_404000_404500_405000_405500_409000&keywordtext=Java";//■ 1.HTML全体を取得
	    	String url = "https://damp-cliffs-03444.herokuapp.com/5";//■ 1.HTML全体を取得
	        Document documents = Jsoup.connect(url).get();
	        
	        model.addAttribute("documents",documents);
	        
	    }catch(IOException e) {//例外処理
	        e.printStackTrace();
	    }
		
		return "start1";
	}
	
	@RequestMapping("/finish")
	public String finish() {
		return "finish";
	}

}
