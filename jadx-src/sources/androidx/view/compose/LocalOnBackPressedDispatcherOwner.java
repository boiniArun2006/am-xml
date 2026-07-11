package androidx.view.compose;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.view.C1511ViewTreeOnBackPressedDispatcherOwner;
import androidx.view.OnBackPressedDispatcherOwner;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00048G¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/activity/compose/LocalOnBackPressedDispatcherOwner;", "", "<init>", "()V", "Landroidx/activity/OnBackPressedDispatcherOwner;", "dispatcherOwner", "Landroidx/compose/runtime/ProvidedValue;", "rl", "(Landroidx/activity/OnBackPressedDispatcherOwner;)Landroidx/compose/runtime/ProvidedValue;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalOnBackPressedDispatcherOwner", c.f62177j, "(Landroidx/compose/runtime/Composer;I)Landroidx/activity/OnBackPressedDispatcherOwner;", "current", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/LocalOnBackPressedDispatcherOwner\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ActivityComposeUtils.kt\nandroidx/activity/compose/ActivityComposeUtilsKt\n*L\n1#1,109:1\n77#2:110\n77#2:111\n77#2:112\n23#3,8:113\n*S KotlinDebug\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/LocalOnBackPressedDispatcherOwner\n*L\n51#1:110\n52#1:111\n53#1:112\n53#1:113,8\n*E\n"})
public final class LocalOnBackPressedDispatcherOwner {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final LocalOnBackPressedDispatcherOwner f13286n = new LocalOnBackPressedDispatcherOwner();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final ProvidableCompositionLocal LocalOnBackPressedDispatcherOwner = CompositionLocalKt.O(null, new Function0<OnBackPressedDispatcherOwner>() { // from class: androidx.activity.compose.LocalOnBackPressedDispatcherOwner$LocalOnBackPressedDispatcherOwner$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final OnBackPressedDispatcherOwner invoke() {
            return null;
        }
    }, 1, null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f13287t = 0;

    public final ProvidedValue rl(OnBackPressedDispatcherOwner dispatcherOwner) {
        return LocalOnBackPressedDispatcherOwner.nr(dispatcherOwner);
    }

    private LocalOnBackPressedDispatcherOwner() {
    }

    public final OnBackPressedDispatcherOwner n(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-2068013981, i2, -1, "androidx.activity.compose.LocalOnBackPressedDispatcherOwner.<get-current> (BackHandler.kt:50)");
        }
        OnBackPressedDispatcherOwner onBackPressedDispatcherOwnerN = (OnBackPressedDispatcherOwner) composer.ty(LocalOnBackPressedDispatcherOwner);
        if (onBackPressedDispatcherOwnerN == null) {
            composer.eF(544166745);
            onBackPressedDispatcherOwnerN = C1511ViewTreeOnBackPressedDispatcherOwner.n((View) composer.ty(AndroidCompositionLocals_androidKt.gh()));
            composer.Xw();
        } else {
            composer.eF(544164296);
            composer.Xw();
        }
        if (onBackPressedDispatcherOwnerN == null) {
            composer.eF(544168748);
            Object baseContext = (Context) composer.ty(AndroidCompositionLocals_androidKt.Uo());
            while (true) {
                if (baseContext instanceof ContextWrapper) {
                    if (baseContext instanceof OnBackPressedDispatcherOwner) {
                        break;
                    }
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                } else {
                    baseContext = null;
                    break;
                }
            }
            onBackPressedDispatcherOwnerN = (OnBackPressedDispatcherOwner) baseContext;
            composer.Xw();
        } else {
            composer.eF(544164377);
            composer.Xw();
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return onBackPressedDispatcherOwnerN;
    }
}
