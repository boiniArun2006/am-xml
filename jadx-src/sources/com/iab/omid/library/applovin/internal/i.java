package com.iab.omid.library.applovin.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.applovin.internal.d;
import com.iab.omid.library.applovin.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class i implements d.a, com.iab.omid.library.applovin.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f61118f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f61119a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.applovin.devicevolume.e f61120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.applovin.devicevolume.b f61121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.applovin.devicevolume.d f61122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f61123e;

    public i(com.iab.omid.library.applovin.devicevolume.e eVar, com.iab.omid.library.applovin.devicevolume.b bVar) {
        this.f61120b = eVar;
        this.f61121c = bVar;
    }

    private c a() {
        if (this.f61123e == null) {
            this.f61123e = c.c();
        }
        return this.f61123e;
    }

    public static i c() {
        if (f61118f == null) {
            f61118f = new i(new com.iab.omid.library.applovin.devicevolume.e(), new com.iab.omid.library.applovin.devicevolume.b());
        }
        return f61118f;
    }

    public float b() {
        return this.f61119a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f61122d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f61122d.d();
    }

    @Override // com.iab.omid.library.applovin.devicevolume.c
    public void a(float f3) {
        this.f61119a = f3;
        Iterator<com.iab.omid.library.applovin.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(f3);
        }
    }

    public void a(Context context) {
        this.f61122d = this.f61120b.a(new Handler(), context, this.f61121c.a(), this);
    }

    @Override // com.iab.omid.library.applovin.internal.d.a
    public void a(boolean z2) {
        if (z2) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
