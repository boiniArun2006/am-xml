package androidx.compose.ui.focus;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusDirection;", "it", "Landroidx/compose/ui/focus/FocusRequester;", c.f62177j, "(I)Landroidx/compose/ui/focus/FocusRequester;"}, k = 3, mv = {1, 9, 0})
final class FocusProperties$exit$1 extends Lambda implements Function1<FocusDirection, FocusRequester> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final FocusProperties$exit$1 f31319n = new FocusProperties$exit$1();

    FocusProperties$exit$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ FocusRequester invoke(FocusDirection focusDirection) {
        return n(focusDirection.getValue());
    }

    public final FocusRequester n(int i2) {
        return FocusRequester.INSTANCE.rl();
    }
}
