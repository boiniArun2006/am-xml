package VA;

import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class n {
    public static final ComposeView n(Fragment fragment, ViewCompositionStrategy compositionStrategy, Context context, Function2 content) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(compositionStrategy, "compositionStrategy");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(content, "content");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setViewCompositionStrategy(compositionStrategy);
        composeView.setContent(content);
        return composeView;
    }

    public static /* synthetic */ ComposeView rl(Fragment fragment, ViewCompositionStrategy viewCompositionStrategy, Context context, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            viewCompositionStrategy = ViewCompositionStrategy.DisposeOnDetachedFromWindow.rl;
        }
        if ((i2 & 2) != 0) {
            context = fragment.requireContext();
        }
        return n(fragment, viewCompositionStrategy, context, function2);
    }
}
