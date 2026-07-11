package M3;

import com.google.firebase.functions.FirebaseFunctionsException;
import ga6.j;
import java.io.IOException;
import java.net.UnknownHostException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class n {
    public static final j.n O(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        return th instanceof IllegalStateException ? j.n.f67625r : ((th instanceof UnknownHostException) || (th instanceof FirebaseFunctionsException)) ? j.n.J2 : th instanceof IOException ? j.n.f67621O : j.n.f67626t;
    }

    public static final x0X.n n(x0X.n nVar, j.w6 severity, j.EnumC0949j category, j.n nVar2, String str) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(category, "category");
        if (nVar instanceof n.C1266n) {
            return new n.C1266n(t((Throwable) ((n.C1266n) nVar).n(), severity, category, nVar2, str));
        }
        if (nVar instanceof n.w6) {
            return nVar;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ ga6.j nr(Throwable th, j.w6 w6Var, j.EnumC0949j enumC0949j, j.n nVar, String str, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            nVar = null;
        }
        if ((i2 & 8) != 0) {
            str = null;
        }
        return t(th, w6Var, enumC0949j, nVar, str);
    }

    public static /* synthetic */ x0X.n rl(x0X.n nVar, j.w6 w6Var, j.EnumC0949j enumC0949j, j.n nVar2, String str, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            nVar2 = null;
        }
        if ((i2 & 8) != 0) {
            str = null;
        }
        return n(nVar, w6Var, enumC0949j, nVar2, str);
    }

    public static final ga6.j t(Throwable th, j.w6 severity, j.EnumC0949j category, j.n nVar, String str) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(category, "category");
        return nVar != null ? new ga6.j(th, severity, category, nVar, str) : new ga6.j(th, severity, category, null, str, 8, null);
    }
}
