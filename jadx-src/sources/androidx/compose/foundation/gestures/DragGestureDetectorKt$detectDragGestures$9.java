package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9", f = "DragGestureDetector.kt", i = {0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7}, l = {245, 251, 1061, 1101, 278, 1148, 1190, 1202}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "initialDown", "awaitTouchSlop", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv", "$this$awaitEachGesture", "down", "drag", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv", "$this$drag_u2dVnAYq1g$iv", "orientation$iv", "$this$awaitDragOrUp_u2djO51t88$iv$iv", "pointer$iv$iv"}, s = {"L$0", "L$0", "L$1", "Z$0", "L$0", "L$1", "L$2", "L$4", "L$5", "F$0", "L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "F$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$4", "L$5", "F$0", "L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "F$0", "L$0", "L$2", "L$3", "L$4"})
@SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9\n+ 2 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1045:1\n787#2,17:1046\n804#2,4:1072\n808#2,9:1083\n817#2,11:1093\n794#2,10:1140\n804#2,4:1159\n808#2,9:1172\n817#2,11:1182\n702#2,7:1193\n746#2,4:1200\n750#2,2:1213\n752#2,7:1222\n709#2,6:1229\n715#2:1238\n710#2,8:1241\n759#2:1249\n718#2:1250\n707#2:1251\n720#2,10:1252\n117#3,2:1063\n34#3,6:1065\n119#3:1071\n34#3,6:1076\n119#3:1082\n102#3,2:1104\n34#3,6:1106\n104#3:1112\n102#3,2:1113\n34#3,6:1115\n104#3:1121\n102#3,2:1122\n34#3,6:1124\n104#3:1130\n102#3,2:1131\n34#3,6:1133\n104#3:1139\n117#3,2:1150\n34#3,6:1152\n119#3:1158\n117#3,2:1163\n34#3,6:1165\n119#3:1171\n117#3,2:1204\n34#3,6:1206\n119#3:1212\n34#3,6:1215\n119#3:1221\n273#4:1092\n273#4:1181\n69#5:1235\n65#5:1239\n70#6:1236\n60#6:1240\n22#7:1237\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9\n*L\n257#1:1046,17\n257#1:1072,4\n257#1:1083,9\n257#1:1093,11\n291#1:1140,10\n291#1:1159,4\n291#1:1172,9\n291#1:1182,11\n308#1:1193,7\n308#1:1200,4\n308#1:1213,2\n308#1:1222,7\n308#1:1229,6\n308#1:1238\n308#1:1241,8\n308#1:1249\n308#1:1250\n308#1:1251\n308#1:1252,10\n257#1:1063,2\n257#1:1065,6\n257#1:1071\n257#1:1076,6\n257#1:1082\n272#1:1104,2\n272#1:1106,6\n272#1:1112\n280#1:1113,2\n280#1:1115,6\n280#1:1121\n280#1:1122,2\n280#1:1124,6\n280#1:1130\n284#1:1131,2\n284#1:1133,6\n284#1:1139\n291#1:1150,2\n291#1:1152,6\n291#1:1158\n291#1:1163,2\n291#1:1165,6\n291#1:1171\n308#1:1204,2\n308#1:1206,6\n308#1:1212\n308#1:1215,6\n308#1:1221\n257#1:1092\n291#1:1181\n308#1:1235\n308#1:1239\n308#1:1236\n308#1:1240\n308#1:1237\n*E\n"})
final class DragGestureDetectorKt$detectDragGestures$9 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object E2;
    Object J2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    final /* synthetic */ Function3 f16734N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f16735O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    float f16736S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    final /* synthetic */ Orientation f16737T;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    final /* synthetic */ Ref.LongRef f16738X;
    final /* synthetic */ Function0 Xw;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    boolean f16739Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function0 f16740e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f16741g;
    final /* synthetic */ Function1 jB;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f16742n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Object f16743o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Object f16744r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f16745t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final /* synthetic */ Function2 f16746v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DragGestureDetectorKt$detectDragGestures$9(Function0 function0, Ref.LongRef longRef, Orientation orientation, Function3 function3, Function2 function2, Function0 function02, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f16740e = function0;
        this.f16738X = longRef;
        this.f16737T = orientation;
        this.f16734N = function3;
        this.f16746v = function2;
        this.Xw = function02;
        this.jB = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DragGestureDetectorKt$detectDragGestures$9 dragGestureDetectorKt$detectDragGestures$9 = new DragGestureDetectorKt$detectDragGestures$9(this.f16740e, this.f16738X, this.f16737T, this.f16734N, this.f16746v, this.Xw, this.jB, continuation);
        dragGestureDetectorKt$detectDragGestures$9.E2 = obj;
        return dragGestureDetectorKt$detectDragGestures$9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x04a0, code lost:
    
        if (androidx.compose.foundation.gestures.DragGestureDetectorKt.XQ(r2.UF(), r0) != false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x04c8, code lost:
    
        if (r9 != r6) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x054f, code lost:
    
        if (r8 == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02f2, code lost:
    
        if (r4 == r6) goto L169;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:182:0x04ff, B:193:0x0528], limit reached: 221 */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03ae A[PHI: r0 r1 r2 r4 r7 r9 r10 r11 r16 r18
      0x03ae: PHI (r0v21 float) = (r0v19 float), (r0v22 float) binds: [B:8:0x0065, B:116:0x03aa] A[DONT_GENERATE, DONT_INLINE]
      0x03ae: PHI (r1v36 androidx.compose.ui.input.pointer.PointerInputChange) = 
      (r1v34 androidx.compose.ui.input.pointer.PointerInputChange)
      (r1v38 androidx.compose.ui.input.pointer.PointerInputChange)
     binds: [B:8:0x0065, B:116:0x03aa] A[DONT_GENERATE, DONT_INLINE]
      0x03ae: PHI (r2v26 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
      (r2v24 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
      (r2v29 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
     binds: [B:8:0x0065, B:116:0x03aa] A[DONT_GENERATE, DONT_INLINE]
      0x03ae: PHI (r4v19 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
      (r4v17 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
      (r4v20 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
     binds: [B:8:0x0065, B:116:0x03aa] A[DONT_GENERATE, DONT_INLINE]
      0x03ae: PHI (r7v30 androidx.compose.foundation.gestures.TouchSlopDetector) = 
      (r7v28 androidx.compose.foundation.gestures.TouchSlopDetector)
      (r7v32 androidx.compose.foundation.gestures.TouchSlopDetector)
     binds: [B:8:0x0065, B:116:0x03aa] A[DONT_GENERATE, DONT_INLINE]
      0x03ae: PHI (r9v13 java.lang.Object) = (r9v12 java.lang.Object), (r9v21 java.lang.Object) binds: [B:8:0x0065, B:116:0x03aa] A[DONT_GENERATE, DONT_INLINE]
      0x03ae: PHI (r10v7 kotlin.jvm.internal.Ref$LongRef) = (r10v5 kotlin.jvm.internal.Ref$LongRef), (r10v8 kotlin.jvm.internal.Ref$LongRef) binds: [B:8:0x0065, B:116:0x03aa] A[DONT_GENERATE, DONT_INLINE]
      0x03ae: PHI (r11v20 kotlin.jvm.internal.Ref$LongRef) = (r11v18 kotlin.jvm.internal.Ref$LongRef), (r11v21 kotlin.jvm.internal.Ref$LongRef) binds: [B:8:0x0065, B:116:0x03aa] A[DONT_GENERATE, DONT_INLINE]
      0x03ae: PHI (r16v16 long) = (r16v14 long), (r16v17 long) binds: [B:8:0x0065, B:116:0x03aa] A[DONT_GENERATE, DONT_INLINE]
      0x03ae: PHI (r18v12 long) = (r18v10 long), (r18v13 long) binds: [B:8:0x0065, B:116:0x03aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0212 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01e6 A[PHI: r0 r1 r2 r4 r5 r7 r8 r9 r11 r16 r18
      0x01e6: PHI (r0v10 float) = (r0v9 float), (r0v11 float) binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
      0x01e6: PHI (r1v18 androidx.compose.ui.input.pointer.PointerInputChange) = 
      (r1v17 androidx.compose.ui.input.pointer.PointerInputChange)
      (r1v20 androidx.compose.ui.input.pointer.PointerInputChange)
     binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
      0x01e6: PHI (r2v8 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
      (r2v7 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
      (r2v11 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
     binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
      0x01e6: PHI (r4v5 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
      (r4v4 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
      (r4v6 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
     binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
      0x01e6: PHI (r5v5 androidx.compose.foundation.gestures.TouchSlopDetector) = 
      (r5v4 androidx.compose.foundation.gestures.TouchSlopDetector)
      (r5v6 androidx.compose.foundation.gestures.TouchSlopDetector)
     binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
      0x01e6: PHI (r7v7 java.lang.Object) = (r7v6 java.lang.Object), (r7v17 java.lang.Object) binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
      0x01e6: PHI (r8v4 kotlin.jvm.internal.Ref$LongRef) = (r8v3 kotlin.jvm.internal.Ref$LongRef), (r8v6 kotlin.jvm.internal.Ref$LongRef) binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
      0x01e6: PHI (r9v2 kotlin.jvm.internal.Ref$LongRef) = (r9v1 kotlin.jvm.internal.Ref$LongRef), (r9v3 kotlin.jvm.internal.Ref$LongRef) binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
      0x01e6: PHI (r11v1 int) = (r11v0 int), (r11v14 int) binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
      0x01e6: PHI (r16v6 long) = (r16v5 long), (r16v7 long) binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
      0x01e6: PHI (r18v2 long) = (r18v1 long), (r18v3 long) binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02cd  */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v10, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v9, types: [androidx.compose.ui.input.pointer.PointerEventPass, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20, types: [androidx.compose.ui.input.pointer.PointerInputChange] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v40, types: [androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:0x0377 -> B:113:0x0379). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x03e2 -> B:113:0x0379). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:148:0x0434 -> B:81:0x02b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:150:0x043b -> B:115:0x0392). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:154:0x045b -> B:155:0x045d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x046d -> B:81:0x02b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:168:0x04c8 -> B:170:0x04cb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x01b2 -> B:74:0x029e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x021a -> B:43:0x021b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0269 -> B:74:0x029e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0291 -> B:71:0x0294). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x0324 -> B:89:0x02da). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j2;
        AwaitPointerEventScope awaitPointerEventScope;
        Object objO;
        boolean zBooleanValue;
        Object objJ2;
        AwaitPointerEventScope awaitPointerEventScope2;
        boolean z2;
        ?? r7;
        PointerInputChange pointerInputChange;
        long j3;
        float fS;
        Ref.LongRef longRef;
        AwaitPointerEventScope awaitPointerEventScope3;
        Ref.LongRef longRef2;
        TouchSlopDetector touchSlopDetector;
        Object objPJg;
        int size;
        int i2;
        Object obj2;
        PointerInputChange pointerInputChange2;
        Ref.LongRef longRef3;
        PointerInputChange pointerInputChange3;
        PointerInputChange pointerInputChange4;
        Object obj3;
        int i3;
        long id;
        Object objHBN;
        float fS2;
        TouchSlopDetector touchSlopDetector2;
        Object objPJg2;
        Ref.LongRef longRef4;
        Ref.LongRef longRef5;
        AwaitPointerEventScope awaitPointerEventScope4;
        PointerEventPass pointerEventPass;
        PointerEvent pointerEvent;
        int size2;
        int i5;
        PointerEvent pointerEvent2;
        Object obj4;
        PointerInputChange pointerInputChange5;
        PointerInputChange pointerInputChange6;
        PointerInputChange pointerInputChange7;
        Object obj5;
        int i7;
        ?? r02;
        long id2;
        Function2 function2;
        Orientation orientation;
        int size3;
        int i8;
        PointerInputChange pointerInputChange8;
        Object obj6;
        Object obj7;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = 0;
        int i10 = 1;
        ?? r13 = 0;
        switch (this.f16741g) {
            case 0:
                j2 = 9205357640488583168L;
                ResultKt.throwOnFailure(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.E2;
                PointerEventPass pointerEventPass2 = PointerEventPass.f32078n;
                this.E2 = awaitPointerEventScope;
                this.f16741g = 1;
                objO = TapGestureDetectorKt.O(awaitPointerEventScope, false, pointerEventPass2, this);
                if (objO != coroutine_suspended) {
                    PointerInputChange pointerInputChange9 = (PointerInputChange) objO;
                    zBooleanValue = ((Boolean) this.f16740e.invoke()).booleanValue();
                    if (!zBooleanValue) {
                        pointerInputChange9.n();
                    }
                    this.E2 = awaitPointerEventScope;
                    this.f16742n = pointerInputChange9;
                    this.f16739Z = zBooleanValue;
                    this.f16741g = 2;
                    objJ2 = TapGestureDetectorKt.J2(awaitPointerEventScope, false, null, this, 2, null);
                    if (objJ2 != coroutine_suspended) {
                        awaitPointerEventScope2 = awaitPointerEventScope;
                        z2 = zBooleanValue;
                        r7 = pointerInputChange9;
                        pointerInputChange = (PointerInputChange) objJ2;
                        this.f16738X.element = Offset.INSTANCE.t();
                        if (!z2) {
                            j3 = 9223372034707292159L;
                            if (ComposeFoundationFlags.DragGesturePickUpEnabled && r7 == 0) {
                                List changes = awaitPointerEventScope2.UF().getChanges();
                                size3 = changes.size();
                                for (i8 = 0; i8 < size3; i8++) {
                                    if (((PointerInputChange) changes.get(i8)).getPressed()) {
                                        r02 = r7;
                                        PointerEventPass pointerEventPass3 = PointerEventPass.f32077O;
                                        this.E2 = awaitPointerEventScope2;
                                        this.f16742n = pointerInputChange;
                                        this.f16745t = r02;
                                        this.f16735O = null;
                                        this.J2 = null;
                                        this.f16744r = null;
                                        this.f16743o = null;
                                        this.f16741g = 5;
                                        objHBN = awaitPointerEventScope2.HBN(pointerEventPass3, this);
                                        r02 = r02;
                                    }
                                    break;
                                }
                            }
                            if (r7 != 0) {
                                this.f16734N.invoke(pointerInputChange, r7, Offset.nr(this.f16738X.element));
                                this.f16746v.invoke(r7, Offset.nr(this.f16738X.element));
                                id2 = r7.getId();
                                function2 = this.f16746v;
                                orientation = this.f16737T;
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                        id = pointerInputChange.getId();
                        int type = pointerInputChange.getType();
                        Orientation orientation2 = this.f16737T;
                        longRef = this.f16738X;
                        long jT2 = Offset.INSTANCE.t();
                        j3 = 9223372034707292159L;
                        if (!DragGestureDetectorKt.XQ(awaitPointerEventScope2.UF(), id)) {
                            r7 = r13;
                            if (r7 != 0 && !r7.ck()) {
                                i9 = 0;
                                i10 = 1;
                                r13 = 0;
                                id = pointerInputChange.getId();
                                int type2 = pointerInputChange.getType();
                                Orientation orientation22 = this.f16737T;
                                longRef = this.f16738X;
                                long jT22 = Offset.INSTANCE.t();
                                j3 = 9223372034707292159L;
                                if (!DragGestureDetectorKt.XQ(awaitPointerEventScope2.UF(), id)) {
                                    fS = DragGestureDetectorKt.S(awaitPointerEventScope2.getViewConfiguration(), type2);
                                    longRef2 = new Ref.LongRef();
                                    longRef2.element = id;
                                    touchSlopDetector = new TouchSlopDetector(orientation22, jT22, r13);
                                    awaitPointerEventScope3 = awaitPointerEventScope2;
                                    this.E2 = awaitPointerEventScope3;
                                    this.f16742n = pointerInputChange;
                                    this.f16745t = awaitPointerEventScope2;
                                    this.f16735O = longRef;
                                    this.J2 = longRef2;
                                    this.f16744r = touchSlopDetector;
                                    this.f16743o = r13;
                                    this.f16736S = fS;
                                    this.f16741g = 3;
                                    objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope2, r13, this, i10, r13);
                                    if (objPJg != coroutine_suspended) {
                                        PointerEvent pointerEvent3 = (PointerEvent) objPJg;
                                        List changes2 = pointerEvent3.getChanges();
                                        size = changes2.size();
                                        i2 = i9;
                                        while (true) {
                                            if (i2 >= size) {
                                                obj2 = changes2.get(i2);
                                                i3 = size;
                                                if (!PointerId.t(((PointerInputChange) obj2).getId(), longRef2.element)) {
                                                    i2++;
                                                    size = i3;
                                                }
                                            } else {
                                                obj2 = null;
                                            }
                                        }
                                        pointerInputChange2 = (PointerInputChange) obj2;
                                        if (pointerInputChange2 != null && !pointerInputChange2.ck()) {
                                            if (PointerEventKt.nr(pointerInputChange2)) {
                                                long jN = touchSlopDetector.n(pointerInputChange2, fS);
                                                if ((jN & j3) != j2) {
                                                    pointerInputChange2.n();
                                                    longRef.element = jN;
                                                    if (pointerInputChange2.ck()) {
                                                        awaitPointerEventScope2 = awaitPointerEventScope3;
                                                        r7 = pointerInputChange2;
                                                        if (r7 != 0) {
                                                            i9 = 0;
                                                            i10 = 1;
                                                            r13 = 0;
                                                            id = pointerInputChange.getId();
                                                            int type22 = pointerInputChange.getType();
                                                            Orientation orientation222 = this.f16737T;
                                                            longRef = this.f16738X;
                                                            long jT222 = Offset.INSTANCE.t();
                                                            j3 = 9223372034707292159L;
                                                            if (!DragGestureDetectorKt.XQ(awaitPointerEventScope2.UF(), id)) {
                                                            }
                                                        }
                                                    } else {
                                                        touchSlopDetector.O();
                                                        i9 = 0;
                                                        i10 = 1;
                                                        r13 = 0;
                                                    }
                                                } else {
                                                    PointerEventPass pointerEventPass4 = PointerEventPass.f32077O;
                                                    this.E2 = awaitPointerEventScope3;
                                                    this.f16742n = pointerInputChange;
                                                    this.f16745t = awaitPointerEventScope2;
                                                    this.f16735O = longRef;
                                                    this.J2 = longRef2;
                                                    this.f16744r = touchSlopDetector;
                                                    this.f16743o = pointerInputChange2;
                                                    this.f16736S = fS;
                                                    this.f16741g = 4;
                                                    if (awaitPointerEventScope2.HBN(pointerEventPass4, this) != coroutine_suspended) {
                                                        longRef3 = longRef;
                                                        pointerInputChange3 = pointerInputChange;
                                                        pointerInputChange4 = pointerInputChange2;
                                                        if (pointerInputChange4.ck()) {
                                                            pointerInputChange = pointerInputChange3;
                                                            i9 = 0;
                                                            i10 = 1;
                                                            r13 = 0;
                                                            longRef = longRef3;
                                                        } else {
                                                            awaitPointerEventScope2 = awaitPointerEventScope3;
                                                            pointerInputChange = pointerInputChange3;
                                                            r7 = 0;
                                                            if (r7 != 0) {
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                List changes3 = pointerEvent3.getChanges();
                                                int size4 = changes3.size();
                                                int i11 = 0;
                                                while (true) {
                                                    if (i11 < size4) {
                                                        obj3 = changes3.get(i11);
                                                        if (!((PointerInputChange) obj3).getPressed()) {
                                                            i11++;
                                                        }
                                                    } else {
                                                        obj3 = null;
                                                    }
                                                }
                                                PointerInputChange pointerInputChange10 = (PointerInputChange) obj3;
                                                if (pointerInputChange10 != null) {
                                                    longRef2.element = pointerInputChange10.getId();
                                                    i9 = 0;
                                                    i10 = 1;
                                                    r13 = 0;
                                                }
                                            }
                                            this.E2 = awaitPointerEventScope3;
                                            this.f16742n = pointerInputChange;
                                            this.f16745t = awaitPointerEventScope2;
                                            this.f16735O = longRef;
                                            this.J2 = longRef2;
                                            this.f16744r = touchSlopDetector;
                                            this.f16743o = r13;
                                            this.f16736S = fS;
                                            this.f16741g = 3;
                                            objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope2, r13, this, i10, r13);
                                            if (objPJg != coroutine_suspended) {
                                            }
                                        }
                                        awaitPointerEventScope2 = awaitPointerEventScope3;
                                        r7 = 0;
                                        if (r7 != 0) {
                                        }
                                    }
                                }
                            }
                            if (ComposeFoundationFlags.DragGesturePickUpEnabled) {
                                List changes4 = awaitPointerEventScope2.UF().getChanges();
                                size3 = changes4.size();
                                while (i8 < size3) {
                                }
                            }
                            if (r7 != 0) {
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }
                return coroutine_suspended;
            case 1:
                j2 = 9205357640488583168L;
                awaitPointerEventScope = (AwaitPointerEventScope) this.E2;
                ResultKt.throwOnFailure(obj);
                objO = obj;
                PointerInputChange pointerInputChange92 = (PointerInputChange) objO;
                zBooleanValue = ((Boolean) this.f16740e.invoke()).booleanValue();
                if (!zBooleanValue) {
                }
                this.E2 = awaitPointerEventScope;
                this.f16742n = pointerInputChange92;
                this.f16739Z = zBooleanValue;
                this.f16741g = 2;
                objJ2 = TapGestureDetectorKt.J2(awaitPointerEventScope, false, null, this, 2, null);
                if (objJ2 != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 2:
                j2 = 9205357640488583168L;
                z2 = this.f16739Z;
                PointerInputChange pointerInputChange11 = (PointerInputChange) this.f16742n;
                awaitPointerEventScope2 = (AwaitPointerEventScope) this.E2;
                ResultKt.throwOnFailure(obj);
                r7 = pointerInputChange11;
                objJ2 = obj;
                pointerInputChange = (PointerInputChange) objJ2;
                this.f16738X.element = Offset.INSTANCE.t();
                if (!z2) {
                }
                id = pointerInputChange.getId();
                int type222 = pointerInputChange.getType();
                Orientation orientation2222 = this.f16737T;
                longRef = this.f16738X;
                long jT2222 = Offset.INSTANCE.t();
                j3 = 9223372034707292159L;
                if (!DragGestureDetectorKt.XQ(awaitPointerEventScope2.UF(), id)) {
                }
                break;
            case 3:
                j2 = 9205357640488583168L;
                fS = this.f16736S;
                TouchSlopDetector touchSlopDetector3 = (TouchSlopDetector) this.f16744r;
                Ref.LongRef longRef6 = (Ref.LongRef) this.J2;
                Ref.LongRef longRef7 = (Ref.LongRef) this.f16735O;
                AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) this.f16745t;
                PointerInputChange pointerInputChange12 = (PointerInputChange) this.f16742n;
                AwaitPointerEventScope awaitPointerEventScope6 = (AwaitPointerEventScope) this.E2;
                ResultKt.throwOnFailure(obj);
                longRef = longRef7;
                awaitPointerEventScope3 = awaitPointerEventScope6;
                longRef2 = longRef6;
                awaitPointerEventScope2 = awaitPointerEventScope5;
                j3 = 9223372034707292159L;
                touchSlopDetector = touchSlopDetector3;
                pointerInputChange = pointerInputChange12;
                objPJg = obj;
                PointerEvent pointerEvent32 = (PointerEvent) objPJg;
                List changes22 = pointerEvent32.getChanges();
                size = changes22.size();
                i2 = i9;
                while (true) {
                    if (i2 >= size) {
                    }
                    i2++;
                    size = i3;
                }
                pointerInputChange2 = (PointerInputChange) obj2;
                if (pointerInputChange2 != null) {
                    if (PointerEventKt.nr(pointerInputChange2)) {
                    }
                    this.E2 = awaitPointerEventScope3;
                    this.f16742n = pointerInputChange;
                    this.f16745t = awaitPointerEventScope2;
                    this.f16735O = longRef;
                    this.J2 = longRef2;
                    this.f16744r = touchSlopDetector;
                    this.f16743o = r13;
                    this.f16736S = fS;
                    this.f16741g = 3;
                    objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope2, r13, this, i10, r13);
                    if (objPJg != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                awaitPointerEventScope2 = awaitPointerEventScope3;
                r7 = 0;
                if (r7 != 0) {
                }
                if (ComposeFoundationFlags.DragGesturePickUpEnabled) {
                }
                if (r7 != 0) {
                }
                return Unit.INSTANCE;
            case 4:
                j2 = 9205357640488583168L;
                fS = this.f16736S;
                pointerInputChange4 = (PointerInputChange) this.f16743o;
                TouchSlopDetector touchSlopDetector4 = (TouchSlopDetector) this.f16744r;
                Ref.LongRef longRef8 = (Ref.LongRef) this.J2;
                Ref.LongRef longRef9 = (Ref.LongRef) this.f16735O;
                AwaitPointerEventScope awaitPointerEventScope7 = (AwaitPointerEventScope) this.f16745t;
                pointerInputChange3 = (PointerInputChange) this.f16742n;
                AwaitPointerEventScope awaitPointerEventScope8 = (AwaitPointerEventScope) this.E2;
                ResultKt.throwOnFailure(obj);
                touchSlopDetector = touchSlopDetector4;
                awaitPointerEventScope2 = awaitPointerEventScope7;
                longRef3 = longRef9;
                longRef2 = longRef8;
                awaitPointerEventScope3 = awaitPointerEventScope8;
                j3 = 9223372034707292159L;
                if (pointerInputChange4.ck()) {
                }
                break;
            case 5:
                j2 = 9205357640488583168L;
                PointerInputChange pointerInputChange13 = (PointerInputChange) this.f16745t;
                pointerInputChange = (PointerInputChange) this.f16742n;
                awaitPointerEventScope2 = (AwaitPointerEventScope) this.E2;
                ResultKt.throwOnFailure(obj);
                objHBN = obj;
                j3 = 9223372034707292159L;
                r02 = pointerInputChange13;
                PointerEvent pointerEvent4 = (PointerEvent) objHBN;
                List changes5 = pointerEvent4.getChanges();
                int size5 = changes5.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size5) {
                        if (((PointerInputChange) changes5.get(i12)).ck()) {
                            List changes6 = pointerEvent4.getChanges();
                            int size6 = changes6.size();
                            for (int i13 = 0; i13 < size6; i13++) {
                                if (((PointerInputChange) changes6.get(i13)).getPressed()) {
                                }
                            }
                        } else {
                            i12++;
                        }
                        break;
                    }
                }
                List changes7 = pointerEvent4.getChanges();
                int size7 = changes7.size();
                for (int i14 = 0; i14 < size7; i14++) {
                    if (((PointerInputChange) changes7.get(i14)).getPressed()) {
                        PointerInputChange pointerInputChange14 = (PointerInputChange) CollectionsKt.firstOrNull(pointerEvent4.getChanges());
                        long jCk = Offset.ck(pointerInputChange14 != null ? pointerInputChange14.getPosition() : Offset.INSTANCE.t(), pointerInputChange.getPosition());
                        long id3 = pointerInputChange.getId();
                        int type3 = pointerInputChange.getType();
                        Orientation orientation3 = this.f16737T;
                        longRef5 = this.f16738X;
                        if (!DragGestureDetectorKt.XQ(awaitPointerEventScope2.UF(), id3)) {
                            fS2 = DragGestureDetectorKt.S(awaitPointerEventScope2.getViewConfiguration(), type3);
                            longRef4 = new Ref.LongRef();
                            longRef4.element = id3;
                            pointerEventPass = null;
                            touchSlopDetector2 = new TouchSlopDetector(orientation3, jCk, null);
                            awaitPointerEventScope4 = awaitPointerEventScope2;
                            this.E2 = awaitPointerEventScope4;
                            this.f16742n = pointerInputChange;
                            this.f16745t = awaitPointerEventScope2;
                            this.f16735O = longRef5;
                            this.J2 = longRef4;
                            this.f16744r = touchSlopDetector2;
                            this.f16743o = pointerEventPass;
                            this.f16736S = fS2;
                            this.f16741g = 6;
                            objPJg2 = AwaitPointerEventScope.pJg(awaitPointerEventScope2, pointerEventPass, this, 1, pointerEventPass);
                            if (objPJg2 != coroutine_suspended) {
                                pointerEvent = (PointerEvent) objPJg2;
                                List changes8 = pointerEvent.getChanges();
                                size2 = changes8.size();
                                i5 = 0;
                                while (true) {
                                    if (i5 >= size2) {
                                        Object obj8 = changes8.get(i5);
                                        i7 = size2;
                                        pointerEvent2 = pointerEvent;
                                        if (PointerId.t(((PointerInputChange) obj8).getId(), longRef4.element)) {
                                            obj4 = obj8;
                                        } else {
                                            i5++;
                                            pointerEvent = pointerEvent2;
                                            size2 = i7;
                                        }
                                    } else {
                                        pointerEvent2 = pointerEvent;
                                        obj4 = null;
                                    }
                                }
                                pointerInputChange5 = (PointerInputChange) obj4;
                                if (pointerInputChange5 != null && !pointerInputChange5.ck()) {
                                    if (PointerEventKt.nr(pointerInputChange5)) {
                                        List changes9 = pointerEvent2.getChanges();
                                        int size8 = changes9.size();
                                        int i15 = 0;
                                        while (true) {
                                            if (i15 < size8) {
                                                Object obj9 = changes9.get(i15);
                                                if (((PointerInputChange) obj9).getPressed()) {
                                                    obj5 = obj9;
                                                } else {
                                                    i15++;
                                                }
                                            } else {
                                                obj5 = null;
                                            }
                                        }
                                        PointerInputChange pointerInputChange15 = (PointerInputChange) obj5;
                                        if (pointerInputChange15 != null) {
                                            longRef4.element = pointerInputChange15.getId();
                                        }
                                    } else if ((touchSlopDetector2.n(pointerInputChange5, fS2) & j3) != j2) {
                                        pointerInputChange5.n();
                                        longRef5.element = PointerEventKt.Uo(pointerInputChange5);
                                        if (pointerInputChange5.ck()) {
                                            awaitPointerEventScope2 = awaitPointerEventScope4;
                                            r7 = pointerInputChange5;
                                            if (ComposeFoundationFlags.DragGesturePickUpEnabled) {
                                            }
                                            if (r7 != 0) {
                                            }
                                            return Unit.INSTANCE;
                                        }
                                        touchSlopDetector2.O();
                                    } else {
                                        PointerEventPass pointerEventPass5 = PointerEventPass.f32077O;
                                        this.E2 = awaitPointerEventScope4;
                                        this.f16742n = pointerInputChange;
                                        this.f16745t = awaitPointerEventScope2;
                                        this.f16735O = longRef5;
                                        this.J2 = longRef4;
                                        this.f16744r = touchSlopDetector2;
                                        this.f16743o = pointerInputChange5;
                                        this.f16736S = fS2;
                                        this.f16741g = 7;
                                        if (awaitPointerEventScope2.HBN(pointerEventPass5, this) != coroutine_suspended) {
                                            pointerInputChange6 = pointerInputChange;
                                            pointerInputChange7 = pointerInputChange5;
                                            if (pointerInputChange7.ck()) {
                                                pointerInputChange = pointerInputChange6;
                                            } else {
                                                awaitPointerEventScope2 = awaitPointerEventScope4;
                                                pointerInputChange = pointerInputChange6;
                                            }
                                        }
                                    }
                                    pointerEventPass = null;
                                    this.E2 = awaitPointerEventScope4;
                                    this.f16742n = pointerInputChange;
                                    this.f16745t = awaitPointerEventScope2;
                                    this.f16735O = longRef5;
                                    this.J2 = longRef4;
                                    this.f16744r = touchSlopDetector2;
                                    this.f16743o = pointerEventPass;
                                    this.f16736S = fS2;
                                    this.f16741g = 6;
                                    objPJg2 = AwaitPointerEventScope.pJg(awaitPointerEventScope2, pointerEventPass, this, 1, pointerEventPass);
                                    if (objPJg2 != coroutine_suspended) {
                                    }
                                }
                                awaitPointerEventScope2 = awaitPointerEventScope4;
                            }
                            return coroutine_suspended;
                        }
                        r7 = 0;
                        if (ComposeFoundationFlags.DragGesturePickUpEnabled) {
                        }
                        if (r7 != 0) {
                        }
                        return Unit.INSTANCE;
                    }
                }
                r7 = r02;
                if (ComposeFoundationFlags.DragGesturePickUpEnabled) {
                }
                if (r7 != 0) {
                }
                return Unit.INSTANCE;
            case 6:
                j2 = 9205357640488583168L;
                fS2 = this.f16736S;
                TouchSlopDetector touchSlopDetector5 = (TouchSlopDetector) this.f16744r;
                Ref.LongRef longRef10 = (Ref.LongRef) this.J2;
                Ref.LongRef longRef11 = (Ref.LongRef) this.f16735O;
                AwaitPointerEventScope awaitPointerEventScope9 = (AwaitPointerEventScope) this.f16745t;
                PointerInputChange pointerInputChange16 = (PointerInputChange) this.f16742n;
                AwaitPointerEventScope awaitPointerEventScope10 = (AwaitPointerEventScope) this.E2;
                ResultKt.throwOnFailure(obj);
                touchSlopDetector2 = touchSlopDetector5;
                pointerInputChange = pointerInputChange16;
                objPJg2 = obj;
                longRef4 = longRef10;
                longRef5 = longRef11;
                awaitPointerEventScope2 = awaitPointerEventScope9;
                awaitPointerEventScope4 = awaitPointerEventScope10;
                j3 = 9223372034707292159L;
                pointerEvent = (PointerEvent) objPJg2;
                List changes82 = pointerEvent.getChanges();
                size2 = changes82.size();
                i5 = 0;
                while (true) {
                    if (i5 >= size2) {
                    }
                    i5++;
                    pointerEvent = pointerEvent2;
                    size2 = i7;
                }
                pointerInputChange5 = (PointerInputChange) obj4;
                if (pointerInputChange5 != null) {
                    if (PointerEventKt.nr(pointerInputChange5)) {
                    }
                    pointerEventPass = null;
                    this.E2 = awaitPointerEventScope4;
                    this.f16742n = pointerInputChange;
                    this.f16745t = awaitPointerEventScope2;
                    this.f16735O = longRef5;
                    this.J2 = longRef4;
                    this.f16744r = touchSlopDetector2;
                    this.f16743o = pointerEventPass;
                    this.f16736S = fS2;
                    this.f16741g = 6;
                    objPJg2 = AwaitPointerEventScope.pJg(awaitPointerEventScope2, pointerEventPass, this, 1, pointerEventPass);
                    if (objPJg2 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                awaitPointerEventScope2 = awaitPointerEventScope4;
                r7 = 0;
                if (ComposeFoundationFlags.DragGesturePickUpEnabled) {
                }
                if (r7 != 0) {
                }
                return Unit.INSTANCE;
            case 7:
                fS2 = this.f16736S;
                pointerInputChange7 = (PointerInputChange) this.f16743o;
                TouchSlopDetector touchSlopDetector6 = (TouchSlopDetector) this.f16744r;
                Ref.LongRef longRef12 = (Ref.LongRef) this.J2;
                Ref.LongRef longRef13 = (Ref.LongRef) this.f16735O;
                AwaitPointerEventScope awaitPointerEventScope11 = (AwaitPointerEventScope) this.f16745t;
                pointerInputChange6 = (PointerInputChange) this.f16742n;
                j2 = 9205357640488583168L;
                AwaitPointerEventScope awaitPointerEventScope12 = (AwaitPointerEventScope) this.E2;
                ResultKt.throwOnFailure(obj);
                longRef4 = longRef12;
                longRef5 = longRef13;
                awaitPointerEventScope4 = awaitPointerEventScope12;
                j3 = 9223372034707292159L;
                touchSlopDetector2 = touchSlopDetector6;
                awaitPointerEventScope2 = awaitPointerEventScope11;
                if (pointerInputChange7.ck()) {
                }
                break;
            case 8:
                Ref.LongRef longRef14 = (Ref.LongRef) this.J2;
                AwaitPointerEventScope awaitPointerEventScope13 = (AwaitPointerEventScope) this.f16735O;
                Orientation orientation4 = (Orientation) this.f16745t;
                function2 = (Function2) this.f16742n;
                AwaitPointerEventScope awaitPointerEventScope14 = (AwaitPointerEventScope) this.E2;
                ResultKt.throwOnFailure(obj);
                Object objPJg3 = obj;
                PointerEvent pointerEvent5 = (PointerEvent) objPJg3;
                List changes10 = pointerEvent5.getChanges();
                int size9 = changes10.size();
                int i16 = 0;
                while (true) {
                    if (i16 < size9) {
                        obj6 = changes10.get(i16);
                        if (!PointerId.t(((PointerInputChange) obj6).getId(), longRef14.element)) {
                            i16++;
                        }
                    } else {
                        obj6 = null;
                    }
                }
                PointerInputChange pointerInputChange17 = (PointerInputChange) obj6;
                if (pointerInputChange17 != null) {
                    if (PointerEventKt.nr(pointerInputChange17)) {
                        List changes11 = pointerEvent5.getChanges();
                        int size10 = changes11.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size10) {
                                obj7 = changes11.get(i17);
                                if (!((PointerInputChange) obj7).getPressed()) {
                                    i17++;
                                }
                            } else {
                                obj7 = null;
                            }
                        }
                        PointerInputChange pointerInputChange18 = (PointerInputChange) obj7;
                        if (pointerInputChange18 != null) {
                            longRef14.element = pointerInputChange18.getId();
                            this.E2 = awaitPointerEventScope14;
                            this.f16742n = function2;
                            this.f16745t = orientation4;
                            this.f16735O = awaitPointerEventScope13;
                            this.J2 = longRef14;
                            this.f16744r = null;
                            this.f16743o = null;
                            this.f16741g = 8;
                            objPJg3 = AwaitPointerEventScope.pJg(awaitPointerEventScope13, null, this, 1, null);
                        }
                    } else {
                        long jKN = PointerEventKt.KN(pointerInputChange17);
                    }
                    break;
                } else {
                    pointerInputChange17 = null;
                }
                if (pointerInputChange17 != null && !pointerInputChange17.ck()) {
                    if (!PointerEventKt.nr(pointerInputChange17)) {
                        function2.invoke(pointerInputChange17, Offset.nr(PointerEventKt.Uo(pointerInputChange17)));
                        pointerInputChange17.n();
                        id2 = pointerInputChange17.getId();
                        AwaitPointerEventScope awaitPointerEventScope15 = awaitPointerEventScope14;
                        orientation = orientation4;
                        awaitPointerEventScope2 = awaitPointerEventScope15;
                        Ref.LongRef longRef15 = new Ref.LongRef();
                        longRef15.element = id2;
                        awaitPointerEventScope13 = awaitPointerEventScope2;
                        longRef14 = longRef15;
                        orientation4 = orientation;
                        awaitPointerEventScope14 = awaitPointerEventScope13;
                        this.E2 = awaitPointerEventScope14;
                        this.f16742n = function2;
                        this.f16745t = orientation4;
                        this.f16735O = awaitPointerEventScope13;
                        this.J2 = longRef14;
                        this.f16744r = null;
                        this.f16743o = null;
                        this.f16741g = 8;
                        objPJg3 = AwaitPointerEventScope.pJg(awaitPointerEventScope13, null, this, 1, null);
                    } else {
                        pointerInputChange8 = pointerInputChange17;
                    }
                    break;
                } else {
                    pointerInputChange8 = null;
                }
                if (pointerInputChange8 == null) {
                    this.Xw.invoke();
                } else {
                    this.jB.invoke(pointerInputChange8);
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
        return ((DragGestureDetectorKt$detectDragGestures$9) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
