package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.caoccao.javet.values.reference.V8ValueTypedArray;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001:\u0002ijB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0019\u001a\u00060\u0018R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJC\u0010!\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010 \u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010\u000bJ\u0017\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010\u000bJ\u001f\u0010(\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010+J'\u0010.\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\f2\u0006\u00101\u001a\u000200H\u0000¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\fH\u0000¢\u0006\u0004\b4\u0010\u000eJ\r\u00105\u001a\u00020\f¢\u0006\u0004\b5\u0010\u000eJ\r\u00106\u001a\u00020\f¢\u0006\u0004\b6\u0010\u000eJ\r\u00107\u001a\u00020\f¢\u0006\u0004\b7\u0010\u000eJ\u0013\u0010:\u001a\b\u0012\u0004\u0012\u00020908¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\fH\u0000¢\u0006\u0004\b<\u0010\u000eJ\u000f\u0010=\u001a\u00020\fH\u0000¢\u0006\u0004\b=\u0010\u000eJ\u001e\u0010@\u001a\u00020\u00162\n\u0010?\u001a\u0006\u0012\u0002\b\u00030>H\u0000ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\u000f\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001a\u0010N\u001a\u00020I8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR$\u0010T\u001a\u00020\u001c2\u0006\u0010O\u001a\u00020\u001c8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001a\u0010 \u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010\bR$\u0010\u000f\u001a\u00020\u00062\u0006\u0010O\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bX\u0010V\u001a\u0004\bY\u0010\bR\u001e\u0010\\\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u001e\u0010]\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010[R\u001c\u0010_\u001a\b\u0018\u00010\u0018R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010^R\u0018\u0010c\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010e\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010dR\u0014\u0010h\u001a\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bf\u0010g\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006k"}, d2 = {"Landroidx/compose/ui/node/NodeChain;", "", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/compose/ui/Modifier$Node;", "S", "()Landroidx/compose/ui/Modifier$Node;", "paddedHead", "E2", "(Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/Modifier$Node;", "", "iF", "()V", TtmlNode.TAG_HEAD, "", "offset", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/Modifier$Element;", TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_AFTER, "", "shouldAttachOnInsert", "Landroidx/compose/ui/node/NodeChain$Differ;", "mUb", "(Landroidx/compose/ui/Modifier$Node;ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/runtime/collection/MutableVector;Z)Landroidx/compose/ui/node/NodeChain$Differ;", TtmlNode.START, "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "WPU", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator;)V", "tail", "te", "(ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;Z)V", "node", "KN", "aYN", "element", "parent", "Uo", "(Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/Modifier$Node;", "r", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/Modifier$Node;", "prev", "next", "X", "(Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)V", "Landroidx/compose/ui/Modifier;", "m", "e", "(Landroidx/compose/ui/Modifier;)V", "ViF", "fD", "Z", "nY", "", "Landroidx/compose/ui/layout/ModifierInfo;", "ty", "()Ljava/util/List;", "XQ", "g", "Landroidx/compose/ui/node/NodeKind;", "type", "Ik", "(I)Z", "", "toString", "()Ljava/lang/String;", c.f62177j, "Landroidx/compose/ui/node/LayoutNode;", "az", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/InnerNodeCoordinator;", "rl", "Landroidx/compose/ui/node/InnerNodeCoordinator;", "qie", "()Landroidx/compose/ui/node/InnerNodeCoordinator;", "innerCoordinator", "<set-?>", "t", "Landroidx/compose/ui/node/NodeCoordinator;", "HI", "()Landroidx/compose/ui/node/NodeCoordinator;", "outerCoordinator", "nr", "Landroidx/compose/ui/Modifier$Node;", "ck", "O", "gh", "J2", "Landroidx/compose/runtime/collection/MutableVector;", "current", V8ValueTypedArray.PROPERTY_BUFFER, "Landroidx/compose/ui/node/NodeChain$Differ;", "cachedDiffer", "Landroidx/compose/ui/node/NodeChain$Logger;", "xMQ", "Landroidx/compose/ui/node/NodeChain$Logger;", "logger", "()I", "aggregateChildKindSet", "o", "()Z", "isUpdating", "Differ", "Logger", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 9 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,807:1\n712#1,6:861\n683#1,6:867\n683#1,6:873\n691#1,3:880\n694#1,3:886\n712#1,6:889\n712#1,6:895\n662#1,6:908\n683#1,3:914\n668#1,2:917\n671#1,2:962\n686#1,3:964\n673#1:967\n663#1:968\n666#1,2:969\n683#1,3:971\n668#1,2:974\n671#1,2:1019\n686#1,3:1021\n673#1:1024\n683#1,6:1025\n703#1,12:1031\n715#1,3:1086\n709#1:1089\n712#1,6:1090\n699#1,16:1096\n715#1,3:1155\n709#1:1158\n700#1:1159\n662#1,6:1160\n683#1,3:1166\n668#1,2:1169\n671#1,2:1214\n686#1,3:1216\n673#1:1219\n663#1:1220\n691#1,6:1221\n56#2,5:808\n56#2,5:813\n56#2,5:818\n76#2,7:826\n76#2,7:835\n76#2,7:842\n76#2,7:850\n56#2,5:903\n1101#3:823\n1083#3,2:824\n1083#3,2:858\n1084#3:879\n1101#3:939\n1083#3,2:940\n1101#3:996\n1083#3,2:997\n1101#3:1063\n1083#3,2:1064\n1101#3:1132\n1083#3,2:1133\n1101#3:1191\n1083#3,2:1192\n472#4:833\n472#4:834\n472#4:849\n472#4:857\n472#4:883\n641#4,2:884\n1#5:860\n83#6:901\n246#7:902\n246#7:925\n246#7:982\n246#7:1049\n246#7:1118\n246#7:1177\n437#8,6:919\n447#8,2:926\n449#8,8:931\n457#8,9:942\n466#8,8:954\n437#8,6:976\n447#8,2:983\n449#8,8:988\n457#8,9:999\n466#8,8:1011\n437#8,6:1043\n447#8,2:1050\n449#8,8:1055\n457#8,9:1066\n466#8,8:1078\n437#8,6:1112\n447#8,2:1119\n449#8,8:1124\n457#8,9:1135\n466#8,8:1147\n437#8,6:1171\n447#8,2:1178\n449#8,8:1183\n457#8,9:1194\n466#8,8:1206\n240#9,3:928\n243#9,3:951\n240#9,3:985\n243#9,3:1008\n240#9,3:1052\n243#9,3:1075\n240#9,3:1121\n243#9,3:1144\n240#9,3:1180\n243#9,3:1203\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n*L\n226#1:861,6\n285#1:867,6\n302#1:873,6\n327#1:880,3\n327#1:886,3\n366#1:889,6\n370#1:895,6\n657#1:908,6\n657#1:914,3\n657#1:917,2\n657#1:962,2\n657#1:964,3\n657#1:967\n657#1:968\n662#1:969,2\n662#1:971,3\n662#1:974,2\n662#1:1019,2\n662#1:1021,3\n662#1:1024\n667#1:1025,6\n699#1:1031,12\n699#1:1086,3\n699#1:1089\n704#1:1090,6\n720#1:1096,16\n720#1:1155,3\n720#1:1158\n720#1:1159\n727#1:1160,6\n727#1:1166,3\n727#1:1169,2\n727#1:1214,2\n727#1:1216,3\n727#1:1219\n727#1:1220\n743#1:1221,6\n69#1:808,5\n77#1:813,5\n85#1:818,5\n131#1:826,7\n161#1:835,7\n162#1:842,7\n191#1:850,7\n599#1:903,5\n121#1:823\n121#1:824,2\n203#1:858,2\n325#1:879\n657#1:939\n657#1:940,2\n662#1:996\n662#1:997,2\n699#1:1063\n699#1:1064,2\n720#1:1132\n720#1:1133,2\n727#1:1191\n727#1:1192,2\n132#1:833\n133#1:834\n183#1:849\n195#1:857\n360#1:883\n360#1:884,2\n420#1:901\n420#1:902\n657#1:925\n662#1:982\n699#1:1049\n720#1:1118\n727#1:1177\n657#1:919,6\n657#1:926,2\n657#1:931,8\n657#1:942,9\n657#1:954,8\n662#1:976,6\n662#1:983,2\n662#1:988,8\n662#1:999,9\n662#1:1011,8\n699#1:1043,6\n699#1:1050,2\n699#1:1055,8\n699#1:1066,9\n699#1:1078,8\n720#1:1112,6\n720#1:1119,2\n720#1:1124,8\n720#1:1135,9\n720#1:1147,8\n727#1:1171,6\n727#1:1178,2\n727#1:1183,8\n727#1:1194,9\n727#1:1206,8\n657#1:928,3\n657#1:951,3\n662#1:985,3\n662#1:1008,3\n699#1:1052,3\n699#1:1075,3\n720#1:1121,3\n720#1:1144,3\n727#1:1180,3\n727#1:1203,3\n*E\n"})
public final class NodeChain {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private MutableVector current;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private Differ cachedDiffer;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Modifier.Node head;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private MutableVector buffer;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final LayoutNode layoutNode;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final Modifier.Node tail;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final InnerNodeCoordinator innerCoordinator;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private NodeCoordinator outerCoordinator;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private Logger logger;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u001c\b\u0082\u0004\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\u0014R(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\"\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006."}, d2 = {"Landroidx/compose/ui/node/NodeChain$Differ;", "Landroidx/compose/ui/node/DiffCallback;", "Landroidx/compose/ui/Modifier$Node;", "node", "", "offset", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/Modifier$Element;", TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_AFTER, "", "shouldAttachOnInsert", "<init>", "(Landroidx/compose/ui/node/NodeChain;Landroidx/compose/ui/Modifier$Node;ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/runtime/collection/MutableVector;Z)V", "oldIndex", "newIndex", "rl", "(II)Z", "", "t", "(I)V", "atIndex", c.f62177j, "(II)V", "nr", "Landroidx/compose/ui/Modifier$Node;", "getNode", "()Landroidx/compose/ui/Modifier$Node;", "Uo", "(Landroidx/compose/ui/Modifier$Node;)V", "I", "getOffset", "()I", "KN", "Landroidx/compose/runtime/collection/MutableVector;", "getBefore", "()Landroidx/compose/runtime/collection/MutableVector;", "J2", "(Landroidx/compose/runtime/collection/MutableVector;)V", "getAfter", "O", "Z", "getShouldAttachOnInsert", "()Z", "xMQ", "(Z)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain$Differ\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,807:1\n472#2:808\n472#2:809\n472#2:810\n472#2:811\n472#2:814\n472#2:815\n83#3:812\n246#4:813\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain$Differ\n*L\n434#1:808\n441#1:809\n442#1:810\n467#1:811\n483#1:814\n484#1:815\n468#1:812\n468#1:813\n*E\n"})
    private final class Differ implements DiffCallback {

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private boolean shouldAttachOnInsert;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private Modifier.Node node;

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private MutableVector after;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private int offset;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private MutableVector before;

        public Differ(Modifier.Node node, int i2, MutableVector mutableVector, MutableVector mutableVector2, boolean z2) {
            this.node = node;
            this.offset = i2;
            this.before = mutableVector;
            this.after = mutableVector2;
            this.shouldAttachOnInsert = z2;
        }

        public final void J2(MutableVector mutableVector) {
            this.before = mutableVector;
        }

        public final void KN(int i2) {
            this.offset = i2;
        }

        public final void O(MutableVector mutableVector) {
            this.after = mutableVector;
        }

        public final void Uo(Modifier.Node node) {
            this.node = node;
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public void n(int atIndex, int oldIndex) {
            Modifier.Node child = this.node.getChild();
            Intrinsics.checkNotNull(child);
            Logger logger = NodeChain.this.logger;
            if (logger != null) {
                MutableVector mutableVector = this.before;
                logger.nr(oldIndex, (Modifier.Element) mutableVector.content[this.offset + oldIndex], child);
            }
            if ((NodeKind.n(2) & child.getKindSet()) != 0) {
                NodeCoordinator coordinator = child.getCoordinator();
                Intrinsics.checkNotNull(coordinator);
                NodeCoordinator wrappedBy = coordinator.getWrappedBy();
                NodeCoordinator wrapped = coordinator.getWrapped();
                Intrinsics.checkNotNull(wrapped);
                if (wrappedBy != null) {
                    wrappedBy.ENe(wrapped);
                }
                wrapped.Ai(wrappedBy);
                NodeChain.this.WPU(this.node, wrapped);
            }
            this.node = NodeChain.this.KN(child);
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public void nr(int oldIndex, int newIndex) {
            Modifier.Node child = this.node.getChild();
            Intrinsics.checkNotNull(child);
            this.node = child;
            MutableVector mutableVector = this.before;
            int i2 = this.offset;
            Modifier.Element element = (Modifier.Element) mutableVector.content[i2 + oldIndex];
            Modifier.Element element2 = (Modifier.Element) this.after.content[i2 + newIndex];
            if (Intrinsics.areEqual(element, element2)) {
                Logger logger = NodeChain.this.logger;
                if (logger != null) {
                    int i3 = this.offset;
                    logger.O(i3 + oldIndex, i3 + newIndex, element, element2, this.node);
                    return;
                }
                return;
            }
            NodeChain.this.X(element, element2, this.node);
            Logger logger2 = NodeChain.this.logger;
            if (logger2 != null) {
                int i5 = this.offset;
                logger2.rl(i5 + oldIndex, i5 + newIndex, element, element2, this.node);
            }
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public boolean rl(int oldIndex, int newIndex) {
            MutableVector mutableVector = this.before;
            int i2 = this.offset;
            return NodeChainKt.nr((Modifier.Element) mutableVector.content[oldIndex + i2], (Modifier.Element) this.after.content[i2 + newIndex]) != 0;
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public void t(int newIndex) {
            int i2 = this.offset + newIndex;
            Modifier.Node node = this.node;
            this.node = NodeChain.this.Uo((Modifier.Element) this.after.content[i2], node);
            Logger logger = NodeChain.this.logger;
            if (logger != null) {
                logger.n(i2, i2, (Modifier.Element) this.after.content[i2], node, this.node);
            }
            if (!this.shouldAttachOnInsert) {
                this.node.Of6(true);
                return;
            }
            Modifier.Node child = this.node.getChild();
            Intrinsics.checkNotNull(child);
            NodeCoordinator coordinator = child.getCoordinator();
            Intrinsics.checkNotNull(coordinator);
            LayoutModifierNode layoutModifierNodeNr = DelegatableNodeKt.nr(this.node);
            if (layoutModifierNodeNr != null) {
                LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = new LayoutModifierNodeCoordinator(NodeChain.this.getLayoutNode(), layoutModifierNodeNr);
                this.node.Rc(layoutModifierNodeCoordinator);
                NodeChain.this.WPU(this.node, layoutModifierNodeCoordinator);
                layoutModifierNodeCoordinator.Ai(coordinator.getWrappedBy());
                layoutModifierNodeCoordinator.ENe(coordinator);
                coordinator.Ai(layoutModifierNodeCoordinator);
            } else {
                this.node.Rc(coordinator);
            }
            this.node.gxH();
            this.node.XUb();
            NodeKindKt.n(this.node);
        }

        public final void xMQ(boolean z2) {
            this.shouldAttachOnInsert = z2;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\b`\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0010\u0010\u000fJ7\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H&¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0017\u0010\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeChain$Logger;", "", "", "index", "Landroidx/compose/ui/Modifier$Element;", "prev", "next", "Landroidx/compose/ui/Modifier$Node;", "node", "", "t", "(ILandroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)V", "oldIndex", "newIndex", "rl", "(IILandroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)V", "O", "atIndex", "element", "child", "inserted", c.f62177j, "(IILandroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/Modifier$Node;)V", "nr", "(ILandroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Logger {
        void O(int oldIndex, int newIndex, Modifier.Element prev, Modifier.Element next, Modifier.Node node);

        void n(int atIndex, int newIndex, Modifier.Element element, Modifier.Node child, Modifier.Node inserted);

        void nr(int oldIndex, Modifier.Element element, Modifier.Node node);

        void rl(int oldIndex, int newIndex, Modifier.Element prev, Modifier.Element next, Modifier.Node node);

        void t(int index, Modifier.Element prev, Modifier.Element next, Modifier.Node node);
    }

    private final void te(int offset, MutableVector before, MutableVector after, Modifier.Node tail, boolean shouldAttachOnInsert) {
        MyersDiffKt.O(before.getSize() - offset, after.getSize() - offset, mUb(tail, offset, before, after, shouldAttachOnInsert));
        iF();
    }

    private final Modifier.Node S() {
        if (!(this.head != NodeChainKt.f32571n)) {
            InlineClassHelperKt.t("padChain called on already padded chain");
        }
        Modifier.Node node = this.head;
        node.Qg8(NodeChainKt.f32571n);
        NodeChainKt.f32571n.sFO(node);
        return NodeChainKt.f32571n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node Uo(Modifier.Element element, Modifier.Node parent) {
        Modifier.Node backwardsCompatNode;
        if (element instanceof ModifierNodeElement) {
            backwardsCompatNode = ((ModifierNodeElement) element).n();
            backwardsCompatNode.jX(NodeKindKt.KN(backwardsCompatNode));
        } else {
            backwardsCompatNode = new BackwardsCompatNode(element);
        }
        if (backwardsCompatNode.getIsAttached()) {
            InlineClassHelperKt.t("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        backwardsCompatNode.Of6(true);
        return r(backwardsCompatNode, parent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X(Modifier.Element prev, Modifier.Element next, Modifier.Node node) {
        if ((prev instanceof ModifierNodeElement) && (next instanceof ModifierNodeElement)) {
            NodeChainKt.J2((ModifierNodeElement) next, node);
            if (node.getIsAttached()) {
                NodeKindKt.O(node);
                return;
            } else {
                node.tdZ(true);
                return;
            }
        }
        if (!(node instanceof BackwardsCompatNode)) {
            InlineClassHelperKt.t("Unknown Modifier.Node type");
            return;
        }
        ((BackwardsCompatNode) node).W1c(next);
        if (node.getIsAttached()) {
            NodeKindKt.O(node);
        } else {
            node.tdZ(true);
        }
    }

    private final void iF() {
        int kindSet = 0;
        for (Modifier.Node parent = this.tail.getParent(); parent != null && parent != NodeChainKt.f32571n; parent = parent.getParent()) {
            kindSet |= parent.getKindSet();
            parent.MPw(kindSet);
        }
    }

    private final Differ mUb(Modifier.Node head, int offset, MutableVector before, MutableVector after, boolean shouldAttachOnInsert) {
        Differ differ = this.cachedDiffer;
        if (differ == null) {
            Differ differ2 = new Differ(head, offset, before, after, shouldAttachOnInsert);
            this.cachedDiffer = differ2;
            return differ2;
        }
        differ.Uo(head);
        differ.KN(offset);
        differ.J2(before);
        differ.O(after);
        differ.xMQ(shouldAttachOnInsert);
        return differ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int xMQ() {
        return this.head.getAggregateChildKindSet();
    }

    /* JADX INFO: renamed from: HI, reason: from getter */
    public final NodeCoordinator getOuterCoordinator() {
        return this.outerCoordinator;
    }

    /* JADX INFO: renamed from: az, reason: from getter */
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    /* JADX INFO: renamed from: ck, reason: from getter */
    public final Modifier.Node getTail() {
        return this.tail;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Modifier m2) {
        MutableVector mutableVector;
        Modifier.Node node;
        Modifier.Node parent;
        Modifier.Node node2;
        Logger logger;
        Modifier.Node nodeS = S();
        MutableVector mutableVector2 = this.current;
        boolean z2 = false;
        int iQie = mutableVector2 != null ? mutableVector2.getSize() : 0;
        MutableVector mutableVector3 = this.buffer;
        if (mutableVector3 == null) {
            mutableVector3 = new MutableVector(new Modifier.Element[16], 0);
        }
        MutableVector mutableVectorO = NodeChainKt.O(m2, mutableVector3);
        MutableVector mutableVector4 = null;
        if (mutableVectorO.getSize() == iQie) {
            Modifier.Node child = nodeS.getChild();
            for (int i2 = 0; child != null && i2 < iQie; i2++) {
                if (mutableVector2 == null) {
                    InlineClassHelperKt.nr("expected prior modifier list to be non-empty");
                    throw new KotlinNothingValueException();
                }
                Modifier.Element element = (Modifier.Element) mutableVector2.content[i2];
                Modifier.Element element2 = (Modifier.Element) mutableVectorO.content[i2];
                int iNr = NodeChainKt.nr(element, element2);
                if (iNr != 0) {
                    if (iNr != 1) {
                        if (iNr == 2 && (logger = this.logger) != null) {
                            logger.O(i2, i2, element, element2, child);
                        }
                        node2 = child;
                    } else {
                        node2 = child;
                        X(element, element2, node2);
                        Logger logger2 = this.logger;
                        if (logger2 != null) {
                            logger2.rl(i2, i2, element, element2, node2);
                        }
                    }
                    child = node2.getChild();
                } else {
                    Modifier.Node node3 = child;
                    Logger logger3 = this.logger;
                    if (logger3 != null) {
                        logger3.t(i2, element, element2, node3);
                    }
                    parent = node3.getParent();
                    if (i2 < iQie) {
                        if (mutableVector2 == null) {
                            InlineClassHelperKt.nr("expected prior modifier list to be non-empty");
                            throw new KotlinNothingValueException();
                        }
                        if (parent == null) {
                            InlineClassHelperKt.nr("structuralUpdate requires a non-null tail");
                            throw new KotlinNothingValueException();
                        }
                        mutableVector = mutableVectorO;
                        te(i2, mutableVector2, mutableVector, parent, !this.layoutNode.s7N());
                        node = nodeS;
                        z2 = true;
                    }
                    mutableVector = mutableVectorO;
                    node = nodeS;
                }
            }
            parent = child;
            if (i2 < iQie) {
            }
            mutableVector = mutableVectorO;
            node = nodeS;
        } else if (this.layoutNode.s7N() && iQie == 0) {
            int i3 = 0;
            Modifier.Node node4 = nodeS;
            while (i3 < mutableVectorO.getSize()) {
                Modifier.Element element3 = (Modifier.Element) mutableVectorO.content[i3];
                Modifier.Node nodeUo = Uo(element3, node4);
                Logger logger4 = this.logger;
                if (logger4 != null) {
                    logger4.n(0, i3, element3, node4, nodeUo);
                }
                i3++;
                node4 = nodeUo;
            }
            iF();
            mutableVector = mutableVectorO;
            node = nodeS;
            z2 = true;
        } else if (mutableVectorO.getSize() != 0) {
            if (mutableVector2 == null) {
                mutableVector2 = new MutableVector(new Modifier.Element[16], 0);
            }
            mutableVector = mutableVectorO;
            node = nodeS;
            te(0, mutableVector2, mutableVector, node, !this.layoutNode.s7N());
            z2 = true;
        } else {
            if (mutableVector2 == null) {
                InlineClassHelperKt.nr("expected prior modifier list to be non-empty");
                throw new KotlinNothingValueException();
            }
            Modifier.Node child2 = nodeS.getChild();
            for (int i5 = 0; child2 != null && i5 < mutableVector2.getSize(); i5++) {
                Logger logger5 = this.logger;
                if (logger5 != null) {
                    logger5.nr(i5, (Modifier.Element) mutableVector2.content[i5], child2);
                }
                child2 = KN(child2).getChild();
            }
            InnerNodeCoordinator innerNodeCoordinator = this.innerCoordinator;
            LayoutNode layoutNodeMYa = this.layoutNode.mYa();
            innerNodeCoordinator.Ai(layoutNodeMYa != null ? layoutNodeMYa.E() : null);
            this.outerCoordinator = this.innerCoordinator;
            mutableVector = mutableVectorO;
            node = nodeS;
        }
        this.current = mutableVector;
        if (mutableVector2 != null) {
            mutableVector2.KN();
            mutableVector4 = mutableVector2;
        }
        this.buffer = mutableVector4;
        this.head = E2(node);
        if (z2) {
            fD();
        }
    }

    public final void fD() {
        NodeCoordinator layoutModifierNodeCoordinator;
        NodeCoordinator nodeCoordinator = this.innerCoordinator;
        for (Modifier.Node parent = this.tail.getParent(); parent != null; parent = parent.getParent()) {
            LayoutModifierNode layoutModifierNodeNr = DelegatableNodeKt.nr(parent);
            if (layoutModifierNodeNr != null) {
                if (parent.getCoordinator() != null) {
                    NodeCoordinator coordinator = parent.getCoordinator();
                    Intrinsics.checkNotNull(coordinator, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) coordinator;
                    LayoutModifierNode layoutModifierNodePzf = layoutModifierNodeCoordinator.getLayoutModifierNode();
                    layoutModifierNodeCoordinator.pt(layoutModifierNodeNr);
                    if (layoutModifierNodePzf != parent) {
                        layoutModifierNodeCoordinator.WKb();
                    }
                } else {
                    layoutModifierNodeCoordinator = new LayoutModifierNodeCoordinator(this.layoutNode, layoutModifierNodeNr);
                    parent.Rc(layoutModifierNodeCoordinator);
                }
                nodeCoordinator.Ai(layoutModifierNodeCoordinator);
                layoutModifierNodeCoordinator.ENe(nodeCoordinator);
                nodeCoordinator = layoutModifierNodeCoordinator;
            } else {
                parent.Rc(nodeCoordinator);
            }
        }
        LayoutNode layoutNodeMYa = this.layoutNode.mYa();
        nodeCoordinator.Ai(layoutNodeMYa != null ? layoutNodeMYa.E() : null);
        this.outerCoordinator = nodeCoordinator;
    }

    /* JADX INFO: renamed from: gh, reason: from getter */
    public final Modifier.Node getHead() {
        return this.head;
    }

    public final void nY() {
        NodeCoordinator wrapped = this.outerCoordinator;
        InnerNodeCoordinator innerNodeCoordinator = this.innerCoordinator;
        while (wrapped != innerNodeCoordinator) {
            wrapped.GT();
            wrapped = wrapped.getWrapped();
            Intrinsics.checkNotNull(wrapped);
        }
        innerNodeCoordinator.GT();
        for (Modifier.Node head = getHead(); head != null; head = head.getChild()) {
            head.XUb();
            if (head.getInsertedNodeAwaitingAttachForInvalidation()) {
                NodeKindKt.n(head);
            }
            if (head.getUpdatedNodeAwaitingAttachForInvalidation()) {
                NodeKindKt.O(head);
            }
            head.Of6(false);
            head.tdZ(false);
        }
    }

    /* JADX INFO: renamed from: qie, reason: from getter */
    public final InnerNodeCoordinator getInnerCoordinator() {
        return this.innerCoordinator;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (this.head == this.tail) {
            sb.append("]");
        } else {
            Modifier.Node head = getHead();
            while (true) {
                if (head == null || head == getTail()) {
                    break;
                }
                sb.append(String.valueOf(head));
                if (head.getChild() == this.tail) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                head = head.getChild();
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final List ty() {
        MutableVector mutableVector = this.current;
        if (mutableVector == null) {
            return CollectionsKt.emptyList();
        }
        int i2 = 0;
        MutableVector mutableVector2 = new MutableVector(new ModifierInfo[mutableVector.getSize()], 0);
        Modifier.Node head = getHead();
        while (head != null && head != getTail()) {
            NodeCoordinator coordinator = head.getCoordinator();
            if (coordinator == null) {
                throw new IllegalArgumentException("getModifierInfo called on node with no coordinator");
            }
            OwnedLayer layer = coordinator.getLayer();
            OwnedLayer layer2 = this.innerCoordinator.getLayer();
            Modifier.Node child = head.getChild();
            if (child != this.tail || head.getCoordinator() == child.getCoordinator()) {
                layer2 = null;
            }
            if (layer == null) {
                layer = layer2;
            }
            mutableVector2.rl(new ModifierInfo((Modifier) mutableVector.content[i2], coordinator, layer));
            head = head.getChild();
            i2++;
        }
        return mutableVector2.Uo();
    }

    public NodeChain(LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
        InnerNodeCoordinator innerNodeCoordinator = new InnerNodeCoordinator(layoutNode);
        this.innerCoordinator = innerNodeCoordinator;
        this.outerCoordinator = innerNodeCoordinator;
        TailModifierNode tailModifierNodeDtL = innerNodeCoordinator.JI();
        this.tail = tailModifierNodeDtL;
        this.head = tailModifierNodeDtL;
    }

    private final Modifier.Node E2(Modifier.Node paddedHead) {
        boolean z2;
        boolean z3 = false;
        if (paddedHead == NodeChainKt.f32571n) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            InlineClassHelperKt.t("trimChain called on already trimmed chain");
        }
        Modifier.Node child = NodeChainKt.f32571n.getChild();
        if (child == null) {
            child = this.tail;
        }
        child.Qg8(null);
        NodeChainKt.f32571n.sFO(null);
        NodeChainKt.f32571n.MPw(-1);
        NodeChainKt.f32571n.Rc(null);
        if (child != NodeChainKt.f32571n) {
            z3 = true;
        }
        if (!z3) {
            InlineClassHelperKt.t("trimChain did not update the head");
        }
        return child;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node KN(Modifier.Node node) {
        if (node.getIsAttached()) {
            NodeKindKt.nr(node);
            node.rR();
            node.YiW();
        }
        return aYN(node);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void WPU(Modifier.Node start, NodeCoordinator coordinator) {
        NodeCoordinator nodeCoordinatorE;
        for (Modifier.Node parent = start.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == NodeChainKt.f32571n) {
                LayoutNode layoutNodeMYa = this.layoutNode.mYa();
                if (layoutNodeMYa != null) {
                    nodeCoordinatorE = layoutNodeMYa.E();
                } else {
                    nodeCoordinatorE = null;
                }
                coordinator.Ai(nodeCoordinatorE);
                this.outerCoordinator = coordinator;
                return;
            }
            if ((NodeKind.n(2) & parent.getKindSet()) != 0) {
                return;
            }
            parent.Rc(coordinator);
        }
    }

    private final Modifier.Node aYN(Modifier.Node node) {
        Modifier.Node child = node.getChild();
        Modifier.Node parent = node.getParent();
        if (child != null) {
            child.Qg8(parent);
            node.sFO(null);
        }
        if (parent != null) {
            parent.sFO(child);
            node.Qg8(null);
        }
        Intrinsics.checkNotNull(parent);
        return parent;
    }

    private final Modifier.Node r(Modifier.Node node, Modifier.Node parent) {
        Modifier.Node child = parent.getChild();
        if (child != null) {
            child.Qg8(node);
            node.sFO(child);
        }
        parent.sFO(node);
        node.Qg8(parent);
        return node;
    }

    public final boolean Ik(int type) {
        if ((type & xMQ()) != 0) {
            return true;
        }
        return false;
    }

    public final void ViF() {
        for (Modifier.Node tail = getTail(); tail != null; tail = tail.getParent()) {
            if (tail.getIsAttached()) {
                tail.x();
            }
        }
        g();
        XQ();
    }

    public final void XQ() {
        for (Modifier.Node tail = getTail(); tail != null; tail = tail.getParent()) {
            if (tail.getIsAttached()) {
                tail.YiW();
            }
        }
    }

    public final void Z() {
        for (Modifier.Node head = getHead(); head != null; head = head.getChild()) {
            head.gxH();
        }
    }

    public final void g() {
        for (Modifier.Node tail = getTail(); tail != null; tail = tail.getParent()) {
            if (tail.getIsAttached()) {
                tail.rR();
            }
        }
        NodeCoordinator wrappedBy = this.innerCoordinator;
        NodeCoordinator nodeCoordinator = this.outerCoordinator;
        while (wrappedBy != nodeCoordinator) {
            wrappedBy.b();
            wrappedBy = wrappedBy.getWrappedBy();
            Intrinsics.checkNotNull(wrappedBy);
        }
        nodeCoordinator.b();
    }

    public final boolean o() {
        if (NodeChainKt.f32571n.getChild() != null) {
            return true;
        }
        return false;
    }
}
