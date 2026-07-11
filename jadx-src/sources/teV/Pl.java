package teV;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface Pl extends TFv.Wre {

    public static final class j {
        public static /* synthetic */ TFv.Wre n(Pl pl, CoroutineContext coroutineContext, int i2, ILs.j jVar, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i3 & 1) != 0) {
                coroutineContext = EmptyCoroutineContext.INSTANCE;
            }
            if ((i3 & 2) != 0) {
                i2 = -3;
            }
            if ((i3 & 4) != 0) {
                jVar = ILs.j.f4185n;
            }
            return pl.O(coroutineContext, i2, jVar);
        }
    }

    TFv.Wre O(CoroutineContext coroutineContext, int i2, ILs.j jVar);
}
