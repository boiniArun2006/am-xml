package com.alightcreative.onboarding.ui;

import JqP.C;
import QmE.iF;
import QmE.j;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.onboarding.ui.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0010¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u000fJ\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u000fJ!\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/alightcreative/onboarding/ui/w6;", "LuW/w6;", "LJqP/C;", "Lcom/alightcreative/onboarding/ui/I28;", "Lcom/alightcreative/onboarding/ui/n;", "LQmE/iF;", "eventLogger", "LnYs/Ml;", "getAlightSettingsUseCase", "LWK/n;", "getUriFromResource", "<init>", "(LQmE/iF;LnYs/Ml;LWK/n;)V", "", "ty", "()V", "Uo", "ck", "Ik", "", "resId", "Lx0X/n;", "Lga6/j;", "Landroid/net/Uri;", "HI", "(I)Lx0X/n;", "LQmE/iF;", "KN", "LWK/n;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w6 extends uW.w6 {

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final WK.n getUriFromResource;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final iF eventLogger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(iF eventLogger, nYs.Ml getAlightSettingsUseCase, WK.n getUriFromResource) {
        super(new Function1() { // from class: JqP.aC
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.alightcreative.onboarding.ui.w6.az((C) obj);
            }
        });
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(getAlightSettingsUseCase, "getAlightSettingsUseCase");
        Intrinsics.checkNotNullParameter(getUriFromResource, "getUriFromResource");
        this.eventLogger = eventLogger;
        this.getUriFromResource = getUriFromResource;
        nYs.j jVarInvoke = getAlightSettingsUseCase.invoke();
        mUb(new C(jVarInvoke != null ? jVarInvoke.M7() : false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final I28 az(C it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Ml.n(it);
    }

    private final void ty() {
        com.alightcreative.app.motion.persist.j.INSTANCE.setOnboardingCompletedOrSkipped(true);
        xMQ(n.j.f46898n);
    }

    public final x0X.n HI(int resId) {
        return this.getUriFromResource.rl(resId);
    }

    public final void Ik() {
        this.eventLogger.n(j.VoU.f8466n);
        ty();
    }

    @Override // uW.w6
    public void Uo() {
        this.eventLogger.n(j.s6u.f8571n);
    }

    public final void ck() {
        this.eventLogger.n(j.HcS.f8400n);
        ty();
    }
}
