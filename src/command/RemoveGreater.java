package command;

import com.company.Collection;

public class RemoveGreater {

    public void removeGreater (Collection collection, String key) {
        RemoveGreaterKey removeGreaterKey = new RemoveGreaterKey();
        removeGreaterKey.removeGreaterKey(key, collection);
    }
}

