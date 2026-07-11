package HI0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class OU {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f3828n = new ArrayList();

    public final boolean n(mz resettable) {
        boolean zAdd;
        Intrinsics.checkNotNullParameter(resettable, "resettable");
        synchronized (this.f3828n) {
            zAdd = this.f3828n.add(resettable);
        }
        return zAdd;
    }

    public final void rl() {
        synchronized (this.f3828n) {
            try {
                Iterator it = this.f3828n.iterator();
                while (it.hasNext()) {
                    ((mz) it.next()).reset();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
