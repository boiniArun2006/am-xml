package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.applovin.impl.i5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class AbstractRunnableC1782i5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final C1802k f48733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final String f48734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final C1804o f48735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f48736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f48737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f48738f;

    public AbstractRunnableC1782i5(String str, C1802k c1802k) {
        this(str, c1802k, false, null);
    }

    public Context a() {
        return this.f48736d;
    }

    public C1802k b() {
        return this.f48733a;
    }

    public AbstractRunnableC1782i5(String str, C1802k c1802k, boolean z2) {
        this(str, c1802k, z2, null);
    }

    public void a(String str) {
        this.f48737e = str;
    }

    public ScheduledFuture b(final Thread thread, final long j2) {
        if (j2 <= 0) {
            return null;
        }
        return this.f48733a.q0().b(new C1797r6(this.f48733a, "timeout:" + this.f48734b, new Runnable() { // from class: com.applovin.impl.xuv
            @Override // java.lang.Runnable
            public final void run() {
                this.f50861n.a(thread, j2);
            }
        }), d6.b.TIMEOUT, j2);
    }

    public String c() {
        return this.f48734b;
    }

    public boolean d() {
        return this.f48738f;
    }

    public AbstractRunnableC1782i5(String str, C1802k c1802k, String str2) {
        this(str, c1802k, false, str2);
    }

    public void a(boolean z2) {
        this.f48738f = z2;
    }

    public AbstractRunnableC1782i5(String str, C1802k c1802k, boolean z2, String str2) {
        this.f48734b = str;
        this.f48733a = c1802k;
        this.f48735c = c1802k.O();
        this.f48736d = C1802k.o();
        this.f48738f = z2;
        this.f48737e = str2;
    }

    public void a(Throwable th) {
        Map map = CollectionUtils.map("source", this.f48734b);
        map.put("top_main_method", th.toString());
        map.put("details", StringUtils.emptyIfNull(this.f48737e));
        this.f48733a.D().d(d2.X0, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Thread thread, long j2) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap(AppMeasurementSdk.ConditionalUserProperty.NAME, thread.getState().name());
        if (StringUtils.isValidString(this.f48737e)) {
            mapHashMap.put("details", this.f48737e);
        }
        this.f48733a.D().a(d2.Y0, this.f48734b, mapHashMap);
        if (C1804o.a()) {
            this.f48735c.k(this.f48734b, "Task has been executing for over " + TimeUnit.MILLISECONDS.toSeconds(j2) + " seconds");
        }
    }
}
