package com.bendingspoons.picox.network.models;

import cO.j;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/bendingspoons/picox/network/models/NetworkException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "LcO/j;", MRAIDPresenter.ERROR, "", "message", "", "cause", "<init>", "(LcO/j;Ljava/lang/String;Ljava/lang/Throwable;)V", c.f62177j, "LcO/j;", "()LcO/j;", "picox_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NetworkException extends Exception {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final j error;

    public /* synthetic */ NetworkException(j jVar, String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkException(j error, String str, Throwable th) {
        super(str == null ? error.name() : str, th);
        Intrinsics.checkNotNullParameter(error, "error");
        this.error = error;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final j getError() {
        return this.error;
    }
}
