package ykH;

import gVA.n;
import hw.C2158j;
import hw.InterfaceC2151CN3;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class n implements InterfaceC2151CN3 {
    private static final n.EnumC0945n rl = n.EnumC0945n.f67569n;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C2158j f76185n;

    public n(C2158j c2158j) throws GeneralSecurityException {
        if (rl.n()) {
            this.f76185n = c2158j;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }
}
