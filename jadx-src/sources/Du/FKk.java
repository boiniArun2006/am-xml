package Du;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class FKk extends AZy {
    protected abstract String D(EJn.Wre wre, int i2);

    protected abstract String J(String str, String str2);

    protected final String I(String nestedName) {
        Intrinsics.checkNotNullParameter(nestedName, "nestedName");
        String str = (String) E();
        if (str == null) {
            str = "";
        }
        return J(str, nestedName);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.AZy
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String M(EJn.Wre wre, int i2) {
        Intrinsics.checkNotNullParameter(wre, "<this>");
        return I(D(wre, i2));
    }
}
