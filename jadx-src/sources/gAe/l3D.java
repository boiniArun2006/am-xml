package gAe;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class l3D {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final CopyOnWriteArrayList f67156n = new CopyOnWriteArrayList();

    public static QJ n(String str) throws GeneralSecurityException {
        for (QJ qj : f67156n) {
            if (qj.n(str)) {
                return qj;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}
