package enums;

public enum Urls {

	MAIN_PAGE("https://www.google.com/");

	private final String url;

	Urls(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}
}
