package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R1\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019R+\u0010 \u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010&\u001a\u00020!8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R+\u0010.\u001a\u00020'2\u0006\u0010\u0014\u001a\u00020'8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0016\u00101\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00104\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00107\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R(\u0010<\u001a\u0004\u0018\u00010\u000f2\b\u00108\u001a\u0004\u0018\u00010\u000f8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b\u001b\u0010;R*\u0010?\u001a\u00020\u00132\u0006\u00108\u001a\u00020\u00138@@@X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b=\u0010\u0017\"\u0004\b>\u0010\u0019R$\u0010E\u001a\u00020@2\u0006\u00108\u001a\u00020@8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001a\u0010G\u001a\u00020\u00138VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bF\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006H"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "root", "<init>", "(Landroidx/compose/ui/graphics/vector/GroupComponent;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "ty", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "alpha", "", c.f62177j, "(F)Z", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "rl", "(Landroidx/compose/ui/graphics/ColorFilter;)Z", "Landroidx/compose/ui/geometry/Size;", "<set-?>", "Z", "Landroidx/compose/runtime/MutableState;", "()J", "ViF", "(J)V", "size", "S", "r", "()Z", "XQ", "(Z)V", "autoMirror", "Landroidx/compose/ui/graphics/vector/VectorComponent;", "g", "Landroidx/compose/ui/graphics/vector/VectorComponent;", "getVector$ui_release", "()Landroidx/compose/ui/graphics/vector/VectorComponent;", "vector", "", "E2", "Landroidx/compose/runtime/MutableIntState;", "o", "()I", "WPU", "(I)V", "invalidateCount", "e", "F", "currentAlpha", "X", "Landroidx/compose/ui/graphics/ColorFilter;", "currentColorFilter", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "I", "drawCount", "value", "getIntrinsicColorFilter$ui_release", "()Landroidx/compose/ui/graphics/ColorFilter;", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "intrinsicColorFilter", "getViewportSize-NH-jbRc$ui_release", "nY", "viewportSize", "", "getName$ui_release", "()Ljava/lang/String;", "aYN", "(Ljava/lang/String;)V", AppMeasurementSdk.ConditionalUserProperty.NAME, "qie", "intrinsicSize", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVectorPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainter\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 4 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,474:1\n85#2:475\n113#2,2:476\n85#2:478\n113#2,2:479\n78#3:481\n107#3,2:482\n262#4:484\n263#4:505\n167#5,6:485\n249#5,14:491\n*S KotlinDebug\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainter\n*L\n188#1:475\n188#1:476,2\n190#1:478\n190#1:479,2\n226#1:481\n226#1:482,2\n240#1:484\n240#1:505\n240#1:485,6\n240#1:491,14\n*E\n"})
public final class VectorPainter extends Painter {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final int f31887N = 8;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private final MutableIntState invalidateCount;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private int drawCount;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private ColorFilter currentColorFilter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float currentAlpha;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final VectorComponent vector;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final MutableState size = SnapshotStateKt__SnapshotStateKt.O(Size.t(Size.INSTANCE.rl()), null, 2, null);

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final MutableState autoMirror = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public final void WPU(int i2) {
        this.invalidateCount.KN(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int o() {
        return this.invalidateCount.J2();
    }

    public final void S(ColorFilter colorFilter) {
        this.vector.ty(colorFilter);
    }

    public final void ViF(long j2) {
        this.size.setValue(Size.t(j2));
    }

    public final void XQ(boolean z2) {
        this.autoMirror.setValue(Boolean.valueOf(z2));
    }

    public final long Z() {
        return ((Size) this.size.getValue()).getPackedValue();
    }

    public final void aYN(String str) {
        this.vector.ck(str);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean n(float alpha) {
        this.currentAlpha = alpha;
        return true;
    }

    public final void nY(long j2) {
        this.vector.Ik(j2);
    }

    public final boolean r() {
        return ((Boolean) this.autoMirror.getValue()).booleanValue();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean rl(ColorFilter colorFilter) {
        this.currentColorFilter = colorFilter;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected void ty(DrawScope drawScope) {
        VectorComponent vectorComponent = this.vector;
        ColorFilter colorFilterGh = this.currentColorFilter;
        if (colorFilterGh == null) {
            colorFilterGh = vectorComponent.gh();
        }
        if (r() && drawScope.getLayoutDirection() == LayoutDirection.f34161t) {
            long jCo = drawScope.Co();
            DrawContext drawContext = drawScope.getDrawContext();
            long jT2 = drawContext.t();
            drawContext.KN().O();
            try {
                drawContext.getTransform().Uo(-1.0f, 1.0f, jCo);
                vectorComponent.xMQ(drawScope, this.currentAlpha, colorFilterGh);
            } finally {
                drawContext.KN().n();
                drawContext.xMQ(jT2);
            }
        } else {
            vectorComponent.xMQ(drawScope, this.currentAlpha, colorFilterGh);
        }
        this.drawCount = o();
    }

    public VectorPainter(GroupComponent groupComponent) {
        VectorComponent vectorComponent = new VectorComponent(groupComponent);
        vectorComponent.HI(new Function0<Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$vector$1$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (this.f31894n.drawCount == this.f31894n.o()) {
                    VectorPainter vectorPainter = this.f31894n;
                    vectorPainter.WPU(vectorPainter.o() + 1);
                }
            }
        });
        this.vector = vectorComponent;
        this.invalidateCount = SnapshotIntStateKt.n(0);
        this.currentAlpha = 1.0f;
        this.drawCount = -1;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: qie */
    public long getIntrinsicSize() {
        return Z();
    }
}
