package com.kutsal.instagram.controller;
 
import java.util.ArrayList;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.kutsal.instagram.integration.rest.model.Caption;
import com.kutsal.instagram.integration.rest.model.Datum;
import com.kutsal.instagram.integration.rest.model.Images;
import com.kutsal.instagram.integration.rest.model.LikeResponse;
import com.kutsal.instagram.integration.rest.model.Location;
import com.kutsal.instagram.integration.rest.model.Thumbnail;
import com.kutsal.instagram.service.LikedRestService;

@ViewScoped
@ManagedBean(name = "likedView")
public class LikedView {
	  
  	@EJB
  	private LikedRestService likedRestService;
 
  	
  	public LikeResponse getMockData() {
  		LikeResponse response = new LikeResponse();
  		response.setData(new ArrayList<Datum>());

  		Datum data = new Datum();
  		data.setCaption(new Caption("happy days!"));
  		data.setImages(new Images());
  		data.getImages().setThumbnail(new Thumbnail());
  		data.getImages().getThumbnail().setUrl("https://scontent.cdninstagram.com/t51.2885-15/s150x150/e35/25009986_175757006355182_9156787231879331840_n.jpg");
  		data.setLocation(new Location());
  		data.getLocation().setName("Bura nere!");
  		response.getData().add(data);
  		
  		data = new Datum();
  		data.setCaption(new Caption("happy new days!"));
  		data.setImages(new Images());
  		data.getImages().setThumbnail(new Thumbnail());
  		data.getImages().getThumbnail().setUrl("https://scontent.cdninstagram.com/t51.2885-15/s150x150/e35/23734866_1733687550271459_6882705896661581824_n.jpg");
  		data.setLocation(new Location());
  		data.getLocation().setName("Bura ora!");
  		response.getData().add(data);
  		
  		return response;
  		
  		
  		
  		//return likedRestService.getLikeResponse("s1");
	}
  	
	
}
