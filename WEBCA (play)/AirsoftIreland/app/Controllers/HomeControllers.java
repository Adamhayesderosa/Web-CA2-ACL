package controller;
import play.mvc.*;
import views.html.*;

public class HomeController extends Controllere{

	public Result about(){
		return ok(about.render());
	}

	public Result airsoftBrands(){
		return ok(airsoftBrands.render());
	}

	public Result beginnerTip(){
		return ok(beginnerTip.render());
	}

	public Result contact(){
		return ok(contact.render());
	}

	public Result faq(){
		return ok(faq.render());
	}

	public Result index(){
		return ok(index.rend());
	}

	public Result indoorsVsOutdoors(){
		return ok(indoorsVsOutdoors.render());
	}

	public Result IrishRetailers(){
		return ok(IrishRetailers.render());
	}

	public Result legal(){
		return ok(legal.render());
	}

	public Result safetyInfo(){
		return ok(safetyInfo.render());
	}


	public Result whereToPlay(){
		return ok(whereToPlay.render());
	}





	public Result show(String page) {
	    String content = Page.getContentOf(page);
	    response().setContentType("text/html");
	    return ok(content);
	}
}


