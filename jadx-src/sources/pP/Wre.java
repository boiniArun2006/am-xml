package pP;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public interface Wre {

    public static final class j {
        public static /* synthetic */ Object n(Wre wre, int i2, boolean z2, Continuation continuation, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTemplates");
            }
            if ((i3 & 2) != 0) {
                z2 = false;
            }
            return wre.O(i2, z2, continuation);
        }
    }

    TFv.Wre J2();

    TFv.Wre KN();

    Object O(int i2, boolean z2, Continuation continuation);

    TFv.Wre Uo();

    Object n(boolean z2, Continuation continuation);

    Object nr(String str, Continuation continuation);

    Object rl(String str, Continuation continuation);

    Object t(String str, Continuation continuation);
}
