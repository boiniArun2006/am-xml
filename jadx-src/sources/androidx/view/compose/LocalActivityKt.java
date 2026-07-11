package androidx.view.compose;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroid/app/Activity;", c.f62177j, "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalActivity", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalActivity", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LocalActivityKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ProvidableCompositionLocal f13280n = CompositionLocalKt.J2(new Function1<CompositionLocalAccessorScope, Activity>() { // from class: androidx.activity.compose.LocalActivityKt$LocalActivity$1
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Activity invoke(CompositionLocalAccessorScope compositionLocalAccessorScope) {
            Context baseContext = (Context) compositionLocalAccessorScope.rl(AndroidCompositionLocals_androidKt.Uo());
            while (true) {
                if (baseContext instanceof ContextWrapper) {
                    if (baseContext instanceof Activity) {
                        break;
                    }
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                } else {
                    baseContext = null;
                    break;
                }
            }
            return (Activity) baseContext;
        }
    });
}
