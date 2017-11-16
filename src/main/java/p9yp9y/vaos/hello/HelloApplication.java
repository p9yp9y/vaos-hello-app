package p9yp9y.vaos.hello;

import de.steinwedel.messagebox.MessageBox;
import p9yp9y.vaos.VaosApplication;

public class HelloApplication extends VaosApplication {

	@Override
	public void main(String[] args) {
		System.out.println("Hello!");

		MessageBox.createInfo().withCaption("Info").withMessage("Hello!").withOkButton().open();
	}

}
