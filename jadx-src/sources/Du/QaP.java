package Du;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class QaP extends dT {
    protected abstract String Nxk(String str, String str2);

    protected String Y(EJn.Wre descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return descriptor.O(i2);
    }

    protected final String dR0(String nestedName) {
        Intrinsics.checkNotNullParameter(nestedName, "nestedName");
        String str = (String) B();
        if (str == null) {
            str = "";
        }
        return Nxk(str, nestedName);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.dT
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final String J(EJn.Wre wre, int i2) {
        Intrinsics.checkNotNullParameter(wre, "<this>");
        return dR0(Y(wre, i2));
    }

    protected final String z() {
        if (D().isEmpty()) {
            return "$";
        }
        return CollectionsKt.joinToString$default(D(), ".", "$.", null, 0, null, null, 60, null);
    }
}
