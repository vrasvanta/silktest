import com.borland.silktest.jtf.Desktop;
import com.borland.silk.keyworddriven.annotations.Keyword;
import com.borland.silktest.jtf.BrowserBaseState;
import com.borland.silktest.jtf.xbrowser.DomTextField;
import com.borland.silktest.jtf.common.types.MouseButton;
import com.borland.silktest.jtf.common.types.Point;
import com.borland.silktest.jtf.common.BrowserType;

public class GoogleTest {

	private Desktop desktop = new Desktop();

	@Keyword(value = "Start application", isBaseState = true)
	public void start_application() {
// -- in case no other browser is specified, this will be chosen as default
		BrowserType browserType = BrowserType.Firefox;
		BrowserBaseState baseState = new BrowserBaseState(browserType, "http://www.google.ro");
	}

	@Keyword("Untitled keyword")
	public void untitled_keyword() {
		desktop.<DomTextField> find("google_ro.BrowserWindow.lst-ib").click(MouseButton.LEFT, new Point(449, 14));
		desktop.<DomTextField> find("google_ro.BrowserWindow.lst-ib").typeKeys("test<Enter>");
	}

}
