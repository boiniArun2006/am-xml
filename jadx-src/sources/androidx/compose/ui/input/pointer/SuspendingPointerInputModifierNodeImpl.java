package androidx.compose.ui.input.pointer;

import GJW.C;
import GJW.Pl;
import GJW.eO;
import GJW.h;
import GJW.xuv;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.caoccao.javet.values.reference.IV8ValueMap;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.events.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001eB=\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBZ\b\u0017\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\b\u0012'\u0010\u0012\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000e¢\u0006\u0002\b\u0011¢\u0006\u0004\b\f\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001e\u0010\u001bJ?\u0010\u001f\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0012\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001f\u0010\rJ*\u0010\"\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010!\u001a\u00020 H\u0016ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0010H\u0016¢\u0006\u0004\b$\u0010\u001bJ?\u0010(\u001a\u00028\u0000\"\u0004\b\u0000\u0010%2'\u0010'\u001a#\b\u0001\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000e¢\u0006\u0002\b\u0011H\u0096@¢\u0006\u0004\b(\u0010)R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010+R\"\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010-R9\u00100\u001a%\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000e¢\u0006\u0002\b\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010:\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\"\u0010?\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030<R\u00020\u00000;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010+R\"\u0010C\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030<R\u00020\u00000;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010>R\u0018\u0010E\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u00109R\u001c\u0010H\u001a\u00020 8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bF\u0010GR\"\u0010O\u001a\u00020I8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bG\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010\u000b\u001a\u00020\n2\u0006\u0010P\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0014\u0010X\u001a\u00020U8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0014\u0010Z\u001a\u00020U8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010WR\u0014\u0010^\u001a\u00020[8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u001a\u0010a\u001a\u00020 8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b_\u0010`R\u001a\u0010d\u001a\u00020b8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bc\u0010`\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006f"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/ui/unit/Density;", "", "key1", "key2", "", IV8ValueMap.FUNCTION_KEYS, "Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "pointerInputEventHandler", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "pointerInputEvent", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "W1c", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;)V", "Sax", "()V", "jB", "d", "p0N", "ni", "Landroidx/compose/ui/unit/IntSize;", "bounds", "C", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "lNy", "R", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "block", "eTf", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "v", "Ljava/lang/Object;", "Xw", "[Ljava/lang/Object;", "U", "Lkotlin/jvm/functions/Function2;", "_deprecatedPointerInputHandler", "P5", "Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "_pointerInputEventHandler", "LGJW/xuv;", "M7", "LGJW/xuv;", "pointerInputJob", "p5", "Landroidx/compose/ui/input/pointer/PointerEvent;", "currentEvent", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine;", "eF", "Landroidx/compose/runtime/collection/MutableVector;", "pointerHandlers", "E", "pointerHandlersLock", "M", "dispatchingPointerHandlers", "FX", "lastPointerEvent", "B", "J", "boundsSize", "", "Z", "getInterceptOutOfBoundsChildEvents", "()Z", "T3L", "(Z)V", "interceptOutOfBoundsChildEvents", "value", CmcdConfiguration.KEY_PLAYBACK_RATE, "()Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "setPointerInputEventHandler", "(Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V", "", "getDensity", "()F", "density", "yAc", "fontScale", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", c.f62177j, "()J", "size", "Landroidx/compose/ui/geometry/Size;", "hRu", "extendedTouchPadding", "PointerEventHandlerCoroutine", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 Synchronization.android.kt\nandroidx/compose/ui/platform/Synchronization_androidKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 8 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 10 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 11 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 12 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,918:1\n681#1:961\n682#1,4:965\n686#1:978\n689#1,3:988\n1101#2:919\n1083#2,2:920\n1101#2:923\n1083#2,2:924\n27#3:922\n32#3,2:940\n32#3,2:962\n32#3,2:1028\n57#4:926\n61#4:931\n60#5:927\n85#5:930\n70#5:932\n90#5:935\n53#5,3:937\n22#6:928\n22#6:933\n54#7:929\n59#7:934\n33#8:936\n144#9:942\n423#9,9:943\n447#9,9:952\n144#9:964\n423#9,9:969\n447#9,9:979\n641#9,2:1030\n87#10,2:991\n34#10,6:993\n89#10:999\n87#10,2:1000\n34#10,6:1002\n89#10:1008\n439#10,3:1009\n34#10,4:1012\n39#10:1017\n442#10:1018\n1#11:1016\n314#12,9:1019\n323#12,2:1032\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl\n*L\n698#1:961\n698#1:965,4\n698#1:978\n698#1:988,3\n549#1:919\n549#1:920,2\n559#1:923\n559#1:924,2\n551#1:922\n681#1:940,2\n698#1:962,2\n772#1:1028,2\n579#1:926\n580#1:931\n579#1:927\n579#1:930\n580#1:932\n580#1:935\n581#1:937,3\n579#1:928\n580#1:933\n579#1:929\n580#1:934\n581#1:936\n681#1:942\n685#1:943,9\n686#1:952,9\n698#1:964\n698#1:969,9\n698#1:979,9\n773#1:1030,2\n728#1:991,2\n728#1:993,6\n728#1:999\n738#1:1000,2\n738#1:1002,6\n738#1:1008\n742#1:1009,3\n742#1:1012,4\n742#1:1017\n742#1:1018\n742#1:1016\n770#1:1019,9\n770#1:1032,2\n*E\n"})
public final class SuspendingPointerInputModifierNodeImpl extends Modifier.Node implements SuspendingPointerInputModifierNode, PointerInputScope, Density {

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private long boundsSize;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final Object pointerHandlersLock;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private PointerEvent lastPointerEvent;

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private boolean interceptOutOfBoundsChildEvents;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final MutableVector dispatchingPointerHandlers;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private xuv pointerInputJob;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private PointerInputEventHandler _pointerInputEventHandler;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private Function2 _deprecatedPointerInputHandler;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private Object key2;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private final MutableVector pointerHandlers;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private Object[] keys;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private PointerEvent currentEvent;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private Object key1;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\b*\u00020\u0011H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\b*\u00020\tH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u0011*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0013J\u0017\u0010\u001b\u001a\u00020\u0011*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0010J\u0017\u0010\u001c\u001a\u00020\u0016*\u00020\u0017H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\f*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\f*\u00020\u0011H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001eJ\u001d\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020$2\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*J\u001d\u0010-\u001a\u00020$2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+H\u0016¢\u0006\u0004\b-\u0010.J\u0018\u0010/\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0096@¢\u0006\u0004\b/\u00100JI\u00108\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0001\u001012\u0006\u00103\u001a\u0002022'\u00107\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010504¢\u0006\u0002\b6H\u0096@¢\u0006\u0004\b8\u00109JG\u0010:\u001a\u00028\u0001\"\u0004\b\u0001\u001012\u0006\u00103\u001a\u0002022'\u00107\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010504¢\u0006\u0002\b6H\u0096@¢\u0006\u0004\b:\u00109R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001e\u0010@\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010C\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010I\u001a\u00020D8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0014\u0010L\u001a\u00020\u00118\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020\u00118\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bM\u0010KR\u0014\u0010Q\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u001a\u0010T\u001a\u00020R8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b;\u0010SR\u0014\u0010X\u001a\u00020U8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u001a\u0010Z\u001a\u00020\u00168VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bY\u0010S\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006["}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine;", "R", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/coroutines/Continuation;", "completion", "<init>", "(Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl;Lkotlin/coroutines/Continuation;)V", "Landroidx/compose/ui/unit/Dp;", "", "How", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "I4p", "(J)I", "Z", "(J)F", "", "bzg", "(F)F", "rV9", "(I)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "Ik", "(J)J", CmcdData.STREAM_TYPE_LIVE, "tFV", "M", "ck", "(F)J", "ViF", "Landroidx/compose/ui/input/pointer/PointerEvent;", a.f62811a, "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "", "nHg", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;)V", "", "cause", "N", "(Ljava/lang/Throwable;)V", "Lkotlin/Result;", "result", "resumeWith", "(Ljava/lang/Object;)V", "HBN", "(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "timeMillis", "Lkotlin/Function2;", "", "Lkotlin/ExtensionFunctionType;", "block", "Mx", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lLA", c.f62177j, "Lkotlin/coroutines/Continuation;", "LGJW/Pl;", "O", "LGJW/Pl;", "pointerAwaiter", "J2", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "awaitPass", "Lkotlin/coroutines/CoroutineContext;", "r", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "getDensity", "()F", "density", "yAc", "fontScale", "UF", "()Landroidx/compose/ui/input/pointer/PointerEvent;", "currentEvent", "Landroidx/compose/ui/unit/IntSize;", "()J", "size", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "hRu", "extendedTouchPadding", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine\n+ 2 Synchronization.android.kt\nandroidx/compose/ui/platform/Synchronization_androidKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,918:1\n32#2,2:919\n646#3,2:921\n314#4,11:923\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine\n*L\n846#1:919,2\n846#1:921,2\n851#1:923,11\n*E\n"})
    final class PointerEventHandlerCoroutine<R> implements AwaitPointerEventScope, Density, Continuation<R> {

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private Pl pointerAwaiter;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final Continuation completion;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final /* synthetic */ SuspendingPointerInputModifierNodeImpl f32156t;

        /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
        private PointerEventPass awaitPass = PointerEventPass.f32080t;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private final CoroutineContext context = EmptyCoroutineContext.INSTANCE;

        @Override // androidx.compose.ui.unit.Density
        public int How(float f3) {
            return this.f32156t.How(f3);
        }

        @Override // androidx.compose.ui.unit.Density
        public int I4p(long j2) {
            return this.f32156t.I4p(j2);
        }

        @Override // androidx.compose.ui.unit.Density
        public long Ik(long j2) {
            return this.f32156t.Ik(j2);
        }

        @Override // androidx.compose.ui.unit.Density
        public long M(long j2) {
            return this.f32156t.M(j2);
        }

        @Override // androidx.compose.ui.unit.Density
        public long ViF(float f3) {
            return this.f32156t.ViF(f3);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float Z(long j2) {
            return this.f32156t.Z(j2);
        }

        @Override // androidx.compose.ui.unit.Density
        public float bzg(float f3) {
            return this.f32156t.bzg(f3);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public long ck(float f3) {
            return this.f32156t.ck(f3);
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.f32156t.getDensity();
        }

        @Override // androidx.compose.ui.unit.Density
        public float l(float f3) {
            return this.f32156t.l(f3);
        }

        @Override // androidx.compose.ui.unit.Density
        public float rV9(int i2) {
            return this.f32156t.rV9(i2);
        }

        @Override // androidx.compose.ui.unit.Density
        public float tFV(long j2) {
            return this.f32156t.tFV(j2);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* JADX INFO: renamed from: yAc */
        public float getFontScale() {
            return this.f32156t.getFontScale();
        }

        public PointerEventHandlerCoroutine(Continuation continuation) {
            this.completion = continuation;
            this.f32156t = SuspendingPointerInputModifierNodeImpl.this;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public Object HBN(PointerEventPass pointerEventPass, Continuation continuation) {
            eO eOVar = new eO(IntrinsicsKt.intercepted(continuation), 1);
            eOVar.e();
            this.awaitPass = pointerEventPass;
            this.pointerAwaiter = eOVar;
            Object objWPU = eOVar.WPU();
            if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return objWPU;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object Mx(long j2, Function2 function2, Continuation continuation) {
            SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1;
            if (continuation instanceof SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1) {
                suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 = (SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1) continuation;
                int i2 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.f32163O;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.f32163O = i2 - Integer.MIN_VALUE;
                } else {
                    suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 = new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1(this, continuation);
                }
            }
            Object obj = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.f32164n;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.f32163O;
            try {
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.f32163O = 1;
                Object objLLA = lLA(j2, function2, suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1);
                return objLLA == coroutine_suspended ? coroutine_suspended : objLLA;
            } catch (PointerEventTimeoutCancellationException unused) {
                return null;
            }
        }

        public final void N(Throwable cause) {
            Pl pl = this.pointerAwaiter;
            if (pl != null) {
                pl.cancel(cause);
            }
            this.pointerAwaiter = null;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public PointerEvent UF() {
            return SuspendingPointerInputModifierNodeImpl.this.currentEvent;
        }

        @Override // kotlin.coroutines.Continuation
        public CoroutineContext getContext() {
            return this.context;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public ViewConfiguration getViewConfiguration() {
            return SuspendingPointerInputModifierNodeImpl.this.getViewConfiguration();
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public long hRu() {
            return SuspendingPointerInputModifierNodeImpl.this.hRu();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r11v0, types: [long] */
        /* JADX WARN: Type inference failed for: r11v1, types: [GJW.xuv] */
        /* JADX WARN: Type inference failed for: r11v3, types: [GJW.xuv] */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r11v8 */
        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object lLA(long j2, Function2 function2, Continuation continuation) {
            SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1;
            Pl pl;
            if (continuation instanceof SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1) {
                suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 = (SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1) continuation;
                int i2 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.J2;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.J2 = i2 - Integer.MIN_VALUE;
                } else {
                    suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 = new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1(this, continuation);
                }
            }
            Object objInvoke = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.f32159t;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.J2;
            try {
                if (i3 == 0) {
                    ResultKt.throwOnFailure(objInvoke);
                    if (j2 <= 0 && (pl = this.pointerAwaiter) != null) {
                        Result.Companion companion = Result.INSTANCE;
                        pl.resumeWith(Result.m313constructorimpl(ResultKt.createFailure(new PointerEventTimeoutCancellationException(j2))));
                    }
                    xuv xuvVarNr = C.nr(SuspendingPointerInputModifierNodeImpl.this.Xli(), null, null, new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1(j2, this, null), 3, null);
                    suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.f32158n = xuvVarNr;
                    suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.J2 = 1;
                    objInvoke = function2.invoke(this, suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1);
                    j2 = xuvVarNr;
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    xuv xuvVar = (xuv) suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.f32158n;
                    ResultKt.throwOnFailure(objInvoke);
                    j2 = xuvVar;
                }
                j2.cancel(CancelTimeoutCancellationException.f32050n);
                return objInvoke;
            } catch (Throwable th) {
                j2.cancel(CancelTimeoutCancellationException.f32050n);
                throw th;
            }
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public long n() {
            return SuspendingPointerInputModifierNodeImpl.this.boundsSize;
        }

        public final void nHg(PointerEvent event, PointerEventPass pass) {
            Pl pl;
            if (pass != this.awaitPass || (pl = this.pointerAwaiter) == null) {
                return;
            }
            this.pointerAwaiter = null;
            pl.resumeWith(Result.m313constructorimpl(event));
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(Object result) {
            Object obj = SuspendingPointerInputModifierNodeImpl.this.pointerHandlersLock;
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = SuspendingPointerInputModifierNodeImpl.this;
            synchronized (obj) {
                suspendingPointerInputModifierNodeImpl.pointerHandlers.ck(this);
                Unit unit = Unit.INSTANCE;
            }
            this.completion.resumeWith(result);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PointerEventPass.values().length];
            try {
                iArr[PointerEventPass.f32078n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PointerEventPass.f32077O.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PointerEventPass.f32080t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SuspendingPointerInputModifierNodeImpl(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.key1 = obj;
        this.key2 = obj2;
        this.keys = objArr;
        this._pointerInputEventHandler = pointerInputEventHandler;
        this.currentEvent = SuspendingPointerInputFilterKt.f32141n;
        MutableVector mutableVector = new MutableVector(new PointerEventHandlerCoroutine[16], 0);
        this.pointerHandlers = mutableVector;
        this.pointerHandlersLock = mutableVector;
        this.dispatchingPointerHandlers = new MutableVector(new PointerEventHandlerCoroutine[16], 0);
        this.boundsSize = IntSize.INSTANCE.n();
    }

    private final void W1c(PointerEvent pointerEvent, PointerEventPass pass) {
        synchronized (this.pointerHandlersLock) {
            MutableVector mutableVector = this.dispatchingPointerHandlers;
            mutableVector.t(mutableVector.getSize(), this.pointerHandlers);
        }
        try {
            int i2 = WhenMappings.$EnumSwitchMapping$0[pass.ordinal()];
            if (i2 == 1 || i2 == 2) {
                MutableVector mutableVector2 = this.dispatchingPointerHandlers;
                Object[] objArr = mutableVector2.content;
                int size = mutableVector2.getSize();
                for (int i3 = 0; i3 < size; i3++) {
                    ((PointerEventHandlerCoroutine) objArr[i3]).nHg(pointerEvent, pass);
                }
            } else if (i2 == 3) {
                MutableVector mutableVector3 = this.dispatchingPointerHandlers;
                int size2 = mutableVector3.getSize() - 1;
                Object[] objArr2 = mutableVector3.content;
                if (size2 < objArr2.length) {
                    while (size2 >= 0) {
                        ((PointerEventHandlerCoroutine) objArr2[size2]).nHg(pointerEvent, pass);
                        size2--;
                    }
                }
            }
        } finally {
            this.dispatchingPointerHandlers.KN();
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void C(PointerEvent pointerEvent, PointerEventPass pass, long bounds) {
        this.boundsSize = bounds;
        if (pass == PointerEventPass.f32078n) {
            this.currentEvent = pointerEvent;
        }
        if (this.pointerInputJob == null) {
            this.pointerInputJob = C.nr(Xli(), null, h.J2, new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this, null), 1, null);
        }
        W1c(pointerEvent, pass);
        List changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z2 = true;
                break;
            } else if (!PointerEventKt.nr((PointerInputChange) changes.get(i2))) {
                break;
            } else {
                i2++;
            }
        }
        if (z2) {
            pointerEvent = null;
        }
        this.lastPointerEvent = pointerEvent;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public void T3L(boolean z2) {
        this.interceptOutOfBoundsChildEvents = z2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public Object eTf(Function2 function2, Continuation continuation) {
        eO eOVar = new eO(IntrinsicsKt.intercepted(continuation), 1);
        eOVar.e();
        final PointerEventHandlerCoroutine pointerEventHandlerCoroutine = new PointerEventHandlerCoroutine(eOVar);
        synchronized (this.pointerHandlersLock) {
            this.pointerHandlers.rl(pointerEventHandlerCoroutine);
            Continuation<Unit> continuationCreateCoroutine = ContinuationKt.createCoroutine(function2, pointerEventHandlerCoroutine, pointerEventHandlerCoroutine);
            Result.Companion companion = Result.INSTANCE;
            continuationCreateCoroutine.resumeWith(Result.m313constructorimpl(Unit.INSTANCE));
        }
        eOVar.J2(new Function1<Throwable, Unit>() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$awaitPointerEventScope$2$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                pointerEventHandlerCoroutine.N(th);
            }
        });
        Object objWPU = eOVar.WPU();
        if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objWPU;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void lNy() {
        PointerEvent pointerEvent = this.lastPointerEvent;
        if (pointerEvent == null) {
            return;
        }
        List changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((PointerInputChange) changes.get(i2)).getPressed()) {
                List changes2 = pointerEvent.getChanges();
                ArrayList arrayList = new ArrayList(changes2.size());
                int size2 = changes2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    PointerInputChange pointerInputChange = (PointerInputChange) changes2.get(i3);
                    arrayList.add(new PointerInputChange(pointerInputChange.getId(), pointerInputChange.getUptimeMillis(), pointerInputChange.getPosition(), false, pointerInputChange.getPressure(), pointerInputChange.getUptimeMillis(), pointerInputChange.getPosition(), pointerInputChange.getPressed(), pointerInputChange.getPressed(), pointerInputChange.getType(), 0L, 1024, (DefaultConstructorMarker) null));
                }
                PointerEvent pointerEvent2 = new PointerEvent(arrayList);
                this.currentEvent = pointerEvent2;
                W1c(pointerEvent2, PointerEventPass.f32078n);
                W1c(pointerEvent2, PointerEventPass.f32080t);
                W1c(pointerEvent2, PointerEventPass.f32077O);
                this.lastPointerEvent = null;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public long getBoundsSize() {
        return this.boundsSize;
    }

    public final void ni(Object key1, Object key2, Object[] keys, PointerInputEventHandler pointerInputEventHandler) {
        boolean z2 = !Intrinsics.areEqual(this.key1, key1);
        this.key1 = key1;
        if (!Intrinsics.areEqual(this.key2, key2)) {
            z2 = true;
        }
        this.key2 = key2;
        Object[] objArr = this.keys;
        if (objArr != null && keys == null) {
            z2 = true;
        }
        if (objArr == null && keys != null) {
            z2 = true;
        }
        if (objArr != null && keys != null && !Arrays.equals(keys, objArr)) {
            z2 = true;
        }
        this.keys = keys;
        if (get_pointerInputEventHandler().getClass() == pointerInputEventHandler.getClass() ? z2 : true) {
            p0N();
        }
        this._pointerInputEventHandler = pointerInputEventHandler;
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public void p0N() {
        xuv xuvVar = this.pointerInputJob;
        if (xuvVar != null) {
            xuvVar.cancel((CancellationException) new PointerInputResetException());
            this.pointerInputJob = null;
        }
    }

    /* JADX INFO: renamed from: pr, reason: from getter */
    public PointerInputEventHandler get_pointerInputEventHandler() {
        return this._pointerInputEventHandler;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void Sax() {
        p0N();
        super.Sax();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void d() {
        p0N();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return DelegatableNodeKt.HI(this).getDensity().getDensity();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public ViewConfiguration getViewConfiguration() {
        return DelegatableNodeKt.HI(this).getViewConfiguration();
    }

    public long hRu() {
        long jM = M(getViewConfiguration().O());
        long boundsSize = getBoundsSize();
        return Size.nr((((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jM >> 32)) - ((int) (boundsSize >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jM & 4294967295L)) - ((int) (boundsSize & 4294967295L))) / 2.0f)) & 4294967295L));
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public void jB() {
        p0N();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: yAc */
    public float getFontScale() {
        return DelegatableNodeKt.HI(this).getDensity().getFontScale();
    }

    public SuspendingPointerInputModifierNodeImpl(Object obj, Object obj2, Object[] objArr, Function2 function2) {
        this(obj, obj2, objArr, new PointerInputEventHandler() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.1
            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                return Unit.INSTANCE;
            }
        });
        this._deprecatedPointerInputHandler = function2;
    }
}
