package gAe;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.rv6;
import gX.Ml;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
class Dsr implements fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final gX.Ml f67133n;
    private final Class rl;

    private static class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Ml.j f67134n;

        private rv6 rl(rv6 rv6Var) {
            this.f67134n.O(rv6Var);
            return this.f67134n.n(rv6Var);
        }

        rv6 n(com.google.crypto.tink.shaded.protobuf.fuX fux) {
            return rl(this.f67134n.nr(fux));
        }

        j(Ml.j jVar) {
            this.f67134n = jVar;
        }
    }

    private Object J2(rv6 rv6Var) throws GeneralSecurityException {
        if (Void.class.equals(this.rl)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.f67133n.mUb(rv6Var);
        return this.f67133n.O(rv6Var, this.rl);
    }

    private j O() {
        return new j(this.f67133n.J2());
    }

    @Override // gAe.fuX
    public final String rl() {
        return this.f67133n.nr();
    }

    @Override // gAe.fuX
    public final Object t(com.google.crypto.tink.shaded.protobuf.fuX fux) throws GeneralSecurityException {
        try {
            return J2(this.f67133n.KN(fux));
        } catch (InvalidProtocolBufferException e2) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f67133n.t().getName(), e2);
        }
    }

    public Dsr(gX.Ml ml, Class cls) {
        if (!ml.xMQ().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", ml.toString(), cls.getName()));
        }
        this.f67133n = ml;
        this.rl = cls;
    }

    @Override // gAe.fuX
    public final uBO.SPz n(com.google.crypto.tink.shaded.protobuf.fuX fux) throws GeneralSecurityException {
        try {
            return (uBO.SPz) uBO.SPz.E().ty(rl()).HI(O().n(fux).toByteString()).az(this.f67133n.Uo()).t();
        } catch (InvalidProtocolBufferException e2) {
            throw new GeneralSecurityException("Unexpected proto", e2);
        }
    }

    @Override // gAe.fuX
    public final rv6 nr(com.google.crypto.tink.shaded.protobuf.fuX fux) throws GeneralSecurityException {
        try {
            return O().n(fux);
        } catch (InvalidProtocolBufferException e2) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f67133n.J2().rl().getName(), e2);
        }
    }
}
