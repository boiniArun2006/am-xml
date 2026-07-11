package wtO;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface n {

    public static final class j {
        public static /* synthetic */ Object n(n nVar, String str, Long l2, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i2 & 2) != 0) {
                l2 = null;
            }
            return nVar.n(str, l2, continuation);
        }
    }

    Object n(String str, Long l2, Continuation continuation);

    void rl(String str, String str2);
}
