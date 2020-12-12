package pageUIs.nopcommerce;

public class AbstractPageNopCommerceUI {
	// HomePage Logo
	public static final String HOMEPAGE_LOGO = "//div[@class = 'header-logo']//img";

	// Header Link
	public static final String DYNAMIC_HEADER_LINK = "//div[@class = 'header-links']//a[text() = '%s']";
	public static final String DYNAMIC_HEADER_OTHER_LINK = "//div[@class = 'header-links']//span[text() = '%s']";

	// Header Menu
	public static final String DYNAMIC_HEADER_MENU = "//div[@class = 'header-menu']//ul[@class = 'top-menu notmobile']//a[text() = '%s']";

	// Header Sub Menu
	public static final String DYNAMIC_HEADER_SUB_MENU = "//div[@class = 'header-menu']//ul[@class = 'top-menu notmobile']//a[text() = '%s']//following-sibling::ul//a[text() = '%s']";

	// Footer Menu
	public static final String DYNAMIC_FOOTER_MENU = "//div[@class = 'footer-upper']//ul[@class = 'list']//a[text() = '%s']";

	// Listbox
	public static final String DYNAMIC_LISTBOX_MENU = "//div[@class = 'listbox']//a[contains(.,'%s')]";

	// Radio button
	public static final String DYNAMIC_RADIO = "//input[@type = 'radio' and @id = '%s']";

	// Textbox
	public static final String DYNAMIC_TEXTBOX = "//input[@id = '%s']";

	// Textarea
	public static final String DYNAMIC_TEXTAREA = "//textarea[@class = '%s']";

	// Dropdown List
	public static final String DYNAMIC_DROPDOWN_LIST = "//select[@name = '%s']";

	// Selected Dropdown List
	public static final String DYNAMIC_SELECTED_DROPDOWN_LIST = "//select[@name = '%s']//option[text() = '%s']";

	// Button
	public static final String DYNAMIC_BUTTON = "//div[@class = '%s']//input[@value = '%s']";

	// Checkbox
	public static final String DYNAMIC_CHECKBOX = "//input[@type = 'checkbox' and @id = '%s']";

	// Link
	public static final String DYNAMIC_LINK = "//div[contains(@class,'%s')]//a[text() = '%s']";

	// Result Message
	public static final String DYNAMIC_RESULT_MSG = "//div[@class = '%s']";

	// Product Title
	public static final String DYNAMIC_PRODUCT_TITLE = "//div[@class = 'details']//h2[@class = 'product-title']//a[contains(text(),'%s')]";

	// Product Sub button
	public static final String DYNAMIC_PRODUCT_SUB_BUTTON = "//h2[@class = 'product-title']//a[text() = '%s']/parent::h2//following-sibling::div//div[@class = 'buttons']//input[@value = '%s']";

	// Bar Notification
	public static final String DYNAMIC_BAR_NOTIFICATION = "//div[@class = 'bar-notification success']//p[contains(.,'%s')]//a[text() = '%s']";

	// Product detail
	public static final String DYNAMIC_PRODUCT_DETAIL = "//tr//td[@class = 'product']//a[text() = '%s']";

}
