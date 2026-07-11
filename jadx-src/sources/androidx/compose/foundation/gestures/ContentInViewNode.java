package androidx.compose.foundation.gestures;

import GJW.C;
import GJW.Pl;
import GJW.eO;
import GJW.h;
import GJW.rv6;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.relocation.BringIntoViewResponder;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001YB)\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u0013J\"\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010!\u001a\u00020\t*\u00020\u00112\b\b\u0002\u0010 \u001a\u00020\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\"\u0010$\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020'*\u00020\u001c2\u0006\u0010&\u001a\u00020\u001cH\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020'*\u00020*2\u0006\u0010&\u001a\u00020*H\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010)J\u0017\u0010-\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u0011H\u0016¢\u0006\u0004\b-\u0010.J \u00100\u001a\u00020\u00142\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110/H\u0096@¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u00142\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b4\u00105J\u001a\u00106\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b6\u00107J'\u00108\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b8\u00109R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001a\u0010E\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010L\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010N\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010?R\u0016\u0010P\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010?R*\u0010V\u001a\u00020\u001c2\u0006\u0010Q\u001a\u00020\u001c8\u0000@BX\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0016\u0010X\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010?\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Z"}, d2 = {"Landroidx/compose/foundation/gestures/ContentInViewNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "scrollingLogic", "", "reverseDirection", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "bringIntoViewSpec", "<init>", "(Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/ScrollingLogic;ZLandroidx/compose/foundation/gestures/BringIntoViewSpec;)V", "cAB", "()Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "Landroidx/compose/ui/geometry/Rect;", "eOa", "()Landroidx/compose/ui/geometry/Rect;", "", "Yq", "()V", "", "b", "(Landroidx/compose/foundation/gestures/BringIntoViewSpec;)F", "kC", "childBounds", "Landroidx/compose/ui/unit/IntSize;", "containerSize", "jE", "(Landroidx/compose/ui/geometry/Rect;J)Landroidx/compose/ui/geometry/Rect;", "size", "VK2", "(Landroidx/compose/ui/geometry/Rect;J)Z", "Landroidx/compose/ui/geometry/Offset;", "f11", "(Landroidx/compose/ui/geometry/Rect;J)J", InneractiveMediationNameConsts.OTHER, "", "WKb", "(JJ)I", "Landroidx/compose/ui/geometry/Size;", "ZwA", "localRect", "D76", "(Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "Lkotlin/Function0;", "eo", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "newBounds", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "HI", "(J)V", "kR", "(Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/gestures/BringIntoViewSpec;)V", "v", "Landroidx/compose/foundation/gestures/Orientation;", "Xw", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "jB", "Z", "U", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "P5", "lRt", "()Z", "shouldAutoInvalidate", "Landroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue;", "M7", "Landroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue;", "bringIntoViewRequests", "p5", "Landroidx/compose/ui/layout/LayoutCoordinates;", "focusedChild", "eF", "trackingFocusedChild", "E", "childWasMaxVisibleBeforeViewportShrunk", "<set-?>", "M", "J", "i7", "()J", "viewportSize", "FX", "isAnimationRunning", "Request", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nContentInViewNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewNode.kt\nandroidx/compose/foundation/gestures/ContentInViewNode\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 10 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 11 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 12 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,471:1\n50#2,5:472\n50#2,5:489\n314#3,11:477\n1#4:488\n61#5:494\n57#5:497\n61#5:519\n57#5:526\n57#5:537\n61#5:540\n70#6:495\n60#6:498\n60#6:514\n70#6:517\n70#6:520\n53#6,3:523\n60#6:527\n53#6,3:530\n85#6:534\n90#6:536\n60#6:538\n70#6:541\n22#7:496\n22#7:499\n22#7:515\n22#7:518\n22#7:521\n22#7:528\n22#7:539\n22#7:542\n107#8,2:500\n109#8:511\n447#9,9:502\n150#10:512\n65#10:513\n69#10:516\n30#11:522\n30#11:529\n54#12:533\n59#12:535\n*S KotlinDebug\n*F\n+ 1 ContentInViewNode.kt\nandroidx/compose/foundation/gestures/ContentInViewNode\n*L\n119#1:472,5\n203#1:489,5\n135#1:477,11\n345#1:494\n351#1:497\n410#1:519\n420#1:526\n435#1:537\n436#1:540\n345#1:495\n351#1:498\n395#1:514\n396#1:517\n410#1:520\n403#1:523,3\n420#1:527\n414#1:530,3\n429#1:534\n430#1:536\n435#1:538\n436#1:541\n345#1:496\n351#1:499\n395#1:515\n396#1:518\n410#1:521\n420#1:528\n435#1:539\n436#1:542\n359#1:500,2\n359#1:511\n359#1:502,9\n385#1:512\n395#1:513\n396#1:516\n403#1:522\n414#1:529\n429#1:533\n430#1:535\n*E\n"})
public final class ContentInViewNode extends Modifier.Node implements BringIntoViewResponder, LayoutAwareModifierNode, CompositionLocalConsumerModifierNode {

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private boolean childWasMaxVisibleBeforeViewportShrunk;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private boolean isAnimationRunning;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private BringIntoViewSpec bringIntoViewSpec;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private final ScrollingLogic scrollingLogic;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private boolean trackingFocusedChild;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private boolean reverseDirection;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private LayoutCoordinates focusedChild;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private Orientation orientation;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private final BringIntoViewRequestPriorityQueue bringIntoViewRequests = new BringIntoViewRequestPriorityQueue();

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private long viewportSize = IntSize.INSTANCE.n();

    @StabilityInferred
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\r\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/gestures/ContentInViewNode$Request;", "", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "currentBounds", "LGJW/Pl;", "", "continuation", "<init>", "(Lkotlin/jvm/functions/Function0;LGJW/Pl;)V", "", "toString", "()Ljava/lang/String;", c.f62177j, "Lkotlin/jvm/functions/Function0;", "rl", "()Lkotlin/jvm/functions/Function0;", "LGJW/Pl;", "()LGJW/Pl;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nContentInViewNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewNode.kt\nandroidx/compose/foundation/gestures/ContentInViewNode$Request\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,471:1\n1#2:472\n*E\n"})
    public static final class Request {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final Function0 currentBounds;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private final Pl continuation;

        /* JADX INFO: renamed from: n, reason: from getter */
        public final Pl getContinuation() {
            return this.continuation;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final Function0 getCurrentBounds() {
            return this.currentBounds;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String toString() {
            String str;
            rv6 rv6Var = (rv6) this.continuation.get$context().get(rv6.f3506t);
            String name = rv6Var != null ? rv6Var.getName() : null;
            StringBuilder sb = new StringBuilder();
            sb.append("Request@");
            String string = Integer.toString(hashCode(), CharsKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            sb.append(string);
            if (name != null) {
                str = '[' + name + "](";
                if (str == null) {
                    str = "(";
                }
            }
            sb.append(str);
            sb.append("currentBounds()=");
            sb.append(this.currentBounds.invoke());
            sb.append(", continuation=");
            sb.append(this.continuation);
            sb.append(')');
            return sb.toString();
        }

        public Request(Function0 function0, Pl pl) {
            this.currentBounds = function0;
            this.continuation = pl;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.f16969n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.f16970t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static /* synthetic */ boolean R3E(ContentInViewNode contentInViewNode, Rect rect, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = contentInViewNode.viewportSize;
        }
        return contentInViewNode.VK2(rect, j2);
    }

    private final int WKb(long j2, long j3) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i2 == 1) {
            return Intrinsics.compare((int) (j2 & 4294967295L), (int) (j3 & 4294967295L));
        }
        if (i2 == 2) {
            return Intrinsics.compare((int) (j2 >> 32), (int) (j3 >> 32));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final int ZwA(long j2, long j3) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i2 == 1) {
            return Float.compare(Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j3 & 4294967295L)));
        }
        if (i2 == 2) {
            return Float.compare(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 >> 32)));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float b(BringIntoViewSpec bringIntoViewSpec) {
        if (IntSize.O(this.viewportSize, IntSize.INSTANCE.n())) {
            return 0.0f;
        }
        Rect rectKC = kC();
        if (rectKC == null) {
            rectKC = this.trackingFocusedChild ? eOa() : null;
            if (rectKC == null) {
                return 0.0f;
            }
        }
        long jO = IntSizeKt.O(this.viewportSize);
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i2 == 1) {
            return bringIntoViewSpec.n(rectKC.getTop(), rectKC.xMQ() - rectKC.getTop(), Float.intBitsToFloat((int) (jO & 4294967295L)));
        }
        if (i2 == 2) {
            return bringIntoViewSpec.n(rectKC.getLeft(), rectKC.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String() - rectKC.getLeft(), Float.intBitsToFloat((int) (jO >> 32)));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final BringIntoViewSpec cAB() {
        BringIntoViewSpec bringIntoViewSpec = this.bringIntoViewSpec;
        return bringIntoViewSpec == null ? (BringIntoViewSpec) CompositionLocalConsumerModifierNodeKt.n(this, BringIntoViewSpec_androidKt.n()) : bringIntoViewSpec;
    }

    private final Rect kC() {
        MutableVector mutableVector = this.bringIntoViewRequests.requests;
        int size = mutableVector.getSize() - 1;
        Object[] objArr = mutableVector.content;
        Rect rect = null;
        if (size < objArr.length) {
            while (size >= 0) {
                Rect rect2 = (Rect) ((Request) objArr[size]).getCurrentBounds().invoke();
                if (rect2 != null) {
                    if (ZwA(rect2.Ik(), IntSizeKt.O(this.viewportSize)) > 0) {
                        return rect == null ? rect2 : rect;
                    }
                    rect = rect2;
                }
                size--;
            }
        }
        return rect;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    public Rect D76(Rect localRect) {
        if (IntSize.O(this.viewportSize, IntSize.INSTANCE.n())) {
            InlineClassHelperKt.t("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        return jE(localRect, this.viewportSize);
    }

    public final void G(LayoutCoordinates newBounds) {
        Rect rectEOa;
        this.focusedChild = newBounds;
        if (this.childWasMaxVisibleBeforeViewportShrunk && (rectEOa = eOa()) != null && !VK2(rectEOa, this.viewportSize)) {
            this.trackingFocusedChild = true;
            Yq();
        }
        this.childWasMaxVisibleBeforeViewportShrunk = false;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void HI(long size) {
        Rect rectEOa;
        long j2 = this.viewportSize;
        this.viewportSize = size;
        if (WKb(size, j2) >= 0 || this.isAnimationRunning || this.trackingFocusedChild || (rectEOa = eOa()) == null || !VK2(rectEOa, j2)) {
            return;
        }
        this.childWasMaxVisibleBeforeViewportShrunk = true;
    }

    /* JADX INFO: renamed from: i7, reason: from getter */
    public final long getViewportSize() {
        return this.viewportSize;
    }

    public final void kR(Orientation orientation, boolean reverseDirection, BringIntoViewSpec bringIntoViewSpec) {
        this.orientation = orientation;
        this.reverseDirection = reverseDirection;
        this.bringIntoViewSpec = bringIntoViewSpec;
    }

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: lRt, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    public ContentInViewNode(Orientation orientation, ScrollingLogic scrollingLogic, boolean z2, BringIntoViewSpec bringIntoViewSpec) {
        this.orientation = orientation;
        this.scrollingLogic = scrollingLogic;
        this.reverseDirection = z2;
        this.bringIntoViewSpec = bringIntoViewSpec;
    }

    private final boolean VK2(Rect rect, long j2) {
        long jF11 = f11(rect, j2);
        if (Math.abs(Float.intBitsToFloat((int) (jF11 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jF11 & 4294967295L))) <= 0.5f) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Yq() {
        BringIntoViewSpec bringIntoViewSpecCAB = cAB();
        if (this.isAnimationRunning) {
            InlineClassHelperKt.t("launchAnimation called when previous animation was running");
        }
        C.nr(Xli(), null, h.J2, new ContentInViewNode$launchAnimation$2(this, new UpdatableAnimationState(BringIntoViewSpec.INSTANCE.t()), bringIntoViewSpecCAB, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect eOa() {
        if (!getIsAttached()) {
            return null;
        }
        LayoutCoordinates layoutCoordinatesAz = DelegatableNodeKt.az(this);
        LayoutCoordinates layoutCoordinates = this.focusedChild;
        if (layoutCoordinates != null) {
            if (!layoutCoordinates.nr()) {
                layoutCoordinates = null;
            }
            if (layoutCoordinates != null) {
                return layoutCoordinatesAz.I(layoutCoordinates, false);
            }
        }
        return null;
    }

    private final long f11(Rect childBounds, long containerSize) {
        long jO = IntSizeKt.O(containerSize);
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return Offset.O((((long) Float.floatToRawIntBits(cAB().n(childBounds.getLeft(), childBounds.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String() - childBounds.getLeft(), Float.intBitsToFloat((int) (jO >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
            }
            throw new NoWhenBranchMatchedException();
        }
        float fN = cAB().n(childBounds.getTop(), childBounds.xMQ() - childBounds.getTop(), Float.intBitsToFloat((int) (jO & 4294967295L)));
        return Offset.O((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fN)) & 4294967295L));
    }

    private final Rect jE(Rect childBounds, long containerSize) {
        return childBounds.te(Offset.O(f11(childBounds, containerSize) ^ (-9223372034707292160L)));
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    public Object eo(Function0 function0, Continuation continuation) {
        Rect rect = (Rect) function0.invoke();
        if (rect != null && !R3E(this, rect, 0L, 1, null)) {
            eO eOVar = new eO(IntrinsicsKt.intercepted(continuation), 1);
            eOVar.e();
            if (this.bringIntoViewRequests.t(new Request(function0, eOVar)) && !this.isAnimationRunning) {
                Yq();
            }
            Object objWPU = eOVar.WPU();
            if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objWPU;
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
