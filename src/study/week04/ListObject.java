package study.week04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListObject {

    private final List<ImmutablePhone> phone;

    public ListObject(final List<ImmutablePhone> phone) {

        this.phone = new ArrayList<>(phone);
    }

    public List<ImmutablePhone> getPhone() {
        return Collections.unmodifiableList(phone);
    }


}
