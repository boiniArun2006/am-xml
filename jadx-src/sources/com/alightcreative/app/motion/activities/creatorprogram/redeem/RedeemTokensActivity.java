package com.alightcreative.app.motion.activities.creatorprogram.redeem;

import HI0.lej;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.view.Lifecycle;
import androidx.view.LifecycleOwner;
import androidx.view.ViewModelProvider;
import androidx.view.ViewModelStoreOwner;
import androidx.view.compose.ComponentActivityKt;
import androidx.view.viewmodel.compose.LocalViewModelStoreOwner;
import cg.o;
import com.alightcreative.app.motion.activities.R6;
import com.alightcreative.app.motion.activities.creatorprogram.redeem.Dsr;
import com.alightcreative.app.motion.activities.creatorprogram.redeem.RedeemTokensActivity;
import com.alightcreative.app.motion.activities.creatorprogram.redeem.aC;
import com.safedk.android.utils.Logger;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/alightcreative/app/motion/activities/creatorprogram/redeem/RedeemTokensActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "", "titleResId", "messageResId", "Lkotlin/Function0;", "", "onDismiss", "eWT", "(IILkotlin/jvm/functions/Function0;)V", "Lcg/o$C;", "G7", "()Lcg/o$C;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/alightcreative/app/motion/activities/creatorprogram/redeem/aC$n;", "r", "Lcom/alightcreative/app/motion/activities/creatorprogram/redeem/aC$n;", "fcU", "()Lcom/alightcreative/app/motion/activities/creatorprogram/redeem/aC$n;", "setViewModelFactory", "(Lcom/alightcreative/app/motion/activities/creatorprogram/redeem/aC$n;)V", "viewModelFactory", "o", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RedeemTokensActivity extends j {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public aC.n viewModelFactory;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final int f44972Z = 8;

    /* JADX INFO: renamed from: com.alightcreative.app.motion.activities.creatorprogram.redeem.RedeemTokensActivity$j, reason: from kotlin metadata */
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

        public final void n(Context context, o.C rewardType) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(rewardType, "rewardType");
            Intent intent = new Intent(context, (Class<?>) RedeemTokensActivity.class);
            intent.putExtra("reward-type-extra", rewardType);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
        }
    }

    static final class n implements Function2 {
        n() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit J2(RedeemTokensActivity redeemTokensActivity, final aC aCVar, Dsr action) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (Intrinsics.areEqual(action, Dsr.j.f44967n)) {
                redeemTokensActivity.finish();
            } else if (Intrinsics.areEqual(action, Dsr.w6.f44969n)) {
                redeemTokensActivity.eWT(2132017552, 2132017551, new Function0() { // from class: com.alightcreative.app.motion.activities.creatorprogram.redeem.w6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RedeemTokensActivity.n.Uo(aCVar);
                    }
                });
            } else if (Intrinsics.areEqual(action, Dsr.Ml.f44966n)) {
                redeemTokensActivity.eWT(2132017589, 2132017588, new Function0() { // from class: com.alightcreative.app.motion.activities.creatorprogram.redeem.Ml
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RedeemTokensActivity.n.KN(aCVar);
                    }
                });
            } else {
                if (!Intrinsics.areEqual(action, Dsr.n.f44968n)) {
                    throw new NoWhenBranchMatchedException();
                }
                redeemTokensActivity.eWT(2132019855, 2132019854, new Function0() { // from class: com.alightcreative.app.motion.activities.creatorprogram.redeem.I28
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RedeemTokensActivity.n.xMQ(aCVar);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        public final void O(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1232312099, i2, -1, "com.alightcreative.app.motion.activities.creatorprogram.redeem.RedeemTokensActivity.onCreate.<anonymous> (RedeemTokensActivity.kt:25)");
            }
            aC.j jVar = aC.qie;
            aC.n nVarFcU = RedeemTokensActivity.this.fcU();
            o.C cG7 = RedeemTokensActivity.this.G7();
            Intrinsics.checkNotNull(cG7);
            ViewModelProvider.Factory factoryN = jVar.n(nVarFcU, cG7);
            composer.eF(297168033);
            ViewModelStoreOwner viewModelStoreOwnerT = LocalViewModelStoreOwner.f39076n.t(composer, LocalViewModelStoreOwner.f39077t);
            if (viewModelStoreOwnerT == null) {
                throw new IllegalStateException("Required value was null.");
            }
            uW.w6 w6Var = (uW.w6) new ViewModelProvider(viewModelStoreOwnerT, factoryN).n(aC.class);
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
            final aC aCVar = (aC) w6Var;
            MO.Wre.t(aCVar, composer, 0);
            RedeemTokensActivity redeemTokensActivity = RedeemTokensActivity.this;
            composer.eF(358060682);
            boolean zE22 = composer.E2(RedeemTokensActivity.this) | composer.E2(aCVar);
            final RedeemTokensActivity redeemTokensActivity2 = RedeemTokensActivity.this;
            Object objIF2 = composer.iF();
            if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new Function1() { // from class: com.alightcreative.app.motion.activities.creatorprogram.redeem.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RedeemTokensActivity.n.J2(redeemTokensActivity2, aCVar, (Dsr) obj);
                    }
                };
                composer.o(objIF2);
            }
            composer.Xw();
            uW.I28.nr(aCVar, redeemTokensActivity, (Function1) objIF2);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            O((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit KN(aC aCVar) {
            aCVar.XQ();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Uo(aC aCVar) {
            aCVar.XQ();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit xMQ(aC aCVar) {
            aCVar.XQ();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void eWT(int titleResId, int messageResId, final Function0 onDismiss) {
        new R6(this).mUb(titleResId).nr(messageResId).Uo(2132017378, new Function1() { // from class: MO.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RedeemTokensActivity.ul((DialogInterface) obj);
            }
        }).KN(new DialogInterface.OnDismissListener() { // from class: MO.n
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                RedeemTokensActivity.n1(onDismiss, dialogInterface);
            }
        }).gh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ul(DialogInterface it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.dismiss();
        return Unit.INSTANCE;
    }

    public final aC.n fcU() {
        aC.n nVar = this.viewModelFactory;
        if (nVar != null) {
            return nVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o.C G7() {
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        return (o.C) lej.n(intent, "reward-type-extra", o.C.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n1(Function0 function0, DialogInterface dialogInterface) {
        function0.invoke();
    }

    @Override // com.alightcreative.app.motion.activities.creatorprogram.redeem.j, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ComponentActivityKt.rl(this, null, ComposableLambdaKt.rl(1232312099, true, new n()), 1, null);
    }
}
