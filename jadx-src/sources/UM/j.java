package UM;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class j {
    public static final j HI;
    public static final j az;
    public static final j gh;
    public static final j mUb;
    public static final j qie;
    public static final j ty;
    private final int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f10640O;
    private final int Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int[] f10641n;
    private final n nr;
    private final int[] rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final n f10642t;
    public static final j KN = new j(4201, 4096, 1);
    public static final j xMQ = new j(AnalyticsListener.EVENT_RENDERER_READY_CHANGED, 1024, 1);

    static int n(int i2, int i3) {
        return i2 ^ i3;
    }

    static {
        j jVar = new j(67, 64, 1);
        mUb = jVar;
        gh = new j(19, 16, 1);
        qie = new j(285, 256, 0);
        j jVar2 = new j(Sdk.SDKError.Reason.MRAID_ERROR_VALUE, 256, 1);
        az = jVar2;
        ty = jVar2;
        HI = jVar;
    }

    int J2(int i2) {
        if (i2 != 0) {
            return this.f10641n[(this.f10640O - this.rl[i2]) - 1];
        }
        throw new ArithmeticException();
    }

    int KN(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 0;
        }
        int[] iArr = this.f10641n;
        int[] iArr2 = this.rl;
        return iArr[(iArr2[i2] + iArr2[i3]) % (this.f10640O - 1)];
    }

    n O() {
        return this.f10642t;
    }

    int Uo(int i2) {
        if (i2 != 0) {
            return this.rl[i2];
        }
        throw new IllegalArgumentException();
    }

    public int nr() {
        return this.Uo;
    }

    n rl(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        if (i3 == 0) {
            return this.f10642t;
        }
        int[] iArr = new int[i2 + 1];
        iArr[0] = i3;
        return new n(this, iArr);
    }

    int t(int i2) {
        return this.f10641n[i2];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.J2) + ',' + this.f10640O + ')';
    }

    public j(int i2, int i3, int i5) {
        this.J2 = i2;
        this.f10640O = i3;
        this.Uo = i5;
        this.f10641n = new int[i3];
        this.rl = new int[i3];
        int i7 = 1;
        for (int i8 = 0; i8 < i3; i8++) {
            this.f10641n[i8] = i7;
            i7 <<= 1;
            if (i7 >= i3) {
                i7 = (i7 ^ i2) & (i3 - 1);
            }
        }
        for (int i9 = 0; i9 < i3 - 1; i9++) {
            this.rl[this.f10641n[i9]] = i9;
        }
        this.f10642t = new n(this, new int[]{0});
        this.nr = new n(this, new int[]{1});
    }
}
