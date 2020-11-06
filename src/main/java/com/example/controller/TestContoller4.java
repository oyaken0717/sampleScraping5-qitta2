package com.example.controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Job;

@Controller
@RequestMapping("/1-4")
public class TestContoller4 {

	@RequestMapping("/1-4")
	public String toStart(Model model) {
		
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        String format1 = localDateTime.format(formatter);
        System.out.println(format1);
		
	    try {
	    		    	
//	    	String url = "https://employment.en-japan.com/search/search_list/?occupation_back=400000&caroute=0701&occupation=401000_401500_402000_402500_403000_403500_404000_404500_405000_405500_409000&keywordtext=Java";//■ 1.HTML全体を取得
	    	String url = "https://damp-cliffs-03444.herokuapp.com/5";//■ 1.HTML全体を取得
	        Document documents = Jsoup.connect(url).get();

	        Elements companyName = documents.select(".nameSet .companyName .company");
	        
	        Job job;
	    	List<Job> jobList = new ArrayList<>();
	    	
	        for (int i = 0; i < companyName.size(); i++) {
	        	job = new Job();

	        	job.setCompanyName(companyName.get(i).text());
	        		        		        	
	        	jobList.add(job);
	        }	        
	        
	        model.addAttribute("jobList",jobList);
	        
	    }catch(IOException e) {
	        e.printStackTrace();
	    }
		
		return "start4";
	}
	
	@RequestMapping("/finish")
	public String finish() {
		return "finish";
	}

}
