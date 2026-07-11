package YV;

import android.app.Activity;
import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface eO {

    public static final class j {
        public static /* synthetic */ Object n(eO eOVar, Activity activity, String str, String str2, Pl pl, KNH.I28 i28, z zVar, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: purchaseSubscription");
            }
            if ((i2 & 8) != 0) {
                pl = Pl.f12119r;
            }
            Pl pl3 = pl;
            if ((i2 & 16) != 0) {
                i28 = KNH.I28.f5293n;
            }
            KNH.I28 i282 = i28;
            if ((i2 & 32) != 0) {
                zVar = null;
            }
            return eOVar.J2(activity, str, str2, pl3, i282, zVar, continuation);
        }
    }

    Object J2(Activity activity, String str, String str2, Pl pl, KNH.I28 i28, z zVar, Continuation continuation);

    TFv.Wre O();

    TFv.Wre Uo();

    Object az(Continuation continuation);

    Object gh(String str, Continuation continuation);

    Object qie(List list, Continuation continuation);
}
