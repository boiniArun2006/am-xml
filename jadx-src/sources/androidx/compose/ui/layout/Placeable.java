package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.MotionReferencePlacementDelegate;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\b'\u0018\u00002\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J=\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0019\u0010\r\u001a\u0015\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n¢\u0006\u0002\b\fH$ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R0\u0010&\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8\u0004@DX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R0\u0010+\u001a\u00020'2\u0006\u0010\u001f\u001a\u00020'8\u0004@DX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#\"\u0004\b*\u0010%R*\u0010.\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00068\u0004@BX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b,\u0010!\u001a\u0004\b-\u0010#R\u0014\u00100\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0019R\u0014\u00102\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, d2 = {"Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measured;", "<init>", "()V", "", CmcdData.OBJECT_TYPE_INIT_SEGMENT, "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "F", "(JFLkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "W", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "", "<set-?>", c.f62177j, "I", "UhV", "()I", "width", "t", "ul", "height", "Landroidx/compose/ui/unit/IntSize;", "value", "O", "J", "Rl", "()J", "QZ6", "(J)V", "measuredSize", "Landroidx/compose/ui/unit/Constraints;", "J2", "HV", "VwL", "measurementConstraints", "r", "eWT", "apparentToRealOffset", "mYa", "measuredWidth", "n1", "measuredHeight", "PlacementScope", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPlaceable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,567:1\n30#2:568\n80#3:569\n85#3:571\n90#3:573\n85#3:575\n90#3:577\n85#3:579\n90#3:581\n80#3:583\n54#4:570\n59#4:572\n54#4:574\n59#4:576\n54#4:578\n59#4:580\n32#5:582\n*S KotlinDebug\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable\n*L\n67#1:568\n67#1:569\n60#1:571\n64#1:573\n77#1:575\n82#1:577\n87#1:579\n87#1:581\n87#1:583\n60#1:570\n64#1:572\n77#1:574\n82#1:576\n87#1:578\n87#1:580\n87#1:582\n*E\n"})
public abstract class Placeable implements Measured {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private long measuredSize;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int width;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int height;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private long measurementConstraints = PlaceableKt.rl;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private long apparentToRealOffset = IntOffset.INSTANCE.rl();

    @StabilityInferred
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\f\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0011\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0013\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0012J&\u0010\u0014\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\rJA\u0010\u0019\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0002\b\u0017ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJF\u0010\u001b\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0002\b\u0017¢\u0006\u0004\b\u001b\u0010\u001cJF\u0010\u001d\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0002\b\u0017¢\u0006\u0004\b\u001d\u0010\u001cJA\u0010\u001e\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0002\b\u0017ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001aJ.\u0010!\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b!\u0010\"J.\u0010#\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b#\u0010\"J&\u0010%\u001a\u00020\u00052\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0002\b\u0017¢\u0006\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020\u000e8$X¤\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8$X¤\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0016\u00105\u001a\u0004\u0018\u0001028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00066"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "<init>", "()V", "Landroidx/compose/ui/layout/Placeable;", "", "Uo", "(Landroidx/compose/ui/layout/Placeable;)V", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "ty", "(Landroidx/compose/ui/layout/Placeable;JF)V", "", "x", "y", "qie", "(Landroidx/compose/ui/layout/Placeable;IIF)V", "KN", "mUb", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "r", "(Landroidx/compose/ui/layout/Placeable;JFLkotlin/jvm/functions/Function1;)V", "ck", "(Landroidx/compose/ui/layout/Placeable;IIFLkotlin/jvm/functions/Function1;)V", "S", "aYN", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "ViF", "(Landroidx/compose/ui/layout/Placeable;JLandroidx/compose/ui/graphics/layer/GraphicsLayer;F)V", "o", "block", "te", "(Lkotlin/jvm/functions/Function1;)V", "", c.f62177j, "Z", "motionFrameOfReferencePlacement", "J2", "()I", "parentWidth", "Landroidx/compose/ui/unit/LayoutDirection;", "O", "()Landroidx/compose/ui/unit/LayoutDirection;", "parentLayoutDirection", "Landroidx/compose/ui/layout/LayoutCoordinates;", "nr", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @PlacementScopeMarker
    @SourceDebugExtension({"SMAP\nPlaceable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,567:1\n432#1,2:568\n466#1,3:570\n435#1,2:573\n466#1,3:577\n441#1:580\n432#1,2:583\n466#1,3:585\n435#1,2:588\n466#1,3:590\n441#1:593\n466#1,3:596\n466#1,3:599\n432#1,2:602\n466#1,3:604\n435#1,2:607\n466#1,3:611\n441#1:614\n432#1,2:617\n466#1,3:619\n435#1,2:622\n466#1,3:624\n441#1:627\n466#1,3:630\n466#1,3:633\n476#1,3:638\n476#1,3:641\n449#1,2:646\n476#1,3:648\n452#1,2:651\n476#1,3:653\n458#1:656\n449#1,2:657\n476#1,3:659\n452#1,2:662\n476#1,3:666\n458#1:669\n466#1,3:670\n466#1,3:675\n476#1,3:678\n476#1,3:683\n32#2:575\n32#2:581\n32#2:594\n32#2:609\n32#2:615\n32#2:628\n32#2:636\n32#2:644\n32#2:664\n32#2:673\n32#2:681\n80#3:576\n80#3:582\n80#3:595\n80#3:610\n80#3:616\n80#3:629\n80#3:637\n80#3:645\n80#3:665\n80#3:674\n80#3:682\n*S KotlinDebug\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope\n*L\n208#1:568,2\n208#1:570,3\n208#1:573,2\n208#1:577,3\n208#1:580\n225#1:583,2\n225#1:585,3\n225#1:588,2\n225#1:590,3\n225#1:593\n239#1:596,3\n252#1:599,3\n274#1:602,2\n274#1:604,3\n274#1:607,2\n274#1:611,3\n274#1:614\n298#1:617,2\n298#1:619,3\n298#1:622,2\n298#1:624,3\n298#1:627\n319#1:630,3\n338#1:633,3\n359#1:638,3\n378#1:641,3\n402#1:646,2\n402#1:648,3\n402#1:651,2\n402#1:653,3\n402#1:656\n424#1:657,2\n424#1:659,3\n424#1:662,2\n424#1:666,3\n424#1:669\n433#1:670,3\n435#1:675,3\n450#1:678,3\n452#1:683,3\n208#1:575\n225#1:581\n239#1:594\n274#1:609\n298#1:615\n319#1:628\n359#1:636\n402#1:644\n424#1:664\n436#1:673\n453#1:681\n208#1:576\n225#1:582\n239#1:595\n274#1:610\n298#1:616\n319#1:629\n359#1:637\n402#1:645\n424#1:665\n436#1:674\n453#1:682\n*E\n"})
    public static abstract class PlacementScope {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private boolean motionFrameOfReferencePlacement;

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract int J2();

        public final void KN(Placeable placeable, int i2, int i3, float f3) {
            long jJ2 = IntOffset.J2((((long) i3) & 4294967295L) | (((long) i2) << 32));
            Uo(placeable);
            placeable.F(IntOffset.HI(jJ2, placeable.apparentToRealOffset), f3, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract LayoutDirection O();

        public final void S(Placeable placeable, int i2, int i3, float f3, Function1 function1) {
            long jJ2 = IntOffset.J2((((long) i3) & 4294967295L) | (((long) i2) << 32));
            Uo(placeable);
            placeable.F(IntOffset.HI(jJ2, placeable.apparentToRealOffset), f3, function1);
        }

        public final void ck(Placeable placeable, int i2, int i3, float f3, Function1 function1) {
            long jJ2 = IntOffset.J2((((long) i2) << 32) | (((long) i3) & 4294967295L));
            if (O() == LayoutDirection.f34160n || J2() == 0) {
                Uo(placeable);
                placeable.F(IntOffset.HI(jJ2, placeable.apparentToRealOffset), f3, function1);
            } else {
                long jJ22 = IntOffset.J2((((long) ((J2() - placeable.getWidth()) - IntOffset.gh(jJ2))) << 32) | (((long) IntOffset.qie(jJ2)) & 4294967295L));
                Uo(placeable);
                placeable.F(IntOffset.HI(jJ22, placeable.apparentToRealOffset), f3, function1);
            }
        }

        public LayoutCoordinates nr() {
            return null;
        }

        public final void qie(Placeable placeable, int i2, int i3, float f3) {
            long jJ2 = IntOffset.J2((((long) i2) << 32) | (((long) i3) & 4294967295L));
            if (O() == LayoutDirection.f34160n || J2() == 0) {
                Uo(placeable);
                placeable.F(IntOffset.HI(jJ2, placeable.apparentToRealOffset), f3, null);
            } else {
                long jJ22 = IntOffset.J2((((long) ((J2() - placeable.getWidth()) - IntOffset.gh(jJ2))) << 32) | (((long) IntOffset.qie(jJ2)) & 4294967295L));
                Uo(placeable);
                placeable.F(IntOffset.HI(jJ22, placeable.apparentToRealOffset), f3, null);
            }
        }

        public final void te(Function1 block) {
            this.motionFrameOfReferencePlacement = true;
            block.invoke(this);
            this.motionFrameOfReferencePlacement = false;
        }

        public static /* synthetic */ void HI(PlacementScope placementScope, Placeable placeable, long j2, float f3, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i2 & 2) != 0) {
                f3 = 0.0f;
            }
            placementScope.ty(placeable, j2, f3);
        }

        public static /* synthetic */ void Ik(PlacementScope placementScope, Placeable placeable, int i2, int i3, float f3, Function1 function1, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i5 & 4) != 0) {
                f3 = 0.0f;
            }
            float f4 = f3;
            if ((i5 & 8) != 0) {
                function1 = PlaceableKt.f32326n;
            }
            placementScope.ck(placeable, i2, i3, f4, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final void Uo(Placeable placeable) {
            if (placeable instanceof MotionReferencePlacementDelegate) {
                ((MotionReferencePlacementDelegate) placeable).P5(this.motionFrameOfReferencePlacement);
            }
        }

        public static /* synthetic */ void WPU(PlacementScope placementScope, Placeable placeable, int i2, int i3, float f3, Function1 function1, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i5 & 4) != 0) {
                f3 = 0.0f;
            }
            float f4 = f3;
            if ((i5 & 8) != 0) {
                function1 = PlaceableKt.f32326n;
            }
            placementScope.S(placeable, i2, i3, f4, function1);
        }

        public static /* synthetic */ void XQ(PlacementScope placementScope, Placeable placeable, long j2, GraphicsLayer graphicsLayer, float f3, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i2 & 4) != 0) {
                f3 = 0.0f;
            }
            placementScope.o(placeable, j2, graphicsLayer, f3);
        }

        public static /* synthetic */ void Z(PlacementScope placementScope, Placeable placeable, long j2, float f3, Function1 function1, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i2 & 2) != 0) {
                f3 = 0.0f;
            }
            float f4 = f3;
            if ((i2 & 4) != 0) {
                function1 = PlaceableKt.f32326n;
            }
            placementScope.r(placeable, j2, f4, function1);
        }

        public static /* synthetic */ void az(PlacementScope placementScope, Placeable placeable, int i2, int i3, float f3, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i5 & 4) != 0) {
                f3 = 0.0f;
            }
            placementScope.qie(placeable, i2, i3, f3);
        }

        public static /* synthetic */ void g(PlacementScope placementScope, Placeable placeable, long j2, GraphicsLayer graphicsLayer, float f3, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i2 & 4) != 0) {
                f3 = 0.0f;
            }
            placementScope.ViF(placeable, j2, graphicsLayer, f3);
        }

        public static /* synthetic */ void gh(PlacementScope placementScope, Placeable placeable, long j2, float f3, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i2 & 2) != 0) {
                f3 = 0.0f;
            }
            placementScope.mUb(placeable, j2, f3);
        }

        public static /* synthetic */ void nY(PlacementScope placementScope, Placeable placeable, long j2, float f3, Function1 function1, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i2 & 2) != 0) {
                f3 = 0.0f;
            }
            float f4 = f3;
            if ((i2 & 4) != 0) {
                function1 = PlaceableKt.f32326n;
            }
            placementScope.aYN(placeable, j2, f4, function1);
        }

        public static /* synthetic */ void xMQ(PlacementScope placementScope, Placeable placeable, int i2, int i3, float f3, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i5 & 4) != 0) {
                f3 = 0.0f;
            }
            placementScope.KN(placeable, i2, i3, f3);
        }

        public final void ViF(Placeable placeable, long j2, GraphicsLayer graphicsLayer, float f3) {
            Uo(placeable);
            placeable.W(IntOffset.HI(j2, placeable.apparentToRealOffset), f3, graphicsLayer);
        }

        public final void aYN(Placeable placeable, long j2, float f3, Function1 function1) {
            Uo(placeable);
            placeable.F(IntOffset.HI(j2, placeable.apparentToRealOffset), f3, function1);
        }

        public final void mUb(Placeable placeable, long j2, float f3) {
            Uo(placeable);
            placeable.F(IntOffset.HI(j2, placeable.apparentToRealOffset), f3, null);
        }

        public final void o(Placeable placeable, long j2, GraphicsLayer graphicsLayer, float f3) {
            if (O() == LayoutDirection.f34160n || J2() == 0) {
                Uo(placeable);
                placeable.W(IntOffset.HI(j2, placeable.apparentToRealOffset), f3, graphicsLayer);
                return;
            }
            int iJ2 = (J2() - placeable.getWidth()) - IntOffset.gh(j2);
            long jJ2 = IntOffset.J2((((long) IntOffset.qie(j2)) & 4294967295L) | (((long) iJ2) << 32));
            Uo(placeable);
            placeable.W(IntOffset.HI(jJ2, placeable.apparentToRealOffset), f3, graphicsLayer);
        }

        public final void r(Placeable placeable, long j2, float f3, Function1 function1) {
            if (O() == LayoutDirection.f34160n || J2() == 0) {
                Uo(placeable);
                placeable.F(IntOffset.HI(j2, placeable.apparentToRealOffset), f3, function1);
                return;
            }
            int iJ2 = (J2() - placeable.getWidth()) - IntOffset.gh(j2);
            long jJ2 = IntOffset.J2((((long) IntOffset.qie(j2)) & 4294967295L) | (((long) iJ2) << 32));
            Uo(placeable);
            placeable.F(IntOffset.HI(jJ2, placeable.apparentToRealOffset), f3, function1);
        }

        public final void ty(Placeable placeable, long j2, float f3) {
            if (O() == LayoutDirection.f34160n || J2() == 0) {
                Uo(placeable);
                placeable.F(IntOffset.HI(j2, placeable.apparentToRealOffset), f3, null);
                return;
            }
            int iJ2 = (J2() - placeable.getWidth()) - IntOffset.gh(j2);
            long jJ2 = IntOffset.J2((((long) IntOffset.qie(j2)) & 4294967295L) | (((long) iJ2) << 32));
            Uo(placeable);
            placeable.F(IntOffset.HI(jJ2, placeable.apparentToRealOffset), f3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void F(long position, float zIndex, Function1 layerBlock);

    /* JADX INFO: Access modifiers changed from: protected */
    public void W(long position, float zIndex, GraphicsLayer layer) {
        F(position, zIndex, null);
    }

    private final void i() {
        this.width = RangesKt.coerceIn((int) (this.measuredSize >> 32), Constraints.ty(this.measurementConstraints), Constraints.qie(this.measurementConstraints));
        int iCoerceIn = RangesKt.coerceIn((int) (this.measuredSize & 4294967295L), Constraints.az(this.measurementConstraints), Constraints.gh(this.measurementConstraints));
        this.height = iCoerceIn;
        int i2 = this.width;
        long j2 = this.measuredSize;
        this.apparentToRealOffset = IntOffset.J2((((long) ((i2 - ((int) (j2 >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iCoerceIn - ((int) (j2 & 4294967295L))) / 2))));
    }

    /* JADX INFO: renamed from: HV, reason: from getter */
    protected final long getMeasurementConstraints() {
        return this.measurementConstraints;
    }

    protected final void QZ6(long j2) {
        if (IntSize.O(this.measuredSize, j2)) {
            return;
        }
        this.measuredSize = j2;
        i();
    }

    /* JADX INFO: renamed from: Rl, reason: from getter */
    protected final long getMeasuredSize() {
        return this.measuredSize;
    }

    /* JADX INFO: renamed from: UhV, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void VwL(long j2) {
        if (Constraints.J2(this.measurementConstraints, j2)) {
            return;
        }
        this.measurementConstraints = j2;
        i();
    }

    /* JADX INFO: renamed from: eWT, reason: from getter */
    protected final long getApparentToRealOffset() {
        return this.apparentToRealOffset;
    }

    public int mYa() {
        return (int) (this.measuredSize >> 32);
    }

    public int n1() {
        return (int) (this.measuredSize & 4294967295L);
    }

    /* JADX INFO: renamed from: ul, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    public Placeable() {
        long j2 = 0;
        this.measuredSize = IntSize.t((j2 & 4294967295L) | (j2 << 32));
    }
}
