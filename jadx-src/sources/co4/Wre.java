package co4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Wre extends fuX {
    private final q6b.I28 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final stX.eO f43849t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wre(List formats) {
        super(formats);
        Intrinsics.checkNotNullParameter(formats, "formats");
        this.rl = super.n();
        this.f43849t = super.rl();
    }

    @Override // co4.fuX, co4.Xo
    public q6b.I28 n() {
        return this.rl;
    }

    @Override // co4.fuX, co4.Xo
    public stX.eO rl() {
        return this.f43849t;
    }
}
