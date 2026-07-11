package androidx.compose.foundation;

import GJW.C;
import GJW.xuv;
import android.view.KeyEvent;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.events.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001:Bw\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\u0019\u001a\u00020\u0004*\u00020\u0018H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJx\u0010\u001b\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\u0004*\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0014ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001a\u0010$\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0014ø\u0001\u0000¢\u0006\u0004\b$\u0010#J\u000f\u0010%\u001a\u00020\u0004H\u0014¢\u0006\u0004\b%\u0010\u0017J\u000f\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010*R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00106\u001a\b\u0012\u0004\u0012\u000203028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u00109\u001a\b\u0012\u0004\u0012\u000207028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00105\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006;"}, d2 = {"Landroidx/compose/foundation/CombinedClickableNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/foundation/AbstractClickableNode;", "Lkotlin/Function0;", "", "onClick", "", "onLongClickLabel", "onLongClick", "onDoubleClick", "", "hapticFeedbackEnabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/IndicationNodeFactory;", "indicationNodeFactory", "enabled", "onClickLabel", "Landroidx/compose/ui/semantics/Role;", "role", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "q", "()V", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "kC", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", TtmlNode.TAG_P, "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;)V", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "jE", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "Landroidx/compose/ui/input/key/KeyEvent;", a.f62811a, "yUZ", "(Landroid/view/KeyEvent;)Z", "Bha", "kR", "kQ", "z", "Ljava/lang/String;", "piY", "Lkotlin/jvm/functions/Function0;", "ijL", "m", "Z", "u2n", "()Z", "Hq", "(Z)V", "Landroidx/collection/MutableLongObjectMap;", "LGJW/xuv;", "eTf", "Landroidx/collection/MutableLongObjectMap;", "longKeyPressJobs", "Landroidx/compose/foundation/CombinedClickableNode$DoubleKeyClickState;", "xg", "doubleKeyClickStates", "DoubleKeyClickState", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/CombinedClickableNode\n+ 2 LongObjectMap.kt\nandroidx/collection/LongObjectMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1327:1\n397#2,3:1328\n354#2,6:1331\n364#2,3:1338\n367#2,9:1342\n400#2:1351\n397#2,3:1352\n354#2,6:1355\n364#2,3:1362\n367#2,9:1366\n400#2:1375\n1399#3:1337\n1270#3:1341\n1399#3:1361\n1270#3:1365\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/CombinedClickableNode\n*L\n948#1:1328,3\n948#1:1331,6\n948#1:1338,3\n948#1:1342,9\n948#1:1351\n952#1:1352,3\n952#1:1355,6\n952#1:1362,3\n952#1:1366,9\n952#1:1375\n948#1:1337\n948#1:1341\n952#1:1361\n952#1:1365\n*E\n"})
final class CombinedClickableNode extends AbstractClickableNode implements CompositionLocalConsumerModifierNode {

    /* JADX INFO: renamed from: eTf, reason: from kotlin metadata */
    private final MutableLongObjectMap longKeyPressJobs;

    /* JADX INFO: renamed from: ijL, reason: from kotlin metadata */
    private Function0 onDoubleClick;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean hapticFeedbackEnabled;

    /* JADX INFO: renamed from: piY, reason: from kotlin metadata */
    private Function0 onLongClick;

    /* JADX INFO: renamed from: xg, reason: from kotlin metadata */
    private final MutableLongObjectMap doubleKeyClickStates;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private String onLongClickLabel;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0006\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/CombinedClickableNode$DoubleKeyClickState;", "", "LGJW/xuv;", "job", "<init>", "(LGJW/xuv;)V", c.f62177j, "LGJW/xuv;", "rl", "()LGJW/xuv;", "", "Z", "()Z", "t", "(Z)V", "doubleTapMinTimeMillisElapsed", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DoubleKeyClickState {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final xuv job;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private boolean doubleTapMinTimeMillisElapsed;

        /* JADX INFO: renamed from: n, reason: from getter */
        public final boolean getDoubleTapMinTimeMillisElapsed() {
            return this.doubleTapMinTimeMillisElapsed;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final xuv getJob() {
            return this.job;
        }

        public final void t(boolean z2) {
            this.doubleTapMinTimeMillisElapsed = z2;
        }

        public DoubleKeyClickState(xuv xuvVar) {
            this.job = xuvVar;
        }
    }

    public /* synthetic */ CombinedClickableNode(Function0 function0, String str, Function0 function02, Function0 function03, boolean z2, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z3, String str2, Role role, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, str, function02, function03, z2, mutableInteractionSource, indicationNodeFactory, z3, str2, role);
    }

    private CombinedClickableNode(Function0 function0, String str, Function0 function02, Function0 function03, boolean z2, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z3, String str2, Role role) {
        super(mutableInteractionSource, indicationNodeFactory, z3, str2, role, function0, null);
        this.onLongClickLabel = str;
        this.onLongClick = function02;
        this.onDoubleClick = function03;
        this.hapticFeedbackEnabled = z2;
        this.longKeyPressJobs = LongObjectMapKt.t();
        this.doubleKeyClickStates = LongObjectMapKt.t();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void q() {
        long j2;
        long j3;
        long j4;
        MutableLongObjectMap mutableLongObjectMap = this.longKeyPressJobs;
        Object[] objArr = mutableLongObjectMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
        long[] jArr = mutableLongObjectMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            j2 = 128;
            j3 = 255;
            while (true) {
                long j5 = jArr[i2];
                j4 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i3; i5++) {
                        if ((j5 & 255) < 128) {
                            xuv.j.rl((xuv) objArr[(i2 << 3) + i5], null, 1, null);
                        }
                        j5 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    } else if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        } else {
            j2 = 128;
            j3 = 255;
            j4 = -9187201950435737472L;
        }
        mutableLongObjectMap.Uo();
        MutableLongObjectMap mutableLongObjectMap2 = this.doubleKeyClickStates;
        Object[] objArr2 = mutableLongObjectMap2.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
        long[] jArr2 = mutableLongObjectMap2.metadata;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i7 = 0;
            while (true) {
                long j6 = jArr2[i7];
                if ((((~j6) << 7) & j6 & j4) != j4) {
                    int i8 = 8 - ((~(i7 - length2)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((j6 & j3) < j2) {
                            xuv.j.rl(((DoubleKeyClickState) objArr2[(i7 << 3) + i9]).getJob(), null, 1, null);
                        }
                        j6 >>= 8;
                    }
                    if (i8 != 8) {
                        break;
                    } else if (i7 == length2) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
        }
        mutableLongObjectMap2.Uo();
    }

    public final void Hq(boolean z2) {
        this.hapticFeedbackEnabled = z2;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public void jE(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (this.onLongClick != null) {
            SemanticsPropertiesKt.E2(semanticsPropertyReceiver, this.onLongClickLabel, new Function0<Boolean>() { // from class: androidx.compose.foundation.CombinedClickableNode$applyAdditionalSemantics$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    Function0 function0 = this.f16079n.onLongClick;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    return Boolean.TRUE;
                }
            });
        }
    }

    public final void p(Function0 onClick, String onLongClickLabel, Function0 onLongClick, Function0 onDoubleClick, MutableInteractionSource interactionSource, IndicationNodeFactory indicationNodeFactory, boolean enabled, String onClickLabel, Role role) {
        boolean z2;
        if (!Intrinsics.areEqual(this.onLongClickLabel, onLongClickLabel)) {
            this.onLongClickLabel = onLongClickLabel;
            SemanticsModifierNodeKt.rl(this);
        }
        if ((this.onLongClick == null) != (onLongClick == null)) {
            i7();
            SemanticsModifierNodeKt.rl(this);
            z2 = true;
        } else {
            z2 = false;
        }
        this.onLongClick = onLongClick;
        if ((this.onDoubleClick == null) != (onDoubleClick == null)) {
            z2 = true;
        }
        this.onDoubleClick = onDoubleClick;
        boolean z3 = getEnabled() == enabled ? z2 : true;
        ENe(interactionSource, indicationNodeFactory, enabled, onClickLabel, role, onClick);
        if (z3) {
            YE();
        }
    }

    /* JADX INFO: renamed from: u2n, reason: from getter */
    public final boolean getHapticFeedbackEnabled() {
        return this.hapticFeedbackEnabled;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    protected boolean Bha(KeyEvent event) {
        Function0 function0;
        long jN = KeyEvent_androidKt.n(event);
        boolean z2 = false;
        if (this.longKeyPressJobs.rl(jN) != null) {
            xuv xuvVar = (xuv) this.longKeyPressJobs.rl(jN);
            if (xuvVar != null) {
                if (xuvVar.isActive()) {
                    xuv.j.rl(xuvVar, null, 1, null);
                } else {
                    z2 = true;
                }
            }
            this.longKeyPressJobs.HI(jN);
        }
        if (this.onDoubleClick != null) {
            if (this.doubleKeyClickStates.rl(jN) == null) {
                if (!z2) {
                    this.doubleKeyClickStates.r(jN, new DoubleKeyClickState(C.nr(Xli(), null, null, new CombinedClickableNode$onClickKeyUpEvent$2(this, jN, null), 3, null)));
                }
            } else {
                if (!z2 && (function0 = this.onDoubleClick) != null) {
                    function0.invoke();
                }
                this.doubleKeyClickStates.HI(jN);
            }
        } else if (!z2) {
            getOnClick().invoke();
        }
        return true;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public Object kC(PointerInputScope pointerInputScope, Continuation continuation) {
        Function1<Offset, Unit> function1;
        Function1<Offset, Unit> function12;
        if (getEnabled() && this.onDoubleClick != null) {
            function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.CombinedClickableNode$clickPointerInput$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    n(offset.getPackedValue());
                    return Unit.INSTANCE;
                }

                public final void n(long j2) {
                    Function0 function0 = this.f16080n.onDoubleClick;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            };
        } else {
            function1 = null;
        }
        if (getEnabled() && this.onLongClick != null) {
            function12 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.CombinedClickableNode$clickPointerInput$3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    n(offset.getPackedValue());
                    return Unit.INSTANCE;
                }

                public final void n(long j2) {
                    Function0 function0 = this.f16081n.onLongClick;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    if (this.f16081n.getHapticFeedbackEnabled()) {
                        ((HapticFeedback) CompositionLocalConsumerModifierNodeKt.n(this.f16081n, CompositionLocalsKt.gh())).n(HapticFeedbackType.INSTANCE.O());
                    }
                }
            };
        } else {
            function12 = null;
        }
        Object objQie = TapGestureDetectorKt.qie(pointerInputScope, function1, function12, new CombinedClickableNode$clickPointerInput$4(this, null), new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.CombinedClickableNode$clickPointerInput$5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                n(offset.getPackedValue());
                return Unit.INSTANCE;
            }

            public final void n(long j2) {
                if (this.f16085n.getEnabled()) {
                    this.f16085n.getOnClick().invoke();
                }
            }
        }, continuation);
        if (objQie == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objQie;
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void kQ() {
        super.kQ();
        q();
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    protected void kR() {
        q();
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    protected boolean yUZ(KeyEvent event) {
        boolean z2;
        long jN = KeyEvent_androidKt.n(event);
        if (this.onLongClick != null && this.longKeyPressJobs.rl(jN) == null) {
            this.longKeyPressJobs.r(jN, C.nr(Xli(), null, null, new CombinedClickableNode$onClickKeyDownEvent$1(this, null), 3, null));
            z2 = true;
        } else {
            z2 = false;
        }
        DoubleKeyClickState doubleKeyClickState = (DoubleKeyClickState) this.doubleKeyClickStates.rl(jN);
        if (doubleKeyClickState != null) {
            if (doubleKeyClickState.getJob().isActive()) {
                xuv.j.rl(doubleKeyClickState.getJob(), null, 1, null);
                if (!doubleKeyClickState.getDoubleTapMinTimeMillisElapsed()) {
                    getOnClick().invoke();
                    this.doubleKeyClickStates.HI(jN);
                    return z2;
                }
            } else {
                this.doubleKeyClickStates.HI(jN);
            }
        }
        return z2;
    }
}
