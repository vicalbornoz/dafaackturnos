package com.example.myapplication;

import java.io.Serializable;
import java.text.SimpleDateFormat;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.external.org.slf4j.Logger;
import com.vaadin.external.org.slf4j.LoggerFactory;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Label;
import com.vaadin.ui.NativeButton;
import com.vaadin.ui.Notification;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")

public class MyUI extends CustomComponent implements Serializable {
	
	private static final long serialVersionUID = 3886260533645303678L;
	private static final Logger log = LoggerFactory.getLogger(MyUI.class);

	ContextMenu menu;
	Label lblUsuario;
	ContextMenu menuTerminal;
	AnimatorProxy proxy;
	
	Button pictureButton;
	ZFormWindow winAviso;
	ZFormWindow winAvisoVencEjercicio;
	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	private AbsoluteLayout mainLayout;
	private VerticalLayout mainWraplLayout;
	private AbsoluteLayout centerLayout;
	private HorizontalSplitPanel centerSplitPanel;
	private ZTabSheetConBotones tabPanelCentral;
	private VerticalLayout menuLayout;
	private AbsoluteLayout topBarLayout;
	private HorizontalLayout layoutComprobantes;
	private AbsoluteLayout layoutUsuario;
	String uploadFolderAvatars;
	
	Button btnCuenta;
	Window winCambiarPass;

	private AbsoluteLayout layoutEmpresa;

	Label lblCaja;

	ComboBox cmbTerminales;
	ComboBox cmbTipoUsuario;
	ComboBox cmbPerfil;
	
	TextField txtEmailAlternativo1;
	TextField txtEmailAlternativoConf;
	Label lblNombCaja;
	TextField txtNombre;

	PasswordField passContrasenaAnti;
	PasswordField passContraNuevaConf;
	PasswordField passContraNueva;
	TextField txtContrasenaAnti;
	TextField txtContraNuevaConf;
	TextField txtContraNueva;

	Label lblEmpresa;
	Label lblSucursal;
	private Window sessionBloqueada;
	RefreshListener listener;
	final Button btnCambioTerminal = new NativeButton();
	private HorizontalLayout hltGral;
	private Label lblCantidadVTA;
	private Label lblCantidadVTAConfig;
	private Label lblCantidadCOM;
	private Label lblCantidadCOMConfig;
	private NativeButton btnVerPlanes;
    protected void init(VaadinRequest vaadinRequest) {
        Button button = new Button("TOCA");
        button.addClickListener(e -> Notification.show("HOLA RAN!"));
        setContent(button);
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
//    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
