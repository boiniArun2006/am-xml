package j9w;

import androidx.media3.extractor.ts.TsExtractor;
import com.safedk.android.analytics.brandsafety.b;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f69327n = {5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};
    private static final int[][] rl = {new int[]{228, 48, 15, 111, 62}, new int[]{23, 68, 144, 134, 240, 92, 254}, new int[]{28, 24, 185, 166, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 248, 116, 255, 110, 61}, new int[]{175, 138, Sdk.SDKError.Reason.AD_IS_PLAYING_VALUE, 12, 194, 168, 39, 245, 60, 97, b.f61769v}, new int[]{41, 153, 158, 91, 61, 42, 142, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 97, 178, 100, 242}, new int[]{156, 97, 192, 252, 95, 9, 157, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 138, 45, 18, 186, 83, 185}, new int[]{83, 195, 100, 39, 188, 75, 66, 61, 241, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 109, 129, 94, 254, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 48, 90, 188}, new int[]{15, 195, 244, 9, 233, 71, 168, 2, 188, 160, 153, 145, 253, 79, 108, 82, 27, 174, 186, 172}, new int[]{52, 190, 88, Sdk.SDKError.Reason.AD_IS_PLAYING_VALUE, 109, 39, 176, 21, 155, 197, 251, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 155, 21, 5, 172, 254, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 12, 181, 184, 96, 50, 193}, new int[]{211, 231, 43, 97, 71, 96, 103, 174, 37, 151, 170, 53, 75, 34, 249, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 17, 138, 110, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 141, 136, b.f61769v, 151, 233, 168, 93, 255}, new int[]{245, 127, 242, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, 130, 250, 162, 181, 102, b.f61769v, 84, 179, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 251, 80, 182, 229, 18, 2, 4, 68, 33, 101, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 95, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 115, 44, 175, 184, 59, 25, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 98, 81, 112}, new int[]{77, 193, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 31, 19, 38, 22, 153, 247, 105, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 2, 245, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 242, 8, 175, 95, 100, 9, 167, 105, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 111, 57, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 21, 1, 253, 57, 54, 101, 248, Sdk.SDKError.Reason.AD_CONSUMED_VALUE, 69, 50, 150, 177, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 5, 9, 5}, new int[]{245, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 172, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 96, 32, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, 22, 238, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 238, 231, Sdk.SDKError.Reason.AD_IS_PLAYING_VALUE, 188, 237, 87, 191, 106, 16, 147, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 23, 37, 90, 170, Sdk.SDKError.Reason.AD_IS_PLAYING_VALUE, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 88, b.f61769v, 100, 66, 138, 186, 240, 82, 44, 176, 87, 187, 147, 160, 175, 69, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 92, 253, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 19}, new int[]{175, 9, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 238, 12, 17, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 100, 29, 175, 170, 230, 192, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 235, 150, 159, 36, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 38, 200, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 54, 228, 146, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, 234, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, Sdk.SDKError.Reason.AD_IS_LOADING_VALUE, 29, 232, 144, 238, 22, 150, 201, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, 62, Sdk.SDKError.Reason.PLACEMENT_AD_TYPE_MISMATCH_VALUE, 164, 13, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 245, 127, 67, 247, 28, 155, 43, Sdk.SDKError.Reason.AD_IS_LOADING_VALUE, 107, 233, 53, 143, 46}, new int[]{242, 93, 169, 50, 144, Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 39, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, Sdk.SDKError.Reason.AD_CONSUMED_VALUE, 188, 201, 189, 143, 108, 196, 37, 185, 112, 134, 230, 245, 63, 197, 190, 250, 106, 185, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, 175, 64, 114, 71, 161, 44, 147, 6, 27, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, 51, 63, 87, 10, 40, 130, 188, 17, 163, 31, 176, 170, 4, 107, 232, 7, 94, 166, 224, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 86, 47, 11, 204}, new int[]{Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 228, 173, 89, 251, 149, 159, 56, 89, 33, 147, 244, 154, 36, 73, 127, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 136, 248, 180, 234, 197, 158, 177, 68, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 93, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 15, 160, 227, 236, 66, TsExtractor.TS_STREAM_TYPE_DTS_UHD, 153, 185, Sdk.SDKError.Reason.AD_CONSUMED_VALUE, 167, 179, 25, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 232, 96, Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 231, 136, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 239, 181, 241, 59, 52, 172, 25, 49, 232, 211, 189, 64, 54, 108, 153, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 63, 96, 103, 82, 186}};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int[] f69328t = new int[256];
    private static final int[] nr = new int[255];

    private static String rl(CharSequence charSequence, int i2, int i3, int i5) {
        int i7;
        int i8;
        int i9 = 0;
        while (true) {
            int[] iArr = f69327n;
            if (i9 >= iArr.length) {
                i9 = -1;
                break;
            }
            if (iArr[i9] == i5) {
                break;
            }
            i9++;
        }
        if (i9 < 0) {
            throw new IllegalArgumentException("Illegal number of error correction codewords specified: ".concat(String.valueOf(i5)));
        }
        int[] iArr2 = rl[i9];
        char[] cArr = new char[i5];
        for (int i10 = 0; i10 < i5; i10++) {
            cArr[i10] = 0;
        }
        for (int i11 = i2; i11 < i2 + i3; i11++) {
            int i12 = i5 - 1;
            int iCharAt = cArr[i12] ^ charSequence.charAt(i11);
            while (i12 > 0) {
                if (iCharAt == 0 || (i8 = iArr2[i12]) == 0) {
                    cArr[i12] = cArr[i12 - 1];
                } else {
                    char c2 = cArr[i12 - 1];
                    int[] iArr3 = nr;
                    int[] iArr4 = f69328t;
                    cArr[i12] = (char) (iArr3[(iArr4[iCharAt] + iArr4[i8]) % 255] ^ c2);
                }
                i12--;
            }
            if (iCharAt == 0 || (i7 = iArr2[0]) == 0) {
                cArr[0] = 0;
            } else {
                int[] iArr5 = nr;
                int[] iArr6 = f69328t;
                cArr[0] = (char) iArr5[(iArr6[iCharAt] + iArr6[i7]) % 255];
            }
        }
        char[] cArr2 = new char[i5];
        for (int i13 = 0; i13 < i5; i13++) {
            cArr2[i13] = cArr[(i5 - i13) - 1];
        }
        return String.valueOf(cArr2);
    }

    static {
        int i2 = 1;
        for (int i3 = 0; i3 < 255; i3++) {
            nr[i3] = i2;
            f69328t[i2] = i3;
            i2 <<= 1;
            if (i2 >= 256) {
                i2 ^= Sdk.SDKError.Reason.MRAID_ERROR_VALUE;
            }
        }
    }

    private static String n(CharSequence charSequence, int i2) {
        return rl(charSequence, 0, charSequence.length(), i2);
    }

    public static String t(String str, C c2) {
        if (str.length() == c2.n()) {
            StringBuilder sb = new StringBuilder(c2.n() + c2.t());
            sb.append(str);
            int iJ2 = c2.J2();
            if (iJ2 == 1) {
                sb.append(n(str, c2.t()));
            } else {
                sb.setLength(sb.capacity());
                int[] iArr = new int[iJ2];
                int[] iArr2 = new int[iJ2];
                int[] iArr3 = new int[iJ2];
                int i2 = 0;
                while (i2 < iJ2) {
                    int i3 = i2 + 1;
                    iArr[i2] = c2.rl(i3);
                    iArr2[i2] = c2.nr(i3);
                    iArr3[i2] = 0;
                    if (i2 > 0) {
                        iArr3[i2] = iArr3[i2 - 1] + iArr[i2];
                    }
                    i2 = i3;
                }
                for (int i5 = 0; i5 < iJ2; i5++) {
                    StringBuilder sb2 = new StringBuilder(iArr[i5]);
                    for (int i7 = i5; i7 < c2.n(); i7 += iJ2) {
                        sb2.append(str.charAt(i7));
                    }
                    String strN = n(sb2.toString(), iArr2[i5]);
                    int i8 = i5;
                    int i9 = 0;
                    while (i8 < iArr2[i5] * iJ2) {
                        sb.setCharAt(c2.n() + i8, strN.charAt(i9));
                        i8 += iJ2;
                        i9++;
                    }
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
    }
}
