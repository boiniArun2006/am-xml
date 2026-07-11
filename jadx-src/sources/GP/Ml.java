package GP;

import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class Ml {
    public static final Wre J2(n nVar, int i2, int i3, boolean z2) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return new CN3(nVar, i2, i3, z2);
    }

    public static final byte[] O(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        byte[] bArr = new byte[8192];
        int i2 = 0;
        while (jVar.hasNext()) {
            if (i2 >= 8192) {
                Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(bArr, 16384), "copyOf(...)");
            }
            bArr[i2] = jVar.next();
            i2++;
        }
        if (i2 == 8192) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public static /* synthetic */ Wre Uo(n nVar, int i2, int i3, boolean z2, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i3 = 1;
        }
        if ((i5 & 4) != 0) {
            z2 = false;
        }
        return J2(nVar, i2, i3, z2);
    }

    public static final n n(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return new w6(sArr);
    }

    public static final n nr(Wre wre) {
        Intrinsics.checkNotNullParameter(wre, "<this>");
        return new fuX(wre);
    }

    public static final j rl(n nVar, Function1 transform) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new I28(nVar, transform);
    }

    public static final short t(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return (short) 0;
        }
        short s2 = sArr[0];
        int lastIndex = ArraysKt.getLastIndex(sArr);
        int i2 = 1;
        if (1 <= lastIndex) {
            while (true) {
                short s3 = sArr[i2];
                if (s2 < s3) {
                    s2 = s3;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        return s2;
    }
}
