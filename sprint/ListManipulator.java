package sprint;

import java.util.List;

public class ListManipulator {

    public List<String> manipulateList(List<String> list) {

        // Check if the list is not empty
        if (!list.isEmpty()) {

            // Remove the last element
            list.remove(list.size() - 1);

            // After removing, there might still be elements.
            // Only replace the last element if one exists.
            if (!list.isEmpty()) {
                list.set(
                        list.size() - 1,
                        "The size of the list is " + list.size()
                );
            }
        }

        // Always add "last"
        list.add("last");

        // Replace the first element.
        // This is now safe because the list contains at least one element.
        list.set(0, "first");

        return list;
    }
}
