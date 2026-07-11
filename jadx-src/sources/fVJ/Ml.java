package fVJ;

import Q.Xo;
import kgE.K;
import kgE.fuX;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Ml implements w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final fuX f66905n;
    private final nYs.Ml rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Xo f66906t;

    public Ml(fuX iapManager, nYs.Ml getAlightSettingsUseCase, Xo rewardedAdUnlockUseCase) {
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        Intrinsics.checkNotNullParameter(getAlightSettingsUseCase, "getAlightSettingsUseCase");
        Intrinsics.checkNotNullParameter(rewardedAdUnlockUseCase, "rewardedAdUnlockUseCase");
        this.f66905n = iapManager;
        this.rl = getAlightSettingsUseCase;
        this.f66906t = rewardedAdUnlockUseCase;
    }

    private final boolean t(String str) {
        return this.f66905n.Uo().contains(K.f70079o) || this.f66906t.Uo(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    @Override // fVJ.w6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cBL.j n(String projectId) {
        boolean z2;
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        if (t(projectId)) {
            z2 = true;
        } else {
            nYs.j jVarInvoke = this.rl.invoke();
            if (!(jVarInvoke != null ? jVarInvoke.rV9() : false)) {
                z2 = false;
            }
        }
        nYs.j jVarInvoke2 = this.rl.invoke();
        return new cBL.j(z2, jVarInvoke2 != null ? jVarInvoke2.WPU() : false);
    }

    @Override // fVJ.w6
    public cBL.j rl(String projectId) {
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        boolean zT2 = t(projectId);
        nYs.j jVarInvoke = this.rl.invoke();
        return new cBL.j(zT2, jVarInvoke != null ? jVarInvoke.WPU() : false);
    }
}
