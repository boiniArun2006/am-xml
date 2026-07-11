package jc;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import jc.Ln;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class u extends n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Ln f69512n;
    private final Integer nr;
    private final nri.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final nri.j f69513t;

    public static u n(Ln.j jVar, nri.n nVar, Integer num) throws GeneralSecurityException {
        Ln.j jVar2 = Ln.j.nr;
        if (jVar != jVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + jVar + " the value of idRequirement must be non-null");
        }
        if (jVar == jVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (nVar.rl() == 32) {
            Ln lnN = Ln.n(jVar);
            return new u(lnN, nVar, rl(lnN, num), num);
        }
        throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + nVar.rl());
    }

    private u(Ln ln2, nri.n nVar, nri.j jVar, Integer num) {
        this.f69512n = ln2;
        this.rl = nVar;
        this.f69513t = jVar;
        this.nr = num;
    }

    private static nri.j rl(Ln ln2, Integer num) {
        if (ln2.rl() == Ln.j.nr) {
            return nri.j.n(new byte[0]);
        }
        if (ln2.rl() == Ln.j.f69465t) {
            return nri.j.n(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        }
        if (ln2.rl() == Ln.j.rl) {
            return nri.j.n(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        throw new IllegalStateException("Unknown Variant: " + ln2.rl());
    }
}
