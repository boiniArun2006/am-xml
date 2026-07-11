package YV;

import android.app.Activity;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface aC {

    public static final class j {
        public static /* synthetic */ Object n(aC aCVar, Activity activity, String str, z zVar, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: purchaseOneTimeProduct");
            }
            if ((i2 & 4) != 0) {
                zVar = null;
            }
            return aCVar.xMQ(activity, str, zVar, continuation);
        }
    }

    TFv.Wre rl();

    Object xMQ(Activity activity, String str, z zVar, Continuation continuation);
}
