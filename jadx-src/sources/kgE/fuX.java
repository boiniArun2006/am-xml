package kgE;

import ScC.FuwU.pTYaLzzmJSGAPQ;
import android.app.Activity;
import com.alightcreative.account.IAPItemType;
import com.google.firebase.auth.FirebaseAuth;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface fuX {

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public static final class j {
        public static /* synthetic */ void n(fuX fux, List list, IAPItemType iAPItemType, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(pTYaLzzmJSGAPQ.QgQVZ);
            }
            if ((i2 & 2) != 0) {
                iAPItemType = IAPItemType.Subscription;
            }
            fux.J2(list, iAPItemType);
        }
    }

    void HI(Activity activity);

    List Ik();

    void J2(List list, IAPItemType iAPItemType);

    void KN();

    void O(FirebaseAuth firebaseAuth);

    void S();

    Set Uo();

    TFv.rv6 WPU();

    TFv.rv6 XQ();

    TFv.rv6 Z();

    long az();

    TFv.rv6 ck();

    String getUid();

    boolean gh();

    void mUb();

    void n();

    TFv.rv6 nr();

    TFv.rv6 o();

    void qie();

    Object r(Continuation continuation);

    boolean rl();

    void t();

    void ty();

    void xMQ();
}
