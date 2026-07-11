package com.caoccao.javet.interop.proxy.plugins;

import java.util.Set;
import java.util.function.Consumer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final /* synthetic */ class ua implements Consumer {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Set f52009n;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f52009n.add((String) obj);
    }
}
