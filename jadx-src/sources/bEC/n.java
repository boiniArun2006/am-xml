package bEC;

import aUP.Xo;
import ase.I28;
import fOK.CN3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oC.Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class n implements CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final I28 f43215n;

    public n(I28 videoEncoderProvider) {
        Intrinsics.checkNotNullParameter(videoEncoderProvider, "videoEncoderProvider");
        this.f43215n = videoEncoderProvider;
    }

    @Override // fOK.CN3
    public LQ.j n(Wre settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        return this.f43215n.t(settings);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ n(I28 i28, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new Xo(null, 1, 0 == true ? 1 : 0) : i28);
    }
}
