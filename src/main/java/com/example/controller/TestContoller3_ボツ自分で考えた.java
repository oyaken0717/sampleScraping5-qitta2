package com.example.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Company;

@Controller
@RequestMapping("3")
public class TestContoller3_ボツ自分で考えた {

	@RequestMapping("3")
	public String toStart(Model model) {
		
		//try-catch文が必要
	    try {
//■ 1.HTML全体を取得	    	
	    	String url = "https://paiza.jp/career/job_offers/dev_language/Java"; //Document A = Jsoup.connect("url").get(); urlにスクレイピング対象
	        Document doc = Jsoup.connect(url).get();
	        
//■ 2.全社名を取得
	        Elements elmsCompanyName = doc.select("h4 a"); //■select("タグ") HTMLのテキストを取得する。 attr("タグ") 属性の値を取得する。//■ Elements B = A.select("タグ"); この形でソースに含まれるタグで指定された範囲を書き出す。Elements:HTMLの要素を表すクラス
//■ 3.全給与を取得	        
	        Elements elmsSalary = doc.select("table tbody tr td strong");
//■ 4.取得した情報をオブジェクトに詰める。 > リストに格納する。 	        
	    	List<Company> CompanyList = new ArrayList<>();
	    	Company company;
	    	String companyName;
	    	String salary;
	    	
	        for (int i = 0; i < elmsCompanyName.size(); i++) {
	        	company = new Company();

	        	companyName = elmsCompanyName.get(i).text();
	        	company.setCompanyName(companyName);
	        	
	        	salary = elmsSalary.get(i).text();
	        	company.setSalary(salary);
	        		        	
	        	CompanyList.add(company);
	        }	        
	    //例外処理
	    }catch(IOException e) {
	        e.printStackTrace();
	    }
	    
	    

		
		return "start";
	}

	@RequestMapping("/finish")
	public String finish() {
		return "finish";
	}
}
