package Dj7;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class s4 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ComposeView f1881n;
    private boolean rl;

    static final class j implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function2 f1882n;

        j(Function2 function2) {
            this.f1882n = function2;
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
                ComposerKt.p5(-1074242136, i2, -1, "com.alightcreative.common.compose.components.ComposableInjector.setContent.<anonymous> (ComposableInjector.kt:38)");
            }
            this.f1882n.invoke(composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    public s4(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        ComposeView composeView = new ComposeView(activity, null, 0, 6, null);
        this.f1881n = composeView;
        activity.addContentView(composeView, new ViewGroup.LayoutParams(-1, -1));
    }

    public final void n() {
        if (this.rl) {
            return;
        }
        ViewParent parent = this.f1881n.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.f1881n);
        }
        this.rl = true;
    }

    public final void rl(Function2 content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f1881n.setContent(ComposableLambdaKt.rl(-1074242136, true, new j(content)));
    }
}
