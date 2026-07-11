package gAe;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class SPz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final SPz f67142n = new SPz();

    static SPz n() {
        return f67142n;
    }

    public static SPz rl(SPz sPz) throws GeneralSecurityException {
        if (sPz != null) {
            return sPz;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }

    private SPz() {
    }
}
