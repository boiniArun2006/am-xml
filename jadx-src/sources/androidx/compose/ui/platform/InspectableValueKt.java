package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\"(\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006\"\"\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "NoInspectorInfo", "", "rl", "Z", "()Z", "setDebugInspectorInfoEnabled", "(Z)V", "isDebugInspectorInfoEnabled", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class InspectableValueKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Function1 f32989n = new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.platform.InspectableValueKt$NoInspectorInfo$1
        public final void n(InspectorInfo inspectorInfo) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
            n(inspectorInfo);
            return Unit.INSTANCE;
        }
    };
    private static boolean rl;

    public static final Function1 n() {
        return f32989n;
    }

    public static final boolean rl() {
        return rl;
    }
}
