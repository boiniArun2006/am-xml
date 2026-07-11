package androidx.compose.foundation;

import GJW.h;
import ILs.C;
import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u009b\u0001\u0012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t\u0012\u001b\b\u0002\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\b\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u0092\u0001\u0010 \u001a\u00020\r2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t2\u0019\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\b\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00112\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u0018ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\rH\u0016¢\u0006\u0004\b\"\u0010\u001dJ\u000f\u0010#\u001a\u00020\rH\u0016¢\u0006\u0004\b#\u0010\u001dJ\u000f\u0010$\u001a\u00020\rH\u0016¢\u0006\u0004\b$\u0010\u001dJ\u0013\u0010&\u001a\u00020\r*\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\r2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0013\u0010-\u001a\u00020\r*\u00020,H\u0016¢\u0006\u0004\b-\u0010.R3\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R5\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\b\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00100\u001a\u0004\b6\u00102\"\u0004\b7\u00104R0\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00100\u001a\u0004\b9\u00102\"\u0004\b:\u00104R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER(\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR(\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bL\u0010<\u001a\u0004\bM\u0010>\"\u0004\bN\u0010@R(\u0010\u0016\u001a\u00020\u00148\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bO\u0010<\u001a\u0004\bP\u0010>\"\u0004\bQ\u0010@R\"\u0010\u0017\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010A\u001a\u0004\bS\u0010C\"\u0004\bT\u0010ER\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0018\u0010]\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010\\R\u0018\u0010`\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010c\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010bR/\u0010j\u001a\u0004\u0018\u00010(2\b\u0010d\u001a\u0004\u0018\u00010(8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010+R\u001e\u0010n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u001c\u0010p\u001a\u00020\b8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bo\u0010GR\u001e\u0010t\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\br\u0010sR\u001e\u0010x\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u001a\u0010z\u001a\u00020\b8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\by\u0010I\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006{"}, d2 = {"Landroidx/compose/foundation/MagnifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ExtensionFunctionType;", "sourceCenter", "magnifierCenter", "Landroidx/compose/ui/unit/DpSize;", "", "onSizeChanged", "", "zoom", "", "useTextDefault", "size", "Landroidx/compose/ui/unit/Dp;", "cornerRadius", "elevation", "clippingEnabled", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "platformMagnifierFactory", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FZJFFZLandroidx/compose/foundation/PlatformMagnifierFactory;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", CmcdConfiguration.KEY_PLAYBACK_RATE, "()V", "Vd", "b", "GT", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FZJFFZLkotlin/jvm/functions/Function1;Landroidx/compose/foundation/PlatformMagnifierFactory;)V", "c", "Sax", "UhV", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "N", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "P5", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "FX", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "v", "Lkotlin/jvm/functions/Function1;", "getSourceCenter", "()Lkotlin/jvm/functions/Function1;", "setSourceCenter", "(Lkotlin/jvm/functions/Function1;)V", "Xw", "getMagnifierCenter", "setMagnifierCenter", "jB", "getOnSizeChanged", "setOnSizeChanged", "U", "F", "getZoom", "()F", "setZoom", "(F)V", "Z", "getUseTextDefault", "()Z", "setUseTextDefault", "(Z)V", "M7", "J", "getSize-MYxV2XQ", "()J", "setSize-EaSLcWc", "(J)V", "p5", "getCornerRadius-D9Ej5fM", "setCornerRadius-0680j_4", "eF", "getElevation-D9Ej5fM", "setElevation-0680j_4", "E", "getClippingEnabled", "setClippingEnabled", "M", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "getPlatformMagnifierFactory", "()Landroidx/compose/foundation/PlatformMagnifierFactory;", "setPlatformMagnifierFactory", "(Landroidx/compose/foundation/PlatformMagnifierFactory;)V", "Landroid/view/View;", "Landroid/view/View;", "view", "B", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/foundation/PlatformMagnifier;", "Landroidx/compose/foundation/PlatformMagnifier;", "magnifier", "<set-?>", "D", "Landroidx/compose/runtime/MutableState;", "fD", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "ni", "layoutCoordinates", "Landroidx/compose/runtime/State;", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "Landroidx/compose/runtime/State;", "anchorPositionInRootState", "I", "sourceCenterInRoot", "Landroidx/compose/ui/unit/IntSize;", "GR", "Landroidx/compose/ui/unit/IntSize;", "previousSize", "LILs/CN3;", "Nxk", "LILs/CN3;", "drawSignalChannel", "W1c", "anchorPositionInRoot", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMagnifier.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Magnifier.android.kt\nandroidx/compose/foundation/MagnifierNode\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,496:1\n85#2:497\n113#2,2:498\n1#3:500\n273#4:501\n273#4:502\n*S KotlinDebug\n*F\n+ 1 Magnifier.android.kt\nandroidx/compose/foundation/MagnifierNode\n*L\n282#1:497\n282#1:498,2\n427#1:501\n434#1:502\n*E\n"})
public final class MagnifierNode extends Modifier.Node implements GlobalPositionAwareModifierNode, DrawModifierNode, SemanticsModifierNode, ObserverModifierNode {

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private Density density;

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final MutableState layoutCoordinates;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private boolean clippingEnabled;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private View view;

    /* JADX INFO: renamed from: GR, reason: collision with root package name and from kotlin metadata */
    private IntSize previousSize;

    /* JADX INFO: renamed from: I, reason: collision with root package name and from kotlin metadata */
    private long sourceCenterInRoot;

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private PlatformMagnifier magnifier;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private PlatformMagnifierFactory platformMagnifierFactory;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private long size;

    /* JADX INFO: renamed from: Nxk, reason: from kotlin metadata */
    private ILs.CN3 drawSignalChannel;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private boolean useTextDefault;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private float zoom;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private Function1 magnifierCenter;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private State anchorPositionInRootState;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private float elevation;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private Function1 onSizeChanged;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private float cornerRadius;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private Function1 sourceCenter;

    public /* synthetic */ MagnifierNode(Function1 function1, Function1 function12, Function1 function13, float f3, boolean z2, long j2, float f4, float f5, boolean z3, PlatformMagnifierFactory platformMagnifierFactory, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, function12, function13, f3, z2, j2, f4, f5, z3, platformMagnifierFactory);
    }

    public /* synthetic */ MagnifierNode(Function1 function1, Function1 function12, Function1 function13, float f3, boolean z2, long j2, float f4, float f5, boolean z3, PlatformMagnifierFactory platformMagnifierFactory, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, (i2 & 2) != 0 ? null : function12, (i2 & 4) != 0 ? null : function13, (i2 & 8) != 0 ? Float.NaN : f3, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? DpSize.INSTANCE.n() : j2, (i2 & 64) != 0 ? Dp.INSTANCE.t() : f4, (i2 & 128) != 0 ? Dp.INSTANCE.t() : f5, (i2 & 256) != 0 ? true : z3, (i2 & 512) != 0 ? PlatformMagnifierFactory.INSTANCE.n() : platformMagnifierFactory, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Vd() {
        long jRl;
        Density densityGh = this.density;
        if (densityGh == null) {
            densityGh = DelegatableNodeKt.gh(this);
            this.density = densityGh;
        }
        long packedValue = ((Offset) this.sourceCenter.invoke(densityGh)).getPackedValue();
        if ((packedValue & 9223372034707292159L) == 9205357640488583168L || (W1c() & 9223372034707292159L) == 9205357640488583168L) {
            this.sourceCenterInRoot = Offset.INSTANCE.rl();
            PlatformMagnifier platformMagnifier = this.magnifier;
            if (platformMagnifier != null) {
                platformMagnifier.dismiss();
                return;
            }
            return;
        }
        this.sourceCenterInRoot = Offset.Ik(W1c(), packedValue);
        Function1 function1 = this.magnifierCenter;
        if (function1 != null) {
            Offset offsetNr = Offset.nr(((Offset) function1.invoke(densityGh)).getPackedValue());
            if ((offsetNr.getPackedValue() & 9223372034707292159L) == 9205357640488583168L) {
                offsetNr = null;
            }
            if (offsetNr != null) {
                jRl = Offset.Ik(W1c(), offsetNr.getPackedValue());
            } else {
                jRl = Offset.INSTANCE.rl();
            }
        }
        long j2 = jRl;
        if (this.magnifier == null) {
            pr();
        }
        PlatformMagnifier platformMagnifier2 = this.magnifier;
        if (platformMagnifier2 != null) {
            platformMagnifier2.rl(this.sourceCenterInRoot, j2, this.zoom);
        }
        b();
    }

    private final long W1c() {
        if (this.anchorPositionInRootState == null) {
            this.anchorPositionInRootState = SnapshotStateKt.O(new Function0<Offset>() { // from class: androidx.compose.foundation.MagnifierNode$anchorPositionInRoot$1
                {
                    super(0);
                }

                public final long n() {
                    LayoutCoordinates layoutCoordinatesFD = this.f16186n.fD();
                    return layoutCoordinatesFD != null ? LayoutCoordinatesKt.J2(layoutCoordinatesFD) : Offset.INSTANCE.rl();
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Offset invoke() {
                    return Offset.nr(n());
                }
            });
        }
        State state = this.anchorPositionInRootState;
        return state != null ? ((Offset) state.getValue()).getPackedValue() : Offset.INSTANCE.rl();
    }

    private final void b() {
        Density density;
        PlatformMagnifier platformMagnifier = this.magnifier;
        if (platformMagnifier == null || (density = this.density) == null || IntSize.nr(platformMagnifier.n(), this.previousSize)) {
            return;
        }
        Function1 function1 = this.onSizeChanged;
        if (function1 != null) {
            function1.invoke(DpSize.t(density.Ik(IntSizeKt.O(platformMagnifier.n()))));
        }
        this.previousSize = IntSize.rl(platformMagnifier.n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates fD() {
        return (LayoutCoordinates) this.layoutCoordinates.getValue();
    }

    private final void ni(LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates.setValue(layoutCoordinates);
    }

    private final void pr() {
        PlatformMagnifier platformMagnifier = this.magnifier;
        if (platformMagnifier != null) {
            platformMagnifier.dismiss();
        }
        View viewN = this.view;
        if (viewN == null) {
            viewN = DelegatableNode_androidKt.n(this);
        }
        View view = viewN;
        this.view = view;
        Density densityGh = this.density;
        if (densityGh == null) {
            densityGh = DelegatableNodeKt.gh(this);
        }
        Density density = densityGh;
        this.density = density;
        this.magnifier = this.platformMagnifierFactory.n(view, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, density, this.zoom);
        b();
    }

    public final void GT(Function1 sourceCenter, Function1 magnifierCenter, float zoom, boolean useTextDefault, long size, float cornerRadius, float elevation, boolean clippingEnabled, Function1 onSizeChanged, PlatformMagnifierFactory platformMagnifierFactory) {
        float f3 = this.zoom;
        long j2 = this.size;
        float f4 = this.cornerRadius;
        boolean z2 = this.useTextDefault;
        float f5 = this.elevation;
        boolean z3 = this.clippingEnabled;
        PlatformMagnifierFactory platformMagnifierFactory2 = this.platformMagnifierFactory;
        View view = this.view;
        Density density = this.density;
        this.sourceCenter = sourceCenter;
        this.magnifierCenter = magnifierCenter;
        this.zoom = zoom;
        this.useTextDefault = useTextDefault;
        this.size = size;
        this.cornerRadius = cornerRadius;
        this.elevation = elevation;
        this.clippingEnabled = clippingEnabled;
        this.onSizeChanged = onSizeChanged;
        this.platformMagnifierFactory = platformMagnifierFactory;
        View viewN = DelegatableNode_androidKt.n(this);
        Density densityGh = DelegatableNodeKt.gh(this);
        if (this.magnifier != null && ((!Magnifier_androidKt.n(zoom, f3) && !platformMagnifierFactory.rl()) || !DpSize.KN(size, j2) || !Dp.mUb(cornerRadius, f4) || !Dp.mUb(elevation, f5) || useTextDefault != z2 || clippingEnabled != z3 || !Intrinsics.areEqual(platformMagnifierFactory, platformMagnifierFactory2) || !Intrinsics.areEqual(viewN, view) || !Intrinsics.areEqual(densityGh, density))) {
            pr();
        }
        Vd();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void Sax() {
        PlatformMagnifier platformMagnifier = this.magnifier;
        if (platformMagnifier != null) {
            platformMagnifier.dismiss();
        }
        this.magnifier = null;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void UhV() {
        ObserverModifierNodeKt.n(this, new Function0<Unit>() { // from class: androidx.compose.foundation.MagnifierNode$onObservedReadsChanged$1
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
                this.f16191n.Vd();
            }
        });
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void FX(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.t(Magnifier_androidKt.rl(), new Function0<Offset>() { // from class: androidx.compose.foundation.MagnifierNode$applySemantics$1
            {
                super(0);
            }

            public final long n() {
                return this.f16187n.sourceCenterInRoot;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Offset invoke() {
                return Offset.nr(n());
            }
        });
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void N(ContentDrawScope contentDrawScope) {
        contentDrawScope.l2();
        ILs.CN3 cn3 = this.drawSignalChannel;
        if (cn3 != null) {
            C.rl(cn3.nr(Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void P5(LayoutCoordinates coordinates) {
        ni(coordinates);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void c() {
        UhV();
        this.drawSignalChannel = ILs.aC.rl(0, null, null, 7, null);
        GJW.C.nr(Xli(), null, h.J2, new MagnifierNode$onAttach$1(this, null), 1, null);
    }

    private MagnifierNode(Function1 function1, Function1 function12, Function1 function13, float f3, boolean z2, long j2, float f4, float f5, boolean z3, PlatformMagnifierFactory platformMagnifierFactory) {
        this.sourceCenter = function1;
        this.magnifierCenter = function12;
        this.onSizeChanged = function13;
        this.zoom = f3;
        this.useTextDefault = z2;
        this.size = j2;
        this.cornerRadius = f4;
        this.elevation = f5;
        this.clippingEnabled = z3;
        this.platformMagnifierFactory = platformMagnifierFactory;
        this.layoutCoordinates = SnapshotStateKt.xMQ(null, SnapshotStateKt.gh());
        this.sourceCenterInRoot = Offset.INSTANCE.rl();
    }
}
