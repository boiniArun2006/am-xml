package dzu;

import kotlin.text.StringsKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract /* synthetic */ class qf {
    public static final int n(String str, int i2, int i3, int i5) {
        return (int) DAz.t(str, i2, i3, i5);
    }

    public static /* synthetic */ long J2(String str, long j2, long j3, long j4, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j3 = 1;
        }
        long j5 = j3;
        if ((i2 & 8) != 0) {
            j4 = Long.MAX_VALUE;
        }
        return DAz.t(str, j2, j5, j4);
    }

    public static /* synthetic */ int O(String str, int i2, int i3, int i5, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            i3 = 1;
        }
        if ((i7 & 8) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        return DAz.rl(str, i2, i3, i5);
    }

    public static final boolean nr(String str, boolean z2) {
        String strNr = DAz.nr(str);
        if (strNr != null) {
            return Boolean.parseBoolean(strNr);
        }
        return z2;
    }

    public static final long rl(String str, long j2, long j3, long j4) {
        String strNr = DAz.nr(str);
        if (strNr == null) {
            return j2;
        }
        Long longOrNull = StringsKt.toLongOrNull(strNr);
        if (longOrNull != null) {
            long jLongValue = longOrNull.longValue();
            if (j3 <= jLongValue && jLongValue <= j4) {
                return jLongValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j3 + ".." + j4 + ", but is '" + jLongValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strNr + '\'').toString());
    }

    public static final String t(String str, String str2) {
        String strNr = DAz.nr(str);
        if (strNr == null) {
            return str2;
        }
        return strNr;
    }
}
