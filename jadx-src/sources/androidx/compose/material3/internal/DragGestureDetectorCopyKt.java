package androidx.compose.material3.internal;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aa\u0010\u000e\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000326\u0010\r\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0005H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001e\u0010\u0012\u001a\u00020\u0011*\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001e\u0010\u0015\u001a\u00020\n*\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018\"\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018\"\u0014\u0010\u001b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "Landroidx/compose/ui/input/pointer/PointerType;", "pointerType", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "change", "", "overSlop", "", "onPointerSlopReached", c.f62177j, "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "", "rl", "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z", "Landroidx/compose/ui/platform/ViewConfiguration;", "t", "(Landroidx/compose/ui/platform/ViewConfiguration;I)F", "Landroidx/compose/ui/unit/Dp;", "F", "mouseSlop", "defaultTouchSlop", "mouseToTouchSlopRatio", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDragGestureDetectorCopy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetectorCopy.kt\nandroidx/compose/material3/internal/DragGestureDetectorCopyKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,136:1\n74#1,10:137\n84#1,4:156\n88#1,29:167\n116#2,2:147\n33#2,6:149\n118#2:155\n33#2,6:160\n118#2:166\n116#2,2:196\n33#2,6:198\n118#2:204\n116#2,2:205\n33#2,6:207\n118#2:213\n116#2,2:214\n33#2,6:216\n118#2:222\n158#3:223\n148#3:224\n77#4:225\n*S KotlinDebug\n*F\n+ 1 DragGestureDetectorCopy.kt\nandroidx/compose/material3/internal/DragGestureDetectorCopyKt\n*L\n42#1:137,10\n42#1:156,4\n42#1:167,29\n42#1:147,2\n42#1:149,6\n42#1:155\n42#1:160,6\n42#1:166\n83#1:196,2\n83#1:198,6\n83#1:204\n87#1:205,2\n87#1:207,6\n87#1:213\n124#1:214,2\n124#1:216,6\n124#1:222\n126#1:223\n127#1:224\n128#1:225\n*E\n"})
public final class DragGestureDetectorCopyKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f29168n;
    private static final float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f29169t;

    static {
        float fKN = Dp.KN((float) 0.125d);
        f29168n = fKN;
        float fKN2 = Dp.KN(18);
        rl = fKN2;
        f29169t = fKN / fKN2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0123 -> B:47:0x012b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0163 -> B:54:0x0165). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0180 -> B:47:0x012b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(AwaitPointerEventScope awaitPointerEventScope, long j2, int i2, Function2 function2, Continuation continuation) {
        DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function2 function22;
        Ref.LongRef longRef;
        DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12;
        float f3;
        float fAz;
        Ref.LongRef longRef2;
        DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13;
        float f4;
        float f5;
        int size;
        int i3;
        PointerEventPass pointerEventPass;
        Object obj;
        PointerInputChange pointerInputChange;
        Object obj2;
        int i5;
        Object objPJg;
        if (continuation instanceof DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1) {
            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 = (DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1) continuation;
            int i7 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.f29171S;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.f29171S = i7 - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 = new DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1(continuation);
            }
        }
        Object obj3 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.f29172Z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i8 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.f29171S;
        int i9 = 1;
        PointerEventPass pointerEventPass2 = null;
        if (i8 == 0) {
            ResultKt.throwOnFailure(obj3);
            if (rl(awaitPointerEventScope.UF(), j2)) {
                return null;
            }
            float fT = t(awaitPointerEventScope.getViewConfiguration(), i2);
            Ref.LongRef longRef3 = new Ref.LongRef();
            longRef3.element = j2;
            awaitPointerEventScope2 = awaitPointerEventScope;
            function22 = function2;
            longRef = longRef3;
            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;
            f3 = fT;
            fAz = 0.0f;
            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.f29173n = function22;
            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.f29176t = awaitPointerEventScope2;
            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.f29170O = longRef;
            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.J2 = pointerEventPass2;
            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.f29175r = f3;
            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.f29174o = fAz;
            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.f29171S = i9;
            objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12, i9, pointerEventPass2);
            if (objPJg != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i8 != 1) {
            if (i8 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            float f6 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.f29174o;
            float f7 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.f29175r;
            PointerInputChange pointerInputChange2 = (PointerInputChange) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.J2;
            Ref.LongRef longRef4 = (Ref.LongRef) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.f29170O;
            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.f29176t;
            Function2 function23 = (Function2) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.f29173n;
            ResultKt.throwOnFailure(obj3);
            fAz = f6;
            pointerEventPass = null;
            awaitPointerEventScope2 = awaitPointerEventScope3;
            longRef2 = longRef4;
            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;
            f3 = f7;
            function22 = function23;
            if (pointerInputChange2.ck()) {
                return pointerEventPass;
            }
            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13;
            longRef = longRef2;
            pointerEventPass2 = pointerEventPass;
            i9 = 1;
            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.f29173n = function22;
            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.f29176t = awaitPointerEventScope2;
            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.f29170O = longRef;
            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.J2 = pointerEventPass2;
            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.f29175r = f3;
            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.f29174o = fAz;
            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.f29171S = i9;
            objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12, i9, pointerEventPass2);
            if (objPJg != coroutine_suspended) {
                float f8 = f3;
                f5 = fAz;
                obj3 = objPJg;
                longRef2 = longRef;
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12;
                f4 = f8;
                PointerEvent pointerEvent = (PointerEvent) obj3;
                List changes = pointerEvent.getChanges();
                size = changes.size();
                i3 = 0;
                while (true) {
                    if (i3 < size) {
                        pointerEventPass = pointerEventPass2;
                        obj = pointerEventPass;
                        break;
                    }
                    obj = changes.get(i3);
                    pointerEventPass = pointerEventPass2;
                    i5 = i3;
                    if (PointerId.t(((PointerInputChange) obj).getId(), longRef2.element)) {
                        break;
                    }
                    i3 = i5 + 1;
                    pointerEventPass2 = pointerEventPass;
                }
                Intrinsics.checkNotNull(obj);
                pointerInputChange = (PointerInputChange) obj;
                if (pointerInputChange.ck()) {
                    return pointerEventPass;
                }
                if (PointerEventKt.nr(pointerInputChange)) {
                    List changes2 = pointerEvent.getChanges();
                    int size2 = changes2.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size2) {
                            obj2 = pointerEventPass;
                            break;
                        }
                        obj2 = changes2.get(i10);
                        if (((PointerInputChange) obj2).getPressed()) {
                            break;
                        }
                        i10++;
                    }
                    PointerInputChange pointerInputChange3 = (PointerInputChange) obj2;
                    if (pointerInputChange3 == null) {
                        return pointerEventPass;
                    }
                    longRef2.element = pointerInputChange3.getId();
                    fAz = f5;
                    f3 = f4;
                } else {
                    fAz = (Offset.az(pointerInputChange.getPosition()) - Offset.az(pointerInputChange.getPreviousPosition())) + f5;
                    if (Math.abs(fAz) < f4) {
                        PointerEventPass pointerEventPass3 = PointerEventPass.f32077O;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13.f29173n = function22;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13.f29176t = awaitPointerEventScope2;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13.f29170O = longRef2;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13.J2 = pointerInputChange;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13.f29175r = f4;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13.f29174o = fAz;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13.f29171S = 2;
                        if (awaitPointerEventScope2.HBN(pointerEventPass3, dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13) != coroutine_suspended) {
                            f3 = f4;
                            pointerInputChange2 = pointerInputChange;
                            if (pointerInputChange2.ck()) {
                            }
                        }
                    } else {
                        function22.invoke(pointerInputChange, Boxing.boxFloat(fAz - (Math.signum(fAz) * f4)));
                        if (pointerInputChange.ck()) {
                            return pointerInputChange;
                        }
                        f3 = f4;
                        fAz = 0.0f;
                    }
                }
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13;
                longRef = longRef2;
                pointerEventPass2 = pointerEventPass;
                i9 = 1;
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.f29173n = function22;
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.f29176t = awaitPointerEventScope2;
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.f29170O = longRef;
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.J2 = pointerEventPass2;
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.f29175r = f3;
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.f29174o = fAz;
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.f29171S = i9;
                objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12, i9, pointerEventPass2);
                if (objPJg != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
        float f9 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.f29174o;
        float f10 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.f29175r;
        Ref.LongRef longRef5 = (Ref.LongRef) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.f29170O;
        AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.f29176t;
        Function2 function24 = (Function2) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.f29173n;
        ResultKt.throwOnFailure(obj3);
        DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$14 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;
        f5 = f9;
        awaitPointerEventScope2 = awaitPointerEventScope4;
        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$14;
        f4 = f10;
        function22 = function24;
        longRef2 = longRef5;
        PointerEvent pointerEvent2 = (PointerEvent) obj3;
        List changes3 = pointerEvent2.getChanges();
        size = changes3.size();
        i3 = 0;
        while (true) {
            if (i3 < size) {
            }
            i3 = i5 + 1;
            pointerEventPass2 = pointerEventPass;
        }
        Intrinsics.checkNotNull(obj);
        pointerInputChange = (PointerInputChange) obj;
        if (pointerInputChange.ck()) {
        }
    }

    public static final float t(ViewConfiguration viewConfiguration, int i2) {
        return PointerType.KN(i2, PointerType.INSTANCE.rl()) ? viewConfiguration.Uo() * f29169t : viewConfiguration.Uo();
    }

    private static final boolean rl(PointerEvent pointerEvent, long j2) {
        Object obj;
        List changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                obj = changes.get(i2);
                if (PointerId.t(((PointerInputChange) obj).getId(), j2)) {
                    break;
                }
                i2++;
            } else {
                obj = null;
                break;
            }
        }
        PointerInputChange pointerInputChange = (PointerInputChange) obj;
        if (pointerInputChange != null && pointerInputChange.getPressed()) {
            z2 = true;
        }
        return true ^ z2;
    }
}
