package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class e0 extends c0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f48389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f48390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f48391h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f48392i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f48393j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C1802k f48394k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final a f48395l;

    public interface a {
        void a(Uri uri);
    }

    public e0(String str, com.applovin.impl.sdk.ad.b bVar, String str2, C1802k c1802k, a aVar) {
        this(str, bVar, bVar.S(), true, str2, c1802k, aVar);
    }

    public e0(String str, com.applovin.impl.sdk.ad.b bVar, List list, boolean z2, String str2, C1802k c1802k, a aVar) {
        super("AsyncTaskCacheResource", c1802k);
        this.f48389f = str;
        this.f48390g = bVar;
        this.f48391h = list;
        this.f48392i = z2;
        this.f48393j = str2;
        this.f48394k = c1802k;
        this.f48395l = aVar;
    }

    private void a(Uri uri) {
        a aVar;
        if (this.f48165e.get() || (aVar = this.f48395l) == null) {
            return;
        }
        aVar.a(uri);
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean call() {
        if (this.f48165e.get()) {
            return Boolean.FALSE;
        }
        String strA = this.f48394k.G().a(a(), this.f48389f, this.f48390g.getCachePrefix(), this.f48391h, this.f48392i, this.f48394k.G().a(this.f48389f, this.f48390g), this.f48393j, f2.a((AppLovinAdImpl) this.f48390g));
        if (TextUtils.isEmpty(strA)) {
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f48165e.get()) {
            return Boolean.FALSE;
        }
        File fileA = this.f48394k.G().a(strA, a());
        if (fileA == null) {
            if (C1804o.a()) {
                this.f48163c.b(this.f48162b, "Unable to retrieve File for cached filename = " + strA);
            }
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f48165e.get()) {
            return Boolean.FALSE;
        }
        Uri uriFromFile = Uri.fromFile(fileA);
        if (uriFromFile == null) {
            if (C1804o.a()) {
                this.f48163c.b(this.f48162b, "Unable to extract Uri from file");
            }
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f48165e.get()) {
            return Boolean.FALSE;
        }
        a(uriFromFile);
        return Boolean.TRUE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f48389f.equals(((e0) obj).f48389f);
    }

    public int hashCode() {
        String str = this.f48389f;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
