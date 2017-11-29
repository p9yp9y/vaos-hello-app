package p9yp9y.vaos.hello;

import com.vaadin.server.Resource;

import de.steinwedel.messagebox.MessageBox;
import p9yp9y.vaos.VaosApplication;
import p9yp9y.vaos.VaosMainApplication;

@VaosMainApplication
public class HelloApplication implements VaosApplication {
    @Override
	public void main(String[] args) {
		System.out.println("Hello!");
		MessageBox.createInfo().withCaption("Info").withMessage("Hello!").withOkButton().open();
	}
	
    @Override	
	public String getApplicationName() {
	    return "Hello!";
	}

	@Override
	public Resource getApplicationIcon() {
		// TODO Auto-generated method stub
		return null;
	}
}
