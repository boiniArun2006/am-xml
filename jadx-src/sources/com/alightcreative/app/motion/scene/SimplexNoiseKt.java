package com.alightcreative.app.motion.scene;

import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.media3.extractor.ts.TsExtractor;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.safedk.android.analytics.brandsafety.b;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\u001a\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0002\u001a \u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0002\u001a(\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0002\u001a0\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nH\u0002\u001a\u0016\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n\u001a\u001e\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n\u001a&\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n\"\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0003\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"grad3", "", "Lcom/alightcreative/app/motion/scene/Grad;", "[Lcom/alightcreative/app/motion/scene/Grad;", "grad4", TtmlNode.TAG_P, "", "perm", "permMod12", "F2", "", "G2", "F3", "G3", "F4", "G4", "fastfloor", "", "x", TtmlNode.TEXT_EMPHASIS_MARK_DOT, "g", "y", "z", "w", "simplexNoise", "xin", "yin", "zin", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SimplexNoiseKt {
    private static final double F2;

    /* JADX INFO: renamed from: F3, reason: collision with root package name */
    private static final double f46024F3;
    private static final double F4;
    private static final double G2;
    private static final double G3;
    private static final double G4;
    private static final Grad[] grad3 = {new Grad(1.0d, 1.0d, 0.0d, 0.0d, 8, null), new Grad(-1.0d, 1.0d, 0.0d, 0.0d, 8, null), new Grad(1.0d, -1.0d, 0.0d, 0.0d, 8, null), new Grad(-1.0d, -1.0d, 0.0d, 0.0d, 8, null), new Grad(1.0d, 0.0d, 1.0d, 0.0d, 8, null), new Grad(-1.0d, 0.0d, 1.0d, 0.0d, 8, null), new Grad(1.0d, 0.0d, -1.0d, 0.0d, 8, null), new Grad(-1.0d, 0.0d, -1.0d, 0.0d, 8, null), new Grad(0.0d, 1.0d, 1.0d, 0.0d, 8, null), new Grad(0.0d, -1.0d, 1.0d, 0.0d, 8, null), new Grad(0.0d, 1.0d, -1.0d, 0.0d, 8, null), new Grad(0.0d, -1.0d, -1.0d, 0.0d, 8, null)};
    private static final Grad[] grad4 = {new Grad(0.0d, 1.0d, 1.0d, 1.0d), new Grad(0.0d, 1.0d, 1.0d, -1.0d), new Grad(0.0d, 1.0d, -1.0d, 1.0d), new Grad(0.0d, 1.0d, -1.0d, -1.0d), new Grad(0.0d, -1.0d, 1.0d, 1.0d), new Grad(0.0d, -1.0d, 1.0d, -1.0d), new Grad(0.0d, -1.0d, -1.0d, 1.0d), new Grad(0.0d, -1.0d, -1.0d, -1.0d), new Grad(1.0d, 0.0d, 1.0d, 1.0d), new Grad(1.0d, 0.0d, 1.0d, -1.0d), new Grad(1.0d, 0.0d, -1.0d, 1.0d), new Grad(1.0d, 0.0d, -1.0d, -1.0d), new Grad(-1.0d, 0.0d, 1.0d, 1.0d), new Grad(-1.0d, 0.0d, 1.0d, -1.0d), new Grad(-1.0d, 0.0d, -1.0d, 1.0d), new Grad(-1.0d, 0.0d, -1.0d, -1.0d), new Grad(1.0d, 1.0d, 0.0d, 1.0d), new Grad(1.0d, 1.0d, 0.0d, -1.0d), new Grad(1.0d, -1.0d, 0.0d, 1.0d), new Grad(1.0d, -1.0d, 0.0d, -1.0d), new Grad(-1.0d, 1.0d, 0.0d, 1.0d), new Grad(-1.0d, 1.0d, 0.0d, -1.0d), new Grad(-1.0d, -1.0d, 0.0d, 1.0d), new Grad(-1.0d, -1.0d, 0.0d, -1.0d), new Grad(1.0d, 1.0d, 1.0d, 0.0d), new Grad(1.0d, 1.0d, -1.0d, 0.0d), new Grad(1.0d, -1.0d, 1.0d, 0.0d), new Grad(1.0d, -1.0d, -1.0d, 0.0d), new Grad(-1.0d, 1.0d, 1.0d, 0.0d), new Grad(-1.0d, 1.0d, -1.0d, 0.0d), new Grad(-1.0d, -1.0d, 1.0d, 0.0d), new Grad(-1.0d, -1.0d, -1.0d, 0.0d)};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int[] f46025p = {151, 160, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 91, 90, 15, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 13, 201, 95, 96, 53, 194, 233, 7, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 140, 36, 103, 30, 69, 142, 8, 99, 37, 240, 21, 10, 23, 190, 6, 148, 247, b.f61769v, 234, 75, 0, 26, 197, 62, 94, 252, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, Sdk.SDKError.Reason.AD_IS_LOADING_VALUE, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, 35, 11, 32, 57, 177, 33, 88, 237, 149, 56, 87, 174, 20, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, 136, 171, 168, 68, 175, 74, 165, 71, 134, TsExtractor.TS_STREAM_TYPE_DTS_UHD, 48, 27, 166, 77, 146, 158, 231, 83, 111, 229, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 60, 211, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 230, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 105, 92, 41, 55, 46, 245, 40, 244, 102, 143, 54, 65, 25, 63, 161, 1, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 80, 73, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 76, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 187, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 89, 18, 169, 200, 196, 135, 130, 116, 188, 159, 86, 164, 100, 109, 198, 173, 186, 3, 64, 52, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 250, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, 5, Sdk.SDKError.Reason.AD_CONSUMED_VALUE, 38, 147, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 126, 255, 82, 85, Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, Sdk.SDKError.Reason.PLACEMENT_AD_TYPE_MISMATCH_VALUE, Sdk.SDKError.Reason.AD_ALREADY_FAILED_VALUE, 59, 227, 47, 16, 58, 17, 182, 189, 28, 42, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 183, 170, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 248, ModuleDescriptor.MODULE_VERSION, 2, 44, 154, 163, 70, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, 153, 101, 155, 167, 43, 172, 9, 129, 22, 39, 253, 19, 98, 108, 110, 79, 113, 224, 232, 178, 185, 112, 104, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, 246, 97, 228, 251, 34, 242, 193, 238, Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 144, 12, 191, 179, 162, 241, 81, 51, 145, 235, 249, 14, 239, 107, 49, 192, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 31, 181, 199, 106, 157, 184, 84, 204, 176, 115, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 50, 45, 127, 4, 150, 254, 138, 236, Sdk.SDKError.Reason.AD_IS_PLAYING_VALUE, 93, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, 114, 67, 29, 24, 72, 243, 141, 128, 195, 78, 66, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 61, 156, 180};
    private static final int[] perm;
    private static final int[] permMod12;

    private static final double dot(Grad grad, double d2, double d4) {
        return (grad.getX() * d2) + (grad.getY() * d4);
    }

    private static final int fastfloor(double d2) {
        int i2 = (int) d2;
        return d2 < ((double) i2) ? i2 - 1 : i2;
    }

    public static final double simplexNoise(double d2, double d4) {
        int i2;
        double dDot;
        double dDot2;
        double d5 = (d2 + d4) * F2;
        int iFastfloor = fastfloor(d2 + d5);
        int iFastfloor2 = fastfloor(d4 + d5);
        double d6 = G2;
        double d7 = ((double) (iFastfloor + iFastfloor2)) * d6;
        double d8 = ((double) iFastfloor2) - d7;
        double d9 = d2 - (((double) iFastfloor) - d7);
        double d10 = d4 - d8;
        int i3 = 0;
        if (d9 > d10) {
            i2 = 0;
            i3 = 1;
        } else {
            i2 = 1;
        }
        double d11 = (d9 - ((double) i3)) + d6;
        double d12 = (d10 - ((double) i2)) + d6;
        double d13 = (d9 - 1.0d) + (d6 * 2.0d);
        double d14 = (d6 * 2.0d) + (d10 - 1.0d);
        int i5 = iFastfloor & 255;
        int i7 = iFastfloor2 & 255;
        int[] iArr = permMod12;
        int[] iArr2 = perm;
        int i8 = iArr[i5 + iArr2[i7]];
        int i9 = iArr[i3 + i5 + iArr2[i2 + i7]];
        int i10 = iArr[i5 + 1 + iArr2[i7 + 1]];
        double d15 = (0.5d - (d9 * d9)) - (d10 * d10);
        double dDot3 = 0.0d;
        if (d15 < 0.0d) {
            dDot = 0.0d;
        } else {
            double d16 = d15 * d15;
            dDot = d16 * d16 * dot(grad3[i8], d9, d10);
        }
        double d17 = (0.5d - (d11 * d11)) - (d12 * d12);
        if (d17 < 0.0d) {
            dDot2 = 0.0d;
        } else {
            double d18 = d17 * d17;
            dDot2 = d18 * d18 * dot(grad3[i9], d11, d12);
        }
        double d19 = (0.5d - (d13 * d13)) - (d14 * d14);
        if (d19 >= 0.0d) {
            double d20 = d19 * d19;
            dDot3 = d20 * d20 * dot(grad3[i10], d13, d14);
        }
        return (dDot + dDot2 + dDot3) * 70.0d;
    }

    static {
        int[] iArr = new int[512];
        for (int i2 = 0; i2 < 512; i2++) {
            iArr[i2] = f46025p[i2 % 255];
        }
        perm = iArr;
        int[] iArr2 = new int[512];
        for (int i3 = 0; i3 < 512; i3++) {
            iArr2[i3] = perm[i3] % 12;
        }
        permMod12 = iArr2;
        F2 = (Math.sqrt(3.0d) - 1.0d) * 0.5d;
        G2 = (3.0d - Math.sqrt(3.0d)) / 6.0d;
        f46024F3 = 0.3333333333333333d;
        G3 = 0.16666666666666666d;
        F4 = (Math.sqrt(5.0d) - 1.0d) / 4.0d;
        G4 = (5.0d - Math.sqrt(5.0d)) / 20.0d;
    }

    private static final double dot(Grad grad, double d2, double d4, double d5) {
        return (grad.getX() * d2) + (grad.getY() * d4) + (grad.getZ() * d5);
    }

    private static final double dot(Grad grad, double d2, double d4, double d5, double d6) {
        return (grad.getX() * d2) + (grad.getY() * d4) + (grad.getZ() * d5) + (grad.getW() * d6);
    }

    public static final double simplexNoise(double d2, double d4, double d5) {
        int i2;
        int i3;
        int i5;
        int i7;
        int i8;
        double dDot;
        double dDot2;
        double dDot3;
        double d6 = (d2 + d4 + d5) * f46024F3;
        int iFastfloor = fastfloor(d2 + d6);
        int iFastfloor2 = fastfloor(d4 + d6);
        int iFastfloor3 = fastfloor(d5 + d6);
        double d7 = G3;
        double d8 = ((double) (iFastfloor + iFastfloor2 + iFastfloor3)) * d7;
        double d9 = d2 - (((double) iFastfloor) - d8);
        double d10 = d4 - (((double) iFastfloor2) - d8);
        double d11 = d5 - (((double) iFastfloor3) - d8);
        int i9 = 0;
        if (d9 < d10) {
            if (d10 < d11) {
                i5 = 0;
                i7 = 0;
                i2 = 1;
                i8 = 1;
            } else if (d9 < d11) {
                i2 = 0;
                i7 = 0;
                i5 = 1;
                i8 = 1;
            } else {
                i2 = 0;
                i3 = 0;
                i5 = 1;
                i7 = 1;
                i8 = i7;
            }
            i3 = i8;
        } else if (d10 >= d11) {
            i5 = 0;
            i2 = 0;
            i3 = 0;
            i9 = 1;
            i7 = 1;
            i8 = i7;
        } else {
            if (d9 >= d11) {
                i5 = 0;
                i2 = 0;
                i8 = 0;
                i9 = 1;
                i7 = 1;
            } else {
                i5 = 0;
                i8 = 0;
                i2 = 1;
                i7 = 1;
            }
            i3 = i7;
        }
        double d12 = (d9 - ((double) i9)) + d7;
        double d13 = (d10 - ((double) i5)) + d7;
        double d14 = (d11 - ((double) i2)) + d7;
        double d15 = (d9 - ((double) i7)) + (d7 * 2.0d);
        double d16 = (d10 - ((double) i8)) + (d7 * 2.0d);
        double d17 = (d11 - ((double) i3)) + (2.0d * d7);
        double d18 = (d9 - 1.0d) + (d7 * 3.0d);
        double d19 = (d10 - 1.0d) + (d7 * 3.0d);
        double d20 = (d11 - 1.0d) + (d7 * 3.0d);
        int i10 = iFastfloor & 255;
        int i11 = iFastfloor2 & 255;
        int i12 = iFastfloor3 & 255;
        int[] iArr = permMod12;
        int[] iArr2 = perm;
        int i13 = iArr[iArr2[iArr2[i12] + i11] + i10];
        int i14 = iArr[i9 + i10 + iArr2[i5 + i11 + iArr2[i2 + i12]]];
        int i15 = iArr[i7 + i10 + iArr2[i8 + i11 + iArr2[i3 + i12]]];
        int i16 = iArr[i10 + 1 + iArr2[i11 + 1 + iArr2[i12 + 1]]];
        double d21 = ((0.6d - (d9 * d9)) - (d10 * d10)) - (d11 * d11);
        double dDot4 = 0.0d;
        if (d21 < 0.0d) {
            dDot = 0.0d;
        } else {
            double d22 = d21 * d21;
            dDot = d22 * d22 * dot(grad3[i13], d9, d10, d11);
        }
        double d23 = ((0.6d - (d12 * d12)) - (d13 * d13)) - (d14 * d14);
        if (d23 < 0.0d) {
            dDot2 = 0.0d;
        } else {
            double d24 = d23 * d23;
            dDot2 = d24 * d24 * dot(grad3[i14], d12, d13, d14);
        }
        double d25 = ((0.6d - (d15 * d15)) - (d16 * d16)) - (d17 * d17);
        if (d25 < 0.0d) {
            dDot3 = 0.0d;
        } else {
            double d26 = d25 * d25;
            dDot3 = d26 * d26 * dot(grad3[i15], d15, d16, d17);
        }
        double d27 = ((0.6d - (d18 * d18)) - (d19 * d19)) - (d20 * d20);
        if (d27 >= 0.0d) {
            double d28 = d27 * d27;
            dDot4 = d28 * d28 * dot(grad3[i16], d18, d19, d20);
        }
        return (dDot + dDot2 + dDot3 + dDot4) * 32.0d;
    }

    public static final double simplexNoise(double d2, double d4, double d5, double d6) {
        int i2;
        int i3;
        int i5;
        int i7;
        double dDot;
        double dDot2;
        double dDot3;
        double dDot4;
        double d7 = (d2 + d4 + d5 + d6) * F4;
        int iFastfloor = fastfloor(d2 + d7);
        int iFastfloor2 = fastfloor(d4 + d7);
        int iFastfloor3 = fastfloor(d5 + d7);
        int iFastfloor4 = fastfloor(d6 + d7);
        double d8 = G4;
        double d9 = ((double) (iFastfloor + iFastfloor2 + iFastfloor3 + iFastfloor4)) * d8;
        double d10 = d2 - (((double) iFastfloor) - d9);
        double d11 = d4 - (((double) iFastfloor2) - d9);
        double d12 = d5 - (((double) iFastfloor3) - d9);
        double d13 = d6 - (((double) iFastfloor4) - d9);
        if (d10 > d11) {
            i3 = 1;
            i2 = 0;
        } else {
            i2 = 1;
            i3 = 0;
        }
        if (d10 > d12) {
            i3++;
            i5 = 0;
        } else {
            i5 = 1;
        }
        if (d10 > d13) {
            i3++;
            i7 = 0;
        } else {
            i7 = 1;
        }
        if (d11 > d12) {
            i2++;
        } else {
            i5++;
        }
        if (d11 > d13) {
            i2++;
        } else {
            i7++;
        }
        if (d12 > d13) {
            i5++;
        } else {
            i7++;
        }
        int i8 = i3 >= 3 ? 1 : 0;
        int i9 = i2 >= 3 ? 1 : 0;
        int i10 = i5 >= 3 ? 1 : 0;
        int i11 = i7 >= 3 ? 1 : 0;
        int i12 = i3 >= 2 ? 1 : 0;
        int i13 = i2 >= 2 ? 1 : 0;
        int i14 = i5 >= 2 ? 1 : 0;
        int i15 = i7 >= 2 ? 1 : 0;
        int i16 = i3 >= 1 ? 1 : 0;
        int i17 = i2 >= 1 ? 1 : 0;
        int i18 = i5 >= 1 ? 1 : 0;
        int i19 = i7 >= 1 ? 1 : 0;
        int i20 = i15;
        double d14 = (d10 - ((double) i8)) + d8;
        double d15 = (d11 - ((double) i9)) + d8;
        double d16 = (d12 - ((double) i10)) + d8;
        double d17 = (d13 - ((double) i11)) + d8;
        int i21 = i12;
        double d18 = (d10 - ((double) i21)) + (d8 * 2.0d);
        int i22 = i13;
        double d19 = (d11 - ((double) i22)) + (d8 * 2.0d);
        int i23 = i14;
        double d20 = (d12 - ((double) i23)) + (d8 * 2.0d);
        double d21 = (d13 - ((double) i20)) + (d8 * 2.0d);
        double d22 = (d10 - ((double) i16)) + (d8 * 3.0d);
        double d23 = (d11 - ((double) i17)) + (d8 * 3.0d);
        double d24 = (d12 - ((double) i18)) + (d8 * 3.0d);
        double d25 = (d13 - ((double) i19)) + (3.0d * d8);
        double d26 = (d10 - 1.0d) + (d8 * 4.0d);
        double d27 = (d11 - 1.0d) + (d8 * 4.0d);
        double d28 = (d12 - 1.0d) + (d8 * 4.0d);
        double d29 = (d13 - 1.0d) + (d8 * 4.0d);
        int i24 = iFastfloor & 255;
        int i25 = iFastfloor2 & 255;
        int i26 = iFastfloor3 & 255;
        int i27 = iFastfloor4 & 255;
        int[] iArr = perm;
        int i28 = iArr[iArr[iArr[iArr[i27] + i26] + i25] + i24] % 32;
        int i29 = iArr[(i8 + i24) + iArr[(i9 + i25) + iArr[(i10 + i26) + iArr[i11 + i27]]]] % 32;
        int i30 = iArr[(i21 + i24) + iArr[(i25 + i22) + iArr[(i26 + i23) + iArr[i20 + i27]]]] % 32;
        int i31 = iArr[(i16 + i24) + iArr[(i17 + i25) + iArr[(i18 + i26) + iArr[i19 + i27]]]] % 32;
        int i32 = iArr[(i24 + 1) + iArr[(i25 + 1) + iArr[(i26 + 1) + iArr[i27 + 1]]]] % 32;
        double d30 = (((0.6d - (d10 * d10)) - (d11 * d11)) - (d12 * d12)) - (d13 * d13);
        double dDot5 = 0.0d;
        if (d30 < 0.0d) {
            dDot = 0.0d;
        } else {
            double d31 = d30 * d30;
            dDot = d31 * d31 * dot(grad4[i28], d10, d11, d12, d13);
        }
        double d32 = (((0.6d - (d14 * d14)) - (d15 * d15)) - (d16 * d16)) - (d17 * d17);
        if (d32 < 0.0d) {
            dDot2 = 0.0d;
        } else {
            double d33 = d32 * d32;
            dDot2 = d33 * d33 * dot(grad4[i29], d14, d15, d16, d17);
        }
        double d34 = (((0.6d - (d18 * d18)) - (d19 * d19)) - (d20 * d20)) - (d21 * d21);
        if (d34 < 0.0d) {
            dDot3 = 0.0d;
        } else {
            double d35 = d34 * d34;
            dDot3 = d35 * d35 * dot(grad4[i30], d18, d19, d20, d21);
        }
        double d36 = (((0.6d - (d22 * d22)) - (d23 * d23)) - (d24 * d24)) - (d25 * d25);
        if (d36 < 0.0d) {
            dDot4 = 0.0d;
        } else {
            double d37 = d36 * d36;
            dDot4 = d37 * d37 * dot(grad4[i31], d22, d23, d24, d25);
        }
        double d38 = (((0.6d - (d26 * d26)) - (d27 * d27)) - (d28 * d28)) - (d29 * d29);
        if (d38 >= 0.0d) {
            double d39 = d38 * d38;
            dDot5 = d39 * d39 * dot(grad4[i32], d26, d27, d28, d29);
        }
        return (dDot + dDot2 + dDot3 + dDot4 + dDot5) * 27.0d;
    }
}
