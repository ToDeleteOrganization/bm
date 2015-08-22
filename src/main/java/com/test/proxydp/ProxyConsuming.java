package com.test.proxydp;

import java.sql.Time;

/**
 * Created by malu on 8/22/2015.
 */
public class ProxyConsuming implements TimeConsumingOperation {

    private final TimeConsumingOperation tco;

    public  ProxyConsuming() {
        this.tco = new DefaultTimeConsumigOperation();
    }

    public long getOperationDuration() {
        return tco.getOperationDuration();
    }
}
