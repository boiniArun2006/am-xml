package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0017J6\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J?\u0010'\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!2\"\u0010&\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0$\u0012\u0006\u0012\u0004\u0018\u00010%0#H\u0096@ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\f2\u0006\u0010*\u001a\u00020)H\u0000ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\u000fH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\fH\u0000¢\u0006\u0004\b/\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00104\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R \u0010=\u001a\b\u0012\u0004\u0012\u00020\f098\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b;\u0010<R(\u0010D\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b-\u0010>\u0012\u0004\bC\u0010\u000e\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0016\u0010F\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010>R\u001c\u0010H\u001a\u00020)8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bG\u00103R\u001c\u0010J\u001a\u00020I8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001f\u00103R\u0014\u0010M\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010LR\u001a\u0010Q\u001a\u00020N8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010O\u001a\u0004\bE\u0010PR\u0014\u0010R\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010@\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006S"}, d2 = {"Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "Landroidx/compose/foundation/OverscrollEffect;", "Landroid/content/Context;", "context", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/graphics/Color;", "glowColor", "Landroidx/compose/foundation/layout/PaddingValues;", "glowDrawPadding", "<init>", "(Landroid/content/Context;Landroidx/compose/ui/unit/Density;JLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "nr", "()V", "Landroidx/compose/ui/geometry/Offset;", "delta", "", "ck", "(J)Z", "scroll", "", "HI", "(J)F", "qie", "az", "ty", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "Lkotlin/Function1;", "performScroll", "KN", "(JILkotlin/jvm/functions/Function1;)J", "Landroidx/compose/ui/unit/Velocity;", "velocity", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "performFling", "xMQ", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/geometry/Size;", "size", "Ik", "(J)V", "O", "()J", "gh", c.f62177j, "Landroidx/compose/ui/unit/Density;", "rl", "J", "pointerPosition", "Landroidx/compose/foundation/EdgeEffectWrapper;", "t", "Landroidx/compose/foundation/EdgeEffectWrapper;", "edgeEffectWrapper", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/runtime/MutableState;", "mUb", "()Landroidx/compose/runtime/MutableState;", "redrawSignal", "Z", "getInvalidationEnabled$foundation_release", "()Z", "setInvalidationEnabled$foundation_release", "(Z)V", "getInvalidationEnabled$foundation_release$annotations", "invalidationEnabled", "J2", "scrollCycleInProgress", "Uo", "containerSize", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "pointerInputNode", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/node/DelegatableNode;", "()Landroidx/compose/ui/node/DelegatableNode;", "node", "isInProgress", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 7 AndroidOverscroll.android.kt\nandroidx/compose/foundation/EdgeEffectWrapper\n+ 8 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n1#1,1073:1\n69#2:1074\n69#2:1077\n69#2:1080\n69#2:1083\n69#2:1086\n65#2:1089\n65#2:1092\n65#2:1095\n65#2:1098\n65#2:1101\n65#2:1108\n69#2:1111\n65#2:1113\n69#2:1116\n65#2:1118\n65#2:1121\n69#2:1124\n69#2:1127\n65#2:1155\n69#2:1159\n65#2:1172\n65#2:1175\n65#2:1178\n65#2:1181\n69#2:1184\n69#2:1187\n69#2:1190\n69#2:1193\n65#2:1196\n69#2:1199\n69#2:1206\n65#2:1209\n69#2:1212\n69#2:1219\n69#2:1222\n65#2:1225\n65#2:1232\n69#2:1235\n65#2:1238\n65#2:1245\n70#3:1075\n70#3:1078\n70#3:1081\n70#3:1084\n70#3:1087\n60#3:1090\n60#3:1093\n60#3:1096\n60#3:1099\n60#3:1102\n53#3,3:1105\n60#3:1109\n70#3:1112\n60#3:1114\n70#3:1117\n60#3:1119\n60#3:1122\n70#3:1125\n70#3:1128\n60#3:1131\n60#3:1134\n70#3:1137\n70#3:1140\n60#3:1148\n70#3:1151\n80#3:1153\n60#3:1156\n70#3:1160\n53#3,3:1164\n60#3:1173\n60#3:1176\n60#3:1179\n60#3:1182\n70#3:1185\n70#3:1188\n70#3:1191\n70#3:1194\n60#3:1197\n70#3:1200\n70#3:1204\n70#3:1207\n60#3:1210\n70#3:1213\n70#3:1217\n70#3:1220\n70#3:1223\n60#3:1226\n60#3:1230\n60#3:1233\n70#3:1236\n60#3:1239\n60#3:1243\n60#3:1246\n22#4:1076\n22#4:1079\n22#4:1082\n22#4:1085\n22#4:1088\n22#4:1091\n22#4:1094\n22#4:1097\n22#4:1100\n22#4:1103\n22#4:1110\n22#4:1115\n22#4:1120\n22#4:1123\n22#4:1126\n22#4:1129\n22#4:1132\n22#4:1135\n22#4:1138\n22#4:1141\n22#4:1149\n22#4:1157\n22#4:1161\n22#4:1174\n22#4:1177\n22#4:1180\n22#4:1183\n22#4:1186\n22#4:1189\n22#4:1192\n22#4:1195\n22#4:1198\n22#4:1201\n22#4:1205\n22#4:1208\n22#4:1211\n22#4:1214\n22#4:1218\n22#4:1221\n22#4:1224\n22#4:1227\n22#4:1231\n22#4:1234\n22#4:1237\n22#4:1240\n22#4:1244\n22#4:1247\n30#5:1104\n273#5:1154\n30#5:1163\n57#6:1130\n57#6:1133\n61#6:1136\n61#6:1139\n57#6:1147\n61#6:1150\n57#6:1158\n61#6:1162\n61#6:1202\n61#6:1203\n61#6:1215\n61#6:1216\n57#6:1228\n57#6:1229\n57#6:1241\n57#6:1242\n948#7,5:1142\n948#7,5:1167\n30#8:1152\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n*L\n562#1:1074\n563#1:1077\n572#1:1080\n574#1:1083\n583#1:1086\n589#1:1089\n590#1:1092\n599#1:1095\n601#1:1098\n610#1:1101\n628#1:1108\n628#1:1111\n629#1:1113\n629#1:1116\n648#1:1118\n651#1:1121\n658#1:1124\n661#1:1127\n776#1:1155\n777#1:1159\n850#1:1172\n851#1:1175\n854#1:1178\n855#1:1181\n858#1:1184\n859#1:1187\n862#1:1190\n863#1:1193\n870#1:1196\n871#1:1199\n877#1:1206\n884#1:1209\n885#1:1212\n892#1:1219\n899#1:1222\n900#1:1225\n907#1:1232\n914#1:1235\n915#1:1238\n922#1:1245\n562#1:1075\n563#1:1078\n572#1:1081\n574#1:1084\n583#1:1087\n589#1:1090\n590#1:1093\n599#1:1096\n601#1:1099\n610#1:1102\n614#1:1105,3\n628#1:1109\n628#1:1112\n629#1:1114\n629#1:1117\n648#1:1119\n651#1:1122\n658#1:1125\n661#1:1128\n696#1:1131\n700#1:1134\n708#1:1137\n712#1:1140\n764#1:1148\n764#1:1151\n764#1:1153\n776#1:1156\n777#1:1160\n778#1:1164,3\n850#1:1173\n851#1:1176\n854#1:1179\n855#1:1182\n858#1:1185\n859#1:1188\n862#1:1191\n863#1:1194\n870#1:1197\n871#1:1200\n873#1:1204\n877#1:1207\n884#1:1210\n885#1:1213\n888#1:1217\n892#1:1220\n899#1:1223\n900#1:1226\n903#1:1230\n907#1:1233\n914#1:1236\n915#1:1239\n918#1:1243\n922#1:1246\n562#1:1076\n563#1:1079\n572#1:1082\n574#1:1085\n583#1:1088\n589#1:1091\n590#1:1094\n599#1:1097\n601#1:1100\n610#1:1103\n628#1:1110\n629#1:1115\n648#1:1120\n651#1:1123\n658#1:1126\n661#1:1129\n696#1:1132\n700#1:1135\n708#1:1138\n712#1:1141\n764#1:1149\n776#1:1157\n777#1:1161\n850#1:1174\n851#1:1177\n854#1:1180\n855#1:1183\n858#1:1186\n859#1:1189\n862#1:1192\n863#1:1195\n870#1:1198\n871#1:1201\n873#1:1205\n877#1:1208\n884#1:1211\n885#1:1214\n888#1:1218\n892#1:1221\n899#1:1224\n900#1:1227\n903#1:1231\n907#1:1234\n914#1:1237\n915#1:1240\n918#1:1244\n922#1:1247\n614#1:1104\n775#1:1154\n778#1:1163\n696#1:1130\n700#1:1133\n708#1:1136\n712#1:1139\n764#1:1147\n764#1:1150\n776#1:1158\n777#1:1162\n871#1:1202\n873#1:1203\n885#1:1215\n888#1:1216\n900#1:1228\n903#1:1229\n915#1:1241\n918#1:1242\n755#1:1142,5\n834#1:1167,5\n764#1:1152\n*E\n"})
public final class AndroidEdgeEffectOverscrollEffect implements OverscrollEffect {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private boolean scrollCycleInProgress;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private long pointerId;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private boolean invalidationEnabled;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private long containerSize;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final DelegatableNode node;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Density density;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final MutableState redrawSignal;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private long pointerPosition;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final EdgeEffectWrapper edgeEffectWrapper;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final SuspendingPointerInputModifierNode pointerInputNode;

    public /* synthetic */ AndroidEdgeEffectOverscrollEffect(Context context, Density density, long j2, PaddingValues paddingValues, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, density, j2, paddingValues);
    }

    private AndroidEdgeEffectOverscrollEffect(Context context, Density density, long j2, PaddingValues paddingValues) {
        this.density = density;
        this.pointerPosition = Offset.INSTANCE.rl();
        EdgeEffectWrapper edgeEffectWrapper = new EdgeEffectWrapper(context, ColorKt.mUb(j2));
        this.edgeEffectWrapper = edgeEffectWrapper;
        this.redrawSignal = SnapshotStateKt.xMQ(Unit.INSTANCE, SnapshotStateKt.gh());
        this.invalidationEnabled = true;
        this.containerSize = Size.INSTANCE.rl();
        this.pointerId = PointerId.n(-1L);
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNodeN = SuspendingPointerInputFilterKt.n(new PointerInputEventHandler() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1

            /* JADX INFO: renamed from: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1", f = "AndroidOverscroll.android.kt", i = {0, 1}, l = {783, 787}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture"}, s = {"L$0", "L$0"})
            @SourceDebugExtension({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1073:1\n230#2,3:1074\n34#2,6:1077\n233#2:1083\n117#2,2:1084\n34#2,6:1086\n119#2:1092\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1\n*L\n787#1:1074,3\n787#1:1077,6\n787#1:1083\n791#1:1084,2\n791#1:1086,6\n791#1:1092\n*E\n"})
            static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ AndroidEdgeEffectOverscrollEffect f15831O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f15832n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                private /* synthetic */ Object f15833t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, Continuation continuation) {
                    super(2, continuation);
                    this.f15831O = androidEdgeEffectOverscrollEffect;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f15831O, continuation);
                    anonymousClass1.f15833t = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
                    return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
                
                    if (r15 != r0) goto L18;
                 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005e -> B:18:0x0061). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    AnonymousClass1 anonymousClass1;
                    AwaitPointerEventScope awaitPointerEventScope;
                    Object obj2;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.f15832n;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2) {
                                awaitPointerEventScope = (AwaitPointerEventScope) this.f15833t;
                                ResultKt.throwOnFailure(obj);
                                anonymousClass1 = this;
                                List changes = ((PointerEvent) obj).getChanges();
                                ArrayList arrayList = new ArrayList(changes.size());
                                int size = changes.size();
                                int i3 = 0;
                                for (int i5 = 0; i5 < size; i5++) {
                                    Object obj3 = changes.get(i5);
                                    if (((PointerInputChange) obj3).getPressed()) {
                                        arrayList.add(obj3);
                                    }
                                }
                                AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = anonymousClass1.f15831O;
                                int size2 = arrayList.size();
                                while (true) {
                                    if (i3 < size2) {
                                        obj2 = arrayList.get(i3);
                                        if (PointerId.t(((PointerInputChange) obj2).getId(), androidEdgeEffectOverscrollEffect.pointerId)) {
                                            break;
                                        }
                                        i3++;
                                    } else {
                                        obj2 = null;
                                        break;
                                    }
                                }
                                PointerInputChange pointerInputChange = (PointerInputChange) obj2;
                                if (pointerInputChange == null) {
                                    pointerInputChange = (PointerInputChange) CollectionsKt.firstOrNull((List) arrayList);
                                }
                                if (pointerInputChange != null) {
                                    anonymousClass1.f15831O.pointerId = pointerInputChange.getId();
                                    anonymousClass1.f15831O.pointerPosition = pointerInputChange.getPosition();
                                }
                                if (arrayList.isEmpty()) {
                                    anonymousClass1.f15831O.pointerId = PointerId.n(-1L);
                                    return Unit.INSTANCE;
                                }
                                anonymousClass1.f15833t = awaitPointerEventScope;
                                anonymousClass1.f15832n = 2;
                                obj = AwaitPointerEventScope.pJg(awaitPointerEventScope, null, this, 1, null);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            awaitPointerEventScope = (AwaitPointerEventScope) this.f15833t;
                            ResultKt.throwOnFailure(obj);
                            anonymousClass1 = this;
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.f15833t;
                        this.f15833t = awaitPointerEventScope2;
                        this.f15832n = 1;
                        anonymousClass1 = this;
                        obj = TapGestureDetectorKt.J2(awaitPointerEventScope2, false, null, anonymousClass1, 2, null);
                        if (obj != coroutine_suspended) {
                            awaitPointerEventScope = awaitPointerEventScope2;
                        }
                        return coroutine_suspended;
                    }
                    PointerInputChange pointerInputChange2 = (PointerInputChange) obj;
                    anonymousClass1.f15831O.pointerId = pointerInputChange2.getId();
                    anonymousClass1.f15831O.pointerPosition = pointerInputChange2.getPosition();
                    anonymousClass1.f15833t = awaitPointerEventScope;
                    anonymousClass1.f15832n = 2;
                    obj = AwaitPointerEventScope.pJg(awaitPointerEventScope, null, this, 1, null);
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                Object objO = ForEachGestureKt.O(pointerInputScope, new AnonymousClass1(this.f15830n, null), continuation);
                return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : Unit.INSTANCE;
            }
        });
        this.pointerInputNode = suspendingPointerInputModifierNodeN;
        this.node = Build.VERSION.SDK_INT >= 31 ? new StretchOverscrollNode(suspendingPointerInputModifierNodeN, this, edgeEffectWrapper) : new GlowOverscrollNode(suspendingPointerInputModifierNodeN, this, edgeEffectWrapper, paddingValues);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean ck(long delta) {
        boolean zO;
        if (this.edgeEffectWrapper.o()) {
            int i2 = (int) (delta >> 32);
            if (Float.intBitsToFloat(i2) < 0.0f) {
                EdgeEffectCompat.f16103n.J2(this.edgeEffectWrapper.xMQ(), Float.intBitsToFloat(i2));
                zO = this.edgeEffectWrapper.o();
            } else {
                zO = false;
            }
        }
        if (this.edgeEffectWrapper.S()) {
            int i3 = (int) (delta >> 32);
            if (Float.intBitsToFloat(i3) > 0.0f) {
                EdgeEffectCompat.f16103n.J2(this.edgeEffectWrapper.gh(), Float.intBitsToFloat(i3));
                zO = zO || this.edgeEffectWrapper.S();
            }
        }
        if (this.edgeEffectWrapper.nY()) {
            int i5 = (int) (delta & 4294967295L);
            if (Float.intBitsToFloat(i5) < 0.0f) {
                EdgeEffectCompat.f16103n.J2(this.edgeEffectWrapper.az(), Float.intBitsToFloat(i5));
                zO = zO || this.edgeEffectWrapper.nY();
            }
        }
        if (this.edgeEffectWrapper.ck()) {
            int i7 = (int) (delta & 4294967295L);
            if (Float.intBitsToFloat(i7) > 0.0f) {
                EdgeEffectCompat.f16103n.J2(this.edgeEffectWrapper.Uo(), Float.intBitsToFloat(i7));
                return zO || this.edgeEffectWrapper.ck();
            }
        }
        return zO;
    }

    private final void nr() {
        boolean z2;
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        EdgeEffect edgeEffect = edgeEffectWrapper.topEffect;
        boolean z3 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = !edgeEffect.isFinished();
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = edgeEffectWrapper.bottomEffect;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 = !edgeEffect2.isFinished() || z2;
        }
        EdgeEffect edgeEffect3 = edgeEffectWrapper.leftEffect;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 = !edgeEffect3.isFinished() || z2;
        }
        EdgeEffect edgeEffect4 = edgeEffectWrapper.rightEffect;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z2) {
                z3 = false;
            }
            z2 = z3;
        }
        if (z2) {
            gh();
        }
    }

    public final void Ik(long size) {
        boolean zKN = Size.KN(this.containerSize, Size.INSTANCE.rl());
        boolean zKN2 = Size.KN(size, this.containerSize);
        this.containerSize = size;
        if (!zKN2) {
            EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
            int iRoundToInt = MathKt.roundToInt(Float.intBitsToFloat((int) (size >> 32)));
            edgeEffectWrapper.iF(IntSize.t((((long) MathKt.roundToInt(Float.intBitsToFloat((int) (size & 4294967295L)))) & 4294967295L) | (((long) iRoundToInt) << 32)));
        }
        if (zKN || zKN2) {
            return;
        }
        nr();
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* JADX INFO: renamed from: J2, reason: from getter */
    public DelegatableNode getNode() {
        return this.node;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x023e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8 A[PHI: r11
      0x00b8: PHI (r11v9 float) = (r11v8 float), (r11v12 float) binds: [B:43:0x00e9, B:32:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0132 A[PHI: r14
      0x0132: PHI (r14v9 float) = (r14v8 float), (r14v12 float) binds: [B:67:0x0162, B:56:0x012b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.compose.foundation.OverscrollEffect
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long KN(long delta, int source, Function1 performScroll) {
        float fQie;
        float fIntBitsToFloat;
        float fTy;
        float fIntBitsToFloat2;
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        if (Size.az(this.containerSize)) {
            return ((Offset) performScroll.invoke(Offset.nr(delta))).getPackedValue();
        }
        if (!this.scrollCycleInProgress) {
            if (this.edgeEffectWrapper.XQ()) {
                az(Offset.INSTANCE.t());
            }
            if (this.edgeEffectWrapper.aYN()) {
                ty(Offset.INSTANCE.t());
            }
            if (this.edgeEffectWrapper.te()) {
                HI(Offset.INSTANCE.t());
            }
            if (this.edgeEffectWrapper.r()) {
                qie(Offset.INSTANCE.t());
            }
            this.scrollCycleInProgress = true;
        }
        float fT = AndroidOverscroll_androidKt.t(source);
        long jR = Offset.r(delta, fT);
        int i3 = (int) (delta & 4294967295L);
        if (Float.intBitsToFloat(i3) != 0.0f) {
            if (this.edgeEffectWrapper.te() && Float.intBitsToFloat(i3) < 0.0f) {
                fQie = HI(jR);
                if (!this.edgeEffectWrapper.te()) {
                    this.edgeEffectWrapper.az().finish();
                }
                if (fQie == Float.intBitsToFloat((int) (jR & 4294967295L))) {
                    fIntBitsToFloat = Float.intBitsToFloat(i3);
                }
            } else if (!this.edgeEffectWrapper.r() || Float.intBitsToFloat(i3) <= 0.0f) {
                fIntBitsToFloat = 0.0f;
            } else {
                fQie = qie(jR);
                if (!this.edgeEffectWrapper.r()) {
                    this.edgeEffectWrapper.Uo().finish();
                }
                fIntBitsToFloat = fQie == Float.intBitsToFloat((int) (jR & 4294967295L)) ? Float.intBitsToFloat(i3) : fQie / fT;
            }
        }
        int i5 = (int) (delta >> 32);
        if (Float.intBitsToFloat(i5) != 0.0f) {
            if (this.edgeEffectWrapper.XQ() && Float.intBitsToFloat(i5) < 0.0f) {
                fTy = az(jR);
                if (!this.edgeEffectWrapper.XQ()) {
                    this.edgeEffectWrapper.xMQ().finish();
                }
                if (fTy == Float.intBitsToFloat((int) (jR >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i5);
                }
            } else if (!this.edgeEffectWrapper.aYN() || Float.intBitsToFloat(i5) <= 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fTy = ty(jR);
                if (!this.edgeEffectWrapper.aYN()) {
                    this.edgeEffectWrapper.gh().finish();
                }
                fIntBitsToFloat2 = fTy == Float.intBitsToFloat((int) (jR >> 32)) ? Float.intBitsToFloat(i5) : fTy / fT;
            }
        }
        long jO = Offset.O((((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L));
        Offset.Companion companion = Offset.INSTANCE;
        if (!Offset.mUb(jO, companion.t())) {
            gh();
        }
        long jCk = Offset.ck(delta, jO);
        long packedValue = ((Offset) performScroll.invoke(Offset.nr(jCk))).getPackedValue();
        long jCk2 = Offset.ck(jCk, packedValue);
        if ((Float.intBitsToFloat((int) (jCk >> 32)) != 0.0f || Float.intBitsToFloat((int) (jCk & 4294967295L)) != 0.0f) && (Float.intBitsToFloat((int) (packedValue >> 32)) != 0.0f || Float.intBitsToFloat((int) (packedValue & 4294967295L)) != 0.0f)) {
            EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
            if (edgeEffectWrapper.XQ() || edgeEffectWrapper.te() || edgeEffectWrapper.aYN() || edgeEffectWrapper.r()) {
                nr();
            }
        }
        if (NestedScrollSource.O(source, NestedScrollSource.INSTANCE.rl())) {
            int i7 = (int) (jCk2 >> 32);
            if (Float.intBitsToFloat(i7) > 0.5f) {
                az(jCk2);
            } else if (Float.intBitsToFloat(i7) < -0.5f) {
                ty(jCk2);
            } else {
                z3 = false;
                i2 = (int) (jCk2 & 4294967295L);
                if (Float.intBitsToFloat(i2) <= 0.5f) {
                    HI(jCk2);
                } else if (Float.intBitsToFloat(i2) < -0.5f) {
                    qie(jCk2);
                } else {
                    z4 = false;
                    z2 = !z3 || z4;
                }
                z4 = true;
                if (z3) {
                }
            }
            z3 = true;
            i2 = (int) (jCk2 & 4294967295L);
            if (Float.intBitsToFloat(i2) <= 0.5f) {
            }
            z4 = true;
            if (z3) {
            }
        }
        if (!Offset.mUb(jCk, companion.t())) {
            z2 = ck(delta) || z2;
        }
        if (z2) {
            gh();
        }
        return Offset.Ik(jO, packedValue);
    }

    public final long O() {
        long jRl = this.pointerPosition;
        if ((9223372034707292159L & jRl) == 9205357640488583168L) {
            jRl = SizeKt.rl(this.containerSize);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jRl >> 32)) / Float.intBitsToFloat((int) (this.containerSize >> 32));
        return Offset.O((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jRl & 4294967295L)) / Float.intBitsToFloat((int) (this.containerSize & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public boolean Uo() {
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        EdgeEffect edgeEffect = edgeEffectWrapper.topEffect;
        if (edgeEffect != null && EdgeEffectCompat.f16103n.t(edgeEffect) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect2 = edgeEffectWrapper.bottomEffect;
        if (edgeEffect2 != null && EdgeEffectCompat.f16103n.t(edgeEffect2) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect3 = edgeEffectWrapper.leftEffect;
        if (edgeEffect3 != null && EdgeEffectCompat.f16103n.t(edgeEffect3) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect4 = edgeEffectWrapper.rightEffect;
        return (edgeEffect4 == null || EdgeEffectCompat.f16103n.t(edgeEffect4) == 0.0f) ? false : true;
    }

    public final void gh() {
        if (this.invalidationEnabled) {
            this.redrawSignal.setValue(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final MutableState getRedrawSignal() {
        return this.redrawSignal;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r14.invoke(r12, r0) == r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.OverscrollEffect
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object xMQ(long j2, Function2 function2, Continuation continuation) {
        AndroidEdgeEffectOverscrollEffect$applyToFling$1 androidEdgeEffectOverscrollEffect$applyToFling$1;
        long jGh;
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect;
        long jGh2;
        if (continuation instanceof AndroidEdgeEffectOverscrollEffect$applyToFling$1) {
            androidEdgeEffectOverscrollEffect$applyToFling$1 = (AndroidEdgeEffectOverscrollEffect$applyToFling$1) continuation;
            int i2 = androidEdgeEffectOverscrollEffect$applyToFling$1.f15828r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidEdgeEffectOverscrollEffect$applyToFling$1.f15828r = i2 - Integer.MIN_VALUE;
            } else {
                androidEdgeEffectOverscrollEffect$applyToFling$1 = new AndroidEdgeEffectOverscrollEffect$applyToFling$1(this, continuation);
            }
        }
        Object objInvoke = androidEdgeEffectOverscrollEffect$applyToFling$1.f15826O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = androidEdgeEffectOverscrollEffect$applyToFling$1.f15828r;
        if (i3 != 0) {
            if (i3 == 1) {
                ResultKt.throwOnFailure(objInvoke);
                return Unit.INSTANCE;
            }
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jGh = androidEdgeEffectOverscrollEffect$applyToFling$1.f15829t;
            androidEdgeEffectOverscrollEffect = (AndroidEdgeEffectOverscrollEffect) androidEdgeEffectOverscrollEffect$applyToFling$1.f15827n;
            ResultKt.throwOnFailure(objInvoke);
            jGh2 = Velocity.gh(jGh, ((Velocity) objInvoke).getPackedValue());
            androidEdgeEffectOverscrollEffect.scrollCycleInProgress = false;
            if (Velocity.KN(jGh2) <= 0.0f) {
                EdgeEffectCompat.f16103n.nr(androidEdgeEffectOverscrollEffect.edgeEffectWrapper.xMQ(), MathKt.roundToInt(Velocity.KN(jGh2)));
            } else if (Velocity.KN(jGh2) < 0.0f) {
                EdgeEffectCompat.f16103n.nr(androidEdgeEffectOverscrollEffect.edgeEffectWrapper.gh(), -MathKt.roundToInt(Velocity.KN(jGh2)));
            }
            if (Velocity.xMQ(jGh2) <= 0.0f) {
                EdgeEffectCompat.f16103n.nr(androidEdgeEffectOverscrollEffect.edgeEffectWrapper.az(), MathKt.roundToInt(Velocity.xMQ(jGh2)));
            } else if (Velocity.xMQ(jGh2) < 0.0f) {
                EdgeEffectCompat.f16103n.nr(androidEdgeEffectOverscrollEffect.edgeEffectWrapper.Uo(), -MathKt.roundToInt(Velocity.xMQ(jGh2)));
            }
            androidEdgeEffectOverscrollEffect.nr();
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objInvoke);
        if (Size.az(this.containerSize)) {
            Velocity velocityRl = Velocity.rl(j2);
            androidEdgeEffectOverscrollEffect$applyToFling$1.f15828r = 1;
        } else {
            long jN = VelocityKt.n((!this.edgeEffectWrapper.XQ() || Velocity.KN(j2) >= 0.0f) ? (!this.edgeEffectWrapper.aYN() || Velocity.KN(j2) <= 0.0f) ? 0.0f : -EdgeEffectCompat.f16103n.n(this.edgeEffectWrapper.gh(), -Velocity.KN(j2), Float.intBitsToFloat((int) (this.containerSize >> 32)), this.density) : EdgeEffectCompat.f16103n.n(this.edgeEffectWrapper.xMQ(), Velocity.KN(j2), Float.intBitsToFloat((int) (this.containerSize >> 32)), this.density), (!this.edgeEffectWrapper.te() || Velocity.xMQ(j2) >= 0.0f) ? (!this.edgeEffectWrapper.r() || Velocity.xMQ(j2) <= 0.0f) ? 0.0f : -EdgeEffectCompat.f16103n.n(this.edgeEffectWrapper.Uo(), -Velocity.xMQ(j2), Float.intBitsToFloat((int) (4294967295L & this.containerSize)), this.density) : EdgeEffectCompat.f16103n.n(this.edgeEffectWrapper.az(), Velocity.xMQ(j2), Float.intBitsToFloat((int) (4294967295L & this.containerSize)), this.density));
            if (!Velocity.Uo(jN, Velocity.INSTANCE.n())) {
                gh();
            }
            jGh = Velocity.gh(j2, jN);
            Velocity velocityRl2 = Velocity.rl(jGh);
            androidEdgeEffectOverscrollEffect$applyToFling$1.f15827n = this;
            androidEdgeEffectOverscrollEffect$applyToFling$1.f15829t = jGh;
            androidEdgeEffectOverscrollEffect$applyToFling$1.f15828r = 2;
            objInvoke = function2.invoke(velocityRl2, androidEdgeEffectOverscrollEffect$applyToFling$1);
            if (objInvoke != coroutine_suspended) {
                androidEdgeEffectOverscrollEffect = this;
                jGh2 = Velocity.gh(jGh, ((Velocity) objInvoke).getPackedValue());
                androidEdgeEffectOverscrollEffect.scrollCycleInProgress = false;
                if (Velocity.KN(jGh2) <= 0.0f) {
                }
                if (Velocity.xMQ(jGh2) <= 0.0f) {
                }
                androidEdgeEffectOverscrollEffect.nr();
                return Unit.INSTANCE;
            }
        }
        return coroutine_suspended;
    }

    private final float HI(long scroll) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (O() >> 32));
        int i2 = (int) (scroll & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2) / Float.intBitsToFloat((int) (this.containerSize & 4294967295L));
        EdgeEffect edgeEffectAz = this.edgeEffectWrapper.az();
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.f16103n;
        float fO = edgeEffectCompat.O(edgeEffectAz, fIntBitsToFloat2, fIntBitsToFloat) * Float.intBitsToFloat((int) (this.containerSize & 4294967295L));
        if (edgeEffectCompat.t(edgeEffectAz) == 0.0f) {
            return fO;
        }
        return Float.intBitsToFloat(i2);
    }

    private final float az(long scroll) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (O() & 4294967295L));
        int i2 = (int) (scroll >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2) / Float.intBitsToFloat((int) (this.containerSize >> 32));
        EdgeEffect edgeEffectXMQ = this.edgeEffectWrapper.xMQ();
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.f16103n;
        float fO = edgeEffectCompat.O(edgeEffectXMQ, fIntBitsToFloat2, 1 - fIntBitsToFloat) * Float.intBitsToFloat((int) (this.containerSize >> 32));
        if (edgeEffectCompat.t(edgeEffectXMQ) == 0.0f) {
            return fO;
        }
        return Float.intBitsToFloat(i2);
    }

    private final float qie(long scroll) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (O() >> 32));
        int i2 = (int) (scroll & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2) / Float.intBitsToFloat((int) (this.containerSize & 4294967295L));
        EdgeEffect edgeEffectUo = this.edgeEffectWrapper.Uo();
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.f16103n;
        float fIntBitsToFloat3 = (-edgeEffectCompat.O(edgeEffectUo, -fIntBitsToFloat2, 1 - fIntBitsToFloat)) * Float.intBitsToFloat((int) (this.containerSize & 4294967295L));
        if (edgeEffectCompat.t(edgeEffectUo) == 0.0f) {
            return fIntBitsToFloat3;
        }
        return Float.intBitsToFloat(i2);
    }

    private final float ty(long scroll) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (O() & 4294967295L));
        int i2 = (int) (scroll >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2) / Float.intBitsToFloat((int) (this.containerSize >> 32));
        EdgeEffect edgeEffectGh = this.edgeEffectWrapper.gh();
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.f16103n;
        float fIntBitsToFloat3 = (-edgeEffectCompat.O(edgeEffectGh, -fIntBitsToFloat2, fIntBitsToFloat)) * Float.intBitsToFloat((int) (this.containerSize >> 32));
        if (edgeEffectCompat.t(edgeEffectGh) == 0.0f) {
            return fIntBitsToFloat3;
        }
        return Float.intBitsToFloat(i2);
    }
}
