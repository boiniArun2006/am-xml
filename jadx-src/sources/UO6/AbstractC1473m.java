package UO6;

import com.alightcreative.app.motion.persist.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: UO6.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class AbstractC1473m {
    public static final long n(w6 exportInfo, int i2, double d2) {
        Intrinsics.checkNotNullParameter(exportInfo, "exportInfo");
        return (long) ((((double) (exportInfo.J2() * exportInfo.O())) * (((double) (iF.n(i2, exportInfo.nr()) / 100)) * d2)) / 3);
    }

    public static final long rl(w6 exportInfo, int i2, double d2) {
        Intrinsics.checkNotNullParameter(exportInfo, "exportInfo");
        int iN = iF.n(i2, exportInfo.nr()) / 100;
        return (long) (exportInfo.t() == j.fuX.f45850n ? (((((long) (exportInfo.J2() * exportInfo.O())) * 4) * ((long) iN)) * d2) / 4 : ((((((long) (exportInfo.J2() * exportInfo.O())) * 3) * ((long) iN)) * d2) / ((double) (102 - exportInfo.n()))) / 3);
    }

    public static final long t(w6 exportInfo, int i2, int i3, int i5, double d2) {
        Intrinsics.checkNotNullParameter(exportInfo, "exportInfo");
        int iMin = Math.min(i2, i3);
        return (long) (((((long) n.n(((i2 * Ml.n(exportInfo)) / iMin) * ((i3 * Ml.n(exportInfo)) / iMin), iF.n(i5, exportInfo.nr()) / 100, exportInfo)) + (exportInfo.J2() * exportInfo.O() >= 840000 ? 196608L : exportInfo.J2() * exportInfo.O() >= 144000 ? 131072L : 24576L)) * d2) / ((double) 8));
    }
}
