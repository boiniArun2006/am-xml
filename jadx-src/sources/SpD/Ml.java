package SpD;

import com.google.firebase.installations.ktx.Bq.YjqZUJsVmhcjko;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class Ml {
    public static final pq.Ml n(w6 w6Var) {
        Intrinsics.checkNotNullParameter(w6Var, "<this>");
        pq.Ml ml = new pq.Ml();
        ml.O("app_version", w6Var.n());
        ml.O(YjqZUJsVmhcjko.lswoB, w6Var.rl());
        ml.O("country", w6Var.t());
        ml.O("device_android_version", w6Var.nr());
        ml.O("device_language", w6Var.O());
        ml.O("device_model", w6Var.J2());
        ml.O("device_os_build_id", w6Var.Uo());
        ml.O("device_os_version_release", w6Var.KN());
        ml.O("device_platform", w6Var.xMQ());
        ml.O("device_screen_size", w6Var.mUb());
        ml.O("locale", w6Var.gh());
        ml.O("sdk_version", w6Var.qie());
        ml.O("session_id", w6Var.az());
        ml.KN("timezone_daylight_saving", w6Var.ty());
        ml.O("timezone_name", w6Var.HI());
        ml.nr("timezone_seconds", Integer.valueOf(w6Var.ck()));
        return ml;
    }
}
