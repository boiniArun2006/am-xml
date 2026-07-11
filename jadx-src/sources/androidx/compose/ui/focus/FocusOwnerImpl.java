package androidx.compose.ui.focus;

import android.os.Trace;
import android.view.KeyEvent;
import androidx.collection.MutableLongSet;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.events.a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B¬\u0001\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012:\u0010\u000e\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0006\u0012!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\r0\u0002\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u0004\u0018\u00010 *\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\r2\u0006\u0010$\u001a\u00020#H\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010&J&\u0010'\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b'\u0010(J$\u0010)\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0004H\u0016¢\u0006\u0004\b+\u0010\u001bJ\u0017\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\rH\u0016¢\u0006\u0004\b-\u0010.J2\u00100\u001a\u00020\r2\u0006\u0010,\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u001a\u00102\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b2\u00103J:\u00106\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u00072\b\u00104\u001a\u0004\u0018\u00010\u000b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\r0\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b6\u00107J(\u00109\u001a\u00020\r2\u0006\u0010$\u001a\u00020#2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\r0\u0003H\u0016ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u001a\u0010;\u001a\u00020\r2\u0006\u0010$\u001a\u00020#H\u0016ø\u0001\u0000¢\u0006\u0004\b;\u0010&J%\u0010>\u001a\u00020\r2\u0006\u0010=\u001a\u00020<2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\r0\u0003H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u001cH\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020\u00042\u0006\u0010@\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\u00042\u0006\u0010@\u001a\u00020FH\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u0004H\u0016¢\u0006\u0004\bI\u0010\u001bJ\u0011\u0010J\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\bJ\u0010KRH\u0010\u000e\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010LR/\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\r0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010OR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010OR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010OR\"\u0010U\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010\u001e\"\u0004\bT\u0010BR\u0014\u0010X\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010WR\u001a\u0010\\\u001a\u00020Y8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010Z\u001a\u0004\bM\u0010[R\u001a\u0010a\u001a\u00020]8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b^\u0010`R\u0018\u0010d\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010cR \u0010j\u001a\b\u0012\u0004\u0012\u00020f0e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010g\u001a\u0004\bh\u0010iR.\u0010n\u001a\u0004\u0018\u00010\u001c2\b\u0010k\u001a\u0004\u0018\u00010\u001c8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bl\u0010R\u001a\u0004\bQ\u0010\u001e\"\u0004\bm\u0010BR*\u0010r\u001a\u00020\r2\u0006\u0010k\u001a\u00020\r8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bo\u0010h\u001a\u0004\bo\u0010p\"\u0004\bq\u0010.R\u0014\u0010v\u001a\u00020s8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010u\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006w"}, d2 = {"Landroidx/compose/ui/focus/FocusOwnerImpl;", "Landroidx/compose/ui/focus/FocusOwner;", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "onRequestApplyChangesListener", "Lkotlin/Function2;", "Landroidx/compose/ui/focus/FocusDirection;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "focusDirection", "Landroidx/compose/ui/geometry/Rect;", "previouslyFocusedRect", "", "onRequestFocusForOwner", "onMoveFocusInterop", "onClearFocusForOwner", "onFocusRectInterop", "Landroidx/compose/ui/unit/LayoutDirection;", "onLayoutDirection", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "forced", "refreshFocusEvents", "ViF", "(ZZ)Z", "te", "()V", "Landroidx/compose/ui/focus/FocusTargetNode;", "nY", "()Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/Modifier$Node;", "iF", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/input/key/KeyEvent;", "keyEvent", "e", "(Landroid/view/KeyEvent;)Z", "XQ", "(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", "E2", "(ILandroidx/compose/ui/geometry/Rect;)Z", "o", "force", "S", "(Z)V", "clearOwnerFocus", "ty", "(ZZZI)Z", "t", "(I)Z", "focusedRect", "onFound", "WPU", "(ILandroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "onFocusedItem", "mUb", "(Landroid/view/KeyEvent;Lkotlin/jvm/functions/Function0;)Z", "O", "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", a.f62811a, "gh", "(Landroidx/compose/ui/input/rotary/RotaryScrollEvent;Lkotlin/jvm/functions/Function0;)Z", "node", "Uo", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Landroidx/compose/ui/focus/FocusEventModifierNode;", c.f62177j, "(Landroidx/compose/ui/focus/FocusEventModifierNode;)V", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "ck", "(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)V", "KN", "Ik", "()Landroidx/compose/ui/geometry/Rect;", "Lkotlin/jvm/functions/Function2;", "rl", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "nr", "J2", "Landroidx/compose/ui/focus/FocusTargetNode;", "g", "setRootFocusNode$ui_release", "rootFocusNode", "Landroidx/compose/ui/focus/FocusInvalidationManager;", "Landroidx/compose/ui/focus/FocusInvalidationManager;", "focusInvalidationManager", "Landroidx/compose/ui/focus/FocusTransactionManager;", "Landroidx/compose/ui/focus/FocusTransactionManager;", "()Landroidx/compose/ui/focus/FocusTransactionManager;", "focusTransactionManager", "Landroidx/compose/ui/Modifier;", "xMQ", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/collection/MutableLongSet;", "Landroidx/collection/MutableLongSet;", "keysCurrentlyDown", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/ui/focus/FocusListener;", "Landroidx/collection/MutableObjectList;", "Z", "()Landroidx/collection/MutableObjectList;", "listeners", "value", "qie", "r", "activeFocusTargetNode", "az", "()Z", "fD", "isFocusCaptured", "Landroidx/compose/ui/focus/FocusState;", "HI", "()Landroidx/compose/ui/focus/FocusState;", "rootState", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFocusOwnerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n+ 2 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 9 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 10 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 11 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 12 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 13 ObjectList.kt\nandroidx/collection/ObjectList\n+ 14 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n*L\n1#1,534:1\n451#1:638\n452#1:659\n454#1:705\n440#1:780\n441#1:856\n442#1:863\n443#1,2:910\n445#1:958\n446#1:965\n451#1:967\n452#1:988\n454#1:1034\n440#1:1036\n441#1:1112\n442#1:1119\n443#1,2:1166\n445#1:1214\n446#1:1221\n451#1:1223\n452#1:1244\n454#1:1290\n440#1:1292\n441#1:1368\n442#1:1375\n443#1,2:1422\n445#1:1470\n446#1:1477\n68#2,5:535\n73#2,8:543\n52#2,4:551\n56#2,4:558\n1#3:540\n1#3:555\n1#3:1754\n641#4,2:541\n641#4,2:556\n119#5:562\n131#5:637\n131#5:706\n131#5:779\n143#5:966\n143#5:1035\n135#5:1222\n135#5:1291\n119#5:1727\n131#5:1728\n119#5:1749\n247#6,5:563\n90#6:568\n91#6,8:574\n437#6,6:582\n447#6,2:589\n449#6,8:594\n457#6,9:605\n466#6,8:617\n100#6,7:625\n251#6:639\n90#6:640\n91#6,8:646\n437#6,5:654\n442#6:660\n447#6,2:662\n449#6,8:667\n457#6,9:678\n466#6,8:690\n100#6,7:698\n277#6:707\n247#6,5:708\n90#6:713\n91#6,8:719\n437#6,5:727\n278#6:732\n442#6:733\n447#6,2:735\n449#6,8:740\n457#6,9:751\n466#6,8:763\n100#6,7:771\n280#6:778\n268#6,2:781\n247#6,5:783\n90#6:788\n91#6,8:794\n437#6,5:802\n270#6,3:807\n442#6:810\n447#6,2:812\n449#6,8:817\n457#6,9:828\n466#6,8:840\n100#6,7:848\n273#6:855\n437#6,12:864\n449#6,8:879\n457#6,9:890\n466#6,8:902\n437#6,12:912\n449#6,8:927\n457#6,9:938\n466#6,8:950\n251#6:968\n90#6:969\n91#6,8:975\n437#6,5:983\n442#6:989\n447#6,2:991\n449#6,8:996\n457#6,9:1007\n466#6,8:1019\n100#6,7:1027\n268#6,2:1037\n247#6,5:1039\n90#6:1044\n91#6,8:1050\n437#6,5:1058\n270#6,3:1063\n442#6:1066\n447#6,2:1068\n449#6,8:1073\n457#6,9:1084\n466#6,8:1096\n100#6,7:1104\n273#6:1111\n437#6,12:1120\n449#6,8:1135\n457#6,9:1146\n466#6,8:1158\n437#6,12:1168\n449#6,8:1183\n457#6,9:1194\n466#6,8:1206\n251#6:1224\n90#6:1225\n91#6,8:1231\n437#6,5:1239\n442#6:1245\n447#6,2:1247\n449#6,8:1252\n457#6,9:1263\n466#6,8:1275\n100#6,7:1283\n268#6,2:1293\n247#6,5:1295\n90#6:1300\n91#6,8:1306\n437#6,5:1314\n270#6,3:1319\n442#6:1322\n447#6,2:1324\n449#6,8:1329\n457#6,9:1340\n466#6,8:1352\n100#6,7:1360\n273#6:1367\n437#6,12:1376\n449#6,8:1391\n457#6,9:1402\n466#6,8:1414\n437#6,12:1424\n449#6,8:1439\n457#6,9:1450\n466#6,8:1462\n268#6,2:1478\n247#6,5:1480\n90#6:1485\n91#6,8:1491\n437#6,5:1499\n270#6,3:1504\n442#6:1507\n447#6,2:1509\n449#6,8:1514\n457#6,9:1525\n466#6,8:1537\n100#6,7:1545\n273#6:1552\n437#6,6:1559\n447#6,2:1566\n449#6,8:1571\n457#6,9:1582\n466#6,8:1594\n437#6,6:1602\n447#6,2:1609\n449#6,8:1614\n457#6,9:1625\n466#6,8:1637\n251#6:1651\n90#6:1652\n91#6,8:1658\n437#6,6:1666\n447#6,2:1673\n449#6,8:1678\n457#6,9:1689\n466#6,8:1701\n100#6,7:1709\n202#6,8:1730\n210#6,6:1743\n217#6,3:1751\n56#7,5:569\n56#7,5:641\n56#7,5:714\n56#7,5:789\n56#7,5:970\n56#7,5:1045\n56#7,5:1226\n56#7,5:1301\n56#7,5:1486\n56#7,5:1653\n102#7,5:1722\n56#7,5:1738\n246#8:588\n246#8:661\n246#8:734\n246#8:811\n246#8:990\n246#8:1067\n246#8:1246\n246#8:1323\n246#8:1508\n246#8:1565\n246#8:1608\n246#8:1672\n246#8:1750\n240#9,3:591\n243#9,3:614\n240#9,3:664\n243#9,3:687\n240#9,3:737\n243#9,3:760\n240#9,3:814\n243#9,3:837\n240#9,3:876\n243#9,3:899\n240#9,3:924\n243#9,3:947\n240#9,3:993\n243#9,3:1016\n240#9,3:1070\n243#9,3:1093\n240#9,3:1132\n243#9,3:1155\n240#9,3:1180\n243#9,3:1203\n240#9,3:1249\n243#9,3:1272\n240#9,3:1326\n243#9,3:1349\n240#9,3:1388\n243#9,3:1411\n240#9,3:1436\n243#9,3:1459\n240#9,3:1511\n243#9,3:1534\n240#9,3:1568\n243#9,3:1591\n240#9,3:1611\n243#9,3:1634\n240#9,3:1675\n243#9,3:1698\n1101#10:602\n1083#10,2:603\n1101#10:675\n1083#10,2:676\n1101#10:748\n1083#10,2:749\n1101#10:825\n1083#10,2:826\n1101#10:887\n1083#10,2:888\n1101#10:935\n1083#10,2:936\n1101#10:1004\n1083#10,2:1005\n1101#10:1081\n1083#10,2:1082\n1101#10:1143\n1083#10,2:1144\n1101#10:1191\n1083#10,2:1192\n1101#10:1260\n1083#10,2:1261\n1101#10:1337\n1083#10,2:1338\n1101#10:1399\n1083#10,2:1400\n1101#10:1447\n1083#10,2:1448\n1101#10:1522\n1083#10,2:1523\n1101#10:1579\n1083#10,2:1580\n1101#10:1622\n1083#10,2:1623\n1101#10:1686\n1083#10,2:1687\n26#11,5:632\n52#12,6:857\n34#12,6:959\n52#12,6:1113\n34#12,6:1215\n52#12,6:1369\n34#12,6:1471\n52#12,6:1553\n34#12,6:1645\n287#13,6:1716\n55#14:1729\n*S KotlinDebug\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n*L\n342#1:638\n342#1:659\n342#1:705\n345#1:780\n345#1:856\n345#1:863\n345#1:910,2\n345#1:958\n345#1:965\n368#1:967\n368#1:988\n368#1:1034\n370#1:1036\n370#1:1112\n370#1:1119\n370#1:1166,2\n370#1:1214\n370#1:1221\n391#1:1223\n391#1:1244\n391#1:1290\n393#1:1292\n393#1:1368\n393#1:1375\n393#1:1422,2\n393#1:1470\n393#1:1477\n161#1:535,5\n161#1:543,8\n200#1:551,4\n200#1:558,4\n161#1:540\n200#1:555\n161#1:541,2\n200#1:556,2\n239#1:562\n342#1:637\n343#1:706\n346#1:779\n368#1:966\n371#1:1035\n391#1:1222\n394#1:1291\n491#1:1727\n491#1:1728\n492#1:1749\n239#1:563,5\n239#1:568\n239#1:574,8\n239#1:582,6\n239#1:589,2\n239#1:594,8\n239#1:605,9\n239#1:617,8\n239#1:625,7\n342#1:639\n342#1:640\n342#1:646,8\n342#1:654,5\n342#1:660\n342#1:662,2\n342#1:667,8\n342#1:678,9\n342#1:690,8\n342#1:698,7\n343#1:707\n343#1:708,5\n343#1:713\n343#1:719,8\n343#1:727,5\n343#1:732\n343#1:733\n343#1:735,2\n343#1:740,8\n343#1:751,9\n343#1:763,8\n343#1:771,7\n343#1:778\n345#1:781,2\n345#1:783,5\n345#1:788\n345#1:794,8\n345#1:802,5\n345#1:807,3\n345#1:810\n345#1:812,2\n345#1:817,8\n345#1:828,9\n345#1:840,8\n345#1:848,7\n345#1:855\n345#1:864,12\n345#1:879,8\n345#1:890,9\n345#1:902,8\n345#1:912,12\n345#1:927,8\n345#1:938,9\n345#1:950,8\n368#1:968\n368#1:969\n368#1:975,8\n368#1:983,5\n368#1:989\n368#1:991,2\n368#1:996,8\n368#1:1007,9\n368#1:1019,8\n368#1:1027,7\n370#1:1037,2\n370#1:1039,5\n370#1:1044\n370#1:1050,8\n370#1:1058,5\n370#1:1063,3\n370#1:1066\n370#1:1068,2\n370#1:1073,8\n370#1:1084,9\n370#1:1096,8\n370#1:1104,7\n370#1:1111\n370#1:1120,12\n370#1:1135,8\n370#1:1146,9\n370#1:1158,8\n370#1:1168,12\n370#1:1183,8\n370#1:1194,9\n370#1:1206,8\n391#1:1224\n391#1:1225\n391#1:1231,8\n391#1:1239,5\n391#1:1245\n391#1:1247,2\n391#1:1252,8\n391#1:1263,9\n391#1:1275,8\n391#1:1283,7\n393#1:1293,2\n393#1:1295,5\n393#1:1300\n393#1:1306,8\n393#1:1314,5\n393#1:1319,3\n393#1:1322\n393#1:1324,2\n393#1:1329,8\n393#1:1340,9\n393#1:1352,8\n393#1:1360,7\n393#1:1367\n393#1:1376,12\n393#1:1391,8\n393#1:1402,9\n393#1:1414,8\n393#1:1424,12\n393#1:1439,8\n393#1:1450,9\n393#1:1462,8\n440#1:1478,2\n440#1:1480,5\n440#1:1485\n440#1:1491,8\n440#1:1499,5\n440#1:1504,3\n440#1:1507\n440#1:1509,2\n440#1:1514,8\n440#1:1525,9\n440#1:1537,8\n440#1:1545,7\n440#1:1552\n442#1:1559,6\n442#1:1566,2\n442#1:1571,8\n442#1:1582,9\n442#1:1594,8\n444#1:1602,6\n444#1:1609,2\n444#1:1614,8\n444#1:1625,9\n444#1:1637,8\n451#1:1651\n451#1:1652\n451#1:1658,8\n451#1:1666,6\n451#1:1673,2\n451#1:1678,8\n451#1:1689,9\n451#1:1701,8\n451#1:1709,7\n491#1:1730,8\n491#1:1743,6\n491#1:1751,3\n239#1:569,5\n342#1:641,5\n343#1:714,5\n345#1:789,5\n368#1:970,5\n370#1:1045,5\n391#1:1226,5\n393#1:1301,5\n440#1:1486,5\n451#1:1653,5\n483#1:1722,5\n491#1:1738,5\n239#1:588\n342#1:661\n343#1:734\n345#1:811\n368#1:990\n370#1:1067\n391#1:1246\n393#1:1323\n440#1:1508\n442#1:1565\n444#1:1608\n451#1:1672\n492#1:1750\n239#1:591,3\n239#1:614,3\n342#1:664,3\n342#1:687,3\n343#1:737,3\n343#1:760,3\n345#1:814,3\n345#1:837,3\n345#1:876,3\n345#1:899,3\n345#1:924,3\n345#1:947,3\n368#1:993,3\n368#1:1016,3\n370#1:1070,3\n370#1:1093,3\n370#1:1132,3\n370#1:1155,3\n370#1:1180,3\n370#1:1203,3\n391#1:1249,3\n391#1:1272,3\n393#1:1326,3\n393#1:1349,3\n393#1:1388,3\n393#1:1411,3\n393#1:1436,3\n393#1:1459,3\n440#1:1511,3\n440#1:1534,3\n442#1:1568,3\n442#1:1591,3\n444#1:1611,3\n444#1:1634,3\n451#1:1675,3\n451#1:1698,3\n239#1:602\n239#1:603,2\n342#1:675\n342#1:676,2\n343#1:748\n343#1:749,2\n345#1:825\n345#1:826,2\n345#1:887\n345#1:888,2\n345#1:935\n345#1:936,2\n368#1:1004\n368#1:1005,2\n370#1:1081\n370#1:1082,2\n370#1:1143\n370#1:1144,2\n370#1:1191\n370#1:1192,2\n391#1:1260\n391#1:1261,2\n393#1:1337\n393#1:1338,2\n393#1:1399\n393#1:1400,2\n393#1:1447\n393#1:1448,2\n440#1:1522\n440#1:1523,2\n442#1:1579\n442#1:1580,2\n444#1:1622\n444#1:1623,2\n451#1:1686\n451#1:1687,2\n331#1:632,5\n345#1:857,6\n345#1:959,6\n370#1:1113,6\n370#1:1215,6\n393#1:1369,6\n393#1:1471,6\n441#1:1553,6\n445#1:1645,6\n477#1:1716,6\n491#1:1729\n*E\n"})
public final class FocusOwnerImpl implements FocusOwner {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final Function0 onLayoutDirection;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final FocusInvalidationManager focusInvalidationManager;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private boolean isFocusCaptured;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private MutableLongSet keysCurrentlyDown;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Function2 onRequestFocusForOwner;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final Function0 onFocusRectInterop;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private FocusTargetNode activeFocusTargetNode;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Function1 onMoveFocusInterop;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Function0 onClearFocusForOwner;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private FocusTargetNode rootFocusNode = new FocusTargetNode(Focusability.INSTANCE.rl(), null, null, 6, null);

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final FocusTransactionManager focusTransactionManager = new FocusTransactionManager();

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final Modifier modifier = new ModifierNodeElement<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        @Override // androidx.compose.ui.node.ModifierNodeElement
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public void rl(FocusTargetNode node) {
        }

        public boolean equals(Object other) {
            return other == this;
        }

        public int hashCode() {
            return this.f31314n.getRootFocusNode().hashCode();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public FocusTargetNode n() {
            return this.f31314n.getRootFocusNode();
        }
    };

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final MutableObjectList listeners = new MutableObjectList(1);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.f31285O.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.f31289t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.J2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.f31286n.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final Modifier.Node iF(DelegatableNode delegatableNode) {
        int iN = NodeKind.n(1024) | NodeKind.n(8192);
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.t("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        Modifier.Node node2 = null;
        if ((node.getAggregateChildKindSet() & iN) != 0) {
            for (Modifier.Node child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & iN) != 0) {
                    if ((NodeKind.n(1024) & child.getKindSet()) != 0) {
                        return node2;
                    }
                    node2 = child;
                }
            }
        }
        return node2;
    }

    private final FocusTargetNode nY() {
        return FocusTraversalKt.rl(this.rootFocusNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void te() {
        if ((ComposeUiFlags.isTrackFocusEnabled && getActiveFocusTargetNode() == null) || this.rootFocusNode.ijL() == FocusStateImpl.J2) {
            this.onClearFocusForOwner.invoke();
        }
    }

    public boolean E2(final int focusDirection, Rect previouslyFocusedRect) {
        Boolean boolWPU = WPU(focusDirection, previouslyFocusedRect, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$takeFocus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                return Boolean.valueOf(focusTargetNode.a(focusDirection));
            }
        });
        if (boolWPU != null) {
            return boolWPU.booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public FocusState HI() {
        return this.rootFocusNode.ijL();
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: J2, reason: from getter */
    public FocusTargetNode getActiveFocusTargetNode() {
        return this.activeFocusTargetNode;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void KN() {
        this.focusInvalidationManager.mUb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean O(KeyEvent keyEvent) {
        SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode;
        int size;
        NodeChain nodes;
        ?? KN;
        NodeChain nodes2;
        if (this.focusInvalidationManager.rl()) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode focusTargetNodeRl = FocusTraversalKt.rl(this.rootFocusNode);
        if (focusTargetNodeRl != null) {
            int iN = NodeKind.n(131072);
            if (!focusTargetNodeRl.getNode().getIsAttached()) {
                InlineClassHelperKt.t("visitAncestors called on an unattached node");
            }
            Modifier.Node node = focusTargetNodeRl.getNode();
            LayoutNode layoutNodeHI = DelegatableNodeKt.HI(focusTargetNodeRl);
            loop0: while (true) {
                if (layoutNodeHI == null) {
                    KN = 0;
                    break;
                }
                if ((layoutNodeHI.getNodes().getHead().getAggregateChildKindSet() & iN) != 0) {
                    while (node != null) {
                        if ((node.getKindSet() & iN) != 0) {
                            ?? mutableVector = 0;
                            KN = node;
                            while (KN != 0) {
                                if (KN instanceof SoftKeyboardInterceptionModifierNode) {
                                    break loop0;
                                }
                                if ((KN.getKindSet() & iN) != 0 && (KN instanceof DelegatingNode)) {
                                    Modifier.Node delegate = ((DelegatingNode) KN).getDelegate();
                                    int i2 = 0;
                                    KN = KN;
                                    mutableVector = mutableVector;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iN) != 0) {
                                            i2++;
                                            mutableVector = mutableVector;
                                            if (i2 == 1) {
                                                KN = delegate;
                                            } else {
                                                if (mutableVector == 0) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (KN != 0) {
                                                    mutableVector.rl(KN);
                                                    KN = 0;
                                                }
                                                mutableVector.rl(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        KN = KN;
                                        mutableVector = mutableVector;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                KN = DelegatableNodeKt.KN(mutableVector);
                            }
                        }
                        node = node.getParent();
                    }
                }
                layoutNodeHI = layoutNodeHI.mYa();
                node = (layoutNodeHI == null || (nodes2 = layoutNodeHI.getNodes()) == null) ? null : nodes2.getTail();
            }
            softKeyboardInterceptionModifierNode = (SoftKeyboardInterceptionModifierNode) KN;
        } else {
            softKeyboardInterceptionModifierNode = null;
        }
        if (softKeyboardInterceptionModifierNode != null) {
            int iN2 = NodeKind.n(131072);
            if (!softKeyboardInterceptionModifierNode.getNode().getIsAttached()) {
                InlineClassHelperKt.t("visitAncestors called on an unattached node");
            }
            Modifier.Node parent = softKeyboardInterceptionModifierNode.getNode().getParent();
            LayoutNode layoutNodeHI2 = DelegatableNodeKt.HI(softKeyboardInterceptionModifierNode);
            ArrayList arrayList = null;
            while (layoutNodeHI2 != null) {
                if ((layoutNodeHI2.getNodes().getHead().getAggregateChildKindSet() & iN2) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & iN2) != 0) {
                            Modifier.Node nodeKN = parent;
                            MutableVector mutableVector2 = null;
                            while (nodeKN != null) {
                                if (nodeKN instanceof SoftKeyboardInterceptionModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(nodeKN);
                                } else if ((nodeKN.getKindSet() & iN2) != 0 && (nodeKN instanceof DelegatingNode)) {
                                    int i3 = 0;
                                    for (Modifier.Node delegate2 = ((DelegatingNode) nodeKN).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                        if ((delegate2.getKindSet() & iN2) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                nodeKN = delegate2;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodeKN != null) {
                                                    mutableVector2.rl(nodeKN);
                                                    nodeKN = null;
                                                }
                                                mutableVector2.rl(delegate2);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                nodeKN = DelegatableNodeKt.KN(mutableVector2);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                layoutNodeHI2 = layoutNodeHI2.mYa();
                parent = (layoutNodeHI2 == null || (nodes = layoutNodeHI2.getNodes()) == null) ? null : nodes.getTail();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i5 = size - 1;
                    if (((SoftKeyboardInterceptionModifierNode) arrayList.get(size)).dR0(keyEvent)) {
                        return true;
                    }
                    if (i5 < 0) {
                        break;
                    }
                    size = i5;
                }
            }
            ?? node2 = softKeyboardInterceptionModifierNode.getNode();
            ?? mutableVector3 = 0;
            while (node2 != 0) {
                if (node2 instanceof SoftKeyboardInterceptionModifierNode) {
                    if (((SoftKeyboardInterceptionModifierNode) node2).dR0(keyEvent)) {
                        return true;
                    }
                } else if ((node2.getKindSet() & iN2) != 0 && (node2 instanceof DelegatingNode)) {
                    Modifier.Node delegate3 = ((DelegatingNode) node2).getDelegate();
                    int i7 = 0;
                    node2 = node2;
                    mutableVector3 = mutableVector3;
                    while (delegate3 != null) {
                        if ((delegate3.getKindSet() & iN2) != 0) {
                            i7++;
                            mutableVector3 = mutableVector3;
                            if (i7 == 1) {
                                node2 = delegate3;
                            } else {
                                if (mutableVector3 == 0) {
                                    mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node2 != 0) {
                                    mutableVector3.rl(node2);
                                    node2 = 0;
                                }
                                mutableVector3.rl(delegate3);
                            }
                        }
                        delegate3 = delegate3.getChild();
                        node2 = node2;
                        mutableVector3 = mutableVector3;
                    }
                    if (i7 == 1) {
                    }
                }
                node2 = DelegatableNodeKt.KN(mutableVector3);
            }
            ?? node3 = softKeyboardInterceptionModifierNode.getNode();
            ?? mutableVector4 = 0;
            while (node3 != 0) {
                if (node3 instanceof SoftKeyboardInterceptionModifierNode) {
                    if (((SoftKeyboardInterceptionModifierNode) node3).HV(keyEvent)) {
                        return true;
                    }
                } else if ((node3.getKindSet() & iN2) != 0 && (node3 instanceof DelegatingNode)) {
                    Modifier.Node delegate4 = ((DelegatingNode) node3).getDelegate();
                    int i8 = 0;
                    node3 = node3;
                    mutableVector4 = mutableVector4;
                    while (delegate4 != null) {
                        if ((delegate4.getKindSet() & iN2) != 0) {
                            i8++;
                            mutableVector4 = mutableVector4;
                            if (i8 == 1) {
                                node3 = delegate4;
                            } else {
                                if (mutableVector4 == 0) {
                                    mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node3 != 0) {
                                    mutableVector4.rl(node3);
                                    node3 = 0;
                                }
                                mutableVector4.rl(delegate4);
                            }
                        }
                        delegate4 = delegate4.getChild();
                        node3 = node3;
                        mutableVector4 = mutableVector4;
                    }
                    if (i8 == 1) {
                    }
                }
                node3 = DelegatableNodeKt.KN(mutableVector4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    if (((SoftKeyboardInterceptionModifierNode) arrayList.get(i9)).HV(keyEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusManager
    public void S(boolean force) {
        ty(force, true, true, FocusDirection.INSTANCE.t());
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void Uo(FocusTargetNode node) {
        this.focusInvalidationManager.xMQ(node);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean XQ(FocusDirection focusDirection, Rect previouslyFocusedRect) {
        return ((Boolean) this.onRequestFocusForOwner.invoke(focusDirection, previouslyFocusedRect)).booleanValue();
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: Z, reason: from getter */
    public MutableObjectList getListeners() {
        return this.listeners;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: az, reason: from getter */
    public boolean getIsFocusCaptured() {
        return this.isFocusCaptured;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void ck(FocusPropertiesModifierNode node) {
        this.focusInvalidationManager.KN(node);
    }

    public void fD(boolean z2) {
        if (!((z2 && getActiveFocusTargetNode() == null) ? false : true)) {
            InlineClassHelperKt.n("Cannot capture focus when the active focus target node is unset");
        }
        this.isFocusCaptured = z2;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final FocusTargetNode getRootFocusNode() {
        return this.rootFocusNode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean gh(RotaryScrollEvent event, Function0 onFocusedItem) {
        RotaryInputModifierNode rotaryInputModifierNode;
        int size;
        NodeChain nodes;
        ?? KN;
        NodeChain nodes2;
        if (this.focusInvalidationManager.rl()) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode focusTargetNodeNY = nY();
        if (focusTargetNodeNY != null) {
            int iN = NodeKind.n(16384);
            if (!focusTargetNodeNY.getNode().getIsAttached()) {
                InlineClassHelperKt.t("visitAncestors called on an unattached node");
            }
            Modifier.Node node = focusTargetNodeNY.getNode();
            LayoutNode layoutNodeHI = DelegatableNodeKt.HI(focusTargetNodeNY);
            loop0: while (true) {
                if (layoutNodeHI == null) {
                    KN = 0;
                    break;
                }
                if ((layoutNodeHI.getNodes().getHead().getAggregateChildKindSet() & iN) != 0) {
                    while (node != null) {
                        if ((node.getKindSet() & iN) != 0) {
                            ?? mutableVector = 0;
                            KN = node;
                            while (KN != 0) {
                                if (KN instanceof RotaryInputModifierNode) {
                                    break loop0;
                                }
                                if ((KN.getKindSet() & iN) != 0 && (KN instanceof DelegatingNode)) {
                                    Modifier.Node delegate = ((DelegatingNode) KN).getDelegate();
                                    int i2 = 0;
                                    KN = KN;
                                    mutableVector = mutableVector;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iN) != 0) {
                                            i2++;
                                            mutableVector = mutableVector;
                                            if (i2 == 1) {
                                                KN = delegate;
                                            } else {
                                                if (mutableVector == 0) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (KN != 0) {
                                                    mutableVector.rl(KN);
                                                    KN = 0;
                                                }
                                                mutableVector.rl(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        KN = KN;
                                        mutableVector = mutableVector;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                KN = DelegatableNodeKt.KN(mutableVector);
                            }
                        }
                        node = node.getParent();
                    }
                }
                layoutNodeHI = layoutNodeHI.mYa();
                node = (layoutNodeHI == null || (nodes2 = layoutNodeHI.getNodes()) == null) ? null : nodes2.getTail();
            }
            rotaryInputModifierNode = (RotaryInputModifierNode) KN;
        } else {
            rotaryInputModifierNode = null;
        }
        if (rotaryInputModifierNode != null) {
            int iN2 = NodeKind.n(16384);
            if (!rotaryInputModifierNode.getNode().getIsAttached()) {
                InlineClassHelperKt.t("visitAncestors called on an unattached node");
            }
            Modifier.Node parent = rotaryInputModifierNode.getNode().getParent();
            LayoutNode layoutNodeHI2 = DelegatableNodeKt.HI(rotaryInputModifierNode);
            ArrayList arrayList = null;
            while (layoutNodeHI2 != null) {
                if ((layoutNodeHI2.getNodes().getHead().getAggregateChildKindSet() & iN2) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & iN2) != 0) {
                            Modifier.Node nodeKN = parent;
                            MutableVector mutableVector2 = null;
                            while (nodeKN != null) {
                                if (nodeKN instanceof RotaryInputModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(nodeKN);
                                } else if ((nodeKN.getKindSet() & iN2) != 0 && (nodeKN instanceof DelegatingNode)) {
                                    int i3 = 0;
                                    for (Modifier.Node delegate2 = ((DelegatingNode) nodeKN).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                        if ((delegate2.getKindSet() & iN2) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                nodeKN = delegate2;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodeKN != null) {
                                                    mutableVector2.rl(nodeKN);
                                                    nodeKN = null;
                                                }
                                                mutableVector2.rl(delegate2);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                nodeKN = DelegatableNodeKt.KN(mutableVector2);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                layoutNodeHI2 = layoutNodeHI2.mYa();
                parent = (layoutNodeHI2 == null || (nodes = layoutNodeHI2.getNodes()) == null) ? null : nodes.getTail();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i5 = size - 1;
                    if (((RotaryInputModifierNode) arrayList.get(size)).ofS(event)) {
                        return true;
                    }
                    if (i5 < 0) {
                        break;
                    }
                    size = i5;
                }
            }
            ?? node2 = rotaryInputModifierNode.getNode();
            ?? mutableVector3 = 0;
            while (node2 != 0) {
                if (node2 instanceof RotaryInputModifierNode) {
                    if (((RotaryInputModifierNode) node2).ofS(event)) {
                        return true;
                    }
                } else if ((node2.getKindSet() & iN2) != 0 && (node2 instanceof DelegatingNode)) {
                    Modifier.Node delegate3 = ((DelegatingNode) node2).getDelegate();
                    int i7 = 0;
                    node2 = node2;
                    mutableVector3 = mutableVector3;
                    while (delegate3 != null) {
                        if ((delegate3.getKindSet() & iN2) != 0) {
                            i7++;
                            mutableVector3 = mutableVector3;
                            if (i7 == 1) {
                                node2 = delegate3;
                            } else {
                                if (mutableVector3 == 0) {
                                    mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node2 != 0) {
                                    mutableVector3.rl(node2);
                                    node2 = 0;
                                }
                                mutableVector3.rl(delegate3);
                            }
                        }
                        delegate3 = delegate3.getChild();
                        node2 = node2;
                        mutableVector3 = mutableVector3;
                    }
                    if (i7 == 1) {
                    }
                }
                node2 = DelegatableNodeKt.KN(mutableVector3);
            }
            if (((Boolean) onFocusedItem.invoke()).booleanValue()) {
                return true;
            }
            ?? node3 = rotaryInputModifierNode.getNode();
            ?? mutableVector4 = 0;
            while (node3 != 0) {
                if (node3 instanceof RotaryInputModifierNode) {
                    if (((RotaryInputModifierNode) node3).wKp(event)) {
                        return true;
                    }
                } else if ((node3.getKindSet() & iN2) != 0 && (node3 instanceof DelegatingNode)) {
                    Modifier.Node delegate4 = ((DelegatingNode) node3).getDelegate();
                    int i8 = 0;
                    node3 = node3;
                    mutableVector4 = mutableVector4;
                    while (delegate4 != null) {
                        if ((delegate4.getKindSet() & iN2) != 0) {
                            i8++;
                            mutableVector4 = mutableVector4;
                            if (i8 == 1) {
                                node3 = delegate4;
                            } else {
                                if (mutableVector4 == 0) {
                                    mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node3 != 0) {
                                    mutableVector4.rl(node3);
                                    node3 = 0;
                                }
                                mutableVector4.rl(delegate4);
                            }
                        }
                        delegate4 = delegate4.getChild();
                        node3 = node3;
                        mutableVector4 = mutableVector4;
                    }
                    if (i8 == 1) {
                    }
                }
                node3 = DelegatableNodeKt.KN(mutableVector4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    if (((RotaryInputModifierNode) arrayList.get(i9)).wKp(event)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00df A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:3:0x000a, B:5:0x0013, B:10:0x0021, B:14:0x002b, B:17:0x0038, B:114:0x0186, B:116:0x0194, B:117:0x0197, B:119:0x01a6, B:122:0x01b7, B:126:0x01c2, B:129:0x01c8, B:130:0x01cd, B:150:0x020c, B:131:0x01d1, B:133:0x01d8, B:135:0x01dc, B:137:0x01e6, B:139:0x01ed, B:143:0x01f4, B:145:0x01fd, B:146:0x0201, B:147:0x0204, B:151:0x0211, B:152:0x0216, B:154:0x021c, B:156:0x0222, B:159:0x022d, B:161:0x0235, B:168:0x024c, B:169:0x024e, B:170:0x025e, B:172:0x0262, B:174:0x0266, B:201:0x02c2, B:178:0x0272, B:180:0x027b, B:182:0x0281, B:184:0x028a, B:186:0x0291, B:188:0x0294, B:189:0x0297, B:191:0x029d, B:192:0x02a4, B:194:0x02ac, B:195:0x02b1, B:197:0x02b7, B:198:0x02ba, B:202:0x02cd, B:206:0x02dd, B:207:0x02ed, B:209:0x02f1, B:211:0x02f5, B:238:0x0351, B:215:0x0301, B:217:0x030a, B:219:0x0310, B:221:0x0319, B:223:0x0320, B:225:0x0323, B:226:0x0326, B:228:0x032c, B:229:0x0333, B:231:0x033b, B:232:0x0340, B:234:0x0346, B:235:0x0349, B:240:0x035e, B:242:0x0365, B:247:0x0377, B:248:0x0379, B:20:0x0040, B:22:0x004e, B:23:0x0051, B:25:0x005b, B:28:0x006c, B:32:0x0077, B:63:0x00d5, B:65:0x00d9, B:35:0x007c, B:37:0x0083, B:39:0x0087, B:41:0x0091, B:43:0x0098, B:47:0x009f, B:49:0x00a8, B:50:0x00ac, B:51:0x00af, B:54:0x00b7, B:55:0x00bc, B:56:0x00c1, B:58:0x00c7, B:60:0x00cd, B:66:0x00df, B:68:0x00ef, B:69:0x00f2, B:71:0x0100, B:74:0x0111, B:78:0x011c, B:109:0x017a, B:111:0x017e, B:81:0x0121, B:83:0x0128, B:85:0x012c, B:87:0x0136, B:89:0x013d, B:93:0x0144, B:95:0x014d, B:96:0x0151, B:97:0x0154, B:100:0x015c, B:101:0x0161, B:102:0x0166, B:104:0x016c, B:106:0x0172), top: B:253:0x000a }] */
    /* JADX WARN: Type inference failed for: r12v20, types: [T, androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r13v25, types: [T, androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r5v18, types: [T, androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v25, types: [T, androidx.compose.ui.Modifier$Node, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v31, types: [T, androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v38, types: [T, androidx.compose.ui.Modifier$Node, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v9, types: [T, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.focus.FocusOwner
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mUb(KeyEvent keyEvent, Function0 onFocusedItem) {
        Object obj;
        Modifier.Node node;
        NodeChain nodes;
        Object obj2;
        NodeChain nodes2;
        NodeChain nodes3;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.focusInvalidationManager.rl()) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                return false;
            }
            if (!e(keyEvent)) {
                return false;
            }
            FocusTargetNode focusTargetNodeNY = nY();
            if (focusTargetNodeNY == null || (node = iF(focusTargetNodeNY)) == null) {
                if (focusTargetNodeNY != null) {
                    int iN = NodeKind.n(8192);
                    if (!focusTargetNodeNY.getNode().getIsAttached()) {
                        InlineClassHelperKt.t("visitAncestors called on an unattached node");
                    }
                    Modifier.Node node2 = focusTargetNodeNY.getNode();
                    LayoutNode layoutNodeHI = DelegatableNodeKt.HI(focusTargetNodeNY);
                    loop10: while (true) {
                        if (layoutNodeHI == null) {
                            obj2 = null;
                            break;
                        }
                        if ((layoutNodeHI.getNodes().getHead().getAggregateChildKindSet() & iN) != 0) {
                            while (node2 != null) {
                                if ((node2.getKindSet() & iN) != 0) {
                                    MutableVector mutableVector = null;
                                    Modifier.Node nodeKN = node2;
                                    while (nodeKN != null) {
                                        if (nodeKN instanceof KeyInputModifierNode) {
                                            obj2 = nodeKN;
                                            break loop10;
                                        }
                                        if ((nodeKN.getKindSet() & iN) != 0 && (nodeKN instanceof DelegatingNode)) {
                                            Modifier.Node delegate = ((DelegatingNode) nodeKN).getDelegate();
                                            int i2 = 0;
                                            nodeKN = nodeKN;
                                            mutableVector = mutableVector;
                                            while (delegate != null) {
                                                if ((delegate.getKindSet() & iN) != 0) {
                                                    i2++;
                                                    mutableVector = mutableVector;
                                                    if (i2 == 1) {
                                                        nodeKN = delegate;
                                                    } else {
                                                        if (mutableVector == null) {
                                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                        }
                                                        if (nodeKN != null) {
                                                            mutableVector.rl(nodeKN);
                                                            nodeKN = null;
                                                        }
                                                        mutableVector.rl(delegate);
                                                    }
                                                }
                                                delegate = delegate.getChild();
                                                nodeKN = nodeKN;
                                                mutableVector = mutableVector;
                                            }
                                            if (i2 == 1) {
                                            }
                                        }
                                        nodeKN = DelegatableNodeKt.KN(mutableVector);
                                    }
                                }
                                node2 = node2.getParent();
                            }
                        }
                        layoutNodeHI = layoutNodeHI.mYa();
                        node2 = (layoutNodeHI == null || (nodes2 = layoutNodeHI.getNodes()) == null) ? null : nodes2.getTail();
                    }
                    KeyInputModifierNode keyInputModifierNode = (KeyInputModifierNode) obj2;
                    if (keyInputModifierNode != null) {
                        node = keyInputModifierNode.getNode();
                    } else {
                        FocusTargetNode focusTargetNode = this.rootFocusNode;
                        int iN2 = NodeKind.n(8192);
                        if (!focusTargetNode.getNode().getIsAttached()) {
                            InlineClassHelperKt.t("visitAncestors called on an unattached node");
                        }
                        Modifier.Node parent = focusTargetNode.getNode().getParent();
                        LayoutNode layoutNodeHI2 = DelegatableNodeKt.HI(focusTargetNode);
                        loop14: while (true) {
                            if (layoutNodeHI2 == null) {
                                obj = null;
                                break;
                            }
                            if ((layoutNodeHI2.getNodes().getHead().getAggregateChildKindSet() & iN2) != 0) {
                                while (parent != null) {
                                    if ((parent.getKindSet() & iN2) != 0) {
                                        MutableVector mutableVector2 = null;
                                        Modifier.Node nodeKN2 = parent;
                                        while (nodeKN2 != null) {
                                            if (nodeKN2 instanceof KeyInputModifierNode) {
                                                obj = nodeKN2;
                                                break loop14;
                                            }
                                            if ((nodeKN2.getKindSet() & iN2) != 0 && (nodeKN2 instanceof DelegatingNode)) {
                                                Modifier.Node delegate2 = ((DelegatingNode) nodeKN2).getDelegate();
                                                int i3 = 0;
                                                nodeKN2 = nodeKN2;
                                                mutableVector2 = mutableVector2;
                                                while (delegate2 != null) {
                                                    if ((delegate2.getKindSet() & iN2) != 0) {
                                                        i3++;
                                                        mutableVector2 = mutableVector2;
                                                        if (i3 == 1) {
                                                            nodeKN2 = delegate2;
                                                        } else {
                                                            if (mutableVector2 == null) {
                                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                            }
                                                            if (nodeKN2 != null) {
                                                                mutableVector2.rl(nodeKN2);
                                                                nodeKN2 = null;
                                                            }
                                                            mutableVector2.rl(delegate2);
                                                        }
                                                    }
                                                    delegate2 = delegate2.getChild();
                                                    nodeKN2 = nodeKN2;
                                                    mutableVector2 = mutableVector2;
                                                }
                                                if (i3 == 1) {
                                                }
                                            }
                                            nodeKN2 = DelegatableNodeKt.KN(mutableVector2);
                                        }
                                    }
                                    parent = parent.getParent();
                                }
                            }
                            layoutNodeHI2 = layoutNodeHI2.mYa();
                            parent = (layoutNodeHI2 == null || (nodes = layoutNodeHI2.getNodes()) == null) ? null : nodes.getTail();
                        }
                        KeyInputModifierNode keyInputModifierNode2 = (KeyInputModifierNode) obj;
                        node = keyInputModifierNode2 != null ? keyInputModifierNode2.getNode() : null;
                    }
                }
            }
            if (node != null) {
                int iN3 = NodeKind.n(8192);
                if (!node.getNode().getIsAttached()) {
                    InlineClassHelperKt.t("visitAncestors called on an unattached node");
                }
                Modifier.Node parent2 = node.getNode().getParent();
                LayoutNode layoutNodeHI3 = DelegatableNodeKt.HI(node);
                ArrayList arrayList = null;
                while (layoutNodeHI3 != null) {
                    if ((layoutNodeHI3.getNodes().getHead().getAggregateChildKindSet() & iN3) != 0) {
                        while (parent2 != null) {
                            if ((parent2.getKindSet() & iN3) != 0) {
                                Modifier.Node nodeKN3 = parent2;
                                MutableVector mutableVector3 = null;
                                while (nodeKN3 != null) {
                                    if (nodeKN3 instanceof KeyInputModifierNode) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(nodeKN3);
                                    } else if ((nodeKN3.getKindSet() & iN3) != 0 && (nodeKN3 instanceof DelegatingNode)) {
                                        int i5 = 0;
                                        for (Modifier.Node delegate3 = ((DelegatingNode) nodeKN3).getDelegate(); delegate3 != null; delegate3 = delegate3.getChild()) {
                                            if ((delegate3.getKindSet() & iN3) != 0) {
                                                i5++;
                                                if (i5 == 1) {
                                                    nodeKN3 = delegate3;
                                                } else {
                                                    if (mutableVector3 == null) {
                                                        mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (nodeKN3 != null) {
                                                        mutableVector3.rl(nodeKN3);
                                                        nodeKN3 = null;
                                                    }
                                                    mutableVector3.rl(delegate3);
                                                }
                                            }
                                        }
                                        if (i5 == 1) {
                                        }
                                    }
                                    nodeKN3 = DelegatableNodeKt.KN(mutableVector3);
                                }
                            }
                            parent2 = parent2.getParent();
                        }
                    }
                    layoutNodeHI3 = layoutNodeHI3.mYa();
                    parent2 = (layoutNodeHI3 == null || (nodes3 = layoutNodeHI3.getNodes()) == null) ? null : nodes3.getTail();
                }
                if (arrayList != null) {
                    int size = arrayList.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i7 = size - 1;
                            if (((KeyInputModifierNode) arrayList.get(size)).ub(keyEvent)) {
                                return true;
                            }
                            if (i7 < 0) {
                                break;
                            }
                            size = i7;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                }
                ?? node3 = node.getNode();
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                objectRef2.element = node3;
                while (true) {
                    T t3 = objectRef2.element;
                    if (t3 != 0) {
                        if (t3 instanceof KeyInputModifierNode) {
                            if (((KeyInputModifierNode) t3).ub(keyEvent)) {
                                return true;
                            }
                        } else if ((((Modifier.Node) t3).getKindSet() & iN3) != 0) {
                            T t4 = objectRef2.element;
                            if (t4 instanceof DelegatingNode) {
                                int i8 = 0;
                                for (?? delegate4 = ((DelegatingNode) t4).getDelegate(); delegate4 != 0; delegate4 = delegate4.getChild()) {
                                    if ((delegate4.getKindSet() & iN3) != 0) {
                                        i8++;
                                        if (i8 == 1) {
                                            objectRef2.element = delegate4;
                                        } else {
                                            MutableVector mutableVector4 = (MutableVector) objectRef.element;
                                            ?? mutableVector5 = mutableVector4;
                                            if (mutableVector4 == null) {
                                                mutableVector5 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            objectRef.element = mutableVector5;
                                            Modifier.Node node4 = (Modifier.Node) objectRef2.element;
                                            if (node4 != null) {
                                                mutableVector5.rl(node4);
                                                objectRef2.element = null;
                                            }
                                            MutableVector mutableVector6 = (MutableVector) objectRef.element;
                                            if (mutableVector6 != 0) {
                                                mutableVector6.rl(delegate4);
                                            }
                                        }
                                    }
                                }
                                if (i8 == 1) {
                                }
                            }
                        }
                        objectRef2.element = DelegatableNodeKt.KN((MutableVector) objectRef.element);
                    } else {
                        if (((Boolean) onFocusedItem.invoke()).booleanValue()) {
                            return true;
                        }
                        ?? node5 = node.getNode();
                        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                        Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                        objectRef4.element = node5;
                        while (true) {
                            T t5 = objectRef4.element;
                            if (t5 != 0) {
                                if (t5 instanceof KeyInputModifierNode) {
                                    if (((KeyInputModifierNode) t5).jO(keyEvent)) {
                                        return true;
                                    }
                                } else if ((((Modifier.Node) t5).getKindSet() & iN3) != 0) {
                                    T t6 = objectRef4.element;
                                    if (t6 instanceof DelegatingNode) {
                                        int i9 = 0;
                                        for (?? delegate5 = ((DelegatingNode) t6).getDelegate(); delegate5 != 0; delegate5 = delegate5.getChild()) {
                                            if ((delegate5.getKindSet() & iN3) != 0) {
                                                i9++;
                                                if (i9 == 1) {
                                                    objectRef4.element = delegate5;
                                                } else {
                                                    MutableVector mutableVector7 = (MutableVector) objectRef3.element;
                                                    ?? mutableVector8 = mutableVector7;
                                                    if (mutableVector7 == null) {
                                                        mutableVector8 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    objectRef3.element = mutableVector8;
                                                    Modifier.Node node6 = (Modifier.Node) objectRef4.element;
                                                    if (node6 != null) {
                                                        mutableVector8.rl(node6);
                                                        objectRef4.element = null;
                                                    }
                                                    MutableVector mutableVector9 = (MutableVector) objectRef3.element;
                                                    if (mutableVector9 != 0) {
                                                        mutableVector9.rl(delegate5);
                                                    }
                                                }
                                            }
                                        }
                                        if (i9 == 1) {
                                        }
                                    }
                                }
                                objectRef4.element = DelegatableNodeKt.KN((MutableVector) objectRef3.element);
                            } else {
                                if (arrayList != null) {
                                    int size2 = arrayList.size();
                                    for (int i10 = 0; i10 < size2; i10++) {
                                        if (((KeyInputModifierNode) arrayList.get(i10)).jO(keyEvent)) {
                                            return true;
                                        }
                                    }
                                    Unit unit2 = Unit.INSTANCE;
                                }
                                Unit unit3 = Unit.INSTANCE;
                            }
                        }
                    }
                }
            }
            return false;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void n(FocusEventModifierNode node) {
        this.focusInvalidationManager.Uo(node);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void o() {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            FocusTransactionsKt.t(this.rootFocusNode, true, true);
            return;
        }
        FocusTransactionManager focusTransactionManager = getFocusTransactionManager();
        if (focusTransactionManager.getOngoingTransaction()) {
            FocusTransactionsKt.t(this.rootFocusNode, true, true);
            return;
        }
        try {
            focusTransactionManager.O();
            FocusTransactionsKt.t(this.rootFocusNode, true, true);
        } finally {
            focusTransactionManager.Uo();
        }
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void r(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNode2 = this.activeFocusTargetNode;
        this.activeFocusTargetNode = focusTargetNode;
        if (focusTargetNode == null || focusTargetNode2 != focusTargetNode) {
            fD(false);
        }
        if (ComposeUiFlags.isSemanticAutofillEnabled) {
            MutableObjectList listeners = getListeners();
            Object[] objArr = listeners.content;
            int i2 = listeners._size;
            for (int i3 = 0; i3 < i2; i3++) {
                ((FocusListener) objArr[i3]).n(focusTargetNode2, focusTargetNode);
            }
        }
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: rl, reason: from getter */
    public FocusTransactionManager getFocusTransactionManager() {
        return this.focusTransactionManager;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Boolean] */
    @Override // androidx.compose.ui.focus.FocusManager
    public boolean t(final int focusDirection) {
        if (ComposeUiFlags.isViewFocusFixEnabled && ((Boolean) this.onMoveFocusInterop.invoke(FocusDirection.xMQ(focusDirection))).booleanValue()) {
            return true;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = Boolean.FALSE;
        int generation = getFocusTransactionManager().getGeneration();
        FocusTargetNode activeFocusTargetNode = getActiveFocusTargetNode();
        Boolean boolWPU = WPU(focusDirection, (Rect) this.onFocusRectInterop.invoke(), new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$moveFocus$focusSearchSuccess$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Boolean] */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                objectRef.element = Boolean.valueOf(focusTargetNode.a(focusDirection));
                Boolean bool = (Boolean) objectRef.element;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            }
        });
        int generation2 = getFocusTransactionManager().getGeneration();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(boolWPU, bool) && (generation != generation2 || (ComposeUiFlags.isTrackFocusEnabled && activeFocusTargetNode != getActiveFocusTargetNode()))) {
            return true;
        }
        if (boolWPU != null && objectRef.element != 0) {
            if (Intrinsics.areEqual(boolWPU, bool) && Intrinsics.areEqual(objectRef.element, bool)) {
                return true;
            }
            if (FocusOwnerImplKt.n(focusDirection)) {
                return ty(false, true, false, focusDirection) && E2(focusDirection, null);
            }
            if (!ComposeUiFlags.isViewFocusFixEnabled && ((Boolean) this.onMoveFocusInterop.invoke(FocusDirection.xMQ(focusDirection))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0065 A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #0 {all -> 0x0041, blocks: (B:16:0x0037, B:18:0x003d, B:21:0x0043, B:23:0x0048, B:25:0x0051, B:29:0x0065), top: B:37:0x0037 }] */
    @Override // androidx.compose.ui.focus.FocusOwner
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean ty(boolean force, boolean refreshFocusEvents, boolean clearOwnerFocus, int focusDirection) {
        boolean zT2 = false;
        if (!ComposeUiFlags.isTrackFocusEnabled) {
            FocusTransactionManager focusTransactionManager = getFocusTransactionManager();
            FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1 focusOwnerImpl$clearFocus$clearedFocusSuccessfully$1 = new Function0<Unit>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
            try {
                if (focusTransactionManager.getOngoingTransaction()) {
                    focusTransactionManager.J2();
                }
                focusTransactionManager.O();
                if (focusOwnerImpl$clearFocus$clearedFocusSuccessfully$1 != null) {
                    focusTransactionManager.cancellationListener.rl(focusOwnerImpl$clearFocus$clearedFocusSuccessfully$1);
                }
                if (!force) {
                    int i2 = WhenMappings.$EnumSwitchMapping$0[FocusTransactionsKt.J2(this.rootFocusNode, focusDirection).ordinal()];
                    if (i2 != 1 && i2 != 2 && i2 != 3) {
                        zT2 = FocusTransactionsKt.t(this.rootFocusNode, force, refreshFocusEvents);
                    }
                    focusTransactionManager.Uo();
                }
            } catch (Throwable th) {
                focusTransactionManager.Uo();
                throw th;
            }
        } else if (force) {
            zT2 = ViF(force, refreshFocusEvents);
        } else {
            int i3 = WhenMappings.$EnumSwitchMapping$0[FocusTransactionsKt.J2(this.rootFocusNode, focusDirection).ordinal()];
            if (i3 != 1 && i3 != 2 && i3 != 3) {
                if (i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                zT2 = ViF(force, refreshFocusEvents);
            }
        }
        if (zT2 && clearOwnerFocus) {
            this.onClearFocusForOwner.invoke();
        }
        return zT2;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public Modifier getModifier() {
        return this.modifier;
    }

    public FocusOwnerImpl(Function1 function1, Function2 function2, Function1 function12, Function0 function0, Function0 function02, Function0 function03) {
        this.onRequestFocusForOwner = function2;
        this.onMoveFocusInterop = function12;
        this.onClearFocusForOwner = function0;
        this.onFocusRectInterop = function02;
        this.onLayoutDirection = function03;
        this.focusInvalidationManager = new FocusInvalidationManager(function1, new FocusOwnerImpl$focusInvalidationManager$1(this), new PropertyReference0Impl(this) { // from class: androidx.compose.ui.focus.FocusOwnerImpl$focusInvalidationManager$2
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((FocusOwnerImpl) this.receiver).HI();
            }
        }, new MutablePropertyReference0Impl(this) { // from class: androidx.compose.ui.focus.FocusOwnerImpl$focusInvalidationManager$3
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((FocusOwnerImpl) this.receiver).getActiveFocusTargetNode();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((FocusOwnerImpl) this.receiver).r((FocusTargetNode) obj);
            }
        });
    }

    private final boolean ViF(boolean forced, boolean refreshFocusEvents) {
        FocusStateImpl focusStateImpl;
        NodeChain nodes;
        if (getActiveFocusTargetNode() == null) {
            return true;
        }
        if (getIsFocusCaptured() && !forced) {
            return false;
        }
        FocusTargetNode activeFocusTargetNode = getActiveFocusTargetNode();
        r(null);
        if (refreshFocusEvents && activeFocusTargetNode != null) {
            if (getIsFocusCaptured()) {
                focusStateImpl = FocusStateImpl.f31345O;
            } else {
                focusStateImpl = FocusStateImpl.f31346n;
            }
            activeFocusTargetNode.pr(focusStateImpl, FocusStateImpl.J2);
            int iN = NodeKind.n(1024);
            if (!activeFocusTargetNode.getNode().getIsAttached()) {
                InlineClassHelperKt.t("visitAncestors called on an unattached node");
            }
            Modifier.Node parent = activeFocusTargetNode.getNode().getParent();
            LayoutNode layoutNodeHI = DelegatableNodeKt.HI(activeFocusTargetNode);
            while (layoutNodeHI != null) {
                if ((layoutNodeHI.getNodes().getHead().getAggregateChildKindSet() & iN) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & iN) != 0) {
                            MutableVector mutableVector = null;
                            Modifier.Node nodeKN = parent;
                            while (nodeKN != null) {
                                if (nodeKN instanceof FocusTargetNode) {
                                    ((FocusTargetNode) nodeKN).pr(FocusStateImpl.f31349t, FocusStateImpl.J2);
                                } else if ((nodeKN.getKindSet() & iN) != 0 && (nodeKN instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node delegate = ((DelegatingNode) nodeKN).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                        if ((delegate.getKindSet() & iN) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                nodeKN = delegate;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodeKN != null) {
                                                    mutableVector.rl(nodeKN);
                                                    nodeKN = null;
                                                }
                                                mutableVector.rl(delegate);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                nodeKN = DelegatableNodeKt.KN(mutableVector);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                layoutNodeHI = layoutNodeHI.mYa();
                if (layoutNodeHI != null && (nodes = layoutNodeHI.getNodes()) != null) {
                    parent = nodes.getTail();
                } else {
                    parent = null;
                }
            }
        }
        return true;
    }

    private final boolean e(KeyEvent keyEvent) {
        long jN = KeyEvent_androidKt.n(keyEvent);
        int iRl = KeyEvent_androidKt.rl(keyEvent);
        KeyEventType.Companion companion = KeyEventType.INSTANCE;
        if (KeyEventType.J2(iRl, companion.n())) {
            MutableLongSet mutableLongSet = this.keysCurrentlyDown;
            if (mutableLongSet == null) {
                mutableLongSet = new MutableLongSet(3);
                this.keysCurrentlyDown = mutableLongSet;
            }
            mutableLongSet.qie(jN);
        } else if (KeyEventType.J2(iRl, companion.rl())) {
            MutableLongSet mutableLongSet2 = this.keysCurrentlyDown;
            if (mutableLongSet2 != null && mutableLongSet2.n(jN)) {
                MutableLongSet mutableLongSet3 = this.keysCurrentlyDown;
                if (mutableLongSet3 != null) {
                    mutableLongSet3.az(jN);
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public Rect Ik() {
        FocusTargetNode focusTargetNodeNY = nY();
        if (focusTargetNodeNY != null) {
            return FocusTraversalKt.nr(focusTargetNodeNY);
        }
        return null;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public Boolean WPU(int focusDirection, Rect focusedRect, final Function1 onFound) {
        final FocusTargetNode focusTargetNodeNY = nY();
        if (focusTargetNodeNY != null) {
            FocusRequester focusRequesterN = FocusTraversalKt.n(focusTargetNodeNY, focusDirection, (LayoutDirection) this.onLayoutDirection.invoke());
            FocusRequester.Companion companion = FocusRequester.INSTANCE;
            if (Intrinsics.areEqual(focusRequesterN, companion.n())) {
                return null;
            }
            if (Intrinsics.areEqual(focusRequesterN, companion.t())) {
                FocusTargetNode focusTargetNodeNY2 = nY();
                if (focusTargetNodeNY2 == null) {
                    return null;
                }
                return (Boolean) onFound.invoke(focusTargetNodeNY2);
            }
            if (!Intrinsics.areEqual(focusRequesterN, companion.rl())) {
                return Boolean.valueOf(focusRequesterN.nr(onFound));
            }
        } else {
            focusTargetNodeNY = null;
        }
        return FocusTraversalKt.O(this.rootFocusNode, focusDirection, (LayoutDirection) this.onLayoutDirection.invoke(), focusedRect, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$focusSearch$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                boolean zBooleanValue;
                if (Intrinsics.areEqual(focusTargetNode, focusTargetNodeNY)) {
                    zBooleanValue = false;
                } else {
                    if (Intrinsics.areEqual(focusTargetNode, this.getRootFocusNode())) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    zBooleanValue = ((Boolean) onFound.invoke(focusTargetNode)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            }
        });
    }
}
