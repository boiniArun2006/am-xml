package com.bendingspoons.forceupdater.internal;

import YgZ.I28;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.view.compose.ComponentActivityKt;
import com.bendingspoons.forceupdater.internal.ForceUpdateActivity;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.utils.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/bendingspoons/forceupdater/internal/ForceUpdateActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", c.f62177j, "j", "forceupdater_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ForceUpdateActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.bendingspoons.forceupdater.internal.ForceUpdateActivity$j, reason: from kotlin metadata */
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

        public final void n(Context context, boolean z2) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) ForceUpdateActivity.class);
            intent.setFlags(268435456);
            intent.putExtra("key-is-update-forced", z2);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
        }
    }

    static final class n implements Function2 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f51269t;

        n(boolean z2) {
            this.f51269t = z2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit O(ForceUpdateActivity forceUpdateActivity) {
            I28.f12212n.n(forceUpdateActivity);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            t((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void t(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1523102345, i2, -1, "com.bendingspoons.forceupdater.internal.ForceUpdateActivity.onCreate.<anonymous> (ForceUpdateActivity.kt:16)");
            }
            composer.eF(1030788326);
            boolean zP5 = composer.p5(ForceUpdateActivity.this);
            final ForceUpdateActivity forceUpdateActivity = ForceUpdateActivity.this;
            Object objIF = composer.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: com.bendingspoons.forceupdater.internal.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ForceUpdateActivity.n.nr(forceUpdateActivity);
                    }
                };
                composer.o(objIF);
            }
            Function0 function0 = (Function0) objIF;
            composer.Xw();
            if (this.f51269t) {
                function0 = null;
            }
            Function0 function02 = function0;
            composer.eF(1030791766);
            boolean zP52 = composer.p5(ForceUpdateActivity.this);
            final ForceUpdateActivity forceUpdateActivity2 = ForceUpdateActivity.this;
            Object objIF2 = composer.iF();
            if (zP52 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new Function0() { // from class: com.bendingspoons.forceupdater.internal.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ForceUpdateActivity.n.O(forceUpdateActivity2);
                    }
                };
                composer.o(objIF2);
            }
            composer.Xw();
            Cij.I28.t(null, function02, (Function0) objIF2, composer, 0, 1);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit nr(ForceUpdateActivity forceUpdateActivity) {
            forceUpdateActivity.finish();
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ComponentActivityKt.rl(this, null, ComposableLambdaKt.rl(1523102345, true, new n(getIntent().getBooleanExtra("key-is-update-forced", false))), 1, null);
    }
}
