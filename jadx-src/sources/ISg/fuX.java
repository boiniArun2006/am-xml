package ISg;

import com.safedk.android.analytics.brandsafety.b;
import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f4278n = new j();
    private static final int[] rl = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, 40, 41, 42, 7, 43, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 44, 8, 9, 45, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, b.f61769v, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final byte[] f4277t = {13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};
    private static final fuX nr = new fuX();

    private static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final j[] f4279n;
        private final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f4280t;

        j() {
            this.f4279n = new j[256];
            this.rl = 0;
            this.f4280t = 0;
        }

        j(int i2, int i3) {
            this.f4279n = null;
            this.rl = i2;
            int i5 = i3 & 7;
            this.f4280t = i5 == 0 ? 8 : i5;
        }
    }

    private void rl() {
        int i2 = 0;
        while (true) {
            byte[] bArr = f4277t;
            if (i2 >= bArr.length) {
                return;
            }
            n(i2, rl[i2], bArr[i2]);
            i2++;
        }
    }

    public static fuX J2() {
        return nr;
    }

    private void n(int i2, int i3, byte b2) {
        j jVar = new j(i2, b2);
        j jVar2 = this.f4278n;
        while (b2 > 8) {
            b2 = (byte) (b2 - 8);
            int i5 = (i3 >>> b2) & 255;
            if (jVar2.f4279n == null) {
                throw new IllegalStateException("invalid dictionary: prefix not unique");
            }
            if (jVar2.f4279n[i5] == null) {
                jVar2.f4279n[i5] = new j();
            }
            jVar2 = jVar2.f4279n[i5];
        }
        int i7 = 8 - b2;
        int i8 = (i3 << i7) & 255;
        int i9 = 1 << i7;
        for (int i10 = i8; i10 < i8 + i9; i10++) {
            jVar2.f4279n[i10] = jVar;
        }
    }

    int O(byte[] bArr) {
        long j2 = 0;
        for (byte b2 : bArr) {
            j2 += (long) f4277t[b2 & UByte.MAX_VALUE];
        }
        return (int) ((j2 + 7) >> 3);
    }

    void nr(byte[] bArr, OutputStream outputStream) throws IOException {
        long j2 = 0;
        int i2 = 0;
        for (byte b2 : bArr) {
            int i3 = b2 & UByte.MAX_VALUE;
            int i5 = rl[i3];
            byte b4 = f4277t[i3];
            j2 = (j2 << b4) | ((long) i5);
            i2 += b4;
            while (i2 >= 8) {
                i2 -= 8;
                outputStream.write((int) (j2 >> i2));
            }
        }
        if (i2 > 0) {
            outputStream.write((int) ((j2 << (8 - i2)) | ((long) (255 >>> i2))));
        }
    }

    byte[] t(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        j jVar = this.f4278n;
        int i2 = 0;
        int i3 = 0;
        for (byte b2 : bArr) {
            i2 = (i2 << 8) | (b2 & UByte.MAX_VALUE);
            i3 += 8;
            while (i3 >= 8) {
                jVar = jVar.f4279n[(i2 >>> (i3 - 8)) & 255];
                if (jVar.f4279n == null) {
                    byteArrayOutputStream.write(jVar.rl);
                    i3 -= jVar.f4280t;
                    jVar = this.f4278n;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            j jVar2 = jVar.f4279n[(i2 << (8 - i3)) & 255];
            if (jVar2.f4279n != null || jVar2.f4280t > i3) {
                break;
            }
            byteArrayOutputStream.write(jVar2.rl);
            i3 -= jVar2.f4280t;
            jVar = this.f4278n;
        }
        return byteArrayOutputStream.toByteArray();
    }

    private fuX() {
        rl();
    }
}
