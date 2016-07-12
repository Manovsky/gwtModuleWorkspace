package garandeau.gwt.it7.module.it7_menu.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialToast;

public class GdSideBar extends Composite implements HasText {

	private static GdSideBarUiBinder uiBinder = GWT.create(GdSideBarUiBinder.class);
	
	private static final String pageUrl = GWT.getHostPageBaseURL();

	interface GdSideBarUiBinder extends UiBinder<Widget, GdSideBar> {
	}

	public GdSideBar() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	/*
	 * Method name is not relevant, the binding is done according to the class
	 * of the parameter.
	 */
	@UiHandler("btnApp1")
	void doClickApp1(ClickEvent event) {
		MaterialToast.fireToast("You clicked on btnApp1 Button !");
		Window.Location.assign("/StockWatcher.html");
	}
	
	@UiHandler("btnApp1")
	void doHoverApp1(MouseOverEvent event) {
		MaterialToast.fireToast("You Hovered on btnApp1 Button !");
	}
	
	@UiHandler("btnApp2")
	void doClickApp2(ClickEvent event) {
		MaterialToast.fireToast("You clicked on btnApp2 Button !");
		Window.Location.assign("/StockWatcher2.html");
	}
	
	@UiHandler("btnApp3")
	void doClickApp3(ClickEvent event) {
		MaterialToast.fireToast("You clicked on btnApp3 Button !");
		Window.Location.assign("/GarandeauComponent.html");
	}
	
	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setText(String text) {
		// TODO Auto-generated method stub
		
	}

}
