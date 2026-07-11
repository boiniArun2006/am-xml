package androidx.compose.foundation.gestures;

import GJW.C;
import GJW.Lu;
import GJW.h;
import GJW.vd;
import GJW.xuv;
import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.gestures.LongPressResult;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u008d\u0001\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012/\b\u0002\u0010\u000b\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u0010\u001a\u00020\u0003*\u00020\u000fH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0012*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015\u001a]\u0010\u0016\u001a\u00020\u0003*\u00020\u00002/\b\u0002\u0010\u000b\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0080@¢\u0006\u0004\b\u0016\u0010\u0017\u001a(\u0010\u001c\u001a\u00020\u0012*\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0086@¢\u0006\u0004\b\u001c\u0010\u001d\u001a(\u0010\u001e\u001a\u00020\u0012*\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0080@¢\u0006\u0004\b\u001e\u0010\u001d\u001a%\u0010!\u001a\u00020\u0018*\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010 \u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010\"\u001a \u0010#\u001a\u0004\u0018\u00010\u0012*\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0086@¢\u0006\u0004\b#\u0010$\u001a\u001e\u0010&\u001a\u00020%*\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0080@¢\u0006\u0004\b&\u0010$\u001aN\u0010.\u001a\u00020(*\u00020'2\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020*2'\u0010-\u001a#\b\u0001\u0012\u0004\u0012\u00020'\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0,¢\u0006\u0002\b\nH\u0002¢\u0006\u0004\b.\u0010/\";\u00102\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101\"\u001a\u00107\u001a\u00020*8BX\u0082\u0004¢\u0006\f\u0012\u0004\b5\u00106\u001a\u0004\b3\u00104¨\u00068"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "", "onDoubleTap", "onLongPress", "Lkotlin/Function3;", "Landroidx/compose/foundation/gestures/PressGestureScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "onPress", "onTap", "qie", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "mUb", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "firstUp", "xMQ", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerInputChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "gh", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "requireUnconsumed", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "O", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLandroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Uo", "Landroidx/compose/ui/input/pointer/PointerEvent;", "onlyPrimaryMouseButton", "HI", "(Landroidx/compose/ui/input/pointer/PointerEvent;ZZ)Z", "XQ", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/LongPressResult;", "o", "LGJW/vd;", "LGJW/xuv;", "resetJob", "LGJW/h;", TtmlNode.START, "Lkotlin/Function2;", "block", "Ik", "(LGJW/vd;LGJW/xuv;LGJW/h;Lkotlin/jvm/functions/Function2;)LGJW/xuv;", c.f62177j, "Lkotlin/jvm/functions/Function3;", "NoPressGesture", "ty", "()LGJW/h;", "getCoroutineStartForCurrentDispatchBehavior$annotations", "()V", "coroutineStartForCurrentDispatchBehavior", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTapGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,550:1\n34#2,6:551\n102#2,2:557\n34#2,6:559\n104#2:565\n87#2,2:566\n34#2,6:568\n89#2:574\n87#2,2:575\n34#2,6:577\n89#2:583\n87#2,2:584\n34#2,6:586\n89#2:592\n102#2,2:593\n34#2,6:595\n104#2:601\n102#2,2:602\n34#2,6:604\n104#2:610\n*S KotlinDebug\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt\n*L\n210#1:551,6\n211#1:557,2\n211#1:559,6\n211#1:565\n321#1:566,2\n321#1:568,6\n321#1:574\n324#1:575,2\n324#1:577,6\n324#1:583\n353#1:584,2\n353#1:586,6\n353#1:592\n359#1:593,2\n359#1:595,6\n359#1:601\n367#1:602,2\n367#1:604,6\n367#1:610\n*E\n"})
public final class TapGestureDetectorKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Function3 f17088n = new TapGestureDetectorKt$NoPressGesture$1(null);

    private static final boolean HI(PointerEvent pointerEvent, boolean z2, boolean z3) {
        if (z3) {
            List changes = pointerEvent.getChanges();
            int size = changes.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    if (!PointerType.KN(((PointerInputChange) changes.get(i2)).getType(), PointerType.INSTANCE.rl())) {
                        break;
                    }
                    i2++;
                } else if (!PointerEvent_androidKt.t(pointerEvent.getButtons())) {
                    return false;
                }
            }
        }
        List changes2 = pointerEvent.getChanges();
        int size2 = changes2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            PointerInputChange pointerInputChange = (PointerInputChange) changes2.get(i3);
            if (!(z2 ? PointerEventKt.n(pointerInputChange) : PointerEventKt.rl(pointerInputChange))) {
                return false;
            }
        }
        return true;
    }

    private static final xuv Ik(vd vdVar, xuv xuvVar, h hVar, Function2 function2) {
        return C.nr(vdVar, null, hVar, new TapGestureDetectorKt$launchAwaitingReset$1(xuvVar, function2, null), 1, null);
    }

    public static /* synthetic */ Object J2(AwaitPointerEventScope awaitPointerEventScope, boolean z2, PointerEventPass pointerEventPass, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        if ((i2 & 2) != 0) {
            pointerEventPass = PointerEventPass.f32080t;
        }
        return O(awaitPointerEventScope, z2, pointerEventPass, continuation);
    }

    public static /* synthetic */ Object KN(AwaitPointerEventScope awaitPointerEventScope, boolean z2, PointerEventPass pointerEventPass, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        if ((i2 & 2) != 0) {
            pointerEventPass = PointerEventPass.f32080t;
        }
        return Uo(awaitPointerEventScope, z2, pointerEventPass, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004e -> B:18:0x0051). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object O(androidx.compose.ui.input.pointer.AwaitPointerEventScope r7, boolean r8, androidx.compose.ui.input.pointer.PointerEventPass r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2) r0
            int r1 = r0.f17092r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17092r = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.J2
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f17092r
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            boolean r7 = r0.f17090O
            java.lang.Object r8 = r0.f17093t
            androidx.compose.ui.input.pointer.PointerEventPass r8 = (androidx.compose.ui.input.pointer.PointerEventPass) r8
            java.lang.Object r9 = r0.f17091n
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r9
            kotlin.ResultKt.throwOnFailure(r10)
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
            goto L51
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            kotlin.ResultKt.throwOnFailure(r10)
        L42:
            r0.f17091n = r7
            r0.f17093t = r9
            r0.f17090O = r8
            r0.f17092r = r3
            java.lang.Object r10 = r7.HBN(r9, r0)
            if (r10 != r1) goto L51
            return r1
        L51:
            androidx.compose.ui.input.pointer.PointerEvent r10 = (androidx.compose.ui.input.pointer.PointerEvent) r10
            r2 = 2
            r4 = 0
            r5 = 0
            boolean r2 = ck(r10, r8, r5, r2, r4)
            if (r2 == 0) goto L42
            java.util.List r7 = r10.getChanges()
            java.lang.Object r7 = r7.get(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.O(androidx.compose.ui.input.pointer.AwaitPointerEventScope, boolean, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object S(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            pointerEventPass = PointerEventPass.f32080t;
        }
        return XQ(awaitPointerEventScope, pointerEventPass, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004e -> B:18:0x0051). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object Uo(androidx.compose.ui.input.pointer.AwaitPointerEventScope r5, boolean r6, androidx.compose.ui.input.pointer.PointerEventPass r7, kotlin.coroutines.Continuation r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1) r0
            int r1 = r0.f17096r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17096r = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.J2
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f17096r
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            boolean r5 = r0.f17094O
            java.lang.Object r6 = r0.f17097t
            androidx.compose.ui.input.pointer.PointerEventPass r6 = (androidx.compose.ui.input.pointer.PointerEventPass) r6
            java.lang.Object r7 = r0.f17095n
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r7
            kotlin.ResultKt.throwOnFailure(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L51
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            kotlin.ResultKt.throwOnFailure(r8)
        L42:
            r0.f17095n = r5
            r0.f17097t = r7
            r0.f17094O = r6
            r0.f17096r = r3
            java.lang.Object r8 = r5.HBN(r7, r0)
            if (r8 != r1) goto L51
            return r1
        L51:
            androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.ui.input.pointer.PointerEvent) r8
            boolean r2 = HI(r8, r6, r3)
            if (r2 == 0) goto L42
            java.util.List r5 = r8.getChanges()
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.Uo(androidx.compose.ui.input.pointer.AwaitPointerEventScope, boolean, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b3, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c0, code lost:
    
        if (r0 == r2) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c0 -> B:13:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object XQ(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, Continuation continuation) {
        TapGestureDetectorKt$waitForUpOrCancellation$2 tapGestureDetectorKt$waitForUpOrCancellation$2;
        AwaitPointerEventScope awaitPointerEventScope2;
        TapGestureDetectorKt$waitForUpOrCancellation$2 tapGestureDetectorKt$waitForUpOrCancellation$22;
        PointerEventPass pointerEventPass2;
        AwaitPointerEventScope awaitPointerEventScope3;
        PointerEventPass pointerEventPass3;
        int size;
        int i2;
        Object objHBN;
        if (continuation instanceof TapGestureDetectorKt$waitForUpOrCancellation$2) {
            tapGestureDetectorKt$waitForUpOrCancellation$2 = (TapGestureDetectorKt$waitForUpOrCancellation$2) continuation;
            int i3 = tapGestureDetectorKt$waitForUpOrCancellation$2.J2;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tapGestureDetectorKt$waitForUpOrCancellation$2.J2 = i3 - Integer.MIN_VALUE;
            } else {
                tapGestureDetectorKt$waitForUpOrCancellation$2 = new TapGestureDetectorKt$waitForUpOrCancellation$2(continuation);
            }
        }
        Object objHBN2 = tapGestureDetectorKt$waitForUpOrCancellation$2.f17171O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = tapGestureDetectorKt$waitForUpOrCancellation$2.J2;
        if (i5 == 0) {
            ResultKt.throwOnFailure(objHBN2);
            awaitPointerEventScope2 = awaitPointerEventScope;
            tapGestureDetectorKt$waitForUpOrCancellation$22 = tapGestureDetectorKt$waitForUpOrCancellation$2;
            pointerEventPass2 = pointerEventPass;
            tapGestureDetectorKt$waitForUpOrCancellation$22.f17172n = awaitPointerEventScope2;
            tapGestureDetectorKt$waitForUpOrCancellation$22.f17173t = pointerEventPass2;
            tapGestureDetectorKt$waitForUpOrCancellation$22.J2 = 1;
            objHBN = awaitPointerEventScope2.HBN(pointerEventPass2, tapGestureDetectorKt$waitForUpOrCancellation$22);
            if (objHBN != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i5 == 1) {
            pointerEventPass3 = (PointerEventPass) tapGestureDetectorKt$waitForUpOrCancellation$2.f17173t;
            awaitPointerEventScope3 = (AwaitPointerEventScope) tapGestureDetectorKt$waitForUpOrCancellation$2.f17172n;
            ResultKt.throwOnFailure(objHBN2);
            PointerEvent pointerEvent = (PointerEvent) objHBN2;
            List changes = pointerEvent.getChanges();
            size = changes.size();
            while (i2 < size) {
            }
            return pointerEvent.getChanges().get(0);
        }
        if (i5 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pointerEventPass3 = (PointerEventPass) tapGestureDetectorKt$waitForUpOrCancellation$2.f17173t;
        awaitPointerEventScope3 = (AwaitPointerEventScope) tapGestureDetectorKt$waitForUpOrCancellation$2.f17172n;
        ResultKt.throwOnFailure(objHBN2);
        PointerEventPass pointerEventPass4 = pointerEventPass3;
        tapGestureDetectorKt$waitForUpOrCancellation$22 = tapGestureDetectorKt$waitForUpOrCancellation$2;
        pointerEventPass2 = pointerEventPass4;
        List changes2 = ((PointerEvent) objHBN2).getChanges();
        int size2 = changes2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            if (((PointerInputChange) changes2.get(i7)).ck()) {
                return null;
            }
        }
        awaitPointerEventScope2 = awaitPointerEventScope3;
        tapGestureDetectorKt$waitForUpOrCancellation$22.f17172n = awaitPointerEventScope2;
        tapGestureDetectorKt$waitForUpOrCancellation$22.f17173t = pointerEventPass2;
        tapGestureDetectorKt$waitForUpOrCancellation$22.J2 = 1;
        objHBN = awaitPointerEventScope2.HBN(pointerEventPass2, tapGestureDetectorKt$waitForUpOrCancellation$22);
        if (objHBN != coroutine_suspended) {
            awaitPointerEventScope3 = awaitPointerEventScope2;
            objHBN2 = objHBN;
            TapGestureDetectorKt$waitForUpOrCancellation$2 tapGestureDetectorKt$waitForUpOrCancellation$23 = tapGestureDetectorKt$waitForUpOrCancellation$22;
            pointerEventPass3 = pointerEventPass2;
            tapGestureDetectorKt$waitForUpOrCancellation$2 = tapGestureDetectorKt$waitForUpOrCancellation$23;
            PointerEvent pointerEvent2 = (PointerEvent) objHBN2;
            List changes3 = pointerEvent2.getChanges();
            size = changes3.size();
            for (i2 = 0; i2 < size; i2++) {
                if (!PointerEventKt.t((PointerInputChange) changes3.get(i2))) {
                    List changes4 = pointerEvent2.getChanges();
                    int size3 = changes4.size();
                    for (int i8 = 0; i8 < size3; i8++) {
                        PointerInputChange pointerInputChange = (PointerInputChange) changes4.get(i8);
                        if (pointerInputChange.ck() || PointerEventKt.J2(pointerInputChange, awaitPointerEventScope3.n(), awaitPointerEventScope3.hRu())) {
                            break;
                        }
                    }
                    PointerEventPass pointerEventPass5 = PointerEventPass.f32077O;
                    tapGestureDetectorKt$waitForUpOrCancellation$2.f17172n = awaitPointerEventScope3;
                    tapGestureDetectorKt$waitForUpOrCancellation$2.f17173t = pointerEventPass3;
                    tapGestureDetectorKt$waitForUpOrCancellation$2.J2 = 2;
                    objHBN2 = awaitPointerEventScope3.HBN(pointerEventPass5, tapGestureDetectorKt$waitForUpOrCancellation$2);
                }
            }
            return pointerEvent2.getChanges().get(0);
        }
        return coroutine_suspended;
    }

    public static /* synthetic */ Object Z(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            pointerEventPass = PointerEventPass.f32080t;
        }
        return o(awaitPointerEventScope, pointerEventPass, continuation);
    }

    public static /* synthetic */ Object az(PointerInputScope pointerInputScope, Function1 function1, Function1 function12, Function3 function3, Function1 function13, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            function1 = null;
        }
        if ((i2 & 2) != 0) {
            function12 = null;
        }
        if ((i2 & 4) != 0) {
            function3 = f17088n;
        }
        if ((i2 & 8) != 0) {
            function13 = null;
        }
        return qie(pointerInputScope, function1, function12, function3, function13, continuation);
    }

    static /* synthetic */ boolean ck(PointerEvent pointerEvent, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z3 = TapGestureDetector_androidKt.n();
        }
        return HI(pointerEvent, z2, z3);
    }

    public static final Object gh(PointerInputScope pointerInputScope, Function3 function3, Function1 function1, Continuation continuation) {
        Object objJ2 = Lu.J2(new TapGestureDetectorKt$detectTapAndPress$2(pointerInputScope, function3, function1, new PressGestureScopeImpl(pointerInputScope), null), continuation);
        return objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ2 : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052 A[LOOP:0: B:19:0x0050->B:20:0x0052, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object mUb(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
        TapGestureDetectorKt$consumeUntilUp$1 tapGestureDetectorKt$consumeUntilUp$1;
        int size;
        int i2;
        int i3;
        int size2;
        if (continuation instanceof TapGestureDetectorKt$consumeUntilUp$1) {
            tapGestureDetectorKt$consumeUntilUp$1 = (TapGestureDetectorKt$consumeUntilUp$1) continuation;
            int i5 = tapGestureDetectorKt$consumeUntilUp$1.f17101O;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                tapGestureDetectorKt$consumeUntilUp$1.f17101O = i5 - Integer.MIN_VALUE;
            } else {
                tapGestureDetectorKt$consumeUntilUp$1 = new TapGestureDetectorKt$consumeUntilUp$1(continuation);
            }
        }
        Object objPJg = tapGestureDetectorKt$consumeUntilUp$1.f17103t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = tapGestureDetectorKt$consumeUntilUp$1.f17101O;
        if (i7 == 0) {
            ResultKt.throwOnFailure(objPJg);
            tapGestureDetectorKt$consumeUntilUp$1.f17102n = awaitPointerEventScope;
            tapGestureDetectorKt$consumeUntilUp$1.f17101O = 1;
            objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope, null, tapGestureDetectorKt$consumeUntilUp$1, 1, null);
            if (objPJg == coroutine_suspended) {
            }
            PointerEvent pointerEvent = (PointerEvent) objPJg;
            List changes = pointerEvent.getChanges();
            size = changes.size();
            i2 = 0;
            while (i3 < size) {
            }
            List changes2 = pointerEvent.getChanges();
            size2 = changes2.size();
            while (i2 < size2) {
            }
            return Unit.INSTANCE;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        awaitPointerEventScope = (AwaitPointerEventScope) tapGestureDetectorKt$consumeUntilUp$1.f17102n;
        ResultKt.throwOnFailure(objPJg);
        PointerEvent pointerEvent2 = (PointerEvent) objPJg;
        List changes3 = pointerEvent2.getChanges();
        size = changes3.size();
        i2 = 0;
        for (i3 = 0; i3 < size; i3++) {
            ((PointerInputChange) changes3.get(i3)).n();
        }
        List changes22 = pointerEvent2.getChanges();
        size2 = changes22.size();
        while (i2 < size2) {
            if (((PointerInputChange) changes22.get(i2)).getPressed()) {
                tapGestureDetectorKt$consumeUntilUp$1.f17102n = awaitPointerEventScope;
                tapGestureDetectorKt$consumeUntilUp$1.f17101O = 1;
                objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope, null, tapGestureDetectorKt$consumeUntilUp$1, 1, null);
                if (objPJg == coroutine_suspended) {
                    return coroutine_suspended;
                }
                PointerEvent pointerEvent22 = (PointerEvent) objPJg;
                List changes32 = pointerEvent22.getChanges();
                size = changes32.size();
                i2 = 0;
                while (i3 < size) {
                }
                List changes222 = pointerEvent22.getChanges();
                size2 = changes222.size();
                while (i2 < size2) {
                }
            } else {
                i2++;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.compose.foundation.gestures.LongPressResult$Canceled] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, Continuation continuation) {
        TapGestureDetectorKt$waitForLongPress$1 tapGestureDetectorKt$waitForLongPress$1;
        Ref.ObjectRef objectRef;
        if (continuation instanceof TapGestureDetectorKt$waitForLongPress$1) {
            tapGestureDetectorKt$waitForLongPress$1 = (TapGestureDetectorKt$waitForLongPress$1) continuation;
            int i2 = tapGestureDetectorKt$waitForLongPress$1.f17165O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tapGestureDetectorKt$waitForLongPress$1.f17165O = i2 - Integer.MIN_VALUE;
            } else {
                tapGestureDetectorKt$waitForLongPress$1 = new TapGestureDetectorKt$waitForLongPress$1(continuation);
            }
        }
        Object obj = tapGestureDetectorKt$waitForLongPress$1.f17167t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = tapGestureDetectorKt$waitForLongPress$1.f17165O;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                objectRef2.element = LongPressResult.Canceled.f16908n;
                long jT2 = awaitPointerEventScope.getViewConfiguration().t();
                Function2 tapGestureDetectorKt$waitForLongPress$2 = new TapGestureDetectorKt$waitForLongPress$2(pointerEventPass, objectRef2, null);
                tapGestureDetectorKt$waitForLongPress$1.f17166n = objectRef2;
                tapGestureDetectorKt$waitForLongPress$1.f17165O = 1;
                if (awaitPointerEventScope.lLA(jT2, tapGestureDetectorKt$waitForLongPress$2, tapGestureDetectorKt$waitForLongPress$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) tapGestureDetectorKt$waitForLongPress$1.f17166n;
                ResultKt.throwOnFailure(obj);
            }
            return objectRef.element;
        } catch (PointerEventTimeoutCancellationException unused) {
            return LongPressResult.Success.f16910n;
        }
    }

    public static final Object qie(PointerInputScope pointerInputScope, Function1 function1, Function1 function12, Function3 function3, Function1 function13, Continuation continuation) {
        Object objJ2 = Lu.J2(new TapGestureDetectorKt$detectTapGestures$2(pointerInputScope, function3, function12, function1, function13, null), continuation);
        return objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ2 : Unit.INSTANCE;
    }

    static /* synthetic */ xuv r(vd vdVar, xuv xuvVar, h hVar, Function2 function2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            hVar = ty();
        }
        return Ik(vdVar, xuvVar, hVar, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h ty() {
        return ComposeFoundationFlags.isDetectTapGesturesImmediateCoroutineDispatchEnabled ? h.J2 : h.f3486n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object xMQ(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, Continuation continuation) {
        return awaitPointerEventScope.Mx(awaitPointerEventScope.getViewConfiguration().n(), new TapGestureDetectorKt$awaitSecondDown$2(pointerInputChange, null), continuation);
    }
}
