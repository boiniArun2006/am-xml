package CHm;

import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class n {
    public static final boolean n(j jVar, Function2 predicate) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Map mapO = jVar.O();
        if (mapO.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : mapO.entrySet()) {
            if (!((Boolean) predicate.invoke(entry.getKey(), entry.getValue())).booleanValue()) {
                return false;
            }
        }
        return true;
    }
}
