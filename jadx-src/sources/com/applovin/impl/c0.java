package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class c0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final C1802k f48161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final String f48162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final C1804o f48163c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final AtomicBoolean f48165e = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f48164d = C1802k.o();

    public Context a() {
        return this.f48164d;
    }

    public void a(boolean z2) {
        this.f48165e.set(z2);
    }

    public c0(String str, C1802k c1802k) {
        this.f48162b = str;
        this.f48161a = c1802k;
        this.f48163c = c1802k.O();
    }
}
