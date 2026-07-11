package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aY\u0010\f\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000126\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a!\u0010\u0013\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0082\u0001\u0010\u001b\u001a\u00020\n*\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u000e2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00172\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u001726\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\n0\u0003H\u0086@¢\u0006\u0004\b\u001b\u0010\u001c\u001aâ\u0001\u0010$\u001a\u00020\n*\u00020\u00152K\u0010\u0016\u001aG\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\n0\u001d2!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\n0\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\u00172\b\u0010#\u001a\u0004\u0018\u00010\"26\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\n0\u0003H\u0080@¢\u0006\u0004\b$\u0010%\u001aY\u0010'\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000126\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110&¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b'\u0010\r\u001aa\u0010*\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010)\u001a\u00020(26\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110&¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a3\u0010,\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b,\u0010\u0012\u001a!\u0010-\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b-\u0010\u0014\u001aY\u0010.\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000126\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110&¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b.\u0010\r\u001aa\u00100\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010)\u001a\u00020(26\u0010/\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110&¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b0\u0010+\u001a3\u00101\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0012\u001a!\u00102\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0014\u001a\u0082\u0001\u00104\u001a\u00020\n*\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u000e2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00172\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u001726\u00103\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110&¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\n0\u0003H\u0086@¢\u0006\u0004\b4\u0010\u001c\u001aS\u00107\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u000e2\b\u00105\u001a\u0004\u0018\u00010\"2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000eH\u0080Hø\u0001\u0000¢\u0006\u0004\b7\u00108\u001aW\u0010:\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010)\u001a\u00020(2\b\u00105\u001a\u0004\u0018\u00010\"2\b\b\u0002\u00109\u001a\u00020\b2\u0018\u0010/\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u0003H\u0080Hø\u0001\u0000¢\u0006\u0004\b:\u0010;\u001a&\u0010>\u001a\u00020\u0010*\u00020\u00002\u0006\u00109\u001a\u00020\u00042\b\b\u0002\u0010=\u001a\u00020<H\u0080@¢\u0006\u0004\b>\u0010?\u001a!\u0010@\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b@\u0010\u0014\u001a\u001e\u0010B\u001a\u00020\u0010*\u00020A2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\bB\u0010C\u001a\u001e\u0010E\u001a\u00020&*\u00020D2\u0006\u0010)\u001a\u00020(H\u0000ø\u0001\u0000¢\u0006\u0004\bE\u0010F\"\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010I\"\u0014\u0010K\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010I\"\u0014\u0010L\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010I\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006M"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "change", "Landroidx/compose/ui/geometry/Offset;", "overSlop", "", "onTouchSlopReached", "xMQ", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "onDrag", "", "o", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "t", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onDragStart", "Lkotlin/Function0;", "onDragEnd", "onDragCancel", "dragAmount", "az", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function3;", "down", "slopTriggerChange", "overSlopOffset", "shouldAwaitTouchSlop", "Landroidx/compose/foundation/gestures/Orientation;", "orientationLock", "ty", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "qie", "Landroidx/compose/ui/input/pointer/PointerType;", "pointerType", "gh", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "WPU", "mUb", "J2", "onPointerSlopReached", "O", "Z", "nr", "onHorizontalDrag", "ck", "orientation", "motionConsumed", "r", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function1;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initialPositionChange", "KN", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILandroidx/compose/foundation/gestures/Orientation;JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "rl", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerInputChange;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Uo", "Landroidx/compose/ui/input/pointer/PointerEvent;", "XQ", "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z", "Landroidx/compose/ui/platform/ViewConfiguration;", "S", "(Landroidx/compose/ui/platform/ViewConfiguration;I)F", "Landroidx/compose/ui/unit/Dp;", c.f62177j, "F", "mouseSlop", "defaultTouchSlop", "mouseToTouchSlopRatio", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,1045:1\n787#1,17:1046\n804#1,4:1072\n808#1,9:1083\n817#1,11:1093\n746#1,4:1104\n750#1,2:1117\n752#1,8:1126\n787#1,17:1134\n804#1,4:1160\n808#1,9:1171\n817#1:1181\n818#1,10:1185\n787#1,17:1195\n804#1,4:1221\n808#1,9:1232\n817#1:1242\n818#1,10:1246\n702#1,7:1256\n746#1,4:1263\n750#1,2:1276\n752#1,7:1285\n709#1,6:1292\n715#1:1301\n710#1,8:1304\n759#1:1312\n718#1:1313\n707#1:1314\n720#1,10:1315\n746#1,4:1325\n750#1,2:1338\n752#1,7:1347\n759#1:1357\n787#1,17:1358\n804#1,4:1384\n808#1,9:1395\n817#1:1405\n818#1,10:1409\n787#1,17:1419\n804#1,4:1445\n808#1,9:1456\n817#1:1466\n818#1,10:1470\n702#1,7:1480\n746#1,4:1487\n750#1,2:1500\n752#1,7:1509\n709#1,6:1516\n715#1:1525\n710#1,8:1528\n759#1:1536\n718#1:1537\n707#1:1538\n720#1,10:1539\n746#1,4:1549\n750#1,2:1562\n752#1,7:1571\n759#1:1581\n746#1,4:1582\n750#1,2:1595\n752#1,7:1604\n759#1:1617\n746#1,4:1618\n750#1,2:1631\n752#1,7:1640\n759#1:1653\n117#2,2:1063\n34#2,6:1065\n119#2:1071\n34#2,6:1076\n119#2:1082\n117#2,2:1108\n34#2,6:1110\n119#2:1116\n34#2,6:1119\n119#2:1125\n117#2,2:1151\n34#2,6:1153\n119#2:1159\n34#2,6:1164\n119#2:1170\n117#2,2:1212\n34#2,6:1214\n119#2:1220\n34#2,6:1225\n119#2:1231\n117#2,2:1267\n34#2,6:1269\n119#2:1275\n34#2,6:1278\n119#2:1284\n117#2,2:1329\n34#2,6:1331\n119#2:1337\n34#2,6:1340\n119#2:1346\n117#2,2:1375\n34#2,6:1377\n119#2:1383\n34#2,6:1388\n119#2:1394\n117#2,2:1436\n34#2,6:1438\n119#2:1444\n34#2,6:1449\n119#2:1455\n117#2,2:1491\n34#2,6:1493\n119#2:1499\n34#2,6:1502\n119#2:1508\n117#2,2:1553\n34#2,6:1555\n119#2:1561\n34#2,6:1564\n119#2:1570\n117#2,2:1586\n34#2,6:1588\n119#2:1594\n34#2,6:1597\n119#2:1603\n117#2,2:1622\n34#2,6:1624\n119#2:1630\n34#2,6:1633\n119#2:1639\n117#2,2:1654\n34#2,6:1656\n119#2:1662\n117#2,2:1663\n34#2,6:1665\n119#2:1671\n117#2,2:1672\n34#2,6:1674\n119#2:1680\n117#2,2:1681\n34#2,6:1683\n119#2:1689\n117#2,2:1691\n34#2,6:1693\n119#2:1699\n117#2,2:1700\n34#2,6:1702\n119#2:1708\n117#2,2:1709\n34#2,6:1711\n119#2:1717\n117#2,2:1718\n34#2,6:1720\n119#2:1726\n117#2,2:1727\n34#2,6:1729\n119#2:1735\n117#2,2:1736\n34#2,6:1738\n119#2:1744\n102#2,2:1746\n34#2,6:1748\n104#2:1754\n117#2,2:1755\n34#2,6:1757\n119#2:1763\n117#2,2:1764\n34#2,6:1766\n119#2:1772\n273#3:1092\n273#3:1180\n273#3:1241\n273#3:1404\n273#3:1465\n273#3:1690\n273#3:1745\n69#4:1182\n69#4:1243\n69#4:1298\n65#4:1302\n69#4:1354\n65#4:1406\n65#4:1467\n69#4:1522\n65#4:1526\n65#4:1578\n69#4:1611\n65#4:1614\n69#4:1647\n65#4:1650\n70#5:1183\n70#5:1244\n70#5:1299\n60#5:1303\n70#5:1355\n60#5:1407\n60#5:1468\n70#5:1523\n60#5:1527\n60#5:1579\n70#5:1612\n60#5:1615\n70#5:1648\n60#5:1651\n22#6:1184\n22#6:1245\n22#6:1300\n22#6:1356\n22#6:1408\n22#6:1469\n22#6:1524\n22#6:1580\n22#6:1613\n22#6:1616\n22#6:1649\n22#6:1652\n118#7:1773\n113#7:1774\n63#8:1775\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n*L\n81#1:1046,17\n81#1:1072,4\n81#1:1083,9\n81#1:1093,11\n144#1:1104,4\n144#1:1117,2\n144#1:1126,8\n406#1:1134,17\n406#1:1160,4\n406#1:1171,9\n406#1:1181\n406#1:1185,10\n418#1:1195,17\n418#1:1221,4\n418#1:1232,9\n418#1:1242\n418#1:1246,10\n445#1:1256,7\n445#1:1263,4\n445#1:1276,2\n445#1:1285,7\n445#1:1292,6\n445#1:1301\n445#1:1304,8\n445#1:1312\n445#1:1313\n445#1:1314\n445#1:1315,10\n474#1:1325,4\n474#1:1338,2\n474#1:1347,7\n474#1:1357\n560#1:1358,17\n560#1:1384,4\n560#1:1395,9\n560#1:1405\n560#1:1409,10\n572#1:1419,17\n572#1:1445,4\n572#1:1456,9\n572#1:1466\n572#1:1470,10\n596#1:1480,7\n596#1:1487,4\n596#1:1500,2\n596#1:1509,7\n596#1:1516,6\n596#1:1525\n596#1:1528,8\n596#1:1536\n596#1:1537\n596#1:1538\n596#1:1539,10\n625#1:1549,4\n625#1:1562,2\n625#1:1571,7\n625#1:1581\n708#1:1582,4\n708#1:1595,2\n708#1:1604,7\n708#1:1617\n708#1:1618,4\n708#1:1631,2\n708#1:1640,7\n708#1:1653\n81#1:1063,2\n81#1:1065,6\n81#1:1071\n81#1:1076,6\n81#1:1082\n144#1:1108,2\n144#1:1110,6\n144#1:1116\n144#1:1119,6\n144#1:1125\n406#1:1151,2\n406#1:1153,6\n406#1:1159\n406#1:1164,6\n406#1:1170\n418#1:1212,2\n418#1:1214,6\n418#1:1220\n418#1:1225,6\n418#1:1231\n445#1:1267,2\n445#1:1269,6\n445#1:1275\n445#1:1278,6\n445#1:1284\n474#1:1329,2\n474#1:1331,6\n474#1:1337\n474#1:1340,6\n474#1:1346\n560#1:1375,2\n560#1:1377,6\n560#1:1383\n560#1:1388,6\n560#1:1394\n572#1:1436,2\n572#1:1438,6\n572#1:1444\n572#1:1449,6\n572#1:1455\n596#1:1491,2\n596#1:1493,6\n596#1:1499\n596#1:1502,6\n596#1:1508\n625#1:1553,2\n625#1:1555,6\n625#1:1561\n625#1:1564,6\n625#1:1570\n708#1:1586,2\n708#1:1588,6\n708#1:1594\n708#1:1597,6\n708#1:1603\n708#1:1622,2\n708#1:1624,6\n708#1:1630\n708#1:1633,6\n708#1:1639\n749#1:1654,2\n749#1:1656,6\n749#1:1662\n751#1:1663,2\n751#1:1665,6\n751#1:1671\n803#1:1672,2\n803#1:1674,6\n803#1:1680\n807#1:1681,2\n807#1:1683,6\n807#1:1689\n803#1:1691,2\n803#1:1693,6\n803#1:1699\n807#1:1700,2\n807#1:1702,6\n807#1:1708\n803#1:1709,2\n803#1:1711,6\n803#1:1717\n807#1:1718,2\n807#1:1720,6\n807#1:1726\n852#1:1727,2\n852#1:1729,6\n852#1:1735\n854#1:1736,2\n854#1:1738,6\n854#1:1744\n867#1:1746,2\n867#1:1748,6\n867#1:1754\n960#1:1755,2\n960#1:1757,6\n960#1:1763\n1025#1:1764,2\n1025#1:1766,6\n1025#1:1772\n81#1:1092\n406#1:1180\n418#1:1241\n560#1:1404\n572#1:1465\n816#1:1690\n863#1:1745\n409#1:1182\n421#1:1243\n445#1:1298\n445#1:1302\n474#1:1354\n563#1:1406\n575#1:1467\n596#1:1522\n596#1:1526\n625#1:1578\n714#1:1611\n715#1:1614\n714#1:1647\n715#1:1650\n409#1:1183\n421#1:1244\n445#1:1299\n445#1:1303\n474#1:1355\n563#1:1407\n575#1:1468\n596#1:1523\n596#1:1527\n625#1:1579\n714#1:1612\n715#1:1615\n714#1:1648\n715#1:1651\n409#1:1184\n421#1:1245\n445#1:1300\n474#1:1356\n563#1:1408\n575#1:1469\n596#1:1524\n625#1:1580\n714#1:1613\n715#1:1616\n714#1:1649\n715#1:1652\n1031#1:1773\n1032#1:1774\n1033#1:1775\n*E\n"})
public final class DragGestureDetectorKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f16658n;
    private static final float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f16659t;

    static {
        float fKN = Dp.KN((float) 0.125d);
        f16658n = fKN;
        float fKN2 = Dp.KN(18);
        rl = fKN2;
        f16659t = fKN / fKN2;
    }

    public static /* synthetic */ Object HI(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$2
                public final void n(long j2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    n(offset.getPackedValue());
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i2 & 2) != 0) {
            function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$3
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i2 & 4) != 0) {
            function02 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$4
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        Function0 function03 = function02;
        return az(pointerInputScope, function1, function0, function03, function2, continuation);
    }

    public static /* synthetic */ Object Ik(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$2
                public final void n(long j2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    n(offset.getPackedValue());
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i2 & 2) != 0) {
            function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$3
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i2 & 4) != 0) {
            function02 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$4
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        Function0 function03 = function02;
        return ck(pointerInputScope, function1, function0, function03, function2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x017e -> B:61:0x0184). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object J2(AwaitPointerEventScope awaitPointerEventScope, long j2, Function2 function2, Continuation continuation) {
        DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
        Ref.LongRef longRef;
        Function2 function22;
        DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12;
        float f3;
        TouchSlopDetector touchSlopDetector;
        AwaitPointerEventScope awaitPointerEventScope2;
        DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13;
        float f4;
        TouchSlopDetector touchSlopDetector2;
        int size;
        int i2;
        PointerEventPass pointerEventPass;
        Object obj;
        PointerInputChange pointerInputChange;
        Object obj2;
        int i3;
        Object objPJg;
        if (continuation instanceof DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 = (DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1) continuation;
            int i5 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.f16681S;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.f16681S = i5 - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 = new DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1(continuation);
            }
        }
        Object obj3 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.f16682Z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.f16681S;
        int i8 = 1;
        PointerEventPass pointerEventPass2 = null;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj3);
            int iNr = PointerType.INSTANCE.nr();
            Orientation orientation = Orientation.f16970t;
            long jT2 = Offset.INSTANCE.t();
            if (XQ(awaitPointerEventScope.UF(), j2)) {
                return null;
            }
            float fS = S(awaitPointerEventScope.getViewConfiguration(), iNr);
            longRef = new Ref.LongRef();
            longRef.element = j2;
            TouchSlopDetector touchSlopDetector3 = new TouchSlopDetector(orientation, jT2, null);
            function22 = function2;
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
            f3 = fS;
            touchSlopDetector = touchSlopDetector3;
            awaitPointerEventScope2 = awaitPointerEventScope;
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.f16683n = function22;
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.f16686t = awaitPointerEventScope2;
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.f16680O = longRef;
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.J2 = touchSlopDetector;
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.f16685r = pointerEventPass2;
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.f16684o = f3;
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.f16681S = i8;
            objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i8, pointerEventPass2);
            if (objPJg != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i7 == 1) {
            float f5 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.f16684o;
            TouchSlopDetector touchSlopDetector4 = (TouchSlopDetector) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.J2;
            Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.f16680O;
            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.f16686t;
            Function2 function23 = (Function2) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.f16683n;
            ResultKt.throwOnFailure(obj3);
            longRef = longRef2;
            f4 = f5;
            awaitPointerEventScope2 = awaitPointerEventScope3;
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
            touchSlopDetector2 = touchSlopDetector4;
            function22 = function23;
            PointerEvent pointerEvent = (PointerEvent) obj3;
            List changes = pointerEvent.getChanges();
            size = changes.size();
            i2 = 0;
            while (true) {
                if (i2 < size) {
                }
                i2 = i3 + 1;
                pointerEventPass2 = pointerEventPass;
            }
            pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange != null) {
                return pointerEventPass;
            }
            if (PointerEventKt.nr(pointerInputChange)) {
            }
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.f16683n = function22;
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.f16686t = awaitPointerEventScope2;
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.f16680O = longRef;
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.J2 = touchSlopDetector;
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.f16685r = pointerEventPass2;
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.f16684o = f3;
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.f16681S = i8;
            objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i8, pointerEventPass2);
            if (objPJg != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i7 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        float f6 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.f16684o;
        PointerInputChange pointerInputChange2 = (PointerInputChange) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.f16685r;
        TouchSlopDetector touchSlopDetector5 = (TouchSlopDetector) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.J2;
        Ref.LongRef longRef3 = (Ref.LongRef) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.f16680O;
        AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.f16686t;
        Function2 function24 = (Function2) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.f16683n;
        ResultKt.throwOnFailure(obj3);
        touchSlopDetector = touchSlopDetector5;
        pointerEventPass = null;
        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
        f3 = f6;
        awaitPointerEventScope2 = awaitPointerEventScope4;
        if (!pointerInputChange2.ck()) {
            return pointerEventPass;
        }
        function22 = function24;
        pointerEventPass2 = pointerEventPass;
        i8 = 1;
        longRef = longRef3;
        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.f16683n = function22;
        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.f16686t = awaitPointerEventScope2;
        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.f16680O = longRef;
        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.J2 = touchSlopDetector;
        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.f16685r = pointerEventPass2;
        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.f16684o = f3;
        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.f16681S = i8;
        objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i8, pointerEventPass2);
        if (objPJg != coroutine_suspended) {
            float f7 = f3;
            touchSlopDetector2 = touchSlopDetector;
            obj3 = objPJg;
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12;
            f4 = f7;
            PointerEvent pointerEvent2 = (PointerEvent) obj3;
            List changes2 = pointerEvent2.getChanges();
            size = changes2.size();
            i2 = 0;
            while (true) {
                if (i2 < size) {
                    pointerEventPass = pointerEventPass2;
                    obj = pointerEventPass;
                    break;
                }
                obj = changes2.get(i2);
                pointerEventPass = pointerEventPass2;
                i3 = i2;
                if (PointerId.t(((PointerInputChange) obj).getId(), longRef.element)) {
                    break;
                }
                i2 = i3 + 1;
                pointerEventPass2 = pointerEventPass;
            }
            pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange != null || pointerInputChange.ck()) {
                return pointerEventPass;
            }
            if (PointerEventKt.nr(pointerInputChange)) {
                long jN = touchSlopDetector2.n(pointerInputChange, f4);
                if ((9223372034707292159L & jN) != 9205357640488583168L) {
                    function22.invoke(pointerInputChange, Boxing.boxFloat(Float.intBitsToFloat((int) (jN >> 32))));
                    if (pointerInputChange.ck()) {
                        return pointerInputChange;
                    }
                    touchSlopDetector2.O();
                    touchSlopDetector = touchSlopDetector2;
                    f3 = f4;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13;
                    pointerEventPass2 = pointerEventPass;
                    i8 = 1;
                } else {
                    PointerEventPass pointerEventPass3 = PointerEventPass.f32077O;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.f16683n = function22;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.f16686t = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.f16680O = longRef;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.J2 = touchSlopDetector2;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.f16685r = pointerInputChange;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.f16684o = f4;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.f16681S = 2;
                    if (awaitPointerEventScope2.HBN(pointerEventPass3, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13) != coroutine_suspended) {
                        touchSlopDetector = touchSlopDetector2;
                        f3 = f4;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13;
                        longRef3 = longRef;
                        function24 = function22;
                        pointerInputChange2 = pointerInputChange;
                        if (!pointerInputChange2.ck()) {
                        }
                    }
                }
            } else {
                List changes3 = pointerEvent2.getChanges();
                int size2 = changes3.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size2) {
                        obj2 = pointerEventPass;
                        break;
                    }
                    obj2 = changes3.get(i9);
                    if (((PointerInputChange) obj2).getPressed()) {
                        break;
                    }
                    i9++;
                }
                PointerInputChange pointerInputChange3 = (PointerInputChange) obj2;
                if (pointerInputChange3 == null) {
                    return pointerEventPass;
                }
                longRef.element = pointerInputChange3.getId();
                touchSlopDetector = touchSlopDetector2;
                f3 = f4;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13;
                pointerEventPass2 = pointerEventPass;
                i8 = 1;
            }
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.f16683n = function22;
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.f16686t = awaitPointerEventScope2;
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.f16680O = longRef;
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.J2 = touchSlopDetector;
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.f16685r = pointerEventPass2;
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.f16684o = f3;
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.f16681S = i8;
            objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i8, pointerEventPass2);
            if (objPJg != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0183 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0177 -> B:62:0x017d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object KN(AwaitPointerEventScope awaitPointerEventScope, long j2, int i2, Orientation orientation, long j3, Function2 function2, Continuation continuation) {
        DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitPointerSlopOrCancellation$1;
        Function2 function22;
        Ref.LongRef longRef;
        DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitPointerSlopOrCancellation$12;
        float f3;
        TouchSlopDetector touchSlopDetector;
        AwaitPointerEventScope awaitPointerEventScope2;
        Ref.LongRef longRef2;
        DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitPointerSlopOrCancellation$13;
        float f4;
        TouchSlopDetector touchSlopDetector2;
        int size;
        int i3;
        PointerEventPass pointerEventPass;
        Object obj;
        PointerInputChange pointerInputChange;
        Object obj2;
        int i5;
        Object objPJg;
        if (continuation instanceof DragGestureDetectorKt$awaitPointerSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$1 = (DragGestureDetectorKt$awaitPointerSlopOrCancellation$1) continuation;
            int i7 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.f16698S;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.f16698S = i7 - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$1 = new DragGestureDetectorKt$awaitPointerSlopOrCancellation$1(continuation);
            }
        }
        Object obj3 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.f16699Z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i8 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.f16698S;
        int i9 = 1;
        PointerEventPass pointerEventPass2 = null;
        if (i8 == 0) {
            ResultKt.throwOnFailure(obj3);
            if (XQ(awaitPointerEventScope.UF(), j2)) {
                return null;
            }
            float fS = S(awaitPointerEventScope.getViewConfiguration(), i2);
            Ref.LongRef longRef3 = new Ref.LongRef();
            longRef3.element = j2;
            function22 = function2;
            longRef = longRef3;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1;
            f3 = fS;
            touchSlopDetector = new TouchSlopDetector(orientation, j3, null);
            awaitPointerEventScope2 = awaitPointerEventScope;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.f16700n = awaitPointerEventScope2;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.f16703t = function22;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.f16697O = longRef;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.J2 = touchSlopDetector;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.f16702r = pointerEventPass2;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.f16701o = f3;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.f16698S = i9;
            objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitPointerSlopOrCancellation$12, i9, pointerEventPass2);
            if (objPJg != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i8 == 1) {
            float f5 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.f16701o;
            TouchSlopDetector touchSlopDetector3 = (TouchSlopDetector) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.J2;
            Ref.LongRef longRef4 = (Ref.LongRef) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.f16697O;
            Function2 function23 = (Function2) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.f16703t;
            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.f16700n;
            ResultKt.throwOnFailure(obj3);
            f4 = f5;
            awaitPointerEventScope2 = awaitPointerEventScope3;
            longRef2 = longRef4;
            DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitPointerSlopOrCancellation$14 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1;
            touchSlopDetector2 = touchSlopDetector3;
            function22 = function23;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$14;
            PointerEvent pointerEvent = (PointerEvent) obj3;
            List changes = pointerEvent.getChanges();
            size = changes.size();
            i3 = 0;
            while (true) {
                if (i3 < size) {
                }
                i3 = i5 + 1;
                pointerEventPass2 = pointerEventPass;
            }
            pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange != null) {
                return pointerEventPass;
            }
            if (PointerEventKt.nr(pointerInputChange)) {
            }
            pointerEventPass2 = pointerEventPass;
            i9 = 1;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.f16700n = awaitPointerEventScope2;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.f16703t = function22;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.f16697O = longRef;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.J2 = touchSlopDetector;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.f16702r = pointerEventPass2;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.f16701o = f3;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.f16698S = i9;
            objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitPointerSlopOrCancellation$12, i9, pointerEventPass2);
            if (objPJg != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i8 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        float f6 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.f16701o;
        PointerInputChange pointerInputChange2 = (PointerInputChange) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.f16702r;
        TouchSlopDetector touchSlopDetector4 = (TouchSlopDetector) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.J2;
        longRef = (Ref.LongRef) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.f16697O;
        Function2 function24 = (Function2) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.f16703t;
        AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.f16700n;
        ResultKt.throwOnFailure(obj3);
        touchSlopDetector = touchSlopDetector4;
        pointerEventPass = null;
        dragGestureDetectorKt$awaitPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1;
        f3 = f6;
        awaitPointerEventScope2 = awaitPointerEventScope4;
        if (!pointerInputChange2.ck()) {
            return pointerEventPass;
        }
        function22 = function24;
        pointerEventPass2 = pointerEventPass;
        i9 = 1;
        dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.f16700n = awaitPointerEventScope2;
        dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.f16703t = function22;
        dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.f16697O = longRef;
        dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.J2 = touchSlopDetector;
        dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.f16702r = pointerEventPass2;
        dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.f16701o = f3;
        dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.f16698S = i9;
        objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitPointerSlopOrCancellation$12, i9, pointerEventPass2);
        if (objPJg != coroutine_suspended) {
            float f7 = f3;
            touchSlopDetector2 = touchSlopDetector;
            obj3 = objPJg;
            longRef2 = longRef;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$12;
            f4 = f7;
            PointerEvent pointerEvent2 = (PointerEvent) obj3;
            List changes2 = pointerEvent2.getChanges();
            size = changes2.size();
            i3 = 0;
            while (true) {
                if (i3 < size) {
                    pointerEventPass = pointerEventPass2;
                    obj = pointerEventPass;
                    break;
                }
                obj = changes2.get(i3);
                pointerEventPass = pointerEventPass2;
                i5 = i3;
                if (PointerId.t(((PointerInputChange) obj).getId(), longRef2.element)) {
                    break;
                }
                i3 = i5 + 1;
                pointerEventPass2 = pointerEventPass;
            }
            pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange != null || pointerInputChange.ck()) {
                return pointerEventPass;
            }
            if (PointerEventKt.nr(pointerInputChange)) {
                long jN = touchSlopDetector2.n(pointerInputChange, f4);
                if ((9223372034707292159L & jN) != 9205357640488583168L) {
                    function22.invoke(pointerInputChange, Offset.nr(jN));
                    if (pointerInputChange.ck()) {
                        return pointerInputChange;
                    }
                    touchSlopDetector2.O();
                    touchSlopDetector = touchSlopDetector2;
                    f3 = f4;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$13;
                    longRef = longRef2;
                } else {
                    PointerEventPass pointerEventPass3 = PointerEventPass.f32077O;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$13.f16700n = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$13.f16703t = function22;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$13.f16697O = longRef2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$13.J2 = touchSlopDetector2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$13.f16702r = pointerInputChange;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$13.f16701o = f4;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$13.f16698S = 2;
                    if (awaitPointerEventScope2.HBN(pointerEventPass3, dragGestureDetectorKt$awaitPointerSlopOrCancellation$13) != coroutine_suspended) {
                        touchSlopDetector = touchSlopDetector2;
                        f3 = f4;
                        dragGestureDetectorKt$awaitPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$13;
                        longRef = longRef2;
                        function24 = function22;
                        pointerInputChange2 = pointerInputChange;
                        if (!pointerInputChange2.ck()) {
                        }
                    }
                }
            } else {
                List changes3 = pointerEvent2.getChanges();
                int size2 = changes3.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size2) {
                        obj2 = pointerEventPass;
                        break;
                    }
                    obj2 = changes3.get(i10);
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
                touchSlopDetector = touchSlopDetector2;
                f3 = f4;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$13;
                longRef = longRef2;
            }
            pointerEventPass2 = pointerEventPass;
            i9 = 1;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.f16700n = awaitPointerEventScope2;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.f16703t = function22;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.f16697O = longRef;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.J2 = touchSlopDetector;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.f16702r = pointerEventPass2;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.f16701o = f3;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.f16698S = i9;
            objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitPointerSlopOrCancellation$12, i9, pointerEventPass2);
            if (objPJg != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0184 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0178 -> B:61:0x017e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object O(AwaitPointerEventScope awaitPointerEventScope, long j2, int i2, Function2 function2, Continuation continuation) {
        DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
        float fS;
        Ref.LongRef longRef;
        Function2 function22;
        TouchSlopDetector touchSlopDetector;
        AwaitPointerEventScope awaitPointerEventScope2;
        float f3;
        DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
        TouchSlopDetector touchSlopDetector2;
        int size;
        int i3;
        PointerEventPass pointerEventPass;
        Object obj;
        PointerInputChange pointerInputChange;
        Object obj2;
        int i5;
        Object objPJg;
        if (continuation instanceof DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = (DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) continuation;
            int i7 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f16674S;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f16674S = i7 - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = new DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1(continuation);
            }
        }
        Object obj3 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f16675Z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i8 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f16674S;
        int i9 = 1;
        PointerEventPass pointerEventPass2 = null;
        if (i8 == 0) {
            ResultKt.throwOnFailure(obj3);
            Orientation orientation = Orientation.f16970t;
            long jT2 = Offset.INSTANCE.t();
            if (XQ(awaitPointerEventScope.UF(), j2)) {
                return null;
            }
            fS = S(awaitPointerEventScope.getViewConfiguration(), i2);
            longRef = new Ref.LongRef();
            longRef.element = j2;
            function22 = function2;
            touchSlopDetector = new TouchSlopDetector(orientation, jT2, null);
            awaitPointerEventScope2 = awaitPointerEventScope;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f16676n = function22;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f16679t = awaitPointerEventScope2;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f16673O = longRef;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.J2 = touchSlopDetector;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f16678r = pointerEventPass2;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f16677o = fS;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f16674S = i9;
            objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1, i9, pointerEventPass2);
            if (objPJg != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i8 == 1) {
            float f4 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f16677o;
            TouchSlopDetector touchSlopDetector3 = (TouchSlopDetector) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.J2;
            Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f16673O;
            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f16679t;
            Function2 function23 = (Function2) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f16676n;
            ResultKt.throwOnFailure(obj3);
            f3 = f4;
            awaitPointerEventScope2 = awaitPointerEventScope3;
            longRef = longRef2;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
            touchSlopDetector2 = touchSlopDetector3;
            function22 = function23;
            PointerEvent pointerEvent = (PointerEvent) obj3;
            List changes = pointerEvent.getChanges();
            size = changes.size();
            i3 = 0;
            while (true) {
                if (i3 < size) {
                }
                i3 = i5 + 1;
                pointerEventPass2 = pointerEventPass;
            }
            pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange != null) {
                return pointerEventPass;
            }
            if (PointerEventKt.nr(pointerInputChange)) {
            }
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f16676n = function22;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f16679t = awaitPointerEventScope2;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f16673O = longRef;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.J2 = touchSlopDetector;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f16678r = pointerEventPass2;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f16677o = fS;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f16674S = i9;
            objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1, i9, pointerEventPass2);
            if (objPJg != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i8 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        float f5 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f16677o;
        PointerInputChange pointerInputChange2 = (PointerInputChange) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f16678r;
        TouchSlopDetector touchSlopDetector4 = (TouchSlopDetector) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.J2;
        Ref.LongRef longRef3 = (Ref.LongRef) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f16673O;
        AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f16679t;
        Function2 function24 = (Function2) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f16676n;
        ResultKt.throwOnFailure(obj3);
        touchSlopDetector = touchSlopDetector4;
        pointerEventPass = null;
        fS = f5;
        awaitPointerEventScope2 = awaitPointerEventScope4;
        if (!pointerInputChange2.ck()) {
            return pointerEventPass;
        }
        function22 = function24;
        pointerEventPass2 = pointerEventPass;
        i9 = 1;
        longRef = longRef3;
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f16676n = function22;
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f16679t = awaitPointerEventScope2;
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f16673O = longRef;
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.J2 = touchSlopDetector;
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f16678r = pointerEventPass2;
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f16677o = fS;
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f16674S = i9;
        objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1, i9, pointerEventPass2);
        if (objPJg != coroutine_suspended) {
            DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
            touchSlopDetector2 = touchSlopDetector;
            obj3 = objPJg;
            f3 = fS;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13;
            PointerEvent pointerEvent2 = (PointerEvent) obj3;
            List changes2 = pointerEvent2.getChanges();
            size = changes2.size();
            i3 = 0;
            while (true) {
                if (i3 < size) {
                    pointerEventPass = pointerEventPass2;
                    obj = pointerEventPass;
                    break;
                }
                obj = changes2.get(i3);
                pointerEventPass = pointerEventPass2;
                i5 = i3;
                if (PointerId.t(((PointerInputChange) obj).getId(), longRef.element)) {
                    break;
                }
                i3 = i5 + 1;
                pointerEventPass2 = pointerEventPass;
            }
            pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange != null || pointerInputChange.ck()) {
                return pointerEventPass;
            }
            if (PointerEventKt.nr(pointerInputChange)) {
                long jN = touchSlopDetector2.n(pointerInputChange, f3);
                if ((9223372034707292159L & jN) != 9205357640488583168L) {
                    function22.invoke(pointerInputChange, Boxing.boxFloat(Float.intBitsToFloat((int) (jN >> 32))));
                    if (pointerInputChange.ck()) {
                        return pointerInputChange;
                    }
                    touchSlopDetector2.O();
                    touchSlopDetector = touchSlopDetector2;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
                    fS = f3;
                    pointerEventPass2 = pointerEventPass;
                    i9 = 1;
                } else {
                    PointerEventPass pointerEventPass3 = PointerEventPass.f32077O;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.f16676n = function22;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.f16679t = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.f16673O = longRef;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.J2 = touchSlopDetector2;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.f16678r = pointerInputChange;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.f16677o = f3;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.f16674S = 2;
                    if (awaitPointerEventScope2.HBN(pointerEventPass3, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12) != coroutine_suspended) {
                        touchSlopDetector = touchSlopDetector2;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
                        fS = f3;
                        longRef3 = longRef;
                        function24 = function22;
                        pointerInputChange2 = pointerInputChange;
                        if (!pointerInputChange2.ck()) {
                        }
                    }
                }
            } else {
                List changes3 = pointerEvent2.getChanges();
                int size2 = changes3.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size2) {
                        obj2 = pointerEventPass;
                        break;
                    }
                    obj2 = changes3.get(i10);
                    if (((PointerInputChange) obj2).getPressed()) {
                        break;
                    }
                    i10++;
                }
                PointerInputChange pointerInputChange3 = (PointerInputChange) obj2;
                if (pointerInputChange3 == null) {
                    return pointerEventPass;
                }
                longRef.element = pointerInputChange3.getId();
                touchSlopDetector = touchSlopDetector2;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
                fS = f3;
                pointerEventPass2 = pointerEventPass;
                i9 = 1;
            }
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f16676n = function22;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f16679t = awaitPointerEventScope2;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f16673O = longRef;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.J2 = touchSlopDetector;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f16678r = pointerEventPass2;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f16677o = fS;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.f16674S = i9;
            objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1, i9, pointerEventPass2);
            if (objPJg != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    public static final float S(ViewConfiguration viewConfiguration, int i2) {
        return PointerType.KN(i2, PointerType.INSTANCE.rl()) ? viewConfiguration.Uo() * f16659t : viewConfiguration.Uo();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r11v3, types: [T, androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Uo(AwaitPointerEventScope awaitPointerEventScope, long j2, Continuation continuation) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$1 dragGestureDetectorKt$awaitLongPressOrCancellation$1;
        Object obj;
        Ref.BooleanRef booleanRef;
        Object obj2;
        if (continuation instanceof DragGestureDetectorKt$awaitLongPressOrCancellation$1) {
            dragGestureDetectorKt$awaitLongPressOrCancellation$1 = (DragGestureDetectorKt$awaitLongPressOrCancellation$1) continuation;
            int i2 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.f16689r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.f16689r = i2 - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitLongPressOrCancellation$1 = new DragGestureDetectorKt$awaitLongPressOrCancellation$1(continuation);
            }
        }
        Object obj3 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.f16689r;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj3);
                if (XQ(awaitPointerEventScope.UF(), j2)) {
                    return null;
                }
                List changes = awaitPointerEventScope.UF().getChanges();
                int size = changes.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size) {
                        obj = null;
                        break;
                    }
                    obj = changes.get(i5);
                    if (PointerId.t(((PointerInputChange) obj).getId(), j2)) {
                        break;
                    }
                    i5++;
                }
                ?? r11 = (PointerInputChange) obj;
                if (r11 == 0) {
                    return null;
                }
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                objectRef2.element = r11;
                long jT2 = awaitPointerEventScope.getViewConfiguration().t();
                Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                Function2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(booleanRef2, objectRef2, objectRef, null);
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.f16688n = r11;
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.f16690t = objectRef;
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.f16687O = booleanRef2;
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.f16689r = 1;
                if (awaitPointerEventScope.lLA(jT2, dragGestureDetectorKt$awaitLongPressOrCancellation$2, dragGestureDetectorKt$awaitLongPressOrCancellation$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                booleanRef = booleanRef2;
                j2 = objectRef;
                obj2 = r11;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                booleanRef = (Ref.BooleanRef) dragGestureDetectorKt$awaitLongPressOrCancellation$1.f16687O;
                Ref.ObjectRef objectRef3 = (Ref.ObjectRef) dragGestureDetectorKt$awaitLongPressOrCancellation$1.f16690t;
                PointerInputChange pointerInputChange = (PointerInputChange) dragGestureDetectorKt$awaitLongPressOrCancellation$1.f16688n;
                ResultKt.throwOnFailure(obj3);
                j2 = objectRef3;
                obj2 = pointerInputChange;
            }
            if (!booleanRef.element) {
                return null;
            }
            PointerInputChange pointerInputChange2 = (PointerInputChange) j2.element;
            return pointerInputChange2 == null ? obj2 : pointerInputChange2;
        } catch (PointerEventTimeoutCancellationException unused) {
            PointerInputChange pointerInputChange3 = (PointerInputChange) j2.element;
            return pointerInputChange3 == null ? obj2 : pointerInputChange3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0112, code lost:
    
        if ((r0 == 0.0f) == false) goto L59;
     */
    /* JADX WARN: Path cross not found for [B:35:0x00c2, B:46:0x00eb], limit reached: 73 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0083 -> B:23:0x0089). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object WPU(AwaitPointerEventScope awaitPointerEventScope, long j2, Function1 function1, Continuation continuation) {
        DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$1;
        long id;
        Orientation orientation;
        DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$12;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function1 function12;
        Orientation orientation2;
        AwaitPointerEventScope awaitPointerEventScope3;
        Ref.LongRef longRef;
        Object objPJg;
        AwaitPointerEventScope awaitPointerEventScope4;
        Object obj;
        float fIntBitsToFloat;
        Object obj2;
        if (continuation instanceof DragGestureDetectorKt$verticalDrag$1) {
            dragGestureDetectorKt$verticalDrag$1 = (DragGestureDetectorKt$verticalDrag$1) continuation;
            int i2 = dragGestureDetectorKt$verticalDrag$1.f16795Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$verticalDrag$1.f16795Z = i2 - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$verticalDrag$1 = new DragGestureDetectorKt$verticalDrag$1(continuation);
            }
        }
        Object obj3 = dragGestureDetectorKt$verticalDrag$1.f16797o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = dragGestureDetectorKt$verticalDrag$1.f16795Z;
        int i5 = 1;
        PointerInputChange pointerInputChange = null;
        PointerEventPass pointerEventPass = null;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj3);
            Orientation orientation3 = Orientation.f16969n;
            id = j2;
            if (!XQ(awaitPointerEventScope.UF(), id)) {
                orientation = orientation3;
                dragGestureDetectorKt$verticalDrag$12 = dragGestureDetectorKt$verticalDrag$1;
                awaitPointerEventScope2 = awaitPointerEventScope;
                function12 = function1;
                Ref.LongRef longRef2 = new Ref.LongRef();
                longRef2.element = id;
                awaitPointerEventScope3 = awaitPointerEventScope2;
                orientation2 = orientation;
                longRef = longRef2;
                dragGestureDetectorKt$verticalDrag$12.f16796n = function12;
                dragGestureDetectorKt$verticalDrag$12.f16799t = awaitPointerEventScope2;
                dragGestureDetectorKt$verticalDrag$12.f16794O = orientation2;
                dragGestureDetectorKt$verticalDrag$12.J2 = awaitPointerEventScope3;
                dragGestureDetectorKt$verticalDrag$12.f16798r = longRef;
                dragGestureDetectorKt$verticalDrag$12.f16795Z = i5;
                objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$verticalDrag$12, i5, pointerEventPass);
                if (objPJg == coroutine_suspended) {
                }
            }
            return Boxing.boxBoolean(pointerInputChange == null);
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        longRef = (Ref.LongRef) dragGestureDetectorKt$verticalDrag$1.f16798r;
        awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$verticalDrag$1.J2;
        orientation2 = (Orientation) dragGestureDetectorKt$verticalDrag$1.f16794O;
        AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) dragGestureDetectorKt$verticalDrag$1.f16799t;
        Function1 function13 = (Function1) dragGestureDetectorKt$verticalDrag$1.f16796n;
        ResultKt.throwOnFailure(obj3);
        DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$13 = dragGestureDetectorKt$verticalDrag$1;
        function12 = function13;
        PointerEvent pointerEvent = (PointerEvent) obj3;
        List changes = pointerEvent.getChanges();
        int size = changes.size();
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                awaitPointerEventScope4 = awaitPointerEventScope3;
                obj = null;
                break;
            }
            obj = changes.get(i7);
            awaitPointerEventScope4 = awaitPointerEventScope3;
            if (PointerId.t(((PointerInputChange) obj).getId(), longRef.element)) {
                break;
            }
            i7++;
            awaitPointerEventScope3 = awaitPointerEventScope4;
        }
        PointerInputChange pointerInputChange2 = (PointerInputChange) obj;
        if (pointerInputChange2 == null) {
            if (PointerEventKt.nr(pointerInputChange2)) {
                List changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = changes2.get(i8);
                    if (((PointerInputChange) obj2).getPressed()) {
                        break;
                    }
                    i8++;
                }
                PointerInputChange pointerInputChange3 = (PointerInputChange) obj2;
                if (pointerInputChange3 != null) {
                    longRef.element = pointerInputChange3.getId();
                    awaitPointerEventScope3 = awaitPointerEventScope4;
                    awaitPointerEventScope2 = awaitPointerEventScope5;
                    dragGestureDetectorKt$verticalDrag$12 = dragGestureDetectorKt$verticalDrag$13;
                    i5 = 1;
                    pointerEventPass = null;
                    dragGestureDetectorKt$verticalDrag$12.f16796n = function12;
                    dragGestureDetectorKt$verticalDrag$12.f16799t = awaitPointerEventScope2;
                    dragGestureDetectorKt$verticalDrag$12.f16794O = orientation2;
                    dragGestureDetectorKt$verticalDrag$12.J2 = awaitPointerEventScope3;
                    dragGestureDetectorKt$verticalDrag$12.f16798r = longRef;
                    dragGestureDetectorKt$verticalDrag$12.f16795Z = i5;
                    objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$verticalDrag$12, i5, pointerEventPass);
                    if (objPJg == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$14 = dragGestureDetectorKt$verticalDrag$12;
                    awaitPointerEventScope5 = awaitPointerEventScope2;
                    obj3 = objPJg;
                    dragGestureDetectorKt$verticalDrag$13 = dragGestureDetectorKt$verticalDrag$14;
                    PointerEvent pointerEvent2 = (PointerEvent) obj3;
                    List changes3 = pointerEvent2.getChanges();
                    int size3 = changes3.size();
                    int i72 = 0;
                    while (true) {
                        if (i72 < size3) {
                        }
                        i72++;
                        awaitPointerEventScope3 = awaitPointerEventScope4;
                    }
                    PointerInputChange pointerInputChange22 = (PointerInputChange) obj;
                    if (pointerInputChange22 == null) {
                        pointerInputChange22 = null;
                    }
                }
            } else {
                long jKN = PointerEventKt.KN(pointerInputChange22);
                if (orientation2 != null) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (orientation2 == Orientation.f16969n ? jKN & 4294967295L : jKN >> 32));
                } else {
                    fIntBitsToFloat = Offset.gh(jKN);
                }
            }
        }
        if (pointerInputChange22 == null || pointerInputChange22.ck()) {
            pointerInputChange = null;
        } else if (PointerEventKt.nr(pointerInputChange22)) {
            pointerInputChange = pointerInputChange22;
        } else {
            function12.invoke(pointerInputChange22);
            orientation = orientation2;
            id = pointerInputChange22.getId();
            awaitPointerEventScope2 = awaitPointerEventScope5;
            dragGestureDetectorKt$verticalDrag$12 = dragGestureDetectorKt$verticalDrag$13;
            i5 = 1;
            pointerEventPass = null;
            Ref.LongRef longRef22 = new Ref.LongRef();
            longRef22.element = id;
            awaitPointerEventScope3 = awaitPointerEventScope2;
            orientation2 = orientation;
            longRef = longRef22;
            dragGestureDetectorKt$verticalDrag$12.f16796n = function12;
            dragGestureDetectorKt$verticalDrag$12.f16799t = awaitPointerEventScope2;
            dragGestureDetectorKt$verticalDrag$12.f16794O = orientation2;
            dragGestureDetectorKt$verticalDrag$12.J2 = awaitPointerEventScope3;
            dragGestureDetectorKt$verticalDrag$12.f16798r = longRef;
            dragGestureDetectorKt$verticalDrag$12.f16795Z = i5;
            objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$verticalDrag$12, i5, pointerEventPass);
            if (objPJg == coroutine_suspended) {
            }
        }
        return Boxing.boxBoolean(pointerInputChange == null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0112, code lost:
    
        if ((r0 == 0.0f) == false) goto L59;
     */
    /* JADX WARN: Path cross not found for [B:35:0x00c2, B:46:0x00eb], limit reached: 73 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0083 -> B:23:0x0089). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Z(AwaitPointerEventScope awaitPointerEventScope, long j2, Function1 function1, Continuation continuation) {
        DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$1;
        long id;
        Orientation orientation;
        DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$12;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function1 function12;
        Orientation orientation2;
        AwaitPointerEventScope awaitPointerEventScope3;
        Ref.LongRef longRef;
        Object objPJg;
        AwaitPointerEventScope awaitPointerEventScope4;
        Object obj;
        float fIntBitsToFloat;
        Object obj2;
        if (continuation instanceof DragGestureDetectorKt$horizontalDrag$1) {
            dragGestureDetectorKt$horizontalDrag$1 = (DragGestureDetectorKt$horizontalDrag$1) continuation;
            int i2 = dragGestureDetectorKt$horizontalDrag$1.f16789Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$horizontalDrag$1.f16789Z = i2 - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$horizontalDrag$1 = new DragGestureDetectorKt$horizontalDrag$1(continuation);
            }
        }
        Object obj3 = dragGestureDetectorKt$horizontalDrag$1.f16791o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = dragGestureDetectorKt$horizontalDrag$1.f16789Z;
        int i5 = 1;
        PointerInputChange pointerInputChange = null;
        PointerEventPass pointerEventPass = null;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj3);
            Orientation orientation3 = Orientation.f16970t;
            id = j2;
            if (!XQ(awaitPointerEventScope.UF(), id)) {
                orientation = orientation3;
                dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$1;
                awaitPointerEventScope2 = awaitPointerEventScope;
                function12 = function1;
                Ref.LongRef longRef2 = new Ref.LongRef();
                longRef2.element = id;
                awaitPointerEventScope3 = awaitPointerEventScope2;
                orientation2 = orientation;
                longRef = longRef2;
                dragGestureDetectorKt$horizontalDrag$12.f16790n = function12;
                dragGestureDetectorKt$horizontalDrag$12.f16793t = awaitPointerEventScope2;
                dragGestureDetectorKt$horizontalDrag$12.f16788O = orientation2;
                dragGestureDetectorKt$horizontalDrag$12.J2 = awaitPointerEventScope3;
                dragGestureDetectorKt$horizontalDrag$12.f16792r = longRef;
                dragGestureDetectorKt$horizontalDrag$12.f16789Z = i5;
                objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$horizontalDrag$12, i5, pointerEventPass);
                if (objPJg == coroutine_suspended) {
                }
            }
            return Boxing.boxBoolean(pointerInputChange == null);
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        longRef = (Ref.LongRef) dragGestureDetectorKt$horizontalDrag$1.f16792r;
        awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$horizontalDrag$1.J2;
        orientation2 = (Orientation) dragGestureDetectorKt$horizontalDrag$1.f16788O;
        AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) dragGestureDetectorKt$horizontalDrag$1.f16793t;
        Function1 function13 = (Function1) dragGestureDetectorKt$horizontalDrag$1.f16790n;
        ResultKt.throwOnFailure(obj3);
        DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$13 = dragGestureDetectorKt$horizontalDrag$1;
        function12 = function13;
        PointerEvent pointerEvent = (PointerEvent) obj3;
        List changes = pointerEvent.getChanges();
        int size = changes.size();
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                awaitPointerEventScope4 = awaitPointerEventScope3;
                obj = null;
                break;
            }
            obj = changes.get(i7);
            awaitPointerEventScope4 = awaitPointerEventScope3;
            if (PointerId.t(((PointerInputChange) obj).getId(), longRef.element)) {
                break;
            }
            i7++;
            awaitPointerEventScope3 = awaitPointerEventScope4;
        }
        PointerInputChange pointerInputChange2 = (PointerInputChange) obj;
        if (pointerInputChange2 == null) {
            if (PointerEventKt.nr(pointerInputChange2)) {
                List changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = changes2.get(i8);
                    if (((PointerInputChange) obj2).getPressed()) {
                        break;
                    }
                    i8++;
                }
                PointerInputChange pointerInputChange3 = (PointerInputChange) obj2;
                if (pointerInputChange3 != null) {
                    longRef.element = pointerInputChange3.getId();
                    awaitPointerEventScope3 = awaitPointerEventScope4;
                    awaitPointerEventScope2 = awaitPointerEventScope5;
                    dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$13;
                    i5 = 1;
                    pointerEventPass = null;
                    dragGestureDetectorKt$horizontalDrag$12.f16790n = function12;
                    dragGestureDetectorKt$horizontalDrag$12.f16793t = awaitPointerEventScope2;
                    dragGestureDetectorKt$horizontalDrag$12.f16788O = orientation2;
                    dragGestureDetectorKt$horizontalDrag$12.J2 = awaitPointerEventScope3;
                    dragGestureDetectorKt$horizontalDrag$12.f16792r = longRef;
                    dragGestureDetectorKt$horizontalDrag$12.f16789Z = i5;
                    objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$horizontalDrag$12, i5, pointerEventPass);
                    if (objPJg == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$14 = dragGestureDetectorKt$horizontalDrag$12;
                    awaitPointerEventScope5 = awaitPointerEventScope2;
                    obj3 = objPJg;
                    dragGestureDetectorKt$horizontalDrag$13 = dragGestureDetectorKt$horizontalDrag$14;
                    PointerEvent pointerEvent2 = (PointerEvent) obj3;
                    List changes3 = pointerEvent2.getChanges();
                    int size3 = changes3.size();
                    int i72 = 0;
                    while (true) {
                        if (i72 < size3) {
                        }
                        i72++;
                        awaitPointerEventScope3 = awaitPointerEventScope4;
                    }
                    PointerInputChange pointerInputChange22 = (PointerInputChange) obj;
                    if (pointerInputChange22 == null) {
                        pointerInputChange22 = null;
                    }
                }
            } else {
                long jKN = PointerEventKt.KN(pointerInputChange22);
                if (orientation2 != null) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (orientation2 == Orientation.f16969n ? jKN & 4294967295L : jKN >> 32));
                } else {
                    fIntBitsToFloat = Offset.gh(jKN);
                }
            }
        }
        if (pointerInputChange22 == null || pointerInputChange22.ck()) {
            pointerInputChange = null;
        } else if (PointerEventKt.nr(pointerInputChange22)) {
            pointerInputChange = pointerInputChange22;
        } else {
            function12.invoke(pointerInputChange22);
            orientation = orientation2;
            id = pointerInputChange22.getId();
            awaitPointerEventScope2 = awaitPointerEventScope5;
            dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$13;
            i5 = 1;
            pointerEventPass = null;
            Ref.LongRef longRef22 = new Ref.LongRef();
            longRef22.element = id;
            awaitPointerEventScope3 = awaitPointerEventScope2;
            orientation2 = orientation;
            longRef = longRef22;
            dragGestureDetectorKt$horizontalDrag$12.f16790n = function12;
            dragGestureDetectorKt$horizontalDrag$12.f16793t = awaitPointerEventScope2;
            dragGestureDetectorKt$horizontalDrag$12.f16788O = orientation2;
            dragGestureDetectorKt$horizontalDrag$12.J2 = awaitPointerEventScope3;
            dragGestureDetectorKt$horizontalDrag$12.f16792r = longRef;
            dragGestureDetectorKt$horizontalDrag$12.f16789Z = i5;
            objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$horizontalDrag$12, i5, pointerEventPass);
            if (objPJg == coroutine_suspended) {
            }
        }
        return Boxing.boxBoolean(pointerInputChange == null);
    }

    public static final Object az(PointerInputScope pointerInputScope, final Function1 function1, final Function0 function0, Function0 function02, Function2 function2, Continuation continuation) {
        Object objTy = ty(pointerInputScope, new Function3<PointerInputChange, PointerInputChange, Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, Offset offset) {
                n(pointerInputChange, pointerInputChange2, offset.getPackedValue());
                return Unit.INSTANCE;
            }

            public final void n(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, long j2) {
                function1.invoke(Offset.nr(pointerInputChange2.getPosition()));
            }
        }, new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$6
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange) {
                n(pointerInputChange);
                return Unit.INSTANCE;
            }

            public final void n(PointerInputChange pointerInputChange) {
                function0.invoke();
            }
        }, function02, new Function0<Boolean>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$7
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.TRUE;
            }
        }, null, function2, continuation);
        return objTy == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTy : Unit.INSTANCE;
    }

    public static final Object ck(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation) {
        Object objO = ForEachGestureKt.O(pointerInputScope, new DragGestureDetectorKt$detectHorizontalDragGestures$5(function1, function2, function0, function02, null), continuation);
        return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0187 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x017b -> B:61:0x0181). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object gh(AwaitPointerEventScope awaitPointerEventScope, long j2, int i2, Function2 function2, Continuation continuation) {
        DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
        float fS;
        Ref.LongRef longRef;
        Function2 function22;
        TouchSlopDetector touchSlopDetector;
        AwaitPointerEventScope awaitPointerEventScope2;
        float f3;
        DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12;
        TouchSlopDetector touchSlopDetector2;
        int size;
        int i3;
        PointerEventPass pointerEventPass;
        Object obj;
        PointerInputChange pointerInputChange;
        Object obj2;
        int i5;
        Object objPJg;
        if (continuation instanceof DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = (DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) continuation;
            int i7 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f16715S;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f16715S = i7 - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = new DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1(continuation);
            }
        }
        Object obj3 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f16716Z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i8 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f16715S;
        int i9 = 1;
        PointerEventPass pointerEventPass2 = null;
        if (i8 == 0) {
            ResultKt.throwOnFailure(obj3);
            Orientation orientation = Orientation.f16969n;
            long jT2 = Offset.INSTANCE.t();
            if (XQ(awaitPointerEventScope.UF(), j2)) {
                return null;
            }
            fS = S(awaitPointerEventScope.getViewConfiguration(), i2);
            longRef = new Ref.LongRef();
            longRef.element = j2;
            function22 = function2;
            touchSlopDetector = new TouchSlopDetector(orientation, jT2, null);
            awaitPointerEventScope2 = awaitPointerEventScope;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f16717n = function22;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f16720t = awaitPointerEventScope2;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f16714O = longRef;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.J2 = touchSlopDetector;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f16719r = pointerEventPass2;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f16718o = fS;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f16715S = i9;
            objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1, i9, pointerEventPass2);
            if (objPJg != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i8 == 1) {
            float f4 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f16718o;
            TouchSlopDetector touchSlopDetector3 = (TouchSlopDetector) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.J2;
            Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f16714O;
            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f16720t;
            Function2 function23 = (Function2) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f16717n;
            ResultKt.throwOnFailure(obj3);
            f3 = f4;
            awaitPointerEventScope2 = awaitPointerEventScope3;
            longRef = longRef2;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
            touchSlopDetector2 = touchSlopDetector3;
            function22 = function23;
            PointerEvent pointerEvent = (PointerEvent) obj3;
            List changes = pointerEvent.getChanges();
            size = changes.size();
            i3 = 0;
            while (true) {
                if (i3 < size) {
                }
                i3 = i5 + 1;
                pointerEventPass2 = pointerEventPass;
            }
            pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange != null) {
                return pointerEventPass;
            }
            if (PointerEventKt.nr(pointerInputChange)) {
            }
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f16717n = function22;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f16720t = awaitPointerEventScope2;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f16714O = longRef;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.J2 = touchSlopDetector;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f16719r = pointerEventPass2;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f16718o = fS;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f16715S = i9;
            objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1, i9, pointerEventPass2);
            if (objPJg != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i8 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        float f5 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f16718o;
        PointerInputChange pointerInputChange2 = (PointerInputChange) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f16719r;
        TouchSlopDetector touchSlopDetector4 = (TouchSlopDetector) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.J2;
        Ref.LongRef longRef3 = (Ref.LongRef) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f16714O;
        AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f16720t;
        Function2 function24 = (Function2) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f16717n;
        ResultKt.throwOnFailure(obj3);
        touchSlopDetector = touchSlopDetector4;
        pointerEventPass = null;
        fS = f5;
        awaitPointerEventScope2 = awaitPointerEventScope4;
        if (!pointerInputChange2.ck()) {
            return pointerEventPass;
        }
        function22 = function24;
        pointerEventPass2 = pointerEventPass;
        i9 = 1;
        longRef = longRef3;
        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f16717n = function22;
        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f16720t = awaitPointerEventScope2;
        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f16714O = longRef;
        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.J2 = touchSlopDetector;
        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f16719r = pointerEventPass2;
        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f16718o = fS;
        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f16715S = i9;
        objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1, i9, pointerEventPass2);
        if (objPJg != coroutine_suspended) {
            DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
            touchSlopDetector2 = touchSlopDetector;
            obj3 = objPJg;
            f3 = fS;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13;
            PointerEvent pointerEvent2 = (PointerEvent) obj3;
            List changes2 = pointerEvent2.getChanges();
            size = changes2.size();
            i3 = 0;
            while (true) {
                if (i3 < size) {
                    pointerEventPass = pointerEventPass2;
                    obj = pointerEventPass;
                    break;
                }
                obj = changes2.get(i3);
                pointerEventPass = pointerEventPass2;
                i5 = i3;
                if (PointerId.t(((PointerInputChange) obj).getId(), longRef.element)) {
                    break;
                }
                i3 = i5 + 1;
                pointerEventPass2 = pointerEventPass;
            }
            pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange != null || pointerInputChange.ck()) {
                return pointerEventPass;
            }
            if (PointerEventKt.nr(pointerInputChange)) {
                long jN = touchSlopDetector2.n(pointerInputChange, f3);
                if ((9223372034707292159L & jN) != 9205357640488583168L) {
                    function22.invoke(pointerInputChange, Boxing.boxFloat(Float.intBitsToFloat((int) (jN & 4294967295L))));
                    if (pointerInputChange.ck()) {
                        return pointerInputChange;
                    }
                    touchSlopDetector2.O();
                    touchSlopDetector = touchSlopDetector2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12;
                    fS = f3;
                    pointerEventPass2 = pointerEventPass;
                    i9 = 1;
                } else {
                    PointerEventPass pointerEventPass3 = PointerEventPass.f32077O;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.f16717n = function22;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.f16720t = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.f16714O = longRef;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.J2 = touchSlopDetector2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.f16719r = pointerInputChange;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.f16718o = f3;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.f16715S = 2;
                    if (awaitPointerEventScope2.HBN(pointerEventPass3, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12) != coroutine_suspended) {
                        touchSlopDetector = touchSlopDetector2;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12;
                        fS = f3;
                        longRef3 = longRef;
                        function24 = function22;
                        pointerInputChange2 = pointerInputChange;
                        if (!pointerInputChange2.ck()) {
                        }
                    }
                }
            } else {
                List changes3 = pointerEvent2.getChanges();
                int size2 = changes3.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size2) {
                        obj2 = pointerEventPass;
                        break;
                    }
                    obj2 = changes3.get(i10);
                    if (((PointerInputChange) obj2).getPressed()) {
                        break;
                    }
                    i10++;
                }
                PointerInputChange pointerInputChange3 = (PointerInputChange) obj2;
                if (pointerInputChange3 == null) {
                    return pointerEventPass;
                }
                longRef.element = pointerInputChange3.getId();
                touchSlopDetector = touchSlopDetector2;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12;
                fS = f3;
                pointerEventPass2 = pointerEventPass;
                i9 = 1;
            }
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f16717n = function22;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f16720t = awaitPointerEventScope2;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f16714O = longRef;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.J2 = touchSlopDetector;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f16719r = pointerEventPass2;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f16718o = fS;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.f16715S = i9;
            objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1, i9, pointerEventPass2);
            if (objPJg != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00db, code lost:
    
        if ((java.lang.Float.intBitsToFloat((int) (androidx.compose.ui.input.pointer.PointerEventKt.KN(r11) & 4294967295L)) == 0.0f ? 1 : 0) == 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:22:0x006c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object mUb(AwaitPointerEventScope awaitPointerEventScope, long j2, Continuation continuation) {
        DragGestureDetectorKt$awaitVerticalDragOrCancellation$1 dragGestureDetectorKt$awaitVerticalDragOrCancellation$1;
        Ref.LongRef longRef;
        AwaitPointerEventScope awaitPointerEventScope2;
        Object objPJg;
        Object obj;
        Object obj2;
        if (continuation instanceof DragGestureDetectorKt$awaitVerticalDragOrCancellation$1) {
            dragGestureDetectorKt$awaitVerticalDragOrCancellation$1 = (DragGestureDetectorKt$awaitVerticalDragOrCancellation$1) continuation;
            int i2 = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1 = new DragGestureDetectorKt$awaitVerticalDragOrCancellation$1(continuation);
            }
        }
        Object obj3 = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.f16711O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.J2;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.f16713t;
            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.f16712n;
            ResultKt.throwOnFailure(obj3);
            Ref.LongRef longRef3 = longRef2;
            awaitPointerEventScope2 = awaitPointerEventScope3;
            PointerEvent pointerEvent = (PointerEvent) obj3;
            List changes = pointerEvent.getChanges();
            int size = changes.size();
            int i5 = 0;
            while (true) {
                if (i5 < size) {
                    obj = null;
                    break;
                }
                obj = changes.get(i5);
                if (PointerId.t(((PointerInputChange) obj).getId(), longRef3.element)) {
                    break;
                }
                i5++;
            }
            PointerInputChange pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange == null) {
                if (PointerEventKt.nr(pointerInputChange)) {
                    List changes2 = pointerEvent.getChanges();
                    int size2 = changes2.size();
                    while (true) {
                        if (i >= size2) {
                            obj2 = null;
                            break;
                        }
                        obj2 = changes2.get(i);
                        if (((PointerInputChange) obj2).getPressed()) {
                            break;
                        }
                        i++;
                    }
                    PointerInputChange pointerInputChange2 = (PointerInputChange) obj2;
                    if (pointerInputChange2 != null) {
                        longRef3.element = pointerInputChange2.getId();
                        longRef = longRef3;
                    }
                }
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.f16712n = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.f16713t = longRef;
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.J2 = 1;
                objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitVerticalDragOrCancellation$1, 1, null);
                if (objPJg != coroutine_suspended) {
                    return coroutine_suspended;
                }
                Ref.LongRef longRef4 = longRef;
                obj3 = objPJg;
                longRef3 = longRef4;
                PointerEvent pointerEvent2 = (PointerEvent) obj3;
                List changes3 = pointerEvent2.getChanges();
                int size3 = changes3.size();
                int i52 = 0;
                while (true) {
                    if (i52 < size3) {
                    }
                    i52++;
                }
                PointerInputChange pointerInputChange3 = (PointerInputChange) obj;
                if (pointerInputChange3 == null) {
                    pointerInputChange3 = null;
                }
            }
            if (pointerInputChange3 == null || pointerInputChange3.ck()) {
                return null;
            }
            return pointerInputChange3;
        }
        ResultKt.throwOnFailure(obj3);
        if (XQ(awaitPointerEventScope.UF(), j2)) {
            return null;
        }
        longRef = new Ref.LongRef();
        longRef.element = j2;
        awaitPointerEventScope2 = awaitPointerEventScope;
        dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.f16712n = awaitPointerEventScope2;
        dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.f16713t = longRef;
        dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.J2 = 1;
        objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitVerticalDragOrCancellation$1, 1, null);
        if (objPJg != coroutine_suspended) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d8, code lost:
    
        if ((java.lang.Float.intBitsToFloat((int) (androidx.compose.ui.input.pointer.PointerEventKt.KN(r11) >> 32)) == 0.0f ? 1 : 0) == 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:22:0x006c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object nr(AwaitPointerEventScope awaitPointerEventScope, long j2, Continuation continuation) {
        DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1;
        Ref.LongRef longRef;
        AwaitPointerEventScope awaitPointerEventScope2;
        Object objPJg;
        Object obj;
        Object obj2;
        if (continuation instanceof DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1) {
            dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 = (DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1) continuation;
            int i2 = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 = new DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1(continuation);
            }
        }
        Object obj3 = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.f16670O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.J2;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.f16672t;
            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.f16671n;
            ResultKt.throwOnFailure(obj3);
            Ref.LongRef longRef3 = longRef2;
            awaitPointerEventScope2 = awaitPointerEventScope3;
            PointerEvent pointerEvent = (PointerEvent) obj3;
            List changes = pointerEvent.getChanges();
            int size = changes.size();
            int i5 = 0;
            while (true) {
                if (i5 < size) {
                    obj = null;
                    break;
                }
                obj = changes.get(i5);
                if (PointerId.t(((PointerInputChange) obj).getId(), longRef3.element)) {
                    break;
                }
                i5++;
            }
            PointerInputChange pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange == null) {
                if (PointerEventKt.nr(pointerInputChange)) {
                    List changes2 = pointerEvent.getChanges();
                    int size2 = changes2.size();
                    while (true) {
                        if (i >= size2) {
                            obj2 = null;
                            break;
                        }
                        obj2 = changes2.get(i);
                        if (((PointerInputChange) obj2).getPressed()) {
                            break;
                        }
                        i++;
                    }
                    PointerInputChange pointerInputChange2 = (PointerInputChange) obj2;
                    if (pointerInputChange2 != null) {
                        longRef3.element = pointerInputChange2.getId();
                        longRef = longRef3;
                    }
                }
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.f16671n = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.f16672t = longRef;
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.J2 = 1;
                objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1, 1, null);
                if (objPJg != coroutine_suspended) {
                    return coroutine_suspended;
                }
                Ref.LongRef longRef4 = longRef;
                obj3 = objPJg;
                longRef3 = longRef4;
                PointerEvent pointerEvent2 = (PointerEvent) obj3;
                List changes3 = pointerEvent2.getChanges();
                int size3 = changes3.size();
                int i52 = 0;
                while (true) {
                    if (i52 < size3) {
                    }
                    i52++;
                }
                PointerInputChange pointerInputChange3 = (PointerInputChange) obj;
                if (pointerInputChange3 == null) {
                    pointerInputChange3 = null;
                }
            }
            if (pointerInputChange3 == null || pointerInputChange3.ck()) {
                return null;
            }
            return pointerInputChange3;
        }
        ResultKt.throwOnFailure(obj3);
        if (XQ(awaitPointerEventScope.UF(), j2)) {
            return null;
        }
        longRef = new Ref.LongRef();
        longRef.element = j2;
        awaitPointerEventScope2 = awaitPointerEventScope;
        dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.f16671n = awaitPointerEventScope2;
        dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.f16672t = longRef;
        dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.J2 = 1;
        objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1, 1, null);
        if (objPJg != coroutine_suspended) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(AwaitPointerEventScope awaitPointerEventScope, long j2, Function1 function1, Continuation continuation) {
        DragGestureDetectorKt$drag$1 dragGestureDetectorKt$drag$1;
        PointerInputChange pointerInputChange;
        if (continuation instanceof DragGestureDetectorKt$drag$1) {
            dragGestureDetectorKt$drag$1 = (DragGestureDetectorKt$drag$1) continuation;
            int i2 = dragGestureDetectorKt$drag$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$drag$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$drag$1 = new DragGestureDetectorKt$drag$1(continuation);
            }
        }
        Object objT = dragGestureDetectorKt$drag$1.f16778O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = dragGestureDetectorKt$drag$1.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objT);
            dragGestureDetectorKt$drag$1.f16779n = awaitPointerEventScope;
            dragGestureDetectorKt$drag$1.f16780t = function1;
            dragGestureDetectorKt$drag$1.J2 = 1;
            objT = t(awaitPointerEventScope, j2, dragGestureDetectorKt$drag$1);
            if (objT == coroutine_suspended) {
            }
            pointerInputChange = (PointerInputChange) objT;
            if (pointerInputChange == null) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Function1 function12 = (Function1) dragGestureDetectorKt$drag$1.f16780t;
            AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) dragGestureDetectorKt$drag$1.f16779n;
            ResultKt.throwOnFailure(objT);
            function1 = function12;
            awaitPointerEventScope = awaitPointerEventScope2;
            pointerInputChange = (PointerInputChange) objT;
            if (pointerInputChange == null) {
                if (PointerEventKt.nr(pointerInputChange)) {
                    return Boxing.boxBoolean(true);
                }
                function1.invoke(pointerInputChange);
                j2 = pointerInputChange.getId();
                dragGestureDetectorKt$drag$1.f16779n = awaitPointerEventScope;
                dragGestureDetectorKt$drag$1.f16780t = function1;
                dragGestureDetectorKt$drag$1.J2 = 1;
                objT = t(awaitPointerEventScope, j2, dragGestureDetectorKt$drag$1);
                if (objT == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pointerInputChange = (PointerInputChange) objT;
                if (pointerInputChange == null) {
                    return Boxing.boxBoolean(false);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0181 -> B:61:0x0187). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object qie(AwaitPointerEventScope awaitPointerEventScope, long j2, Function2 function2, Continuation continuation) {
        DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
        Ref.LongRef longRef;
        Function2 function22;
        DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12;
        float f3;
        TouchSlopDetector touchSlopDetector;
        AwaitPointerEventScope awaitPointerEventScope2;
        DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13;
        float f4;
        TouchSlopDetector touchSlopDetector2;
        int size;
        int i2;
        PointerEventPass pointerEventPass;
        Object obj;
        PointerInputChange pointerInputChange;
        Object obj2;
        int i3;
        Object objPJg;
        if (continuation instanceof DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 = (DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1) continuation;
            int i5 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.f16722S;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.f16722S = i5 - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 = new DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1(continuation);
            }
        }
        Object obj3 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.f16723Z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.f16722S;
        int i8 = 1;
        PointerEventPass pointerEventPass2 = null;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj3);
            int iNr = PointerType.INSTANCE.nr();
            Orientation orientation = Orientation.f16969n;
            long jT2 = Offset.INSTANCE.t();
            if (XQ(awaitPointerEventScope.UF(), j2)) {
                return null;
            }
            float fS = S(awaitPointerEventScope.getViewConfiguration(), iNr);
            longRef = new Ref.LongRef();
            longRef.element = j2;
            TouchSlopDetector touchSlopDetector3 = new TouchSlopDetector(orientation, jT2, null);
            function22 = function2;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
            f3 = fS;
            touchSlopDetector = touchSlopDetector3;
            awaitPointerEventScope2 = awaitPointerEventScope;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.f16724n = function22;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.f16727t = awaitPointerEventScope2;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.f16721O = longRef;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.J2 = touchSlopDetector;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.f16726r = pointerEventPass2;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.f16725o = f3;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.f16722S = i8;
            objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i8, pointerEventPass2);
            if (objPJg != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i7 == 1) {
            float f5 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.f16725o;
            TouchSlopDetector touchSlopDetector4 = (TouchSlopDetector) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.J2;
            Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.f16721O;
            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.f16727t;
            Function2 function23 = (Function2) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.f16724n;
            ResultKt.throwOnFailure(obj3);
            longRef = longRef2;
            f4 = f5;
            awaitPointerEventScope2 = awaitPointerEventScope3;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
            touchSlopDetector2 = touchSlopDetector4;
            function22 = function23;
            PointerEvent pointerEvent = (PointerEvent) obj3;
            List changes = pointerEvent.getChanges();
            size = changes.size();
            i2 = 0;
            while (true) {
                if (i2 < size) {
                }
                i2 = i3 + 1;
                pointerEventPass2 = pointerEventPass;
            }
            pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange != null) {
                return pointerEventPass;
            }
            if (PointerEventKt.nr(pointerInputChange)) {
            }
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.f16724n = function22;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.f16727t = awaitPointerEventScope2;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.f16721O = longRef;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.J2 = touchSlopDetector;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.f16726r = pointerEventPass2;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.f16725o = f3;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.f16722S = i8;
            objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i8, pointerEventPass2);
            if (objPJg != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i7 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        float f6 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.f16725o;
        PointerInputChange pointerInputChange2 = (PointerInputChange) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.f16726r;
        TouchSlopDetector touchSlopDetector5 = (TouchSlopDetector) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.J2;
        Ref.LongRef longRef3 = (Ref.LongRef) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.f16721O;
        AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.f16727t;
        Function2 function24 = (Function2) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.f16724n;
        ResultKt.throwOnFailure(obj3);
        touchSlopDetector = touchSlopDetector5;
        pointerEventPass = null;
        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
        f3 = f6;
        awaitPointerEventScope2 = awaitPointerEventScope4;
        if (!pointerInputChange2.ck()) {
            return pointerEventPass;
        }
        function22 = function24;
        pointerEventPass2 = pointerEventPass;
        i8 = 1;
        longRef = longRef3;
        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.f16724n = function22;
        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.f16727t = awaitPointerEventScope2;
        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.f16721O = longRef;
        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.J2 = touchSlopDetector;
        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.f16726r = pointerEventPass2;
        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.f16725o = f3;
        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.f16722S = i8;
        objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i8, pointerEventPass2);
        if (objPJg != coroutine_suspended) {
            float f7 = f3;
            touchSlopDetector2 = touchSlopDetector;
            obj3 = objPJg;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12;
            f4 = f7;
            PointerEvent pointerEvent2 = (PointerEvent) obj3;
            List changes2 = pointerEvent2.getChanges();
            size = changes2.size();
            i2 = 0;
            while (true) {
                if (i2 < size) {
                    pointerEventPass = pointerEventPass2;
                    obj = pointerEventPass;
                    break;
                }
                obj = changes2.get(i2);
                pointerEventPass = pointerEventPass2;
                i3 = i2;
                if (PointerId.t(((PointerInputChange) obj).getId(), longRef.element)) {
                    break;
                }
                i2 = i3 + 1;
                pointerEventPass2 = pointerEventPass;
            }
            pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange != null || pointerInputChange.ck()) {
                return pointerEventPass;
            }
            if (PointerEventKt.nr(pointerInputChange)) {
                long jN = touchSlopDetector2.n(pointerInputChange, f4);
                if ((9223372034707292159L & jN) != 9205357640488583168L) {
                    function22.invoke(pointerInputChange, Boxing.boxFloat(Float.intBitsToFloat((int) (jN & 4294967295L))));
                    if (pointerInputChange.ck()) {
                        return pointerInputChange;
                    }
                    touchSlopDetector2.O();
                    touchSlopDetector = touchSlopDetector2;
                    f3 = f4;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13;
                    pointerEventPass2 = pointerEventPass;
                    i8 = 1;
                } else {
                    PointerEventPass pointerEventPass3 = PointerEventPass.f32077O;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.f16724n = function22;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.f16727t = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.f16721O = longRef;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.J2 = touchSlopDetector2;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.f16726r = pointerInputChange;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.f16725o = f4;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.f16722S = 2;
                    if (awaitPointerEventScope2.HBN(pointerEventPass3, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13) != coroutine_suspended) {
                        touchSlopDetector = touchSlopDetector2;
                        f3 = f4;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13;
                        longRef3 = longRef;
                        function24 = function22;
                        pointerInputChange2 = pointerInputChange;
                        if (!pointerInputChange2.ck()) {
                        }
                    }
                }
            } else {
                List changes3 = pointerEvent2.getChanges();
                int size2 = changes3.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size2) {
                        obj2 = pointerEventPass;
                        break;
                    }
                    obj2 = changes3.get(i9);
                    if (((PointerInputChange) obj2).getPressed()) {
                        break;
                    }
                    i9++;
                }
                PointerInputChange pointerInputChange3 = (PointerInputChange) obj2;
                if (pointerInputChange3 == null) {
                    return pointerEventPass;
                }
                longRef.element = pointerInputChange3.getId();
                touchSlopDetector = touchSlopDetector2;
                f3 = f4;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13;
                pointerEventPass2 = pointerEventPass;
                i8 = 1;
            }
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.f16724n = function22;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.f16727t = awaitPointerEventScope2;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.f16721O = longRef;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.J2 = touchSlopDetector;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.f16726r = pointerEventPass2;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.f16725o = f3;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.f16722S = i8;
            objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i8, pointerEventPass2);
            if (objPJg != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0125, code lost:
    
        if (((r3 != null ? r3 == androidx.compose.foundation.gestures.Orientation.f16969n ? java.lang.Float.intBitsToFloat((int) (r4 & 4294967295L)) : java.lang.Float.intBitsToFloat((int) (r4 >> 32)) : androidx.compose.ui.geometry.Offset.gh(r4)) == 0.0f) == false) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:35:0x00d0, B:46:0x00fa], limit reached: 69 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008d -> B:23:0x0093). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object r(AwaitPointerEventScope awaitPointerEventScope, long j2, Function1 function1, Orientation orientation, Function1 function12, Continuation continuation) {
        DragGestureDetectorKt$drag$2 dragGestureDetectorKt$drag$2;
        long id;
        AwaitPointerEventScope awaitPointerEventScope2;
        Orientation orientation2;
        Function1 function13;
        DragGestureDetectorKt$drag$2 dragGestureDetectorKt$drag$22;
        Function1 function14;
        Ref.LongRef longRef;
        AwaitPointerEventScope awaitPointerEventScope3;
        Object objPJg;
        PointerEventPass pointerEventPass;
        Object obj;
        Object obj2;
        int i2;
        if (continuation instanceof DragGestureDetectorKt$drag$2) {
            dragGestureDetectorKt$drag$2 = (DragGestureDetectorKt$drag$2) continuation;
            int i3 = dragGestureDetectorKt$drag$2.f16782S;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$drag$2.f16782S = i3 - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$drag$2 = new DragGestureDetectorKt$drag$2(continuation);
            }
        }
        Object obj3 = dragGestureDetectorKt$drag$2.f16783Z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = dragGestureDetectorKt$drag$2.f16782S;
        int i7 = 1;
        PointerEventPass pointerEventPass2 = null;
        if (i5 == 0) {
            ResultKt.throwOnFailure(obj3);
            id = j2;
            if (XQ(awaitPointerEventScope.UF(), id)) {
                return null;
            }
            awaitPointerEventScope2 = awaitPointerEventScope;
            orientation2 = orientation;
            function13 = function12;
            dragGestureDetectorKt$drag$22 = dragGestureDetectorKt$drag$2;
            function14 = function1;
            longRef = new Ref.LongRef();
            longRef.element = id;
            awaitPointerEventScope3 = awaitPointerEventScope2;
            dragGestureDetectorKt$drag$22.f16784n = awaitPointerEventScope2;
            dragGestureDetectorKt$drag$22.f16787t = function14;
            dragGestureDetectorKt$drag$22.f16781O = orientation2;
            dragGestureDetectorKt$drag$22.J2 = function13;
            dragGestureDetectorKt$drag$22.f16786r = awaitPointerEventScope3;
            dragGestureDetectorKt$drag$22.f16785o = longRef;
            dragGestureDetectorKt$drag$22.f16782S = i7;
            objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope3, pointerEventPass2, dragGestureDetectorKt$drag$22, i7, pointerEventPass2);
            if (objPJg == coroutine_suspended) {
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$drag$2.f16785o;
            awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$drag$2.f16786r;
            Function1 function15 = (Function1) dragGestureDetectorKt$drag$2.J2;
            Orientation orientation3 = (Orientation) dragGestureDetectorKt$drag$2.f16781O;
            Function1 function16 = (Function1) dragGestureDetectorKt$drag$2.f16787t;
            AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$drag$2.f16784n;
            ResultKt.throwOnFailure(obj3);
            dragGestureDetectorKt$drag$22 = dragGestureDetectorKt$drag$2;
            function14 = function16;
            Ref.LongRef longRef3 = longRef2;
            orientation2 = orientation3;
            function13 = function15;
            PointerEvent pointerEvent = (PointerEvent) obj3;
            List changes = pointerEvent.getChanges();
            int size = changes.size();
            int i8 = 0;
            while (true) {
                if (i8 < size) {
                    pointerEventPass = pointerEventPass2;
                    obj = pointerEventPass;
                    break;
                }
                obj = changes.get(i8);
                pointerEventPass = pointerEventPass2;
                i2 = i8;
                if (PointerId.t(((PointerInputChange) obj).getId(), longRef3.element)) {
                    break;
                }
                i8 = i2 + 1;
                pointerEventPass2 = pointerEventPass;
            }
            PointerInputChange pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange == 0) {
                if (PointerEventKt.nr(pointerInputChange)) {
                    List changes2 = pointerEvent.getChanges();
                    int size2 = changes2.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size2) {
                            obj2 = pointerEventPass;
                            break;
                        }
                        obj2 = changes2.get(i9);
                        if (((PointerInputChange) obj2).getPressed()) {
                            break;
                        }
                        i9++;
                    }
                    PointerInputChange pointerInputChange2 = (PointerInputChange) obj2;
                    if (pointerInputChange2 != null) {
                        longRef3.element = pointerInputChange2.getId();
                        awaitPointerEventScope2 = awaitPointerEventScope4;
                        pointerEventPass2 = pointerEventPass;
                        i7 = 1;
                        longRef = longRef3;
                        dragGestureDetectorKt$drag$22.f16784n = awaitPointerEventScope2;
                        dragGestureDetectorKt$drag$22.f16787t = function14;
                        dragGestureDetectorKt$drag$22.f16781O = orientation2;
                        dragGestureDetectorKt$drag$22.J2 = function13;
                        dragGestureDetectorKt$drag$22.f16786r = awaitPointerEventScope3;
                        dragGestureDetectorKt$drag$22.f16785o = longRef;
                        dragGestureDetectorKt$drag$22.f16782S = i7;
                        objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope3, pointerEventPass2, dragGestureDetectorKt$drag$22, i7, pointerEventPass2);
                        if (objPJg == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Ref.LongRef longRef4 = longRef;
                        awaitPointerEventScope4 = awaitPointerEventScope2;
                        obj3 = objPJg;
                        longRef3 = longRef4;
                        PointerEvent pointerEvent2 = (PointerEvent) obj3;
                        List changes3 = pointerEvent2.getChanges();
                        int size3 = changes3.size();
                        int i82 = 0;
                        while (true) {
                            if (i82 < size3) {
                            }
                            i82 = i2 + 1;
                            pointerEventPass2 = pointerEventPass;
                        }
                        PointerInputChange pointerInputChange3 = (PointerInputChange) obj;
                        if (pointerInputChange3 == 0) {
                            pointerInputChange3 = pointerEventPass;
                        }
                    }
                } else {
                    long jKN = PointerEventKt.KN(pointerInputChange3);
                }
            }
            if (pointerInputChange3 == 0 || ((Boolean) function13.invoke(pointerInputChange3)).booleanValue()) {
                return pointerEventPass;
            }
            if (PointerEventKt.nr(pointerInputChange3)) {
                return pointerInputChange3;
            }
            function14.invoke(pointerInputChange3);
            id = pointerInputChange3.getId();
            awaitPointerEventScope2 = awaitPointerEventScope4;
            pointerEventPass2 = pointerEventPass;
            i7 = 1;
            longRef = new Ref.LongRef();
            longRef.element = id;
            awaitPointerEventScope3 = awaitPointerEventScope2;
            dragGestureDetectorKt$drag$22.f16784n = awaitPointerEventScope2;
            dragGestureDetectorKt$drag$22.f16787t = function14;
            dragGestureDetectorKt$drag$22.f16781O = orientation2;
            dragGestureDetectorKt$drag$22.J2 = function13;
            dragGestureDetectorKt$drag$22.f16786r = awaitPointerEventScope3;
            dragGestureDetectorKt$drag$22.f16785o = longRef;
            dragGestureDetectorKt$drag$22.f16782S = i7;
            objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope3, pointerEventPass2, dragGestureDetectorKt$drag$22, i7, pointerEventPass2);
            if (objPJg == coroutine_suspended) {
            }
        }
    }

    /* JADX WARN: Path cross not found for [B:32:0x00d3, B:38:0x00ef], limit reached: 69 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x009e -> B:23:0x00a3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object rl(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, PointerEventPass pointerEventPass, Continuation continuation) {
        DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;
        Ref.LongRef longRef;
        int i2;
        TouchSlopDetector touchSlopDetector;
        AwaitPointerEventScope awaitPointerEventScope2;
        float f3;
        DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12;
        PointerEventPass pointerEventPass2;
        Object objHBN;
        Object obj;
        int size;
        int i3;
        Object obj2;
        PointerInputChange pointerInputChange2;
        if (continuation instanceof DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1) {
            dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 = (DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1) continuation;
            int i5 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.f16661S;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.f16661S = i5 - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 = new DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1(continuation);
            }
        }
        Object obj3 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.f16662Z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.f16661S;
        int i8 = 0;
        int i9 = 1;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            float f4 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.f16664o;
            int i10 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.f16665r;
            TouchSlopDetector touchSlopDetector2 = (TouchSlopDetector) dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.J2;
            Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.f16660O;
            PointerEventPass pointerEventPass3 = (PointerEventPass) dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.f16666t;
            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.f16663n;
            ResultKt.throwOnFailure(obj3);
            dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;
            pointerEventPass2 = pointerEventPass3;
            longRef = longRef2;
            touchSlopDetector = touchSlopDetector2;
            i2 = i10;
            f3 = f4;
            PointerEvent pointerEvent = (PointerEvent) obj3;
            List changes = pointerEvent.getChanges();
            int size2 = changes.size();
            int i11 = i8;
            while (true) {
                if (i11 < size2) {
                    obj = null;
                    break;
                }
                Object obj4 = changes.get(i11);
                if (PointerId.t(((PointerInputChange) obj4).getId(), longRef.element)) {
                    obj = obj4;
                    break;
                }
                i11++;
            }
            PointerInputChange pointerInputChange3 = (PointerInputChange) obj;
            if (pointerInputChange3 != null || PointerEventKt.nr(pointerInputChange3)) {
                List changes2 = pointerEvent.getChanges();
                size = changes2.size();
                i3 = 0;
                while (true) {
                    if (i3 < size) {
                        obj2 = null;
                        break;
                    }
                    Object obj5 = changes2.get(i3);
                    if (((PointerInputChange) obj5).getPressed()) {
                        obj2 = obj5;
                        break;
                    }
                    i3++;
                }
                pointerInputChange2 = (PointerInputChange) obj2;
                if (pointerInputChange2 != null) {
                    return Boxing.boxBoolean(i2 != 0);
                }
                longRef.element = pointerInputChange2.getId();
            } else if ((touchSlopDetector.n(pointerInputChange3, f3) & 9223372034707292159L) != 9205357640488583168L) {
                i2 = 1;
            }
            List changes3 = pointerEvent.getChanges();
            int size3 = changes3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                if (((PointerInputChange) changes3.get(i12)).getPressed()) {
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    i8 = 0;
                    i9 = 1;
                    dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.f16663n = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.f16666t = pointerEventPass2;
                    dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.f16660O = longRef;
                    dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.J2 = touchSlopDetector;
                    dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.f16665r = i2;
                    dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.f16664o = f3;
                    dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.f16661S = i9;
                    objHBN = awaitPointerEventScope2.HBN(pointerEventPass2, dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12);
                    if (objHBN != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    obj3 = objHBN;
                    PointerEvent pointerEvent2 = (PointerEvent) obj3;
                    List changes4 = pointerEvent2.getChanges();
                    int size22 = changes4.size();
                    int i112 = i8;
                    while (true) {
                        if (i112 < size22) {
                        }
                        i112++;
                    }
                    PointerInputChange pointerInputChange32 = (PointerInputChange) obj;
                    if (pointerInputChange32 != null) {
                    }
                    List changes22 = pointerEvent2.getChanges();
                    size = changes22.size();
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                        }
                        i3++;
                    }
                    pointerInputChange2 = (PointerInputChange) obj2;
                    if (pointerInputChange2 != null) {
                    }
                }
            }
            return Boxing.boxBoolean(i2 != 0);
        }
        ResultKt.throwOnFailure(obj3);
        if (ForEachGestureKt.n(awaitPointerEventScope)) {
            return Boxing.boxBoolean(false);
        }
        Ref.LongRef longRef3 = new Ref.LongRef();
        longRef3.element = pointerInputChange.getId();
        float fS = S(awaitPointerEventScope.getViewConfiguration(), pointerInputChange.getType());
        longRef = longRef3;
        i2 = 0;
        touchSlopDetector = new TouchSlopDetector(null, 0L, 3, null);
        awaitPointerEventScope2 = awaitPointerEventScope;
        f3 = fS;
        dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;
        pointerEventPass2 = pointerEventPass;
        dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.f16663n = awaitPointerEventScope2;
        dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.f16666t = pointerEventPass2;
        dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.f16660O = longRef;
        dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.J2 = touchSlopDetector;
        dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.f16665r = i2;
        dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.f16664o = f3;
        dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.f16661S = i9;
        objHBN = awaitPointerEventScope2.HBN(pointerEventPass2, dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12);
        if (objHBN != coroutine_suspended) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ca, code lost:
    
        if (androidx.compose.ui.input.pointer.PointerEventKt.gh(r11) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:22:0x006c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object t(AwaitPointerEventScope awaitPointerEventScope, long j2, Continuation continuation) {
        DragGestureDetectorKt$awaitDragOrCancellation$1 dragGestureDetectorKt$awaitDragOrCancellation$1;
        Ref.LongRef longRef;
        AwaitPointerEventScope awaitPointerEventScope2;
        Object objPJg;
        Object obj;
        Object obj2;
        if (continuation instanceof DragGestureDetectorKt$awaitDragOrCancellation$1) {
            dragGestureDetectorKt$awaitDragOrCancellation$1 = (DragGestureDetectorKt$awaitDragOrCancellation$1) continuation;
            int i2 = dragGestureDetectorKt$awaitDragOrCancellation$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitDragOrCancellation$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitDragOrCancellation$1 = new DragGestureDetectorKt$awaitDragOrCancellation$1(continuation);
            }
        }
        Object obj3 = dragGestureDetectorKt$awaitDragOrCancellation$1.f16667O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = dragGestureDetectorKt$awaitDragOrCancellation$1.J2;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$awaitDragOrCancellation$1.f16669t;
            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitDragOrCancellation$1.f16668n;
            ResultKt.throwOnFailure(obj3);
            Ref.LongRef longRef3 = longRef2;
            awaitPointerEventScope2 = awaitPointerEventScope3;
            PointerEvent pointerEvent = (PointerEvent) obj3;
            List changes = pointerEvent.getChanges();
            int size = changes.size();
            int i5 = 0;
            int i7 = 0;
            while (true) {
                if (i7 < size) {
                    obj = null;
                    break;
                }
                obj = changes.get(i7);
                if (PointerId.t(((PointerInputChange) obj).getId(), longRef3.element)) {
                    break;
                }
                i7++;
            }
            PointerInputChange pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange == null) {
                if (PointerEventKt.nr(pointerInputChange)) {
                    List changes2 = pointerEvent.getChanges();
                    int size2 = changes2.size();
                    while (true) {
                        if (i5 >= size2) {
                            obj2 = null;
                            break;
                        }
                        obj2 = changes2.get(i5);
                        if (((PointerInputChange) obj2).getPressed()) {
                            break;
                        }
                        i5++;
                    }
                    PointerInputChange pointerInputChange2 = (PointerInputChange) obj2;
                    if (pointerInputChange2 != null) {
                        longRef3.element = pointerInputChange2.getId();
                        longRef = longRef3;
                    }
                }
                dragGestureDetectorKt$awaitDragOrCancellation$1.f16668n = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitDragOrCancellation$1.f16669t = longRef;
                dragGestureDetectorKt$awaitDragOrCancellation$1.J2 = 1;
                objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitDragOrCancellation$1, 1, null);
                if (objPJg != coroutine_suspended) {
                    return coroutine_suspended;
                }
                Ref.LongRef longRef4 = longRef;
                obj3 = objPJg;
                longRef3 = longRef4;
                PointerEvent pointerEvent2 = (PointerEvent) obj3;
                List changes3 = pointerEvent2.getChanges();
                int size3 = changes3.size();
                int i52 = 0;
                int i72 = 0;
                while (true) {
                    if (i72 < size3) {
                    }
                    i72++;
                }
                PointerInputChange pointerInputChange3 = (PointerInputChange) obj;
                if (pointerInputChange3 == null) {
                    pointerInputChange3 = null;
                }
            }
            if (pointerInputChange3 == null || pointerInputChange3.ck()) {
                return null;
            }
            return pointerInputChange3;
        }
        ResultKt.throwOnFailure(obj3);
        if (XQ(awaitPointerEventScope.UF(), j2)) {
            return null;
        }
        longRef = new Ref.LongRef();
        longRef.element = j2;
        awaitPointerEventScope2 = awaitPointerEventScope;
        dragGestureDetectorKt$awaitDragOrCancellation$1.f16668n = awaitPointerEventScope2;
        dragGestureDetectorKt$awaitDragOrCancellation$1.f16669t = longRef;
        dragGestureDetectorKt$awaitDragOrCancellation$1.J2 = 1;
        objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitDragOrCancellation$1, 1, null);
        if (objPJg != coroutine_suspended) {
        }
    }

    public static final Object ty(PointerInputScope pointerInputScope, Function3 function3, Function1 function1, Function0 function0, Function0 function02, Orientation orientation, Function2 function2, Continuation continuation) {
        Object objO = ForEachGestureKt.O(pointerInputScope, new DragGestureDetectorKt$detectDragGestures$9(function02, new Ref.LongRef(), orientation, function3, function2, function0, function1, null), continuation);
        return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0186 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x017a -> B:62:0x0180). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object xMQ(AwaitPointerEventScope awaitPointerEventScope, long j2, Function2 function2, Continuation continuation) {
        DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
        Function2 function22;
        Ref.LongRef longRef;
        DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$12;
        float f3;
        TouchSlopDetector touchSlopDetector;
        AwaitPointerEventScope awaitPointerEventScope2;
        Ref.LongRef longRef2;
        DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$13;
        float f4;
        TouchSlopDetector touchSlopDetector2;
        int size;
        int i2;
        PointerEventPass pointerEventPass;
        Object obj;
        PointerInputChange pointerInputChange;
        Object obj2;
        int i3;
        Object objPJg;
        if (continuation instanceof DragGestureDetectorKt$awaitTouchSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$1 = (DragGestureDetectorKt$awaitTouchSlopOrCancellation$1) continuation;
            int i5 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.f16705S;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.f16705S = i5 - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$1 = new DragGestureDetectorKt$awaitTouchSlopOrCancellation$1(continuation);
            }
        }
        Object obj3 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.f16706Z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.f16705S;
        int i8 = 1;
        PointerEventPass pointerEventPass2 = null;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj3);
            int iNr = PointerType.INSTANCE.nr();
            long jT2 = Offset.INSTANCE.t();
            if (XQ(awaitPointerEventScope.UF(), j2)) {
                return null;
            }
            float fS = S(awaitPointerEventScope.getViewConfiguration(), iNr);
            Ref.LongRef longRef3 = new Ref.LongRef();
            longRef3.element = j2;
            TouchSlopDetector touchSlopDetector3 = new TouchSlopDetector(null, jT2, null);
            function22 = function2;
            longRef = longRef3;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
            f3 = fS;
            touchSlopDetector = touchSlopDetector3;
            awaitPointerEventScope2 = awaitPointerEventScope;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.f16707n = function22;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.f16710t = awaitPointerEventScope2;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.f16704O = longRef;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.J2 = touchSlopDetector;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.f16709r = pointerEventPass2;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.f16708o = f3;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.f16705S = i8;
            objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i8, pointerEventPass2);
            if (objPJg != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i7 == 1) {
            float f5 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.f16708o;
            TouchSlopDetector touchSlopDetector4 = (TouchSlopDetector) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.J2;
            Ref.LongRef longRef4 = (Ref.LongRef) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.f16704O;
            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.f16710t;
            Function2 function23 = (Function2) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.f16707n;
            ResultKt.throwOnFailure(obj3);
            f4 = f5;
            awaitPointerEventScope2 = awaitPointerEventScope3;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
            touchSlopDetector2 = touchSlopDetector4;
            function22 = function23;
            longRef2 = longRef4;
            PointerEvent pointerEvent = (PointerEvent) obj3;
            List changes = pointerEvent.getChanges();
            size = changes.size();
            i2 = 0;
            while (true) {
                if (i2 < size) {
                }
                i2 = i3 + 1;
                pointerEventPass2 = pointerEventPass;
            }
            pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange != null) {
                return pointerEventPass;
            }
            if (PointerEventKt.nr(pointerInputChange)) {
            }
            pointerEventPass2 = pointerEventPass;
            i8 = 1;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.f16707n = function22;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.f16710t = awaitPointerEventScope2;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.f16704O = longRef;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.J2 = touchSlopDetector;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.f16709r = pointerEventPass2;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.f16708o = f3;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.f16705S = i8;
            objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i8, pointerEventPass2);
            if (objPJg != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i7 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        float f6 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.f16708o;
        PointerInputChange pointerInputChange2 = (PointerInputChange) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.f16709r;
        TouchSlopDetector touchSlopDetector5 = (TouchSlopDetector) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.J2;
        longRef = (Ref.LongRef) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.f16704O;
        AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.f16710t;
        Function2 function24 = (Function2) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.f16707n;
        ResultKt.throwOnFailure(obj3);
        touchSlopDetector = touchSlopDetector5;
        pointerEventPass = null;
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
        f3 = f6;
        awaitPointerEventScope2 = awaitPointerEventScope4;
        if (!pointerInputChange2.ck()) {
            return pointerEventPass;
        }
        function22 = function24;
        pointerEventPass2 = pointerEventPass;
        i8 = 1;
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.f16707n = function22;
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.f16710t = awaitPointerEventScope2;
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.f16704O = longRef;
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.J2 = touchSlopDetector;
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.f16709r = pointerEventPass2;
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.f16708o = f3;
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.f16705S = i8;
        objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i8, pointerEventPass2);
        if (objPJg != coroutine_suspended) {
            float f7 = f3;
            touchSlopDetector2 = touchSlopDetector;
            obj3 = objPJg;
            longRef2 = longRef;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$12;
            f4 = f7;
            PointerEvent pointerEvent2 = (PointerEvent) obj3;
            List changes2 = pointerEvent2.getChanges();
            size = changes2.size();
            i2 = 0;
            while (true) {
                if (i2 < size) {
                    pointerEventPass = pointerEventPass2;
                    obj = pointerEventPass;
                    break;
                }
                obj = changes2.get(i2);
                pointerEventPass = pointerEventPass2;
                i3 = i2;
                if (PointerId.t(((PointerInputChange) obj).getId(), longRef2.element)) {
                    break;
                }
                i2 = i3 + 1;
                pointerEventPass2 = pointerEventPass;
            }
            pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange != null || pointerInputChange.ck()) {
                return pointerEventPass;
            }
            if (PointerEventKt.nr(pointerInputChange)) {
                long jN = touchSlopDetector2.n(pointerInputChange, f4);
                if ((9223372034707292159L & jN) != 9205357640488583168L) {
                    function22.invoke(pointerInputChange, Offset.nr(jN));
                    if (pointerInputChange.ck()) {
                        return pointerInputChange;
                    }
                    touchSlopDetector2.O();
                    touchSlopDetector = touchSlopDetector2;
                    f3 = f4;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$13;
                    longRef = longRef2;
                } else {
                    PointerEventPass pointerEventPass3 = PointerEventPass.f32077O;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.f16707n = function22;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.f16710t = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.f16704O = longRef2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.J2 = touchSlopDetector2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.f16709r = pointerInputChange;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.f16708o = f4;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.f16705S = 2;
                    if (awaitPointerEventScope2.HBN(pointerEventPass3, dragGestureDetectorKt$awaitTouchSlopOrCancellation$13) != coroutine_suspended) {
                        function24 = function22;
                        touchSlopDetector = touchSlopDetector2;
                        f3 = f4;
                        pointerInputChange2 = pointerInputChange;
                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$13;
                        longRef = longRef2;
                        if (!pointerInputChange2.ck()) {
                        }
                    }
                }
            } else {
                List changes3 = pointerEvent2.getChanges();
                int size2 = changes3.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size2) {
                        obj2 = pointerEventPass;
                        break;
                    }
                    obj2 = changes3.get(i9);
                    if (((PointerInputChange) obj2).getPressed()) {
                        break;
                    }
                    i9++;
                }
                PointerInputChange pointerInputChange3 = (PointerInputChange) obj2;
                if (pointerInputChange3 == null) {
                    return pointerEventPass;
                }
                longRef2.element = pointerInputChange3.getId();
                touchSlopDetector = touchSlopDetector2;
                f3 = f4;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$13;
                longRef = longRef2;
            }
            pointerEventPass2 = pointerEventPass;
            i8 = 1;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.f16707n = function22;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.f16710t = awaitPointerEventScope2;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.f16704O = longRef;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.J2 = touchSlopDetector;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.f16709r = pointerEventPass2;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.f16708o = f3;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.f16705S = i8;
            objPJg = AwaitPointerEventScope.pJg(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i8, pointerEventPass2);
            if (objPJg != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean XQ(PointerEvent pointerEvent, long j2) {
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
