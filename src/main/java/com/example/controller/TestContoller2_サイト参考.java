package com.example.controller;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("2")
public class TestContoller2_サイト参考 {

	@RequestMapping("2")
	public String toStart(Model model) {
		
		//try-catch文が必要
        try {

            //Document A = Jsoup.connect("url").get(); urlにスクレイピング対象
            Document doc = Jsoup.connect("https://employment.en-japan.com/search/search_list/?occupation_back=400000&caroute=0701&occupation=401000_401500_402000_402500_403000_403500_404000_404500_405000_405500_409000&keywordtext=Java").get();

            //Elements B = A.select("タグ"); この形でソースに含まれるタグで指定された範囲を書き出す。
            			   
            Elements elm = doc.select(".company");

            //拡張for文
            for(Element elms : elm) {
                String title = elms.text();
                System.out.println(title);//結果　Yahoo!JAPAN
            }

            //例外処理
        }catch(IOException e) {
            e.printStackTrace();
        }	
        return "start";
    }

}
