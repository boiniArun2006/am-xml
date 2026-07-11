package SpD;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class CN3 {
    public static final pq.Ml n(Wre wre) {
        Intrinsics.checkNotNullParameter(wre, "<this>");
        pq.Ml ml = new pq.Ml();
        ml.O("ping_type", wre.J2().rl());
        if (wre.n() != null) {
            ml.O("backup_persistent_id_status", wre.n());
        }
        if (wre.t() != null) {
            ml.O("non_backup_persistent_id_status", wre.t());
        }
        if (wre.nr() != null) {
            ml.O("old_app_version", wre.nr());
        }
        if (wre.O() != null) {
            ml.O("old_bundle_version", wre.O());
        }
        ml.O("current_app_version", wre.rl());
        return ml;
    }
}
