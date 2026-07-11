package w9;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Wre {
    public static final Object n(Object obj, boolean z2, Function1 transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        return z2 ? transform.invoke(obj) : obj;
    }
}
