package com.test.proxydp;

/**
 * Created by malu on 8/22/2015.
 */
public class DefaultTimeConsumigOperation implements TimeConsumingOperation {
    public long getOperationDuration() {
        return Long.valueOf(String.valueOf(34.5));
    }
}
