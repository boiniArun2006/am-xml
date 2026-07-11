package bEC;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j implements fOK.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ase.j f43214n;

    public j(ase.j audioEncoderProvider) {
        Intrinsics.checkNotNullParameter(audioEncoderProvider, "audioEncoderProvider");
        this.f43214n = audioEncoderProvider;
    }

    @Override // fOK.j
    public LQ.j n(oC.n settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        return this.f43214n.n(settings);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ j(ase.j jVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new aUP.j(null, 1, 0 == true ? 1 : 0) : jVar);
    }
}
