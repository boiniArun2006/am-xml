package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import com.applovin.impl.p0;
import com.applovin.impl.r2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class r4 extends r2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final p0.a f49877n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Context f49878o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f49879p;

    @Override // com.applovin.impl.r2
    public boolean o() {
        return false;
    }

    public r4(p0.a aVar, boolean z2, Context context) {
        super(r2.c.RIGHT_DETAIL);
        this.f49877n = aVar;
        this.f49878o = context;
        this.f49833c = new SpannedString(aVar.a());
        this.f49879p = z2;
    }

    @Override // com.applovin.impl.r2
    public SpannedString f() {
        return new SpannedString(this.f49877n.a(this.f49878o));
    }

    @Override // com.applovin.impl.r2
    public boolean p() {
        Boolean boolB = this.f49877n.b(this.f49878o);
        if (boolB != null) {
            return boolB.equals(Boolean.valueOf(this.f49879p));
        }
        return false;
    }
}
