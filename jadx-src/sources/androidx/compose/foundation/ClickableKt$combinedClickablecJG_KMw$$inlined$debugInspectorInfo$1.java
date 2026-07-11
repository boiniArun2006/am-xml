package androidx.compose.foundation;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: androidx.compose.foundation.ClickableKt$combinedClickable-cJG_KMw$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "", c.f62177j, "(Landroidx/compose/ui/platform/InspectorInfo;)V", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n1#1,110:1\n303#2,9:111\n*E\n"})
public final class ClickableKt$combinedClickablecJG_KMw$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ Function0 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Role f16048O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ String f16049Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ boolean f16050n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ Function0 f16051o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ Function0 f16052r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ String f16053t;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        n(inspectorInfo);
        return Unit.INSTANCE;
    }

    public final void n(InspectorInfo inspectorInfo) {
        inspectorInfo.rl("combinedClickable");
        inspectorInfo.getProperties().n("enabled", Boolean.valueOf(this.f16050n));
        inspectorInfo.getProperties().n("onClickLabel", this.f16053t);
        inspectorInfo.getProperties().n("role", this.f16048O);
        inspectorInfo.getProperties().n("onClick", this.J2);
        inspectorInfo.getProperties().n("onDoubleClick", this.f16052r);
        inspectorInfo.getProperties().n("onLongClick", this.f16051o);
        inspectorInfo.getProperties().n("onLongClickLabel", this.f16049Z);
    }
}
