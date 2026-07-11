package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010+\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b$\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005:\u0001\\B\u0017\b\u0000\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tB\t\b\u0016¢\u0006\u0004\b\b\u0010\nJ)\u0010\u000e\u001a\u00020\f2\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0015\u001a\u00020\f*\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u00020\f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016¢\u0006\u0004\b$\u0010%J\u0018\u0010'\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u0011H\u0096\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\fH\u0016¢\u0006\u0004\b+\u0010,J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0096\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b0\u0010*J\u0015\u00102\u001a\b\u0012\u0004\u0012\u00028\u000001H\u0016¢\u0006\u0004\b2\u00103J\u001d\u00102\u001a\b\u0012\u0004\u0012\u00028\u0000012\u0006\u0010&\u001a\u00020\u0011H\u0016¢\u0006\u0004\b2\u00104J%\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u00105\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u0011H\u0016¢\u0006\u0004\b7\u00108J\u000f\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b<\u0010!J\u001f\u0010<\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b<\u0010=J%\u0010>\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u00112\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016¢\u0006\u0004\b>\u0010?J\u001d\u0010>\u001a\u00020\f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016¢\u0006\u0004\b>\u0010%J\u000f\u0010@\u001a\u00020\u001cH\u0016¢\u0006\u0004\b@\u0010\nJ\u0017\u0010A\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0004\bA\u0010!J\u001d\u0010B\u001a\u00020\f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016¢\u0006\u0004\bB\u0010%J\u0017\u0010C\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u0011H\u0016¢\u0006\u0004\bC\u0010(J\u001d\u0010D\u001a\u00020\f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016¢\u0006\u0004\bD\u0010%J \u0010E\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\bE\u0010FJ\u001d\u0010G\u001a\u00020\u001c2\u0006\u00105\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u0011¢\u0006\u0004\bG\u0010HJ-\u0010K\u001a\u00020\u00112\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"2\u0006\u0010I\u001a\u00020\u00112\u0006\u0010J\u001a\u00020\u0011H\u0000¢\u0006\u0004\bK\u0010LR$\u0010R\u001a\u00020\u00182\u0006\u0010M\u001a\u00020\u00188\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0014\u0010U\u001a\u00020\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR \u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108@X\u0080\u0004¢\u0006\f\u0012\u0004\bX\u0010\n\u001a\u0004\bV\u0010WR\u0014\u0010[\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010T¨\u0006]"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/snapshots/StateObject;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "persistentList", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)V", "()V", "Lkotlin/Function1;", "", "block", "xMQ", "(Lkotlin/jvm/functions/Function1;)Z", "Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", "", "currentModification", "newList", "structural", "O", "(Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Z)Z", "list", "Landroidx/compose/runtime/snapshots/StateRecord;", "az", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)Landroidx/compose/runtime/snapshots/StateRecord;", "value", "", "HI", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "element", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", V8ValueBuiltInSymbol.PROPERTY_ITERATOR, "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "", "toString", "()Ljava/lang/String;", l.f62657l, "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "remove", "removeAll", "mUb", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "gh", "(II)V", TtmlNode.START, TtmlNode.END, "qie", "(Ljava/util/Collection;II)I", "<set-?>", c.f62177j, "Landroidx/compose/runtime/snapshots/StateRecord;", "ck", "()Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "KN", "()I", "structure", "J2", "()Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", "getReadable$runtime_release$annotations", "readable", "Uo", "size", "StateListStateRecord", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Stable
@SourceDebugExtension({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 4 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,539:1\n183#1:540\n216#1,9:548\n225#1:559\n183#1:560\n226#1,9:562\n180#1:571\n235#1,6:581\n209#1,16:587\n225#1:605\n183#1:606\n226#1,9:608\n180#1:617\n235#1,6:627\n214#1:633\n216#1,9:634\n225#1:645\n183#1:646\n226#1,9:648\n180#1:657\n235#1,6:667\n180#1:673\n216#1,9:686\n225#1:697\n183#1:698\n226#1,9:700\n180#1:709\n235#1,6:719\n216#1,9:725\n225#1:736\n183#1:737\n226#1,9:739\n180#1:748\n235#1,6:758\n209#1,16:765\n225#1:783\n183#1:784\n226#1,9:786\n180#1:795\n235#1,6:805\n214#1:811\n213#1,12:813\n225#1:827\n183#1:828\n226#1,9:830\n180#1:839\n235#1,6:849\n214#1:855\n188#1,5:856\n193#1:863\n183#1:864\n194#1,9:866\n180#1:875\n204#1,3:885\n188#1,5:888\n193#1:895\n183#1:896\n194#1,9:898\n180#1:907\n204#1,3:917\n183#1:920\n188#1,5:934\n193#1:941\n183#1:942\n194#1,9:944\n180#1:953\n204#1,3:963\n183#1:968\n180#1:970\n219#1,6:982\n225#1:990\n183#1:991\n226#1,9:993\n180#1:1002\n235#1,6:1012\n219#1,7:1018\n183#1:1025\n226#1,9:1027\n180#1:1036\n235#1,6:1045\n183#1:1053\n180#1:1055\n183#1:1069\n180#1:1071\n2475#2:541\n2475#2:547\n2475#2:561\n2365#2,2:572\n1894#2,2:574\n2367#2,4:576\n2475#2:607\n2365#2,2:618\n1894#2,2:620\n2367#2,4:622\n2475#2:647\n2365#2,2:658\n1894#2,2:660\n2367#2,4:662\n2365#2,2:674\n1894#2,2:676\n2367#2,2:680\n2370#2:684\n2475#2:699\n2365#2,2:710\n1894#2,2:712\n2367#2,4:714\n2475#2:738\n2365#2,2:749\n1894#2,2:751\n2367#2,4:753\n2475#2:785\n2365#2,2:796\n1894#2,2:798\n2367#2,4:800\n2475#2:829\n2365#2,2:840\n1894#2,2:842\n2367#2,4:844\n2475#2:865\n2365#2,2:876\n1894#2,2:878\n2367#2,4:880\n2475#2:897\n2365#2,2:908\n1894#2,2:910\n2367#2,4:912\n2475#2:921\n2365#2,2:922\n1894#2,2:924\n2367#2,4:928\n2475#2:933\n2475#2:943\n2365#2,2:954\n1894#2,2:956\n2367#2,4:958\n2475#2:969\n2365#2,2:971\n1894#2,2:973\n2367#2,4:977\n2475#2:992\n2365#2,2:1003\n1894#2,2:1005\n2367#2,4:1007\n2475#2:1026\n2365#2,2:1037\n1894#2,2:1039\n2367#2,4:1041\n2475#2:1054\n2365#2,2:1056\n1894#2,2:1058\n2367#2,4:1062\n2475#2:1070\n2365#2,2:1072\n1894#2,2:1074\n2367#2,4:1078\n33#3,5:542\n33#4,2:557\n33#4,2:603\n33#4,2:643\n33#4,2:678\n33#4,2:682\n33#4,2:695\n33#4,2:734\n33#4,2:781\n33#4,2:825\n33#4,2:861\n33#4,2:893\n33#4,2:926\n33#4,2:939\n33#4,2:966\n33#4,2:975\n33#4,2:988\n33#4,2:1051\n33#4,2:1060\n33#4,2:1067\n33#4,2:1076\n33#4,2:1082\n1#5:580\n1#5:626\n1#5:666\n1#5:685\n1#5:718\n1#5:757\n1#5:764\n1#5:804\n1#5:812\n1#5:848\n1#5:884\n1#5:916\n1#5:932\n1#5:962\n1#5:981\n1#5:1011\n1#5:1066\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n*L\n67#1:540\n129#1:548,9\n129#1:559\n129#1:560\n129#1:562,9\n129#1:571\n129#1:581,6\n131#1:587,16\n131#1:605\n131#1:606\n131#1:608,9\n131#1:617\n131#1:627,6\n131#1:633\n137#1:634,9\n137#1:645\n137#1:646\n137#1:648,9\n137#1:657\n137#1:667,6\n140#1:673\n149#1:686,9\n149#1:697\n149#1:698\n149#1:700,9\n149#1:709\n149#1:719,6\n151#1:725,9\n151#1:736\n151#1:737\n151#1:739,9\n151#1:748\n151#1:758,6\n153#1:765,16\n153#1:783\n153#1:784\n153#1:786,9\n153#1:795\n153#1:805,6\n153#1:811\n158#1:813,12\n158#1:827\n158#1:828\n158#1:830,9\n158#1:839\n158#1:849,6\n158#1:855\n161#1:856,5\n161#1:863\n161#1:864\n161#1:866,9\n161#1:875\n161#1:885,3\n166#1:888,5\n166#1:895\n166#1:896\n166#1:898,9\n166#1:907\n166#1:917,3\n176#1:920\n185#1:934,5\n185#1:941\n185#1:942\n185#1:944,9\n185#1:953\n185#1:963,3\n193#1:968\n202#1:970\n213#1:982,6\n213#1:990\n213#1:991\n213#1:993,9\n213#1:1002\n213#1:1012,6\n213#1:1018,7\n213#1:1025\n213#1:1027,9\n213#1:1036\n213#1:1045,6\n225#1:1053\n234#1:1055\n225#1:1069\n234#1:1071\n67#1:541\n125#1:547\n129#1:561\n129#1:572,2\n129#1:574,2\n129#1:576,4\n131#1:607\n131#1:618,2\n131#1:620,2\n131#1:622,4\n137#1:647\n137#1:658,2\n137#1:660,2\n137#1:662,4\n140#1:674,2\n140#1:676,2\n140#1:680,2\n140#1:684\n149#1:699\n149#1:710,2\n149#1:712,2\n149#1:714,4\n151#1:738\n151#1:749,2\n151#1:751,2\n151#1:753,4\n153#1:785\n153#1:796,2\n153#1:798,2\n153#1:800,4\n158#1:829\n158#1:840,2\n158#1:842,2\n158#1:844,4\n161#1:865\n161#1:876,2\n161#1:878,2\n161#1:880,4\n166#1:897\n166#1:908,2\n166#1:910,2\n166#1:912,4\n176#1:921\n180#1:922,2\n180#1:924,2\n180#1:928,4\n183#1:933\n185#1:943\n185#1:954,2\n185#1:956,2\n185#1:958,4\n193#1:969\n202#1:971,2\n202#1:973,2\n202#1:977,4\n213#1:992\n213#1:1003,2\n213#1:1005,2\n213#1:1007,4\n213#1:1026\n213#1:1037,2\n213#1:1039,2\n213#1:1041,4\n225#1:1054\n234#1:1056,2\n234#1:1058,2\n234#1:1062,4\n225#1:1070\n234#1:1072,2\n234#1:1074,2\n234#1:1078,4\n117#1:542,5\n129#1:557,2\n131#1:603,2\n137#1:643,2\n140#1:678,2\n141#1:682,2\n149#1:695,2\n151#1:734,2\n153#1:781,2\n158#1:825,2\n161#1:861,2\n166#1:893,2\n180#1:926,2\n185#1:939,2\n192#1:966,2\n202#1:975,2\n213#1:988,2\n224#1:1051,2\n234#1:1060,2\n224#1:1067,2\n234#1:1076,2\n248#1:1082,2\n129#1:580\n131#1:626\n137#1:666\n140#1:685\n149#1:718\n151#1:757\n153#1:804\n158#1:848\n161#1:884\n166#1:916\n180#1:932\n185#1:962\n202#1:981\n213#1:1011\n234#1:1066\n*E\n"})
public final class SnapshotStateList<T> implements StateObject, List<T>, RandomAccess, KMutableList {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private StateRecord firstStateRecord;

    @StabilityInferred
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B#\b\u0000\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001d\u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010 \u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001c¨\u0006!"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/snapshots/StateRecord;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "list", "<init>", "(JLandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)V", "value", "", "t", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "nr", "()Landroidx/compose/runtime/snapshots/StateRecord;", "O", "(J)Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "mUb", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "az", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)V", "", "I", "gh", "()I", "ty", "(I)V", "modification", "qie", "HI", "structuralChange", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,539:1\n33#2,2:540\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord\n*L\n81#1:540,2\n*E\n"})
    public static final class StateListStateRecord<T> extends StateRecord {

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private int structuralChange;

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private int modification;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private PersistentList list;

        public final void HI(int i2) {
            this.structuralChange = i2;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord O(long snapshotId) {
            return new StateListStateRecord(snapshotId, this.list);
        }

        public final void az(PersistentList persistentList) {
            this.list = persistentList;
        }

        /* JADX INFO: renamed from: gh, reason: from getter */
        public final int getModification() {
            return this.modification;
        }

        /* JADX INFO: renamed from: mUb, reason: from getter */
        public final PersistentList getList() {
            return this.list;
        }

        /* JADX INFO: renamed from: qie, reason: from getter */
        public final int getStructuralChange() {
            return this.structuralChange;
        }

        public final void ty(int i2) {
            this.modification = i2;
        }

        public StateListStateRecord(long j2, PersistentList persistentList) {
            super(j2);
            this.list = persistentList;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord nr() {
            return O(SnapshotKt.N().getSnapshotId());
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void t(StateRecord value) {
            synchronized (SnapshotStateListKt.f30978n) {
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord>");
                this.list = ((StateListStateRecord) value).list;
                this.modification = ((StateListStateRecord) value).modification;
                this.structuralChange = ((StateListStateRecord) value).structuralChange;
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public SnapshotStateList(PersistentList persistentList) {
        this.firstStateRecord = az(persistentList);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object element) {
        int modification;
        PersistentList list;
        Snapshot snapshotT;
        boolean zO;
        do {
            synchronized (SnapshotStateListKt.f30978n) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.X((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list = stateListStateRecord.getList();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(list);
            PersistentList persistentListAdd = list.add(element);
            if (Intrinsics.areEqual(persistentListAdd, list)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.nHg()) {
                snapshotT = Snapshot.INSTANCE.t();
                zO = O((StateListStateRecord) SnapshotKt.k(stateListStateRecord2, this, snapshotT), modification, persistentListAdd, true);
            }
            SnapshotKt.jB(snapshotT, this);
        } while (!zO);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(final int index, final Collection elements) {
        return xMQ(new Function1<List<T>, Boolean>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateList.addAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(List list) {
                return Boolean.valueOf(list.addAll(index, elements));
            }
        });
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new StateListIterator(this, 0);
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i2) {
        return mUb(i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection elements) {
        int modification;
        PersistentList list;
        Snapshot snapshotT;
        boolean zO;
        do {
            synchronized (SnapshotStateListKt.f30978n) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.X((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list = stateListStateRecord.getList();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(list);
            PersistentList persistentListAddAll = list.addAll(elements);
            if (Intrinsics.areEqual(persistentListAddAll, list)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.nHg()) {
                snapshotT = Snapshot.INSTANCE.t();
                zO = O((StateListStateRecord) SnapshotKt.k(stateListStateRecord2, this, snapshotT), modification, persistentListAddAll, true);
            }
            SnapshotKt.jB(snapshotT, this);
        } while (!zO);
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    /* JADX INFO: renamed from: ck, reason: from getter */
    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    @Override // java.util.List
    public ListIterator listIterator(int index) {
        return new StateListIterator(this, index);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object element) {
        int modification;
        PersistentList list;
        Snapshot snapshotT;
        boolean zO;
        do {
            synchronized (SnapshotStateListKt.f30978n) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.X((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list = stateListStateRecord.getList();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(list);
            PersistentList persistentListRemove = list.remove(element);
            if (Intrinsics.areEqual(persistentListRemove, list)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.nHg()) {
                snapshotT = Snapshot.INSTANCE.t();
                zO = O((StateListStateRecord) SnapshotKt.k(stateListStateRecord2, this, snapshotT), modification, persistentListRemove, true);
            }
            SnapshotKt.jB(snapshotT, this);
        } while (!zO);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(final Collection elements) {
        return xMQ(new Function1<List<T>, Boolean>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateList.retainAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(List list) {
                return Boolean.valueOf(list.retainAll(elements));
            }
        });
    }

    @Override // java.util.List
    public List subList(int fromIndex, int toIndex) {
        if (!(fromIndex >= 0 && fromIndex <= toIndex && toIndex <= size())) {
            PreconditionsKt.n("fromIndex or toIndex are out of bounds");
        }
        return new SubList(this, fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return CollectionToArray.toArray(this, objArr);
    }

    public SnapshotStateList() {
        this(ExtensionsKt.rl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean O(StateListStateRecord stateListStateRecord, int i2, PersistentList persistentList, boolean z2) {
        boolean z3;
        synchronized (SnapshotStateListKt.f30978n) {
            try {
                if (stateListStateRecord.getModification() == i2) {
                    stateListStateRecord.az(persistentList);
                    z3 = true;
                    if (z2) {
                        stateListStateRecord.HI(stateListStateRecord.getStructuralChange() + 1);
                    }
                    stateListStateRecord.ty(stateListStateRecord.getModification() + 1);
                } else {
                    z3 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    private final StateRecord az(PersistentList list) {
        Snapshot snapshotN = SnapshotKt.N();
        StateListStateRecord stateListStateRecord = new StateListStateRecord(snapshotN.getSnapshotId(), list);
        if (!(snapshotN instanceof GlobalSnapshot)) {
            stateListStateRecord.KN(new StateListStateRecord(SnapshotId_jvmKt.t(1), list));
        }
        return stateListStateRecord;
    }

    private final boolean xMQ(Function1 block) {
        int modification;
        PersistentList list;
        Object objInvoke;
        Snapshot snapshotT;
        boolean zO;
        do {
            synchronized (SnapshotStateListKt.f30978n) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.X((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list = stateListStateRecord.getList();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(list);
            PersistentList.Builder builderN = list.n();
            objInvoke = block.invoke(builderN);
            PersistentList persistentListBuild = builderN.build();
            if (Intrinsics.areEqual(persistentListBuild, list)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.nHg()) {
                snapshotT = Snapshot.INSTANCE.t();
                zO = O((StateListStateRecord) SnapshotKt.k(stateListStateRecord2, this, snapshotT), modification, persistentListBuild, true);
            }
            SnapshotKt.jB(snapshotT, this);
        } while (!zO);
        return ((Boolean) objInvoke).booleanValue();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void HI(StateRecord value) {
        value.KN(getFirstStateRecord());
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        this.firstStateRecord = (StateListStateRecord) value;
    }

    public final StateListStateRecord J2() {
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (StateListStateRecord) SnapshotKt.M((StateListStateRecord) firstStateRecord, this);
    }

    public final int KN() {
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((StateListStateRecord) SnapshotKt.X((StateListStateRecord) firstStateRecord)).getStructuralChange();
    }

    public int Uo() {
        return J2().getList().size();
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        Snapshot snapshotT;
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        StateListStateRecord stateListStateRecord = (StateListStateRecord) firstStateRecord;
        synchronized (SnapshotKt.nHg()) {
            snapshotT = Snapshot.INSTANCE.t();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.k(stateListStateRecord, this, snapshotT);
            synchronized (SnapshotStateListKt.f30978n) {
                stateListStateRecord2.az(ExtensionsKt.rl());
                stateListStateRecord2.ty(stateListStateRecord2.getModification() + 1);
                stateListStateRecord2.HI(stateListStateRecord2.getStructuralChange() + 1);
            }
        }
        SnapshotKt.jB(snapshotT, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object element) {
        return J2().getList().contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection elements) {
        return J2().getList().containsAll(elements);
    }

    @Override // java.util.List
    public Object get(int index) {
        return J2().getList().get(index);
    }

    public final void gh(int fromIndex, int toIndex) {
        int modification;
        PersistentList list;
        Snapshot snapshotT;
        boolean zO;
        do {
            synchronized (SnapshotStateListKt.f30978n) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.X((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list = stateListStateRecord.getList();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(list);
            PersistentList.Builder builderN = list.n();
            builderN.subList(fromIndex, toIndex).clear();
            PersistentList persistentListBuild = builderN.build();
            if (!Intrinsics.areEqual(persistentListBuild, list)) {
                StateRecord firstStateRecord2 = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
                synchronized (SnapshotKt.nHg()) {
                    snapshotT = Snapshot.INSTANCE.t();
                    zO = O((StateListStateRecord) SnapshotKt.k(stateListStateRecord2, this, snapshotT), modification, persistentListBuild, true);
                }
                SnapshotKt.jB(snapshotT, this);
            } else {
                return;
            }
        } while (!zO);
    }

    @Override // java.util.List
    public int indexOf(Object element) {
        return J2().getList().indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return J2().getList().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object element) {
        return J2().getList().lastIndexOf(element);
    }

    public Object mUb(int index) {
        int modification;
        PersistentList list;
        Snapshot snapshotT;
        boolean zO;
        Object obj = get(index);
        do {
            synchronized (SnapshotStateListKt.f30978n) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.X((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list = stateListStateRecord.getList();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(list);
            PersistentList persistentListZ = list.Z(index);
            if (Intrinsics.areEqual(persistentListZ, list)) {
                return obj;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.nHg()) {
                snapshotT = Snapshot.INSTANCE.t();
                zO = O((StateListStateRecord) SnapshotKt.k(stateListStateRecord2, this, snapshotT), modification, persistentListZ, true);
            }
            SnapshotKt.jB(snapshotT, this);
        } while (!zO);
        return obj;
    }

    public final int qie(Collection elements, int start, int end) {
        int modification;
        PersistentList list;
        Snapshot snapshotT;
        boolean zO;
        int size = size();
        do {
            synchronized (SnapshotStateListKt.f30978n) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.X((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list = stateListStateRecord.getList();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(list);
            PersistentList.Builder builderN = list.n();
            builderN.subList(start, end).retainAll(elements);
            PersistentList persistentListBuild = builderN.build();
            if (Intrinsics.areEqual(persistentListBuild, list)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.nHg()) {
                snapshotT = Snapshot.INSTANCE.t();
                zO = O((StateListStateRecord) SnapshotKt.k(stateListStateRecord2, this, snapshotT), modification, persistentListBuild, true);
            }
            SnapshotKt.jB(snapshotT, this);
        } while (!zO);
        return size - size();
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection elements) {
        int modification;
        PersistentList list;
        Snapshot snapshotT;
        boolean zO;
        do {
            synchronized (SnapshotStateListKt.f30978n) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.X((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list = stateListStateRecord.getList();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(list);
            PersistentList persistentListRemoveAll = list.removeAll(elements);
            if (Intrinsics.areEqual(persistentListRemoveAll, list)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.nHg()) {
                snapshotT = Snapshot.INSTANCE.t();
                zO = O((StateListStateRecord) SnapshotKt.k(stateListStateRecord2, this, snapshotT), modification, persistentListRemoveAll, true);
            }
            SnapshotKt.jB(snapshotT, this);
        } while (!zO);
        return true;
    }

    @Override // java.util.List
    public Object set(int index, Object element) {
        int modification;
        PersistentList list;
        Snapshot snapshotT;
        boolean zO;
        Object obj = get(index);
        do {
            synchronized (SnapshotStateListKt.f30978n) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.X((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list = stateListStateRecord.getList();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(list);
            PersistentList persistentList = list.set(index, element);
            if (Intrinsics.areEqual(persistentList, list)) {
                return obj;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.nHg()) {
                snapshotT = Snapshot.INSTANCE.t();
                zO = O((StateListStateRecord) SnapshotKt.k(stateListStateRecord2, this, snapshotT), modification, persistentList, false);
            }
            SnapshotKt.jB(snapshotT, this);
        } while (!zO);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return Uo();
    }

    public String toString() {
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((StateListStateRecord) SnapshotKt.X((StateListStateRecord) firstStateRecord)).getList() + ")@" + hashCode();
    }

    @Override // java.util.List
    public void add(int index, Object element) {
        int modification;
        PersistentList list;
        Snapshot snapshotT;
        boolean zO;
        do {
            synchronized (SnapshotStateListKt.f30978n) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.X((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list = stateListStateRecord.getList();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(list);
            PersistentList persistentListAdd = list.add(index, element);
            if (Intrinsics.areEqual(persistentListAdd, list)) {
                return;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.nHg()) {
                snapshotT = Snapshot.INSTANCE.t();
                zO = O((StateListStateRecord) SnapshotKt.k(stateListStateRecord2, this, snapshotT), modification, persistentListAdd, true);
            }
            SnapshotKt.jB(snapshotT, this);
        } while (!zO);
    }
}
