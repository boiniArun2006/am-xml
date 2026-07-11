package HI0;

import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class xZD implements mz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function0 f3884n;
    private Object rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private WeakReference f3885t;

    @Override // HI0.mz
    public void reset() {
        this.rl = null;
    }

    public xZD(OU manager, Function0 init) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(init, "init");
        this.f3884n = init;
        manager.n(this);
    }

    public final Object n(Object obj, KProperty property) {
        Intrinsics.checkNotNullParameter(property, "property");
        Object obj2 = this.rl;
        if (obj2 != null) {
            return obj2;
        }
        WeakReference weakReference = this.f3885t;
        Object obj3 = weakReference != null ? weakReference.get() : null;
        if (obj3 != null) {
            this.rl = obj3;
            return obj3;
        }
        Object objInvoke = this.f3884n.invoke();
        this.rl = objInvoke;
        this.f3885t = new WeakReference(objInvoke);
        return objInvoke;
    }
}
