package androidx.compose.ui.scrollcapture;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\u0017\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R0\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006 "}, d2 = {"Landroidx/compose/ui/scrollcapture/RelativeScroller;", "", "", "viewportSize", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "scrollBy", "<init>", "(ILkotlin/jvm/functions/Function2;)V", "delta", "", "O", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nr", "()V", "min", "max", "J2", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "offset", "t", "(I)I", "Uo", c.f62177j, "I", "rl", "Lkotlin/jvm/functions/Function2;", "<set-?>", "F", "()F", "scrollAmount", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposeScrollCaptureCallback.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeScrollCaptureCallback.android.kt\nandroidx/compose/ui/scrollcapture/RelativeScroller\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,307:1\n1#2:308\n*E\n"})
final class RelativeScroller {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int viewportSize;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Function2 scrollBy;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private float scrollAmount;

    public final void nr() {
        this.scrollAmount = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object O(float f3, Continuation continuation) {
        RelativeScroller$scrollBy$1 relativeScroller$scrollBy$1;
        RelativeScroller relativeScroller;
        if (continuation instanceof RelativeScroller$scrollBy$1) {
            relativeScroller$scrollBy$1 = (RelativeScroller$scrollBy$1) continuation;
            int i2 = relativeScroller$scrollBy$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                relativeScroller$scrollBy$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                relativeScroller$scrollBy$1 = new RelativeScroller$scrollBy$1(this, continuation);
            }
        }
        Object objInvoke = relativeScroller$scrollBy$1.f33220t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = relativeScroller$scrollBy$1.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            Function2 function2 = this.scrollBy;
            Float fBoxFloat = Boxing.boxFloat(f3);
            relativeScroller$scrollBy$1.f33219n = this;
            relativeScroller$scrollBy$1.J2 = 1;
            objInvoke = function2.invoke(fBoxFloat, relativeScroller$scrollBy$1);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            relativeScroller = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            relativeScroller = (RelativeScroller) relativeScroller$scrollBy$1.f33219n;
            ResultKt.throwOnFailure(objInvoke);
        }
        relativeScroller.scrollAmount += ((Number) objInvoke).floatValue();
        return Unit.INSTANCE;
    }

    public final Object J2(int i2, int i3, Continuation continuation) {
        if (i2 > i3) {
            throw new IllegalArgumentException(("Expected min=" + i2 + " ≤ max=" + i3).toString());
        }
        int i5 = i3 - i2;
        int i7 = this.viewportSize;
        if (i5 > i7) {
            throw new IllegalArgumentException(("Expected range (" + i5 + ") to be ≤ viewportSize=" + this.viewportSize).toString());
        }
        float f3 = i2;
        float f4 = this.scrollAmount;
        if (f3 >= f4 && i3 <= i7 + f4) {
            return Unit.INSTANCE;
        }
        if (f3 >= f4) {
            i2 = i3 - i7;
        }
        Object objUo = Uo(i2, continuation);
        return objUo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUo : Unit.INSTANCE;
    }

    public final Object Uo(float f3, Continuation continuation) {
        Object objO = O(f3 - this.scrollAmount, continuation);
        return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final float getScrollAmount() {
        return this.scrollAmount;
    }

    public final int t(int offset) {
        return RangesKt.coerceIn(offset - MathKt.roundToInt(this.scrollAmount), 0, this.viewportSize);
    }

    public RelativeScroller(int i2, Function2 function2) {
        this.viewportSize = i2;
        this.scrollBy = function2;
    }
}
