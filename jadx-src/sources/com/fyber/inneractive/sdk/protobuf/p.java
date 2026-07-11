package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class p extends s {
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new l(this);
    }
}
