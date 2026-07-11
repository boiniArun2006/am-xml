package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/NestedScrollScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3", f = "MouseWheelScrollable.kt", i = {0, 0, 1, 1, 1, 2, 2}, l = {253, 266, 283}, m = "invokeSuspend", n = {"$this$userScroll", "requiredAnimation", "$this$userScroll", "requiredAnimation", "durationMillis", "$this$userScroll", "requiredAnimation"}, s = {"L$0", "L$1", "L$0", "L$1", "I$0", "L$0", "L$1"})
final class MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 extends SuspendLambda implements Function2<NestedScrollScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MouseWheelScrollingLogic E2;
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f16932O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef f16933S;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    final /* synthetic */ ScrollingLogic f16934X;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef f16935Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ float f16936e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ float f16937g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f16938n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ Ref.FloatRef f16939o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private /* synthetic */ Object f16940r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f16941t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(Ref.FloatRef floatRef, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, float f3, MouseWheelScrollingLogic mouseWheelScrollingLogic, float f4, ScrollingLogic scrollingLogic, Continuation continuation) {
        super(2, continuation);
        this.f16939o = floatRef;
        this.f16935Z = objectRef;
        this.f16933S = objectRef2;
        this.f16937g = f3;
        this.E2 = mouseWheelScrollingLogic;
        this.f16936e = f4;
        this.f16934X = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(this.f16939o, this.f16935Z, this.f16933S, this.f16937g, this.E2, this.f16936e, this.f16934X, continuation);
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16940r = obj;
        return mouseWheelScrollingLogic$dispatchMouseWheelScroll$3;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(NestedScrollScope nestedScrollScope, Continuation continuation) {
        return ((MouseWheelScrollingLogic$dispatchMouseWheelScroll$3) create(nestedScrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x018e  */
    /* JADX WARN: Type inference failed for: r2v12, types: [T, androidx.compose.animation.core.AnimationState] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x014f -> B:30:0x0151). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x015d -> B:13:0x0067). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        NestedScrollScope nestedScrollScope;
        Ref.BooleanRef booleanRef;
        NestedScrollScope nestedScrollScope2;
        Ref.BooleanRef booleanRef2;
        int i2;
        Ref.BooleanRef booleanRef3;
        NestedScrollScope nestedScrollScope3;
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = this;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            NestedScrollScope nestedScrollScope4 = (NestedScrollScope) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16940r;
            Ref.BooleanRef booleanRef4 = new Ref.BooleanRef();
            booleanRef4.element = true;
            nestedScrollScope = nestedScrollScope4;
            booleanRef = booleanRef4;
            if (!booleanRef.element) {
            }
        } else if (i3 == 1) {
            Ref.BooleanRef booleanRef5 = (Ref.BooleanRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16941t;
            booleanRef3 = (Ref.BooleanRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16938n;
            nestedScrollScope3 = (NestedScrollScope) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16940r;
            ResultKt.throwOnFailure(obj);
            booleanRef5.element = ((Boolean) obj).booleanValue();
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = this;
            booleanRef = booleanRef3;
            nestedScrollScope = nestedScrollScope3;
            if (!booleanRef.element) {
            }
        } else if (i3 == 2) {
            i2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16932O;
            Ref.BooleanRef booleanRef6 = (Ref.BooleanRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16938n;
            NestedScrollScope nestedScrollScope5 = (NestedScrollScope) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16940r;
            ResultKt.throwOnFailure(obj);
            booleanRef2 = booleanRef6;
            nestedScrollScope2 = nestedScrollScope5;
            if (booleanRef2.element) {
            }
        } else {
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ref.BooleanRef booleanRef7 = (Ref.BooleanRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16941t;
            booleanRef3 = (Ref.BooleanRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16938n;
            nestedScrollScope3 = (NestedScrollScope) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16940r;
            ResultKt.throwOnFailure(obj);
            booleanRef2 = booleanRef7;
            Object objO = obj;
            booleanRef2.element = ((Boolean) objO).booleanValue();
            booleanRef = booleanRef3;
            nestedScrollScope = nestedScrollScope3;
            if (!booleanRef.element) {
                booleanRef.element = false;
                float fFloatValue = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16939o.element - ((Number) ((AnimationState) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16935Z.element).getValue()).floatValue();
                if (((MouseWheelScrollingLogic.MouseWheelScrollDelta) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16933S.element).getShouldApplyImmediately() || Math.abs(fFloatValue) < mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16937g) {
                    Ref.BooleanRef booleanRef8 = booleanRef;
                    NestedScrollScope nestedScrollScope6 = nestedScrollScope;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.E2.Ik(nestedScrollScope6, fFloatValue);
                    MouseWheelScrollingLogic mouseWheelScrollingLogic = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.E2;
                    Ref.ObjectRef objectRef = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16933S;
                    Ref.FloatRef floatRef = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16939o;
                    ScrollingLogic scrollingLogic = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16934X;
                    Ref.ObjectRef objectRef2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16935Z;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16940r = nestedScrollScope6;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16938n = booleanRef8;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16941t = booleanRef8;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.J2 = 1;
                    Object objO2 = MouseWheelScrollingLogic.o(mouseWheelScrollingLogic, objectRef, floatRef, scrollingLogic, objectRef2, 50L, mouseWheelScrollingLogic$dispatchMouseWheelScroll$3);
                    if (objO2 != coroutine_suspended) {
                        booleanRef3 = booleanRef8;
                        nestedScrollScope3 = nestedScrollScope6;
                        booleanRef8.element = ((Boolean) objO2).booleanValue();
                        mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = this;
                        booleanRef = booleanRef3;
                        nestedScrollScope = nestedScrollScope3;
                        if (!booleanRef.element) {
                            return Unit.INSTANCE;
                        }
                    }
                } else {
                    float fSignum = Math.signum(fFloatValue) * mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16937g;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.E2.Ik(nestedScrollScope, fSignum);
                    Ref.ObjectRef objectRef3 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16935Z;
                    T t3 = objectRef3.element;
                    objectRef3.element = AnimationStateKt.Uo((AnimationState) t3, ((Number) ((AnimationState) t3).getValue()).floatValue() + fSignum, 0.0f, 0L, 0L, false, 30, null);
                    int iCoerceAtMost = RangesKt.coerceAtMost(MathKt.roundToInt(Math.abs(mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16939o.element - ((Number) ((AnimationState) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16935Z.element).getValue()).floatValue()) / mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16936e), 100);
                    final MouseWheelScrollingLogic mouseWheelScrollingLogic2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.E2;
                    AnimationState animationState = (AnimationState) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16935Z.element;
                    final Ref.FloatRef floatRef2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16939o;
                    float f3 = floatRef2.element;
                    final Ref.ObjectRef objectRef4 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16933S;
                    final ScrollingLogic scrollingLogic2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16934X;
                    final Ref.BooleanRef booleanRef9 = booleanRef;
                    Function1<Float, Boolean> function1 = new Function1<Float, Boolean>() { // from class: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Float f4) {
                            return n(f4.floatValue());
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r3v2, types: [T, androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta] */
                        public final Boolean n(float f4) {
                            MouseWheelScrollingLogic mouseWheelScrollingLogic3 = mouseWheelScrollingLogic2;
                            MouseWheelScrollingLogic.MouseWheelScrollDelta mouseWheelScrollDeltaWPU = mouseWheelScrollingLogic3.WPU(mouseWheelScrollingLogic3.channel);
                            if (mouseWheelScrollDeltaWPU != null) {
                                mouseWheelScrollingLogic2.aYN(mouseWheelScrollDeltaWPU);
                                Ref.ObjectRef objectRef5 = objectRef4;
                                objectRef5.element = ((MouseWheelScrollingLogic.MouseWheelScrollDelta) objectRef5.element).J2(mouseWheelScrollDeltaWPU);
                                Ref.FloatRef floatRef3 = floatRef2;
                                ScrollingLogic scrollingLogic3 = scrollingLogic2;
                                floatRef3.element = scrollingLogic3.e(scrollingLogic3.ViF(((MouseWheelScrollingLogic.MouseWheelScrollDelta) objectRef4.element).getValue()));
                                booleanRef9.element = !MouseWheelScrollableKt.nr(floatRef2.element - f4);
                            }
                            return Boolean.valueOf(mouseWheelScrollDeltaWPU != null);
                        }
                    };
                    booleanRef2 = booleanRef9;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16940r = nestedScrollScope;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16938n = booleanRef2;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16941t = null;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16932O = iCoerceAtMost;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.J2 = 2;
                    Object objAz = mouseWheelScrollingLogic2.az(nestedScrollScope, animationState, f3, iCoerceAtMost, function1, mouseWheelScrollingLogic$dispatchMouseWheelScroll$3);
                    nestedScrollScope2 = nestedScrollScope;
                    if (objAz != coroutine_suspended) {
                        i2 = iCoerceAtMost;
                        if (booleanRef2.element) {
                            mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16940r = nestedScrollScope2;
                            mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16938n = booleanRef2;
                            mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16941t = booleanRef2;
                            mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.J2 = 3;
                            objO = MouseWheelScrollingLogic.o(mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.E2, mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16933S, mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16939o, mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16934X, mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f16935Z, 50 - ((long) i2), mouseWheelScrollingLogic$dispatchMouseWheelScroll$3);
                            if (objO != coroutine_suspended) {
                                booleanRef3 = booleanRef2;
                                nestedScrollScope3 = nestedScrollScope2;
                                booleanRef2.element = ((Boolean) objO).booleanValue();
                                booleanRef = booleanRef3;
                                nestedScrollScope = nestedScrollScope3;
                                if (!booleanRef.element) {
                                }
                            }
                        } else {
                            booleanRef = booleanRef2;
                            nestedScrollScope = nestedScrollScope2;
                            if (!booleanRef.element) {
                            }
                        }
                    }
                }
                return coroutine_suspended;
            }
        }
    }
}
