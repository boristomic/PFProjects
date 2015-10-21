package ba.bitcamp.android.recyclerview;

import java.util.Date;
import java.util.UUID;

/**
 * Created by boris.tomic on 21/10/15.
 */
public class PersonModel {

    private UUID mId;
    private String mFirstName;
    private String mLastName;
    private Date mDateAdded;

    public PersonModel(String firstName, String lastName) {
        mFirstName = firstName;
        mLastName = lastName;
        mId = UUID.randomUUID();
        mDateAdded = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public Date getmDateAdded() {
        return mDateAdded;
    }

    public void setFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }

    public void setLastName(String mLastName) {
        this.mLastName = mLastName;
    }


}