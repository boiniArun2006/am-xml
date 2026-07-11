package gX;

import java.security.GeneralSecurityException;
import uBO.Ln;
import uBO.SPz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Xo implements z {
    private final Integer J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Ln f67593O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f67594n;
    private final SPz.w6 nr;
    private final nri.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final com.google.crypto.tink.shaded.protobuf.fuX f67595t;

    public static Xo rl(String str, com.google.crypto.tink.shaded.protobuf.fuX fux, SPz.w6 w6Var, Ln ln2, Integer num) throws GeneralSecurityException {
        if (ln2 == Ln.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new Xo(str, fux, w6Var, ln2, num);
    }

    public String J2() {
        return this.f67594n;
    }

    public Ln O() {
        return this.f67593O;
    }

    public com.google.crypto.tink.shaded.protobuf.fuX Uo() {
        return this.f67595t;
    }

    @Override // gX.z
    public nri.j n() {
        return this.rl;
    }

    public SPz.w6 nr() {
        return this.nr;
    }

    public Integer t() {
        return this.J2;
    }

    private Xo(String str, com.google.crypto.tink.shaded.protobuf.fuX fux, SPz.w6 w6Var, Ln ln2, Integer num) {
        this.f67594n = str;
        this.rl = l3D.O(str);
        this.f67595t = fux;
        this.nr = w6Var;
        this.f67593O = ln2;
        this.J2 = num;
    }
}
