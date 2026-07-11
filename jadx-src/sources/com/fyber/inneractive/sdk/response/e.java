package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.CreativeType;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.ignite.m;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f56840B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f56841C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public String f56842D;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public String f56844F;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public CreativeType f56848J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f56849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f56850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f56851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f56852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f56853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f56854f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f56855g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f56856h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f56857i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f56858j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f56859k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f56860l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f56861m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public UnitDisplayType f56862n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f56863o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Map f56864p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f56865q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ImpressionData f56866r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f56869u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Exception f56871w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f56872x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f56873y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f56874z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f56867s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f56868t = -1.0f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f56870v = -1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f56839A = false;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public m f56843E = m.NONE;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f56845G = false;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f56846H = 0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f56847I = false;

    public abstract InneractiveErrorCode a(InneractiveAdRequest inneractiveAdRequest, r rVar);

    public final void a(String str) {
        long j2;
        try {
            j2 = Long.parseLong(str);
        } catch (NumberFormatException unused) {
            j2 = 20;
        }
        this.f56850b = j2;
        this.f56849a = TimeUnit.MINUTES.toMillis(j2) + this.f56851c;
    }

    public abstract InneractiveErrorCode b();

    public final boolean a() {
        return (this.f56843E == m.NONE || TextUtils.isEmpty(this.f56872x) || TextUtils.isEmpty(this.f56842D) || TextUtils.isEmpty(this.f56844F)) ? false : true;
    }
}
