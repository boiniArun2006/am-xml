package bq4;

import com.safedk.android.analytics.brandsafety.b;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f43397n;
    private final int nr;
    private final int[] rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final n[] f43398t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final int[] f43396O = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};
    private static final w6[] J2 = n();

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f43399n;
        private final int rl;

        public int n() {
            return this.f43399n;
        }

        public int rl() {
            return this.rl;
        }

        j(int i2, int i3) {
            this.f43399n = i2;
            this.rl = i3;
        }
    }

    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f43400n;
        private final j[] rl;

        public j[] n() {
            return this.rl;
        }

        public int nr() {
            return this.f43400n * t();
        }

        public int rl() {
            return this.f43400n;
        }

        public int t() {
            int iN = 0;
            for (j jVar : this.rl) {
                iN += jVar.n();
            }
            return iN;
        }

        n(int i2, j... jVarArr) {
            this.f43400n = i2;
            this.rl = jVarArr;
        }
    }

    public static w6 O(int i2) {
        if (i2 < 1 || i2 > 40) {
            throw new IllegalArgumentException();
        }
        return J2[i2 - 1];
    }

    private static w6[] n() {
        return new w6[]{new w6(1, new int[0], new n(7, new j(1, 19)), new n(10, new j(1, 16)), new n(13, new j(1, 13)), new n(17, new j(1, 9))), new w6(2, new int[]{6, 18}, new n(10, new j(1, 34)), new n(16, new j(1, 28)), new n(22, new j(1, 22)), new n(28, new j(1, 16))), new w6(3, new int[]{6, 22}, new n(15, new j(1, 55)), new n(26, new j(1, 44)), new n(18, new j(2, 17)), new n(22, new j(2, 13))), new w6(4, new int[]{6, 26}, new n(20, new j(1, 80)), new n(18, new j(2, 32)), new n(26, new j(2, 24)), new n(16, new j(4, 9))), new w6(5, new int[]{6, 30}, new n(26, new j(1, 108)), new n(24, new j(2, 43)), new n(18, new j(2, 15), new j(2, 16)), new n(22, new j(2, 11), new j(2, 12))), new w6(6, new int[]{6, 34}, new n(18, new j(2, 68)), new n(16, new j(4, 27)), new n(24, new j(4, 19)), new n(28, new j(4, 15))), new w6(7, new int[]{6, 22, 38}, new n(20, new j(2, 78)), new n(18, new j(4, 31)), new n(18, new j(2, 14), new j(4, 15)), new n(26, new j(4, 13), new j(1, 14))), new w6(8, new int[]{6, 24, 42}, new n(24, new j(2, 97)), new n(22, new j(2, 38), new j(2, 39)), new n(22, new j(4, 18), new j(2, 19)), new n(26, new j(4, 14), new j(2, 15))), new w6(9, new int[]{6, 26, 46}, new n(30, new j(2, 116)), new n(22, new j(3, 36), new j(2, 37)), new n(20, new j(4, 16), new j(4, 17)), new n(24, new j(4, 12), new j(4, 13))), new w6(10, new int[]{6, 28, 50}, new n(18, new j(2, 68), new j(2, 69)), new n(26, new j(4, 43), new j(1, 44)), new n(24, new j(6, 19), new j(2, 20)), new n(28, new j(6, 15), new j(2, 16))), new w6(11, new int[]{6, 30, 54}, new n(20, new j(4, 81)), new n(30, new j(1, 50), new j(4, 51)), new n(28, new j(4, 22), new j(4, 23)), new n(24, new j(3, 12), new j(8, 13))), new w6(12, new int[]{6, 32, 58}, new n(24, new j(2, 92), new j(2, 93)), new n(22, new j(6, 36), new j(2, 37)), new n(26, new j(4, 20), new j(6, 21)), new n(28, new j(7, 14), new j(4, 15))), new w6(13, new int[]{6, 34, 62}, new n(26, new j(4, 107)), new n(22, new j(8, 37), new j(1, 38)), new n(24, new j(8, 20), new j(4, 21)), new n(22, new j(12, 11), new j(4, 12))), new w6(14, new int[]{6, 26, 46, 66}, new n(30, new j(3, 115), new j(1, 116)), new n(24, new j(4, 40), new j(5, 41)), new n(20, new j(11, 16), new j(5, 17)), new n(24, new j(11, 12), new j(5, 13))), new w6(15, new int[]{6, 26, 48, 70}, new n(22, new j(5, 87), new j(1, 88)), new n(24, new j(5, 41), new j(5, 42)), new n(30, new j(5, 24), new j(7, 25)), new n(24, new j(11, 12), new j(7, 13))), new w6(16, new int[]{6, 26, 50, 74}, new n(24, new j(5, 98), new j(1, 99)), new n(28, new j(7, 45), new j(3, 46)), new n(24, new j(15, 19), new j(2, 20)), new n(30, new j(3, 15), new j(13, 16))), new w6(17, new int[]{6, 30, 54, 78}, new n(28, new j(1, 107), new j(5, 108)), new n(28, new j(10, 46), new j(1, 47)), new n(28, new j(1, 22), new j(15, 23)), new n(28, new j(2, 14), new j(17, 15))), new w6(18, new int[]{6, 30, 56, 82}, new n(30, new j(5, b.f61769v), new j(1, Sdk.SDKError.Reason.TPAT_ERROR_VALUE)), new n(26, new j(9, 43), new j(4, 44)), new n(28, new j(17, 22), new j(1, 23)), new n(28, new j(2, 14), new j(19, 15))), new w6(19, new int[]{6, 30, 58, 86}, new n(28, new j(3, 113), new j(4, 114)), new n(26, new j(3, 44), new j(11, 45)), new n(26, new j(17, 21), new j(4, 22)), new n(26, new j(9, 13), new j(16, 14))), new w6(20, new int[]{6, 34, 62, 90}, new n(28, new j(3, 107), new j(5, 108)), new n(26, new j(3, 41), new j(13, 42)), new n(30, new j(15, 24), new j(5, 25)), new n(28, new j(15, 15), new j(10, 16))), new w6(21, new int[]{6, 28, 50, 72, 94}, new n(28, new j(4, 116), new j(4, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE)), new n(26, new j(17, 42)), new n(28, new j(17, 22), new j(6, 23)), new n(30, new j(19, 16), new j(6, 17))), new w6(22, new int[]{6, 26, 50, 74, 98}, new n(28, new j(2, 111), new j(7, 112)), new n(28, new j(17, 46)), new n(30, new j(7, 24), new j(16, 25)), new n(24, new j(34, 13))), new w6(23, new int[]{6, 30, 54, 78, 102}, new n(30, new j(4, Sdk.SDKError.Reason.TPAT_ERROR_VALUE), new j(5, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE)), new n(28, new j(4, 47), new j(14, 48)), new n(30, new j(11, 24), new j(14, 25)), new n(30, new j(16, 15), new j(14, 16))), new w6(24, new int[]{6, 28, 54, 80, 106}, new n(30, new j(6, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE), new j(4, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE)), new n(28, new j(6, 45), new j(14, 46)), new n(30, new j(11, 24), new j(16, 25)), new n(30, new j(30, 16), new j(2, 17))), new w6(25, new int[]{6, 32, 58, 84, 110}, new n(26, new j(8, 106), new j(4, 107)), new n(28, new j(8, 47), new j(13, 48)), new n(30, new j(7, 24), new j(22, 25)), new n(30, new j(22, 15), new j(13, 16))), new w6(26, new int[]{6, 30, 58, 86, 114}, new n(28, new j(10, 114), new j(2, 115)), new n(28, new j(19, 46), new j(4, 47)), new n(28, new j(28, 22), new j(6, 23)), new n(30, new j(33, 16), new j(4, 17))), new w6(27, new int[]{6, 34, 62, 90, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE}, new n(30, new j(8, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), new j(4, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE)), new n(28, new j(22, 45), new j(3, 46)), new n(30, new j(8, 23), new j(26, 24)), new n(30, new j(12, 15), new j(28, 16))), new w6(28, new int[]{6, 26, 50, 74, 98, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE}, new n(30, new j(3, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE), new j(10, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE)), new n(28, new j(3, 45), new j(23, 46)), new n(30, new j(4, 24), new j(31, 25)), new n(30, new j(11, 15), new j(31, 16))), new w6(29, new int[]{6, 30, 54, 78, 102, 126}, new n(30, new j(7, 116), new j(7, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE)), new n(28, new j(21, 45), new j(7, 46)), new n(30, new j(1, 23), new j(37, 24)), new n(30, new j(19, 15), new j(26, 16))), new w6(30, new int[]{6, 26, 52, 78, 104, 130}, new n(30, new j(5, 115), new j(10, 116)), new n(28, new j(19, 47), new j(10, 48)), new n(30, new j(15, 24), new j(25, 25)), new n(30, new j(23, 15), new j(25, 16))), new w6(31, new int[]{6, 30, 56, 82, 108, 134}, new n(30, new j(13, 115), new j(3, 116)), new n(28, new j(2, 46), new j(29, 47)), new n(30, new j(42, 24), new j(1, 25)), new n(30, new j(23, 15), new j(28, 16))), new w6(32, new int[]{6, 34, 60, 86, 112, 138}, new n(30, new j(17, 115)), new n(28, new j(10, 46), new j(23, 47)), new n(30, new j(10, 24), new j(35, 25)), new n(30, new j(19, 15), new j(35, 16))), new w6(33, new int[]{6, 30, 58, 86, 114, 142}, new n(30, new j(17, 115), new j(1, 116)), new n(28, new j(14, 46), new j(21, 47)), new n(30, new j(29, 24), new j(19, 25)), new n(30, new j(11, 15), new j(46, 16))), new w6(34, new int[]{6, 34, 62, 90, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 146}, new n(30, new j(13, 115), new j(6, 116)), new n(28, new j(14, 46), new j(23, 47)), new n(30, new j(44, 24), new j(7, 25)), new n(30, new j(59, 16), new j(1, 17))), new w6(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new n(30, new j(12, Sdk.SDKError.Reason.TPAT_ERROR_VALUE), new j(7, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE)), new n(28, new j(12, 47), new j(26, 48)), new n(30, new j(39, 24), new j(14, 25)), new n(30, new j(22, 15), new j(41, 16))), new w6(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new n(30, new j(6, Sdk.SDKError.Reason.TPAT_ERROR_VALUE), new j(14, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE)), new n(28, new j(6, 47), new j(34, 48)), new n(30, new j(46, 24), new j(10, 25)), new n(30, new j(2, 15), new j(64, 16))), new w6(37, new int[]{6, 28, 54, 80, 106, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 158}, new n(30, new j(17, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), new j(4, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE)), new n(28, new j(29, 46), new j(14, 47)), new n(30, new j(49, 24), new j(10, 25)), new n(30, new j(24, 15), new j(46, 16))), new w6(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new n(30, new j(4, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), new j(18, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE)), new n(28, new j(13, 46), new j(32, 47)), new n(30, new j(48, 24), new j(14, 25)), new n(30, new j(42, 15), new j(32, 16))), new w6(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new n(30, new j(20, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE), new j(4, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE)), new n(28, new j(40, 47), new j(7, 48)), new n(30, new j(43, 24), new j(22, 25)), new n(30, new j(10, 15), new j(67, 16))), new w6(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new n(30, new j(19, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE), new j(6, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE)), new n(28, new j(18, 47), new j(31, 48)), new n(30, new j(34, 24), new j(34, 25)), new n(30, new j(20, 15), new j(61, 16)))};
    }

    public int J2() {
        return this.f43397n;
    }

    public int nr() {
        return this.nr;
    }

    public int rl() {
        return (this.f43397n * 4) + 17;
    }

    public n t(bq4.j jVar) {
        return this.f43398t[jVar.ordinal()];
    }

    public String toString() {
        return String.valueOf(this.f43397n);
    }

    private w6(int i2, int[] iArr, n... nVarArr) {
        this.f43397n = i2;
        this.rl = iArr;
        this.f43398t = nVarArr;
        int iRl = nVarArr[0].rl();
        int iN = 0;
        for (j jVar : nVarArr[0].n()) {
            iN += jVar.n() * (jVar.rl() + iRl);
        }
        this.nr = iN;
    }
}
