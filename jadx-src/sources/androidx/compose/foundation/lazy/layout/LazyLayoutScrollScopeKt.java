package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.common.ConnectionResult;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a4\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0080@¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000f¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;", "", "index", "", "nr", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;I)Z", "scrollOffset", "numOfItemsForTeleport", "Landroidx/compose/ui/unit/Density;", "density", "", "rl", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;IIILandroidx/compose/ui/unit/Density;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/unit/Dp;", c.f62177j, "F", "TargetDistance", "BoundDistance", "t", "MinimumDistance", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyLayoutScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutScrollScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,297:1\n42#1,4:304\n42#1,4:308\n96#2,5:298\n1#3:303\n113#4:312\n113#4:313\n113#4:314\n*S KotlinDebug\n*F\n+ 1 LazyLayoutScrollScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt\n*L\n169#1:304,4\n263#1:308,4\n116#1:298,5\n35#1:312\n36#1:313\n37#1:314\n*E\n"})
public final class LazyLayoutScrollScopeKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f18523n = Dp.KN(2500);
    private static final float rl = Dp.KN(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f18524t = Dp.KN(50);

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(boolean z2, LazyLayoutScrollScope lazyLayoutScrollScope, int i2, int i3) {
        if (z2) {
            if (lazyLayoutScrollScope.KN() > i2) {
                return true;
            }
            return lazyLayoutScrollScope.KN() == i2 && lazyLayoutScrollScope.Uo() > i3;
        }
        if (lazyLayoutScrollScope.KN() < i2) {
            return true;
        }
        return lazyLayoutScrollScope.KN() == i2 && lazyLayoutScrollScope.Uo() < i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea A[Catch: ItemFoundInScroll -> 0x01ec, TryCatch #6 {ItemFoundInScroll -> 0x01ec, blocks: (B:35:0x00e6, B:37:0x00ea, B:39:0x00f0, B:53:0x0121, B:57:0x015d), top: B:116:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x024f  */
    /* JADX WARN: Type inference failed for: r8v0, types: [T, androidx.compose.animation.core.AnimationState] */
    /* JADX WARN: Type inference failed for: r8v16, types: [T, androidx.compose.animation.core.AnimationState] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x01b5 -> B:18:0x0072). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object rl(LazyLayoutScrollScope lazyLayoutScrollScope, int i2, int i3, int i5, Density density, Continuation continuation) {
        LazyLayoutScrollScopeKt$animateScrollToItem$1 lazyLayoutScrollScopeKt$animateScrollToItem$1;
        float f3;
        final LazyLayoutScrollScope lazyLayoutScrollScope2;
        int i7;
        int i8;
        int i9;
        float fL;
        float fL2;
        float fL3;
        Ref.BooleanRef booleanRef;
        Ref.ObjectRef objectRef;
        final int i10;
        final int i11;
        final float f4;
        final Ref.IntRef intRef;
        float f5;
        LazyLayoutScrollScopeKt$animateScrollToItem$1 lazyLayoutScrollScopeKt$animateScrollToItem$12;
        float f6;
        int i12;
        int i13;
        LazyLayoutScrollScope lazyLayoutScrollScope3;
        AnimationState animationStateUo;
        Float fBoxFloat;
        int i14;
        Function1<AnimationScope<Float, AnimationVector1D>, Unit> function1;
        LazyLayoutScrollScope lazyLayoutScrollScope4;
        int i15;
        int i16;
        LazyLayoutScrollScopeKt$animateScrollToItem$1 lazyLayoutScrollScopeKt$animateScrollToItem$13;
        int iO;
        float fMax;
        final float f7;
        AnimationState animationState;
        Float fBoxFloat2;
        int i17;
        Function1<AnimationScope<Float, AnimationVector1D>, Unit> function12;
        final LazyLayoutScrollScope lazyLayoutScrollScope5;
        final int i18;
        int i19;
        if (continuation instanceof LazyLayoutScrollScopeKt$animateScrollToItem$1) {
            lazyLayoutScrollScopeKt$animateScrollToItem$1 = (LazyLayoutScrollScopeKt$animateScrollToItem$1) continuation;
            int i20 = lazyLayoutScrollScopeKt$animateScrollToItem$1.f18527T;
            if ((i20 & Integer.MIN_VALUE) != 0) {
                lazyLayoutScrollScopeKt$animateScrollToItem$1.f18527T = i20 - Integer.MIN_VALUE;
            } else {
                lazyLayoutScrollScopeKt$animateScrollToItem$1 = new LazyLayoutScrollScopeKt$animateScrollToItem$1(continuation);
            }
        }
        Object obj = lazyLayoutScrollScopeKt$animateScrollToItem$1.f18528X;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i21 = lazyLayoutScrollScopeKt$animateScrollToItem$1.f18527T;
        int i22 = 0;
        int i23 = 1;
        if (i21 == 0) {
            f3 = 0.0f;
            ResultKt.throwOnFailure(obj);
            if (!(((float) i2) >= 0.0f)) {
                InlineClassHelperKt.n("Index should be non-negative");
            }
            try {
                fL = density.l(f18523n);
                fL2 = density.l(rl);
                fL3 = density.l(f18524t);
                booleanRef = new Ref.BooleanRef();
                booleanRef.element = true;
                objectRef = new Ref.ObjectRef();
                objectRef.element = AnimationStateKt.t(0.0f, 0.0f, 0L, 0L, false, 30, null);
            } catch (ItemFoundInScroll e2) {
                e = e2;
                lazyLayoutScrollScope2 = lazyLayoutScrollScope;
                i7 = 0;
            }
            if (nr(lazyLayoutScrollScope, i2)) {
                lazyLayoutScrollScope2 = lazyLayoutScrollScope;
                i7 = 0;
                try {
                    throw new ItemFoundInScroll(LazyLayoutScrollScope.O(lazyLayoutScrollScope2, i2, 0, 2, null), (AnimationState) objectRef.element);
                } catch (ItemFoundInScroll e3) {
                    e = e3;
                    i8 = i3;
                    i9 = i2;
                    animationStateUo = AnimationStateKt.Uo(e.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, null);
                    final float itemOffset = e.getItemOffset() + i8;
                    final Ref.FloatRef floatRef = new Ref.FloatRef();
                    fBoxFloat = Boxing.boxFloat(itemOffset);
                    if (((Number) animationStateUo.te()).floatValue() == f3) {
                    }
                    function1 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt$animateScrollToItem$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                            n(animationScope);
                            return Unit.INSTANCE;
                        }

                        public final void n(AnimationScope animationScope) {
                            float f8 = itemOffset;
                            float fCoerceAtLeast = 0.0f;
                            if (f8 > 0.0f) {
                                fCoerceAtLeast = RangesKt.coerceAtMost(((Number) animationScope.O()).floatValue(), itemOffset);
                            } else if (f8 < 0.0f) {
                                fCoerceAtLeast = RangesKt.coerceAtLeast(((Number) animationScope.O()).floatValue(), itemOffset);
                            }
                            float f9 = fCoerceAtLeast - floatRef.element;
                            if (f9 != lazyLayoutScrollScope2.nr(f9) || fCoerceAtLeast != ((Number) animationScope.O()).floatValue()) {
                                animationScope.n();
                            }
                            floatRef.element += f9;
                        }
                    };
                    lazyLayoutScrollScopeKt$animateScrollToItem$1.f18532n = lazyLayoutScrollScope2;
                    lazyLayoutScrollScopeKt$animateScrollToItem$1.f18535t = null;
                    lazyLayoutScrollScopeKt$animateScrollToItem$1.f18525O = null;
                    lazyLayoutScrollScopeKt$animateScrollToItem$1.J2 = null;
                    lazyLayoutScrollScopeKt$animateScrollToItem$1.f18534r = i9;
                    lazyLayoutScrollScopeKt$animateScrollToItem$1.f18533o = i8;
                    lazyLayoutScrollScopeKt$animateScrollToItem$1.f18527T = 2;
                    if (SuspendAnimationKt.gh(animationStateUo, fBoxFloat, null, i14 ^ 1, function1, lazyLayoutScrollScopeKt$animateScrollToItem$1, 2, null) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
            }
            try {
                int i24 = i2 > lazyLayoutScrollScope.KN() ? 1 : 0;
                Ref.IntRef intRef2 = new Ref.IntRef();
                intRef2.element = 1;
                i10 = i3;
                i11 = i5;
                f4 = fL2;
                intRef = intRef2;
                f5 = fL;
                lazyLayoutScrollScopeKt$animateScrollToItem$12 = lazyLayoutScrollScopeKt$animateScrollToItem$1;
                f6 = fL3;
                i12 = i2;
                i13 = i24;
                lazyLayoutScrollScope3 = lazyLayoutScrollScope;
                if (booleanRef.element) {
                }
            } catch (ItemFoundInScroll e4) {
                e = e4;
                lazyLayoutScrollScope2 = lazyLayoutScrollScope;
                i8 = i3;
                i9 = i2;
                i7 = 0;
                animationStateUo = AnimationStateKt.Uo(e.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, null);
                final float itemOffset2 = e.getItemOffset() + i8;
                final Ref.FloatRef floatRef2 = new Ref.FloatRef();
                fBoxFloat = Boxing.boxFloat(itemOffset2);
                if (((Number) animationStateUo.te()).floatValue() == f3) {
                }
                function1 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt$animateScrollToItem$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                        n(animationScope);
                        return Unit.INSTANCE;
                    }

                    public final void n(AnimationScope animationScope) {
                        float f8 = itemOffset2;
                        float fCoerceAtLeast = 0.0f;
                        if (f8 > 0.0f) {
                            fCoerceAtLeast = RangesKt.coerceAtMost(((Number) animationScope.O()).floatValue(), itemOffset2);
                        } else if (f8 < 0.0f) {
                            fCoerceAtLeast = RangesKt.coerceAtLeast(((Number) animationScope.O()).floatValue(), itemOffset2);
                        }
                        float f9 = fCoerceAtLeast - floatRef2.element;
                        if (f9 != lazyLayoutScrollScope2.nr(f9) || fCoerceAtLeast != ((Number) animationScope.O()).floatValue()) {
                            animationScope.n();
                        }
                        floatRef2.element += f9;
                    }
                };
                lazyLayoutScrollScopeKt$animateScrollToItem$1.f18532n = lazyLayoutScrollScope2;
                lazyLayoutScrollScopeKt$animateScrollToItem$1.f18535t = null;
                lazyLayoutScrollScopeKt$animateScrollToItem$1.f18525O = null;
                lazyLayoutScrollScopeKt$animateScrollToItem$1.J2 = null;
                lazyLayoutScrollScopeKt$animateScrollToItem$1.f18534r = i9;
                lazyLayoutScrollScopeKt$animateScrollToItem$1.f18533o = i8;
                lazyLayoutScrollScopeKt$animateScrollToItem$1.f18527T = 2;
                if (SuspendAnimationKt.gh(animationStateUo, fBoxFloat, null, i14 ^ 1, function1, lazyLayoutScrollScopeKt$animateScrollToItem$1, 2, null) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        if (i21 != 1) {
            if (i21 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i15 = lazyLayoutScrollScopeKt$animateScrollToItem$1.f18533o;
            i16 = lazyLayoutScrollScopeKt$animateScrollToItem$1.f18534r;
            lazyLayoutScrollScope4 = (LazyLayoutScrollScope) lazyLayoutScrollScopeKt$animateScrollToItem$1.f18532n;
            ResultKt.throwOnFailure(obj);
            lazyLayoutScrollScope4.t(i16, i15);
            return Unit.INSTANCE;
        }
        i13 = lazyLayoutScrollScopeKt$animateScrollToItem$1.f18526S;
        float f8 = lazyLayoutScrollScopeKt$animateScrollToItem$1.f18530e;
        float f9 = lazyLayoutScrollScopeKt$animateScrollToItem$1.E2;
        f5 = lazyLayoutScrollScopeKt$animateScrollToItem$1.f18531g;
        int i25 = lazyLayoutScrollScopeKt$animateScrollToItem$1.f18529Z;
        int i26 = lazyLayoutScrollScopeKt$animateScrollToItem$1.f18533o;
        i9 = lazyLayoutScrollScopeKt$animateScrollToItem$1.f18534r;
        Ref.IntRef intRef3 = (Ref.IntRef) lazyLayoutScrollScopeKt$animateScrollToItem$1.J2;
        f3 = 0.0f;
        Ref.ObjectRef objectRef2 = (Ref.ObjectRef) lazyLayoutScrollScopeKt$animateScrollToItem$1.f18525O;
        Ref.BooleanRef booleanRef2 = (Ref.BooleanRef) lazyLayoutScrollScopeKt$animateScrollToItem$1.f18535t;
        LazyLayoutScrollScope lazyLayoutScrollScope6 = (LazyLayoutScrollScope) lazyLayoutScrollScopeKt$animateScrollToItem$1.f18532n;
        try {
            ResultKt.throwOnFailure(obj);
            objectRef = objectRef2;
            booleanRef = booleanRef2;
            f4 = f9;
            i19 = i25;
            i10 = i26;
            lazyLayoutScrollScopeKt$animateScrollToItem$12 = lazyLayoutScrollScopeKt$animateScrollToItem$1;
            f6 = f8;
            lazyLayoutScrollScope3 = lazyLayoutScrollScope6;
            i12 = i9;
        } catch (ItemFoundInScroll e5) {
            e = e5;
            lazyLayoutScrollScope2 = lazyLayoutScrollScope6;
            i7 = 0;
            i8 = i26;
            animationStateUo = AnimationStateKt.Uo(e.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, null);
            final float itemOffset22 = e.getItemOffset() + i8;
            final Ref.FloatRef floatRef22 = new Ref.FloatRef();
            fBoxFloat = Boxing.boxFloat(itemOffset22);
            if (((Number) animationStateUo.te()).floatValue() == f3) {
            }
            function1 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt$animateScrollToItem$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                    n(animationScope);
                    return Unit.INSTANCE;
                }

                public final void n(AnimationScope animationScope) {
                    float f82 = itemOffset22;
                    float fCoerceAtLeast = 0.0f;
                    if (f82 > 0.0f) {
                        fCoerceAtLeast = RangesKt.coerceAtMost(((Number) animationScope.O()).floatValue(), itemOffset22);
                    } else if (f82 < 0.0f) {
                        fCoerceAtLeast = RangesKt.coerceAtLeast(((Number) animationScope.O()).floatValue(), itemOffset22);
                    }
                    float f92 = fCoerceAtLeast - floatRef22.element;
                    if (f92 != lazyLayoutScrollScope2.nr(f92) || fCoerceAtLeast != ((Number) animationScope.O()).floatValue()) {
                        animationScope.n();
                    }
                    floatRef22.element += f92;
                }
            };
            lazyLayoutScrollScopeKt$animateScrollToItem$1.f18532n = lazyLayoutScrollScope2;
            lazyLayoutScrollScopeKt$animateScrollToItem$1.f18535t = null;
            lazyLayoutScrollScopeKt$animateScrollToItem$1.f18525O = null;
            lazyLayoutScrollScopeKt$animateScrollToItem$1.J2 = null;
            lazyLayoutScrollScopeKt$animateScrollToItem$1.f18534r = i9;
            lazyLayoutScrollScopeKt$animateScrollToItem$1.f18533o = i8;
            lazyLayoutScrollScopeKt$animateScrollToItem$1.f18527T = 2;
            if (SuspendAnimationKt.gh(animationStateUo, fBoxFloat, null, i14 ^ 1, function1, lazyLayoutScrollScopeKt$animateScrollToItem$1, 2, null) != coroutine_suspended) {
            }
        }
        try {
            try {
                intRef3.element++;
            } catch (ItemFoundInScroll e6) {
                e = e6;
                i9 = i12;
                lazyLayoutScrollScopeKt$animateScrollToItem$13 = lazyLayoutScrollScopeKt$animateScrollToItem$12;
                i8 = i10;
                lazyLayoutScrollScope2 = lazyLayoutScrollScope3;
            }
            i11 = i19;
            intRef = intRef3;
            i22 = 0;
            i23 = 1;
        } catch (ItemFoundInScroll e7) {
            e = e7;
            i9 = i12;
            lazyLayoutScrollScopeKt$animateScrollToItem$1 = lazyLayoutScrollScopeKt$animateScrollToItem$12;
            i8 = i10;
            i7 = 0;
            lazyLayoutScrollScope2 = lazyLayoutScrollScope3;
            animationStateUo = AnimationStateKt.Uo(e.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, null);
            final float itemOffset222 = e.getItemOffset() + i8;
            final Ref.FloatRef floatRef222 = new Ref.FloatRef();
            fBoxFloat = Boxing.boxFloat(itemOffset222);
            if (((Number) animationStateUo.te()).floatValue() == f3) {
            }
            function1 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt$animateScrollToItem$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                    n(animationScope);
                    return Unit.INSTANCE;
                }

                public final void n(AnimationScope animationScope) {
                    float f82 = itemOffset222;
                    float fCoerceAtLeast = 0.0f;
                    if (f82 > 0.0f) {
                        fCoerceAtLeast = RangesKt.coerceAtMost(((Number) animationScope.O()).floatValue(), itemOffset222);
                    } else if (f82 < 0.0f) {
                        fCoerceAtLeast = RangesKt.coerceAtLeast(((Number) animationScope.O()).floatValue(), itemOffset222);
                    }
                    float f92 = fCoerceAtLeast - floatRef222.element;
                    if (f92 != lazyLayoutScrollScope2.nr(f92) || fCoerceAtLeast != ((Number) animationScope.O()).floatValue()) {
                        animationScope.n();
                    }
                    floatRef222.element += f92;
                }
            };
            lazyLayoutScrollScopeKt$animateScrollToItem$1.f18532n = lazyLayoutScrollScope2;
            lazyLayoutScrollScopeKt$animateScrollToItem$1.f18535t = null;
            lazyLayoutScrollScopeKt$animateScrollToItem$1.f18525O = null;
            lazyLayoutScrollScopeKt$animateScrollToItem$1.J2 = null;
            lazyLayoutScrollScopeKt$animateScrollToItem$1.f18534r = i9;
            lazyLayoutScrollScopeKt$animateScrollToItem$1.f18533o = i8;
            lazyLayoutScrollScopeKt$animateScrollToItem$1.f18527T = 2;
            if (SuspendAnimationKt.gh(animationStateUo, fBoxFloat, null, i14 ^ 1, function1, lazyLayoutScrollScopeKt$animateScrollToItem$1, 2, null) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (booleanRef.element && lazyLayoutScrollScope3.n() > 0) {
            try {
                try {
                    try {
                        iO = LazyLayoutScrollScope.O(lazyLayoutScrollScope3, i12, i22, 2, null) + i10;
                    } catch (ItemFoundInScroll e8) {
                        e = e8;
                        lazyLayoutScrollScopeKt$animateScrollToItem$13 = lazyLayoutScrollScopeKt$animateScrollToItem$12;
                        lazyLayoutScrollScope2 = lazyLayoutScrollScope5;
                        i9 = i18;
                        i8 = i10;
                    }
                } catch (ItemFoundInScroll e9) {
                    e = e9;
                    lazyLayoutScrollScopeKt$animateScrollToItem$13 = lazyLayoutScrollScopeKt$animateScrollToItem$12;
                }
            } catch (ItemFoundInScroll e10) {
                e = e10;
                lazyLayoutScrollScopeKt$animateScrollToItem$1 = lazyLayoutScrollScopeKt$animateScrollToItem$13;
                i7 = 0;
                animationStateUo = AnimationStateKt.Uo(e.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, null);
                final float itemOffset2222 = e.getItemOffset() + i8;
                final Ref.FloatRef floatRef2222 = new Ref.FloatRef();
                fBoxFloat = Boxing.boxFloat(itemOffset2222);
                if (((Number) animationStateUo.te()).floatValue() == f3) {
                }
                function1 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt$animateScrollToItem$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                        n(animationScope);
                        return Unit.INSTANCE;
                    }

                    public final void n(AnimationScope animationScope) {
                        float f82 = itemOffset2222;
                        float fCoerceAtLeast = 0.0f;
                        if (f82 > 0.0f) {
                            fCoerceAtLeast = RangesKt.coerceAtMost(((Number) animationScope.O()).floatValue(), itemOffset2222);
                        } else if (f82 < 0.0f) {
                            fCoerceAtLeast = RangesKt.coerceAtLeast(((Number) animationScope.O()).floatValue(), itemOffset2222);
                        }
                        float f92 = fCoerceAtLeast - floatRef2222.element;
                        if (f92 != lazyLayoutScrollScope2.nr(f92) || fCoerceAtLeast != ((Number) animationScope.O()).floatValue()) {
                            animationScope.n();
                        }
                        floatRef2222.element += f92;
                    }
                };
                lazyLayoutScrollScopeKt$animateScrollToItem$1.f18532n = lazyLayoutScrollScope2;
                lazyLayoutScrollScopeKt$animateScrollToItem$1.f18535t = null;
                lazyLayoutScrollScopeKt$animateScrollToItem$1.f18525O = null;
                lazyLayoutScrollScopeKt$animateScrollToItem$1.J2 = null;
                lazyLayoutScrollScopeKt$animateScrollToItem$1.f18534r = i9;
                lazyLayoutScrollScopeKt$animateScrollToItem$1.f18533o = i8;
                lazyLayoutScrollScopeKt$animateScrollToItem$1.f18527T = 2;
                if (SuspendAnimationKt.gh(animationStateUo, fBoxFloat, null, i14 ^ 1, function1, lazyLayoutScrollScopeKt$animateScrollToItem$1, 2, null) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (Math.abs(iO) < f5) {
                if (i13 != 0) {
                    f7 = f5;
                    objectRef.element = AnimationStateKt.Uo((AnimationState) objectRef.element, 0.0f, 0.0f, 0L, 0L, false, 30, null);
                    final Ref.FloatRef floatRef3 = new Ref.FloatRef();
                    animationState = (AnimationState) objectRef.element;
                    fBoxFloat2 = Boxing.boxFloat(f7);
                    i17 = ((Number) ((AnimationState) objectRef.element).te()).floatValue() != f3 ? i22 : i23;
                    final boolean z2 = i13 == 0 ? i23 : i22;
                    lazyLayoutScrollScope5 = lazyLayoutScrollScope3;
                    i18 = i12;
                    final Ref.BooleanRef booleanRef3 = booleanRef;
                    final Ref.ObjectRef objectRef3 = objectRef;
                    function12 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt$animateScrollToItem$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                            n(animationScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        public final void n(AnimationScope animationScope) {
                            if (!LazyLayoutScrollScopeKt.nr(lazyLayoutScrollScope5, i18)) {
                                float fCoerceAtMost = (f7 > 0.0f ? RangesKt.coerceAtMost(((Number) animationScope.O()).floatValue(), f7) : RangesKt.coerceAtLeast(((Number) animationScope.O()).floatValue(), f7)) - floatRef3.element;
                                float fNr = lazyLayoutScrollScope5.nr(fCoerceAtMost);
                                if (!LazyLayoutScrollScopeKt.nr(lazyLayoutScrollScope5, i18) && !LazyLayoutScrollScopeKt.t(z2, lazyLayoutScrollScope5, i18, i10)) {
                                    if (fCoerceAtMost != fNr) {
                                        animationScope.n();
                                        booleanRef3.element = false;
                                        return;
                                    }
                                    floatRef3.element += fCoerceAtMost;
                                    if (z2) {
                                        if (((Number) animationScope.O()).floatValue() > f4) {
                                            animationScope.n();
                                        }
                                    } else if (((Number) animationScope.O()).floatValue() < (-f4)) {
                                        animationScope.n();
                                    }
                                    if (z2) {
                                        if (intRef.element >= 2) {
                                            int iRl = i18 - lazyLayoutScrollScope5.rl();
                                            int i27 = i11;
                                            if (iRl > i27) {
                                                lazyLayoutScrollScope5.t(i18 - i27, 0);
                                            }
                                        }
                                    } else if (intRef.element >= 2) {
                                        int iKN = lazyLayoutScrollScope5.KN();
                                        int i28 = i18;
                                        int i29 = iKN - i28;
                                        int i30 = i11;
                                        if (i29 > i30) {
                                            lazyLayoutScrollScope5.t(i28 + i30, 0);
                                        }
                                    }
                                }
                            }
                            if (!LazyLayoutScrollScopeKt.t(z2, lazyLayoutScrollScope5, i18, i10)) {
                                if (LazyLayoutScrollScopeKt.nr(lazyLayoutScrollScope5, i18)) {
                                    throw new ItemFoundInScroll(LazyLayoutScrollScope.O(lazyLayoutScrollScope5, i18, 0, 2, null), (AnimationState) objectRef3.element);
                                }
                            } else {
                                lazyLayoutScrollScope5.t(i18, i10);
                                booleanRef3.element = false;
                                animationScope.n();
                            }
                        }
                    };
                    lazyLayoutScrollScope2 = lazyLayoutScrollScope5;
                    i9 = i18;
                    float f10 = f4;
                    intRef3 = intRef;
                    i19 = i11;
                    i8 = i10;
                    lazyLayoutScrollScopeKt$animateScrollToItem$12.f18532n = lazyLayoutScrollScope2;
                    lazyLayoutScrollScopeKt$animateScrollToItem$12.f18535t = booleanRef3;
                    lazyLayoutScrollScopeKt$animateScrollToItem$12.f18525O = objectRef3;
                    lazyLayoutScrollScopeKt$animateScrollToItem$12.J2 = intRef3;
                    lazyLayoutScrollScopeKt$animateScrollToItem$12.f18534r = i9;
                    lazyLayoutScrollScopeKt$animateScrollToItem$12.f18533o = i8;
                    lazyLayoutScrollScopeKt$animateScrollToItem$12.f18529Z = i19;
                    lazyLayoutScrollScopeKt$animateScrollToItem$12.f18531g = f5;
                    lazyLayoutScrollScopeKt$animateScrollToItem$12.E2 = f10;
                    lazyLayoutScrollScopeKt$animateScrollToItem$12.f18530e = f6;
                    lazyLayoutScrollScopeKt$animateScrollToItem$12.f18526S = i13;
                    lazyLayoutScrollScopeKt$animateScrollToItem$12.f18527T = 1;
                    lazyLayoutScrollScopeKt$animateScrollToItem$13 = lazyLayoutScrollScopeKt$animateScrollToItem$12;
                    if (SuspendAnimationKt.gh(animationState, fBoxFloat2, null, i17, function12, lazyLayoutScrollScopeKt$animateScrollToItem$13, 2, null) != coroutine_suspended) {
                        objectRef = objectRef3;
                        booleanRef = booleanRef3;
                        lazyLayoutScrollScope3 = lazyLayoutScrollScope2;
                        lazyLayoutScrollScopeKt$animateScrollToItem$12 = lazyLayoutScrollScopeKt$animateScrollToItem$13;
                        f4 = f10;
                        i10 = i8;
                        i12 = i9;
                        intRef3.element++;
                        i11 = i19;
                        intRef = intRef3;
                        i22 = 0;
                        i23 = 1;
                        if (booleanRef.element) {
                            iO = LazyLayoutScrollScope.O(lazyLayoutScrollScope3, i12, i22, 2, null) + i10;
                            if (Math.abs(iO) < f5) {
                                try {
                                    fMax = Math.max(Math.abs(iO), f6);
                                    if (i13 == 0) {
                                        fMax = -fMax;
                                    }
                                } catch (ItemFoundInScroll e11) {
                                    e = e11;
                                    i9 = i12;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$1 = lazyLayoutScrollScopeKt$animateScrollToItem$12;
                                    i7 = i22;
                                    i8 = i10;
                                    lazyLayoutScrollScope2 = lazyLayoutScrollScope3;
                                    animationStateUo = AnimationStateKt.Uo(e.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, null);
                                    final float itemOffset22222 = e.getItemOffset() + i8;
                                    final Ref.FloatRef floatRef22222 = new Ref.FloatRef();
                                    fBoxFloat = Boxing.boxFloat(itemOffset22222);
                                    if (((Number) animationStateUo.te()).floatValue() == f3) {
                                    }
                                    function1 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt$animateScrollToItem$6
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                                            n(animationScope);
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(AnimationScope animationScope) {
                                            float f82 = itemOffset22222;
                                            float fCoerceAtLeast = 0.0f;
                                            if (f82 > 0.0f) {
                                                fCoerceAtLeast = RangesKt.coerceAtMost(((Number) animationScope.O()).floatValue(), itemOffset22222);
                                            } else if (f82 < 0.0f) {
                                                fCoerceAtLeast = RangesKt.coerceAtLeast(((Number) animationScope.O()).floatValue(), itemOffset22222);
                                            }
                                            float f92 = fCoerceAtLeast - floatRef22222.element;
                                            if (f92 != lazyLayoutScrollScope2.nr(f92) || fCoerceAtLeast != ((Number) animationScope.O()).floatValue()) {
                                                animationScope.n();
                                            }
                                            floatRef22222.element += f92;
                                        }
                                    };
                                    lazyLayoutScrollScopeKt$animateScrollToItem$1.f18532n = lazyLayoutScrollScope2;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$1.f18535t = null;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$1.f18525O = null;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$1.J2 = null;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$1.f18534r = i9;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$1.f18533o = i8;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$1.f18527T = 2;
                                    if (SuspendAnimationKt.gh(animationStateUo, fBoxFloat, null, i14 ^ 1, function1, lazyLayoutScrollScopeKt$animateScrollToItem$1, 2, null) != coroutine_suspended) {
                                    }
                                    return coroutine_suspended;
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                fMax = -f5;
            }
            f7 = fMax;
            objectRef.element = AnimationStateKt.Uo((AnimationState) objectRef.element, 0.0f, 0.0f, 0L, 0L, false, 30, null);
            final Ref.FloatRef floatRef32 = new Ref.FloatRef();
            animationState = (AnimationState) objectRef.element;
            fBoxFloat2 = Boxing.boxFloat(f7);
            if (((Number) ((AnimationState) objectRef.element).te()).floatValue() != f3) {
            }
            if (i13 == 0) {
            }
            lazyLayoutScrollScope5 = lazyLayoutScrollScope3;
            i18 = i12;
            final Ref.BooleanRef booleanRef32 = booleanRef;
            final Ref.ObjectRef objectRef32 = objectRef;
            function12 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt$animateScrollToItem$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                    n(animationScope);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void n(AnimationScope animationScope) {
                    if (!LazyLayoutScrollScopeKt.nr(lazyLayoutScrollScope5, i18)) {
                        float fCoerceAtMost = (f7 > 0.0f ? RangesKt.coerceAtMost(((Number) animationScope.O()).floatValue(), f7) : RangesKt.coerceAtLeast(((Number) animationScope.O()).floatValue(), f7)) - floatRef32.element;
                        float fNr = lazyLayoutScrollScope5.nr(fCoerceAtMost);
                        if (!LazyLayoutScrollScopeKt.nr(lazyLayoutScrollScope5, i18) && !LazyLayoutScrollScopeKt.t(z2, lazyLayoutScrollScope5, i18, i10)) {
                            if (fCoerceAtMost != fNr) {
                                animationScope.n();
                                booleanRef32.element = false;
                                return;
                            }
                            floatRef32.element += fCoerceAtMost;
                            if (z2) {
                                if (((Number) animationScope.O()).floatValue() > f4) {
                                    animationScope.n();
                                }
                            } else if (((Number) animationScope.O()).floatValue() < (-f4)) {
                                animationScope.n();
                            }
                            if (z2) {
                                if (intRef.element >= 2) {
                                    int iRl = i18 - lazyLayoutScrollScope5.rl();
                                    int i27 = i11;
                                    if (iRl > i27) {
                                        lazyLayoutScrollScope5.t(i18 - i27, 0);
                                    }
                                }
                            } else if (intRef.element >= 2) {
                                int iKN = lazyLayoutScrollScope5.KN();
                                int i28 = i18;
                                int i29 = iKN - i28;
                                int i30 = i11;
                                if (i29 > i30) {
                                    lazyLayoutScrollScope5.t(i28 + i30, 0);
                                }
                            }
                        }
                    }
                    if (!LazyLayoutScrollScopeKt.t(z2, lazyLayoutScrollScope5, i18, i10)) {
                        if (LazyLayoutScrollScopeKt.nr(lazyLayoutScrollScope5, i18)) {
                            throw new ItemFoundInScroll(LazyLayoutScrollScope.O(lazyLayoutScrollScope5, i18, 0, 2, null), (AnimationState) objectRef32.element);
                        }
                    } else {
                        lazyLayoutScrollScope5.t(i18, i10);
                        booleanRef32.element = false;
                        animationScope.n();
                    }
                }
            };
            lazyLayoutScrollScope2 = lazyLayoutScrollScope5;
            i9 = i18;
            float f102 = f4;
            intRef3 = intRef;
            i19 = i11;
            i8 = i10;
            lazyLayoutScrollScopeKt$animateScrollToItem$12.f18532n = lazyLayoutScrollScope2;
            lazyLayoutScrollScopeKt$animateScrollToItem$12.f18535t = booleanRef32;
            lazyLayoutScrollScopeKt$animateScrollToItem$12.f18525O = objectRef32;
            lazyLayoutScrollScopeKt$animateScrollToItem$12.J2 = intRef3;
            lazyLayoutScrollScopeKt$animateScrollToItem$12.f18534r = i9;
            lazyLayoutScrollScopeKt$animateScrollToItem$12.f18533o = i8;
            lazyLayoutScrollScopeKt$animateScrollToItem$12.f18529Z = i19;
            lazyLayoutScrollScopeKt$animateScrollToItem$12.f18531g = f5;
            lazyLayoutScrollScopeKt$animateScrollToItem$12.E2 = f102;
            lazyLayoutScrollScopeKt$animateScrollToItem$12.f18530e = f6;
            lazyLayoutScrollScopeKt$animateScrollToItem$12.f18526S = i13;
            lazyLayoutScrollScopeKt$animateScrollToItem$12.f18527T = 1;
            lazyLayoutScrollScopeKt$animateScrollToItem$13 = lazyLayoutScrollScopeKt$animateScrollToItem$12;
            if (SuspendAnimationKt.gh(animationState, fBoxFloat2, null, i17, function12, lazyLayoutScrollScopeKt$animateScrollToItem$13, 2, null) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
        animationStateUo = AnimationStateKt.Uo(e.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, null);
        final float itemOffset222222 = e.getItemOffset() + i8;
        final Ref.FloatRef floatRef222222 = new Ref.FloatRef();
        fBoxFloat = Boxing.boxFloat(itemOffset222222);
        i14 = ((Number) animationStateUo.te()).floatValue() == f3 ? 1 : i7;
        function1 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt$animateScrollToItem$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                n(animationScope);
                return Unit.INSTANCE;
            }

            public final void n(AnimationScope animationScope) {
                float f82 = itemOffset222222;
                float fCoerceAtLeast = 0.0f;
                if (f82 > 0.0f) {
                    fCoerceAtLeast = RangesKt.coerceAtMost(((Number) animationScope.O()).floatValue(), itemOffset222222);
                } else if (f82 < 0.0f) {
                    fCoerceAtLeast = RangesKt.coerceAtLeast(((Number) animationScope.O()).floatValue(), itemOffset222222);
                }
                float f92 = fCoerceAtLeast - floatRef222222.element;
                if (f92 != lazyLayoutScrollScope2.nr(f92) || fCoerceAtLeast != ((Number) animationScope.O()).floatValue()) {
                    animationScope.n();
                }
                floatRef222222.element += f92;
            }
        };
        lazyLayoutScrollScopeKt$animateScrollToItem$1.f18532n = lazyLayoutScrollScope2;
        lazyLayoutScrollScopeKt$animateScrollToItem$1.f18535t = null;
        lazyLayoutScrollScopeKt$animateScrollToItem$1.f18525O = null;
        lazyLayoutScrollScopeKt$animateScrollToItem$1.J2 = null;
        lazyLayoutScrollScopeKt$animateScrollToItem$1.f18534r = i9;
        lazyLayoutScrollScopeKt$animateScrollToItem$1.f18533o = i8;
        lazyLayoutScrollScopeKt$animateScrollToItem$1.f18527T = 2;
        if (SuspendAnimationKt.gh(animationStateUo, fBoxFloat, null, i14 ^ 1, function1, lazyLayoutScrollScopeKt$animateScrollToItem$1, 2, null) != coroutine_suspended) {
            lazyLayoutScrollScope4 = lazyLayoutScrollScope2;
            i15 = i8;
            i16 = i9;
            lazyLayoutScrollScope4.t(i16, i15);
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    public static final boolean nr(LazyLayoutScrollScope lazyLayoutScrollScope, int i2) {
        int iKN = lazyLayoutScrollScope.KN();
        if (i2 > lazyLayoutScrollScope.rl() || iKN > i2) {
            return false;
        }
        return true;
    }
}
