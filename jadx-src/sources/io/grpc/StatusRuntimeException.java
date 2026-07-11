package io.grpc;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class StatusRuntimeException extends RuntimeException {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f68209O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SPz f68210n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final QJ f68211t;

    public StatusRuntimeException(SPz sPz) {
        this(sPz, null);
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this.f68209O ? super.fillInStackTrace() : this;
    }

    public StatusRuntimeException(SPz sPz, QJ qj) {
        this(sPz, qj, true);
    }

    public final SPz n() {
        return this.f68210n;
    }

    StatusRuntimeException(SPz sPz, QJ qj, boolean z2) {
        super(SPz.Uo(sPz), sPz.qie());
        this.f68210n = sPz;
        this.f68211t = qj;
        this.f68209O = z2;
        fillInStackTrace();
    }
}
