package ykH;

import gVA.n;
import hw.C2152Dsr;
import hw.InterfaceC2151CN3;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class w6 implements InterfaceC2151CN3 {
    private static final n.EnumC0945n rl = n.EnumC0945n.f67570t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C2152Dsr f76186n;

    public w6(C2152Dsr c2152Dsr) throws GeneralSecurityException {
        if (rl.n()) {
            this.f76186n = c2152Dsr;
            return;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
