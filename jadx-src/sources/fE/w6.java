package fE;

import OS.InterfaceC1422c;
import android.app.Activity;
import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface w6 {

    public static final class j {
        public static /* synthetic */ void n(w6 w6Var, InterfaceC1422c interfaceC1422c, com.android.billingclient.api.j jVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setup");
            }
            if ((i2 & 2) != 0) {
                jVar = null;
            }
            w6Var.KN(interfaceC1422c, jVar);
        }
    }

    Object J2(String str, Continuation continuation);

    void KN(InterfaceC1422c interfaceC1422c, com.android.billingclient.api.j jVar);

    Object O(List list, String str, Continuation continuation);

    Object Uo(String str, Continuation continuation);

    boolean isConnected();

    Object mUb(String str, Continuation continuation);

    Object n(String str, Continuation continuation);

    Object nr(Activity activity, String str, String str2, String str3, int i2, Continuation continuation);

    Object rl(Activity activity, String str, String str2, Continuation continuation);

    Object t(Continuation continuation);

    Object xMQ(Activity activity, String str, Continuation continuation);
}
