package GJW;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class Z {
    private static final /* synthetic */ AtomicIntegerFieldUpdater rl = AtomicIntegerFieldUpdater.newUpdater(Z.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Throwable f3468n;

    public Z(Throwable th, boolean z2) {
        this.f3468n = th;
        this._handled$volatile = z2 ? 1 : 0;
    }

    public String toString() {
        return psW.n(this) + '[' + this.f3468n + ']';
    }

    public final boolean n() {
        if (rl.get(this) == 1) {
            return true;
        }
        return false;
    }

    public final boolean t() {
        return rl.compareAndSet(this, 0, 1);
    }

    public /* synthetic */ Z(Throwable th, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i2 & 2) != 0 ? false : z2);
    }
}
