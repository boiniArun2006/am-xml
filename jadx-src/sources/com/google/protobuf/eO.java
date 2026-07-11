package com.google.protobuf;

import com.google.protobuf.CM;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class eO {
    public abstract Object getDefaultValue();

    public abstract CM.n getLiteType();

    public abstract yg getMessageDefaultInstance();

    public abstract int getNumber();

    boolean isLite() {
        return true;
    }

    public abstract boolean isRepeated();
}
