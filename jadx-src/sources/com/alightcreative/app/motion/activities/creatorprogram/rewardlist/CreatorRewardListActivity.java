package com.alightcreative.app.motion.activities.creatorprogram.rewardlist;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.view.HasDefaultViewModelProviderFactory;
import androidx.view.Lifecycle;
import androidx.view.LifecycleOwner;
import androidx.view.ViewModel;
import androidx.view.ViewModelProvider;
import androidx.view.ViewModelStoreOwner;
import androidx.view.compose.ComponentActivityKt;
import androidx.view.viewmodel.CreationExtras;
import androidx.view.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.view.viewmodel.compose.ViewModelKt;
import com.alightcreative.app.motion.activities.creatorprogram.redeem.RedeemTokensActivity;
import com.alightcreative.app.motion.activities.creatorprogram.rewardlist.CreatorRewardListActivity;
import com.alightcreative.app.motion.activities.creatorprogram.rewardlist.Ml;
import com.safedk.android.utils.Logger;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/alightcreative/app/motion/activities/creatorprogram/rewardlist/CreatorRewardListActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "r", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CreatorRewardListActivity extends CN3 {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.alightcreative.app.motion.activities.creatorprogram.rewardlist.CreatorRewardListActivity$j, reason: from kotlin metadata */
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

        public final void n(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, new Intent(context, (Class<?>) CreatorRewardListActivity.class));
        }
    }

    static final class n implements Function2 {
        n() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(CreatorRewardListActivity creatorRewardListActivity, Ml action) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (Intrinsics.areEqual(action, Ml.j.f45020n)) {
                creatorRewardListActivity.finish();
            } else {
                if (!(action instanceof Ml.n)) {
                    throw new NoWhenBranchMatchedException();
                }
                RedeemTokensActivity.INSTANCE.n(creatorRewardListActivity, ((Ml.n) action).n());
            }
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
                ComposerKt.p5(-639057562, i2, -1, "com.alightcreative.app.motion.activities.creatorprogram.rewardlist.CreatorRewardListActivity.onCreate.<anonymous> (CreatorRewardListActivity.kt:18)");
            }
            composer.eF(-2135558586);
            composer.te(1890788296);
            ViewModelStoreOwner viewModelStoreOwnerT = LocalViewModelStoreOwner.f39076n.t(composer, LocalViewModelStoreOwner.f39077t);
            if (viewModelStoreOwnerT == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModelProvider.Factory factoryN = HiltViewModelKt.n(viewModelStoreOwnerT, composer, 0);
            composer.te(1729797275);
            ViewModel viewModelRl = ViewModelKt.rl(I28.class, viewModelStoreOwnerT, null, factoryN, viewModelStoreOwnerT instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwnerT).getDefaultViewModelCreationExtras() : CreationExtras.Empty.f39070t, composer, 36936, 0);
            composer.M7();
            composer.M7();
            uW.w6 w6Var = (uW.w6) viewModelRl;
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
            I28 i28 = (I28) w6Var;
            w6.Uo(i28, composer, 0);
            CreatorRewardListActivity creatorRewardListActivity = CreatorRewardListActivity.this;
            composer.eF(1531481830);
            boolean zP5 = composer.p5(CreatorRewardListActivity.this);
            final CreatorRewardListActivity creatorRewardListActivity2 = CreatorRewardListActivity.this;
            Object objIF2 = composer.iF();
            if (zP5 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new Function1() { // from class: com.alightcreative.app.motion.activities.creatorprogram.rewardlist.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CreatorRewardListActivity.n.t(creatorRewardListActivity2, (Ml) obj);
                    }
                };
                composer.o(objIF2);
            }
            composer.Xw();
            uW.I28.nr(i28, creatorRewardListActivity, (Function1) objIF2);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    @Override // com.alightcreative.app.motion.activities.creatorprogram.rewardlist.CN3, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ComponentActivityKt.rl(this, null, ComposableLambdaKt.rl(-639057562, true, new n()), 1, null);
    }
}
