package by.belstu.it.fedorov;

/** Documentation
 *  This is test class
 * @Fedorov, @ver 1.0
 */

public class TestFunction
{
    private int _x;
    public final int constX = 1000;
    public static final int constY = 2000;

    public TestFunction() {
        _x = 0;
    }

    public int get_x() {
        return _x;
    }

    public void set_x(int _x) {
        this._x = _x;
    }

    public String getValue()
    {
        Loop();
        return "Hello from the first project!";
    }

    public void Loop() {
        for(int i =0; i < 10; i++)
        {
            if (i > -1 && i < 10) System.out.println(i);
        }
    }
}
