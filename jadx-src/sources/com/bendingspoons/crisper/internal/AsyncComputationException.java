package com.bendingspoons.crisper.internal;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/bendingspoons/crisper/internal/AsyncComputationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", MRAIDPresenter.ERROR, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", c.f62177j, "Ljava/lang/String;", "crisper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AsyncComputationException extends Exception {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String error;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AsyncComputationException) && Intrinsics.areEqual(this.error, ((AsyncComputationException) other).error);
    }

    public int hashCode() {
        return this.error.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "AsyncComputationException(error=" + this.error + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncComputationException(String error) {
        super("Async computation failed due to " + error);
        Intrinsics.checkNotNullParameter(error, "error");
        this.error = error;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getError() {
        return this.error;
    }
}
