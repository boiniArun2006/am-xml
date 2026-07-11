package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import androidx.media3.exoplayer.RendererCapabilities;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f55342h = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f55343i = {44100, 48000, 32000};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f55344j = {32, 64, 96, 128, 160, 192, 224, 256, 288, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 352, RendererCapabilities.DECODER_SUPPORT_MASK, 416, 448};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f55345k = {32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, 192, 224, 256};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f55346l = {32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, RendererCapabilities.DECODER_SUPPORT_MASK};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f55347m = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f55348n = {8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f55349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f55350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f55352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f55353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f55354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f55355g;

    public static int a(int i2) {
        int i3;
        int i5;
        int i7;
        int i8;
        if ((i2 & (-2097152)) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i5 = (i2 >>> 17) & 3) == 0 || (i7 = (i2 >>> 12) & 15) == 0 || i7 == 15 || (i8 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i9 = f55343i[i8];
        if (i3 == 2) {
            i9 /= 2;
        } else if (i3 == 0) {
            i9 /= 4;
        }
        int i10 = (i2 >>> 9) & 1;
        if (i5 == 3) {
            return ((((i3 == 3 ? f55344j[i7 - 1] : f55345k[i7 - 1]) * 12000) / i9) + i10) * 4;
        }
        int i11 = i3 == 3 ? i5 == 2 ? f55346l[i7 - 1] : f55347m[i7 - 1] : f55348n[i7 - 1];
        if (i3 == 3) {
            return ((i11 * 144000) / i9) + i10;
        }
        return (((i5 == 1 ? 72000 : 144000) * i11) / i9) + i10;
    }

    public static boolean a(int i2, n nVar) {
        int i3;
        int i5;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        if ((i2 & (-2097152)) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i5 = (i2 >>> 17) & 3) == 0 || (i7 = (i2 >>> 12) & 15) == 0 || i7 == 15 || (i8 = (i2 >>> 10) & 3) == 3) {
            return false;
        }
        int i13 = f55343i[i8];
        if (i3 == 2) {
            i13 /= 2;
        } else if (i3 == 0) {
            i13 /= 4;
        }
        int i14 = (i2 >>> 9) & 1;
        if (i5 == 3) {
            i9 = i3 == 3 ? f55344j[i7 - 1] : f55345k[i7 - 1];
            i11 = (((i9 * 12000) / i13) + i14) * 4;
            i12 = RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if (i3 == 3) {
                i9 = i5 == 2 ? f55346l[i7 - 1] : f55347m[i7 - 1];
                i10 = (144000 * i9) / i13;
            } else {
                i9 = f55348n[i7 - 1];
                i = i5 == 1 ? 576 : 1152;
                i10 = ((i5 == 1 ? 72000 : 144000) * i9) / i13;
            }
            i11 = i10 + i14;
            i12 = i;
        }
        String str = f55342h[3 - i5];
        int i15 = ((i2 >> 6) & 3) == 3 ? 1 : 2;
        nVar.f55349a = i3;
        nVar.f55350b = str;
        nVar.f55351c = i11;
        nVar.f55352d = i13;
        nVar.f55353e = i15;
        nVar.f55354f = i9 * 1000;
        nVar.f55355g = i12;
        return true;
    }
}
