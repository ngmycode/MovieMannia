
package com.moviemannia.action;

import java.util.List;

import com.moviemannia.model.Theater;
import com.moviemannia.model.Screen;
import com.moviemannia.model.User;
import com.moviemannia.service.TheaterService;
import com.moviemannia.service.ScreenService;
import com.moviemannia.service.UserService;
import com.moviemannia.service.impl.TheaterServiceImpl;
import com.moviemannia.service.impl.ScreenServiceImpl;
import com.moviemannia.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ScreenAction extends ActionSupport implements ModelDriven<Screen> {

	private static final long serialVersionUID = -2025967890517108542L;
	private Screen screen;//
	
	public String addScreen() throws Exception {
		ScreenService service = new ScreenServiceImpl();
		System.out.println(screen.getTheater());
		service.add(screen);
		List<Screen> screens = service.findAll();
		screen.setScreenList(screens);
		TheaterService theaterService = new TheaterServiceImpl();
		List<Theater> theaterList = theaterService.findAll();
		screen.setTheaterList(theaterList);
		return "SUCCESS";
	}

	public String manageScreen() throws Exception {
		ScreenService service = new ScreenServiceImpl();
		List<Screen> screens = service.findAll();
		screen.setScreenList(screens);
		TheaterService theaterService = new TheaterServiceImpl();
		List<Theater> theaterList = theaterService.findAll();
		screen.setTheaterList(theaterList);
		return "SUCCESS";
		}

	public String deleteScreen() throws Exception {

		ScreenService service = new ScreenServiceImpl();
		service.delete(screen.getId());
		List<Screen> screens = service.findAll();
		screen.setScreenList(screens);
		return "SUCCESS";
	}
	
	public String searchScreen() throws Exception {
		ScreenService service = new ScreenServiceImpl();
		List<Screen> screens = service.searchScreen(screen.getTheater());
		screen.setScreenList(screens);
		TheaterService theaterService = new TheaterServiceImpl();
		List<Theater> theaterList = theaterService.findAll();
		screen.setTheaterList(theaterList);
		return "SUCCESS";
		}


	@Override
	public Screen getModel() {
		screen = new Screen();
		return screen;
	}
}
