package command;

import com.company.Collection;

public class Clear {

    public void clear(Collection collection) {
        collection.collection.clear();
        System.out.println("Collection cleared");
    }
}
