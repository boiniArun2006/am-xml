package io.grpc;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class StatusException extends Exception {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f68206O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SPz f68207n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final QJ f68208t;

    public StatusException(SPz sPz) {
        this(sPz, null);
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this.f68206O ? super.fillInStackTrace() : this;
    }

    public StatusException(SPz sPz, QJ qj) {
        this(sPz, qj, true);
    }

    public final SPz n() {
        return this.f68207n;
    }

    StatusException(SPz sPz, QJ qj, boolean z2) {
        super(SPz.Uo(sPz), sPz.qie());
        this.f68207n = sPz;
        this.f68208t = qj;
        this.f68206O = z2;
        fillInStackTrace();
    }
}
