package Zzk;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public interface j {

    /* JADX INFO: renamed from: Zzk.j$j, reason: collision with other inner class name */
    public static final class C0462j {
        public static /* synthetic */ Object n(j jVar, boolean z2, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i2 & 1) != 0) {
                z2 = false;
            }
            return jVar.n(z2, continuation);
        }
    }

    Object n(boolean z2, Continuation continuation);
}
