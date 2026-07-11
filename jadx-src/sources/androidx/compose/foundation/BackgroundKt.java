package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a(\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "Landroidx/compose/ui/graphics/Shape;", "shape", "t", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/graphics/Brush;", "brush", "", "alpha", c.f62177j, "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;F)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBackground.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Background.kt\nandroidx/compose/foundation/BackgroundKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,199:1\n110#2:200\n110#2:201\n*S KotlinDebug\n*F\n+ 1 Background.kt\nandroidx/compose/foundation/BackgroundKt\n*L\n55#1:200\n86#1:201\n*E\n"})
public final class BackgroundKt {
    public static final Modifier n(Modifier modifier, final Brush brush, final Shape shape, final float f3) {
        return modifier.Zmq(new BackgroundElement(0L, brush, f3, shape, InspectableValueKt.rl() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.BackgroundKt$background$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                n(inspectorInfo);
                return Unit.INSTANCE;
            }

            public final void n(InspectorInfo inspectorInfo) {
                inspectorInfo.rl("background");
                inspectorInfo.getProperties().n("alpha", Float.valueOf(f3));
                inspectorInfo.getProperties().n("brush", brush);
                inspectorInfo.getProperties().n("shape", shape);
            }
        } : InspectableValueKt.n(), 1, null));
    }

    public static /* synthetic */ Modifier nr(Modifier modifier, long j2, Shape shape, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            shape = RectangleShapeKt.n();
        }
        return t(modifier, j2, shape);
    }

    public static /* synthetic */ Modifier rl(Modifier modifier, Brush brush, Shape shape, float f3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            shape = RectangleShapeKt.n();
        }
        if ((i2 & 4) != 0) {
            f3 = 1.0f;
        }
        return n(modifier, brush, shape, f3);
    }

    public static final Modifier t(Modifier modifier, final long j2, final Shape shape) {
        Function1<InspectorInfo, Unit> function1N;
        if (InspectableValueKt.rl()) {
            function1N = new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.BackgroundKt$background-bw27NRU$$inlined$debugInspectorInfo$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                    n(inspectorInfo);
                    return Unit.INSTANCE;
                }

                public final void n(InspectorInfo inspectorInfo) {
                    inspectorInfo.rl("background");
                    inspectorInfo.t(Color.xMQ(j2));
                    inspectorInfo.getProperties().n(TtmlNode.ATTR_TTS_COLOR, Color.xMQ(j2));
                    inspectorInfo.getProperties().n("shape", shape);
                }
            };
        } else {
            function1N = InspectableValueKt.n();
        }
        return modifier.Zmq(new BackgroundElement(j2, null, 1.0f, shape, function1N, 2, null));
    }
}
