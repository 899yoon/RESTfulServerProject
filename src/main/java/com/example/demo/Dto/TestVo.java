package com.example.demo.Dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
 
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Accessors(chain = true)
 public class TestVo {
     private Integer seq;
     private String title;
     private String contents;
     private String author;
     private String password;
     private Integer reads = 0;
     private String deleted = "N";  
      
 }
 
