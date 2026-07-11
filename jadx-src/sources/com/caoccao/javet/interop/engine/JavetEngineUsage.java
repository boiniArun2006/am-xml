package com.caoccao.javet.interop.engine;

import j$.time.ZonedDateTime;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class JavetEngineUsage {
    protected int engineUsedCount;
    protected ZonedDateTime lastActiveZonedDatetime;

    protected void reset() {
        this.engineUsedCount = 0;
    }

    public int getEngineUsedCount() {
        return this.engineUsedCount;
    }

    public ZonedDateTime getLastActiveZonedDatetime() {
        return this.lastActiveZonedDatetime;
    }

    public void increaseUsedCount() {
        this.engineUsedCount++;
    }

    public void setLastActiveZonedDatetime(ZonedDateTime zonedDateTime) {
        this.lastActiveZonedDatetime = zonedDateTime;
    }

    public JavetEngineUsage() {
        reset();
    }
}
