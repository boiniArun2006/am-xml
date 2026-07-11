package UO6;

import com.alightcreative.app.motion.persist.j;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ArrayList f10689n = CollectionsKt.arrayListOf(new j(2160, 8.0d, 32.0d, 40.0d, 64.0d, 80.0d), new j(1440, 4.0d, 14.0d, 16.0d, 24.0d, 32.0d), new j(1080, 1.0d, 6.0d, 8.0d, 12.0d, 25.0d), new j(720, 0.75d, 4.0d, 5.0d, 8.0d, 16.0d), new j(540, 0.5d, 3.0d, 3.5d, 5.0d, 8.0d), new j(480, 0.4d, 2.0d, 2.5d, 3.0d, 4.0d), new j(360, 0.3d, 0.75d, 1.0d, 1.25d, 2.5d), new j(270, 0.2d, 0.6d, 0.75d, 1.0d, 2.0d), new j(180, 0.1d, 0.4d, 0.5d, 0.6d, 1.5d), new j(0, 0.1d, 0.4d, 0.5d, 0.6d, 1.5d));

    public static final int n(int i2, int i3, w6 videoExportInfo) {
        Intrinsics.checkNotNullParameter(videoExportInfo, "videoExportInfo");
        for (j jVar : f10689n) {
            if (i2 >= ((jVar.J2() * ((jVar.J2() * 16) / 9)) * 95) / 100) {
                double dN = ((double) videoExportInfo.n()) / 100.0d;
                return dN < 0.2d ? rl(0.0d, 0.2d, jVar.nr(), jVar.rl(), dN, i3, videoExportInfo.rl()) : dN < 0.5d ? rl(0.2d, 0.5d, jVar.rl(), jVar.O(), dN, i3, videoExportInfo.rl()) : dN < 0.8d ? rl(0.5d, 0.8d, jVar.O(), jVar.n(), dN, i3, videoExportInfo.rl()) : rl(0.8d, 1.0d, jVar.n(), jVar.t(), dN, i3, videoExportInfo.rl());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final int rl(double d2, double d4, double d5, double d6, double d7, int i2, j.Pl pl) {
        double d8;
        double d9 = d5 + ((d6 - d5) * (d7 < d2 ? 0.0d : d7 > d4 ? 1.0d : (d7 - d2) / (d4 - d2)));
        if (i2 < 40) {
            if (i2 < 10) {
                d9 *= 0.5d;
            } else {
                d8 = i2 <= 15 ? 0.75d : 1.5d;
            }
            if (pl == j.Pl.f45836t) {
                d9 *= 0.5d;
            }
            return MathKt.roundToInt(d9 * ((double) 1048576));
        }
        d9 *= d8;
        if (pl == j.Pl.f45836t) {
        }
        return MathKt.roundToInt(d9 * ((double) 1048576));
    }
}
