package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.ViewConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.l;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a'\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a$\u0010\u0011\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012\u001a,\u0010\u0015\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016\u001a$\u0010\u0018\u001a\u00020\u0003*\u00020\u00172\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0080@¢\u0006\u0004\b\u0018\u0010\u0019\u001a$\u0010\u001b\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u001b\u0010\u0012\u001a$\u0010\u001c\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u001c\u0010\u0012\u001a,\u0010\u001d\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u001d\u0010\u0016\u001a\u0014\u0010\u001e\u001a\u00020\u000f*\u00020\rH\u0082@¢\u0006\u0004\b\u001e\u0010\u001f\u001a'\u0010%\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&\"\u0018\u0010)\u001a\u00020\u0002*\u00020\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "", "", "updateTouchMode", "r", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "mouseSelectionObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "textDragObserver", "az", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/TextDragObserver;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "observer", "Landroidx/compose/ui/input/pointer/PointerEvent;", "down", "HI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/TextDragObserver;Landroidx/compose/ui/input/pointer/PointerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/text/selection/ClicksCounter;", "clicksCounter", "gh", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/selection/ClicksCounter;Landroidx/compose/ui/input/pointer/PointerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "ty", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/TextDragObserver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downEvent", "ck", "Ik", "qie", "KN", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "change1", "change2", "xMQ", "(Landroidx/compose/ui/platform/ViewConfiguration;Landroidx/compose/ui/input/pointer/PointerInputChange;Landroidx/compose/ui/input/pointer/PointerInputChange;)Z", "mUb", "(Landroidx/compose/ui/input/pointer/PointerEvent;)Z", "isPrecisePointer", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSelectionGestures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,449:1\n34#2,6:450\n34#2,6:456\n34#2,6:462\n34#2,6:468\n34#2,6:474\n34#2,6:480\n34#2,6:486\n87#2,2:492\n34#2,6:494\n89#2:500\n87#2,2:501\n34#2,6:503\n89#2:509\n*S KotlinDebug\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt\n*L\n136#1:450,6\n166#1:456,6\n191#1:462,6\n248#1:468,6\n329#1:474,6\n364#1:480,6\n392#1:486,6\n431#1:492,2\n431#1:494,6\n431#1:500\n448#1:501,2\n448#1:503,6\n448#1:509\n*E\n"})
public final class SelectionGesturesKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
    
        if (r11 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object HI(AwaitPointerEventScope awaitPointerEventScope, final TextDragObserver textDragObserver, PointerEvent pointerEvent, Continuation continuation) {
        SelectionGesturesKt$touchSelection$1 selectionGesturesKt$touchSelection$1;
        PointerInputChange pointerInputChange;
        if (continuation instanceof SelectionGesturesKt$touchSelection$1) {
            selectionGesturesKt$touchSelection$1 = (SelectionGesturesKt$touchSelection$1) continuation;
            int i2 = selectionGesturesKt$touchSelection$1.f20839r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectionGesturesKt$touchSelection$1.f20839r = i2 - Integer.MIN_VALUE;
            } else {
                selectionGesturesKt$touchSelection$1 = new SelectionGesturesKt$touchSelection$1(continuation);
            }
        }
        Object objUo = selectionGesturesKt$touchSelection$1.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = selectionGesturesKt$touchSelection$1.f20839r;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objUo);
                pointerInputChange = (PointerInputChange) CollectionsKt.first(pointerEvent.getChanges());
                long id = pointerInputChange.getId();
                selectionGesturesKt$touchSelection$1.f20838n = awaitPointerEventScope;
                selectionGesturesKt$touchSelection$1.f20840t = textDragObserver;
                selectionGesturesKt$touchSelection$1.f20837O = pointerInputChange;
                selectionGesturesKt$touchSelection$1.f20839r = 1;
                objUo = DragGestureDetectorKt.Uo(awaitPointerEventScope, id, selectionGesturesKt$touchSelection$1);
                if (objUo == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                textDragObserver = (TextDragObserver) selectionGesturesKt$touchSelection$1.f20840t;
                awaitPointerEventScope = (AwaitPointerEventScope) selectionGesturesKt$touchSelection$1.f20838n;
                ResultKt.throwOnFailure(objUo);
                if (((Boolean) objUo).booleanValue()) {
                    List changes = awaitPointerEventScope.UF().getChanges();
                    int size = changes.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        PointerInputChange pointerInputChange2 = (PointerInputChange) changes.get(i5);
                        if (PointerEventKt.t(pointerInputChange2)) {
                            pointerInputChange2.n();
                        }
                    }
                    textDragObserver.onStop();
                } else {
                    textDragObserver.onCancel();
                }
                return Unit.INSTANCE;
            }
            PointerInputChange pointerInputChange3 = (PointerInputChange) selectionGesturesKt$touchSelection$1.f20837O;
            textDragObserver = (TextDragObserver) selectionGesturesKt$touchSelection$1.f20840t;
            AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) selectionGesturesKt$touchSelection$1.f20838n;
            ResultKt.throwOnFailure(objUo);
            pointerInputChange = pointerInputChange3;
            awaitPointerEventScope = awaitPointerEventScope2;
            PointerInputChange pointerInputChange4 = (PointerInputChange) objUo;
            if (pointerInputChange4 != null && xMQ(awaitPointerEventScope.getViewConfiguration(), pointerInputChange, pointerInputChange4)) {
                textDragObserver.rl(pointerInputChange4.getPosition());
                long id2 = pointerInputChange4.getId();
                Function1<PointerInputChange, Unit> function1 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$2
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange5) {
                        n(pointerInputChange5);
                        return Unit.INSTANCE;
                    }

                    public final void n(PointerInputChange pointerInputChange5) {
                        textDragObserver.nr(PointerEventKt.Uo(pointerInputChange5));
                        pointerInputChange5.n();
                    }
                };
                selectionGesturesKt$touchSelection$1.f20838n = awaitPointerEventScope;
                selectionGesturesKt$touchSelection$1.f20840t = textDragObserver;
                selectionGesturesKt$touchSelection$1.f20837O = null;
                selectionGesturesKt$touchSelection$1.f20839r = 2;
                objUo = DragGestureDetectorKt.o(awaitPointerEventScope, id2, function1, selectionGesturesKt$touchSelection$1);
            }
            return Unit.INSTANCE;
        } catch (CancellationException e2) {
            textDragObserver.onCancel();
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00dc, code lost:
    
        if (r15 == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Ik(AwaitPointerEventScope awaitPointerEventScope, final TextDragObserver textDragObserver, PointerEvent pointerEvent, Continuation continuation) {
        SelectionGesturesKt$touchSelectionSubsequentPress$1 selectionGesturesKt$touchSelectionSubsequentPress$1;
        PointerInputChange pointerInputChange;
        long id;
        Ref.LongRef longRef;
        Object objMx;
        if (continuation instanceof SelectionGesturesKt$touchSelectionSubsequentPress$1) {
            selectionGesturesKt$touchSelectionSubsequentPress$1 = (SelectionGesturesKt$touchSelectionSubsequentPress$1) continuation;
            int i2 = selectionGesturesKt$touchSelectionSubsequentPress$1.f20848Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectionGesturesKt$touchSelectionSubsequentPress$1.f20848Z = i2 - Integer.MIN_VALUE;
            } else {
                selectionGesturesKt$touchSelectionSubsequentPress$1 = new SelectionGesturesKt$touchSelectionSubsequentPress$1(continuation);
            }
        }
        Object objO = selectionGesturesKt$touchSelectionSubsequentPress$1.f20850o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = selectionGesturesKt$touchSelectionSubsequentPress$1.f20848Z;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objO);
                pointerInputChange = (PointerInputChange) CollectionsKt.first(pointerEvent.getChanges());
                id = pointerInputChange.getId();
                longRef = new Ref.LongRef();
                longRef.element = Offset.INSTANCE.rl();
                long jT2 = awaitPointerEventScope.getViewConfiguration().t();
                SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 = new SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1(id, longRef, null);
                selectionGesturesKt$touchSelectionSubsequentPress$1.f20849n = awaitPointerEventScope;
                selectionGesturesKt$touchSelectionSubsequentPress$1.f20852t = textDragObserver;
                selectionGesturesKt$touchSelectionSubsequentPress$1.f20847O = pointerInputChange;
                selectionGesturesKt$touchSelectionSubsequentPress$1.J2 = longRef;
                selectionGesturesKt$touchSelectionSubsequentPress$1.f20851r = id;
                selectionGesturesKt$touchSelectionSubsequentPress$1.f20848Z = 1;
                objMx = awaitPointerEventScope.Mx(jT2, selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1, selectionGesturesKt$touchSelectionSubsequentPress$1);
                if (objMx == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                textDragObserver = (TextDragObserver) selectionGesturesKt$touchSelectionSubsequentPress$1.f20852t;
                awaitPointerEventScope = (AwaitPointerEventScope) selectionGesturesKt$touchSelectionSubsequentPress$1.f20849n;
                ResultKt.throwOnFailure(objO);
                if (((Boolean) objO).booleanValue()) {
                    List changes = awaitPointerEventScope.UF().getChanges();
                    int size = changes.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        PointerInputChange pointerInputChange2 = (PointerInputChange) changes.get(i5);
                        if (PointerEventKt.t(pointerInputChange2)) {
                            pointerInputChange2.n();
                        }
                    }
                    textDragObserver.onStop();
                } else {
                    textDragObserver.onCancel();
                }
                return Unit.INSTANCE;
            }
            long j2 = selectionGesturesKt$touchSelectionSubsequentPress$1.f20851r;
            Ref.LongRef longRef2 = (Ref.LongRef) selectionGesturesKt$touchSelectionSubsequentPress$1.J2;
            pointerInputChange = (PointerInputChange) selectionGesturesKt$touchSelectionSubsequentPress$1.f20847O;
            TextDragObserver textDragObserver2 = (TextDragObserver) selectionGesturesKt$touchSelectionSubsequentPress$1.f20852t;
            AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) selectionGesturesKt$touchSelectionSubsequentPress$1.f20849n;
            try {
                ResultKt.throwOnFailure(objO);
                longRef = longRef2;
                objMx = objO;
                id = j2;
                textDragObserver = textDragObserver2;
                awaitPointerEventScope = awaitPointerEventScope2;
            } catch (CancellationException e2) {
                e = e2;
                textDragObserver = textDragObserver2;
                textDragObserver.onCancel();
                throw e;
            }
            DownResolution downResolution = (DownResolution) objMx;
            if (downResolution == null) {
                downResolution = DownResolution.f20740O;
            }
            if (downResolution == DownResolution.J2) {
                return Unit.INSTANCE;
            }
            textDragObserver.rl(pointerInputChange.getPosition());
            if (downResolution == DownResolution.f20741n) {
                textDragObserver.onStop();
                return Unit.INSTANCE;
            }
            if (downResolution == DownResolution.f20744t) {
                textDragObserver.nr(longRef.element);
            }
            Function1<PointerInputChange, Unit> function1 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$dragCompletedWithUp$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange3) {
                    n(pointerInputChange3);
                    return Unit.INSTANCE;
                }

                public final void n(PointerInputChange pointerInputChange3) {
                    textDragObserver.nr(PointerEventKt.Uo(pointerInputChange3));
                    pointerInputChange3.n();
                }
            };
            selectionGesturesKt$touchSelectionSubsequentPress$1.f20849n = awaitPointerEventScope;
            selectionGesturesKt$touchSelectionSubsequentPress$1.f20852t = textDragObserver;
            selectionGesturesKt$touchSelectionSubsequentPress$1.f20847O = null;
            selectionGesturesKt$touchSelectionSubsequentPress$1.J2 = null;
            selectionGesturesKt$touchSelectionSubsequentPress$1.f20848Z = 2;
            objO = DragGestureDetectorKt.o(awaitPointerEventScope, id, function1, selectionGesturesKt$touchSelectionSubsequentPress$1);
        } catch (CancellationException e3) {
            e = e3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object KN(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
        SelectionGesturesKt$awaitDown$1 selectionGesturesKt$awaitDown$1;
        int size;
        int i2;
        if (continuation instanceof SelectionGesturesKt$awaitDown$1) {
            selectionGesturesKt$awaitDown$1 = (SelectionGesturesKt$awaitDown$1) continuation;
            int i3 = selectionGesturesKt$awaitDown$1.f20808O;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                selectionGesturesKt$awaitDown$1.f20808O = i3 - Integer.MIN_VALUE;
            } else {
                selectionGesturesKt$awaitDown$1 = new SelectionGesturesKt$awaitDown$1(continuation);
            }
        }
        Object objHBN = selectionGesturesKt$awaitDown$1.f20810t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = selectionGesturesKt$awaitDown$1.f20808O;
        if (i5 == 0) {
            ResultKt.throwOnFailure(objHBN);
            PointerEventPass pointerEventPass = PointerEventPass.f32080t;
            selectionGesturesKt$awaitDown$1.f20809n = awaitPointerEventScope;
            selectionGesturesKt$awaitDown$1.f20808O = 1;
            objHBN = awaitPointerEventScope.HBN(pointerEventPass, selectionGesturesKt$awaitDown$1);
            if (objHBN == coroutine_suspended) {
            }
            PointerEvent pointerEvent = (PointerEvent) objHBN;
            List changes = pointerEvent.getChanges();
            size = changes.size();
            i2 = 0;
            while (i2 < size) {
            }
            return pointerEvent;
        }
        if (i5 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        awaitPointerEventScope = (AwaitPointerEventScope) selectionGesturesKt$awaitDown$1.f20809n;
        ResultKt.throwOnFailure(objHBN);
        PointerEvent pointerEvent2 = (PointerEvent) objHBN;
        List changes2 = pointerEvent2.getChanges();
        size = changes2.size();
        i2 = 0;
        while (i2 < size) {
            if (PointerEventKt.rl((PointerInputChange) changes2.get(i2))) {
                i2++;
            } else {
                PointerEventPass pointerEventPass2 = PointerEventPass.f32080t;
                selectionGesturesKt$awaitDown$1.f20809n = awaitPointerEventScope;
                selectionGesturesKt$awaitDown$1.f20808O = 1;
                objHBN = awaitPointerEventScope.HBN(pointerEventPass2, selectionGesturesKt$awaitDown$1);
                if (objHBN == coroutine_suspended) {
                    return coroutine_suspended;
                }
                PointerEvent pointerEvent22 = (PointerEvent) objHBN;
                List changes22 = pointerEvent22.getChanges();
                size = changes22.size();
                i2 = 0;
                while (i2 < size) {
                }
            }
        }
        return pointerEvent22;
    }

    public static final Modifier az(Modifier modifier, final MouseSelectionObserver mouseSelectionObserver, final TextDragObserver textDragObserver) {
        return SuspendingPointerInputFilterKt.O(modifier, mouseSelectionObserver, textDragObserver, new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1

            /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1", f = "SelectionGestures.kt", i = {0}, l = {107, 113, 115}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
            @SourceDebugExtension({"SMAP\nSelectionGestures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGestureInput$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,449:1\n87#2,2:450\n34#2,6:452\n89#2:458\n*S KotlinDebug\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGestureInput$1$1\n*L\n111#1:450,2\n111#1:452,6\n111#1:458\n*E\n"})
            static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ ClicksCounter J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ MouseSelectionObserver f20829O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f20830n;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ TextDragObserver f20831r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                private /* synthetic */ Object f20832t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(MouseSelectionObserver mouseSelectionObserver, ClicksCounter clicksCounter, TextDragObserver textDragObserver, Continuation continuation) {
                    super(2, continuation);
                    this.f20829O = mouseSelectionObserver;
                    this.J2 = clicksCounter;
                    this.f20831r = textDragObserver;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f20829O, this.J2, this.f20831r, continuation);
                    anonymousClass1.f20832t = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
                    return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
                
                    if (androidx.compose.foundation.text.selection.SelectionGesturesKt.gh(r1, r2, r4, r10, r9) == r0) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
                
                    if (androidx.compose.foundation.text.selection.SelectionGesturesKt.HI(r1, r3, r10, r9) == r0) goto L32;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    AwaitPointerEventScope awaitPointerEventScope;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.f20830n;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 != 2 && i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        awaitPointerEventScope = (AwaitPointerEventScope) this.f20832t;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        ResultKt.throwOnFailure(obj);
                        awaitPointerEventScope = (AwaitPointerEventScope) this.f20832t;
                        this.f20832t = awaitPointerEventScope;
                        this.f20830n = 1;
                        obj = SelectionGesturesKt.KN(awaitPointerEventScope, this);
                        if (obj != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    if (SelectionGesturesKt.mUb(pointerEvent) && PointerEvent_androidKt.t(pointerEvent.getButtons())) {
                        List changes = pointerEvent.getChanges();
                        int size = changes.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            if (!((PointerInputChange) changes.get(i3)).ck()) {
                            }
                        }
                        MouseSelectionObserver mouseSelectionObserver = this.f20829O;
                        ClicksCounter clicksCounter = this.J2;
                        this.f20832t = null;
                        this.f20830n = 2;
                    }
                    if (!SelectionGesturesKt.mUb(pointerEvent)) {
                        TextDragObserver textDragObserver = this.f20831r;
                        this.f20832t = null;
                        this.f20830n = 3;
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                Object objO = ForEachGestureKt.O(pointerInputScope, new AnonymousClass1(mouseSelectionObserver, new ClicksCounter(pointerInputScope.getViewConfiguration()), textDragObserver, null), continuation);
                return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : Unit.INSTANCE;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
    
        if (r11 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object ck(AwaitPointerEventScope awaitPointerEventScope, final TextDragObserver textDragObserver, PointerEvent pointerEvent, Continuation continuation) {
        SelectionGesturesKt$touchSelectionFirstPress$1 selectionGesturesKt$touchSelectionFirstPress$1;
        PointerInputChange pointerInputChange;
        if (continuation instanceof SelectionGesturesKt$touchSelectionFirstPress$1) {
            selectionGesturesKt$touchSelectionFirstPress$1 = (SelectionGesturesKt$touchSelectionFirstPress$1) continuation;
            int i2 = selectionGesturesKt$touchSelectionFirstPress$1.f20844r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectionGesturesKt$touchSelectionFirstPress$1.f20844r = i2 - Integer.MIN_VALUE;
            } else {
                selectionGesturesKt$touchSelectionFirstPress$1 = new SelectionGesturesKt$touchSelectionFirstPress$1(continuation);
            }
        }
        Object objUo = selectionGesturesKt$touchSelectionFirstPress$1.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = selectionGesturesKt$touchSelectionFirstPress$1.f20844r;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objUo);
                pointerInputChange = (PointerInputChange) CollectionsKt.first(pointerEvent.getChanges());
                long id = pointerInputChange.getId();
                selectionGesturesKt$touchSelectionFirstPress$1.f20843n = awaitPointerEventScope;
                selectionGesturesKt$touchSelectionFirstPress$1.f20845t = textDragObserver;
                selectionGesturesKt$touchSelectionFirstPress$1.f20842O = pointerInputChange;
                selectionGesturesKt$touchSelectionFirstPress$1.f20844r = 1;
                objUo = DragGestureDetectorKt.Uo(awaitPointerEventScope, id, selectionGesturesKt$touchSelectionFirstPress$1);
                if (objUo == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                textDragObserver = (TextDragObserver) selectionGesturesKt$touchSelectionFirstPress$1.f20845t;
                awaitPointerEventScope = (AwaitPointerEventScope) selectionGesturesKt$touchSelectionFirstPress$1.f20843n;
                ResultKt.throwOnFailure(objUo);
                if (((Boolean) objUo).booleanValue()) {
                    List changes = awaitPointerEventScope.UF().getChanges();
                    int size = changes.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        PointerInputChange pointerInputChange2 = (PointerInputChange) changes.get(i5);
                        if (PointerEventKt.t(pointerInputChange2)) {
                            pointerInputChange2.n();
                        }
                    }
                    textDragObserver.onStop();
                } else {
                    textDragObserver.onCancel();
                }
                return Unit.INSTANCE;
            }
            PointerInputChange pointerInputChange3 = (PointerInputChange) selectionGesturesKt$touchSelectionFirstPress$1.f20842O;
            textDragObserver = (TextDragObserver) selectionGesturesKt$touchSelectionFirstPress$1.f20845t;
            AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) selectionGesturesKt$touchSelectionFirstPress$1.f20843n;
            ResultKt.throwOnFailure(objUo);
            pointerInputChange = pointerInputChange3;
            awaitPointerEventScope = awaitPointerEventScope2;
            PointerInputChange pointerInputChange4 = (PointerInputChange) objUo;
            if (pointerInputChange4 != null && xMQ(awaitPointerEventScope.getViewConfiguration(), pointerInputChange, pointerInputChange4)) {
                textDragObserver.rl(pointerInputChange4.getPosition());
                long id2 = pointerInputChange4.getId();
                Function1<PointerInputChange, Unit> function1 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$dragCompletedWithUp$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange5) {
                        n(pointerInputChange5);
                        return Unit.INSTANCE;
                    }

                    public final void n(PointerInputChange pointerInputChange5) {
                        textDragObserver.nr(PointerEventKt.Uo(pointerInputChange5));
                        pointerInputChange5.n();
                    }
                };
                selectionGesturesKt$touchSelectionFirstPress$1.f20843n = awaitPointerEventScope;
                selectionGesturesKt$touchSelectionFirstPress$1.f20845t = textDragObserver;
                selectionGesturesKt$touchSelectionFirstPress$1.f20842O = null;
                selectionGesturesKt$touchSelectionFirstPress$1.f20844r = 2;
                objUo = DragGestureDetectorKt.o(awaitPointerEventScope, id2, function1, selectionGesturesKt$touchSelectionFirstPress$1);
            }
            return Unit.INSTANCE;
        } catch (CancellationException e2) {
            textDragObserver.onCancel();
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        if (r12 == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object gh(AwaitPointerEventScope awaitPointerEventScope, final MouseSelectionObserver mouseSelectionObserver, ClicksCounter clicksCounter, PointerEvent pointerEvent, Continuation continuation) {
        SelectionGesturesKt$mouseSelection$1 selectionGesturesKt$mouseSelection$1;
        AwaitPointerEventScope awaitPointerEventScope2;
        Ref.BooleanRef booleanRef;
        int size;
        if (continuation instanceof SelectionGesturesKt$mouseSelection$1) {
            selectionGesturesKt$mouseSelection$1 = (SelectionGesturesKt$mouseSelection$1) continuation;
            int i2 = selectionGesturesKt$mouseSelection$1.f20813r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectionGesturesKt$mouseSelection$1.f20813r = i2 - Integer.MIN_VALUE;
            } else {
                selectionGesturesKt$mouseSelection$1 = new SelectionGesturesKt$mouseSelection$1(continuation);
            }
        }
        Object objO = selectionGesturesKt$mouseSelection$1.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = selectionGesturesKt$mouseSelection$1.f20813r;
        int i5 = 0;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objO);
            clicksCounter.nr(pointerEvent);
            PointerInputChange pointerInputChange = (PointerInputChange) pointerEvent.getChanges().get(0);
            if (!TextFieldSelectionManager_androidKt.rl(pointerEvent)) {
                int iN = clicksCounter.n();
                final SelectionAdjustment selectionAdjustmentTy = iN != 1 ? iN != 2 ? SelectionAdjustment.INSTANCE.ty() : SelectionAdjustment.INSTANCE.HI() : SelectionAdjustment.INSTANCE.az();
                if (mouseSelectionObserver.t(pointerInputChange.getPosition(), selectionAdjustmentTy)) {
                    final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                    booleanRef2.element = !Intrinsics.areEqual(selectionAdjustmentTy, SelectionAdjustment.INSTANCE.az());
                    long id = pointerInputChange.getId();
                    Function1<PointerInputChange, Unit> function1 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$shouldConsumeUp$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange2) {
                            n(pointerInputChange2);
                            return Unit.INSTANCE;
                        }

                        public final void n(PointerInputChange pointerInputChange2) {
                            if (mouseSelectionObserver.nr(pointerInputChange2.getPosition(), selectionAdjustmentTy)) {
                                pointerInputChange2.n();
                                booleanRef2.element = true;
                            }
                        }
                    };
                    selectionGesturesKt$mouseSelection$1.f20812n = awaitPointerEventScope;
                    selectionGesturesKt$mouseSelection$1.f20814t = mouseSelectionObserver;
                    selectionGesturesKt$mouseSelection$1.f20811O = booleanRef2;
                    selectionGesturesKt$mouseSelection$1.f20813r = 2;
                    objO = DragGestureDetectorKt.o(awaitPointerEventScope, id, function1, selectionGesturesKt$mouseSelection$1);
                    if (objO != coroutine_suspended) {
                        awaitPointerEventScope2 = awaitPointerEventScope;
                        booleanRef = booleanRef2;
                        if (((Boolean) objO).booleanValue()) {
                            List changes = awaitPointerEventScope2.UF().getChanges();
                            size = changes.size();
                            while (i5 < size) {
                            }
                        }
                        mouseSelectionObserver.n();
                    }
                    return coroutine_suspended;
                }
            } else if (mouseSelectionObserver.O(pointerInputChange.getPosition())) {
                long id2 = pointerInputChange.getId();
                Function1<PointerInputChange, Unit> function12 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$shouldConsumeUp$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange2) {
                        n(pointerInputChange2);
                        return Unit.INSTANCE;
                    }

                    public final void n(PointerInputChange pointerInputChange2) {
                        if (mouseSelectionObserver.rl(pointerInputChange2.getPosition())) {
                            pointerInputChange2.n();
                        }
                    }
                };
                selectionGesturesKt$mouseSelection$1.f20812n = awaitPointerEventScope;
                selectionGesturesKt$mouseSelection$1.f20814t = mouseSelectionObserver;
                selectionGesturesKt$mouseSelection$1.f20813r = 1;
                objO = DragGestureDetectorKt.o(awaitPointerEventScope, id2, function12, selectionGesturesKt$mouseSelection$1);
            }
        } else if (i3 == 1) {
            mouseSelectionObserver = (MouseSelectionObserver) selectionGesturesKt$mouseSelection$1.f20814t;
            awaitPointerEventScope = (AwaitPointerEventScope) selectionGesturesKt$mouseSelection$1.f20812n;
            ResultKt.throwOnFailure(objO);
            if (((Boolean) objO).booleanValue()) {
                List changes2 = awaitPointerEventScope.UF().getChanges();
                int size2 = changes2.size();
                while (i5 < size2) {
                    PointerInputChange pointerInputChange2 = (PointerInputChange) changes2.get(i5);
                    if (PointerEventKt.t(pointerInputChange2)) {
                        pointerInputChange2.n();
                    }
                    i5++;
                }
            }
            mouseSelectionObserver.n();
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            booleanRef = (Ref.BooleanRef) selectionGesturesKt$mouseSelection$1.f20811O;
            mouseSelectionObserver = (MouseSelectionObserver) selectionGesturesKt$mouseSelection$1.f20814t;
            awaitPointerEventScope2 = (AwaitPointerEventScope) selectionGesturesKt$mouseSelection$1.f20812n;
            ResultKt.throwOnFailure(objO);
            if (((Boolean) objO).booleanValue() && booleanRef.element) {
                List changes3 = awaitPointerEventScope2.UF().getChanges();
                size = changes3.size();
                while (i5 < size) {
                    PointerInputChange pointerInputChange3 = (PointerInputChange) changes3.get(i5);
                    if (PointerEventKt.t(pointerInputChange3)) {
                        pointerInputChange3.n();
                    }
                    i5++;
                }
            }
            mouseSelectionObserver.n();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:20:0x004e, B:31:0x008b, B:33:0x0093, B:35:0x00a1, B:37:0x00ad, B:28:0x0071), top: B:69:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012b A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:13:0x0035, B:54:0x0111, B:56:0x0119, B:58:0x011d, B:60:0x012b, B:62:0x0137, B:50:0x00e2), top: B:69:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object qie(AwaitPointerEventScope awaitPointerEventScope, final MouseSelectionObserver mouseSelectionObserver, ClicksCounter clicksCounter, PointerEvent pointerEvent, Continuation continuation) {
        SelectionGesturesKt$mouseSelectionBtf2$1 selectionGesturesKt$mouseSelectionBtf2$1;
        AwaitPointerEventScope awaitPointerEventScope2;
        Ref.BooleanRef booleanRef;
        int size;
        if (continuation instanceof SelectionGesturesKt$mouseSelectionBtf2$1) {
            selectionGesturesKt$mouseSelectionBtf2$1 = (SelectionGesturesKt$mouseSelectionBtf2$1) continuation;
            int i2 = selectionGesturesKt$mouseSelectionBtf2$1.f20821r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectionGesturesKt$mouseSelectionBtf2$1.f20821r = i2 - Integer.MIN_VALUE;
            } else {
                selectionGesturesKt$mouseSelectionBtf2$1 = new SelectionGesturesKt$mouseSelectionBtf2$1(continuation);
            }
        }
        Object objO = selectionGesturesKt$mouseSelectionBtf2$1.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = selectionGesturesKt$mouseSelectionBtf2$1.f20821r;
        int i5 = 0;
        try {
            try {
                if (i3 == 0) {
                    ResultKt.throwOnFailure(objO);
                    PointerInputChange pointerInputChange = (PointerInputChange) pointerEvent.getChanges().get(0);
                    if (!TextFieldSelectionManager_androidKt.rl(pointerEvent)) {
                        int iN = clicksCounter.n();
                        final SelectionAdjustment selectionAdjustmentTy = iN != 1 ? iN != 2 ? SelectionAdjustment.INSTANCE.ty() : SelectionAdjustment.INSTANCE.HI() : SelectionAdjustment.INSTANCE.az();
                        if (mouseSelectionObserver.t(pointerInputChange.getPosition(), selectionAdjustmentTy)) {
                            pointerInputChange.n();
                            final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                            booleanRef2.element = !Intrinsics.areEqual(selectionAdjustmentTy, SelectionAdjustment.INSTANCE.az());
                            long id = pointerInputChange.getId();
                            Function1<PointerInputChange, Unit> function1 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelectionBtf2$shouldConsumeUp$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange2) {
                                    n(pointerInputChange2);
                                    return Unit.INSTANCE;
                                }

                                public final void n(PointerInputChange pointerInputChange2) {
                                    if (mouseSelectionObserver.nr(pointerInputChange2.getPosition(), selectionAdjustmentTy)) {
                                        pointerInputChange2.n();
                                        booleanRef2.element = true;
                                    }
                                }
                            };
                            selectionGesturesKt$mouseSelectionBtf2$1.f20820n = awaitPointerEventScope;
                            selectionGesturesKt$mouseSelectionBtf2$1.f20822t = mouseSelectionObserver;
                            selectionGesturesKt$mouseSelectionBtf2$1.f20819O = booleanRef2;
                            selectionGesturesKt$mouseSelectionBtf2$1.f20821r = 2;
                            objO = DragGestureDetectorKt.o(awaitPointerEventScope, id, function1, selectionGesturesKt$mouseSelectionBtf2$1);
                            if (objO != coroutine_suspended) {
                                awaitPointerEventScope2 = awaitPointerEventScope;
                                booleanRef = booleanRef2;
                                if (((Boolean) objO).booleanValue()) {
                                    List changes = awaitPointerEventScope2.UF().getChanges();
                                    size = changes.size();
                                    while (i5 < size) {
                                    }
                                }
                                mouseSelectionObserver.n();
                            }
                            return coroutine_suspended;
                        }
                    } else if (mouseSelectionObserver.O(pointerInputChange.getPosition())) {
                        pointerInputChange.n();
                        long id2 = pointerInputChange.getId();
                        Function1<PointerInputChange, Unit> function12 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelectionBtf2$shouldConsumeUp$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange2) {
                                n(pointerInputChange2);
                                return Unit.INSTANCE;
                            }

                            public final void n(PointerInputChange pointerInputChange2) {
                                if (mouseSelectionObserver.rl(pointerInputChange2.getPosition())) {
                                    pointerInputChange2.n();
                                }
                            }
                        };
                        selectionGesturesKt$mouseSelectionBtf2$1.f20820n = awaitPointerEventScope;
                        selectionGesturesKt$mouseSelectionBtf2$1.f20822t = mouseSelectionObserver;
                        selectionGesturesKt$mouseSelectionBtf2$1.f20821r = 1;
                        objO = DragGestureDetectorKt.o(awaitPointerEventScope, id2, function12, selectionGesturesKt$mouseSelectionBtf2$1);
                        if (objO == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (((Boolean) objO).booleanValue()) {
                        }
                    }
                } else if (i3 == 1) {
                    mouseSelectionObserver = (MouseSelectionObserver) selectionGesturesKt$mouseSelectionBtf2$1.f20822t;
                    awaitPointerEventScope = (AwaitPointerEventScope) selectionGesturesKt$mouseSelectionBtf2$1.f20820n;
                    ResultKt.throwOnFailure(objO);
                    if (((Boolean) objO).booleanValue()) {
                        List changes2 = awaitPointerEventScope.UF().getChanges();
                        int size2 = changes2.size();
                        while (i5 < size2) {
                            PointerInputChange pointerInputChange2 = (PointerInputChange) changes2.get(i5);
                            if (PointerEventKt.t(pointerInputChange2)) {
                                pointerInputChange2.n();
                            }
                            i5++;
                        }
                    }
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    booleanRef = (Ref.BooleanRef) selectionGesturesKt$mouseSelectionBtf2$1.f20819O;
                    mouseSelectionObserver = (MouseSelectionObserver) selectionGesturesKt$mouseSelectionBtf2$1.f20822t;
                    awaitPointerEventScope2 = (AwaitPointerEventScope) selectionGesturesKt$mouseSelectionBtf2$1.f20820n;
                    ResultKt.throwOnFailure(objO);
                    if (((Boolean) objO).booleanValue() && booleanRef.element) {
                        List changes3 = awaitPointerEventScope2.UF().getChanges();
                        size = changes3.size();
                        while (i5 < size) {
                            PointerInputChange pointerInputChange3 = (PointerInputChange) changes3.get(i5);
                            if (PointerEventKt.t(pointerInputChange3)) {
                                pointerInputChange3.n();
                            }
                            i5++;
                        }
                    }
                    mouseSelectionObserver.n();
                }
                return Unit.INSTANCE;
            } finally {
            }
        } finally {
        }
    }

    public static final Object ty(PointerInputScope pointerInputScope, MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver, Continuation continuation) {
        Object objO = ForEachGestureKt.O(pointerInputScope, new SelectionGesturesKt$selectionGesturePointerInputBtf2$2(new ClicksCounter(pointerInputScope.getViewConfiguration()), mouseSelectionObserver, textDragObserver, null), continuation);
        return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : Unit.INSTANCE;
    }

    public static final boolean mUb(PointerEvent pointerEvent) {
        List changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!PointerType.KN(((PointerInputChange) changes.get(i2)).getType(), PointerType.INSTANCE.rl())) {
                return false;
            }
        }
        return true;
    }

    public static final Modifier r(Modifier modifier, final Function1 function1) {
        return SuspendingPointerInputFilterKt.nr(modifier, 8675309, new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1

            /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1", f = "SelectionGestures.kt", i = {0}, l = {l.f62283e}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
            static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ Function1 f20859O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f20860n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                private /* synthetic */ Object f20861t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Function1 function1, Continuation continuation) {
                    super(2, continuation);
                    this.f20859O = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f20859O, continuation);
                    anonymousClass1.f20861t = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
                    return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x002f A[RETURN] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:12:0x0030). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                    /*
                        r4 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r1 = r4.f20860n
                        r2 = 1
                        if (r1 == 0) goto L1b
                        if (r1 != r2) goto L13
                        java.lang.Object r1 = r4.f20861t
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                        kotlin.ResultKt.throwOnFailure(r5)
                        goto L30
                    L13:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r0)
                        throw r5
                    L1b:
                        kotlin.ResultKt.throwOnFailure(r5)
                        java.lang.Object r5 = r4.f20861t
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
                        r1 = r5
                    L23:
                        androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.ui.input.pointer.PointerEventPass.f32078n
                        r4.f20861t = r1
                        r4.f20860n = r2
                        java.lang.Object r5 = r1.HBN(r5, r4)
                        if (r5 != r0) goto L30
                        return r0
                    L30:
                        androidx.compose.ui.input.pointer.PointerEvent r5 = (androidx.compose.ui.input.pointer.PointerEvent) r5
                        kotlin.jvm.functions.Function1 r3 = r4.f20859O
                        boolean r5 = androidx.compose.foundation.text.selection.SelectionGesturesKt.mUb(r5)
                        r5 = r5 ^ r2
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
                        r3.invoke(r5)
                        goto L23
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                Object objETf = pointerInputScope.eTf(new AnonymousClass1(function1, null), continuation);
                return objETf == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objETf : Unit.INSTANCE;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean xMQ(ViewConfiguration viewConfiguration, PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2) {
        if (Offset.gh(Offset.ck(pointerInputChange.getPosition(), pointerInputChange2.getPosition())) < DragGestureDetectorKt.S(viewConfiguration, pointerInputChange.getType())) {
            return true;
        }
        return false;
    }
}
