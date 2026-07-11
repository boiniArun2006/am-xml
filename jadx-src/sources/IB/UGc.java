package IB;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class UGc {
    public static final Object n(s4 s4Var, Object key, Function0 defaultValue) {
        Intrinsics.checkNotNullParameter(s4Var, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Object objUo = s4Var.Uo(key);
        if (objUo != null) {
            return objUo;
        }
        Object objInvoke = defaultValue.invoke();
        s4Var.qie(key, objInvoke);
        return objInvoke;
    }
}
