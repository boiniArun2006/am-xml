package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.b0;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class s5 extends AbstractRunnableC1782i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f49933g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f49934h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f49935i;

    class a extends l6 {
        a(com.applovin.impl.sdk.network.a aVar, C1802k c1802k) {
            super(aVar, c1802k);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, String str2, int i2) {
            if (TextUtils.isEmpty(str2)) {
                if (C1804o.a()) {
                    this.f48735c.b(this.f48734b, "No app-ads.txt found");
                }
                s5.this.f49933g.a(b0.b.APPADSTXT_NOT_FOUND, s5.this.f49935i);
            } else {
                if (C1804o.a()) {
                    this.f48735c.a(this.f48734b, "Found app-ads.txt");
                }
                s5.this.f49933g.a(str2, s5.this.f49935i);
            }
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i2, String str2, String str3) {
            if (C1804o.a()) {
                this.f48735c.b(this.f48734b, "Unable to fetch app-ads.txt due to: " + str2 + ", and received error code: " + i2);
            }
            s5.this.f49933g.a(b0.b.APPADSTXT_NOT_FOUND, s5.this.f49935i);
        }
    }

    public interface b {
        void a(b0.b bVar, String str);

        void a(String str, String str2);
    }

    public s5(C1802k c1802k, String str, b bVar) {
        super("TaskFetchAppAdsContent", c1802k);
        this.f49934h = str;
        this.f49933g = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList = new ArrayList(Arrays.asList(Uri.parse(this.f49934h).getAuthority().split("\\.")));
        if (arrayList.size() > 0) {
            String str = (String) arrayList.get(0);
            if ("www".equals(str) || "m".equals(str)) {
                arrayList.remove(0);
            }
        }
        String strJoin = TextUtils.join(".", arrayList);
        Uri uriBuild = new Uri.Builder().scheme("https").authority(strJoin).appendPath("app-ads.txt").build();
        com.applovin.impl.sdk.network.a aVarA = com.applovin.impl.sdk.network.a.a(this.f48733a).c("GET").b(uriBuild.toString()).a(new Uri.Builder().scheme(com.safedk.android.analytics.brandsafety.creatives.g.f62375e).authority(strJoin).appendPath("app-ads.txt").build().toString()).a((Object) "").a(false).a();
        this.f49935i = uriBuild.toString();
        if (C1804o.a()) {
            this.f48735c.a(this.f48734b, "Looking up app-ads.txt at " + this.f49935i);
        }
        this.f48733a.q0().a(new a(aVarA, this.f48733a));
    }
}
