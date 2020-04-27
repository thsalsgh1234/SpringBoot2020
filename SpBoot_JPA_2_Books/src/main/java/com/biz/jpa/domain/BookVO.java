package com.biz.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name="tbl_books",schema = "spBook")
public class BookVO {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
   private String title;
   private String comp;
   private String auth;
   private String year;
   private int price;
}