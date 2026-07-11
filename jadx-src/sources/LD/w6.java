package LD;

import DSG.Wre;
import LD.w6;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import bH.CN3;
import kgE.fuX;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class w6 implements mD.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CN3 f5928n;
    private final fuX rl;

    static final class j implements Function2 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ AppCompatActivity f5930t;

        j(AppCompatActivity appCompatActivity) {
            this.f5930t = appCompatActivity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(w6 w6Var, AppCompatActivity appCompatActivity, boolean z2) {
            com.alightcreative.app.motion.persist.j.INSTANCE.setForceFreeTrialEligibility(z2);
            w6Var.rl.mUb();
            Toast.makeText(appCompatActivity, (z2 ? "Forced" : "Disabled") + " free trial eligibility", 0).show();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            rl((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void rl(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1163325012, i2, -1, "com.alightcreative.monorepo.sercretmenu.internal.InstallSecretMenuUseCaseImpl.invoke.<anonymous> (InstallSecretMenuUseCaseImpl.kt:27)");
            }
            boolean forceFreeTrialEligibility = com.alightcreative.app.motion.persist.j.INSTANCE.getForceFreeTrialEligibility();
            composer.eF(476495718);
            boolean zE2 = composer.E2(w6.this) | composer.E2(this.f5930t);
            final w6 w6Var = w6.this;
            final AppCompatActivity appCompatActivity = this.f5930t;
            Object objIF = composer.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1() { // from class: LD.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return w6.j.t(w6Var, appCompatActivity, ((Boolean) obj).booleanValue());
                    }
                };
                composer.o(objIF);
            }
            composer.Xw();
            iyp.w6.t(forceFreeTrialEligibility, (Function1) objIF, composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    public w6(CN3 secretMenu, fuX iapManager) {
        Intrinsics.checkNotNullParameter(secretMenu, "secretMenu");
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        this.f5928n = secretMenu;
        this.rl = iapManager;
    }

    @Override // mD.j
    public void n(AppCompatActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f5928n.t(CN3.I28.f43224n, CollectionsKt.listOf((Object[]) new Wre[]{new Wre.n("Force Free Trial Eligibility", "🆓", null, ComposableLambdaKt.rl(-1163325012, true, new j(activity)), 4, null), new Wre.w6("Timed discounts testing", "⏲️", null, LD.j.f5924n.n(), 4, null)}));
        this.f5928n.J2(new CN3.Ml.n(activity, new CN3.Ml.j(4, 3, 0L, 0L, 12, null)));
    }
}
