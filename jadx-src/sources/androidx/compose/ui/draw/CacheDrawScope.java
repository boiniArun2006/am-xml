package androidx.compose.ui.draw;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006JK\u0010\u0011\u001a\u00020\u000e*\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u0015\u001a\u00020\u00142\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\u0017\u001a\u00020\u00142\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f¢\u0006\u0004\b\u0017\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010&\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010-\u001a\u0004\u0018\u00010\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R*\u00105\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0017\u0010\u000b\u001a\u0002068Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b \u00107R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010\u0007\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010<\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006?"}, d2 = {"Landroidx/compose/ui/draw/CacheDrawScope;", "Landroidx/compose/ui/unit/Density;", "<init>", "()V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "J2", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/IntSize;", "size", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "Lkotlin/ExtensionFunctionType;", "block", "o", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;JLkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/draw/DrawResult;", "HI", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/draw/DrawResult;", "r", "Landroidx/compose/ui/draw/BuildDrawCacheParams;", c.f62177j, "Landroidx/compose/ui/draw/BuildDrawCacheParams;", "getCacheParams$ui_release", "()Landroidx/compose/ui/draw/BuildDrawCacheParams;", "g", "(Landroidx/compose/ui/draw/BuildDrawCacheParams;)V", "cacheParams", "t", "Landroidx/compose/ui/draw/DrawResult;", "nr", "()Landroidx/compose/ui/draw/DrawResult;", "fD", "(Landroidx/compose/ui/draw/DrawResult;)V", "drawResult", "O", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "getContentDrawScope$ui_release", "()Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "te", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "contentDrawScope", "Lkotlin/Function0;", "Landroidx/compose/ui/graphics/GraphicsContext;", "Lkotlin/jvm/functions/Function0;", "getGraphicsContextProvider$ui_release", "()Lkotlin/jvm/functions/Function0;", "e", "(Lkotlin/jvm/functions/Function0;)V", "graphicsContextProvider", "Landroidx/compose/ui/geometry/Size;", "()J", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "", "getDensity", "()F", "yAc", "fontScale", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDrawModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/CacheDrawScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,415:1\n1#2:416\n*E\n"})
public final class CacheDrawScope implements Density {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private Function0 graphicsContextProvider;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private ContentDrawScope contentDrawScope;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private BuildDrawCacheParams cacheParams = EmptyBuildDrawCacheParams.f31268n;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private DrawResult drawResult;

    public static /* synthetic */ void aYN(CacheDrawScope cacheDrawScope, GraphicsLayer graphicsLayer, Density density, LayoutDirection layoutDirection, long j2, Function1 function1, int i2, Object obj) {
        Density density2 = density;
        if ((i2 & 1) != 0) {
            density2 = cacheDrawScope;
        }
        if ((i2 & 2) != 0) {
            layoutDirection = cacheDrawScope.getLayoutDirection();
        }
        if ((i2 & 4) != 0) {
            j2 = IntSizeKt.nr(cacheDrawScope.t());
        }
        cacheDrawScope.o(graphicsLayer, density2, layoutDirection, j2, function1);
    }

    public final DrawResult HI(final Function1 block) {
        return r(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.ui.draw.CacheDrawScope$onDrawBehind$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                n(contentDrawScope);
                return Unit.INSTANCE;
            }

            public final void n(ContentDrawScope contentDrawScope) {
                block.invoke(contentDrawScope);
                contentDrawScope.l2();
            }
        });
    }

    public final GraphicsLayer J2() {
        Function0 function0 = this.graphicsContextProvider;
        Intrinsics.checkNotNull(function0);
        return ((GraphicsContext) function0.invoke()).n();
    }

    public final void e(Function0 function0) {
        this.graphicsContextProvider = function0;
    }

    public final void fD(DrawResult drawResult) {
        this.drawResult = drawResult;
    }

    public final void g(BuildDrawCacheParams buildDrawCacheParams) {
        this.cacheParams = buildDrawCacheParams;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.cacheParams.getDensity().getDensity();
    }

    public final LayoutDirection getLayoutDirection() {
        return this.cacheParams.getLayoutDirection();
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final DrawResult getDrawResult() {
        return this.drawResult;
    }

    public final void o(GraphicsLayer graphicsLayer, final Density density, final LayoutDirection layoutDirection, long j2, final Function1 function1) {
        final ContentDrawScope contentDrawScope = this.contentDrawScope;
        Intrinsics.checkNotNull(contentDrawScope);
        final Density density2 = contentDrawScope.getDrawContext().getDensity();
        final LayoutDirection layoutDirection2 = contentDrawScope.getDrawContext().getLayoutDirection();
        contentDrawScope.rxp(graphicsLayer, j2, new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.draw.CacheDrawScope$record$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                n(drawScope);
                return Unit.INSTANCE;
            }

            public final void n(DrawScope drawScope) {
                DrawContext drawContext = drawScope.getDrawContext();
                Density density3 = density;
                LayoutDirection layoutDirection3 = layoutDirection;
                drawContext.O(density3);
                drawContext.rl(layoutDirection3);
                try {
                    function1.invoke(contentDrawScope);
                } finally {
                    DrawContext drawContext2 = drawScope.getDrawContext();
                    Density density4 = density2;
                    LayoutDirection layoutDirection4 = layoutDirection2;
                    drawContext2.O(density4);
                    drawContext2.rl(layoutDirection4);
                }
            }
        });
    }

    public final DrawResult r(Function1 block) {
        DrawResult drawResult = new DrawResult(block);
        this.drawResult = drawResult;
        return drawResult;
    }

    public final long t() {
        return this.cacheParams.t();
    }

    public final void te(ContentDrawScope contentDrawScope) {
        this.contentDrawScope = contentDrawScope;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: yAc */
    public float getFontScale() {
        return this.cacheParams.getDensity().getFontScale();
    }
}
