package com.alightcreative.app.motion.ranking.ui.editprofile;

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
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.media3.common.C;
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
import com.alightcreative.app.motion.activities.MyAccountActivity;
import com.alightcreative.app.motion.activities.R6;
import com.alightcreative.app.motion.activities.main.MainActivity;
import com.alightcreative.app.motion.ranking.ui.editprofile.EditProfileActivity;
import com.alightcreative.app.motion.ranking.ui.editprofile.I28;
import com.safedk.android.utils.Logger;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/alightcreative/app/motion/ranking/ui/editprofile/EditProfileActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "LWK/n;", "r", "LWK/n;", "pJg", "()LWK/n;", "setGetUriFromResource", "(LWK/n;)V", "getUriFromResource", "o", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EditProfileActivity extends CN3 {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public WK.n getUriFromResource;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final int f45891Z = 8;

    /* JADX INFO: renamed from: com.alightcreative.app.motion.ranking.ui.editprofile.EditProfileActivity$j, reason: from kotlin metadata */
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
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, new Intent(context, (Class<?>) EditProfileActivity.class));
        }
    }

    static final class n implements Function2 {
        n() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit KN(DialogInterface it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.dismiss();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Uo(EditProfileActivity editProfileActivity, final Wre wre, I28 action) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (Intrinsics.areEqual(action, I28.j.f45896n)) {
                editProfileActivity.finish();
            } else if (Intrinsics.areEqual(action, I28.w6.f45898n)) {
                MainActivity.INSTANCE.n(editProfileActivity, M.CN3.f6254Z);
            } else if (Intrinsics.areEqual(action, I28.n.f45897n)) {
                MyAccountActivity.INSTANCE.n(editProfileActivity, C.BUFFER_FLAG_NOT_DEPENDED_ON);
            } else {
                if (!Intrinsics.areEqual(action, I28.Ml.f45895n)) {
                    throw new NoWhenBranchMatchedException();
                }
                new R6(editProfileActivity).mUb(2132019855).nr(2132019854).Uo(2132017378, new Function1() { // from class: com.alightcreative.app.motion.ranking.ui.editprofile.w6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EditProfileActivity.n.KN((DialogInterface) obj);
                    }
                }).KN(new DialogInterface.OnDismissListener() { // from class: com.alightcreative.app.motion.ranking.ui.editprofile.Ml
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        EditProfileActivity.n.xMQ(wre, dialogInterface);
                    }
                }).gh();
            }
            return Unit.INSTANCE;
        }

        public final void O(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1885365365, i2, -1, "com.alightcreative.app.motion.ranking.ui.editprofile.EditProfileActivity.onCreate.<anonymous> (EditProfileActivity.kt:27)");
            }
            composer.eF(-2135558586);
            composer.te(1890788296);
            ViewModelStoreOwner viewModelStoreOwnerT = LocalViewModelStoreOwner.f39076n.t(composer, LocalViewModelStoreOwner.f39077t);
            if (viewModelStoreOwnerT == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModelProvider.Factory factoryN = HiltViewModelKt.n(viewModelStoreOwnerT, composer, 0);
            composer.te(1729797275);
            ViewModel viewModelRl = ViewModelKt.rl(Wre.class, viewModelStoreOwnerT, null, factoryN, viewModelStoreOwnerT instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwnerT).getDefaultViewModelCreationExtras() : CreationExtras.Empty.f39070t, composer, 36936, 0);
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
            final Wre wre = (Wre) w6Var;
            composer.eF(-2037959197);
            boolean zE22 = composer.E2(EditProfileActivity.this);
            final EditProfileActivity editProfileActivity = EditProfileActivity.this;
            Object objIF2 = composer.iF();
            if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new Function1() { // from class: com.alightcreative.app.motion.ranking.ui.editprofile.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EditProfileActivity.n.J2(editProfileActivity, ((Integer) obj).intValue());
                    }
                };
                composer.o(objIF2);
            }
            composer.Xw();
            F.C.gh(wre, (Function1) objIF2, composer, 0);
            composer.eF(-2037955151);
            boolean zE23 = composer.E2(EditProfileActivity.this) | composer.E2(wre);
            final EditProfileActivity editProfileActivity2 = EditProfileActivity.this;
            Object objIF3 = composer.iF();
            if (zE23 || objIF3 == Composer.INSTANCE.n()) {
                objIF3 = new Function1() { // from class: com.alightcreative.app.motion.ranking.ui.editprofile.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EditProfileActivity.n.Uo(editProfileActivity2, wre, (I28) obj);
                    }
                };
                composer.o(objIF3);
            }
            composer.Xw();
            uW.I28.rl(wre, (Function1) objIF3, composer, 0);
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
        public static final x0X.n J2(EditProfileActivity editProfileActivity, int i2) {
            return editProfileActivity.pJg().rl(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void xMQ(Wre wre, DialogInterface dialogInterface) {
            wre.XQ();
        }
    }

    public final WK.n pJg() {
        WK.n nVar = this.getUriFromResource;
        if (nVar != null) {
            return nVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getUriFromResource");
        return null;
    }

    @Override // com.alightcreative.app.motion.ranking.ui.editprofile.CN3, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ComponentActivityKt.rl(this, null, ComposableLambdaKt.rl(1885365365, true, new n()), 1, null);
    }
}
