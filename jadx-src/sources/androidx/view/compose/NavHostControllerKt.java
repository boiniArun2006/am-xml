package androidx.view.compose;

import android.content.Context;
import androidx.view.NavHostController;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/navigation/NavHostController;", "rl", "(Landroid/content/Context;)Landroidx/navigation/NavHostController;", "navigation-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNavHostController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHostController.kt\nandroidx/navigation/compose/NavHostControllerKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,83:1\n77#2:84\n1225#3,6:85\n*S KotlinDebug\n*F\n+ 1 NavHostController.kt\nandroidx/navigation/compose/NavHostControllerKt\n*L\n59#1:84\n60#1:85,6\n*E\n"})
public final class NavHostControllerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final NavHostController rl(Context context) {
        NavHostController navHostController = new NavHostController(context);
        navHostController.get_navigatorProvider().rl(new ComposeNavGraphNavigator(navHostController.get_navigatorProvider()));
        navHostController.get_navigatorProvider().rl(new ComposeNavigator());
        navHostController.get_navigatorProvider().rl(new DialogNavigator());
        return navHostController;
    }
}
