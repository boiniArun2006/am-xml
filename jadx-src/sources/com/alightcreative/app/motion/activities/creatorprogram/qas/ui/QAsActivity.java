package com.alightcreative.app.motion.activities.creatorprogram.qas.ui;

import HI0.lej;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.view.Lifecycle;
import androidx.view.LifecycleOwner;
import androidx.view.OnBackPressedCallback;
import androidx.view.ViewModelProvider;
import androidx.view.ViewModelStoreOwner;
import androidx.view.compose.ComponentActivityKt;
import androidx.view.viewmodel.compose.LocalViewModelStoreOwner;
import com.alightcreative.app.motion.activities.R6;
import com.alightcreative.app.motion.activities.creatorprogram.qas.ui.CN3;
import com.alightcreative.app.motion.activities.creatorprogram.qas.ui.QAsActivity;
import com.alightcreative.app.motion.activities.creatorprogram.qas.ui.fuX;
import com.alightcreative.app.motion.activities.creatorprogram.qas.ui.n;
import com.safedk.android.utils.Logger;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/alightcreative/app/motion/activities/creatorprogram/qas/ui/QAsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Lcom/alightcreative/app/motion/activities/creatorprogram/qas/ui/CN3;", "viewModel", "", "C", "(Lcom/alightcreative/app/motion/activities/creatorprogram/qas/ui/CN3;Landroidx/compose/runtime/Composer;I)V", "n1", "LF2p/Ml;", "Jk", "()LF2p/Ml;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/alightcreative/app/motion/activities/creatorprogram/qas/ui/CN3$n;", "r", "Lcom/alightcreative/app/motion/activities/creatorprogram/qas/ui/CN3$n;", "Rl", "()Lcom/alightcreative/app/motion/activities/creatorprogram/qas/ui/CN3$n;", "setViewModelFactory", "(Lcom/alightcreative/app/motion/activities/creatorprogram/qas/ui/CN3$n;)V", "viewModelFactory", "o", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nQAsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QAsActivity.kt\ncom/alightcreative/app/motion/activities/creatorprogram/qas/ui/QAsActivity\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,101:1\n1247#2,6:102\n*S KotlinDebug\n*F\n+ 1 QAsActivity.kt\ncom/alightcreative/app/motion/activities/creatorprogram/qas/ui/QAsActivity\n*L\n78#1:102,6\n*E\n"})
public final class QAsActivity extends j {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public CN3.n viewModelFactory;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final int f44946Z = 8;

    /* JADX INFO: renamed from: com.alightcreative.app.motion.activities.creatorprogram.qas.ui.QAsActivity$j, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p1 == null) {
                return;
            }
            p0.startActivity(p1);
        }

        private Companion() {
        }

        public final void n(Context context, F2p.Ml qaType) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(qaType, "qaType");
            Intent intent = new Intent(context, (Class<?>) QAsActivity.class);
            intent.putExtra("qa-type-extra", qaType);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
        }
    }

    static final class n implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ CN3 f44949n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ QAsActivity f44950t;

        n(CN3 cn3, QAsActivity qAsActivity) {
            this.f44949n = cn3;
            this.f44950t = qAsActivity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit J2(CN3 cn3, DialogInterface it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.dismiss();
            cn3.Ik();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Uo(QAsActivity qAsActivity, com.alightcreative.app.motion.activities.creatorprogram.qas.ui.n action) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (!Intrinsics.areEqual(action, n.j.f44958n)) {
                throw new NoWhenBranchMatchedException();
            }
            qAsActivity.n1();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            nr((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void nr(Composer composer, int i2) {
            Composer composer2;
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(822397597, i2, -1, "com.alightcreative.app.motion.activities.creatorprogram.qas.ui.QAsActivity.QAsScreen.<anonymous> (QAsActivity.kt:49)");
            }
            fuX fux = (fuX) LiveDataAdapterKt.n(this.f44949n.t(), composer, 0).getValue();
            if (fux instanceof fuX.j) {
                composer.eF(-327552964);
                fuX.j jVar = (fuX.j) fux;
                String strT = StringResources_androidKt.t(F2p.I28.rl(jVar.n()), composer, 0);
                String strT2 = StringResources_androidKt.t(F2p.I28.n(jVar.n()), composer, 0);
                List listKN = yUp.fuX.KN(jVar.rl());
                composer.eF(-1396029853);
                boolean zE2 = composer.E2(this.f44949n);
                final CN3 cn3 = this.f44949n;
                Object objIF = composer.iF();
                if (zE2 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function0() { // from class: com.alightcreative.app.motion.activities.creatorprogram.qas.ui.w6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return QAsActivity.n.O(cn3);
                        }
                    };
                    composer.o(objIF);
                }
                composer.Xw();
                composer2 = composer;
                yUp.fuX.nr(strT, strT2, listKN, (Function0) objIF, composer2, 0);
                composer2.Xw();
            } else {
                composer2 = composer;
                if (fux instanceof fuX.n) {
                    composer2.eF(-327129256);
                    R6 r6Nr = new R6(this.f44950t).mUb(2132019855).nr(2132019854);
                    composer2.eF(-1396017564);
                    boolean zE22 = composer2.E2(this.f44949n);
                    final CN3 cn32 = this.f44949n;
                    Object objIF2 = composer2.iF();
                    if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                        objIF2 = new Function1() { // from class: com.alightcreative.app.motion.activities.creatorprogram.qas.ui.Ml
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return QAsActivity.n.J2(cn32, (DialogInterface) obj);
                            }
                        };
                        composer2.o(objIF2);
                    }
                    composer2.Xw();
                    r6Nr.Uo(2132017378, (Function1) objIF2).gh();
                    composer2.Xw();
                } else {
                    composer2.eF(-326700774);
                    composer2.Xw();
                }
            }
            CN3 cn33 = this.f44949n;
            QAsActivity qAsActivity = this.f44950t;
            composer2.eF(-1396009968);
            boolean zE23 = composer2.E2(this.f44950t);
            final QAsActivity qAsActivity2 = this.f44950t;
            Object objIF3 = composer2.iF();
            if (zE23 || objIF3 == Composer.INSTANCE.n()) {
                objIF3 = new Function1() { // from class: com.alightcreative.app.motion.activities.creatorprogram.qas.ui.I28
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return QAsActivity.n.Uo(qAsActivity2, (n) obj);
                    }
                };
                composer2.o(objIF3);
            }
            composer2.Xw();
            uW.I28.nr(cn33, qAsActivity, (Function1) objIF3);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit O(CN3 cn3) {
            cn3.ck();
            return Unit.INSTANCE;
        }
    }

    static final class w6 implements Function2 {
        w6() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void n(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1861564932, i2, -1, "com.alightcreative.app.motion.activities.creatorprogram.qas.ui.QAsActivity.onCreate.<anonymous> (QAsActivity.kt:33)");
            }
            QAsActivity qAsActivity = QAsActivity.this;
            ViewModelProvider.Factory factoryN = CN3.xMQ.n(qAsActivity.Rl(), QAsActivity.this.Jk());
            composer.eF(297168033);
            ViewModelStoreOwner viewModelStoreOwnerT = LocalViewModelStoreOwner.f39076n.t(composer, LocalViewModelStoreOwner.f39077t);
            if (viewModelStoreOwnerT == null) {
                throw new IllegalStateException("Required value was null.");
            }
            uW.w6 w6Var = (uW.w6) new ViewModelProvider(viewModelStoreOwnerT, factoryN).n(CN3.class);
            composer.eF(-589589419);
            Lifecycle lifecycle = ((LifecycleOwner) composer.ty(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
            composer.eF(23938127);
            boolean zE2 = composer.E2(w6Var) | composer.E2(lifecycle);
            Object objIF = composer.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new uW.Wre(w6Var, lifecycle, null);
                composer.o(objIF);
            }
            composer.Xw();
            EffectsKt.nr(w6Var, lifecycle, (Function2) objIF, composer, 0);
            composer.Xw();
            composer.Xw();
            qAsActivity.C((CN3) w6Var, composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G7(QAsActivity qAsActivity, CN3 cn3, int i2, Composer composer, int i3) {
        qAsActivity.C(cn3, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Mx(CN3 cn3, OnBackPressedCallback BackPressHandler) {
        Intrinsics.checkNotNullParameter(BackPressHandler, "$this$BackPressHandler");
        cn3.ck();
        return Unit.INSTANCE;
    }

    public final CN3.n Rl() {
        CN3.n nVar = this.viewModelFactory;
        if (nVar != null) {
            return nVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(final CN3 cn3, Composer composer, final int i2) {
        int i3;
        boolean z2;
        int i5;
        boolean zE2;
        int i7;
        Composer composerKN = composer.KN(-507933498);
        if ((i2 & 6) == 0) {
            if ((i2 & 8) == 0) {
                zE2 = composerKN.p5(cn3);
            } else {
                zE2 = composerKN.E2(cn3);
            }
            if (zE2) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (composerKN.E2(this)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-507933498, i3, -1, "com.alightcreative.app.motion.activities.creatorprogram.qas.ui.QAsActivity.QAsScreen (QAsActivity.kt:47)");
            }
            H9N.CN3.nr(ComposableLambdaKt.nr(822397597, true, new n(cn3, this), composerKN, 54), composerKN, 6);
            composerKN.eF(-1094215144);
            if ((i3 & 14) != 4 && ((i3 & 8) == 0 || !composerKN.E2(cn3))) {
                z2 = false;
            } else {
                z2 = true;
            }
            Object objIF = composerKN.iF();
            if (z2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1() { // from class: yUp.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return QAsActivity.Mx(cn3, (OnBackPressedCallback) obj);
                    }
                };
                composerKN.o(objIF);
            }
            composerKN.Xw();
            N.I28.O(null, (Function1) objIF, composerKN, 0, 1);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: yUp.w6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QAsActivity.G7(this.f75681n, cn3, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final F2p.Ml Jk() {
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        return (F2p.Ml) lej.n(intent, "qa-type-extra", F2p.Ml.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n1() {
        finish();
    }

    @Override // com.alightcreative.app.motion.activities.creatorprogram.qas.ui.j, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ComponentActivityKt.rl(this, null, ComposableLambdaKt.rl(1861564932, true, new w6()), 1, null);
    }
}
