package fb;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: fb.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class AbstractC2109j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile Object f66975n;

    public final Object n(Function0 create) {
        Intrinsics.checkNotNullParameter(create, "create");
        Object obj = this.f66975n;
        if (obj != null) {
            return obj;
        }
        synchronized (this) {
            Object obj2 = this.f66975n;
            if (obj2 != null) {
                return obj2;
            }
            Object objInvoke = create.invoke();
            this.f66975n = objInvoke;
            return objInvoke;
        }
    }
}
