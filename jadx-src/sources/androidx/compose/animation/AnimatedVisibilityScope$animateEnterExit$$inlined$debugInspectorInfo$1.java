package androidx.compose.animation;

import androidx.compose.ui.platform.InspectorInfo;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "", c.f62177j, "(Landroidx/compose/ui/platform/InspectorInfo;)V", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityScope\n*L\n1#1,110:1\n649#2,5:111\n*E\n"})
public final class AnimatedVisibilityScope$animateEnterExit$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ String f15109O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ EnterTransition f15110n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ ExitTransition f15111t;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        n(inspectorInfo);
        return Unit.INSTANCE;
    }

    public final void n(InspectorInfo inspectorInfo) {
        inspectorInfo.rl("animateEnterExit");
        inspectorInfo.getProperties().n("enter", this.f15110n);
        inspectorInfo.getProperties().n("exit", this.f15111t);
        inspectorInfo.getProperties().n("label", this.f15109O);
    }
}
