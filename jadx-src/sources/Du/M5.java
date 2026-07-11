package Du;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class M5 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile SoftReference f1970n = new SoftReference(null);

    public final synchronized Object n(Function0 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Object obj = this.f1970n.get();
        if (obj != null) {
            return obj;
        }
        Object objInvoke = factory.invoke();
        this.f1970n = new SoftReference(objInvoke);
        return objInvoke;
    }
}
