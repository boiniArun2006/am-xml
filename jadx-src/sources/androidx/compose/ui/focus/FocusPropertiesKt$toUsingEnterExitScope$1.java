package androidx.compose.ui.focus;

import androidx.compose.ui.focus.FocusRequester;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusEnterExitScope;", "", c.f62177j, "(Landroidx/compose/ui/focus/FocusEnterExitScope;)V"}, k = 3, mv = {1, 9, 0})
final class FocusPropertiesKt$toUsingEnterExitScope$1 extends Lambda implements Function1<FocusEnterExitScope, Unit> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Function1 f31329n;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FocusEnterExitScope focusEnterExitScope) {
        n(focusEnterExitScope);
        return Unit.INSTANCE;
    }

    public final void n(FocusEnterExitScope focusEnterExitScope) {
        FocusRequester focusRequester = (FocusRequester) this.f31329n.invoke(FocusDirection.xMQ(focusEnterExitScope.getRequestedFocusDirection()));
        FocusRequester.Companion companion = FocusRequester.INSTANCE;
        if (focusRequester == companion.n()) {
            focusEnterExitScope.n();
        } else if (focusRequester != companion.rl()) {
            FocusRequester.KN(focusRequester, 0, 1, null);
        }
    }
}
