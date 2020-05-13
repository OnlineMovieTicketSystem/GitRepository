package com.mtbs.service;

import java.util.List;
import com.mtbs.model.Screen;

public interface ScreenService {
	
 public Screen addScreen(Screen screen);
 public void deleteScreen(int id);
 public Screen updateScreen(Screen screen);
 public Screen getScreen(int id);
 public List<Screen> getAllScreen();
}
