package p9yp9y.vaos.hello;

import de.steinwedel.messagebox.MessageBox;
import p9yp9y.vaos.VaosApplication;

public class HelloApplication implements VaosApplication {
    @Override
	public void main(String[] args) {
		System.out.println("Hello!");
		MessageBox.createInfo().withCaption("Info").withMessage("Hello bello!").withOkButton().open();
	}
	
    @Override	
	public String getName() {
	    return "Hello!";
	}
}
