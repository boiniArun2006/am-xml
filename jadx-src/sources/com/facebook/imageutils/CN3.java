package com.facebook.imageutils;

import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final CN3 f52650n = new CN3();

    private final boolean t(int i2) {
        switch (i2) {
            case 192:
            case 193:
            case 194:
            case 195:
            case 197:
            case 198:
            case 199:
            case 201:
            case AD_CONSUMED_VALUE:
            case AD_IS_LOADING_VALUE:
            case AD_IS_PLAYING_VALUE:
            case AD_ALREADY_FAILED_VALUE:
            case PLACEMENT_AD_TYPE_MISMATCH_VALUE:
                return true;
            case 196:
            case 200:
            case 204:
            default:
                return false;
        }
    }

    public static final boolean O(InputStream inputStream, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        while (fuX.n(inputStream, 1, false) == 255) {
            int iN = 255;
            while (iN == 255) {
                iN = fuX.n(inputStream, 1, false);
            }
            if ((i2 == 192 && f52650n.t(iN)) || iN == i2) {
                return true;
            }
            if (iN != 1 && iN != 216) {
                if (iN == 217 || iN == 218) {
                    break;
                }
                inputStream.skip(fuX.n(inputStream, 2, false) - 2);
            }
        }
        return false;
    }

    private final int nr(InputStream inputStream) throws IOException {
        if (O(inputStream, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE)) {
            int iN = fuX.n(inputStream, 2, false);
            if (iN - 2 > 6) {
                int iN2 = fuX.n(inputStream, 4, false);
                int iN3 = fuX.n(inputStream, 2, false);
                int i2 = iN - 8;
                if (iN2 == 1165519206 && iN3 == 0) {
                    return i2;
                }
            }
        }
        return 0;
    }

    public static final int rl(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        try {
            int iNr = f52650n.nr(inputStream);
            if (iNr == 0) {
                return 0;
            }
            return Dsr.nr(inputStream, iNr);
        } catch (IOException unused) {
            return 0;
        }
    }

    private CN3() {
    }

    public static final int n(int i2) {
        return Dsr.n(i2);
    }
}
