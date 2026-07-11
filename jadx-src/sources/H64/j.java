package H64;

import LQ.j;
import fOK.CN3;
import k9w.Ml;
import k9w.n;
import k9w.w6;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oC.Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class j implements w6 {
    private final CN3 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final fOK.j f3792t;

    public j(CN3 videoParamsSupportChecker, fOK.j audioParamsSupportChecker) {
        Intrinsics.checkNotNullParameter(videoParamsSupportChecker, "videoParamsSupportChecker");
        Intrinsics.checkNotNullParameter(audioParamsSupportChecker, "audioParamsSupportChecker");
        this.rl = videoParamsSupportChecker;
        this.f3792t = audioParamsSupportChecker;
    }

    @Override // k9w.w6
    public n n(n settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        LQ.j jVarN = this.rl.n(Ml.J2(settings, false));
        if (jVarN instanceof j.n) {
            return null;
        }
        if (!(jVarN instanceof j.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        Wre wre = (Wre) ((j.w6) jVarN).n();
        LQ.j jVarN2 = this.f3792t.n(Ml.n(settings));
        if (jVarN2 instanceof j.n) {
            return null;
        }
        if (!(jVarN2 instanceof j.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        oC.n nVar = (oC.n) ((j.w6) jVarN2).n();
        return new n(new n.C1016n(wre.O(), wre.nr().rl(), wre.t(), null, 8, null), new n.j(nVar.O(), nVar.t(), null, 4, null));
    }

    public /* synthetic */ j(CN3 cn3, fOK.j jVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? UP.w6.n() : cn3, (i2 & 2) != 0 ? UP.j.n() : jVar);
    }
}
