package com.adobe.aem.mysite.site.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables=Resource.class,defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class DigiquadAllModels {
	
	@ValueMapValue
	private String cardtitle1;
	
	
	@ValueMapValue
	private String cardtitle2;
	
	@ValueMapValue
	private String cardtitle3;
	
	@ValueMapValue
	private String carddescription1;
	
	@ValueMapValue
	private String carddescription2;
	
	@ValueMapValue
	private String carddescription3;
	
	@ValueMapValue
	private String description;
	
	@ValueMapValue
	private String description1;
	
	@ValueMapValue
	private String description2;
	
	@ValueMapValue
	private String email;	
	

	@ValueMapValue
	private String fileReference;
	
	@ValueMapValue
	private String fileReference1;
	
	@ValueMapValue
	private String fileReference2;
	
	@ValueMapValue
	private String fileReferencecard1;
	

	@ValueMapValue
	private String fileReferencecard2;

	@ValueMapValue
	private String fileReferencecard3;
	
	@ValueMapValue
	private String linkURL;
	
	
	@ValueMapValue
	private String nav1;

	@ValueMapValue
	private String nav2;

	@ValueMapValue
	private String nav3;

	@ValueMapValue
	private String nav4;

	@ValueMapValue
	private String nav5;

	@ValueMapValue
	private String nav6;
	
	@ValueMapValue
	private String pagePath;
	
	@ValueMapValue
	private String pagePath1;
	
	@ValueMapValue
	private String pagePath2;
	
	@ValueMapValue
	private String pagePath3;
	
	@ValueMapValue
	private String title;
	

	@ValueMapValue
	private String title1;
	
	
	@ValueMapValue
	private String title2;
	
	@ValueMapValue
	private String text;
	
	@ValueMapValue
	private String text1;
	
	
	

}
