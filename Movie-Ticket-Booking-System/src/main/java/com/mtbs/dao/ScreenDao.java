package com.mtbs.dao;

import java.util.List;
import com.mtbs.model.Screen;

public interface ScreenDao {
	
	public Screen addScreen(Screen screen);
	public void deleteScreen(int id);
	public void updateScreen(Screen s);
	public Screen viewScreenById(int id);
	public List<Screen> viewScreens();

}
