package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.unit.Constraints;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001:\u0001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0005J\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\t¢\u0006\u0004\b!\u0010\u001dJ\u001f\u0010\"\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\t¢\u0006\u0004\b\"\u0010\u001dJ\u001f\u0010#\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\t¢\u0006\u0004\b#\u0010\u001dJ\u001f\u0010$\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\t¢\u0006\u0004\b$\u0010\u001dJ\u0015\u0010%\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b%\u0010\u0005J\u001f\u0010(\u001a\u00020\t2\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010&¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\r¢\u0006\u0004\b*\u0010\u0011J \u0010+\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0015\u0010/\u001a\u00020\r2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u001d\u00101\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b1\u0010\u0018J\u0017\u00103\u001a\u00020\r2\b\b\u0002\u00102\u001a\u00020\t¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b5\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00109R\"\u0010>\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u0010(\u001a\u0004\b;\u0010<\"\u0004\b=\u00104R\u0016\u0010@\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010(R\u0014\u0010C\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010BR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020-0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010ER$\u0010L\u001a\u00020G2\u0006\u0010H\u001a\u00020G8F@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010I\u001a\u0004\bJ\u0010KR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020M0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010ER\u001e\u0010P\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b1\u0010OR\u0016\u0010S\u001a\u0004\u0018\u00010Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010RR\u0018\u0010V\u001a\u00020\t*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0018\u0010X\u001a\u00020\t*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010UR\u0018\u0010Z\u001a\u00020\t*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bY\u0010UR\u0018\u0010\\\u001a\u00020\t*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010UR\u0018\u0010^\u001a\u00020\t*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b]\u0010UR\u0011\u0010`\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b_\u0010<R\u0011\u0010b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\ba\u0010<\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006d"}, d2 = {"Landroidx/compose/ui/node/MeasureAndLayoutDelegate;", "", "Landroidx/compose/ui/node/LayoutNode;", "root", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "layoutNode", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "O", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/unit/Constraints;)Z", "J2", "", "iF", "KN", "rl", "()V", "affectsLookahead", "relayoutNeeded", "g", "(Landroidx/compose/ui/node/LayoutNode;ZZ)Z", "Uo", "fD", "(Landroidx/compose/ui/node/LayoutNode;Z)V", "node", "ViF", "mUb", "WPU", "(Landroidx/compose/ui/node/LayoutNode;Z)Z", "s7N", "(J)V", "forced", "e", "N", "E2", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "X", "Lkotlin/Function0;", "onLayout", "Z", "(Lkotlin/jvm/functions/Function0;)Z", "S", "XQ", "(Landroidx/compose/ui/node/LayoutNode;J)V", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "nY", "(Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;)V", "xMQ", "forceDispatch", "t", "(Z)V", "aYN", c.f62177j, "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;", "Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;", "relayoutNodes", "az", "()Z", "setDuringMeasureLayout$ui_release", "duringMeasureLayout", "nr", "duringFullMeasureLayoutPass", "Landroidx/compose/ui/node/OnPositionedDispatcher;", "Landroidx/compose/ui/node/OnPositionedDispatcher;", "onPositionedDispatcher", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/collection/MutableVector;", "onLayoutCompletedListeners", "", "<set-?>", "J", "o", "()J", "measureIteration", "Landroidx/compose/ui/node/MeasureAndLayoutDelegate$PostponedRequest;", "postponedMeasureRequests", "Landroidx/compose/ui/unit/Constraints;", "rootConstraints", "Landroidx/compose/ui/node/LayoutTreeConsistencyChecker;", "Landroidx/compose/ui/node/LayoutTreeConsistencyChecker;", "consistencyChecker", "ck", "(Landroidx/compose/ui/node/LayoutNode;)Z", "measureAffectsParent", "r", "measureAffectsPlacedParent", "qie", "canAffectPlacedParent", "gh", "canAffectParentInLookahead", "Ik", "measureAffectsParentLookahead", "ty", "hasPendingMeasureOrLayout", "HI", "hasPendingOnPositionedCallbacks", "PostponedRequest", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMeasureAndLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureAndLayoutDelegate.kt\nandroidx/compose/ui/node/MeasureAndLayoutDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 4 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSetsForDifferentPasses\n+ 5 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n+ 6 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,771:1\n490#1:793\n491#1:797\n493#1,10:799\n504#1,6:816\n490#1:822\n491#1:826\n493#1,17:828\n490#1:860\n491#1:864\n493#1:866\n494#1,16:872\n1101#2:772\n1083#2,2:773\n1101#2:775\n1083#2,2:776\n102#3,5:778\n102#3,5:783\n56#3,5:788\n102#3,3:794\n106#3:798\n102#3,3:823\n106#3:827\n102#3,5:855\n102#3,3:861\n106#3:865\n102#3,5:867\n102#3,5:898\n102#3,5:903\n102#3,5:908\n56#3,5:934\n102#3,5:939\n189#4,2:809\n191#4,4:812\n107#5:811\n207#6:845\n207#6:888\n207#6:944\n423#7,9:846\n423#7,9:889\n641#7,2:913\n423#7,9:915\n519#7:924\n423#7,9:925\n423#7,9:945\n*S KotlinDebug\n*F\n+ 1 MeasureAndLayoutDelegate.kt\nandroidx/compose/ui/node/MeasureAndLayoutDelegate\n*L\n387#1:793\n387#1:797\n387#1:799,10\n387#1:816,6\n408#1:822\n408#1:826\n408#1:828,17\n449#1:860\n449#1:864\n449#1:866\n449#1:872,16\n65#1:772\n65#1:773,2\n86#1:775\n86#1:776,2\n73#1:778,5\n93#1:783,5\n127#1:788,5\n387#1:794,3\n387#1:798\n408#1:823,3\n408#1:827\n448#1:855,5\n449#1:861,3\n449#1:865\n449#1:867,5\n490#1:898,5\n493#1:903,5\n494#1:908,5\n645#1:934,5\n650#1:939,5\n389#1:809,2\n389#1:812,4\n389#1:811\n428#1:845\n478#1:888\n668#1:944\n428#1:846,9\n478#1:889,9\n512#1:913,2\n516#1:915,9\n600#1:924\n601#1:925,9\n668#1:945,9\n*E\n"})
public final class MeasureAndLayoutDelegate {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final MutableVector onLayoutCompletedListeners;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final MutableVector postponedMeasureRequests;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final OnPositionedDispatcher onPositionedDispatcher;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private long measureIteration;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final LayoutTreeConsistencyChecker consistencyChecker;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final LayoutNode root;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private boolean duringFullMeasureLayoutPass;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final DepthSortedSetsForDifferentPasses relayoutNodes;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean duringMeasureLayout;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private Constraints rootConstraints;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/node/MeasureAndLayoutDelegate$PostponedRequest;", "", "Landroidx/compose/ui/node/LayoutNode;", "node", "", "isLookahead", "isForced", "<init>", "(Landroidx/compose/ui/node/LayoutNode;ZZ)V", c.f62177j, "Landroidx/compose/ui/node/LayoutNode;", "()Landroidx/compose/ui/node/LayoutNode;", "rl", "Z", "t", "()Z", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PostponedRequest {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final LayoutNode node;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private final boolean isLookahead;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final boolean isForced;

        /* JADX INFO: renamed from: n, reason: from getter */
        public final LayoutNode getNode() {
            return this.node;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final boolean getIsForced() {
            return this.isForced;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final boolean getIsLookahead() {
            return this.isLookahead;
        }

        public PostponedRequest(LayoutNode layoutNode, boolean z2, boolean z3) {
            this.node = layoutNode;
            this.isLookahead = z2;
            this.isForced = z3;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[LayoutNode.LayoutState.f32463t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.LayoutState.f32460n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LayoutNode.LayoutState.J2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayoutNode.LayoutState.f32458O.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LayoutNode.LayoutState.f32462r.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final boolean J2(LayoutNode layoutNode, Constraints constraints) {
        boolean zO9 = constraints != null ? layoutNode.o9(constraints) : LayoutNode.n7b(layoutNode, null, 1, null);
        LayoutNode layoutNodeMYa = layoutNode.mYa();
        if (zO9 && layoutNodeMYa != null) {
            if (layoutNode.ofS() == LayoutNode.UsageByParent.f32466n) {
                LayoutNode.lNy(layoutNodeMYa, false, false, false, 3, null);
                return zO9;
            }
            if (layoutNode.ofS() == LayoutNode.UsageByParent.f32468t) {
                LayoutNode.xzo(layoutNodeMYa, false, 1, null);
            }
        }
        return zO9;
    }

    private final void Uo() {
        if (this.postponedMeasureRequests.getSize() != 0) {
            MutableVector mutableVector = this.postponedMeasureRequests;
            Object[] objArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i2 = 0; i2 < size; i2++) {
                PostponedRequest postponedRequest = (PostponedRequest) objArr[i2];
                if (postponedRequest.getNode().nr()) {
                    if (postponedRequest.getIsLookahead()) {
                        LayoutNode.wKp(postponedRequest.getNode(), postponedRequest.getIsForced(), false, false, 2, null);
                    } else {
                        LayoutNode.lNy(postponedRequest.getNode(), postponedRequest.getIsForced(), false, false, 2, null);
                    }
                }
            }
            this.postponedMeasureRequests.KN();
        }
    }

    private final boolean WPU(LayoutNode layoutNode, boolean z2) {
        return z2 ? layoutNode.z() : layoutNode.xg();
    }

    public static /* synthetic */ boolean nHg(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return measureAndLayoutDelegate.N(layoutNode, z2);
    }

    public static /* synthetic */ void nr(MeasureAndLayoutDelegate measureAndLayoutDelegate, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        measureAndLayoutDelegate.t(z2);
    }

    private final void rl() {
        MutableVector mutableVector = this.onLayoutCompletedListeners;
        Object[] objArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            ((Owner.OnLayoutCompletedListener) objArr[i2]).mUb();
        }
        this.onLayoutCompletedListeners.KN();
    }

    static /* synthetic */ boolean te(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        if ((i2 & 4) != 0) {
            z3 = true;
        }
        return measureAndLayoutDelegate.g(layoutNode, z2, z3);
    }

    public final boolean HI() {
        return this.onPositionedDispatcher.t();
    }

    public final void S() {
        if (this.relayoutNodes.KN()) {
            if (!this.root.nr()) {
                InlineClassHelperKt.n("performMeasureAndLayout called with unattached root");
            }
            if (!this.root.HI()) {
                InlineClassHelperKt.n("performMeasureAndLayout called with unplaced root");
            }
            if (this.duringMeasureLayout) {
                InlineClassHelperKt.n("performMeasureAndLayout called during measure layout");
            }
            if (this.rootConstraints != null) {
                this.duringMeasureLayout = true;
                this.duringFullMeasureLayoutPass = false;
                try {
                    if (!this.relayoutNodes.Uo(true)) {
                        if (this.root.getLookaheadRoot() != null) {
                            fD(this.root, true);
                        } else {
                            iF(this.root);
                        }
                    }
                    fD(this.root, false);
                    this.duringMeasureLayout = false;
                    this.duringFullMeasureLayoutPass = false;
                    LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                    if (layoutTreeConsistencyChecker != null) {
                        layoutTreeConsistencyChecker.n();
                    }
                } catch (Throwable th) {
                    this.duringMeasureLayout = false;
                    this.duringFullMeasureLayoutPass = false;
                    throw th;
                }
            }
        }
    }

    public final void X(LayoutNode layoutNode) {
        this.onPositionedDispatcher.nr(layoutNode);
    }

    public final boolean Z(Function0 onLayout) throws Throwable {
        MeasureAndLayoutDelegate measureAndLayoutDelegate;
        Throwable th;
        boolean z2;
        LayoutNode layoutNodeNr;
        if (!this.root.nr()) {
            InlineClassHelperKt.n("performMeasureAndLayout called with unattached root");
        }
        if (!this.root.HI()) {
            InlineClassHelperKt.n("performMeasureAndLayout called with unplaced root");
        }
        if (this.duringMeasureLayout) {
            InlineClassHelperKt.n("performMeasureAndLayout called during measure layout");
        }
        boolean z3 = false;
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            this.duringFullMeasureLayoutPass = true;
            try {
                if (this.relayoutNodes.KN()) {
                    DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.relayoutNodes;
                    z2 = false;
                    while (depthSortedSetsForDifferentPasses.KN()) {
                        boolean zT2 = depthSortedSetsForDifferentPasses.lookaheadSet.t();
                        boolean z4 = !zT2;
                        if (zT2) {
                            layoutNodeNr = depthSortedSetsForDifferentPasses.set.nr();
                        } else {
                            try {
                                layoutNodeNr = depthSortedSetsForDifferentPasses.lookaheadSet.nr();
                            } catch (Throwable th2) {
                                th = th2;
                                measureAndLayoutDelegate = this;
                                measureAndLayoutDelegate.duringMeasureLayout = false;
                                measureAndLayoutDelegate.duringFullMeasureLayoutPass = false;
                                throw th;
                            }
                        }
                        LayoutNode layoutNode = layoutNodeNr;
                        measureAndLayoutDelegate = this;
                        try {
                            boolean zTe = te(measureAndLayoutDelegate, layoutNode, z4, false, 4, null);
                            if (layoutNode == this.root && zTe) {
                                z2 = true;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            measureAndLayoutDelegate.duringMeasureLayout = false;
                            measureAndLayoutDelegate.duringFullMeasureLayoutPass = false;
                            throw th;
                        }
                    }
                    measureAndLayoutDelegate = this;
                    if (onLayout != null) {
                        onLayout.invoke();
                    }
                } else {
                    measureAndLayoutDelegate = this;
                    z2 = false;
                }
                measureAndLayoutDelegate.duringMeasureLayout = false;
                measureAndLayoutDelegate.duringFullMeasureLayoutPass = false;
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = measureAndLayoutDelegate.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.n();
                }
                z3 = z2;
            } catch (Throwable th4) {
                th = th4;
                measureAndLayoutDelegate = this;
            }
        }
        rl();
        return z3;
    }

    public final void aYN(LayoutNode node) {
        this.relayoutNodes.xMQ(node);
        this.onPositionedDispatcher.J2(node);
    }

    /* JADX INFO: renamed from: az, reason: from getter */
    public final boolean getDuringMeasureLayout() {
        return this.duringMeasureLayout;
    }

    public final void nY(Owner.OnLayoutCompletedListener listener) {
        this.onLayoutCompletedListeners.rl(listener);
    }

    public final long o() {
        if (!this.duringMeasureLayout) {
            InlineClassHelperKt.n("measureIteration should be only used during the measure/layout pass");
        }
        return this.measureIteration;
    }

    public final void s7N(long constraints) {
        Constraints constraints2 = this.rootConstraints;
        if (constraints2 == null ? false : Constraints.J2(constraints2.getValue(), constraints)) {
            return;
        }
        if (this.duringMeasureLayout) {
            InlineClassHelperKt.n("updateRootConstraints called while measuring");
        }
        this.rootConstraints = Constraints.n(constraints);
        if (this.root.getLookaheadRoot() != null) {
            this.root.f();
        }
        this.root.ub();
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.relayoutNodes;
        LayoutNode layoutNode = this.root;
        depthSortedSetsForDifferentPasses.t(layoutNode, layoutNode.getLookaheadRoot() != null);
    }

    public final void t(boolean forceDispatch) {
        if (forceDispatch) {
            this.onPositionedDispatcher.O(this.root);
        }
        this.onPositionedDispatcher.n();
    }

    public final boolean ty() {
        return this.relayoutNodes.KN();
    }

    public final void xMQ(LayoutNode layoutNode, boolean affectsLookahead) {
        if (!this.duringMeasureLayout) {
            InlineClassHelperKt.t("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (WPU(layoutNode, affectsLookahead)) {
            InlineClassHelperKt.n("node not yet measured");
        }
        mUb(layoutNode, affectsLookahead);
    }

    public MeasureAndLayoutDelegate(LayoutNode layoutNode) {
        LayoutTreeConsistencyChecker layoutTreeConsistencyChecker;
        this.root = layoutNode;
        Owner.Companion companion = Owner.INSTANCE;
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = new DepthSortedSetsForDifferentPasses(companion.n());
        this.relayoutNodes = depthSortedSetsForDifferentPasses;
        this.onPositionedDispatcher = new OnPositionedDispatcher();
        this.onLayoutCompletedListeners = new MutableVector(new Owner.OnLayoutCompletedListener[16], 0);
        this.measureIteration = 1L;
        MutableVector mutableVector = new MutableVector(new PostponedRequest[16], 0);
        this.postponedMeasureRequests = mutableVector;
        if (companion.n()) {
            layoutTreeConsistencyChecker = new LayoutTreeConsistencyChecker(layoutNode, depthSortedSetsForDifferentPasses, mutableVector.Uo());
        } else {
            layoutTreeConsistencyChecker = null;
        }
        this.consistencyChecker = layoutTreeConsistencyChecker;
    }

    private final boolean Ik(LayoutNode layoutNode) {
        AlignmentLinesOwner alignmentLinesOwnerCk;
        AlignmentLines alignmentLinesO;
        if (layoutNode.C() == LayoutNode.UsageByParent.f32466n || ((alignmentLinesOwnerCk = layoutNode.getLayoutDelegate().ck()) != null && (alignmentLinesO = alignmentLinesOwnerCk.getAlignmentLines()) != null && alignmentLinesO.gh())) {
            return true;
        }
        return false;
    }

    private final void KN(LayoutNode layoutNode) {
        MutableVector mutableVectorHRu = layoutNode.hRu();
        Object[] objArr = mutableVectorHRu.content;
        int size = mutableVectorHRu.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (Intrinsics.areEqual(layoutNode2.tFV(), Boolean.TRUE) && !layoutNode2.getIsDeactivated()) {
                if (this.relayoutNodes.O(layoutNode2, true)) {
                    layoutNode2.Bu();
                }
                KN(layoutNode2);
            }
        }
    }

    private final boolean O(LayoutNode layoutNode, Constraints constraints) {
        boolean zT3L;
        if (layoutNode.getLookaheadRoot() == null) {
            return false;
        }
        if (constraints != null) {
            zT3L = layoutNode.mI(constraints);
        } else {
            zT3L = LayoutNode.T3L(layoutNode, null, 1, null);
        }
        LayoutNode layoutNodeMYa = layoutNode.mYa();
        if (zT3L && layoutNodeMYa != null) {
            if (layoutNodeMYa.getLookaheadRoot() == null) {
                LayoutNode.lNy(layoutNodeMYa, false, false, false, 3, null);
                return zT3L;
            }
            if (layoutNode.C() == LayoutNode.UsageByParent.f32466n) {
                LayoutNode.wKp(layoutNodeMYa, false, false, false, 3, null);
                return zT3L;
            }
            if (layoutNode.C() == LayoutNode.UsageByParent.f32468t) {
                LayoutNode.jO(layoutNodeMYa, false, 1, null);
            }
        }
        return zT3L;
    }

    private final void ViF(LayoutNode node, boolean affectsLookahead) {
        if (WPU(node, affectsLookahead)) {
            g(node, affectsLookahead, false);
        }
    }

    private final boolean ck(LayoutNode layoutNode) {
        if (layoutNode.ofS() != LayoutNode.UsageByParent.f32466n && !layoutNode.getLayoutDelegate().t().getAlignmentLines().gh()) {
            return false;
        }
        return true;
    }

    private final void fD(LayoutNode layoutNode, boolean affectsLookahead) {
        Constraints constraints;
        if (layoutNode.getIsDeactivated()) {
            return;
        }
        if (layoutNode == this.root) {
            constraints = this.rootConstraints;
            Intrinsics.checkNotNull(constraints);
        } else {
            constraints = null;
        }
        if (affectsLookahead) {
            O(layoutNode, constraints);
        } else {
            J2(layoutNode, constraints);
        }
    }

    private final boolean g(LayoutNode layoutNode, boolean affectsLookahead, boolean relayoutNeeded) {
        Constraints constraints;
        boolean zJ2;
        LayoutNode layoutNodeMYa;
        boolean zO = false;
        if (layoutNode.getIsDeactivated()) {
            return false;
        }
        if (!layoutNode.HI() && !layoutNode.QZ6() && !qie(layoutNode) && !Intrinsics.areEqual(layoutNode.tFV(), Boolean.TRUE) && !gh(layoutNode) && !layoutNode.nHg()) {
            return false;
        }
        if (layoutNode == this.root) {
            constraints = this.rootConstraints;
            Intrinsics.checkNotNull(constraints);
        } else {
            constraints = null;
        }
        if (affectsLookahead) {
            if (layoutNode.z()) {
                zO = O(layoutNode, constraints);
            }
            if (relayoutNeeded && ((zO || layoutNode.dR0()) && Intrinsics.areEqual(layoutNode.tFV(), Boolean.TRUE))) {
                layoutNode.Bu();
            }
        } else {
            if (layoutNode.xg()) {
                zJ2 = J2(layoutNode, constraints);
            } else {
                zJ2 = false;
            }
            if (relayoutNeeded && layoutNode.Y() && (layoutNode == this.root || ((layoutNodeMYa = layoutNode.mYa()) != null && layoutNodeMYa.HI() && layoutNode.QZ6()))) {
                if (layoutNode == this.root) {
                    layoutNode.vl(0, 0);
                } else {
                    layoutNode.Lp6();
                }
                this.onPositionedDispatcher.nr(layoutNode);
                LayoutNodeKt.rl(layoutNode).getRectManager().mUb(layoutNode);
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.n();
                }
            }
            zO = zJ2;
        }
        Uo();
        return zO;
    }

    private final boolean gh(LayoutNode layoutNode) {
        if (layoutNode.z() && Ik(layoutNode)) {
            return true;
        }
        return false;
    }

    private final void iF(LayoutNode layoutNode) {
        MutableVector mutableVectorHRu = layoutNode.hRu();
        Object[] objArr = mutableVectorHRu.content;
        int size = mutableVectorHRu.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (ck(layoutNode2)) {
                if (LayoutNodeLayoutDelegateKt.n(layoutNode2)) {
                    fD(layoutNode2, true);
                } else {
                    iF(layoutNode2);
                }
            }
        }
    }

    private final void mUb(LayoutNode layoutNode, boolean affectsLookahead) {
        MutableVector mutableVectorHRu = layoutNode.hRu();
        Object[] objArr = mutableVectorHRu.content;
        int size = mutableVectorHRu.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if ((!affectsLookahead && ck(layoutNode2)) || (affectsLookahead && Ik(layoutNode2))) {
                if (LayoutNodeLayoutDelegateKt.n(layoutNode2) && !affectsLookahead) {
                    if (layoutNode2.z() && this.relayoutNodes.O(layoutNode2, true)) {
                        g(layoutNode2, true, false);
                    } else {
                        xMQ(layoutNode2, true);
                    }
                }
                ViF(layoutNode2, affectsLookahead);
                if (!WPU(layoutNode2, affectsLookahead)) {
                    mUb(layoutNode2, affectsLookahead);
                }
            }
        }
        ViF(layoutNode, affectsLookahead);
    }

    private final boolean qie(LayoutNode layoutNode) {
        if (layoutNode.xg() && r(layoutNode)) {
            return true;
        }
        return false;
    }

    private final boolean r(LayoutNode layoutNode) {
        LayoutNode.LayoutState layoutStateK;
        do {
            if (!ck(layoutNode)) {
                LayoutNode layoutNodeMYa = layoutNode.mYa();
                if (layoutNodeMYa != null) {
                    layoutStateK = layoutNodeMYa.k();
                } else {
                    layoutStateK = null;
                }
                if (layoutStateK != LayoutNode.LayoutState.f32460n) {
                    return false;
                }
            }
            layoutNode = layoutNode.mYa();
            if (layoutNode == null) {
                return false;
            }
        } while (!layoutNode.HI());
        return true;
    }

    public final boolean E2(LayoutNode layoutNode, boolean forced) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[layoutNode.k().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4 && i2 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            if ((layoutNode.z() || layoutNode.dR0()) && !forced) {
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.n();
                }
                return false;
            }
            layoutNode.Uf();
            layoutNode.p0N();
            if (layoutNode.getIsDeactivated()) {
                return false;
            }
            LayoutNode layoutNodeMYa = layoutNode.mYa();
            if (Intrinsics.areEqual(layoutNode.tFV(), Boolean.TRUE) && ((layoutNodeMYa == null || !layoutNodeMYa.z()) && (layoutNodeMYa == null || !layoutNodeMYa.dR0()))) {
                this.relayoutNodes.t(layoutNode, true);
            } else if (layoutNode.HI() && ((layoutNodeMYa == null || !layoutNodeMYa.Y()) && (layoutNodeMYa == null || !layoutNodeMYa.xg()))) {
                this.relayoutNodes.t(layoutNode, false);
            }
            if (this.duringFullMeasureLayoutPass) {
                return false;
            }
            return true;
        }
        LayoutTreeConsistencyChecker layoutTreeConsistencyChecker2 = this.consistencyChecker;
        if (layoutTreeConsistencyChecker2 != null) {
            layoutTreeConsistencyChecker2.n();
        }
        return false;
    }

    public final boolean N(LayoutNode layoutNode, boolean forced) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[layoutNode.k().ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3 && i2 != 4) {
                if (i2 == 5) {
                    if (layoutNode.xg() && !forced) {
                        return false;
                    }
                    layoutNode.ub();
                    if (layoutNode.getIsDeactivated()) {
                        return false;
                    }
                    if (!layoutNode.HI() && !qie(layoutNode)) {
                        return false;
                    }
                    LayoutNode layoutNodeMYa = layoutNode.mYa();
                    if (layoutNodeMYa == null || !layoutNodeMYa.xg()) {
                        this.relayoutNodes.t(layoutNode, false);
                    }
                    if (!this.duringFullMeasureLayoutPass) {
                        return true;
                    }
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            }
            this.postponedMeasureRequests.rl(new PostponedRequest(layoutNode, false, forced));
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.n();
            }
        }
        return false;
    }

    public final boolean T(LayoutNode layoutNode, boolean forced) {
        boolean z2;
        int i2 = WhenMappings.$EnumSwitchMapping$0[layoutNode.k().ordinal()];
        if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4) {
            if (i2 == 5) {
                LayoutNode layoutNodeMYa = layoutNode.mYa();
                if (layoutNodeMYa != null && !layoutNodeMYa.HI()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!forced && (layoutNode.xg() || (layoutNode.Y() && layoutNode.HI() == z2 && layoutNode.HI() == layoutNode.QZ6()))) {
                    LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                    if (layoutTreeConsistencyChecker != null) {
                        layoutTreeConsistencyChecker.n();
                    }
                    return false;
                }
                layoutNode.p0N();
                if (!layoutNode.getIsDeactivated() && layoutNode.QZ6() && z2) {
                    if ((layoutNodeMYa == null || !layoutNodeMYa.Y()) && (layoutNodeMYa == null || !layoutNodeMYa.xg())) {
                        this.relayoutNodes.t(layoutNode, false);
                    }
                    if (!this.duringFullMeasureLayoutPass) {
                        return true;
                    }
                }
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
        LayoutTreeConsistencyChecker layoutTreeConsistencyChecker2 = this.consistencyChecker;
        if (layoutTreeConsistencyChecker2 != null) {
            layoutTreeConsistencyChecker2.n();
        }
        return false;
    }

    public final void XQ(LayoutNode layoutNode, long constraints) {
        if (layoutNode.getIsDeactivated()) {
            return;
        }
        if (Intrinsics.areEqual(layoutNode, this.root)) {
            InlineClassHelperKt.n("measureAndLayout called on root");
        }
        if (!this.root.nr()) {
            InlineClassHelperKt.n("performMeasureAndLayout called with unattached root");
        }
        if (!this.root.HI()) {
            InlineClassHelperKt.n("performMeasureAndLayout called with unplaced root");
        }
        if (this.duringMeasureLayout) {
            InlineClassHelperKt.n("performMeasureAndLayout called during measure layout");
        }
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            this.duringFullMeasureLayoutPass = false;
            try {
                this.relayoutNodes.xMQ(layoutNode);
                if (O(layoutNode, Constraints.n(constraints)) || layoutNode.dR0()) {
                    if (Intrinsics.areEqual(layoutNode.tFV(), Boolean.TRUE)) {
                        layoutNode.Bu();
                    }
                }
                KN(layoutNode);
                J2(layoutNode, Constraints.n(constraints));
                if (layoutNode.Y() && layoutNode.HI()) {
                    layoutNode.Lp6();
                    this.onPositionedDispatcher.nr(layoutNode);
                }
                Uo();
                this.duringMeasureLayout = false;
                this.duringFullMeasureLayoutPass = false;
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.n();
                }
            } catch (Throwable th) {
                this.duringMeasureLayout = false;
                this.duringFullMeasureLayoutPass = false;
                throw th;
            }
        }
        rl();
    }

    public final boolean e(LayoutNode layoutNode, boolean forced) {
        boolean z2;
        LayoutNode layoutNodeMYa;
        LayoutNode layoutNodeMYa2;
        if (layoutNode.getLookaheadRoot() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            InlineClassHelperKt.t("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[layoutNode.k().ordinal()];
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3 && i2 != 4) {
                if (i2 == 5) {
                    if (layoutNode.z() && !forced) {
                        return false;
                    }
                    layoutNode.f();
                    layoutNode.ub();
                    if (layoutNode.getIsDeactivated()) {
                        return false;
                    }
                    if ((!Intrinsics.areEqual(layoutNode.tFV(), Boolean.TRUE) && !gh(layoutNode)) || ((layoutNodeMYa = layoutNode.mYa()) != null && layoutNodeMYa.z())) {
                        if ((layoutNode.HI() || qie(layoutNode)) && ((layoutNodeMYa2 = layoutNode.mYa()) == null || !layoutNodeMYa2.xg())) {
                            this.relayoutNodes.t(layoutNode, false);
                        }
                    } else {
                        this.relayoutNodes.t(layoutNode, true);
                    }
                    if (this.duringFullMeasureLayoutPass) {
                        return false;
                    }
                    return true;
                }
                throw new NoWhenBranchMatchedException();
            }
            this.postponedMeasureRequests.rl(new PostponedRequest(layoutNode, true, forced));
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.n();
            }
        }
        return false;
    }
}
