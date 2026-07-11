package ICC;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class aC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Map f4089n = new LinkedHashMap();

    public static final long n(Uri uri, long j2, long j3) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Map map = f4089n;
        synchronized (map) {
            TreeMap treeMap = (TreeMap) map.get(uri);
            if (treeMap == null) {
                return -1L;
            }
            Map.Entry entryFloorEntry = treeMap.floorEntry(Long.valueOf(j2));
            if (entryFloorEntry == null) {
                return -1L;
            }
            Long l2 = (Long) entryFloorEntry.getValue();
            if (l2.longValue() < j2 - j3) {
                return -1L;
            }
            Intrinsics.checkNotNull(l2);
            return l2.longValue();
        }
    }

    public static /* synthetic */ long rl(Uri uri, long j2, long j3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j3 = 0;
        }
        return n(uri, j2, j3);
    }
}
