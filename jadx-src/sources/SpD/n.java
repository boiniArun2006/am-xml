package SpD;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class n {
    public static final Map n(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return MapsKt.mapOf(TuplesKt.to("android_id", jVar.rl()), TuplesKt.to("aaid", jVar.n()), TuplesKt.to("app_set_id", jVar.t()), TuplesKt.to("backup_persistent_id", jVar.nr()), TuplesKt.to("non_backup_persistent_id", jVar.O()));
    }
}
