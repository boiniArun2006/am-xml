package GJW;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface qz extends U4 {

    public static final class j implements qz {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Function1 f3505n;

        @Override // GJW.qz
        public void n(Throwable th) {
            this.f3505n.invoke(th);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + psW.n(this.f3505n) + '@' + psW.rl(this) + ']';
        }

        public j(Function1 function1) {
            this.f3505n = function1;
        }
    }

    void n(Throwable th);
}
