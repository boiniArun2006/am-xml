package guf;

import cA.I28;
import cA.Ml;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class j implements CU.n {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final v8.j f67875O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function0 f67876n;
    private final Ml nr;
    private final Function0 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Function2 f67877t;

    public j(Function0 idProvider, Function0 timestampProvider, Function2 eventConverter, Ml deviceInfoProvider, v8.j localLogger) {
        Intrinsics.checkNotNullParameter(idProvider, "idProvider");
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        Intrinsics.checkNotNullParameter(eventConverter, "eventConverter");
        Intrinsics.checkNotNullParameter(deviceInfoProvider, "deviceInfoProvider");
        Intrinsics.checkNotNullParameter(localLogger, "localLogger");
        this.f67876n = idProvider;
        this.rl = timestampProvider;
        this.f67877t = eventConverter;
        this.nr = deviceInfoProvider;
        this.f67875O = localLogger;
    }

    @Override // CU.n
    public CU.j n(I28 eventDeposit) {
        Intrinsics.checkNotNullParameter(eventDeposit, "eventDeposit");
        return new w6(this.f67876n, this.rl, this.nr, this.f67877t, eventDeposit, this.f67875O);
    }
}
