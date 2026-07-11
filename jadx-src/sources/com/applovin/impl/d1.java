package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import com.applovin.impl.sdk.C1802k;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class d1 extends s2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C1802k f48239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f48240f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f48241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f48242h;

    public enum a {
        RECENT_ADS,
        COUNT
    }

    public void a(List list, C1802k c1802k) {
        Activity activityU0;
        this.f48239e = c1802k;
        this.f48240f = list;
        if (!(this.f49908a instanceof Activity) && (activityU0 = c1802k.u0()) != null) {
            this.f49908a = activityU0;
        }
        if (list != null && this.f48241g.compareAndSet(false, true)) {
            this.f48242h = a(this.f48240f);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.DAz
            @Override // java.lang.Runnable
            public final void run() {
                this.f47712n.notifyDataSetChanged();
            }
        });
    }

    public List d() {
        return this.f48240f;
    }

    public C1802k e() {
        return this.f48239e;
    }

    @Override // com.applovin.impl.s2
    protected int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.s2
    protected List c(int i2) {
        return this.f48242h;
    }

    @Override // com.applovin.impl.s2
    protected int d(int i2) {
        return this.f48242h.size();
    }

    @Override // com.applovin.impl.s2
    protected r2 e(int i2) {
        return new v4("RECENT ADS");
    }

    public boolean f() {
        return this.f48242h.size() == 0;
    }

    public void g() {
        this.f48241g.compareAndSet(true, false);
    }

    public String toString() {
        return "CreativeDebuggerListAdapter{isInitialized=" + this.f48241g.get() + "}";
    }

    public d1(Context context) {
        super(context);
        this.f48241g = new AtomicBoolean();
        this.f48242h = new ArrayList();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new p1((q1) it.next(), this.f49908a));
        }
        return arrayList;
    }
}
