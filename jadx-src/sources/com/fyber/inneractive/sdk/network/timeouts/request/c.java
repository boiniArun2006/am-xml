package com.fyber.inneractive.sdk.network.timeouts.request;

import com.fyber.inneractive.sdk.config.global.features.k;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class c extends a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public double f54343m;

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(k kVar, String str) {
        return kVar.b(str, this.f54342l);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int b(k kVar, String str) {
        String str2 = this.f54342l;
        kVar.getClass();
        String strA = k.a(str, "min", "rat", "bidding", k.e(str2));
        String strA2 = k.a(str, "min", "rat", "bidding", "all_mediators");
        "read".equalsIgnoreCase(str);
        Integer numA = kVar.a(strA2);
        int iIntValue = numA != null ? numA.intValue() : 5000;
        Integer numA2 = kVar.a(strA);
        return numA2 != null ? numA2.intValue() : iIntValue;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int c(k kVar, String str) {
        String str2 = this.f54342l;
        kVar.getClass();
        String strA = k.a(str, "rat", "bidding", "perc", k.e(str2));
        String strA2 = k.a(str, "rat", "bidding", "perc", "all_mediators");
        "read".equalsIgnoreCase(str);
        Integer numA = kVar.a(strA2);
        int iIntValue = numA != null ? numA.intValue() : 15;
        Integer numA2 = kVar.a(strA);
        return numA2 != null ? numA2.intValue() : iIntValue;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(k kVar) {
        String str = this.f54342l;
        kVar.getClass();
        String strA = k.a("timeout", "threshold", "rat", "bidding", k.e(str));
        Integer numA = kVar.a(k.a("timeout", "threshold", "rat", "bidding", "all_mediators"));
        int iIntValue = numA != null ? numA.intValue() : com.safedk.android.internal.d.f62986a;
        Integer numA2 = kVar.a(strA);
        return numA2 != null ? numA2.intValue() : iIntValue;
    }

    public c(String str, k kVar, String str2) {
        super(str, kVar, str2);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final void d(k kVar, String str) {
        boolean zBooleanValue;
        int iIntValue;
        int iIntValue2;
        super.d(kVar, str);
        Boolean boolC = kVar.c("reverse_retries");
        if (boolC != null) {
            zBooleanValue = boolC.booleanValue();
        } else {
            zBooleanValue = true;
        }
        this.f54336g = zBooleanValue;
        String strA = k.a("retry_interval", "rat", "bidding");
        Integer numA = kVar.a(k.a("retry_interval", "all_mediators"));
        if (numA != null) {
            iIntValue = numA.intValue();
        } else {
            iIntValue = 100;
        }
        Integer numA2 = kVar.a(strA);
        if (numA2 != null) {
            iIntValue = numA2.intValue();
        }
        this.f54334e = iIntValue;
        this.f54332c = (this.f54339i + this.f54338h) - (iIntValue + this.f54335f);
        String strA2 = k.a("bidding", "irat", k.e(this.f54342l));
        Integer numA3 = kVar.a(k.a("bidding", "irat", "all_mediators"));
        if (numA3 != null) {
            iIntValue2 = numA3.intValue();
        } else {
            iIntValue2 = 10000;
        }
        Integer numA4 = kVar.a(strA2);
        if (numA4 != null) {
            iIntValue2 = numA4.intValue();
        }
        this.f54333d = iIntValue2;
        this.f54343m = ((double) Math.min(this.f54341k, this.f54340j)) / ((double) Math.max(this.f54341k, this.f54340j));
        b(this.f54333d);
        this.f54330a = Math.max(0, a());
        if (this.f54336g) {
            IAlog.a("%s : RequestBiddingAdTimeout shouldReverseRetries - reversing timeouts", IAlog.a(this));
            a(0);
        }
        IAlog.a("%s : RequestBiddingAdTimeout init timeouts, total retries: %d", IAlog.a(this), Integer.valueOf(this.f54330a));
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int c() {
        return this.f54334e;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(int i2) {
        if (this.f54336g) {
            i2 = this.f54330a - i2;
        }
        int i3 = (this.f54331b * i2) + this.f54333d;
        IAlog.a("%s : RequestBiddingAdTimeout resolveTimeoutForRetry, timeout: %d ms for retry: %d", IAlog.a(this), Integer.valueOf(i3), Integer.valueOf(i2));
        b(i3);
        return i3;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int b() {
        return this.f54330a;
    }

    public final void b(int i2) {
        double d2 = this.f54343m;
        if (d2 == 1.0d || d2 == 0.0d) {
            IAlog.a("%s : RequestBiddingAdTimeout Ratio: %f, connection and read timeouts should be divided in equal proportions", IAlog.a(this), Double.valueOf(this.f54343m));
            this.f54343m = 0.5d;
        }
        int i3 = (int) (((double) i2) * this.f54343m);
        this.f54338h = i3;
        this.f54339i = i2 - i3;
        IAlog.a("%s : RequestBiddingAdTimeout Update timeouts connection: %d read: %d", IAlog.a(this), Integer.valueOf(this.f54339i), Integer.valueOf(this.f54338h));
    }
}
