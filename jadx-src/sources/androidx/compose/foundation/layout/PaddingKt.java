package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a>\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001e\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0015\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0017\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0017\u0010\u0016\u001a\u001a\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a&\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a:\u0010\u001c\u001a\u00020\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", TtmlNode.START, "top", TtmlNode.END, "bottom", "qie", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "horizontal", "vertical", "mUb", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "all", "xMQ", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "KN", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Uo", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F", "J2", c.f62177j, "(F)Landroidx/compose/foundation/layout/PaddingValues;", "rl", "(FF)Landroidx/compose/foundation/layout/PaddingValues;", "nr", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,472:1\n113#2:473\n113#2:474\n113#2:475\n113#2:476\n113#2:477\n113#2:478\n113#2:479\n113#2:480\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n*L\n53#1:473\n83#1:474\n162#1:475\n274#1:476\n284#1:477\n285#1:478\n286#1:479\n287#1:480\n*E\n"})
public final class PaddingKt {
    public static final float J2(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.f34160n ? paddingValues.t(layoutDirection) : paddingValues.rl(layoutDirection);
    }

    public static final Modifier KN(Modifier modifier, final PaddingValues paddingValues) {
        return modifier.Zmq(new PaddingValuesElement(paddingValues, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                n(inspectorInfo);
                return Unit.INSTANCE;
            }

            public final void n(InspectorInfo inspectorInfo) {
                inspectorInfo.rl("padding");
                inspectorInfo.getProperties().n("paddingValues", paddingValues);
            }
        }));
    }

    public static /* synthetic */ PaddingValues O(float f3, float f4, float f5, float f6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = Dp.KN(0);
        }
        if ((i2 & 2) != 0) {
            f4 = Dp.KN(0);
        }
        if ((i2 & 4) != 0) {
            f5 = Dp.KN(0);
        }
        if ((i2 & 8) != 0) {
            f6 = Dp.KN(0);
        }
        return nr(f3, f4, f5, f6);
    }

    public static final float Uo(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.f34160n ? paddingValues.rl(layoutDirection) : paddingValues.t(layoutDirection);
    }

    public static /* synthetic */ Modifier az(Modifier modifier, float f3, float f4, float f5, float f6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = Dp.KN(0);
        }
        if ((i2 & 2) != 0) {
            f4 = Dp.KN(0);
        }
        if ((i2 & 4) != 0) {
            f5 = Dp.KN(0);
        }
        if ((i2 & 8) != 0) {
            f6 = Dp.KN(0);
        }
        return qie(modifier, f3, f4, f5, f6);
    }

    public static /* synthetic */ Modifier gh(Modifier modifier, float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = Dp.KN(0);
        }
        if ((i2 & 2) != 0) {
            f4 = Dp.KN(0);
        }
        return mUb(modifier, f3, f4);
    }

    public static final Modifier mUb(Modifier modifier, final float f3, final float f4) {
        return modifier.Zmq(new PaddingElement(f3, f4, f3, f4, true, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding$2
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
                inspectorInfo.rl("padding");
                inspectorInfo.getProperties().n("horizontal", Dp.nr(f3));
                inspectorInfo.getProperties().n("vertical", Dp.nr(f4));
            }
        }, null));
    }

    public static final PaddingValues n(float f3) {
        return new PaddingValues(f3, f3, f3, f3, null);
    }

    public static final PaddingValues nr(float f3, float f4, float f5, float f6) {
        return new PaddingValues(f3, f4, f5, f6, null);
    }

    public static final Modifier qie(Modifier modifier, final float f3, final float f4, final float f5, final float f6) {
        return modifier.Zmq(new PaddingElement(f3, f4, f5, f6, true, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding$1
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
                inspectorInfo.rl("padding");
                inspectorInfo.getProperties().n(TtmlNode.START, Dp.nr(f3));
                inspectorInfo.getProperties().n("top", Dp.nr(f4));
                inspectorInfo.getProperties().n(TtmlNode.END, Dp.nr(f5));
                inspectorInfo.getProperties().n("bottom", Dp.nr(f6));
            }
        }, null));
    }

    public static final PaddingValues rl(float f3, float f4) {
        return new PaddingValues(f3, f4, f3, f4, null);
    }

    public static /* synthetic */ PaddingValues t(float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = Dp.KN(0);
        }
        if ((i2 & 2) != 0) {
            f4 = Dp.KN(0);
        }
        return rl(f3, f4);
    }

    public static final Modifier xMQ(Modifier modifier, final float f3) {
        return modifier.Zmq(new PaddingElement(f3, f3, f3, f3, true, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding$3
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
                inspectorInfo.rl("padding");
                inspectorInfo.t(Dp.nr(f3));
            }
        }, null));
    }
}
