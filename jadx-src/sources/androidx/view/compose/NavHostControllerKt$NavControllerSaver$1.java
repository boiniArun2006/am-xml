package androidx.view.compose;

import android.os.Bundle;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.view.NavHostController;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/saveable/SaverScope;", "Landroidx/navigation/NavHostController;", "it", "Landroid/os/Bundle;", c.f62177j, "(Landroidx/compose/runtime/saveable/SaverScope;Landroidx/navigation/NavHostController;)Landroid/os/Bundle;"}, k = 3, mv = {1, 8, 0})
final class NavHostControllerKt$NavControllerSaver$1 extends Lambda implements Function2<SaverScope, NavHostController, Bundle> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final NavHostControllerKt$NavControllerSaver$1 f40239n = new NavHostControllerKt$NavControllerSaver$1();

    NavHostControllerKt$NavControllerSaver$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Bundle invoke(SaverScope saverScope, NavHostController navHostController) {
        return navHostController.xg();
    }
}
