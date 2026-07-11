package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidPathMeasure_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathMeasure;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import com.caoccao.javet.exceptions.JavetError;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR*\u0010\u0013\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u0012R.\u0010\u001b\u001a\u0004\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010#\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R6\u0010+\u001a\b\u0012\u0004\u0012\u00020%0$2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020%0$8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R0\u00103\u001a\u00020,2\u0006\u0010\r\u001a\u00020,8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R*\u00107\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u001e\u001a\u0004\b5\u0010 \"\u0004\b6\u0010\"R*\u0010:\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b8\u0010 \"\u0004\b9\u0010\"R.\u0010<\u001a\u0004\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0016\u001a\u0004\b4\u0010\u0018\"\u0004\b;\u0010\u001aR0\u0010@\u001a\u00020=2\u0006\u0010\r\u001a\u00020=8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0011\u0010.\u001a\u0004\b>\u00100\"\u0004\b?\u00102R0\u0010D\u001a\u00020A2\u0006\u0010\r\u001a\u00020A8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b)\u0010.\u001a\u0004\bB\u00100\"\u0004\bC\u00102R*\u0010G\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u001e\u001a\u0004\bE\u0010 \"\u0004\bF\u0010\"R*\u0010J\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010\u001e\u001a\u0004\bH\u0010 \"\u0004\bI\u0010\"R*\u0010M\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010\u001e\u001a\u0004\bK\u0010 \"\u0004\bL\u0010\"R*\u0010P\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010\u001e\u001a\u0004\bN\u0010 \"\u0004\bO\u0010\"R\u0016\u0010R\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010OR\u0016\u0010S\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010OR\u0016\u0010T\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010OR\u0018\u0010W\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010VR\u0014\u0010Z\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010YR\u0016\u0010[\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010YR\u001b\u0010_\u001a\u00020\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010]\u001a\u0004\b-\u0010^\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006`"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "<init>", "()V", "", "S", "WPU", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", c.f62177j, "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "toString", "()Ljava/lang/String;", "value", "rl", "Ljava/lang/String;", "getName", "mUb", "(Ljava/lang/String;)V", AppMeasurementSdk.ConditionalUserProperty.NAME, "Landroidx/compose/ui/graphics/Brush;", "t", "Landroidx/compose/ui/graphics/Brush;", "O", "()Landroidx/compose/ui/graphics/Brush;", "KN", "(Landroidx/compose/ui/graphics/Brush;)V", "fill", "", "nr", "F", "getFillAlpha", "()F", "xMQ", "(F)V", "fillAlpha", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "Ljava/util/List;", "getPathData", "()Ljava/util/List;", "gh", "(Ljava/util/List;)V", "pathData", "Landroidx/compose/ui/graphics/PathFillType;", "J2", "I", "getPathFillType-Rg-k1Os", "()I", "qie", "(I)V", "pathFillType", "Uo", "getStrokeAlpha", "ty", "strokeAlpha", "getStrokeLineWidth", "r", "strokeLineWidth", "az", "stroke", "Landroidx/compose/ui/graphics/StrokeCap;", "getStrokeLineCap-KaPHkGw", "HI", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "getStrokeLineJoin-LxFBmk8", "ck", "strokeLineJoin", "getStrokeLineMiter", "Ik", "strokeLineMiter", "getTrimPathStart", "XQ", "trimPathStart", "getTrimPathEnd", "o", "trimPathEnd", "getTrimPathOffset", "Z", "trimPathOffset", "", "isPathDirty", "isStrokeDirty", "isTrimPathDirty", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "strokeStyle", "Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/graphics/Path;", JavetError.PARAMETER_PATH, "renderPath", "Landroidx/compose/ui/graphics/PathMeasure;", "Lkotlin/Lazy;", "()Landroidx/compose/ui/graphics/PathMeasure;", "pathMeasure", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/PathComponent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,642:1\n1#2:643\n*E\n"})
public final class PathComponent extends VNode {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private float trimPathOffset;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private boolean isStrokeDirty;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private int pathFillType;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private float strokeLineWidth;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private List pathData;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final Lazy pathMeasure;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private float strokeAlpha;

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private Path renderPath;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final Path path;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private float trimPathStart;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private boolean isPathDirty;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private int strokeLineJoin;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private int strokeLineCap;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private float fillAlpha;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Stroke strokeStyle;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private float strokeLineMiter;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean isTrimPathDirty;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private String name;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Brush fill;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private float trimPathEnd;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private Brush stroke;

    public PathComponent() {
        super(null);
        this.name = "";
        this.fillAlpha = 1.0f;
        this.pathData = VectorKt.nr();
        this.pathFillType = VectorKt.n();
        this.strokeAlpha = 1.0f;
        this.strokeLineCap = VectorKt.rl();
        this.strokeLineJoin = VectorKt.t();
        this.strokeLineMiter = 4.0f;
        this.trimPathEnd = 1.0f;
        this.isPathDirty = true;
        this.isStrokeDirty = true;
        Path pathN = AndroidPath_androidKt.n();
        this.path = pathN;
        this.renderPath = pathN;
        this.pathMeasure = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<PathMeasure>() { // from class: androidx.compose.ui.graphics.vector.PathComponent$pathMeasure$2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final PathMeasure invoke() {
                return AndroidPathMeasure_androidKt.n();
            }
        });
    }

    private final PathMeasure J2() {
        return (PathMeasure) this.pathMeasure.getValue();
    }

    private final void S() {
        PathParserKt.t(this.pathData, this.path);
        WPU();
    }

    private final void WPU() {
        if (this.trimPathStart == 0.0f && this.trimPathEnd == 1.0f) {
            this.renderPath = this.path;
            return;
        }
        if (Intrinsics.areEqual(this.renderPath, this.path)) {
            this.renderPath = AndroidPath_androidKt.n();
        } else {
            int iHI = this.renderPath.HI();
            this.renderPath.gh();
            this.renderPath.KN(iHI);
        }
        J2().rl(this.path, false);
        float length = J2().getLength();
        float f3 = this.trimPathStart;
        float f4 = this.trimPathOffset;
        float f5 = ((f3 + f4) % 1.0f) * length;
        float f6 = ((this.trimPathEnd + f4) % 1.0f) * length;
        if (f5 <= f6) {
            J2().n(f5, f6, this.renderPath, true);
        } else {
            J2().n(f5, length, this.renderPath, true);
            J2().n(0.0f, f6, this.renderPath, true);
        }
    }

    public final void HI(int i2) {
        this.strokeLineCap = i2;
        this.isStrokeDirty = true;
        t();
    }

    public final void Ik(float f3) {
        this.strokeLineMiter = f3;
        this.isStrokeDirty = true;
        t();
    }

    public final void KN(Brush brush) {
        this.fill = brush;
        t();
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final Brush getFill() {
        return this.fill;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final Brush getStroke() {
        return this.stroke;
    }

    public final void XQ(float f3) {
        this.trimPathStart = f3;
        this.isTrimPathDirty = true;
        t();
    }

    public final void Z(float f3) {
        this.trimPathOffset = f3;
        this.isTrimPathDirty = true;
        t();
    }

    public final void az(Brush brush) {
        this.stroke = brush;
        t();
    }

    public final void ck(int i2) {
        this.strokeLineJoin = i2;
        this.isStrokeDirty = true;
        t();
    }

    public final void gh(List list) {
        this.pathData = list;
        this.isPathDirty = true;
        t();
    }

    public final void mUb(String str) {
        this.name = str;
        t();
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void n(DrawScope drawScope) {
        Stroke stroke;
        if (this.isPathDirty) {
            S();
        } else if (this.isTrimPathDirty) {
            WPU();
        }
        this.isPathDirty = false;
        this.isTrimPathDirty = false;
        Brush brush = this.fill;
        if (brush != null) {
            DrawScope.Ro(drawScope, this.renderPath, brush, this.fillAlpha, null, null, 0, 56, null);
        }
        Brush brush2 = this.stroke;
        if (brush2 != null) {
            Stroke stroke2 = this.strokeStyle;
            if (this.isStrokeDirty || stroke2 == null) {
                Stroke stroke3 = new Stroke(this.strokeLineWidth, this.strokeLineMiter, this.strokeLineCap, this.strokeLineJoin, null, 16, null);
                this.strokeStyle = stroke3;
                this.isStrokeDirty = false;
                stroke = stroke3;
            } else {
                stroke = stroke2;
            }
            DrawScope.Ro(drawScope, this.renderPath, brush2, this.strokeAlpha, stroke, null, 0, 48, null);
        }
    }

    public final void o(float f3) {
        this.trimPathEnd = f3;
        this.isTrimPathDirty = true;
        t();
    }

    public final void qie(int i2) {
        this.pathFillType = i2;
        this.renderPath.KN(i2);
        t();
    }

    public final void r(float f3) {
        this.strokeLineWidth = f3;
        this.isStrokeDirty = true;
        t();
    }

    public String toString() {
        return this.path.toString();
    }

    public final void ty(float f3) {
        this.strokeAlpha = f3;
        t();
    }

    public final void xMQ(float f3) {
        this.fillAlpha = f3;
        t();
    }
}
