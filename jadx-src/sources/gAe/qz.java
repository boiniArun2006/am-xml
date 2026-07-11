package gAe;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class qz {
    public static o n(String str) throws GeneralSecurityException {
        o oVar = (o) r.xMQ().get(str);
        if (oVar != null) {
            return oVar;
        }
        throw new GeneralSecurityException("cannot find key template: " + str);
    }
}
