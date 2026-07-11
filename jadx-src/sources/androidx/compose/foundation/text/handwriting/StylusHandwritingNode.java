package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.gestures.TapGestureDetector_androidKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusRequesterModifierNode;
import androidx.compose.ui.focus.FocusRequesterModifierNodeKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\tR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010(\u001a\u00020%8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b&\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Landroidx/compose/foundation/text/handwriting/StylusHandwritingNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "Lkotlin/Function0;", "", "onHandwritingSlopExceeded", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/focus/FocusState;", "focusState", "B", "(Landroidx/compose/ui/focus/FocusState;)V", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "C", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "lNy", "()V", "jB", "Lkotlin/jvm/functions/Function0;", "ni", "()Lkotlin/jvm/functions/Function0;", "GT", "", "U", "Z", "focused", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "P5", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "suspendingPointerInputModifierNode", "Landroidx/compose/ui/node/TouchBoundsExpansion;", "X4T", "()J", "touchBoundsExpansion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class StylusHandwritingNode extends DelegatingNode implements PointerInputModifierNode, FocusEventModifierNode, FocusRequesterModifierNode {

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private final SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = (SuspendingPointerInputModifierNode) UR(SuspendingPointerInputFilterKt.n(new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1

        /* JADX INFO: renamed from: androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1", f = "StylusHandwriting.kt", i = {0, 1, 1, 1, 2, 2}, l = {105, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 171}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "firstDown", "pass", "$this$awaitEachGesture", "firstDown"}, s = {"L$0", "L$0", "L$1", "L$2", "L$0", "L$1"})
        @SourceDebugExtension({"SMAP\nStylusHandwriting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StylusHandwriting.kt\nandroidx/compose/foundation/text/handwriting/StylusHandwritingNode$suspendingPointerInputModifierNode$1$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,215:1\n65#2:216\n65#2:219\n69#2:224\n69#2:227\n60#3:217\n60#3:220\n85#3:223\n70#3:225\n70#3:228\n90#3:231\n22#4:218\n22#4:221\n22#4:226\n22#4:229\n54#5:222\n59#5:230\n117#6,2:232\n34#6,6:234\n119#6:240\n117#6,2:241\n34#6,6:243\n119#6:249\n*S KotlinDebug\n*F\n+ 1 StylusHandwriting.kt\nandroidx/compose/foundation/text/handwriting/StylusHandwritingNode$suspendingPointerInputModifierNode$1$1\n*L\n114#1:216\n115#1:219\n116#1:224\n117#1:227\n114#1:217\n115#1:220\n115#1:223\n116#1:225\n117#1:228\n117#1:231\n114#1:218\n115#1:221\n116#1:226\n117#1:229\n115#1:222\n117#1:230\n136#1:232,2\n136#1:234,6\n136#1:240\n173#1:241,2\n173#1:243,6\n173#1:249\n*E\n"})
        static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            int f19967O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f19968n;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ StylusHandwritingNode f19969r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            Object f19970t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(StylusHandwritingNode stylusHandwritingNode, Continuation continuation) {
                super(2, continuation);
                this.f19969r = stylusHandwritingNode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f19969r, continuation);
                anonymousClass1.J2 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
                return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
            
                if (r8 == r1) goto L74;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00f4, code lost:
            
                if (r9 != r1) goto L42;
             */
            /* JADX WARN: Code restructure failed: missing block: B:73:0x01a3, code lost:
            
                if (r5 != r1) goto L75;
             */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x01a5, code lost:
            
                return r1;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00f4 -> B:42:0x00f8). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x01a3 -> B:75:0x01a6). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                AwaitPointerEventScope awaitPointerEventScope;
                Object objO;
                AwaitPointerEventScope awaitPointerEventScope2;
                PointerEventPass pointerEventPass;
                PointerInputChange pointerInputChange;
                Object objHBN;
                AwaitPointerEventScope awaitPointerEventScope3;
                Object obj2;
                AwaitPointerEventScope awaitPointerEventScope4;
                PointerInputChange pointerInputChange2;
                Object obj3;
                Object objHBN2;
                Object obj4;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f19967O;
                int i3 = 2;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    awaitPointerEventScope = (AwaitPointerEventScope) this.J2;
                    PointerEventPass pointerEventPass2 = PointerEventPass.f32078n;
                    this.J2 = awaitPointerEventScope;
                    this.f19967O = 1;
                    objO = TapGestureDetectorKt.O(awaitPointerEventScope, true, pointerEventPass2, this);
                } else if (i2 == 1) {
                    awaitPointerEventScope = (AwaitPointerEventScope) this.J2;
                    ResultKt.throwOnFailure(obj);
                    objO = obj;
                } else if (i2 == 2) {
                    pointerEventPass = (PointerEventPass) this.f19970t;
                    pointerInputChange = (PointerInputChange) this.f19968n;
                    awaitPointerEventScope2 = (AwaitPointerEventScope) this.J2;
                    ResultKt.throwOnFailure(obj);
                    objHBN = obj;
                    PointerEvent pointerEvent = (PointerEvent) objHBN;
                    List changes = pointerEvent.getChanges();
                    int size = changes.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size) {
                            awaitPointerEventScope3 = awaitPointerEventScope2;
                            obj2 = null;
                            break;
                        }
                        obj2 = changes.get(i5);
                        PointerInputChange pointerInputChange3 = (PointerInputChange) obj2;
                        if (!pointerInputChange3.ck()) {
                            awaitPointerEventScope3 = awaitPointerEventScope2;
                            if (PointerId.t(pointerInputChange3.getId(), pointerInputChange.getId()) && pointerInputChange3.getPressed()) {
                                break;
                            }
                        } else {
                            awaitPointerEventScope3 = awaitPointerEventScope2;
                        }
                        i5++;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                    }
                    PointerInputChange pointerInputChange4 = (PointerInputChange) obj2;
                    if (pointerInputChange4 == null || pointerInputChange4.getUptimeMillis() - pointerInputChange.getUptimeMillis() >= awaitPointerEventScope3.getViewConfiguration().t() || TapGestureDetector_androidKt.rl(pointerEvent)) {
                        pointerInputChange4 = null;
                    } else if (Offset.gh(Offset.ck(pointerInputChange4.getPosition(), pointerInputChange.getPosition())) <= awaitPointerEventScope3.getViewConfiguration().nr()) {
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        i3 = 2;
                        this.J2 = awaitPointerEventScope2;
                        this.f19968n = pointerInputChange;
                        this.f19970t = pointerEventPass;
                        this.f19967O = i3;
                        objHBN = awaitPointerEventScope2.HBN(pointerEventPass, this);
                    }
                    if (pointerInputChange4 == null) {
                        return Unit.INSTANCE;
                    }
                    if (!this.f19969r.focused) {
                        FocusRequesterModifierNodeKt.rl(this.f19969r);
                    }
                    this.f19969r.getOnHandwritingSlopExceeded().invoke();
                    pointerInputChange4.n();
                    awaitPointerEventScope4 = awaitPointerEventScope3;
                    pointerInputChange2 = pointerInputChange;
                    PointerEventPass pointerEventPass3 = PointerEventPass.f32078n;
                    this.J2 = awaitPointerEventScope4;
                    this.f19968n = pointerInputChange2;
                    obj3 = null;
                    this.f19970t = null;
                    this.f19967O = 3;
                    objHBN2 = awaitPointerEventScope4.HBN(pointerEventPass3, this);
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pointerInputChange2 = (PointerInputChange) this.f19968n;
                    awaitPointerEventScope4 = (AwaitPointerEventScope) this.J2;
                    ResultKt.throwOnFailure(obj);
                    objHBN2 = obj;
                    obj3 = null;
                    List changes2 = ((PointerEvent) objHBN2).getChanges();
                    int size2 = changes2.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size2) {
                            obj4 = obj3;
                            break;
                        }
                        obj4 = changes2.get(i7);
                        PointerInputChange pointerInputChange5 = (PointerInputChange) obj4;
                        if (!pointerInputChange5.ck() && PointerId.t(pointerInputChange5.getId(), pointerInputChange2.getId()) && pointerInputChange5.getPressed()) {
                            break;
                        }
                        i7++;
                    }
                    PointerInputChange pointerInputChange6 = (PointerInputChange) obj4;
                    if (pointerInputChange6 == null) {
                        return Unit.INSTANCE;
                    }
                    pointerInputChange6.n();
                    PointerEventPass pointerEventPass32 = PointerEventPass.f32078n;
                    this.J2 = awaitPointerEventScope4;
                    this.f19968n = pointerInputChange2;
                    obj3 = null;
                    this.f19970t = null;
                    this.f19967O = 3;
                    objHBN2 = awaitPointerEventScope4.HBN(pointerEventPass32, this);
                }
                PointerInputChange pointerInputChange7 = (PointerInputChange) objO;
                int type = pointerInputChange7.getType();
                PointerType.Companion companion = PointerType.INSTANCE;
                if (!PointerType.KN(type, companion.t()) && !PointerType.KN(pointerInputChange7.getType(), companion.n())) {
                    return Unit.INSTANCE;
                }
                PointerEventPass pointerEventPass4 = (this.f19969r.focused || (Float.intBitsToFloat((int) (pointerInputChange7.getPosition() >> 32)) >= 0.0f && Float.intBitsToFloat((int) (pointerInputChange7.getPosition() >> 32)) < ((float) ((int) (awaitPointerEventScope.n() >> 32))) && Float.intBitsToFloat((int) (pointerInputChange7.getPosition() & 4294967295L)) >= 0.0f && Float.intBitsToFloat((int) (pointerInputChange7.getPosition() & 4294967295L)) < ((float) ((int) (awaitPointerEventScope.n() & 4294967295L))))) ? PointerEventPass.f32078n : PointerEventPass.f32080t;
                awaitPointerEventScope2 = awaitPointerEventScope;
                pointerEventPass = pointerEventPass4;
                pointerInputChange = pointerInputChange7;
                this.J2 = awaitPointerEventScope2;
                this.f19968n = pointerInputChange;
                this.f19970t = pointerEventPass;
                this.f19967O = i3;
                objHBN = awaitPointerEventScope2.HBN(pointerEventPass, this);
            }
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
            Object objO = ForEachGestureKt.O(pointerInputScope, new AnonymousClass1(this.f19966n, null), continuation);
            return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : Unit.INSTANCE;
        }
    }));

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private boolean focused;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private Function0 onHandwritingSlopExceeded;

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void C(PointerEvent pointerEvent, PointerEventPass pass, long bounds) {
        this.suspendingPointerInputModifierNode.C(pointerEvent, pass, bounds);
    }

    public final void GT(Function0 function0) {
        this.onHandwritingSlopExceeded = function0;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void lNy() {
        this.suspendingPointerInputModifierNode.lNy();
    }

    /* JADX INFO: renamed from: ni, reason: from getter */
    public final Function0 getOnHandwritingSlopExceeded() {
        return this.onHandwritingSlopExceeded;
    }

    public StylusHandwritingNode(Function0 function0) {
        this.onHandwritingSlopExceeded = function0;
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void B(FocusState focusState) {
        this.focused = focusState.n();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public long X4T() {
        return StylusHandwritingKt.n().n(DelegatableNodeKt.gh(this));
    }
}
