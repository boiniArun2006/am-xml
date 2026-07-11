package androidx.compose.foundation.gestures;

import ILs.CN3;
import androidx.compose.foundation.gestures.TransformEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a*\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0007\u0010\b\u001a\u001c\u0010\u000b\u001a\u00020\n*\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u000b\u0010\f\u001a\u001e\u0010\r\u001a\u0004\u0018\u00010\n*\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\r\u0010\f\u001a>\u0010\u0012\u001a\u00020\u0006*\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\u0010H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "LILs/CN3;", "Landroidx/compose/foundation/gestures/TransformEvent;", "channel", "Landroidx/compose/foundation/gestures/ScrollConfig;", "scrollConfig", "", "KN", "(Landroidx/compose/ui/input/pointer/PointerInputScope;LILs/CN3;Landroidx/compose/foundation/gestures/ScrollConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/geometry/Offset;", "J2", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/gestures/ScrollConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "O", "", "panZoomLock", "Lkotlin/Function1;", "canPan", "Uo", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLILs/CN3;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransformable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,399:1\n329#2:400\n1#3:401\n34#4,6:402\n102#4,2:408\n34#4,6:410\n104#4:416\n34#4,6:417\n102#4,2:423\n34#4,6:425\n104#4:431\n102#4,2:432\n34#4,6:434\n104#4:440\n*S KotlinDebug\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt\n*L\n268#1:400\n322#1:402,6\n340#1:408,2\n340#1:410,6\n340#1:416\n376#1:417,6\n387#1:423,2\n387#1:425,6\n387#1:431\n388#1:432,2\n388#1:434,6\n388#1:440\n*E\n"})
public final class TransformableKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0049 -> B:18:0x004c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object J2(androidx.compose.ui.input.pointer.AwaitPointerEventScope r5, androidx.compose.foundation.gestures.ScrollConfig r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1 r0 = (androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1) r0
            int r1 = r0.J2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.J2 = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1 r0 = new androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f17195O
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.J2
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r5 = r0.f17197t
            androidx.compose.foundation.gestures.ScrollConfig r5 = (androidx.compose.foundation.gestures.ScrollConfig) r5
            java.lang.Object r6 = r0.f17196n
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r6 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r6
            kotlin.ResultKt.throwOnFailure(r7)
            r4 = r6
            r6 = r5
            r5 = r4
            goto L4c
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3c:
            kotlin.ResultKt.throwOnFailure(r7)
        L3f:
            r0.f17196n = r5
            r0.f17197t = r6
            r0.J2 = r3
            java.lang.Object r7 = O(r5, r6, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            androidx.compose.ui.geometry.Offset r7 = (androidx.compose.ui.geometry.Offset) r7
            if (r7 == 0) goto L3f
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.J2(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.gestures.ScrollConfig, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object O(AwaitPointerEventScope awaitPointerEventScope, ScrollConfig scrollConfig, Continuation continuation) {
        TransformableKt$awaitCtrlMouseScrollOrNull$1 transformableKt$awaitCtrlMouseScrollOrNull$1;
        if (continuation instanceof TransformableKt$awaitCtrlMouseScrollOrNull$1) {
            transformableKt$awaitCtrlMouseScrollOrNull$1 = (TransformableKt$awaitCtrlMouseScrollOrNull$1) continuation;
            int i2 = transformableKt$awaitCtrlMouseScrollOrNull$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transformableKt$awaitCtrlMouseScrollOrNull$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                transformableKt$awaitCtrlMouseScrollOrNull$1 = new TransformableKt$awaitCtrlMouseScrollOrNull$1(continuation);
            }
        }
        Object objPJg = transformableKt$awaitCtrlMouseScrollOrNull$1.f17192O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = transformableKt$awaitCtrlMouseScrollOrNull$1.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objPJg);
            transformableKt$awaitCtrlMouseScrollOrNull$1.f17193n = awaitPointerEventScope;
            transformableKt$awaitCtrlMouseScrollOrNull$1.f17194t = scrollConfig;
            transformableKt$awaitCtrlMouseScrollOrNull$1.J2 = 1;
            objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope, null, transformableKt$awaitCtrlMouseScrollOrNull$1, 1, null);
            if (objPJg == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            scrollConfig = (ScrollConfig) transformableKt$awaitCtrlMouseScrollOrNull$1.f17194t;
            awaitPointerEventScope = (AwaitPointerEventScope) transformableKt$awaitCtrlMouseScrollOrNull$1.f17193n;
            ResultKt.throwOnFailure(objPJg);
        }
        PointerEvent pointerEvent = (PointerEvent) objPJg;
        if (!PointerEvent_androidKt.rl(pointerEvent.getKeyboardModifiers()) || !PointerEventType.mUb(pointerEvent.getType(), PointerEventType.INSTANCE.J2())) {
            return null;
        }
        long jT2 = scrollConfig.t(awaitPointerEventScope, pointerEvent, awaitPointerEventScope.n());
        if (Offset.mUb(jT2, Offset.INSTANCE.t())) {
            return null;
        }
        List changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((PointerInputChange) changes.get(i5)).n();
        }
        return Offset.nr(jT2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02b2, code lost:
    
        if (r6 != 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02b4, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02b9 A[EDGE_INSN: B:103:0x02b9->B:92:0x02b9 BREAK  A[LOOP:0: B:86:0x02a4->B:91:0x02b6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02c9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0288 -> B:85:0x0297). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Uo(AwaitPointerEventScope awaitPointerEventScope, boolean z2, CN3 cn3, Function1 function1, Continuation continuation) {
        TransformableKt$detectZoom$1 transformableKt$detectZoom$1;
        CN3 cn32;
        Function1 function12;
        boolean z3;
        float f3;
        long j2;
        int i2;
        int i3;
        float f4;
        float f5;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function1 function13;
        AwaitPointerEventScope awaitPointerEventScope3;
        float f6;
        float f7;
        CN3 cn33;
        int size;
        int i5;
        int i7;
        TransformableKt$detectZoom$1 transformableKt$detectZoom$12;
        float f8;
        long j3;
        int i8;
        int i9;
        Object objHBN;
        AwaitPointerEventScope awaitPointerEventScope4;
        PointerEvent pointerEvent;
        float f9;
        int i10;
        int i11;
        CN3 cn34;
        long j4;
        float f10;
        long j5;
        int size2;
        int i12;
        int size3;
        int i13;
        int size4;
        int i14;
        if (continuation instanceof TransformableKt$detectZoom$1) {
            transformableKt$detectZoom$1 = (TransformableKt$detectZoom$1) continuation;
            int i15 = transformableKt$detectZoom$1.f17198N;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                transformableKt$detectZoom$1.f17198N = i15 - Integer.MIN_VALUE;
            } else {
                transformableKt$detectZoom$1 = new TransformableKt$detectZoom$1(continuation);
            }
        }
        TransformableKt$detectZoom$1 transformableKt$detectZoom$13 = transformableKt$detectZoom$1;
        Object objPJg = transformableKt$detectZoom$13.f17201T;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i16 = transformableKt$detectZoom$13.f17198N;
        if (i16 == 0) {
            ResultKt.throwOnFailure(objPJg);
            long jT2 = Offset.INSTANCE.t();
            float fUo = awaitPointerEventScope.getViewConfiguration().Uo();
            transformableKt$detectZoom$13.f17206n = awaitPointerEventScope;
            cn32 = cn3;
            transformableKt$detectZoom$13.f17209t = cn32;
            function12 = function1;
            transformableKt$detectZoom$13.f17199O = function12;
            z3 = z2;
            transformableKt$detectZoom$13.f17208r = z3;
            transformableKt$detectZoom$13.f17207o = 0.0f;
            transformableKt$detectZoom$13.f17203Z = 1.0f;
            transformableKt$detectZoom$13.f17205g = jT2;
            transformableKt$detectZoom$13.E2 = 0;
            transformableKt$detectZoom$13.f17200S = fUo;
            transformableKt$detectZoom$13.f17204e = 0;
            transformableKt$detectZoom$13.f17198N = 1;
            if (TapGestureDetectorKt.J2(awaitPointerEventScope, false, null, transformableKt$detectZoom$13, 2, null) != coroutine_suspended) {
                f3 = fUo;
                j2 = jT2;
                i2 = 0;
                i3 = 0;
                f4 = 1.0f;
                f5 = 0.0f;
                awaitPointerEventScope2 = awaitPointerEventScope;
            }
            return coroutine_suspended;
        }
        if (i16 != 1) {
            if (i16 != 2) {
                if (i16 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i7 = transformableKt$detectZoom$13.f17202X;
                i10 = transformableKt$detectZoom$13.f17204e;
                f9 = transformableKt$detectZoom$13.f17200S;
                i11 = transformableKt$detectZoom$13.E2;
                j4 = transformableKt$detectZoom$13.f17205g;
                float f11 = transformableKt$detectZoom$13.f17203Z;
                f5 = transformableKt$detectZoom$13.f17207o;
                boolean z4 = transformableKt$detectZoom$13.f17208r;
                pointerEvent = (PointerEvent) transformableKt$detectZoom$13.J2;
                Function1 function14 = (Function1) transformableKt$detectZoom$13.f17199O;
                CN3 cn35 = (CN3) transformableKt$detectZoom$13.f17209t;
                AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) transformableKt$detectZoom$13.f17206n;
                ResultKt.throwOnFailure(objPJg);
                f4 = f11;
                cn34 = cn35;
                awaitPointerEventScope4 = awaitPointerEventScope5;
                function12 = function14;
                z3 = z4;
                objHBN = objPJg;
                List changes = ((PointerEvent) objHBN).getChanges();
                size3 = changes.size();
                Object obj = coroutine_suspended;
                i13 = 0;
                while (true) {
                    if (i13 >= size3) {
                        break;
                    }
                    if (((PointerInputChange) changes.get(i13)).ck()) {
                        break;
                    }
                    i13++;
                }
                boolean z5 = false;
                if (i7 == 0 && !z5) {
                    List changes2 = pointerEvent.getChanges();
                    size4 = changes2.size();
                    for (i14 = 0; i14 < size4; i14++) {
                        if (((PointerInputChange) changes2.get(i14)).getPressed()) {
                            i2 = i10;
                            f3 = f9;
                            i3 = i11;
                            cn32 = cn34;
                            j2 = j4;
                            awaitPointerEventScope2 = awaitPointerEventScope4;
                            coroutine_suspended = obj;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            i2 = transformableKt$detectZoom$13.f17204e;
            f3 = transformableKt$detectZoom$13.f17200S;
            i3 = transformableKt$detectZoom$13.E2;
            j2 = transformableKt$detectZoom$13.f17205g;
            float f12 = transformableKt$detectZoom$13.f17203Z;
            float f13 = transformableKt$detectZoom$13.f17207o;
            boolean z6 = transformableKt$detectZoom$13.f17208r;
            Function1 function15 = (Function1) transformableKt$detectZoom$13.f17199O;
            CN3 cn36 = (CN3) transformableKt$detectZoom$13.f17209t;
            AwaitPointerEventScope awaitPointerEventScope6 = (AwaitPointerEventScope) transformableKt$detectZoom$13.f17206n;
            ResultKt.throwOnFailure(objPJg);
            f7 = f12;
            cn33 = cn36;
            z3 = z6;
            f6 = f13;
            function13 = function15;
            awaitPointerEventScope3 = awaitPointerEventScope6;
            PointerEvent pointerEvent2 = (PointerEvent) objPJg;
            List changes3 = pointerEvent2.getChanges();
            size = changes3.size();
            int i17 = i2;
            i5 = 0;
            while (true) {
                if (i5 >= size) {
                    i7 = 0;
                    break;
                }
                if (((PointerInputChange) changes3.get(i5)).ck()) {
                    i7 = 1;
                    break;
                }
                i5++;
            }
            if (i7 != 0) {
                float fJ2 = TransformGestureDetectorKt.J2(pointerEvent2);
                float fO = TransformGestureDetectorKt.O(pointerEvent2);
                float f14 = f7;
                float f15 = f6;
                long jNr = TransformGestureDetectorKt.nr(pointerEvent2);
                if (i3 == 0) {
                    f8 = f14 * fJ2;
                    float f16 = f15 + fO;
                    long jIk = Offset.Ik(j2, jNr);
                    int i18 = i3;
                    float fT = TransformGestureDetectorKt.t(pointerEvent2, false);
                    float fAbs = Math.abs(1 - f8) * fT;
                    float fAbs2 = Math.abs(((3.1415927f * f16) * fT) / 180.0f);
                    float fGh = Offset.gh(jIk);
                    if (fAbs > f3 || fAbs2 > f3 || (fGh > f3 && ((Boolean) function13.invoke(Offset.nr(jNr))).booleanValue())) {
                        i8 = (!z3 || fAbs2 >= f3) ? 0 : 1;
                        cn33.nr(TransformEvent.TransformStarted.f17179n);
                        j5 = jIk;
                        i9 = 1;
                    } else {
                        i8 = i17;
                        j5 = jIk;
                        i9 = i18;
                    }
                    f10 = f16;
                } else {
                    f8 = f14;
                    f10 = f15;
                    j5 = j2;
                    i8 = i17;
                    i9 = i3;
                }
                if (i9 == 0) {
                    transformableKt$detectZoom$12 = transformableKt$detectZoom$13;
                } else {
                    float f17 = i8 != 0 ? 0.0f : fO;
                    if (f17 == 0.0f && fJ2 == 1.0f) {
                        transformableKt$detectZoom$12 = transformableKt$detectZoom$13;
                        if (!Offset.mUb(jNr, Offset.INSTANCE.t()) && ((Boolean) function13.invoke(Offset.nr(jNr))).booleanValue()) {
                        }
                        List changes4 = pointerEvent2.getChanges();
                        size2 = changes4.size();
                        for (i12 = 0; i12 < size2; i12++) {
                            PointerInputChange pointerInputChange = (PointerInputChange) changes4.get(i12);
                            if (PointerEventKt.mUb(pointerInputChange)) {
                                pointerInputChange.n();
                            }
                        }
                    } else {
                        transformableKt$detectZoom$12 = transformableKt$detectZoom$13;
                    }
                    cn33.nr(new TransformEvent.TransformDelta(fJ2, jNr, f17, null));
                    List changes42 = pointerEvent2.getChanges();
                    size2 = changes42.size();
                    while (i12 < size2) {
                    }
                }
                j3 = j5;
                f5 = f10;
            } else {
                int i19 = i3;
                transformableKt$detectZoom$12 = transformableKt$detectZoom$13;
                cn33.nr(TransformEvent.TransformStopped.f17180n);
                f8 = f7;
                f5 = f6;
                j3 = j2;
                i8 = i17;
                i9 = i19;
            }
            PointerEventPass pointerEventPass = PointerEventPass.f32077O;
            TransformableKt$detectZoom$1 transformableKt$detectZoom$14 = transformableKt$detectZoom$12;
            transformableKt$detectZoom$14.f17206n = awaitPointerEventScope3;
            transformableKt$detectZoom$14.f17209t = cn33;
            transformableKt$detectZoom$14.f17199O = function13;
            transformableKt$detectZoom$14.J2 = pointerEvent2;
            transformableKt$detectZoom$14.f17208r = z3;
            transformableKt$detectZoom$14.f17207o = f5;
            transformableKt$detectZoom$14.f17203Z = f8;
            transformableKt$detectZoom$14.f17205g = j3;
            transformableKt$detectZoom$14.E2 = i9;
            transformableKt$detectZoom$14.f17200S = f3;
            transformableKt$detectZoom$14.f17204e = i8;
            transformableKt$detectZoom$14.f17202X = i7;
            transformableKt$detectZoom$14.f17198N = 3;
            objHBN = awaitPointerEventScope3.HBN(pointerEventPass, transformableKt$detectZoom$14);
            if (objHBN != coroutine_suspended) {
                awaitPointerEventScope4 = awaitPointerEventScope3;
                function12 = function13;
                pointerEvent = pointerEvent2;
                long j6 = j3;
                f9 = f3;
                i10 = i8;
                i11 = i9;
                cn34 = cn33;
                transformableKt$detectZoom$13 = transformableKt$detectZoom$14;
                f4 = f8;
                j4 = j6;
                List changes5 = ((PointerEvent) objHBN).getChanges();
                size3 = changes5.size();
                Object obj2 = coroutine_suspended;
                i13 = 0;
                while (true) {
                    if (i13 >= size3) {
                    }
                    i13++;
                }
                boolean z52 = false;
                if (i7 == 0) {
                    List changes22 = pointerEvent.getChanges();
                    size4 = changes22.size();
                    while (i14 < size4) {
                    }
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        i2 = transformableKt$detectZoom$13.f17204e;
        f3 = transformableKt$detectZoom$13.f17200S;
        i3 = transformableKt$detectZoom$13.E2;
        j2 = transformableKt$detectZoom$13.f17205g;
        f4 = transformableKt$detectZoom$13.f17203Z;
        f5 = transformableKt$detectZoom$13.f17207o;
        boolean z7 = transformableKt$detectZoom$13.f17208r;
        function12 = (Function1) transformableKt$detectZoom$13.f17199O;
        CN3 cn37 = (CN3) transformableKt$detectZoom$13.f17209t;
        awaitPointerEventScope2 = (AwaitPointerEventScope) transformableKt$detectZoom$13.f17206n;
        ResultKt.throwOnFailure(objPJg);
        z3 = z7;
        cn32 = cn37;
        transformableKt$detectZoom$13.f17206n = awaitPointerEventScope2;
        transformableKt$detectZoom$13.f17209t = cn32;
        transformableKt$detectZoom$13.f17199O = function12;
        transformableKt$detectZoom$13.J2 = null;
        transformableKt$detectZoom$13.f17208r = z3;
        transformableKt$detectZoom$13.f17207o = f5;
        transformableKt$detectZoom$13.f17203Z = f4;
        transformableKt$detectZoom$13.f17205g = j2;
        transformableKt$detectZoom$13.E2 = i3;
        transformableKt$detectZoom$13.f17200S = f3;
        transformableKt$detectZoom$13.f17204e = i2;
        transformableKt$detectZoom$13.f17198N = 2;
        objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope2, null, transformableKt$detectZoom$13, 1, null);
        if (objPJg != coroutine_suspended) {
            float f18 = f5;
            f7 = f4;
            cn33 = cn32;
            f6 = f18;
            AwaitPointerEventScope awaitPointerEventScope7 = awaitPointerEventScope2;
            function13 = function12;
            awaitPointerEventScope3 = awaitPointerEventScope7;
            PointerEvent pointerEvent22 = (PointerEvent) objPJg;
            List changes32 = pointerEvent22.getChanges();
            size = changes32.size();
            int i172 = i2;
            i5 = 0;
            while (true) {
                if (i5 >= size) {
                }
                i5++;
            }
            if (i7 != 0) {
            }
            PointerEventPass pointerEventPass2 = PointerEventPass.f32077O;
            TransformableKt$detectZoom$1 transformableKt$detectZoom$142 = transformableKt$detectZoom$12;
            transformableKt$detectZoom$142.f17206n = awaitPointerEventScope3;
            transformableKt$detectZoom$142.f17209t = cn33;
            transformableKt$detectZoom$142.f17199O = function13;
            transformableKt$detectZoom$142.J2 = pointerEvent22;
            transformableKt$detectZoom$142.f17208r = z3;
            transformableKt$detectZoom$142.f17207o = f5;
            transformableKt$detectZoom$142.f17203Z = f8;
            transformableKt$detectZoom$142.f17205g = j3;
            transformableKt$detectZoom$142.E2 = i9;
            transformableKt$detectZoom$142.f17200S = f3;
            transformableKt$detectZoom$142.f17204e = i8;
            transformableKt$detectZoom$142.f17202X = i7;
            transformableKt$detectZoom$142.f17198N = 3;
            objHBN = awaitPointerEventScope3.HBN(pointerEventPass2, transformableKt$detectZoom$142);
            if (objHBN != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object KN(PointerInputScope pointerInputScope, CN3 cn3, ScrollConfig scrollConfig, Continuation continuation) {
        Object objETf = pointerInputScope.eTf(new TransformableKt$detectZoomByCtrlMouseScroll$2(continuation.get$context(), scrollConfig, cn3, null), continuation);
        if (objETf == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objETf;
        }
        return Unit.INSTANCE;
    }
}
