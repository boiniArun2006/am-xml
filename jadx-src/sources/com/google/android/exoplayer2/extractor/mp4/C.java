package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class C {
    public long Ik;
    public int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f57809O;
    public boolean ck;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public w6 f57810n;
    public long nr;
    public boolean qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f57811r;
    public long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f57812t;
    public TrackEncryptionBox ty;
    public long[] Uo = new long[0];
    public int[] KN = new int[0];
    public int[] xMQ = new int[0];
    public long[] mUb = new long[0];
    public boolean[] gh = new boolean[0];
    public boolean[] az = new boolean[0];
    public final ParsableByteArray HI = new ParsableByteArray();

    public void J2() {
        this.f57809O = 0;
        this.Ik = 0L;
        this.f57811r = false;
        this.qie = false;
        this.ck = false;
        this.ty = null;
    }

    public void O(int i2, int i3) {
        this.f57809O = i2;
        this.J2 = i3;
        if (this.KN.length < i2) {
            this.Uo = new long[i2];
            this.KN = new int[i2];
        }
        if (this.xMQ.length < i3) {
            int i5 = (i3 * Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) / 100;
            this.xMQ = new int[i5];
            this.mUb = new long[i5];
            this.gh = new boolean[i5];
            this.az = new boolean[i5];
        }
    }

    public boolean Uo(int i2) {
        return this.qie && this.az[i2];
    }

    public void n(ExtractorInput extractorInput) throws IOException {
        extractorInput.readFully(this.HI.getData(), 0, this.HI.limit());
        this.HI.setPosition(0);
        this.ck = false;
    }

    public void nr(int i2) {
        this.HI.reset(i2);
        this.qie = true;
        this.ck = true;
    }

    public void rl(ParsableByteArray parsableByteArray) {
        parsableByteArray.readBytes(this.HI.getData(), 0, this.HI.limit());
        this.HI.setPosition(0);
        this.ck = false;
    }

    public long t(int i2) {
        return this.mUb[i2];
    }
}
