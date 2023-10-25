package TaskOne;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class GenericUrlHandler<T> {


    private URL url;

    public GenericUrlHandler(URL url) {
        this.url = url;
    }

    public URL getUrl() {
        return url;
    }

    List<GenericUrlHandler> genericList = new ArrayList<GenericUrlHandler>();

    public <T> void listToClassMaper(List<T> list) {
        for (T generic : list) {
            GenericUrlHandler genericUrlHandler = (GenericUrlHandler) generic;
            genericList.add(genericUrlHandler);

        }
    }
}



