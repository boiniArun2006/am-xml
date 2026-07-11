package S;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f8896n;
    private Function0 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Runnable f8897t = new Runnable() { // from class: S.j
        @Override // java.lang.Runnable
        public final void run() {
            n.rl(this.f8895n);
        }
    };

    public final void nr(Function0 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        w6.f8898n.removeCallbacks(this.f8897t);
        this.rl = action;
        w6.f8898n.postDelayed(this.f8897t, this.f8896n);
    }

    public n(long j2) {
        this.f8896n = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rl(n nVar) {
        nVar.t();
    }

    private final void t() {
        w6.f8898n.removeCallbacks(this.f8897t);
        Function0 function0 = this.rl;
        this.rl = null;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
