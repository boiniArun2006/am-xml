package androidx.hilt.navigation;

import Dj9.w6;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.view.ComponentActivity;
import androidx.view.ViewModelProvider;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/lifecycle/ViewModelProvider$Factory;", "delegateFactory", c.f62177j, "(Landroid/content/Context;Landroidx/lifecycle/ViewModelProvider$Factory;)Landroidx/lifecycle/ViewModelProvider$Factory;", "hilt-navigation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName(name = "HiltViewModelFactory")
public final class HiltViewModelFactory {
    public static final ViewModelProvider.Factory n(Context context, ViewModelProvider.Factory delegateFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(delegateFactory, "delegateFactory");
        while (context instanceof ContextWrapper) {
            if (context instanceof ComponentActivity) {
                ViewModelProvider.Factory factoryNr = w6.nr((ComponentActivity) context, delegateFactory);
                Intrinsics.checkNotNullExpressionValue(factoryNr, "createInternal(\n        … */ delegateFactory\n    )");
                return factoryNr;
            }
            context = ((ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(context, "ctx.baseContext");
        }
        throw new IllegalStateException("Expected an activity context for creating a HiltViewModelFactory but instead found: " + context);
    }
}
