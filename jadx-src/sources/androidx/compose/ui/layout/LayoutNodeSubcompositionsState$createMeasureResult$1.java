package androidx.compose.ui.layout;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR'\u0010\u0013\u001a\u0015\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e¢\u0006\u0002\b\u00108VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\f¨\u0006\u0016"}, d2 = {"androidx/compose/ui/layout/LayoutNodeSubcompositionsState$createMeasureResult$1", "Landroidx/compose/ui/layout/MeasureResult;", "", "Z", "()V", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "o", "()Ljava/util/Map;", "alignmentLines", "getHeight", "()I", "height", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "Lkotlin/ExtensionFunctionType;", "XQ", "()Lkotlin/jvm/functions/Function1;", "rulers", "getWidth", "width", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LayoutNodeSubcompositionsState$createMeasureResult$1 implements MeasureResult {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ MeasureResult f32277n;
    final /* synthetic */ Function0 rl;

    @Override // androidx.compose.ui.layout.MeasureResult
    public Function1 XQ() {
        return this.f32277n.XQ();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getHeight() {
        return this.f32277n.getHeight();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getWidth() {
        return this.f32277n.getWidth();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public Map o() {
        return this.f32277n.o();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public void Z() {
        this.rl.invoke();
    }
}
