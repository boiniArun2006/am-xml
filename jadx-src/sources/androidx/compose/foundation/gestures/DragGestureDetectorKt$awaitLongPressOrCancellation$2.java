package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import com.safedk.android.analytics.events.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", i = {0, 0, 1, 1, 1}, l = {971, 993}, m = "invokeSuspend", n = {"$this$withTimeout", "finished", "$this$withTimeout", a.f62811a, "finished"}, s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
@SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1045:1\n87#2,2:1046\n34#2,6:1048\n89#2:1054\n102#2,2:1055\n34#2,6:1057\n104#2:1063\n102#2,2:1064\n34#2,6:1066\n104#2:1072\n117#2,2:1073\n34#2,6:1075\n119#2:1081\n117#2,2:1082\n34#2,6:1084\n119#2:1090\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$2\n*L\n972#1:1046,2\n972#1:1048,6\n972#1:1054\n978#1:1055,2\n978#1:1057,6\n978#1:1063\n994#1:1064,2\n994#1:1066,6\n994#1:1072\n998#1:1073,2\n998#1:1075,6\n998#1:1081\n1008#1:1082,2\n1008#1:1084,6\n1008#1:1090\n*E\n"})
final class DragGestureDetectorKt$awaitLongPressOrCancellation$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f16691O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef f16692Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f16693n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef f16694o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ Ref.BooleanRef f16695r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f16696t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DragGestureDetectorKt$awaitLongPressOrCancellation$2(Ref.BooleanRef booleanRef, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Continuation continuation) {
        super(2, continuation);
        this.f16695r = booleanRef;
        this.f16694o = objectRef;
        this.f16692Z = objectRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(this.f16695r, this.f16694o, this.f16692Z, continuation);
        dragGestureDetectorKt$awaitLongPressOrCancellation$2.J2 = obj;
        return dragGestureDetectorKt$awaitLongPressOrCancellation$2;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
        return ((DragGestureDetectorKt$awaitLongPressOrCancellation$2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
    
        r2 = r6 ? 1 : 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8 A[EDGE_INSN: B:68:0x00d8->B:44:0x00d8 BREAK  A[LOOP:0: B:39:0x00c5->B:43:0x00d5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x006f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [T, androidx.compose.ui.input.pointer.PointerInputChange] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00b7 -> B:38:0x00ba). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AwaitPointerEventScope awaitPointerEventScope;
        int i2;
        Object objHBN;
        PointerEvent pointerEvent;
        int size;
        int i3;
        int size2;
        int i5;
        Object objHBN2;
        T t3;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.f16691O;
        Object obj3 = null;
        boolean z2 = true;
        z2 = true;
        z2 = true;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            awaitPointerEventScope = (AwaitPointerEventScope) this.J2;
            i2 = 0;
            if (i2 != 0) {
            }
        } else {
            if (i7 == 1) {
                i2 = this.f16696t;
                awaitPointerEventScope = (AwaitPointerEventScope) this.J2;
                ResultKt.throwOnFailure(obj);
                objHBN = obj;
                pointerEvent = (PointerEvent) objHBN;
                List changes = pointerEvent.getChanges();
                size = changes.size();
                i3 = 0;
                while (true) {
                    if (i3 >= size) {
                    }
                    i3++;
                }
                List changes2 = pointerEvent.getChanges();
                size2 = changes2.size();
                while (i5 < size2) {
                }
                if (TapGestureDetector_androidKt.rl(pointerEvent)) {
                }
                PointerEventPass pointerEventPass = PointerEventPass.f32077O;
                this.J2 = awaitPointerEventScope;
                this.f16693n = pointerEvent;
                this.f16696t = i2;
                this.f16691O = 2;
                objHBN2 = awaitPointerEventScope.HBN(pointerEventPass, this);
                if (objHBN2 != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = this.f16696t;
            PointerEvent pointerEvent2 = (PointerEvent) this.f16693n;
            AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.J2;
            ResultKt.throwOnFailure(obj);
            objHBN2 = obj;
            List changes3 = ((PointerEvent) objHBN2).getChanges();
            int size3 = changes3.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size3) {
                    break;
                }
                if (((PointerInputChange) changes3.get(i8)).ck()) {
                    i2 = z2 ? 1 : 0;
                    break;
                }
                i8++;
            }
            if (!DragGestureDetectorKt.XQ(pointerEvent2, ((PointerInputChange) this.f16694o.element).getId())) {
                List changes4 = pointerEvent2.getChanges();
                int size4 = changes4.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size4) {
                        obj2 = null;
                        break;
                    }
                    obj2 = changes4.get(i9);
                    if (((PointerInputChange) obj2).getPressed()) {
                        break;
                    }
                    i9++;
                }
                ?? r9 = (PointerInputChange) obj2;
                if (r9 == 0) {
                    i2 = z2 ? 1 : 0;
                    awaitPointerEventScope = awaitPointerEventScope2;
                    obj3 = null;
                    if (i2 != 0) {
                        return Unit.INSTANCE;
                    }
                    PointerEventPass pointerEventPass2 = PointerEventPass.f32080t;
                    this.J2 = awaitPointerEventScope;
                    this.f16693n = obj3;
                    this.f16696t = i2;
                    this.f16691O = z2 ? 1 : 0;
                    objHBN = awaitPointerEventScope.HBN(pointerEventPass2, this);
                    if (objHBN != coroutine_suspended) {
                        pointerEvent = (PointerEvent) objHBN;
                        List changes5 = pointerEvent.getChanges();
                        size = changes5.size();
                        i3 = 0;
                        while (true) {
                            if (i3 >= size) {
                                i2 = z2 ? 1 : 0;
                                break;
                            }
                            if (!PointerEventKt.nr((PointerInputChange) changes5.get(i3))) {
                                break;
                            }
                            i3++;
                        }
                        List changes22 = pointerEvent.getChanges();
                        size2 = changes22.size();
                        for (i5 = 0; i5 < size2; i5++) {
                            PointerInputChange pointerInputChange = (PointerInputChange) changes22.get(i5);
                            if (pointerInputChange.ck() || PointerEventKt.J2(pointerInputChange, awaitPointerEventScope.n(), awaitPointerEventScope.hRu())) {
                                break;
                            }
                        }
                        if (TapGestureDetector_androidKt.rl(pointerEvent)) {
                            this.f16695r.element = z2;
                            i2 = z2 ? 1 : 0;
                        }
                        PointerEventPass pointerEventPass3 = PointerEventPass.f32077O;
                        this.J2 = awaitPointerEventScope;
                        this.f16693n = pointerEvent;
                        this.f16696t = i2;
                        this.f16691O = 2;
                        objHBN2 = awaitPointerEventScope.HBN(pointerEventPass3, this);
                        if (objHBN2 != coroutine_suspended) {
                            awaitPointerEventScope2 = awaitPointerEventScope;
                            pointerEvent2 = pointerEvent;
                            List changes32 = ((PointerEvent) objHBN2).getChanges();
                            int size32 = changes32.size();
                            int i82 = 0;
                            while (true) {
                                if (i82 >= size32) {
                                }
                                i82++;
                            }
                            if (!DragGestureDetectorKt.XQ(pointerEvent2, ((PointerInputChange) this.f16694o.element).getId())) {
                                Ref.ObjectRef objectRef = this.f16692Z;
                                List changes6 = pointerEvent2.getChanges();
                                Ref.ObjectRef objectRef2 = this.f16694o;
                                int size5 = changes6.size();
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= size5) {
                                        t3 = 0;
                                        break;
                                    }
                                    t3 = changes6.get(i10);
                                    Ref.ObjectRef objectRef3 = objectRef2;
                                    if (PointerId.t(((PointerInputChange) t3).getId(), ((PointerInputChange) objectRef2.element).getId())) {
                                        break;
                                    }
                                    i10++;
                                    objectRef2 = objectRef3;
                                }
                                objectRef.element = t3;
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                this.f16694o.element = r9;
                this.f16692Z.element = r9;
            }
            awaitPointerEventScope = awaitPointerEventScope2;
            obj3 = null;
            z2 = true;
            if (i2 != 0) {
            }
        }
    }
}
