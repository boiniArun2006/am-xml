package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.caoccao.javet.values.reference.IV8ValueArray;
import com.caoccao.javet.values.reference.V8ValueTypedArray;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b-\b\u0000\u0018\u0000 K*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001pB)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005¢\u0006\u0004\b\t\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001b\u001a\u00020\u00032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001b\u001a\u00020\u00032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010 J?\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b%\u0010&J5\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u0003H\u0002¢\u0006\u0004\b'\u0010(J=\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b)\u0010&JG\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00028\u00002\u0006\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b.\u0010/J%\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00100\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b1\u00102J-\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00100\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b3\u00104J\u001d\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00105\u001a\u00020\u0003H\u0002¢\u0006\u0004\b6\u0010\u0014J%\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00105\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\b9\u0010:J\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\b;\u0010<J)\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0015\u001a\u00028\u00002\n\u0010>\u001a\u0006\u0012\u0002\b\u00030=H\u0002¢\u0006\u0004\b?\u0010@J\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\bA\u0010<J)\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0015\u001a\u00028\u00002\n\u0010>\u001a\u0006\u0012\u0002\b\u00030=H\u0002¢\u0006\u0004\bB\u0010@J3\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010E\u001a\u00020D2\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\bF\u0010GJ/\u0010H\u001a\u0004\u0018\u00010\u00022\f\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010E\u001a\u00020D2\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\bH\u0010IJ/\u0010J\u001a\u0004\u0018\u00010\u00022\f\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010E\u001a\u00020D2\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\bJ\u0010IJ\u000f\u0010K\u001a\u00020\u0003H\u0002¢\u0006\u0004\bK\u0010LJ\u001d\u0010M\u001a\u00020\r2\f\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010O\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0000¢\u0006\u0004\bO\u0010PJ%\u0010R\u001a\u00020\r2\u0006\u0010Q\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u0003¢\u0006\u0004\bR\u0010SJ=\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010$\u001a\u00020\u00032\u0006\u0010E\u001a\u00020D2\n\u0010>\u001a\u0006\u0012\u0002\b\u00030=¢\u0006\u0004\bT\u0010UJ9\u0010V\u001a\u0004\u0018\u00010\u00022\f\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010$\u001a\u00020\u00032\u0006\u0010E\u001a\u00020D2\n\u0010>\u001a\u0006\u0012\u0002\b\u00030=¢\u0006\u0004\bV\u0010WJ9\u0010X\u001a\u0004\u0018\u00010\u00022\f\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010$\u001a\u00020\u00032\u0006\u0010E\u001a\u00020D2\n\u0010>\u001a\u0006\u0012\u0002\b\u00030=¢\u0006\u0004\bX\u0010WJ#\u0010Y\u001a\u00020\r2\f\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010$\u001a\u00020\u0003¢\u0006\u0004\bY\u0010ZJ+\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010Q\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u0003¢\u0006\u0004\b[\u0010\\J7\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010Q\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u00032\n\u0010>\u001a\u0006\u0012\u0002\b\u00030=¢\u0006\u0004\b]\u0010^J+\u0010_\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010Q\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u0003¢\u0006\u0004\b_\u0010\\J7\u0010`\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010Q\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u00032\n\u0010>\u001a\u0006\u0012\u0002\b\u00030=¢\u0006\u0004\b`\u0010^R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010L\"\u0004\bd\u0010eR*\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010o¨\u0006q"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "E", "", "", "bitmap", "", V8ValueTypedArray.PROPERTY_BUFFER, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "ownedBy", "<init>", "(I[Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "(I[Ljava/lang/Object;)V", "positionMask", "", "HI", "(I)Z", "index", "gh", "(I)Ljava/lang/Object;", "N", "(I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "element", "t", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "owner", "S", "(ILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "nodeIndex", "newNode", "wTp", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "elementIndex", "newElementHash", "newElement", IV8ValueArray.FUNCTION_SHIFT, "r", "(IILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "o", "(IILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "iF", "elementHash1", "element1", "elementHash2", "element2", "Ik", "(ILjava/lang/Object;ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "cellIndex", "s7N", "(II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "e", "(IILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", CmcdData.OBJECT_TYPE_INIT_SEGMENT, "KN", "g", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "J2", "(Ljava/lang/Object;)Z", "O", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;", "mutator", "WPU", "(Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "Uo", "ViF", "otherNode", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;", "intersectionSizeRef", "aYN", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "te", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Ljava/lang/Object;", "nY", "nr", "()I", "qie", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;)Z", "ck", "(I)I", "elementHash", "xMQ", "(ILjava/lang/Object;I)Z", "XQ", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "X", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Ljava/lang/Object;", "E2", "mUb", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;I)Z", "rl", "(ILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "Z", "(ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "nHg", "fD", c.f62177j, "I", "az", "setBitmap", "(I)V", "[Ljava/lang/Object;", "ty", "()[Ljava/lang/Object;", "setBuffer", "([Ljava/lang/Object;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "getOwnedBy", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "setOwnedBy", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "Companion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode\n+ 2 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt\n+ 3 ForEachOneBit.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ForEachOneBitKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt$filterTo$1\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,851:1\n54#2,13:852\n50#2,17:865\n50#2,17:882\n50#2,10:918\n60#2,7:929\n50#2,10:945\n60#2,7:956\n10#3,5:899\n15#3,4:905\n10#3,9:909\n10#3,9:936\n10#3,9:965\n1#4:904\n53#5:928\n53#5:955\n12271#6,2:963\n*S KotlinDebug\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode\n*L\n297#1:852,13\n324#1:865,17\n347#1:882,17\n594#1:918,10\n594#1:929,7\n701#1:945,10\n701#1:956,7\n423#1:899,5\n423#1:905,4\n525#1:909,9\n621#1:936,9\n717#1:965,9\n594#1:928\n701#1:955\n710#1:963,2\n*E\n"})
public final class TrieNode<E> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int bitmap;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private Object[] buffer;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private MutabilityOwnership ownedBy;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f30631O = 8;
    private static final TrieNode J2 = new TrieNode(0, new Object[0]);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", c.f62177j, "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TrieNode n() {
            return TrieNode.J2;
        }
    }

    public TrieNode(int i2, Object[] objArr, MutabilityOwnership mutabilityOwnership) {
        this.bitmap = i2;
        this.buffer = objArr;
        this.ownedBy = mutabilityOwnership;
    }

    private final boolean qie(TrieNode otherNode) {
        if (this == otherNode) {
            return true;
        }
        if (this.bitmap != otherNode.bitmap) {
            return false;
        }
        int length = this.buffer.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.buffer[i2] != otherNode.buffer[i2]) {
                return false;
            }
        }
        return true;
    }

    public final TrieNode fD(int elementHash, Object element, int shift, PersistentHashSetBuilder mutator) {
        int iNr = 1 << TrieNodeKt.nr(elementHash, shift);
        if (!HI(iNr)) {
            int iCk = ck(iNr);
            Object obj = this.buffer[iCk];
            if (obj instanceof TrieNode) {
                TrieNode trieNodeN = N(iCk);
                TrieNode trieNodeViF = shift == 30 ? trieNodeN.ViF(element, mutator) : trieNodeN.fD(elementHash, element, shift + 5, mutator);
                if (this.ownedBy == mutator.getOwnership() || trieNodeN != trieNodeViF) {
                    return T(iCk, trieNodeViF, mutator.getOwnership());
                }
            } else if (Intrinsics.areEqual(element, obj)) {
                mutator.setSize(mutator.size() - 1);
                return e(iCk, iNr, mutator.getOwnership());
            }
        }
        return this;
    }

    public final boolean mUb(TrieNode otherNode, int shift) {
        if (this == otherNode) {
            return true;
        }
        if (shift > 30) {
            for (Object obj : otherNode.buffer) {
                if (!ArraysKt.contains(this.buffer, obj)) {
                    return false;
                }
            }
            return true;
        }
        int i2 = this.bitmap;
        int i3 = otherNode.bitmap;
        int i5 = i2 & i3;
        if (i5 != i3) {
            return false;
        }
        while (i5 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i5);
            int iCk = ck(iLowestOneBit);
            int iCk2 = otherNode.ck(iLowestOneBit);
            Object obj2 = this.buffer[iCk];
            Object obj3 = otherNode.buffer[iCk2];
            boolean z2 = obj2 instanceof TrieNode;
            boolean z3 = obj3 instanceof TrieNode;
            if (z2 && z3) {
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                if (!((TrieNode) obj2).mUb((TrieNode) obj3, shift + 5)) {
                    return false;
                }
            } else if (z2) {
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                if (!((TrieNode) obj2).xMQ(obj3 != null ? obj3.hashCode() : 0, obj3, shift + 5)) {
                    return false;
                }
            } else if (z3 || !Intrinsics.areEqual(obj2, obj3)) {
                return false;
            }
            i5 ^= iLowestOneBit;
        }
        return true;
    }

    public final TrieNode nHg(int elementHash, Object element, int shift) {
        int iNr = 1 << TrieNodeKt.nr(elementHash, shift);
        if (!HI(iNr)) {
            int iCk = ck(iNr);
            Object obj = this.buffer[iCk];
            if (obj instanceof TrieNode) {
                TrieNode trieNodeN = N(iCk);
                TrieNode trieNodeUo = shift == 30 ? trieNodeN.Uo(element) : trieNodeN.nHg(elementHash, element, shift + 5);
                if (trieNodeN != trieNodeUo) {
                    return wTp(iCk, trieNodeUo);
                }
            } else if (Intrinsics.areEqual(element, obj)) {
                return s7N(iCk, iNr);
            }
        }
        return this;
    }

    public final TrieNode rl(int elementHash, Object element, int shift) {
        int iNr = 1 << TrieNodeKt.nr(elementHash, shift);
        if (HI(iNr)) {
            return t(iNr, element);
        }
        int iCk = ck(iNr);
        Object obj = this.buffer[iCk];
        if (obj instanceof TrieNode) {
            TrieNode trieNodeN = N(iCk);
            TrieNode trieNodeO = shift == 30 ? trieNodeN.O(element) : trieNodeN.rl(elementHash, element, shift + 5);
            if (trieNodeN != trieNodeO) {
                return wTp(iCk, trieNodeO);
            }
        } else if (!Intrinsics.areEqual(element, obj)) {
            return o(iCk, elementHash, element, shift);
        }
        return this;
    }

    public final boolean xMQ(int elementHash, Object element, int shift) {
        int iNr = 1 << TrieNodeKt.nr(elementHash, shift);
        if (HI(iNr)) {
            return false;
        }
        int iCk = ck(iNr);
        Object obj = this.buffer[iCk];
        if (!(obj instanceof TrieNode)) {
            return Intrinsics.areEqual(element, obj);
        }
        TrieNode trieNodeN = N(iCk);
        return shift == 30 ? trieNodeN.J2(element) : trieNodeN.xMQ(elementHash, element, shift + 5);
    }

    private final boolean HI(int positionMask) {
        return (positionMask & this.bitmap) == 0;
    }

    private final TrieNode Ik(int elementHash1, Object element1, int elementHash2, Object element2, int shift, MutabilityOwnership owner) {
        if (shift > 30) {
            return new TrieNode(0, new Object[]{element1, element2}, owner);
        }
        int iNr = TrieNodeKt.nr(elementHash1, shift);
        int iNr2 = TrieNodeKt.nr(elementHash2, shift);
        if (iNr != iNr2) {
            return new TrieNode((1 << iNr) | (1 << iNr2), iNr < iNr2 ? new Object[]{element1, element2} : new Object[]{element2, element1}, owner);
        }
        return new TrieNode(1 << iNr, new Object[]{Ik(elementHash1, element1, elementHash2, element2, shift + 5, owner)}, owner);
    }

    private final boolean J2(Object element) {
        return ArraysKt.contains(this.buffer, element);
    }

    private final TrieNode KN(int i2) {
        return new TrieNode(0, TrieNodeKt.O(this.buffer, i2));
    }

    private final TrieNode N(int index) {
        Object obj = this.buffer[index];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        return (TrieNode) obj;
    }

    private final TrieNode T(int nodeIndex, TrieNode newNode, MutabilityOwnership owner) {
        Object[] objArr = newNode.buffer;
        Object obj = newNode;
        if (objArr.length == 1) {
            Object obj2 = objArr[0];
            obj = newNode;
            if (!(obj2 instanceof TrieNode)) {
                if (this.buffer.length == 1) {
                    newNode.bitmap = this.bitmap;
                    return newNode;
                }
                obj = obj2;
            }
        }
        if (this.ownedBy == owner) {
            this.buffer[nodeIndex] = obj;
            return this;
        }
        Object[] objArr2 = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[nodeIndex] = obj;
        return new TrieNode(this.bitmap, objArrCopyOf, owner);
    }

    private final TrieNode Uo(Object element) {
        int iIndexOf = ArraysKt.indexOf(this.buffer, element);
        return iIndexOf != -1 ? KN(iIndexOf) : this;
    }

    private final TrieNode ViF(Object element, PersistentHashSetBuilder mutator) {
        int iIndexOf = ArraysKt.indexOf(this.buffer, element);
        if (iIndexOf == -1) {
            return this;
        }
        mutator.setSize(mutator.size() - 1);
        return g(iIndexOf, mutator.getOwnership());
    }

    private final TrieNode aYN(TrieNode otherNode, DeltaCounter intersectionSizeRef, MutabilityOwnership owner) {
        if (this == otherNode) {
            intersectionSizeRef.rl(this.buffer.length);
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + otherNode.buffer.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        Object[] objArr2 = otherNode.buffer;
        int length = this.buffer.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < objArr2.length) {
            CommonFunctionsKt.n(i3 <= i2);
            if (!J2(objArr2[i2])) {
                objArrCopyOf[length + i3] = objArr2[i2];
                i3++;
                CommonFunctionsKt.n(length + i3 <= objArrCopyOf.length);
            }
            i2++;
        }
        int length2 = i3 + this.buffer.length;
        intersectionSizeRef.rl(objArrCopyOf.length - length2);
        if (length2 == this.buffer.length) {
            return this;
        }
        if (length2 == otherNode.buffer.length) {
            return otherNode;
        }
        if (length2 != objArrCopyOf.length) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, length2);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        }
        if (!Intrinsics.areEqual(this.ownedBy, owner)) {
            return new TrieNode(0, objArrCopyOf, owner);
        }
        this.buffer = objArrCopyOf;
        return this;
    }

    private final TrieNode e(int cellIndex, int positionMask, MutabilityOwnership owner) {
        if (this.ownedBy != owner) {
            return new TrieNode(positionMask ^ this.bitmap, TrieNodeKt.O(this.buffer, cellIndex), owner);
        }
        this.buffer = TrieNodeKt.O(this.buffer, cellIndex);
        this.bitmap ^= positionMask;
        return this;
    }

    private final TrieNode g(int i2, MutabilityOwnership owner) {
        if (this.ownedBy != owner) {
            return new TrieNode(0, TrieNodeKt.O(this.buffer, i2), owner);
        }
        this.buffer = TrieNodeKt.O(this.buffer, i2);
        return this;
    }

    private final Object gh(int index) {
        return this.buffer[index];
    }

    private final TrieNode iF(int elementIndex, int newElementHash, Object newElement, int shift, MutabilityOwnership owner) {
        if (this.ownedBy == owner) {
            this.buffer[elementIndex] = r(elementIndex, newElementHash, newElement, shift, owner);
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[elementIndex] = r(elementIndex, newElementHash, newElement, shift, owner);
        return new TrieNode(this.bitmap, objArrCopyOf, owner);
    }

    private final Object nY(TrieNode otherNode, DeltaCounter intersectionSizeRef, MutabilityOwnership owner) {
        if (this == otherNode) {
            intersectionSizeRef.rl(this.buffer.length);
            return J2;
        }
        Object[] objArr = Intrinsics.areEqual(owner, this.ownedBy) ? this.buffer : new Object[this.buffer.length];
        Object[] objArr2 = this.buffer;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= objArr2.length) {
                break;
            }
            CommonFunctionsKt.n(i3 <= i2);
            if (!otherNode.J2(objArr2[i2])) {
                objArr[i3] = objArr2[i2];
                i3++;
                CommonFunctionsKt.n(i3 <= objArr.length);
            }
            i2++;
        }
        intersectionSizeRef.rl(this.buffer.length - i3);
        if (i3 == 0) {
            return J2;
        }
        if (i3 == 1) {
            return objArr[0];
        }
        if (i3 == this.buffer.length) {
            return this;
        }
        if (i3 == objArr.length) {
            return new TrieNode(0, objArr, owner);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i3);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        return new TrieNode(0, objArrCopyOf, owner);
    }

    private final int nr() {
        if (this.bitmap == 0) {
            return this.buffer.length;
        }
        int iNr = 0;
        for (Object obj : this.buffer) {
            iNr += obj instanceof TrieNode ? ((TrieNode) obj).nr() : 1;
        }
        return iNr;
    }

    private final TrieNode o(int elementIndex, int newElementHash, Object newElement, int shift) {
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[elementIndex] = r(elementIndex, newElementHash, newElement, shift, null);
        return new TrieNode(this.bitmap, objArrCopyOf);
    }

    private final TrieNode s7N(int cellIndex, int positionMask) {
        return new TrieNode(positionMask ^ this.bitmap, TrieNodeKt.O(this.buffer, cellIndex));
    }

    private final Object te(TrieNode otherNode, DeltaCounter intersectionSizeRef, MutabilityOwnership owner) {
        if (this == otherNode) {
            intersectionSizeRef.rl(this.buffer.length);
            return this;
        }
        Object[] objArr = Intrinsics.areEqual(owner, this.ownedBy) ? this.buffer : new Object[Math.min(this.buffer.length, otherNode.buffer.length)];
        Object[] objArr2 = this.buffer;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= objArr2.length) {
                break;
            }
            CommonFunctionsKt.n(i3 <= i2);
            if (otherNode.J2(objArr2[i2])) {
                objArr[i3] = objArr2[i2];
                i3++;
                CommonFunctionsKt.n(i3 <= objArr.length);
            }
            i2++;
        }
        intersectionSizeRef.rl(i3);
        if (i3 == 0) {
            return J2;
        }
        if (i3 == 1) {
            return objArr[0];
        }
        if (i3 == this.buffer.length) {
            return this;
        }
        if (i3 == otherNode.buffer.length) {
            return otherNode;
        }
        if (i3 == objArr.length) {
            return new TrieNode(0, objArr, owner);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i3);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        return new TrieNode(0, objArrCopyOf, owner);
    }

    private final TrieNode wTp(int nodeIndex, TrieNode newNode) {
        Object[] objArr = newNode.buffer;
        Object obj = newNode;
        if (objArr.length == 1) {
            Object obj2 = objArr[0];
            obj = newNode;
            if (!(obj2 instanceof TrieNode)) {
                if (this.buffer.length == 1) {
                    newNode.bitmap = this.bitmap;
                    return newNode;
                }
                obj = obj2;
            }
        }
        Object[] objArr2 = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[nodeIndex] = obj;
        return new TrieNode(this.bitmap, objArrCopyOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object E2(TrieNode otherNode, int shift, DeltaCounter intersectionSizeRef, PersistentHashSetBuilder mutator) {
        TrieNode<E> trieNode;
        if (this == otherNode) {
            intersectionSizeRef.rl(nr());
            return J2;
        }
        if (shift > 30) {
            return nY(otherNode, intersectionSizeRef, mutator.getOwnership());
        }
        int i2 = this.bitmap & otherNode.bitmap;
        if (i2 != 0) {
            if (Intrinsics.areEqual(this.ownedBy, mutator.getOwnership())) {
                trieNode = this;
            } else {
                int i3 = this.bitmap;
                Object[] objArr = this.buffer;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                trieNode = new TrieNode<>(i3, objArrCopyOf, mutator.getOwnership());
            }
            int i5 = this.bitmap;
            while (i2 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i2);
                int iCk = ck(iLowestOneBit);
                int iCk2 = otherNode.ck(iLowestOneBit);
                Object objE2 = this.buffer[iCk];
                Object obj = otherNode.buffer[iCk2];
                boolean z2 = objE2 instanceof TrieNode;
                boolean z3 = obj instanceof TrieNode;
                if (z2 && z3) {
                    Intrinsics.checkNotNull(objE2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    objE2 = ((TrieNode) objE2).E2((TrieNode) obj, shift + 5, intersectionSizeRef, mutator);
                } else if (z2) {
                    Intrinsics.checkNotNull(objE2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    TrieNode trieNode2 = (TrieNode) objE2;
                    int size = mutator.size();
                    TrieNode trieNodeFD = trieNode2.fD(obj != null ? obj.hashCode() : 0, obj, shift + 5, mutator);
                    if (size != mutator.size()) {
                        intersectionSizeRef.rl(1);
                        Object[] objArr2 = trieNodeFD.buffer;
                        if (objArr2.length == 1) {
                            objE2 = objArr2[0];
                            if (objE2 instanceof TrieNode) {
                                objE2 = trieNodeFD;
                            }
                        }
                    }
                } else if (z3) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    if (((TrieNode) obj).xMQ(objE2 != null ? objE2.hashCode() : 0, objE2, shift + 5)) {
                        intersectionSizeRef.rl(1);
                        objE2 = J2;
                    }
                } else if (Intrinsics.areEqual(objE2, obj)) {
                    intersectionSizeRef.rl(1);
                    objE2 = J2;
                }
                if (objE2 == J2) {
                    i5 ^= iLowestOneBit;
                }
                trieNode.buffer[iCk] = objE2;
                i2 ^= iLowestOneBit;
            }
            int iBitCount = Integer.bitCount(i5);
            if (i5 == 0) {
                return J2;
            }
            if (i5 != this.bitmap) {
                if (iBitCount == 1 && shift != 0) {
                    Object obj2 = trieNode.buffer[trieNode.ck(i5)];
                    return obj2 instanceof TrieNode ? new TrieNode(i5, new Object[]{obj2}, mutator.getOwnership()) : obj2;
                }
                Object[] objArr3 = new Object[iBitCount];
                Object[] objArr4 = trieNode.buffer;
                int i7 = 0;
                int i8 = 0;
                while (i7 < objArr4.length) {
                    CommonFunctionsKt.n(i8 <= i7);
                    if (objArr4[i7] != INSTANCE.n()) {
                        objArr3[i8] = objArr4[i7];
                        i8++;
                        CommonFunctionsKt.n(i8 <= iBitCount);
                    }
                    i7++;
                }
                return new TrieNode(i5, objArr3, mutator.getOwnership());
            }
            if (!trieNode.qie(this)) {
                return trieNode;
            }
        }
        return this;
    }

    public final Object X(TrieNode otherNode, int shift, DeltaCounter intersectionSizeRef, PersistentHashSetBuilder mutator) {
        if (this == otherNode) {
            intersectionSizeRef.rl(nr());
            return this;
        }
        if (shift > 30) {
            return te(otherNode, intersectionSizeRef, mutator.getOwnership());
        }
        int i2 = this.bitmap & otherNode.bitmap;
        if (i2 == 0) {
            return J2;
        }
        TrieNode<E> trieNode = (Intrinsics.areEqual(this.ownedBy, mutator.getOwnership()) && i2 == this.bitmap) ? this : new TrieNode<>(i2, new Object[Integer.bitCount(i2)], mutator.getOwnership());
        int i3 = i2;
        int i5 = 0;
        int i7 = 0;
        while (i3 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i3);
            int iCk = ck(iLowestOneBit);
            int iCk2 = otherNode.ck(iLowestOneBit);
            Object objX = this.buffer[iCk];
            Object obj = otherNode.buffer[iCk2];
            boolean z2 = objX instanceof TrieNode;
            boolean z3 = obj instanceof TrieNode;
            if (z2 && z3) {
                Intrinsics.checkNotNull(objX, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                objX = ((TrieNode) objX).X((TrieNode) obj, shift + 5, intersectionSizeRef, mutator);
            } else if (z2) {
                Intrinsics.checkNotNull(objX, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                if (((TrieNode) objX).xMQ(obj != null ? obj.hashCode() : 0, obj, shift + 5)) {
                    intersectionSizeRef.rl(1);
                    objX = obj;
                } else {
                    objX = J2;
                }
            } else if (z3) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                if (((TrieNode) obj).xMQ(objX != null ? objX.hashCode() : 0, objX, shift + 5)) {
                    intersectionSizeRef.rl(1);
                } else {
                    objX = J2;
                }
            } else if (Intrinsics.areEqual(objX, obj)) {
                intersectionSizeRef.rl(1);
            } else {
                objX = J2;
            }
            if (objX != J2) {
                i5 |= iLowestOneBit;
            }
            trieNode.buffer[i7] = objX;
            i7++;
            i3 ^= iLowestOneBit;
        }
        int iBitCount = Integer.bitCount(i5);
        if (i5 == 0) {
            return J2;
        }
        if (i5 == i2) {
            return trieNode.qie(this) ? this : trieNode.qie(otherNode) ? otherNode : trieNode;
        }
        if (iBitCount == 1 && shift != 0) {
            Object obj2 = trieNode.buffer[trieNode.ck(i5)];
            return obj2 instanceof TrieNode ? new TrieNode(i5, new Object[]{obj2}, mutator.getOwnership()) : obj2;
        }
        Object[] objArr = new Object[iBitCount];
        Object[] objArr2 = trieNode.buffer;
        int i8 = 0;
        int i9 = 0;
        while (i8 < objArr2.length) {
            CommonFunctionsKt.n(i9 <= i8);
            if (objArr2[i8] != INSTANCE.n()) {
                objArr[i9] = objArr2[i8];
                i9++;
                CommonFunctionsKt.n(i9 <= iBitCount);
            }
            i8++;
        }
        return new TrieNode(i5, objArr, mutator.getOwnership());
    }

    public final TrieNode XQ(TrieNode otherNode, int shift, DeltaCounter intersectionSizeRef, PersistentHashSetBuilder mutator) {
        Object objIk;
        Object[] objArr;
        if (this == otherNode) {
            intersectionSizeRef.t(intersectionSizeRef.getCount() + nr());
            return this;
        }
        if (shift > 30) {
            return aYN(otherNode, intersectionSizeRef, mutator.getOwnership());
        }
        int i2 = this.bitmap;
        int i3 = otherNode.bitmap | i2;
        TrieNode trieNode = (i3 == i2 && Intrinsics.areEqual(this.ownedBy, mutator.getOwnership())) ? this : new TrieNode(i3, new Object[Integer.bitCount(i3)], mutator.getOwnership());
        int i5 = i3;
        int i7 = 0;
        while (i5 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i5);
            int iCk = ck(iLowestOneBit);
            int iCk2 = otherNode.ck(iLowestOneBit);
            Object[] objArr2 = trieNode.buffer;
            if (HI(iLowestOneBit)) {
                objIk = otherNode.buffer[iCk2];
            } else if (otherNode.HI(iLowestOneBit)) {
                objIk = this.buffer[iCk];
            } else {
                objIk = this.buffer[iCk];
                Object obj = otherNode.buffer[iCk2];
                boolean z2 = objIk instanceof TrieNode;
                boolean z3 = obj instanceof TrieNode;
                if (z2 && z3) {
                    Intrinsics.checkNotNull(objIk, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    objIk = ((TrieNode) objIk).XQ((TrieNode) obj, shift + 5, intersectionSizeRef, mutator);
                } else if (z2) {
                    Intrinsics.checkNotNull(objIk, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    TrieNode trieNode2 = (TrieNode) objIk;
                    int size = mutator.size();
                    objIk = trieNode2.Z(obj != null ? obj.hashCode() : 0, obj, shift + 5, mutator);
                    if (mutator.size() == size) {
                        intersectionSizeRef.t(intersectionSizeRef.getCount() + 1);
                    }
                    Unit unit = Unit.INSTANCE;
                } else if (z3) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    TrieNode trieNode3 = (TrieNode) obj;
                    int size2 = mutator.size();
                    objIk = trieNode3.Z(objIk != null ? objIk.hashCode() : 0, objIk, shift + 5, mutator);
                    if (mutator.size() == size2) {
                        intersectionSizeRef.t(intersectionSizeRef.getCount() + 1);
                    }
                    Unit unit2 = Unit.INSTANCE;
                } else if (Intrinsics.areEqual(objIk, obj)) {
                    intersectionSizeRef.t(intersectionSizeRef.getCount() + 1);
                    Unit unit3 = Unit.INSTANCE;
                } else {
                    objArr = objArr2;
                    objIk = Ik(objIk != null ? objIk.hashCode() : 0, objIk, obj != null ? obj.hashCode() : 0, obj, shift + 5, mutator.getOwnership());
                    objArr[i7] = objIk;
                    i7++;
                    i5 ^= iLowestOneBit;
                }
            }
            objArr = objArr2;
            objArr[i7] = objIk;
            i7++;
            i5 ^= iLowestOneBit;
        }
        return qie(trieNode) ? this : otherNode.qie(trieNode) ? otherNode : trieNode;
    }

    /* JADX INFO: renamed from: az, reason: from getter */
    public final int getBitmap() {
        return this.bitmap;
    }

    public final int ck(int positionMask) {
        return Integer.bitCount((positionMask - 1) & this.bitmap);
    }

    /* JADX INFO: renamed from: ty, reason: from getter */
    public final Object[] getBuffer() {
        return this.buffer;
    }

    private final TrieNode O(Object element) {
        if (J2(element)) {
            return this;
        }
        return new TrieNode(0, TrieNodeKt.t(this.buffer, 0, element));
    }

    private final TrieNode S(int positionMask, Object element, MutabilityOwnership owner) {
        int iCk = ck(positionMask);
        if (this.ownedBy != owner) {
            return new TrieNode(positionMask | this.bitmap, TrieNodeKt.t(this.buffer, iCk, element), owner);
        }
        this.buffer = TrieNodeKt.t(this.buffer, iCk, element);
        this.bitmap = positionMask | this.bitmap;
        return this;
    }

    private final TrieNode WPU(Object element, PersistentHashSetBuilder mutator) {
        if (J2(element)) {
            return this;
        }
        mutator.setSize(mutator.size() + 1);
        if (this.ownedBy == mutator.getOwnership()) {
            this.buffer = TrieNodeKt.t(this.buffer, 0, element);
            return this;
        }
        return new TrieNode(0, TrieNodeKt.t(this.buffer, 0, element), mutator.getOwnership());
    }

    private final TrieNode r(int elementIndex, int newElementHash, Object newElement, int shift, MutabilityOwnership owner) {
        int iHashCode;
        Object objGh = gh(elementIndex);
        if (objGh != null) {
            iHashCode = objGh.hashCode();
        } else {
            iHashCode = 0;
        }
        return Ik(iHashCode, objGh, newElementHash, newElement, shift + 5, owner);
    }

    private final TrieNode t(int positionMask, Object element) {
        return new TrieNode(positionMask | this.bitmap, TrieNodeKt.t(this.buffer, ck(positionMask), element));
    }

    public final TrieNode Z(int elementHash, Object element, int shift, PersistentHashSetBuilder mutator) {
        TrieNode trieNodeZ;
        int iNr = 1 << TrieNodeKt.nr(elementHash, shift);
        if (HI(iNr)) {
            mutator.setSize(mutator.size() + 1);
            return S(iNr, element, mutator.getOwnership());
        }
        int iCk = ck(iNr);
        Object obj = this.buffer[iCk];
        if (obj instanceof TrieNode) {
            TrieNode trieNodeN = N(iCk);
            if (shift == 30) {
                trieNodeZ = trieNodeN.WPU(element, mutator);
            } else {
                trieNodeZ = trieNodeN.Z(elementHash, element, shift + 5, mutator);
            }
            if (trieNodeN != trieNodeZ) {
                return T(iCk, trieNodeZ, mutator.getOwnership());
            }
        } else if (!Intrinsics.areEqual(element, obj)) {
            mutator.setSize(mutator.size() + 1);
            return iF(iCk, elementHash, element, shift, mutator.getOwnership());
        }
        return this;
    }

    public TrieNode(int i2, Object[] objArr) {
        this(i2, objArr, null);
    }
}
