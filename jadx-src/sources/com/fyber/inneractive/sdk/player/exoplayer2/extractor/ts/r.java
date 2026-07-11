package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f55630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f55631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f55632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f55633e;

    public final void a(byte[] bArr, int i2, int i3) {
        if (this.f55630b) {
            int i5 = i3 - i2;
            byte[] bArr2 = this.f55632d;
            int length = bArr2.length;
            int i7 = this.f55633e + i5;
            if (length < i7) {
                this.f55632d = Arrays.copyOf(bArr2, i7 * 2);
            }
            System.arraycopy(bArr, i2, this.f55632d, this.f55633e, i5);
            this.f55633e += i5;
        }
    }

    public final void b(int i2) {
        if (this.f55630b) {
            throw new IllegalStateException();
        }
        boolean z2 = i2 == this.f55629a;
        this.f55630b = z2;
        if (z2) {
            this.f55633e = 3;
            this.f55631c = false;
        }
    }

    public r(int i2) {
        this.f55629a = i2;
        byte[] bArr = new byte[Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE];
        this.f55632d = bArr;
        bArr[2] = 1;
    }

    public final boolean a(int i2) {
        if (!this.f55630b) {
            return false;
        }
        this.f55633e -= i2;
        this.f55630b = false;
        this.f55631c = true;
        return true;
    }
}
