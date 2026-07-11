package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.WrapContentElement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u001e\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001e\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u001e\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0004\u001a&\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a*\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\n\u001a*\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\n\u001a>\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001e\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0004\u001a\u001e\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0004\u001a\u001e\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0004\u001a&\u0010\u001b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\n\u001a*\u0010\u001c\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\n\u001a>\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0017\u001a\u001d\u0010 \u001a\u00020\u0000*\u00020\u00002\b\b\u0003\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b \u0010\u0004\u001a\u001d\u0010!\u001a\u00020\u0000*\u00020\u00002\b\b\u0003\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b!\u0010\u0004\u001a\u001d\u0010\"\u001a\u00020\u0000*\u00020\u00002\b\b\u0003\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\"\u0010\u0004\u001a'\u0010'\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b'\u0010(\u001a'\u0010*\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010$\u001a\u00020)2\b\b\u0002\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b*\u0010+\u001a'\u0010-\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010$\u001a\u00020,2\b\b\u0002\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b-\u0010.\u001a*\u0010/\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u0010\n\"\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00101\"\u0014\u00104\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101\"\u0014\u00105\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00101\"\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108\"\u0014\u0010:\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00108\"\u0014\u0010<\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00108\"\u0014\u0010=\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00108\"\u0014\u0010?\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00108\"\u0014\u0010@\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00108\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006A"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "width", "ViF", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "height", "xMQ", "size", "Z", "S", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/DpSize;", "XQ", "(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;", "min", "max", "nY", "mUb", "minWidth", "minHeight", "maxWidth", "maxHeight", "WPU", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "o", "qie", "HI", "ck", "az", "Ik", "", "fraction", "Uo", "t", "O", "Landroidx/compose/ui/Alignment$Horizontal;", "align", "", "unbounded", "e", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Horizontal;Z)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Alignment$Vertical;", "te", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Vertical;Z)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Alignment;", "fD", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/Modifier;", c.f62177j, "Landroidx/compose/foundation/layout/FillElement;", "Landroidx/compose/foundation/layout/FillElement;", "FillWholeMaxWidth", "rl", "FillWholeMaxHeight", "FillWholeMaxSize", "Landroidx/compose/foundation/layout/WrapContentElement;", "nr", "Landroidx/compose/foundation/layout/WrapContentElement;", "WrapContentWidthCenter", "WrapContentWidthStart", "J2", "WrapContentHeightCenter", "WrapContentHeightTop", "KN", "WrapContentSizeCenter", "WrapContentSizeTopStart", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,1134:1\n110#2:1135\n110#2:1136\n110#2:1137\n110#2:1138\n110#2:1139\n110#2:1140\n110#2:1141\n110#2:1142\n110#2:1143\n110#2:1144\n110#2:1145\n110#2:1146\n110#2:1147\n110#2:1148\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n68#1:1135\n95#1:1136\n124#1:1137\n154#1:1138\n189#1:1139\n211#1:1140\n240#1:1141\n272#1:1142\n302#1:1143\n334#1:1144\n362#1:1145\n397#1:1146\n420#1:1147\n451#1:1148\n*E\n"})
public final class SizeKt {
    private static final WrapContentElement J2;
    private static final WrapContentElement KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final WrapContentElement f17792O;
    private static final WrapContentElement Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final FillElement f17793n;
    private static final WrapContentElement nr;
    private static final FillElement rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final FillElement f17794t;
    private static final WrapContentElement xMQ;

    static {
        FillElement.Companion companion = FillElement.INSTANCE;
        f17793n = companion.t(1.0f);
        rl = companion.n(1.0f);
        f17794t = companion.rl(1.0f);
        WrapContentElement.Companion companion2 = WrapContentElement.INSTANCE;
        Alignment.Companion companion3 = Alignment.INSTANCE;
        nr = companion2.t(companion3.Uo(), false);
        f17792O = companion2.t(companion3.gh(), false);
        J2 = companion2.n(companion3.xMQ(), false);
        Uo = companion2.n(companion3.qie(), false);
        KN = companion2.rl(companion3.O(), false);
        xMQ = companion2.rl(companion3.HI(), false);
    }

    public static /* synthetic */ Modifier E2(Modifier modifier, Alignment alignment, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            alignment = Alignment.INSTANCE.O();
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return fD(modifier, alignment, z2);
    }

    public static final Modifier Ik(Modifier modifier, final float f3, final float f4, final float f5, final float f6) {
        return modifier.Zmq(new SizeElement(f3, f4, f5, f6, false, InspectableValueKt.rl() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSizeIn-qDBjuR0$$inlined$debugInspectorInfo$1
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
                inspectorInfo.rl("requiredSizeIn");
                inspectorInfo.getProperties().n("minWidth", Dp.nr(f3));
                inspectorInfo.getProperties().n("minHeight", Dp.nr(f4));
                inspectorInfo.getProperties().n("maxWidth", Dp.nr(f5));
                inspectorInfo.getProperties().n("maxHeight", Dp.nr(f6));
            }
        } : InspectableValueKt.n(), null));
    }

    public static /* synthetic */ Modifier J2(Modifier modifier, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = 1.0f;
        }
        return O(modifier, f3);
    }

    public static /* synthetic */ Modifier KN(Modifier modifier, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = 1.0f;
        }
        return Uo(modifier, f3);
    }

    public static final Modifier O(Modifier modifier, float f3) {
        return modifier.Zmq(f3 == 1.0f ? f17794t : FillElement.INSTANCE.rl(f3));
    }

    public static final Modifier Uo(Modifier modifier, float f3) {
        return modifier.Zmq(f3 == 1.0f ? f17793n : FillElement.INSTANCE.t(f3));
    }

    public static final Modifier ViF(Modifier modifier, final float f3) {
        return modifier.Zmq(new SizeElement(f3, 0.0f, f3, 0.0f, true, InspectableValueKt.rl() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$width-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.rl("width");
                inspectorInfo.t(Dp.nr(f3));
            }
        } : InspectableValueKt.n(), 10, null));
    }

    public static final Modifier WPU(Modifier modifier, final float f3, final float f4, final float f5, final float f6) {
        return modifier.Zmq(new SizeElement(f3, f4, f5, f6, true, InspectableValueKt.rl() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$sizeIn-qDBjuR0$$inlined$debugInspectorInfo$1
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
                inspectorInfo.rl("sizeIn");
                inspectorInfo.getProperties().n("minWidth", Dp.nr(f3));
                inspectorInfo.getProperties().n("minHeight", Dp.nr(f4));
                inspectorInfo.getProperties().n("maxWidth", Dp.nr(f5));
                inspectorInfo.getProperties().n("maxHeight", Dp.nr(f6));
            }
        } : InspectableValueKt.n(), null));
    }

    public static /* synthetic */ Modifier X(Modifier modifier, Alignment.Horizontal horizontal, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            horizontal = Alignment.INSTANCE.Uo();
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return e(modifier, horizontal, z2);
    }

    public static /* synthetic */ Modifier aYN(Modifier modifier, float f3, float f4, float f5, float f6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = Dp.INSTANCE.t();
        }
        if ((i2 & 2) != 0) {
            f4 = Dp.INSTANCE.t();
        }
        if ((i2 & 4) != 0) {
            f5 = Dp.INSTANCE.t();
        }
        if ((i2 & 8) != 0) {
            f6 = Dp.INSTANCE.t();
        }
        return WPU(modifier, f3, f4, f5, f6);
    }

    public static final Modifier az(Modifier modifier, final float f3, final float f4) {
        return modifier.Zmq(new SizeElement(0.0f, f3, 0.0f, f4, false, InspectableValueKt.rl() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredHeightIn-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.rl("requiredHeightIn");
                inspectorInfo.getProperties().n("min", Dp.nr(f3));
                inspectorInfo.getProperties().n("max", Dp.nr(f4));
            }
        } : InspectableValueKt.n(), 5, null));
    }

    public static final Modifier e(Modifier modifier, Alignment.Horizontal horizontal, boolean z2) {
        Alignment.Companion companion = Alignment.INSTANCE;
        return modifier.Zmq((!Intrinsics.areEqual(horizontal, companion.Uo()) || z2) ? (!Intrinsics.areEqual(horizontal, companion.gh()) || z2) ? WrapContentElement.INSTANCE.t(horizontal, z2) : f17792O : nr);
    }

    public static final Modifier fD(Modifier modifier, Alignment alignment, boolean z2) {
        Alignment.Companion companion = Alignment.INSTANCE;
        return modifier.Zmq((!Intrinsics.areEqual(alignment, companion.O()) || z2) ? (!Intrinsics.areEqual(alignment, companion.HI()) || z2) ? WrapContentElement.INSTANCE.rl(alignment, z2) : xMQ : KN);
    }

    public static /* synthetic */ Modifier g(Modifier modifier, float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = Dp.INSTANCE.t();
        }
        if ((i2 & 2) != 0) {
            f4 = Dp.INSTANCE.t();
        }
        return nY(modifier, f3, f4);
    }

    public static /* synthetic */ Modifier gh(Modifier modifier, float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = Dp.INSTANCE.t();
        }
        if ((i2 & 2) != 0) {
            f4 = Dp.INSTANCE.t();
        }
        return mUb(modifier, f3, f4);
    }

    public static /* synthetic */ Modifier iF(Modifier modifier, Alignment.Vertical vertical, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            vertical = Alignment.INSTANCE.xMQ();
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return te(modifier, vertical, z2);
    }

    public static final Modifier mUb(Modifier modifier, final float f3, final float f4) {
        return modifier.Zmq(new SizeElement(0.0f, f3, 0.0f, f4, true, InspectableValueKt.rl() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$heightIn-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.rl("heightIn");
                inspectorInfo.getProperties().n("min", Dp.nr(f3));
                inspectorInfo.getProperties().n("max", Dp.nr(f4));
            }
        } : InspectableValueKt.n(), 5, null));
    }

    public static final Modifier n(Modifier modifier, float f3, float f4) {
        return modifier.Zmq(new UnspecifiedConstraintsElement(f3, f4, null));
    }

    public static final Modifier nY(Modifier modifier, final float f3, final float f4) {
        return modifier.Zmq(new SizeElement(f3, 0.0f, f4, 0.0f, true, InspectableValueKt.rl() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$widthIn-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.rl("widthIn");
                inspectorInfo.getProperties().n("min", Dp.nr(f3));
                inspectorInfo.getProperties().n("max", Dp.nr(f4));
            }
        } : InspectableValueKt.n(), 10, null));
    }

    public static /* synthetic */ Modifier nr(Modifier modifier, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = 1.0f;
        }
        return t(modifier, f3);
    }

    public static final Modifier o(Modifier modifier, final float f3) {
        return modifier.Zmq(new SizeElement(f3, 0.0f, f3, 0.0f, false, InspectableValueKt.rl() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredWidth-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.rl("requiredWidth");
                inspectorInfo.t(Dp.nr(f3));
            }
        } : InspectableValueKt.n(), 10, null));
    }

    public static final Modifier qie(Modifier modifier, final float f3) {
        return modifier.Zmq(new SizeElement(0.0f, f3, 0.0f, f3, false, InspectableValueKt.rl() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredHeight-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.rl("requiredHeight");
                inspectorInfo.t(Dp.nr(f3));
            }
        } : InspectableValueKt.n(), 5, null));
    }

    public static /* synthetic */ Modifier r(Modifier modifier, float f3, float f4, float f5, float f6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = Dp.INSTANCE.t();
        }
        if ((i2 & 2) != 0) {
            f4 = Dp.INSTANCE.t();
        }
        if ((i2 & 4) != 0) {
            f5 = Dp.INSTANCE.t();
        }
        if ((i2 & 8) != 0) {
            f6 = Dp.INSTANCE.t();
        }
        return Ik(modifier, f3, f4, f5, f6);
    }

    public static /* synthetic */ Modifier rl(Modifier modifier, float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = Dp.INSTANCE.t();
        }
        if ((i2 & 2) != 0) {
            f4 = Dp.INSTANCE.t();
        }
        return n(modifier, f3, f4);
    }

    public static final Modifier t(Modifier modifier, float f3) {
        return modifier.Zmq(f3 == 1.0f ? rl : FillElement.INSTANCE.n(f3));
    }

    public static final Modifier te(Modifier modifier, Alignment.Vertical vertical, boolean z2) {
        Alignment.Companion companion = Alignment.INSTANCE;
        return modifier.Zmq((!Intrinsics.areEqual(vertical, companion.xMQ()) || z2) ? (!Intrinsics.areEqual(vertical, companion.qie()) || z2) ? WrapContentElement.INSTANCE.n(vertical, z2) : Uo : J2);
    }

    public static /* synthetic */ Modifier ty(Modifier modifier, float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = Dp.INSTANCE.t();
        }
        if ((i2 & 2) != 0) {
            f4 = Dp.INSTANCE.t();
        }
        return az(modifier, f3, f4);
    }

    public static final Modifier xMQ(Modifier modifier, final float f3) {
        return modifier.Zmq(new SizeElement(0.0f, f3, 0.0f, f3, true, InspectableValueKt.rl() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$height-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.rl("height");
                inspectorInfo.t(Dp.nr(f3));
            }
        } : InspectableValueKt.n(), 5, null));
    }

    public static final Modifier HI(Modifier modifier, final float f3) {
        Function1<InspectorInfo, Unit> function1N;
        if (InspectableValueKt.rl()) {
            function1N = new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSize-3ABfNKs$$inlined$debugInspectorInfo$1
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
                    inspectorInfo.rl("requiredSize");
                    inspectorInfo.t(Dp.nr(f3));
                }
            };
        } else {
            function1N = InspectableValueKt.n();
        }
        return modifier.Zmq(new SizeElement(f3, f3, f3, f3, false, function1N, null));
    }

    public static final Modifier S(Modifier modifier, final float f3, final float f4) {
        Function1<InspectorInfo, Unit> function1N;
        if (InspectableValueKt.rl()) {
            function1N = new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$size-VpY3zN4$$inlined$debugInspectorInfo$1
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
                    inspectorInfo.rl("size");
                    inspectorInfo.getProperties().n("width", Dp.nr(f3));
                    inspectorInfo.getProperties().n("height", Dp.nr(f4));
                }
            };
        } else {
            function1N = InspectableValueKt.n();
        }
        return modifier.Zmq(new SizeElement(f3, f4, f3, f4, true, function1N, null));
    }

    public static final Modifier XQ(Modifier modifier, long j2) {
        return S(modifier, DpSize.mUb(j2), DpSize.xMQ(j2));
    }

    public static final Modifier Z(Modifier modifier, final float f3) {
        Function1<InspectorInfo, Unit> function1N;
        if (InspectableValueKt.rl()) {
            function1N = new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$size-3ABfNKs$$inlined$debugInspectorInfo$1
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
                    inspectorInfo.rl("size");
                    inspectorInfo.t(Dp.nr(f3));
                }
            };
        } else {
            function1N = InspectableValueKt.n();
        }
        return modifier.Zmq(new SizeElement(f3, f3, f3, f3, true, function1N, null));
    }

    public static final Modifier ck(Modifier modifier, final float f3, final float f4) {
        Function1<InspectorInfo, Unit> function1N;
        if (InspectableValueKt.rl()) {
            function1N = new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSize-VpY3zN4$$inlined$debugInspectorInfo$1
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
                    inspectorInfo.rl("requiredSize");
                    inspectorInfo.getProperties().n("width", Dp.nr(f3));
                    inspectorInfo.getProperties().n("height", Dp.nr(f4));
                }
            };
        } else {
            function1N = InspectableValueKt.n();
        }
        return modifier.Zmq(new SizeElement(f3, f4, f3, f4, false, function1N, null));
    }
}
