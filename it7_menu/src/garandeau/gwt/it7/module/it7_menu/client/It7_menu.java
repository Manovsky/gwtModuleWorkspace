package garandeau.gwt.it7.module.it7_menu.client;

import com.garandeau.components.client.GdDefaultLinkButton;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.RootPanel;

import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.constants.SideNavType;
import gwt.material.design.client.constants.TextAlign;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialNavBar;
import gwt.material.design.client.ui.MaterialNavBrand;
import gwt.material.design.client.ui.MaterialNavSection;
import gwt.material.design.client.ui.MaterialSideNav;
import gwt.material.design.client.ui.MaterialToast;
import gwt.material.design.client.ui.MaterialTooltip;

public class It7_menu implements EntryPoint {

	public void onModuleLoad() {
		
		MaterialSideNav sideNav = new MaterialSideNav();
		MaterialNavBar primaryNavBar = new MaterialNavBar();
		
//		RootPanel.get("divMenu").add(sideNav);
//		RootPanel.get("divMenu").add(primaryNavBar);
		
		sideNav.setId("sideNav");
		sideNav.setWidth(300);
		sideNav.setType(SideNavType.FIXED);
		sideNav.setCloseOnClick(false);
		
		MaterialNavBrand navTitle = new MaterialNavBrand();
		navTitle.setHref("#Test");
		navTitle.setTitle("Garandeau Router");
		navTitle.setText("My Title !");
		
		GdDefaultLinkButton app1Btn = new GdDefaultLinkButton("App1", IconType.FILTER_1);
		GdDefaultLinkButton app2Btn = new GdDefaultLinkButton("App2", IconType.FILTER_2);
		GdDefaultLinkButton app3Btn = new GdDefaultLinkButton("App3", IconType.FILTER_3);
		
		sideNav.add(navTitle);
		sideNav.add(app1Btn);
		sideNav.add(app2Btn);
		sideNav.add(app3Btn);
		
		// Listen for mouse events on the buttons.
		app1Btn.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				MaterialToast.fireToast("You clicked on btnApp1 Button !");
			}
		});
		
		app2Btn.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				MaterialToast.fireToast("You clicked on btnApp2 Button !");
			}
		});
		
		app3Btn.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				MaterialToast.fireToast("You clicked on btnApp3 Button !");
			}
		});

		
		
//		MaterialNavBar primaryNavBar = new MaterialNavBar();
		primaryNavBar.setActivates("sideNav");
		primaryNavBar.setBackgroundColor("blue");
		
		MaterialNavSection navSelection = new MaterialNavSection();
		navSelection.setTextAlign(TextAlign.RIGHT);
		
		MaterialTooltip toolTip1 = new MaterialTooltip();
		
		MaterialLink linkBtn1 = new MaterialLink();
		linkBtn1.setIconType(IconType.WHATSHOT);
		linkBtn1.setTextColor("white");
		
		toolTip1.add(linkBtn1);
		toolTip1.setText("Starter");
		navSelection.add(toolTip1);
		
		primaryNavBar.add(navSelection);
		
//		RootPanel.get("divMenu").add(sideNav);
//		RootPanel.get("divMenu").add(primaryNavBar);
		
		
//		GdSideBar mySideBarUIBinder = new GdSideBar();
//		RootPanel.get("divMenu").add(mySideBarUIBinder);
		
		GdSideBar mySideBarUIBinder = new GdSideBar();
		RootPanel.get("divMenu").add(mySideBarUIBinder);
	}
}
