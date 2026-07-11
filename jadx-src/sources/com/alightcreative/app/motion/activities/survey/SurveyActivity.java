package com.alightcreative.app.motion.activities.survey;

import HI0.M5;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.view.Lifecycle;
import androidx.view.LifecycleOwner;
import androidx.view.ViewModelProvider;
import androidx.view.ViewModelStoreOwner;
import androidx.view.compose.ComponentActivityKt;
import androidx.view.viewmodel.compose.LocalViewModelStoreOwner;
import com.alightcreative.app.motion.activities.survey.I28;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import i.C2164I28;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/alightcreative/app/motion/activities/survey/SurveyActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/alightcreative/app/motion/activities/survey/I28$n;", "r", "Lcom/alightcreative/app/motion/activities/survey/I28$n;", "pJg", "()Lcom/alightcreative/app/motion/activities/survey/I28$n;", "setViewModelFactory", "(Lcom/alightcreative/app/motion/activities/survey/I28$n;)V", "viewModelFactory", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SurveyActivity extends com.alightcreative.app.motion.activities.survey.j {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public I28.n viewModelFactory;

    static final class j implements Function2 {
        final /* synthetic */ String J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f45660O;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f45662t;

        j(String str, String str2, String str3) {
            this.f45662t = str;
            this.f45660O = str2;
            this.J2 = str3;
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
                ComposerKt.p5(968760329, i2, -1, "com.alightcreative.app.motion.activities.survey.SurveyActivity.onCreate.<anonymous> (SurveyActivity.kt:49)");
            }
            ViewModelProvider.Factory factoryN = I28.mUb.n(SurveyActivity.this.pJg(), Ttw.j.f10582n.n(this.f45662t), C2164I28.f68045n.n(this.f45660O), this.J2);
            composer.eF(297168033);
            ViewModelStoreOwner viewModelStoreOwnerT = LocalViewModelStoreOwner.f39076n.t(composer, LocalViewModelStoreOwner.f39077t);
            if (viewModelStoreOwnerT == null) {
                throw new IllegalStateException("Required value was null.");
            }
            uW.w6 w6Var = (uW.w6) new ViewModelProvider(viewModelStoreOwnerT, factoryN).n(I28.class);
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
            w6.nr((I28) w6Var, SurveyActivity.this, composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    public final I28.n pJg() {
        I28.n nVar = this.viewModelFactory;
        if (nVar != null) {
            return nVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
        return null;
    }

    @Override // com.alightcreative.app.motion.activities.survey.j, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        String stringExtra;
        String stringExtra2;
        String stringExtra3;
        getWindow().setBackgroundDrawableResource(2131099811);
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        M5.n(window, ColorKt.mUb(aD.w6.z()), ColorKt.mUb(aD.w6.z()), true);
        Intent intent = getIntent();
        if (intent != null && (stringExtra = intent.getStringExtra(CreativeInfo.f62455s)) != null) {
            Intent intent2 = getIntent();
            if (intent2 != null && (stringExtra2 = intent2.getStringExtra("localization")) != null) {
                Intent intent3 = getIntent();
                if (intent3 != null && (stringExtra3 = intent3.getStringExtra("hook")) != null) {
                    ComponentActivityKt.rl(this, null, ComposableLambdaKt.rl(968760329, true, new j(stringExtra, stringExtra2, stringExtra3)), 1, null);
                    return;
                } else {
                    finish();
                    return;
                }
            }
            finish();
            return;
        }
        finish();
    }
}
