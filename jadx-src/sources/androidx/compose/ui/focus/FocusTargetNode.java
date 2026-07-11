package androidx.compose.ui.focus;

import android.os.Trace;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001PBe\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012:\b\u0002\u0010\u000f\u001a4\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\b\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000eH\u0000¢\u0006\u0004\b \u0010\u001aJ\u000f\u0010!\u001a\u00020\u000eH\u0000¢\u0006\u0004\b!\u0010\u001aJ\u000f\u0010\"\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\"\u0010\u001aJ\u001f\u0010%\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\tH\u0000¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0016H\u0000¢\u0006\u0004\b'\u0010(J\u001b\u0010+\u001a\u00020\u000e2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)H\u0000¢\u0006\u0004\b+\u0010,RF\u0010\u000f\u001a4\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\"\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102R\u0018\u00108\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010;\u001a\u00020\u00168\u0016X\u0096D¢\u0006\f\n\u0004\b9\u00102\u001a\u0004\b:\u0010(R0\u0010\u0007\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u00068\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010G\u001a\u00020C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010>\u001a\u0004\bE\u0010@\"\u0004\bF\u0010BR$\u0010K\u001a\u00020)2\u0006\u0010<\u001a\u00020)8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010,R\u0013\u0010O\u001a\u0004\u0018\u00010L8F¢\u0006\u0006\u001a\u0004\bM\u0010N\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Q"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/focus/Focusability;", "focusability", "Lkotlin/Function2;", "Landroidx/compose/ui/focus/FocusState;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "previous", "current", "", "onFocusChange", "Lkotlin/Function1;", "onDispatchEventsCompleted", "<init>", "(ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "(I)Z", "UhV", "()V", "c", "Sax", "Landroidx/compose/ui/focus/FocusProperties;", "ni", "()Landroidx/compose/ui/focus/FocusProperties;", "poH", "i7", "W1c", "previousState", "newState", CmcdConfiguration.KEY_PLAYBACK_RATE, "(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", "VK2", "()Z", "Landroidx/compose/ui/focus/FocusStateImpl;", "initialFocusState", "kC", "(Landroidx/compose/ui/focus/FocusStateImpl;)V", "v", "Lkotlin/jvm/functions/Function2;", "Xw", "Lkotlin/jvm/functions/Function1;", "jB", "Z", "isProcessingCustomExit", "U", "isProcessingCustomEnter", "P5", "Landroidx/compose/ui/focus/FocusStateImpl;", "committedFocusState", "M7", "lRt", "shouldAutoInvalidate", "value", "p5", "I", "b", "()I", "setFocusability-josRg5g", "(I)V", "", "eF", "WKb", "Yq", "previouslyFocusedChildHash", "Vd", "()Landroidx/compose/ui/focus/FocusStateImpl;", "R3E", "focusState", "Landroidx/compose/ui/layout/BeyondBoundsLayout;", "GT", "()Landroidx/compose/ui/layout/BeyondBoundsLayout;", "beyondBoundsLayoutParent", "FocusTargetElement", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFocusTargetNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTargetNode.kt\nandroidx/compose/ui/focus/FocusTargetNode\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 10 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 11 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,433:1\n232#1,19:613\n232#1,19:632\n119#2:434\n123#2:536\n119#2:537\n127#2:658\n119#2:659\n127#2:735\n119#2:736\n119#2:827\n119#2:897\n247#3,5:435\n90#3:440\n91#3,8:446\n437#3,6:454\n447#3,2:461\n449#3,8:466\n457#3,9:477\n466#3,8:489\n100#3,7:497\n258#3,2:538\n90#3:540\n91#3,8:546\n260#3:554\n261#3,2:556\n437#3,12:558\n449#3,8:573\n457#3,9:584\n466#3,8:596\n264#3:604\n100#3,7:605\n265#3:612\n258#3,2:660\n90#3:662\n91#3,8:668\n260#3:676\n261#3,2:678\n437#3,12:680\n449#3,8:695\n457#3,9:706\n466#3,8:718\n264#3:726\n100#3,7:727\n265#3:734\n258#3,2:737\n90#3:739\n91#3,8:745\n260#3:753\n261#3,2:755\n437#3,12:757\n449#3,8:772\n457#3,9:783\n466#3,8:795\n264#3:803\n100#3,7:804\n265#3:811\n247#3,5:828\n90#3:833\n91#3,8:839\n437#3,6:847\n447#3,2:854\n449#3,8:859\n457#3,9:870\n466#3,8:882\n100#3,7:890\n298#3,6:898\n179#3:904\n180#3:910\n181#3,3:914\n184#3,6:918\n304#3:924\n437#3,6:925\n447#3,2:932\n449#3,17:937\n466#3,8:957\n305#3:965\n190#3,8:966\n306#3:974\n56#4,5:441\n56#4,5:541\n76#4,7:651\n56#4,5:663\n56#4,5:740\n56#4,5:834\n56#4,5:905\n246#5:460\n246#5:555\n246#5:677\n246#5:754\n246#5:853\n246#5:931\n240#6,3:463\n243#6,3:486\n240#6,3:570\n243#6,3:593\n240#6,3:692\n243#6,3:715\n240#6,3:769\n243#6,3:792\n240#6,3:856\n243#6,3:879\n240#6,3:934\n243#6,3:954\n1101#7:474\n1083#7,2:475\n1101#7:581\n1083#7,2:582\n1101#7:703\n1083#7,2:704\n1101#7:780\n1083#7,2:781\n1101#7:867\n1083#7,2:868\n1101#7:911\n1083#7,2:912\n1#8:504\n1#8:514\n1#8:529\n1#8:820\n26#9,5:505\n52#10,4:510\n56#10,4:517\n48#10,8:521\n56#10,4:532\n48#10,8:812\n56#10,4:823\n641#11,2:515\n641#11,2:530\n641#11,2:821\n519#11:917\n*S KotlinDebug\n*F\n+ 1 FocusTargetNode.kt\nandroidx/compose/ui/focus/FocusTargetNode\n*L\n269#1:613,19\n293#1:632,19\n79#1:434\n221#1:536\n221#1:537\n341#1:658\n341#1:659\n352#1:735\n352#1:736\n382#1:827\n396#1:897\n79#1:435,5\n79#1:440\n79#1:446,8\n79#1:454,6\n79#1:461,2\n79#1:466,8\n79#1:477,9\n79#1:489,8\n79#1:497,7\n221#1:538,2\n221#1:540\n221#1:546,8\n221#1:554\n221#1:556,2\n221#1:558,12\n221#1:573,8\n221#1:584,9\n221#1:596,8\n221#1:604\n221#1:605,7\n221#1:612\n341#1:660,2\n341#1:662\n341#1:668,8\n341#1:676\n341#1:678,2\n341#1:680,12\n341#1:695,8\n341#1:706,9\n341#1:718,8\n341#1:726\n341#1:727,7\n341#1:734\n352#1:737,2\n352#1:739\n352#1:745,8\n352#1:753\n352#1:755,2\n352#1:757,12\n352#1:772,8\n352#1:783,9\n352#1:795,8\n352#1:803\n352#1:804,7\n352#1:811\n382#1:828,5\n382#1:833\n382#1:839,8\n382#1:847,6\n382#1:854,2\n382#1:859,8\n382#1:870,9\n382#1:882,8\n382#1:890,7\n396#1:898,6\n396#1:904\n396#1:910\n396#1:914,3\n396#1:918,6\n396#1:924\n396#1:925,6\n396#1:932,2\n396#1:937,17\n396#1:957,8\n396#1:965\n396#1:966,8\n396#1:974\n79#1:441,5\n221#1:541,5\n303#1:651,7\n341#1:663,5\n352#1:740,5\n382#1:834,5\n396#1:905,5\n79#1:460\n221#1:555\n341#1:677\n352#1:754\n382#1:853\n396#1:931\n79#1:463,3\n79#1:486,3\n221#1:570,3\n221#1:593,3\n341#1:692,3\n341#1:715,3\n352#1:769,3\n352#1:792,3\n382#1:856,3\n382#1:879,3\n396#1:934,3\n396#1:954,3\n79#1:474\n79#1:475,2\n221#1:581\n221#1:582,2\n341#1:703\n341#1:704,2\n352#1:780\n352#1:781,2\n382#1:867\n382#1:868,2\n396#1:911\n396#1:912,2\n117#1:514\n205#1:529\n412#1:820\n107#1:505,5\n117#1:510,4\n117#1:517,4\n205#1:521,8\n205#1:532,4\n412#1:812,8\n412#1:823,4\n117#1:515,2\n205#1:530,2\n412#1:821,2\n396#1:917\n*E\n"})
public final class FocusTargetNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, FocusTargetModifierNode, ObserverModifierNode, ModifierLocalModifierNode {

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private FocusStateImpl committedFocusState;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private boolean isProcessingCustomEnter;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private final Function1 onDispatchEventsCompleted;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private int previouslyFocusedChildHash;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private boolean isProcessingCustomExit;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private int focusability;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Function2 onFocusChange;

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode$FocusTargetElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/focus/FocusTargetNode;", "<init>", "()V", "t", "()Landroidx/compose/ui/focus/FocusTargetNode;", "node", "", "O", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "", "hashCode", "()I", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FocusTargetElement extends ModifierNodeElement<FocusTargetNode> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final FocusTargetElement f31352n = new FocusTargetElement();

        @Override // androidx.compose.ui.node.ModifierNodeElement
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public void rl(FocusTargetNode node) {
        }

        public boolean equals(Object other) {
            return other == this;
        }

        public int hashCode() {
            return 1739042953;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public FocusTargetNode n() {
            return new FocusTargetNode(0, null, null, 7, null);
        }

        private FocusTargetElement() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.f31286n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.f31285O.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.f31289t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.J2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.f31346n.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.f31345O.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FocusStateImpl.f31349t.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[FocusStateImpl.J2.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public /* synthetic */ FocusTargetNode(int i2, Function2 function2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, function2, function1);
    }

    public /* synthetic */ FocusTargetNode(int i2, Function2 function2, Function1 function1, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? Focusability.INSTANCE.n() : i2, (i3 & 2) != 0 ? null : function2, (i3 & 4) != 0 ? null : function1, null);
    }

    private static final boolean ZwA(FocusTargetNode focusTargetNode) {
        int iN = NodeKind.n(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            InlineClassHelperKt.t("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = focusTargetNode.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.t(mutableVector, focusTargetNode.getNode(), false);
        } else {
            mutableVector.rl(child);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.r(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet() & iN) != 0) {
                for (Modifier.Node child2 = node; child2 != null; child2 = child2.getChild()) {
                    if ((child2.getKindSet() & iN) != 0) {
                        Modifier.Node nodeKN = child2;
                        MutableVector mutableVector2 = null;
                        while (nodeKN != null) {
                            if (nodeKN instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodeKN;
                                if (focusTargetNode2.VK2()) {
                                    int i2 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode2.ijL().ordinal()];
                                    if (i2 == 1 || i2 == 2 || i2 == 3) {
                                        return true;
                                    }
                                    if (i2 != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                            } else if ((nodeKN.getKindSet() & iN) != 0 && (nodeKN instanceof DelegatingNode)) {
                                int i3 = 0;
                                for (Modifier.Node delegate = ((DelegatingNode) nodeKN).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iN) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            nodeKN = delegate;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodeKN != null) {
                                                mutableVector2.rl(nodeKN);
                                                nodeKN = null;
                                            }
                                            mutableVector2.rl(delegate);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            nodeKN = DelegatableNodeKt.KN(mutableVector2);
                        }
                    }
                }
            }
            DelegatableNodeKt.t(mutableVector, node, false);
        }
        return false;
    }

    public static /* synthetic */ void eOa(FocusTargetNode focusTargetNode, FocusStateImpl focusStateImpl, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            focusStateImpl = null;
        }
        focusTargetNode.kC(focusStateImpl);
    }

    private static final boolean jE(FocusTargetNode focusTargetNode) {
        NodeChain nodes;
        int iN = NodeKind.n(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            InlineClassHelperKt.t("visitAncestors called on an unattached node");
        }
        Modifier.Node parent = focusTargetNode.getNode().getParent();
        LayoutNode layoutNodeHI = DelegatableNodeKt.HI(focusTargetNode);
        while (layoutNodeHI != null) {
            if ((layoutNodeHI.getNodes().getHead().getAggregateChildKindSet() & iN) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iN) != 0) {
                        Modifier.Node nodeKN = parent;
                        MutableVector mutableVector = null;
                        while (nodeKN != null) {
                            if (nodeKN instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodeKN;
                                if (focusTargetNode2.VK2()) {
                                    int i2 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode2.ijL().ordinal()];
                                    if (i2 != 1 && i2 != 2) {
                                        if (i2 == 3) {
                                            return true;
                                        }
                                        if (i2 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                    return false;
                                }
                            } else if ((nodeKN.getKindSet() & iN) != 0 && (nodeKN instanceof DelegatingNode)) {
                                int i3 = 0;
                                for (Modifier.Node delegate = ((DelegatingNode) nodeKN).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iN) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            nodeKN = delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodeKN != null) {
                                                mutableVector.rl(nodeKN);
                                                nodeKN = null;
                                            }
                                            mutableVector.rl(delegate);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            nodeKN = DelegatableNodeKt.KN(mutableVector);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeHI = layoutNodeHI.mYa();
            parent = (layoutNodeHI == null || (nodes = layoutNodeHI.getNodes()) == null) ? null : nodes.getTail();
        }
        return false;
    }

    public void R3E(FocusStateImpl focusStateImpl) {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            return;
        }
        FocusTargetNodeKt.t(this).gh(this, focusStateImpl);
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void UhV() {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            i7();
            return;
        }
        FocusStateImpl focusStateImplIjL = ijL();
        i7();
        if (focusStateImplIjL != ijL()) {
            W1c();
        }
    }

    public final boolean VK2() {
        return ComposeUiFlags.isTrackFocusEnabled || this.committedFocusState != null;
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    /* JADX INFO: renamed from: Vd, reason: merged with bridge method [inline-methods] */
    public FocusStateImpl ijL() {
        FocusStateImpl focusStateImplMUb;
        NodeChain nodes;
        if (!ComposeUiFlags.isTrackFocusEnabled) {
            FocusTransactionManager focusTransactionManagerN = FocusTargetNodeKt.n(this);
            if (focusTransactionManagerN != null && (focusStateImplMUb = focusTransactionManagerN.mUb(this)) != null) {
                return focusStateImplMUb;
            }
            FocusStateImpl focusStateImpl = this.committedFocusState;
            return focusStateImpl == null ? FocusStateImpl.J2 : focusStateImpl;
        }
        if (!getIsAttached()) {
            return FocusStateImpl.J2;
        }
        FocusOwner focusOwner = DelegatableNodeKt.ck(this).getFocusOwner();
        FocusTargetNode focusTargetNodeJ2 = focusOwner.J2();
        if (focusTargetNodeJ2 == null) {
            return FocusStateImpl.J2;
        }
        if (this == focusTargetNodeJ2) {
            return focusOwner.az() ? FocusStateImpl.f31345O : FocusStateImpl.f31346n;
        }
        if (focusTargetNodeJ2.getIsAttached()) {
            int iN = NodeKind.n(1024);
            if (!focusTargetNodeJ2.getNode().getIsAttached()) {
                InlineClassHelperKt.t("visitAncestors called on an unattached node");
            }
            Modifier.Node parent = focusTargetNodeJ2.getNode().getParent();
            LayoutNode layoutNodeHI = DelegatableNodeKt.HI(focusTargetNodeJ2);
            while (layoutNodeHI != null) {
                if ((layoutNodeHI.getNodes().getHead().getAggregateChildKindSet() & iN) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & iN) != 0) {
                            Modifier.Node nodeKN = parent;
                            MutableVector mutableVector = null;
                            while (nodeKN != null) {
                                if (nodeKN instanceof FocusTargetNode) {
                                    if (this == ((FocusTargetNode) nodeKN)) {
                                        return FocusStateImpl.f31349t;
                                    }
                                } else if ((nodeKN.getKindSet() & iN) != 0 && (nodeKN instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node delegate = ((DelegatingNode) nodeKN).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                        if ((delegate.getKindSet() & iN) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                nodeKN = delegate;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodeKN != null) {
                                                    mutableVector.rl(nodeKN);
                                                    nodeKN = null;
                                                }
                                                mutableVector.rl(delegate);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                nodeKN = DelegatableNodeKt.KN(mutableVector);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                layoutNodeHI = layoutNodeHI.mYa();
                parent = (layoutNodeHI == null || (nodes = layoutNodeHI.getNodes()) == null) ? null : nodes.getTail();
            }
        }
        return FocusStateImpl.J2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void W1c() {
        NodeChain nodes;
        Function2 function2;
        FocusStateImpl focusStateImpl = this.committedFocusState;
        if (focusStateImpl == null) {
            focusStateImpl = FocusStateImpl.J2;
        }
        FocusStateImpl focusStateImplIjL = ijL();
        if (focusStateImpl != focusStateImplIjL && (function2 = this.onFocusChange) != null) {
            function2.invoke(focusStateImpl, focusStateImplIjL);
        }
        int iN = NodeKind.n(4096);
        int iN2 = NodeKind.n(1024);
        Modifier.Node node = getNode();
        int i2 = iN | iN2;
        if (!getNode().getIsAttached()) {
            InlineClassHelperKt.t("visitAncestors called on an unattached node");
        }
        Modifier.Node node2 = getNode();
        LayoutNode layoutNodeHI = DelegatableNodeKt.HI(this);
        loop0: while (layoutNodeHI != null) {
            if ((layoutNodeHI.getNodes().getHead().getAggregateChildKindSet() & i2) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet() & i2) != 0) {
                        if (node2 != node && (node2.getKindSet() & iN2) != 0) {
                            break loop0;
                        }
                        if ((node2.getKindSet() & iN) != 0) {
                            ?? KN = node2;
                            ?? mutableVector = 0;
                            while (KN != 0) {
                                if (KN instanceof FocusEventModifierNode) {
                                    FocusEventModifierNode focusEventModifierNode = (FocusEventModifierNode) KN;
                                    focusEventModifierNode.B(FocusEventModifierNodeKt.n(focusEventModifierNode));
                                } else if ((KN.getKindSet() & iN) != 0 && (KN instanceof DelegatingNode)) {
                                    Modifier.Node delegate = ((DelegatingNode) KN).getDelegate();
                                    int i3 = 0;
                                    KN = KN;
                                    mutableVector = mutableVector;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iN) != 0) {
                                            i3++;
                                            mutableVector = mutableVector;
                                            if (i3 == 1) {
                                                KN = delegate;
                                            } else {
                                                if (mutableVector == 0) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (KN != 0) {
                                                    mutableVector.rl(KN);
                                                    KN = 0;
                                                }
                                                mutableVector.rl(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        KN = KN;
                                        mutableVector = mutableVector;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                KN = DelegatableNodeKt.KN(mutableVector);
                            }
                        }
                    }
                    node2 = node2.getParent();
                }
            }
            layoutNodeHI = layoutNodeHI.mYa();
            node2 = (layoutNodeHI == null || (nodes = layoutNodeHI.getNodes()) == null) ? null : nodes.getTail();
        }
        Function1 function1 = this.onDispatchEventsCompleted;
        if (function1 != null) {
            function1.invoke(this);
        }
    }

    /* JADX INFO: renamed from: WKb, reason: from getter */
    public final int getPreviouslyFocusedChildHash() {
        return this.previouslyFocusedChildHash;
    }

    public final void Yq(int i2) {
        this.previouslyFocusedChildHash = i2;
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    public boolean a(int focusDirection) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean zMUb = false;
            if (!ni().getCanFocus()) {
                Trace.endSection();
                return false;
            }
            if (ComposeUiFlags.isTrackFocusEnabled) {
                int i2 = WhenMappings.$EnumSwitchMapping$0[FocusTransactionsKt.xMQ(this, focusDirection).ordinal()];
                if (i2 == 1) {
                    zMUb = FocusTransactionsKt.mUb(this);
                } else if (i2 == 2) {
                    zMUb = true;
                } else if (i2 != 3 && i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                FocusTransactionManager focusTransactionManagerT = FocusTargetNodeKt.t(this);
                Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.ui.focus.FocusTargetNode$requestFocus$1$1
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
                        if (this.f31355n.getNode().getIsAttached()) {
                            this.f31355n.W1c();
                        }
                    }
                };
                try {
                    if (focusTransactionManagerT.getOngoingTransaction()) {
                        focusTransactionManagerT.J2();
                    }
                    focusTransactionManagerT.O();
                    focusTransactionManagerT.cancellationListener.rl(function0);
                    int i3 = WhenMappings.$EnumSwitchMapping$0[FocusTransactionsKt.xMQ(this, focusDirection).ordinal()];
                    if (i3 == 1) {
                        zMUb = FocusTransactionsKt.mUb(this);
                    } else if (i3 == 2) {
                        zMUb = true;
                    } else if (i3 != 3 && i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                } finally {
                    focusTransactionManagerT.Uo();
                }
            }
            return zMUb;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public int getFocusability() {
        return this.focusability;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void c() {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            return;
        }
        FocusTargetNodeKt.rl(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: lRt, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final FocusProperties ni() {
        NodeChain nodes;
        FocusPropertiesImpl focusPropertiesImpl = new FocusPropertiesImpl();
        focusPropertiesImpl.KN(Focusability.nr(getFocusability(), this));
        int iN = NodeKind.n(2048);
        int iN2 = NodeKind.n(1024);
        Modifier.Node node = getNode();
        int i2 = iN | iN2;
        if (!getNode().getIsAttached()) {
            InlineClassHelperKt.t("visitAncestors called on an unattached node");
        }
        Modifier.Node node2 = getNode();
        LayoutNode layoutNodeHI = DelegatableNodeKt.HI(this);
        while (layoutNodeHI != null) {
            if ((layoutNodeHI.getNodes().getHead().getAggregateChildKindSet() & i2) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet() & i2) != 0) {
                        if (node2 != node && (node2.getKindSet() & iN2) != 0) {
                            return focusPropertiesImpl;
                        }
                        if ((node2.getKindSet() & iN) != 0) {
                            ?? KN = node2;
                            ?? mutableVector = 0;
                            while (KN != 0) {
                                if (KN instanceof FocusPropertiesModifierNode) {
                                    ((FocusPropertiesModifierNode) KN).n7b(focusPropertiesImpl);
                                } else if ((KN.getKindSet() & iN) != 0 && (KN instanceof DelegatingNode)) {
                                    Modifier.Node delegate = ((DelegatingNode) KN).getDelegate();
                                    int i3 = 0;
                                    KN = KN;
                                    mutableVector = mutableVector;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iN) != 0) {
                                            i3++;
                                            mutableVector = mutableVector;
                                            if (i3 == 1) {
                                                KN = delegate;
                                            } else {
                                                if (mutableVector == 0) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (KN != 0) {
                                                    mutableVector.rl(KN);
                                                    KN = 0;
                                                }
                                                mutableVector.rl(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        KN = KN;
                                        mutableVector = mutableVector;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                KN = DelegatableNodeKt.KN(mutableVector);
                            }
                        }
                    }
                    node2 = node2.getParent();
                }
            }
            layoutNodeHI = layoutNodeHI.mYa();
            node2 = (layoutNodeHI == null || (nodes = layoutNodeHI.getNodes()) == null) ? null : nodes.getTail();
        }
        return focusPropertiesImpl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v5 */
    public final void pr(FocusState previousState, FocusState newState) {
        NodeChain nodes;
        Function2 function2;
        FocusOwner focusOwner = DelegatableNodeKt.ck(this).getFocusOwner();
        FocusTargetNode focusTargetNodeJ2 = focusOwner.J2();
        if (!Intrinsics.areEqual(previousState, newState) && (function2 = this.onFocusChange) != null) {
            function2.invoke(previousState, newState);
        }
        int iN = NodeKind.n(4096);
        int iN2 = NodeKind.n(1024);
        Modifier.Node node = getNode();
        int i2 = iN | iN2;
        if (!getNode().getIsAttached()) {
            InlineClassHelperKt.t("visitAncestors called on an unattached node");
        }
        Modifier.Node node2 = getNode();
        LayoutNode layoutNodeHI = DelegatableNodeKt.HI(this);
        loop0: while (layoutNodeHI != null) {
            if ((layoutNodeHI.getNodes().getHead().getAggregateChildKindSet() & i2) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet() & i2) != 0) {
                        if (node2 != node && (node2.getKindSet() & iN2) != 0) {
                            break loop0;
                        }
                        if ((node2.getKindSet() & iN) != 0) {
                            ?? KN = node2;
                            ?? mutableVector = 0;
                            while (KN != 0) {
                                if (KN instanceof FocusEventModifierNode) {
                                    FocusEventModifierNode focusEventModifierNode = (FocusEventModifierNode) KN;
                                    if (focusTargetNodeJ2 == focusOwner.J2()) {
                                        focusEventModifierNode.B(newState);
                                    }
                                } else if ((KN.getKindSet() & iN) != 0 && (KN instanceof DelegatingNode)) {
                                    Modifier.Node delegate = ((DelegatingNode) KN).getDelegate();
                                    int i3 = 0;
                                    KN = KN;
                                    mutableVector = mutableVector;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iN) != 0) {
                                            i3++;
                                            mutableVector = mutableVector;
                                            if (i3 == 1) {
                                                KN = delegate;
                                            } else {
                                                if (mutableVector == 0) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (KN != 0) {
                                                    mutableVector.rl(KN);
                                                    KN = 0;
                                                }
                                                mutableVector.rl(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        KN = KN;
                                        mutableVector = mutableVector;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                KN = DelegatableNodeKt.KN(mutableVector);
                            }
                        }
                    }
                    node2 = node2.getParent();
                }
            }
            layoutNodeHI = layoutNodeHI.mYa();
            node2 = (layoutNodeHI == null || (nodes = layoutNodeHI.getNodes()) == null) ? null : nodes.getTail();
        }
        Function1 function1 = this.onDispatchEventsCompleted;
        if (function1 != null) {
            function1.invoke(this);
        }
    }

    public final BeyondBoundsLayout GT() {
        return (BeyondBoundsLayout) aYN(androidx.compose.ui.layout.BeyondBoundsLayoutKt.n());
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void Sax() {
        int i2 = WhenMappings.$EnumSwitchMapping$1[ijL().ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3 && !ComposeUiFlags.isTrackFocusEnabled) {
                FocusTransactionManager focusTransactionManagerT = FocusTargetNodeKt.t(this);
                try {
                    if (focusTransactionManagerT.getOngoingTransaction()) {
                        focusTransactionManagerT.J2();
                    }
                    focusTransactionManagerT.O();
                    R3E(FocusStateImpl.J2);
                    Unit unit = Unit.INSTANCE;
                    focusTransactionManagerT.Uo();
                } catch (Throwable th) {
                    focusTransactionManagerT.Uo();
                    throw th;
                }
            }
        } else {
            FocusOwner focusOwner = DelegatableNodeKt.ck(this).getFocusOwner();
            focusOwner.ty(true, true, false, FocusDirection.INSTANCE.t());
            if (ComposeUiFlags.isTrackFocusEnabled) {
                focusOwner.KN();
            } else {
                FocusTargetNodeKt.rl(this);
            }
        }
        this.committedFocusState = null;
    }

    public final void i7() {
        FocusProperties focusProperties = null;
        if (!VK2()) {
            eOa(this, null, 1, null);
        }
        int i2 = WhenMappings.$EnumSwitchMapping$1[ijL().ordinal()];
        if (i2 == 1 || i2 == 2) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ObserverModifierNodeKt.n(this, new Function0<Unit>() { // from class: androidx.compose.ui.focus.FocusTargetNode$invalidateFocus$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Type inference failed for: r1v1, types: [T, androidx.compose.ui.focus.FocusProperties] */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    objectRef.element = this.ni();
                }
            });
            T t3 = objectRef.element;
            if (t3 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("focusProperties");
            } else {
                focusProperties = (FocusProperties) t3;
            }
            if (!focusProperties.getCanFocus()) {
                DelegatableNodeKt.ck(this).getFocusOwner().S(true);
            }
        }
    }

    public final void kC(FocusStateImpl initialFocusState) {
        if (!VK2()) {
            if (!ComposeUiFlags.isTrackFocusEnabled) {
                FocusTransactionManager focusTransactionManagerT = FocusTargetNodeKt.t(this);
                try {
                    if (focusTransactionManagerT.getOngoingTransaction()) {
                        focusTransactionManagerT.J2();
                    }
                    focusTransactionManagerT.O();
                    if (initialFocusState == null) {
                        if (jE(this) && ZwA(this)) {
                            initialFocusState = FocusStateImpl.f31349t;
                        } else {
                            initialFocusState = FocusStateImpl.J2;
                        }
                    }
                    R3E(initialFocusState);
                    Unit unit = Unit.INSTANCE;
                    focusTransactionManagerT.Uo();
                    return;
                } catch (Throwable th) {
                    focusTransactionManagerT.Uo();
                    throw th;
                }
            }
            return;
        }
        throw new IllegalStateException("Re-initializing focus target node.");
    }

    public final void poH() {
        FocusStateImpl focusStateImplMUb = FocusTargetNodeKt.t(this).mUb(this);
        if (focusStateImplMUb != null) {
            this.committedFocusState = focusStateImplMUb;
        } else {
            InlineClassHelperKt.nr("committing a node that was not updated in the current transaction");
            throw new KotlinNothingValueException();
        }
    }

    private FocusTargetNode(int i2, Function2 function2, Function1 function1) {
        this.onFocusChange = function2;
        this.onDispatchEventsCompleted = function1;
        this.focusability = i2;
    }
}
