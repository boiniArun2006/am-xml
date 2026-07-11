package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.i;
import com.fyber.inneractive.sdk.network.t;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class InneractiveInfrastructureError extends InneractiveError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InneractiveErrorCode f53529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f53530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f53531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Exception f53532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f53533e;

    public InneractiveInfrastructureError(InneractiveErrorCode inneractiveErrorCode, i iVar) {
        this(inneractiveErrorCode, iVar, null);
    }

    public InneractiveInfrastructureError(InneractiveErrorCode inneractiveErrorCode, i iVar, Throwable th) {
        this.f53533e = new ArrayList();
        this.f53529a = inneractiveErrorCode;
        this.f53530b = iVar;
        this.f53531c = th;
    }

    public void addReportedError(t tVar) {
        this.f53533e.add(tVar);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveError
    public String description() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f53529a);
        if (this.f53531c != null) {
            sb.append(" : ");
            sb.append(this.f53531c);
        }
        return sb.toString();
    }

    public Throwable getCause() {
        Exception exc = this.f53532d;
        return exc == null ? this.f53531c : exc;
    }

    public InneractiveErrorCode getErrorCode() {
        return this.f53529a;
    }

    public i getFyberMarketplaceAdLoadFailureReason() {
        return this.f53530b;
    }

    public boolean isErrorAlreadyReported(t tVar) {
        return this.f53533e.contains(tVar);
    }

    public void setCause(Exception exc) {
        this.f53532d = exc;
    }
}
