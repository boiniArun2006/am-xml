package jc;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import jc.g9s;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class SPz extends n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final g9s f69474n;
    private final Integer nr;
    private final nri.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final nri.j f69475t;

    public static SPz n(g9s.j jVar, nri.n nVar, Integer num) throws GeneralSecurityException {
        g9s.j jVar2 = g9s.j.nr;
        if (jVar != jVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + jVar + " the value of idRequirement must be non-null");
        }
        if (jVar == jVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (nVar.rl() == 32) {
            g9s g9sVarN = g9s.n(jVar);
            return new SPz(g9sVarN, nVar, rl(g9sVarN, num), num);
        }
        throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + nVar.rl());
    }

    private SPz(g9s g9sVar, nri.n nVar, nri.j jVar, Integer num) {
        this.f69474n = g9sVar;
        this.rl = nVar;
        this.f69475t = jVar;
        this.nr = num;
    }

    private static nri.j rl(g9s g9sVar, Integer num) {
        if (g9sVar.rl() == g9s.j.nr) {
            return nri.j.n(new byte[0]);
        }
        if (g9sVar.rl() == g9s.j.f69493t) {
            return nri.j.n(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        }
        if (g9sVar.rl() == g9s.j.rl) {
            return nri.j.n(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        throw new IllegalStateException("Unknown Variant: " + g9sVar.rl());
    }
}
