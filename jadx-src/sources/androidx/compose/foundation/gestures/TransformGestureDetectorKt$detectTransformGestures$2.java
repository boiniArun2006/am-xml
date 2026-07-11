package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2", f = "TransformGestureDetector.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {60, 62}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$awaitEachGesture", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom"}, s = {"L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1"})
@SourceDebugExtension({"SMAP\nTransformGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,255:1\n102#2,2:256\n34#2,6:258\n104#2:264\n34#2,6:265\n102#2,2:271\n34#2,6:273\n104#2:279\n*S KotlinDebug\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2\n*L\n63#1:256,2\n63#1:258,6\n63#1:264\n95#1:265,6\n102#1:271,2\n102#1:273,6\n102#1:279\n*E\n"})
final class TransformGestureDetectorKt$detectTransformGestures$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function4 E2;
    long J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    float f17181O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private /* synthetic */ Object f17182S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    int f17183Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f17184g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float f17185n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f17186o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f17187r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    float f17188t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransformGestureDetectorKt$detectTransformGestures$2(boolean z2, Function4 function4, Continuation continuation) {
        super(2, continuation);
        this.f17184g = z2;
        this.E2 = function4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TransformGestureDetectorKt$detectTransformGestures$2 transformGestureDetectorKt$detectTransformGestures$2 = new TransformGestureDetectorKt$detectTransformGestures$2(this.f17184g, this.E2, continuation);
        transformGestureDetectorKt$detectTransformGestures$2.f17182S = obj;
        return transformGestureDetectorKt$detectTransformGestures$2;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
        return ((TransformGestureDetectorKt$detectTransformGestures$2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0093, code lost:
    
        if (r15 == r6) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015f  */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0093 -> B:17:0x0096). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i2;
        long jIk;
        float f3;
        AwaitPointerEventScope awaitPointerEventScope;
        float f4;
        float f5;
        int i3;
        Object objPJg;
        ?? r7;
        float f6;
        float f7;
        int i5;
        int size;
        int i7;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i8 = this.f17183Z;
        float f8 = 1.0f;
        int i9 = 2;
        float f9 = 0.0f;
        boolean z2 = false;
        int i10 = 1;
        if (i8 == 0) {
            ResultKt.throwOnFailure(obj);
            AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.f17182S;
            long jT2 = Offset.INSTANCE.t();
            float fUo = awaitPointerEventScope2.getViewConfiguration().Uo();
            this.f17182S = awaitPointerEventScope2;
            this.f17185n = 0.0f;
            this.f17188t = 1.0f;
            this.J2 = jT2;
            this.f17187r = 0;
            this.f17181O = fUo;
            this.f17186o = 0;
            this.f17183Z = 1;
            if (TapGestureDetectorKt.J2(awaitPointerEventScope2, false, null, this, 2, null) != coroutine_suspended) {
                i2 = 0;
                jIk = jT2;
                f3 = fUo;
                awaitPointerEventScope = awaitPointerEventScope2;
                f4 = 1.0f;
                f5 = 0.0f;
                i3 = 0;
            }
            return coroutine_suspended;
        }
        if (i8 != 1) {
            if (i8 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = this.f17186o;
            f3 = this.f17181O;
            i2 = this.f17187r;
            jIk = this.J2;
            f4 = this.f17188t;
            f5 = this.f17185n;
            awaitPointerEventScope = (AwaitPointerEventScope) this.f17182S;
            ResultKt.throwOnFailure(obj);
            objPJg = obj;
            PointerEvent pointerEvent = (PointerEvent) objPJg;
            float f10 = f8;
            ?? changes = pointerEvent.getChanges();
            int size2 = changes.size();
            float f11 = f9;
            ?? r9 = z2;
            while (true) {
                if (r9 >= size2) {
                    r7 = z2;
                    break;
                }
                if (((PointerInputChange) changes.get(r9)).ck()) {
                    r7 = i10;
                    break;
                }
                r9++;
            }
            if (r7 == 0) {
                float fJ2 = TransformGestureDetectorKt.J2(pointerEvent);
                float fO = TransformGestureDetectorKt.O(pointerEvent);
                float f12 = f4;
                long jNr = TransformGestureDetectorKt.nr(pointerEvent);
                if (i2 == 0) {
                    f7 = f12 * fJ2;
                    f5 += fO;
                    jIk = Offset.Ik(jIk, jNr);
                    float fT = TransformGestureDetectorKt.t(pointerEvent, z2);
                    int i11 = i3;
                    float fAbs = Math.abs(1 - f7) * fT;
                    float fAbs2 = Math.abs(((3.1415927f * f5) * fT) / 180.0f);
                    float fGh = Offset.gh(jIk);
                    if (fAbs > f3 || fAbs2 > f3 || fGh > f3) {
                        i3 = (!this.f17184g || fAbs2 >= f3) ? 0 : 1;
                        i2 = 1;
                    } else {
                        i3 = i11;
                    }
                } else {
                    f7 = f12;
                }
                if (i2 != 0) {
                    z2 = false;
                    long jRl = TransformGestureDetectorKt.rl(pointerEvent, false);
                    if (i3 != 0) {
                        fO = f11;
                    }
                    if (fO == f11 && fJ2 == f10) {
                        i5 = i3;
                        f6 = f3;
                        if (!Offset.mUb(jNr, Offset.INSTANCE.t())) {
                        }
                        List changes2 = pointerEvent.getChanges();
                        size = changes2.size();
                        for (i7 = 0; i7 < size; i7++) {
                            PointerInputChange pointerInputChange = (PointerInputChange) changes2.get(i7);
                            if (PointerEventKt.mUb(pointerInputChange)) {
                                pointerInputChange.n();
                            }
                        }
                    } else {
                        i5 = i3;
                        f6 = f3;
                    }
                    this.E2.invoke(Offset.nr(jRl), Offset.nr(jNr), Boxing.boxFloat(fJ2), Boxing.boxFloat(fO));
                    List changes22 = pointerEvent.getChanges();
                    size = changes22.size();
                    while (i7 < size) {
                    }
                } else {
                    i5 = i3;
                    f6 = f3;
                    z2 = false;
                }
                i3 = i5;
                f4 = f7;
            } else {
                f6 = f3;
            }
            if (r7 == 0) {
                ?? changes3 = pointerEvent.getChanges();
                int size3 = changes3.size();
                for (?? r8 = z2; r8 < size3; r8++) {
                    if (((PointerInputChange) changes3.get(r8)).getPressed()) {
                        f8 = f10;
                        f9 = f11;
                        f3 = f6;
                        i9 = 2;
                        i10 = 1;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        i3 = this.f17186o;
        f3 = this.f17181O;
        i2 = this.f17187r;
        jIk = this.J2;
        f4 = this.f17188t;
        f5 = this.f17185n;
        awaitPointerEventScope = (AwaitPointerEventScope) this.f17182S;
        ResultKt.throwOnFailure(obj);
        this.f17182S = awaitPointerEventScope;
        this.f17185n = f5;
        this.f17188t = f4;
        this.J2 = jIk;
        this.f17187r = i2;
        this.f17181O = f3;
        this.f17186o = i3;
        this.f17183Z = i9;
        objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope, null, this, i10, null);
    }
}
