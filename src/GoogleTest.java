import com.borland.silktest.jtf.Desktop;
import com.borland.silk.keyworddriven.annotations.Keyword;
import com.borland.silktest.jtf.BrowserBaseState;
import com.borland.silktest.jtf.xbrowser.DomTextField;
import com.borland.silktest.jtf.common.types.MouseButton;
import com.borland.silktest.jtf.common.types.Point;

public class GoogleTest {

	private Desktop desktop = new Desktop();

	@Keyword(value = "Start application", isBaseState = true)
	public void start_application() {
		// Go to web page 'www.google.ro'
		BrowserBaseState baseState = new BrowserBaseState();
		baseState.execute(desktop);
	}

	@Keyword("Untitled keyword")
	public void untitled_keyword() {
		desktop.<DomTextField> find("google_ro.BrowserWindow.lst-ib").click(MouseButton.LEFT, new Point(449, 14));
		desktop.<DomTextField> find("google_ro.BrowserWindow.lst-ib").typeKeys("test<Enter>");
	}

}