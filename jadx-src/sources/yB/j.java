package yB;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public interface j {

    /* JADX INFO: renamed from: yB.j$j, reason: collision with other inner class name */
    public static final class C1281j {
        public static /* synthetic */ Object n(j jVar, Object obj, Continuation continuation, int i2, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
            }
            if ((i2 & 1) != 0) {
                obj = null;
            }
            return jVar.Z(obj, continuation);
        }

        public static /* synthetic */ boolean rl(j jVar, Object obj, int i2, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
            }
            if ((i2 & 1) != 0) {
                obj = null;
            }
            return jVar.rl(obj);
        }

        public static /* synthetic */ void t(j jVar, Object obj, int i2, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i2 & 1) != 0) {
                obj = null;
            }
            jVar.T(obj);
        }
    }

    void T(Object obj);

    boolean Uo();

    Object Z(Object obj, Continuation continuation);

    boolean rl(Object obj);
}
