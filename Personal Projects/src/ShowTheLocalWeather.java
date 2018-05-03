//
//public class ShowTheLocalWeather {
//
//	public static void main(String[] args) {
//	
//		int lon = position.coords.longitude;
//		int lat = position.coords.latitude; 
//		int api; 
//		int fTemp;
//		int cTemp;
//		
		  
//		if (navigator.geolocation) {
//			function setApi(position){
//		    lon = position.coords.longitude;
//		    lat = position.coords.latitude;   
//		    api = 'https://fcc-weather-api.glitch.me/api/current?lat='+lat +'&lon='+lon +'&APPID=AIzaSyDaOtOQDxV7J9oWGw4j5P4y8iCT6jwD354';  
//		    $("#data").html("Latitude: " + lat + "<br>Longitude: " + lon);
//		    console.log( "ready!"  );
//		    console.log (lat); 
//		    console.log (api);
//		    console.log( "ready! 123" );
//		    
//		    $.getJSON(api, function(weather) {   
//		    var temp = weather.main.temp;
//		    var tem2 = weather.main.humidity;
//		    console.log ("api");  
//		    console.log (api); 
//		    console.log (temp);
//		    console.log (tem2);
//		     // var temp = weather.main.temp;
//		    var description = weather.weather[0].description;
//		    var place = weather.name;
//		    console.log (description);
//		    var centigrade= weather.main.temp;
//		    console.log("centigrade"); 
//		    console.log(centigrade); 
//		    var windSpeed= weather.wind.speed;
//		    console.log (windSpeed);
//		    var city = weather.name;
//		    console.log("city");
//		    console.log(city);  
//		      
//		      // temperature in centigrade 
//		    // cTemp=kTemp-273;
//		    // fTemp=(kTemp)*(9/5)-45967;
//		    fTemp=(centigrade)*(9/5)+32;
//		    console.log("fTemp");
//		    console.log(fTemp); 
//		  $("#weather").html("City:  " + city + "<br>Temp: " + fTemp);
//		     
//		      //User Story 6: I can push a button to toggle between Fahrenheit and Celsius
//		      $("#fTemp").click(function(){
//		       if(tempSwap=false){
//		         $("#fTemp").html(cTemp);
//		         tempSwap=true;
//		       }
//		       else
//		         {
//		           $("#fTemp").html(fTemp);
//		           tempSwap=false;
//		         }
//		     }); 
//		      
//		     var icon = weather.weather[0].icon;
//		 console.log (icon);
//		  $("#icon").prepend('<img src=' + icon + '>' );
//		 //  $("#icon").html("icon: " + weather.weather[0].icon);
//		   // console.log(weather.weather[0].icon); 
//		      
//		       $("#weatherW").html("windSpeed:  " + windSpeed );
//		     $("#description").html("Condition: " + description);
//		      console.log(kelvin);
//		      
//		  
//		                
//		  });
//		       console.log(weatherType);
//		    	}
//			navigator.geolocation.getCurrentPosition(setApi);
//		 }    
////
//	}
//
//}
