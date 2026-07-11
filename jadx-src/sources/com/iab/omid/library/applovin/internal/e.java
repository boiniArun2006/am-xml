package com.iab.omid.library.applovin.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.applovin.weakreference.a f61106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f61107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f61108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f61109d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f61106a = new com.iab.omid.library.applovin.weakreference.a(view);
        this.f61107b = view.getClass().getCanonicalName();
        this.f61108c = friendlyObstructionPurpose;
        this.f61109d = str;
    }

    public String a() {
        return this.f61109d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f61108c;
    }

    public com.iab.omid.library.applovin.weakreference.a c() {
        return this.f61106a;
    }

    public String d() {
        return this.f61107b;
    }
}
