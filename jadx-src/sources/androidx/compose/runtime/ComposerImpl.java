package androidx.compose.runtime;

import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.GroupKind;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.changelist.ComposerChangeListWriter;
import androidx.compose.runtime.changelist.FixupList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.internal.Utils_jvmKt;
import androidx.compose.runtime.snapshots.ListUtilsKt;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.applovin.sdk.AppLovinEventTypes;
import com.caoccao.javet.exceptions.JavetError;
import com.caoccao.javet.values.reference.IV8ValueMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000ð\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n*\u0002«\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0004ó\u0002ô\u0002BI\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001f\u0010\u0014J\u000f\u0010 \u001a\u00020\u0012H\u0002¢\u0006\u0004\b \u0010\u0014J\u0019\u0010\"\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\"\u0010#J\u0011\u0010%\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020'2\u0006\u0010*\u001a\u00020\u0017H\u0002¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020'2\u0006\u0010-\u001a\u00020'2\u0006\u0010.\u001a\u00020'H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00122\u0006\u00101\u001a\u00020'H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0012H\u0002¢\u0006\u0004\b4\u0010\u0014J\u000f\u00105\u001a\u00020\u0012H\u0002¢\u0006\u0004\b5\u0010\u0014J\u000f\u00106\u001a\u00020\u0012H\u0002¢\u0006\u0004\b6\u0010\u0014J!\u0010:\u001a\u00020\u00122\u0006\u00108\u001a\u0002072\b\u00109\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b:\u0010;J6\u0010?\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010<\u001a\u0004\u0018\u00010\u001b2\u0006\u0010>\u001a\u00020=2\b\u00109\u001a\u0004\u0018\u00010\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b?\u0010@J!\u0010C\u001a\u00020\u00122\u0006\u00108\u001a\u0002072\b\u0010B\u001a\u0004\u0018\u00010AH\u0002¢\u0006\u0004\bC\u0010DJ\u001f\u0010G\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u00172\u0006\u0010F\u001a\u000207H\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020\u00122\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u0012H\u0002¢\u0006\u0004\bK\u0010\u0014J\u0017\u0010M\u001a\u00020\u00172\u0006\u0010L\u001a\u00020\u0017H\u0002¢\u0006\u0004\bM\u0010NJ\u001f\u0010P\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00172\u0006\u0010O\u001a\u00020\u0017H\u0002¢\u0006\u0004\bP\u0010QJ/\u0010U\u001a\u00020\u00172\u0006\u0010R\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u00172\u0006\u0010S\u001a\u00020\u00172\u0006\u0010T\u001a\u00020\u0017H\u0002¢\u0006\u0004\bU\u0010VJ\u0017\u0010W\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u0017H\u0002¢\u0006\u0004\bW\u0010NJ\u0017\u0010X\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u0017H\u0002¢\u0006\u0004\bX\u0010NJ\u001f\u0010Z\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00172\u0006\u0010Y\u001a\u00020\u0017H\u0002¢\u0006\u0004\bZ\u0010QJ\u000f\u0010[\u001a\u00020\u0012H\u0002¢\u0006\u0004\b[\u0010\u0014J'\u0010_\u001a\u00020\u00122\u0006\u0010\\\u001a\u00020\u00172\u0006\u0010]\u001a\u00020\u00172\u0006\u0010^\u001a\u00020\u0017H\u0002¢\u0006\u0004\b_\u0010`J\u001f\u0010b\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00172\u0006\u0010a\u001a\u00020\u0017H\u0002¢\u0006\u0004\bb\u0010QJ'\u0010d\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u00172\u0006\u0010S\u001a\u00020\u00172\u0006\u0010c\u001a\u00020\u0017H\u0002¢\u0006\u0004\bd\u0010eJ\u001b\u0010g\u001a\u00020\u0017*\u00020f2\u0006\u0010*\u001a\u00020\u0017H\u0002¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020\u0012H\u0002¢\u0006\u0004\bi\u0010\u0014J\u000f\u0010j\u001a\u00020\u0012H\u0002¢\u0006\u0004\bj\u0010\u0014J9\u0010p\u001a\u00020\u00122\u000e\u0010l\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0k2\u0006\u0010m\u001a\u00020'2\b\u0010n\u001a\u0004\u0018\u00010\u001b2\u0006\u0010o\u001a\u000207H\u0002¢\u0006\u0004\bp\u0010qJ+\u0010v\u001a\u00020\u00122\u001a\u0010u\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020t\u0012\u0006\u0012\u0004\u0018\u00010t0s0rH\u0002¢\u0006\u0004\bv\u0010wJf\u0010\u007f\u001a\u00028\u0000\"\u0004\b\u0000\u0010x2\n\b\u0002\u0010y\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010z\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u00172\u001c\b\u0002\u0010|\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020{\u0012\u0006\u0012\u0004\u0018\u00010\u001b0s0r2\f\u0010~\u001a\b\u0012\u0004\u0012\u00028\u00000}H\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001JA\u0010\u0084\u0001\u001a\u00020\u00122\u0014\u0010\u0082\u0001\u001a\u000f\u0012\u0004\u0012\u00020{\u0012\u0004\u0012\u00020\u001b0\u0081\u00012\u0014\u0010l\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0018\u00010}¢\u0006\u0003\b\u0083\u0001H\u0002ø\u0001\u0000¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J \u0010\u0086\u0001\u001a\u0004\u0018\u00010\u001b*\u00020f2\u0006\u0010L\u001a\u00020\u0017H\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0011\u0010\u0088\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u0088\u0001\u0010\u0014J\u0011\u0010\u0089\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u0089\u0001\u0010\u0014J\u001b\u0010\u008b\u0001\u001a\u00020\u00122\u0007\u0010\u008a\u0001\u001a\u00020$H\u0002¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0011\u0010\u008d\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u008d\u0001\u0010\u0014J\u001a\u0010\u008f\u0001\u001a\u00020\u00122\u0007\u0010\u008e\u0001\u001a\u00020\u0017H\u0002¢\u0006\u0005\b\u008f\u0001\u0010\u001aJ\u0011\u0010\u0090\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u0090\u0001\u0010\u0014J\u0011\u0010\u0091\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u0091\u0001\u0010\u0014J\u0011\u0010\u0092\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u0092\u0001\u0010\u0014J\u0019\u0010\u0093\u0001\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0005\b\u0093\u0001\u0010\u001aJ\u0011\u0010\u0094\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\b\u0094\u0001\u0010\u0014J\u0019\u0010\u0095\u0001\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0005\b\u0095\u0001\u0010\u001aJ\u0011\u0010\u0096\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\b\u0096\u0001\u0010\u0014J\u0011\u0010\u0097\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\b\u0097\u0001\u0010\u0014J\u0011\u0010\u0098\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\b\u0098\u0001\u0010\u0014J#\u0010\u0099\u0001\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0005\b\u0099\u0001\u0010\u001eJ\u0011\u0010\u009a\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\b\u009a\u0001\u0010\u0014J\u0011\u0010\u009b\u0001\u001a\u00020\u0012H\u0000¢\u0006\u0005\b\u009b\u0001\u0010\u0014J\u0011\u0010\u009c\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u009c\u0001\u0010\u0014J\u0011\u0010\u009d\u0001\u001a\u00020\u0012H\u0000¢\u0006\u0005\b\u009d\u0001\u0010\u0014J\u0011\u0010\u009e\u0001\u001a\u00020\u0012H\u0000¢\u0006\u0005\b\u009e\u0001\u0010\u0014J\u0011\u0010\u009f\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u009f\u0001\u0010\u0014J\u0011\u0010 \u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b \u0001\u0010\u0014J(\u0010¢\u0001\u001a\u00020\u0012\"\u0005\b\u0000\u0010 \u00012\r\u0010¡\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000}H\u0016¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u0011\u0010¤\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b¤\u0001\u0010\u0014J\u0011\u0010¥\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b¥\u0001\u0010\u0014J#\u0010¦\u0001\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0005\b¦\u0001\u0010\u001eJ\u0011\u0010§\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b§\u0001\u0010\u0014J\u000f\u0010¨\u0001\u001a\u00020\u0012¢\u0006\u0005\b¨\u0001\u0010\u0014J\u000f\u0010©\u0001\u001a\u00020\u0012¢\u0006\u0005\b©\u0001\u0010\u0014JI\u0010\u00ad\u0001\u001a\u00020\u0012\"\u0005\b\u0000\u0010ª\u0001\"\u0005\b\u0001\u0010 \u00012\u0006\u0010!\u001a\u00028\u00002\u001f\u0010~\u001a\u001b\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120«\u0001¢\u0006\u0003\b¬\u0001H\u0016¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J\u0014\u0010¯\u0001\u001a\u0004\u0018\u00010\u001bH\u0001¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u0014\u0010±\u0001\u001a\u0004\u0018\u00010\u001bH\u0001¢\u0006\u0006\b±\u0001\u0010°\u0001J\u001c\u0010²\u0001\u001a\u0002072\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0006\b²\u0001\u0010³\u0001J\u001c\u0010´\u0001\u001a\u0002072\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0006\b´\u0001\u0010³\u0001J\u001b\u0010¶\u0001\u001a\u0002072\u0007\u0010!\u001a\u00030µ\u0001H\u0017¢\u0006\u0006\b¶\u0001\u0010·\u0001J\u001a\u0010¸\u0001\u001a\u0002072\u0006\u0010!\u001a\u000207H\u0017¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\u001b\u0010»\u0001\u001a\u0002072\u0007\u0010!\u001a\u00030º\u0001H\u0017¢\u0006\u0006\b»\u0001\u0010¼\u0001J\u001b\u0010¾\u0001\u001a\u0002072\u0007\u0010!\u001a\u00030½\u0001H\u0017¢\u0006\u0006\b¾\u0001\u0010¿\u0001J\u001a\u0010À\u0001\u001a\u0002072\u0006\u0010!\u001a\u00020\u0017H\u0017¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J\u001b\u0010Â\u0001\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0001¢\u0006\u0005\bÂ\u0001\u0010#J\u001b\u0010Ã\u0001\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0001¢\u0006\u0005\bÃ\u0001\u0010#J!\u0010Å\u0001\u001a\u00020\u00122\r\u0010Ä\u0001\u001a\b\u0012\u0004\u0012\u00020\u00120}H\u0016¢\u0006\u0006\bÅ\u0001\u0010£\u0001J\u001f\u0010Ç\u0001\u001a\u00020\u00122\u000b\u0010!\u001a\u0007\u0012\u0002\b\u00030Æ\u0001H\u0017¢\u0006\u0006\bÇ\u0001\u0010È\u0001J\u0011\u0010É\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\bÉ\u0001\u0010\u0014J)\u0010Ì\u0001\u001a\u00020\u00122\u0015\u0010Ë\u0001\u001a\u0010\u0012\u000b\b\u0001\u0012\u0007\u0012\u0002\b\u00030Æ\u00010Ê\u0001H\u0017¢\u0006\u0006\bÌ\u0001\u0010Í\u0001J\u0011\u0010Î\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\bÎ\u0001\u0010\u0014J(\u0010Ð\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010 \u00012\r\u0010\u0018\u001a\t\u0012\u0004\u0012\u00028\u00000Ï\u0001H\u0017¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001J\u0012\u0010Ò\u0001\u001a\u00020\u0004H\u0016¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001J&\u0010Ö\u0001\u001a\u0002072\u0007\u0010Ô\u0001\u001a\u00020{2\t\u0010Õ\u0001\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0006\bÖ\u0001\u0010×\u0001J\u0011\u0010Ø\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\bØ\u0001\u0010\u0014J$\u0010Û\u0001\u001a\u0002072\u0007\u0010Ù\u0001\u001a\u0002072\u0007\u0010Ú\u0001\u001a\u00020\u0017H\u0017¢\u0006\u0006\bÛ\u0001\u0010Ü\u0001J\u0011\u0010Ý\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\bÝ\u0001\u0010\u0014J\u001a\u0010ß\u0001\u001a\u00020\u00122\u0007\u0010Þ\u0001\u001a\u000207H\u0017¢\u0006\u0005\bß\u0001\u0010JJ\u001a\u0010à\u0001\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0006\bà\u0001\u0010á\u0001J\u0015\u0010ã\u0001\u001a\u0005\u0018\u00010â\u0001H\u0017¢\u0006\u0006\bã\u0001\u0010ä\u0001J(\u0010å\u0001\u001a\u00020\u00122\n\u0010!\u001a\u0006\u0012\u0002\b\u00030k2\b\u0010n\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0006\bå\u0001\u0010æ\u0001J-\u0010ç\u0001\u001a\u00020\u00122\u001a\u0010u\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020t\u0012\u0006\u0012\u0004\u0018\u00010t0s0rH\u0017¢\u0006\u0005\bç\u0001\u0010wJK\u0010ê\u0001\u001a\u00020\u00122\u0014\u0010\u0082\u0001\u001a\u000f\u0012\u0004\u0012\u00020{\u0012\u0004\u0012\u00020\u001b0\u0081\u00012\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u00120}¢\u0006\u0003\b\u0083\u00012\n\u0010é\u0001\u001a\u0005\u0018\u00010è\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\bê\u0001\u0010ë\u0001J \u0010ì\u0001\u001a\u00020\u00122\f\u0010~\u001a\b\u0012\u0004\u0012\u00020\u00120}H\u0000¢\u0006\u0006\bì\u0001\u0010£\u0001J7\u0010í\u0001\u001a\u0002072\u0014\u0010\u0082\u0001\u001a\u000f\u0012\u0004\u0012\u00020{\u0012\u0004\u0012\u00020\u001b0\u0081\u00012\n\u0010é\u0001\u001a\u0005\u0018\u00010è\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\bí\u0001\u0010î\u0001J)\u0010ï\u0001\u001a\u00020\u00122\u0014\u0010\u0082\u0001\u001a\u000f\u0012\u0004\u0012\u00020{\u0012\u0004\u0012\u00020\u001b0\u0081\u0001ø\u0001\u0000¢\u0006\u0006\bï\u0001\u0010ð\u0001J\u0014\u0010ñ\u0001\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0006\bñ\u0001\u0010°\u0001J\u001b\u0010ò\u0001\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0005\bò\u0001\u0010#J\u001c\u0010ô\u0001\u001a\u00020\u00122\b\u0010Ô\u0001\u001a\u00030ó\u0001H\u0016¢\u0006\u0006\bô\u0001\u0010õ\u0001R\"\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b»\u0001\u0010ö\u0001\u001a\u0006\b÷\u0001\u0010ø\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010ù\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010ú\u0001R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010û\u0001R\u0018\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bü\u0001\u0010ý\u0001R\u0018\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bß\u0001\u0010ý\u0001R\u001e\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bà\u0001\u0010þ\u0001\u001a\u0006\bÿ\u0001\u0010\u0080\u0002R&\u0010\u0084\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010A0\u0081\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\b\u0082\u0002\u0010\u0083\u0002R\u001b\u0010\u0086\u0002\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b÷\u0001\u0010\u0085\u0002R\u0019\u0010\u0088\u0002\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bã\u0001\u0010\u0087\u0002R\u0019\u0010\u0089\u0002\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u0087\u0002R\u0019\u0010\u008a\u0002\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010\u0087\u0002R\u0018\u0010\u008d\u0002\u001a\u00030\u008b\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÐ\u0001\u0010\u008c\u0002R\u001c\u0010\u0090\u0002\u001a\u0005\u0018\u00010\u008e\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0001\u0010\u008f\u0002R\u001c\u0010\u0094\u0002\u001a\u0005\u0018\u00010\u0091\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0002\u0010\u0093\u0002R\u0019\u0010\u0096\u0002\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0002\u0010É\u0001R\u0019\u0010\u0097\u0002\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010É\u0001R\u0019\u0010\u0098\u0002\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bò\u0001\u0010É\u0001R\u001e\u0010|\u001a\n\u0012\u0005\u0012\u00030\u009a\u00020\u0099\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÉ\u0001\u0010\u009b\u0002R\u0018\u0010\u009c\u0002\u001a\u00030\u008b\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010\u008c\u0002R\u0019\u0010\u009e\u0002\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u009d\u0002R\"\u0010¡\u0002\u001a\u000b\u0012\u0004\u0012\u00020'\u0018\u00010\u009f\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bå\u0001\u0010 \u0002R\u0019\u0010¢\u0002\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010É\u0001R\u0018\u0010£\u0002\u001a\u00030\u008b\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u008c\u0002R\u0019\u0010¥\u0002\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0002\u0010É\u0001R\u0019\u0010¦\u0002\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010\u0087\u0002R\u0019\u0010§\u0002\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0087\u0002R\u0019\u0010¨\u0002\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bñ\u0001\u0010\u0087\u0002R\u0019\u0010ª\u0002\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0002\u0010É\u0001R\u0018\u0010\u00ad\u0002\u001a\u00030«\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010¬\u0002R$\u0010®\u0002\u001a\t\u0012\u0004\u0012\u00020{0\u0081\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0083\u0002R*\u0010²\u0002\u001a\u0002072\u0007\u0010¯\u0002\u001a\u0002078\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010É\u0001\u001a\u0006\b°\u0002\u0010±\u0002R*\u0010´\u0002\u001a\u0002072\u0007\u0010¯\u0002\u001a\u0002078\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b \u0001\u0010É\u0001\u001a\u0006\b³\u0002\u0010±\u0002R)\u0010º\u0002\u001a\u00020f8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÇ\u0001\u0010µ\u0002\u001a\u0006\b¶\u0002\u0010·\u0002\"\u0006\b¸\u0002\u0010¹\u0002R)\u0010¿\u0002\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¦\u0001\u0010ú\u0001\u001a\u0006\b»\u0002\u0010¼\u0002\"\u0006\b½\u0002\u0010¾\u0002R\u001a\u0010Â\u0002\u001a\u00030À\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010Á\u0002R\u0019\u0010Ã\u0002\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0001\u0010É\u0001R\u001b\u0010Ä\u0002\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÎ\u0001\u0010\u009d\u0002R+\u0010Ê\u0002\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÅ\u0002\u0010ý\u0001\u001a\u0006\bÆ\u0002\u0010Ç\u0002\"\u0006\bÈ\u0002\u0010É\u0002R\u0018\u0010Í\u0002\u001a\u00030Ë\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bô\u0001\u0010Ì\u0002R\u0019\u0010Ï\u0002\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010Î\u0002R\u001a\u0010Ó\u0002\u001a\u00030Ð\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÑ\u0002\u0010Ò\u0002R\u001c\u0010Õ\u0002\u001a\u0005\u0018\u00010è\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0001\u0010Ô\u0002R0\u0010F\u001a\u0002072\u0007\u0010¯\u0002\u001a\u0002078\u0016@RX\u0097\u000e¢\u0006\u0017\n\u0006\b\u009a\u0001\u0010É\u0001\u0012\u0005\bÖ\u0002\u0010\u0014\u001a\u0006\bü\u0001\u0010±\u0002R1\u0010Ù\u0002\u001a\u00020\u00172\u0007\u0010¯\u0002\u001a\u00020\u00178\u0016@RX\u0097\u000e¢\u0006\u0017\n\u0006\b\u0094\u0001\u0010\u0087\u0002\u0012\u0005\bØ\u0002\u0010\u0014\u001a\u0006\bÑ\u0002\u0010×\u0002R\u001c\u0010Ü\u0002\u001a\u0005\u0018\u00010Ú\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010Û\u0002R\u001d\u0010ß\u0002\u001a\u0004\u0018\u00010\u001b*\u00020f8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÝ\u0002\u0010Þ\u0002R\u0017\u0010á\u0002\u001a\u0002078@X\u0080\u0004¢\u0006\b\u001a\u0006\bà\u0002\u0010±\u0002R\u0018\u0010ä\u0002\u001a\u00030â\u00028WX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0092\u0002\u0010ã\u0002R\u001e\u0010æ\u0002\u001a\u0002078VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bå\u0002\u0010\u0014\u001a\u0006\bÅ\u0002\u0010±\u0002R\u001e\u0010è\u0002\u001a\u0002078VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bç\u0002\u0010\u0014\u001a\u0006\b\u0082\u0002\u0010±\u0002R\u0018\u0010ê\u0002\u001a\u00030Ú\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b©\u0002\u0010é\u0002R\u0018\u0010í\u0002\u001a\u00030ë\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0095\u0002\u0010ì\u0002R\u0019\u0010ð\u0002\u001a\u0004\u0018\u00010{8@X\u0080\u0004¢\u0006\b\u001a\u0006\bî\u0002\u0010ï\u0002R\u001a\u0010ò\u0002\u001a\u0005\u0018\u00010ó\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¤\u0002\u0010ñ\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006õ\u0002"}, d2 = {"Landroidx/compose/runtime/ComposerImpl;", "Landroidx/compose/runtime/Composer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/CompositionContext;", "parentContext", "Landroidx/compose/runtime/SlotTable;", "slotTable", "", "Landroidx/compose/runtime/RememberObserver;", "abandonSet", "Landroidx/compose/runtime/changelist/ChangeList;", "changes", "lateChanges", "Landroidx/compose/runtime/ControlledComposition;", "composition", "<init>", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/SlotTable;Ljava/util/Set;Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/ControlledComposition;)V", "", "n7b", "()V", "Jk", "M", "", "key", "nO", "(I)V", "", "dataKey", "vl", "(ILjava/lang/Object;)V", "ul", "Vvq", "value", "Toy", "(Ljava/lang/Object;)V", "Landroidx/compose/runtime/Anchor;", "Qu", "()Landroidx/compose/runtime/Anchor;", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "pJg", "()Landroidx/compose/runtime/PersistentCompositionLocalMap;", "group", "ofS", "(I)Landroidx/compose/runtime/PersistentCompositionLocalMap;", "parentScope", "currentProviders", "jO", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;Landroidx/compose/runtime/PersistentCompositionLocalMap;)Landroidx/compose/runtime/PersistentCompositionLocalMap;", "providers", InneractiveMediationDefs.GENDER_FEMALE, "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)V", "Rl", "xg", "HV", "", "isNode", "data", "v0j", "(ZLjava/lang/Object;)V", "objectKey", "Landroidx/compose/runtime/GroupKind;", "kind", "Zn", "(ILjava/lang/Object;ILjava/lang/Object;)V", "Landroidx/compose/runtime/Pending;", "newPending", "qm", "(ZLandroidx/compose/runtime/Pending;)V", "expectedNodeCount", "inserting", "mYa", "(IZ)V", "eWT", "(Z)V", "Bu", "index", "ER", "(I)I", "newCount", "Mh", "(II)V", "groupLocation", "recomposeGroup", "recomposeIndex", "F", "(IIII)I", "tFV", "Th", JavetError.PARAMETER_COUNT, "g6", "ijL", "oldGroup", "newGroup", "commonRoot", "ub", "(III)V", "nearestCommonRoot", "fcU", "recomposeKey", "eTf", "(III)I", "Landroidx/compose/runtime/SlotReader;", "K", "(Landroidx/compose/runtime/SlotReader;I)I", "y", "dR0", "Landroidx/compose/runtime/MovableContent;", AppLovinEventTypes.USER_VIEWED_CONTENT, "locals", MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "force", "lLA", "(Landroidx/compose/runtime/MovableContent;Landroidx/compose/runtime/PersistentCompositionLocalMap;Ljava/lang/Object;Z)V", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "How", "(Ljava/util/List;)V", "R", "from", "to", "Landroidx/compose/runtime/RecomposeScopeImpl;", "invalidations", "Lkotlin/Function0;", "block", "mI", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ControlledComposition;Ljava/lang/Integer;Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Landroidx/compose/runtime/collection/ScopeMap;", "invalidationsRequested", "Landroidx/compose/runtime/Composable;", "G7", "(Landroidx/collection/MutableScatterMap;Lkotlin/jvm/functions/Function2;)V", "a63", "(Landroidx/compose/runtime/SlotReader;I)Ljava/lang/Object;", "xzo", "XNZ", "anchor", "Uf", "(Landroidx/compose/runtime/Anchor;)V", "p0N", "groupBeingRemoved", "UF", "HBN", "Org", "piY", "te", "M7", "eF", "Xw", "e", "S", "X", "P5", "z", "ViF", "Mx", "C", "qie", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "factory", "s7N", "(Lkotlin/jvm/functions/Function0;)V", "r", "XQ", "nHg", "g", "o9", "n1", "V", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "az", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "W", "()Ljava/lang/Object;", "RQ", "p5", "(Ljava/lang/Object;)Z", "E2", "", "O", "(C)Z", c.f62177j, "(Z)Z", "", "rl", "(F)Z", "", "nr", "(J)Z", "t", "(I)Z", "wKp", CmcdData.STREAMING_FORMAT_SS, "effect", "aYN", "Landroidx/compose/runtime/ProvidedValue;", "N", "(Landroidx/compose/runtime/ProvidedValue;)V", "Z", "", IV8ValueMap.FUNCTION_VALUES, "E", "([Landroidx/compose/runtime/ProvidedValue;)V", "v", "Landroidx/compose/runtime/CompositionLocal;", "ty", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "U", "()Landroidx/compose/runtime/CompositionContext;", "scope", "instance", "Aum", "(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Z", "uG", "parametersChanged", "flags", "HI", "(ZI)Z", "wTp", "changed", "Uo", "KN", "(I)Landroidx/compose/runtime/Composer;", "Landroidx/compose/runtime/ScopeUpdateScope;", "gh", "()Landroidx/compose/runtime/ScopeUpdateScope;", "WPU", "(Landroidx/compose/runtime/MovableContent;Ljava/lang/Object;)V", "tUK", "Landroidx/compose/runtime/ShouldPauseCallback;", "shouldPause", "m", "(Landroidx/collection/MutableScatterMap;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/ShouldPauseCallback;)V", "QZ6", "VwL", "(Landroidx/collection/MutableScatterMap;Landroidx/compose/runtime/ShouldPauseCallback;)Z", "Lp6", "(Landroidx/collection/MutableScatterMap;)V", "iF", "o", "Landroidx/compose/runtime/RecomposeScope;", "bzg", "(Landroidx/compose/runtime/RecomposeScope;)V", "Landroidx/compose/runtime/Applier;", "mUb", "()Landroidx/compose/runtime/Applier;", "Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/SlotTable;", "Ljava/util/Set;", "J2", "Landroidx/compose/runtime/changelist/ChangeList;", "Landroidx/compose/runtime/ControlledComposition;", "Po6", "()Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/Stack;", "xMQ", "Ljava/util/ArrayList;", "pendingStack", "Landroidx/compose/runtime/Pending;", "pending", "I", "nodeIndex", "groupNodeCount", "rGroupIndex", "Landroidx/compose/runtime/IntStack;", "Landroidx/compose/runtime/IntStack;", "parentStateStack", "", "[I", "nodeCountOverrides", "Landroidx/collection/MutableIntIntMap;", "ck", "Landroidx/collection/MutableIntIntMap;", "nodeCountVirtualOverrides", "Ik", "forceRecomposeScopes", "forciblyRecompose", "nodeExpected", "", "Landroidx/compose/runtime/Invalidation;", "Ljava/util/List;", "entersStack", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "parentProvider", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/collection/MutableIntObjectMap;", "providerUpdates", "providersInvalid", "providersInvalidStack", "nY", "reusing", "reusingGroup", "childrenComposing", "compositionToken", "fD", "sourceMarkersEnabled", "androidx/compose/runtime/ComposerImpl$derivedStateObserver$1", "Landroidx/compose/runtime/ComposerImpl$derivedStateObserver$1;", "derivedStateObserver", "invalidateStack", "<set-?>", "kSg", "()Z", "isComposing", "isDisposed$runtime_release", "isDisposed", "Landroidx/compose/runtime/SlotReader;", CmcdData.OBJECT_TYPE_INIT_SEGMENT, "()Landroidx/compose/runtime/SlotReader;", "EF", "(Landroidx/compose/runtime/SlotReader;)V", "reader", "getInsertTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "setInsertTable$runtime_release", "(Landroidx/compose/runtime/SlotTable;)V", "insertTable", "Landroidx/compose/runtime/SlotWriter;", "Landroidx/compose/runtime/SlotWriter;", "writer", "writerHasAProvider", "providerCache", "rV9", "hRu", "()Landroidx/compose/runtime/changelist/ChangeList;", "setDeferredChanges$runtime_release", "(Landroidx/compose/runtime/changelist/ChangeList;)V", "deferredChanges", "Landroidx/compose/runtime/changelist/ComposerChangeListWriter;", "Landroidx/compose/runtime/changelist/ComposerChangeListWriter;", "changeListWriter", "Landroidx/compose/runtime/Anchor;", "insertAnchor", "Landroidx/compose/runtime/changelist/FixupList;", "jB", "Landroidx/compose/runtime/changelist/FixupList;", "insertFixups", "Landroidx/compose/runtime/ShouldPauseCallback;", "shouldPauseCallback", "getInserting$annotations", "()I", "getCompoundKeyHash$annotations", "compoundKeyHash", "Landroidx/compose/runtime/tooling/CompositionData;", "Landroidx/compose/runtime/tooling/CompositionData;", "_compositionData", "UhV", "(Landroidx/compose/runtime/SlotReader;)Ljava/lang/Object;", "node", "GD", "areChildrenComposing", "Lkotlin/coroutines/CoroutineContext;", "()Lkotlin/coroutines/CoroutineContext;", "applyCoroutineContext", "getDefaultsInvalid$annotations", "defaultsInvalid", "getSkipping$annotations", "skipping", "()Landroidx/compose/runtime/tooling/CompositionData;", "compositionData", "Landroidx/compose/runtime/CompositionLocalMap;", "()Landroidx/compose/runtime/CompositionLocalMap;", "currentCompositionLocalMap", "EWS", "()Landroidx/compose/runtime/RecomposeScopeImpl;", "currentRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "recomposeScope", "CompositionContextHolder", "CompositionContextImpl", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 4 BitwiseOperators.kt\nandroidx/compose/runtime/BitwiseOperatorsKt\n+ 5 Trace.kt\nandroidx/compose/runtime/internal/TraceKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 8 CompositionLocalMap.kt\nandroidx/compose/runtime/CompositionLocalMapKt\n+ 9 Composer.kt\nandroidx/compose/runtime/GroupKind\n+ 10 IntIntMap.kt\nandroidx/collection/IntIntMap\n+ 11 ComposerChangeListWriter.kt\nandroidx/compose/runtime/changelist/ComposerChangeListWriter\n+ 12 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 13 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 14 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 15 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 16 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 17 Stack.kt\nandroidx/compose/runtime/IntStack\n+ 18 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4891:1\n4134#1,10:4900\n4144#1:4911\n4137#1,8:4912\n4134#1,10:4947\n4144#1:4958\n4137#1,8:4959\n4152#1,10:4969\n4162#1:4980\n4155#1,8:4981\n4152#1,10:4989\n4162#1:5000\n4155#1,8:5001\n4134#1,10:5013\n4144#1:5024\n4137#1,8:5025\n4152#1,10:5033\n4162#1:5044\n4155#1,8:5045\n3537#1,8:5081\n3546#1,3:5104\n4143#1:5207\n4144#1:5209\n4143#1:5210\n4144#1:5212\n4143#1:5213\n4144#1:5215\n4143#1:5216\n4144#1:5218\n4161#1:5220\n4162#1:5222\n4161#1:5223\n4162#1:5225\n4161#1:5226\n4162#1:5228\n4161#1:5229\n4162#1:5231\n1#2:4892\n158#3,7:4893\n158#3,7:5071\n158#3,3:5078\n162#3,3:5107\n158#3,3:5188\n162#3,3:5199\n27#4:4910\n27#4:4957\n23#4:4979\n23#4:4999\n27#4:5010\n27#4:5011\n27#4:5012\n27#4:5023\n23#4:5043\n27#4:5208\n27#4:5211\n27#4:5214\n27#4:5217\n27#4:5219\n23#4:5221\n23#4:5224\n23#4:5227\n23#4:5230\n23#4:5232\n45#5,5:4920\n45#5,3:5165\n49#5:5177\n4643#6,5:4925\n4643#6,5:4930\n4665#6:4941\n4643#6,5:4942\n4643#6,5:5053\n4643#6,5:5058\n4643#6,5:5120\n4643#6,5:5125\n4643#6,5:5130\n4643#6,5:5160\n4643#6,5:5178\n4643#6,5:5183\n4643#6,5:5202\n33#7,5:4935\n80#8:4940\n4574#9:4967\n4577#9:4968\n430#10:5009\n173#11,4:5063\n173#11,4:5089\n183#11,8:5093\n178#11,3:5101\n178#11,3:5111\n173#11,8:5191\n33#12,4:5067\n38#12:5110\n33#12,6:5114\n81#12,3:5236\n33#12,6:5239\n84#12:5245\n357#13,4:5135\n329#13,6:5139\n339#13,3:5146\n342#13,9:5150\n361#13:5159\n1399#14:5145\n1270#14:5149\n393#15,6:5168\n399#15,2:5175\n44#16:5174\n53#17:5233\n53#17:5234\n53#17:5235\n1855#18,2:5246\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n*L\n1508#1:4900,10\n1508#1:4911\n1508#1:4912,8\n2473#1:4947,10\n2473#1:4958\n2473#1:4959,8\n2616#1:4969,10\n2616#1:4980\n2616#1:4981,8\n2624#1:4989,10\n2624#1:5000\n2624#1:5001,8\n3156#1:5013,10\n3156#1:5024\n3156#1:5025,8\n3160#1:5033,10\n3160#1:5044\n3160#1:5045,8\n3500#1:5081,8\n3500#1:5104,3\n4136#1:5207\n4136#1:5209\n4137#1:5210\n4137#1:5212\n4138#1:5213\n4138#1:5215\n4139#1:5216\n4139#1:5218\n4154#1:5220\n4154#1:5222\n4155#1:5223\n4155#1:5225\n4156#1:5226\n4156#1:5228\n4157#1:5229\n4157#1:5231\n1446#1:4893,7\n3443#1:5071,7\n3499#1:5078,3\n3499#1:5107,3\n3926#1:5188,3\n3926#1:5199,3\n1508#1:4910\n2473#1:4957\n2616#1:4979\n2624#1:4999\n3081#1:5010\n3087#1:5011\n3092#1:5012\n3156#1:5023\n3160#1:5043\n4136#1:5208\n4137#1:5211\n4138#1:5214\n4139#1:5217\n4143#1:5219\n4154#1:5221\n4155#1:5224\n4156#1:5227\n4157#1:5230\n4161#1:5232\n1755#1:4920,5\n3673#1:5165,3\n3673#1:5177\n1826#1:4925,5\n1837#1:4930,5\n2445#1:4941\n2445#1:4942,5\n3204#1:5053,5\n3223#1:5058,5\n3613#1:5120,5\n3623#1:5125,5\n3640#1:5130,5\n3672#1:5160,5\n3729#1:5178,5\n3736#1:5183,5\n3938#1:5202,5\n1882#1:4935,5\n2266#1:4940\n2479#1:4967\n2504#1:4968\n2985#1:5009\n3420#1:5063,4\n3505#1:5089,4\n3506#1:5093,8\n3505#1:5101,3\n3420#1:5111,3\n3928#1:5191,8\n3422#1:5067,4\n3422#1:5110\n3564#1:5114,6\n3777#1:5236,3\n3777#1:5239,6\n3777#1:5245\n3658#1:5135,4\n3658#1:5139,6\n3658#1:5146,3\n3658#1:5150,9\n3658#1:5159\n3658#1:5145\n3658#1:5149\n3691#1:5168,6\n3691#1:5175,2\n3691#1:5174\n4166#1:5233\n4168#1:5234\n4170#1:5235\n3857#1:5246,2\n*E\n"})
public final class ComposerImpl implements Composer {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private final ComposerImpl$derivedStateObserver$1 derivedStateObserver;

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private int[] nodeCountOverrides;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private boolean forceRecomposeScopes;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private ChangeList changes;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final ControlledComposition composition;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private int compoundKeyHash;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private SlotReader reader;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final Set abandonSet;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private boolean inserting;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private boolean isDisposed;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private ShouldPauseCallback shouldPauseCallback;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private ChangeList lateChanges;

    /* JADX INFO: renamed from: WPU, reason: from kotlin metadata */
    private MutableIntObjectMap providerUpdates;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private boolean isComposing;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private Anchor insertAnchor;

    /* JADX INFO: renamed from: aYN, reason: from kotlin metadata */
    private boolean providersInvalid;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private int rGroupIndex;

    /* JADX INFO: renamed from: bzg, reason: from kotlin metadata */
    private final ComposerChangeListWriter changeListWriter;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private MutableIntIntMap nodeCountVirtualOverrides;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ArrayList invalidateStack;

    /* JADX INFO: renamed from: fD, reason: from kotlin metadata */
    private boolean sourceMarkersEnabled;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private int nodeIndex;

    /* JADX INFO: renamed from: iF, reason: from kotlin metadata */
    private int compositionToken;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private FixupList insertFixups;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private Pending pending;

    /* JADX INFO: renamed from: nHg, reason: from kotlin metadata */
    private SlotTable insertTable;

    /* JADX INFO: renamed from: nY, reason: from kotlin metadata */
    private boolean reusing;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final SlotTable slotTable;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean nodeExpected;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private CompositionData _compositionData;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private int groupNodeCount;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean forciblyRecompose;

    /* JADX INFO: renamed from: rV9, reason: from kotlin metadata */
    private ChangeList deferredChanges;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Applier applier;

    /* JADX INFO: renamed from: s7N, reason: from kotlin metadata */
    private SlotWriter writer;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final CompositionContext parentContext;

    /* JADX INFO: renamed from: te, reason: from kotlin metadata */
    private int childrenComposing;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private PersistentCompositionLocalMap providerCache;

    /* JADX INFO: renamed from: wTp, reason: from kotlin metadata */
    private boolean writerHasAProvider;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final ArrayList pendingStack = Stack.t(null, 1, null);

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final IntStack parentStateStack = new IntStack();

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final List invalidations = new ArrayList();

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private final IntStack entersStack = new IntStack();

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private PersistentCompositionLocalMap parentProvider = PersistentCompositionLocalMapKt.n();

    /* JADX INFO: renamed from: ViF, reason: from kotlin metadata */
    private final IntStack providersInvalidStack = new IntStack();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int reusingGroup = -1;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tR\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextHolder;", "Landroidx/compose/runtime/ReusableRememberObserver;", "Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/ComposerImpl;", "ref", "<init>", "(Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;)V", "", "t", "()V", "nr", "O", c.f62177j, "Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "()Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CompositionContextHolder implements ReusableRememberObserver {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final CompositionContextImpl ref;

        @Override // androidx.compose.runtime.RememberObserver
        public void t() {
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void O() {
            this.ref.WPU();
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final CompositionContextImpl getRef() {
            return this.ref;
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void nr() {
            this.ref.WPU();
        }

        public CompositionContextHolder(CompositionContextImpl compositionContextImpl) {
            this.ref = compositionContextImpl;
        }
    }

    @Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0004\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\u000b0\u001b¢\u0006\u0002\b\u001cH\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b \u0010\u0016J\u000f\u0010\"\u001a\u00020!H\u0010¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020!¢\u0006\u0004\b$\u0010%J\u001d\u0010)\u001a\u00020\u000b2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&H\u0010¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000bH\u0010¢\u0006\u0004\b+\u0010\rJ\u000f\u0010,\u001a\u00020\u000bH\u0010¢\u0006\u0004\b,\u0010\rJ\u0017\u0010/\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020-H\u0010¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020-H\u0010¢\u0006\u0004\b1\u00100J\u0019\u00103\u001a\u0004\u0018\u0001022\u0006\u0010.\u001a\u00020-H\u0010¢\u0006\u0004\b3\u00104J+\u00108\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020-2\u0006\u00105\u001a\u0002022\n\u00107\u001a\u0006\u0012\u0002\b\u000306H\u0010¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b:\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001e\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010\u0005\u001a\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b>\u0010?R\u001a\u0010\u0006\u001a\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b,\u0010+\u001a\u0004\b@\u0010?R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR0\u0010I\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010*R\u001d\u0010L\u001a\b\u0012\u0004\u0012\u00020J0&8\u0006¢\u0006\f\n\u0004\b@\u0010E\u001a\u0004\bK\u0010GR+\u0010Q\u001a\u00020!2\u0006\u0010M\u001a\u00020!8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010N\u001a\u0004\bO\u0010#\"\u0004\bP\u0010%R\u0014\u0010R\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bA\u0010?R\u0014\u0010V\u001a\u00020S8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u001a\u0010Y\u001a\u00020S8PX\u0090\u0004¢\u0006\f\u0012\u0004\bX\u0010\r\u001a\u0004\bW\u0010U¨\u0006Z"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/CompositionContext;", "", "compoundHashKey", "", "collectingParameterInformation", "collectingSourceInformation", "Landroidx/compose/runtime/CompositionObserverHolder;", "observerHolder", "<init>", "(Landroidx/compose/runtime/ComposerImpl;IZZLandroidx/compose/runtime/CompositionObserverHolder;)V", "", "WPU", "()V", "Landroidx/compose/runtime/Composer;", "composer", "Ik", "(Landroidx/compose/runtime/Composer;)V", "XQ", "Landroidx/compose/runtime/ControlledComposition;", "composition", "S", "(Landroidx/compose/runtime/ControlledComposition;)V", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "r", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "az", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "Uo", "()Landroidx/compose/runtime/PersistentCompositionLocalMap;", "g", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)V", "", "Landroidx/compose/runtime/tooling/CompositionData;", "table", "ck", "(Ljava/util/Set;)V", "Z", "t", "Landroidx/compose/runtime/MovableContentStateReference;", "reference", "qie", "(Landroidx/compose/runtime/MovableContentStateReference;)V", "rl", "Landroidx/compose/runtime/MovableContentState;", "HI", "(Landroidx/compose/runtime/MovableContentStateReference;)Landroidx/compose/runtime/MovableContentState;", "data", "Landroidx/compose/runtime/Applier;", "applier", "ty", "(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentState;Landroidx/compose/runtime/Applier;)V", "o", "I", "KN", "()I", "O", "()Z", "J2", "nr", "Landroidx/compose/runtime/CompositionObserverHolder;", "mUb", "()Landroidx/compose/runtime/CompositionObserverHolder;", "Ljava/util/Set;", "getInspectionTables", "()Ljava/util/Set;", "setInspectionTables", "inspectionTables", "Landroidx/compose/runtime/ComposerImpl;", "aYN", "composers", "<set-?>", "Landroidx/compose/runtime/MutableState;", "ViF", "nY", "compositionLocalScope", "collectingCallByInformation", "Lkotlin/coroutines/CoroutineContext;", "xMQ", "()Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "gh", "getRecomposeCoroutineContext$runtime_release$annotations", "recomposeCoroutineContext", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$CompositionContextImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4891:1\n1855#2,2:4892\n85#3:4894\n113#3,2:4895\n1#4:4897\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$CompositionContextImpl\n*L\n4005#1:4892,2\n4074#1:4894\n4074#1:4895,2\n*E\n"})
    public final class CompositionContextImpl extends CompositionContext {

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private Set inspectionTables;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final int compoundHashKey;

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private final CompositionObserverHolder observerHolder;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private final boolean collectingParameterInformation;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final boolean collectingSourceInformation;

        /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
        private final Set composers = new LinkedHashSet();

        /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
        private final MutableState compositionLocalScope = SnapshotStateKt.xMQ(PersistentCompositionLocalMapKt.n(), SnapshotStateKt.HI());

        public CompositionContextImpl(int i2, boolean z2, boolean z3, CompositionObserverHolder compositionObserverHolder) {
            this.compoundHashKey = i2;
            this.collectingParameterInformation = z2;
            this.collectingSourceInformation = z3;
            this.observerHolder = compositionObserverHolder;
        }

        private final PersistentCompositionLocalMap ViF() {
            return (PersistentCompositionLocalMap) this.compositionLocalScope.getValue();
        }

        private final void nY(PersistentCompositionLocalMap persistentCompositionLocalMap) {
            this.compositionLocalScope.setValue(persistentCompositionLocalMap);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public MovableContentState HI(MovableContentStateReference reference) {
            return ComposerImpl.this.parentContext.HI(reference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void Ik(Composer composer) {
            Intrinsics.checkNotNull(composer, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
            super.Ik((ComposerImpl) composer);
            this.composers.add(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* JADX INFO: renamed from: J2, reason: from getter */
        public boolean getCollectingSourceInformation() {
            return this.collectingSourceInformation;
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* JADX INFO: renamed from: KN, reason: from getter */
        public int getCompoundHashKey() {
            return this.compoundHashKey;
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* JADX INFO: renamed from: O, reason: from getter */
        public boolean getCollectingParameterInformation() {
            return this.collectingParameterInformation;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void S(ControlledComposition composition) {
            ComposerImpl.this.parentContext.S(composition);
        }

        public final void WPU() {
            if (this.composers.isEmpty()) {
                return;
            }
            Set set = this.inspectionTables;
            if (set != null) {
                for (ComposerImpl composerImpl : this.composers) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        ((Set) it.next()).remove(composerImpl.slotTable);
                    }
                }
            }
            this.composers.clear();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void XQ(Composer composer) {
            Set<Set> set = this.inspectionTables;
            if (set != null) {
                for (Set set2 : set) {
                    Intrinsics.checkNotNull(composer, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                    set2.remove(((ComposerImpl) composer).slotTable);
                }
            }
            TypeIntrinsics.asMutableCollection(this.composers).remove(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void Z() {
            ComposerImpl.this.childrenComposing++;
        }

        /* JADX INFO: renamed from: aYN, reason: from getter */
        public final Set getComposers() {
            return this.composers;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void az(ControlledComposition composition) {
            ComposerImpl.this.parentContext.az(ComposerImpl.this.getComposition());
            ComposerImpl.this.parentContext.az(composition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void ck(Set table) {
            Set hashSet = this.inspectionTables;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.inspectionTables = hashSet;
            }
            hashSet.add(table);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public CoroutineContext gh() {
            return CompositionKt.nr(ComposerImpl.this.getComposition());
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* JADX INFO: renamed from: mUb, reason: from getter */
        public CompositionObserverHolder getObserverHolder() {
            return this.observerHolder;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void n(ControlledComposition composition, Function2 content) {
            ComposerImpl.this.parentContext.n(composition, content);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public boolean nr() {
            return ComposerImpl.this.parentContext.nr();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void o(ControlledComposition composition) {
            ComposerImpl.this.parentContext.o(composition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void qie(MovableContentStateReference reference) {
            ComposerImpl.this.parentContext.qie(reference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void r(RecomposeScopeImpl scope) {
            ComposerImpl.this.parentContext.r(scope);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void rl(MovableContentStateReference reference) {
            ComposerImpl.this.parentContext.rl(reference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void t() {
            ComposerImpl composerImpl = ComposerImpl.this;
            composerImpl.childrenComposing--;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void ty(MovableContentStateReference reference, MovableContentState data, Applier applier) {
            ComposerImpl.this.parentContext.ty(reference, data, applier);
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* JADX INFO: renamed from: xMQ */
        public CoroutineContext getEffectCoroutineContext() {
            return ComposerImpl.this.parentContext.getEffectCoroutineContext();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public PersistentCompositionLocalMap Uo() {
            return ViF();
        }

        public final void g(PersistentCompositionLocalMap scope) {
            nY(scope);
        }
    }

    private final int ER(int index) {
        return (-2) - index;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void Zn(int key, Object objectKey, int kind, Object data) {
        int iRotateLeft;
        Object objN = objectKey;
        XNZ();
        int i2 = this.rGroupIndex;
        if (objN != null) {
            iRotateLeft = Integer.rotateLeft((objN instanceof Enum ? ((Enum) objN).ordinal() : objectKey.hashCode()) ^ Integer.rotateLeft(getCompoundKeyHash(), 3), 3);
        } else {
            if (data != null && key == 207 && !Intrinsics.areEqual(data, Composer.INSTANCE.n())) {
                this.compoundKeyHash = i2 ^ Integer.rotateLeft(data.hashCode() ^ Integer.rotateLeft(getCompoundKeyHash(), 3), 3);
                if (objN == null) {
                    this.rGroupIndex++;
                }
                GroupKind.Companion companion = GroupKind.INSTANCE;
                boolean z2 = kind == companion.n();
                Pending pending = null;
                if (!getInserting()) {
                    this.reader.t();
                    int currentGroup = this.writer.getCurrentGroup();
                    if (z2) {
                        this.writer.uG(key, Composer.INSTANCE.n());
                    } else if (data != null) {
                        SlotWriter slotWriter = this.writer;
                        if (objN == null) {
                            objN = Composer.INSTANCE.n();
                        }
                        slotWriter.Zmq(key, objN, data);
                    } else {
                        SlotWriter slotWriter2 = this.writer;
                        if (objN == null) {
                            objN = Composer.INSTANCE.n();
                        }
                        slotWriter2.xVH(key, objN);
                    }
                    Pending pending2 = this.pending;
                    if (pending2 != null) {
                        KeyInfo keyInfo = new KeyInfo(key, -1, ER(currentGroup), -1, 0);
                        pending2.xMQ(keyInfo, this.nodeIndex - pending2.getStartIndex());
                        pending2.KN(keyInfo);
                    }
                    qm(z2, null);
                    return;
                }
                boolean z3 = kind == companion.rl() && this.reusing;
                if (this.pending == null) {
                    int iTy = this.reader.ty();
                    if (!z3 && iTy == key && Intrinsics.areEqual(objectKey, this.reader.HI())) {
                        v0j(z2, data);
                    } else {
                        this.pending = new Pending(this.reader.KN(), this.nodeIndex);
                    }
                }
                Pending pending3 = this.pending;
                if (pending3 != null) {
                    KeyInfo keyInfoNr = pending3.nr(key, objectKey);
                    if (z3 || keyInfoNr == null) {
                        this.reader.t();
                        this.inserting = true;
                        this.providerCache = null;
                        Rl();
                        this.writer.T();
                        int currentGroup2 = this.writer.getCurrentGroup();
                        if (z2) {
                            this.writer.uG(key, Composer.INSTANCE.n());
                        } else if (data != null) {
                            SlotWriter slotWriter3 = this.writer;
                            if (objN == null) {
                                objN = Composer.INSTANCE.n();
                            }
                            slotWriter3.Zmq(key, objN, data);
                        } else {
                            SlotWriter slotWriter4 = this.writer;
                            if (objN == null) {
                                objN = Composer.INSTANCE.n();
                            }
                            slotWriter4.xVH(key, objN);
                        }
                        this.insertAnchor = this.writer.fD(currentGroup2);
                        KeyInfo keyInfo2 = new KeyInfo(key, -1, ER(currentGroup2), -1, 0);
                        pending3.xMQ(keyInfo2, this.nodeIndex - pending3.getStartIndex());
                        pending3.KN(keyInfo2);
                        pending = new Pending(new ArrayList(), z2 ? 0 : this.nodeIndex);
                    } else {
                        pending3.KN(keyInfoNr);
                        int location = keyInfoNr.getLocation();
                        this.nodeIndex = pending3.Uo(keyInfoNr) + pending3.getStartIndex();
                        int iAz = pending3.az(keyInfoNr);
                        int groupIndex = iAz - pending3.getGroupIndex();
                        pending3.gh(iAz, pending3.getGroupIndex());
                        this.changeListWriter.nY(location);
                        this.reader.jB(location);
                        if (groupIndex > 0) {
                            this.changeListWriter.WPU(groupIndex);
                        }
                        v0j(z2, data);
                    }
                }
                qm(z2, pending);
                return;
            }
            iRotateLeft = i2 ^ Integer.rotateLeft(Integer.rotateLeft(getCompoundKeyHash(), 3) ^ key, 3);
        }
        this.compoundKeyHash = iRotateLeft;
        if (objN == null) {
        }
        GroupKind.Companion companion2 = GroupKind.INSTANCE;
        if (kind == companion2.n()) {
        }
        Pending pending4 = null;
        if (!getInserting()) {
        }
    }

    private final int eTf(int group, int recomposeGroup, int recomposeKey) {
        int iRotateLeft;
        int i2 = 3;
        int iRotateLeft2 = 0;
        int i3 = 0;
        while (group >= 0) {
            if (group == recomposeGroup) {
                iRotateLeft = Integer.rotateLeft(recomposeKey, i3);
            } else {
                int iK = K(this.reader, group);
                if (iK == 126665345) {
                    iRotateLeft = Integer.rotateLeft(iK, i3);
                } else {
                    iRotateLeft2 = (iRotateLeft2 ^ Integer.rotateLeft(iK, i2)) ^ Integer.rotateLeft(this.reader.X(group) ? 0 : tFV(group), i3);
                    i2 = (i2 + 6) % 32;
                    i3 = (i3 + 6) % 32;
                    group = this.reader.Xw(group);
                }
            }
            return iRotateLeft ^ iRotateLeft2;
        }
        return iRotateLeft2;
    }

    private final void ijL() {
        this.nodeCountOverrides = null;
        this.nodeCountVirtualOverrides = null;
    }

    private final void n7b() {
        this.rGroupIndex = 0;
        this.reader = this.slotTable.nY();
        nO(100);
        this.parentContext.Z();
        this.parentProvider = this.parentContext.Uo();
        this.providersInvalidStack.KN(ComposerKt.Ik(this.providersInvalid));
        this.providersInvalid = p5(this.parentProvider);
        this.providerCache = null;
        if (!this.forceRecomposeScopes) {
            this.forceRecomposeScopes = this.parentContext.getCollectingParameterInformation();
        }
        if (!this.sourceMarkersEnabled) {
            this.sourceMarkersEnabled = this.parentContext.getCollectingSourceInformation();
        }
        Set set = (Set) CompositionLocalMapKt.rl(this.parentProvider, InspectionTablesKt.n());
        if (set != null) {
            set.add(fD());
            this.parentContext.ck(set);
        }
        nO(this.parentContext.getCompoundHashKey());
    }

    private final void piY() {
        this.pending = null;
        this.nodeIndex = 0;
        this.groupNodeCount = 0;
        this.compoundKeyHash = 0;
        this.nodeExpected = false;
        this.changeListWriter.p5();
        Stack.n(this.invalidateStack);
        ijL();
    }

    private final void ul() {
        eWT(false);
    }

    @Override // androidx.compose.runtime.Composer
    public boolean HI(boolean parametersChanged, int flags) {
        RecomposeScopeImpl recomposeScopeImplEWS;
        if ((flags & 1) != 0 || (!getInserting() && !this.reusing)) {
            return parametersChanged || !xMQ();
        }
        ShouldPauseCallback shouldPauseCallback = this.shouldPauseCallback;
        if (shouldPauseCallback == null || (recomposeScopeImplEWS = EWS()) == null || !shouldPauseCallback.n()) {
            return true;
        }
        recomposeScopeImplEWS.rV9(true);
        recomposeScopeImplEWS.wTp(this.reusing);
        recomposeScopeImplEWS.T(true);
        this.changeListWriter.jB(recomposeScopeImplEWS);
        this.parentContext.r(recomposeScopeImplEWS);
        return false;
    }

    @Override // androidx.compose.runtime.Composer
    public void ViF() {
        this.forceRecomposeScopes = true;
        this.sourceMarkersEnabled = true;
        this.slotTable.az();
        this.insertTable.az();
        this.writer.g6();
    }

    @Override // androidx.compose.runtime.Composer
    public void XQ() {
        eWT(true);
    }

    public final void z() {
        this.providerUpdates = null;
    }

    private final void Bu() {
        boolean z2 = this.isComposing;
        this.isComposing = true;
        int parent = this.reader.getParent();
        int iE2 = this.reader.E2(parent) + parent;
        int i2 = this.nodeIndex;
        int compoundKeyHash = getCompoundKeyHash();
        int i3 = this.groupNodeCount;
        int i5 = this.rGroupIndex;
        Invalidation invalidationTe = ComposerKt.te(this.invalidations, this.reader.getCurrent(), iE2);
        int i7 = parent;
        boolean z3 = false;
        while (invalidationTe != null) {
            int location = invalidationTe.getLocation();
            ComposerKt.U(this.invalidations, location);
            if (invalidationTe.nr()) {
                this.reader.jB(location);
                int current = this.reader.getCurrent();
                ub(i7, current, parent);
                this.nodeIndex = F(location, current, parent, i2);
                this.rGroupIndex = tFV(current);
                this.compoundKeyHash = eTf(this.reader.Xw(current), parent, compoundKeyHash);
                this.providerCache = null;
                boolean z4 = !this.reusing && invalidationTe.getScope().r();
                if (z4) {
                    this.reusing = true;
                }
                invalidationTe.getScope().Uo(this);
                if (z4) {
                    this.reusing = false;
                }
                this.providerCache = null;
                this.reader.U(parent);
                i7 = current;
                z3 = true;
            } else {
                Stack.qie(this.invalidateStack, invalidationTe.getScope());
                invalidationTe.getScope().te();
                Stack.gh(this.invalidateStack);
            }
            invalidationTe = ComposerKt.te(this.invalidations, this.reader.getCurrent(), iE2);
        }
        if (z3) {
            ub(i7, parent, parent);
            this.reader.M7();
            int iTh = Th(parent);
            this.nodeIndex = i2 + iTh;
            this.groupNodeCount = i3 + iTh;
            this.rGroupIndex = i5;
        } else {
            y();
        }
        this.compoundKeyHash = compoundKeyHash;
        this.isComposing = z2;
    }

    private final int F(int groupLocation, int group, int recomposeGroup, int recomposeIndex) {
        int iXw = this.reader.Xw(group);
        while (iXw != recomposeGroup && !this.reader.nHg(iXw)) {
            iXw = this.reader.Xw(iXw);
        }
        if (this.reader.nHg(iXw)) {
            recomposeIndex = 0;
        }
        if (iXw == group) {
            return recomposeIndex;
        }
        int iTh = (Th(iXw) - this.reader.rV9(group)) + recomposeIndex;
        loop1: while (recomposeIndex < iTh && iXw != groupLocation) {
            iXw++;
            while (iXw < groupLocation) {
                int iE2 = this.reader.E2(iXw) + iXw;
                if (groupLocation >= iE2) {
                    recomposeIndex += this.reader.nHg(iXw) ? 1 : Th(iXw);
                    iXw = iE2;
                }
            }
            break loop1;
        }
        return recomposeIndex;
    }

    private final void G7(MutableScatterMap invalidationsRequested, Function2 content) {
        if (this.isComposing) {
            ComposerKt.Z("Reentrant composition is not supported");
        }
        Trace trace = Trace.f30884n;
        Object objN = trace.n("Compose:recompose");
        try {
            this.compositionToken = Long.hashCode(SnapshotKt.N().getSnapshotId());
            this.providerUpdates = null;
            Lp6(invalidationsRequested);
            this.nodeIndex = 0;
            this.isComposing = true;
            try {
                n7b();
                Object objW = W();
                if (objW != content && content != null) {
                    wKp(content);
                }
                ComposerImpl$derivedStateObserver$1 composerImpl$derivedStateObserver$1 = this.derivedStateObserver;
                MutableVector mutableVectorT = SnapshotStateKt.t();
                try {
                    mutableVectorT.rl(composerImpl$derivedStateObserver$1);
                    if (content != null) {
                        vl(200, ComposerKt.fD());
                        Utils_jvmKt.rl(this, content);
                        ul();
                    } else if ((!this.forciblyRecompose && !this.providersInvalid) || objW == null || Intrinsics.areEqual(objW, Composer.INSTANCE.n())) {
                        uG();
                    } else {
                        vl(200, ComposerKt.fD());
                        Utils_jvmKt.rl(this, (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(objW, 2));
                        ul();
                    }
                    mutableVectorT.r(mutableVectorT.getSize() - 1);
                    Jk();
                    this.isComposing = false;
                    this.invalidations.clear();
                    xg();
                    Unit unit = Unit.INSTANCE;
                    trace.rl(objN);
                } catch (Throwable th) {
                    mutableVectorT.r(mutableVectorT.getSize() - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                this.isComposing = false;
                this.invalidations.clear();
                M();
                xg();
                throw th2;
            }
        } catch (Throwable th3) {
            Trace.f30884n.rl(objN);
            throw th3;
        }
    }

    private final void HBN() {
        if (this.slotTable.ty()) {
            ControlledComposition composition = getComposition();
            Intrinsics.checkNotNull(composition, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            ((CompositionImpl) composition).U();
            ChangeList changeList = new ChangeList();
            this.deferredChanges = changeList;
            SlotReader slotReaderNY = this.slotTable.nY();
            try {
                this.reader = slotReaderNY;
                ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
                ChangeList changeListCk = composerChangeListWriter.getChangeList();
                try {
                    composerChangeListWriter.eF(changeList);
                    UF(0);
                    this.changeListWriter.rV9();
                    composerChangeListWriter.eF(changeListCk);
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    composerChangeListWriter.eF(changeListCk);
                    throw th;
                }
            } finally {
                slotReaderNY.nr();
            }
        }
    }

    private final void HV() {
        SlotTable slotTable = new SlotTable();
        if (this.sourceMarkersEnabled) {
            slotTable.az();
        }
        if (this.parentContext.nr()) {
            slotTable.qie();
        }
        this.insertTable = slotTable;
        SlotWriter slotWriterG = slotTable.g();
        slotWriterG.wTp(true);
        this.writer = slotWriterG;
    }

    private final void How(List references) throws Throwable {
        ComposerChangeListWriter composerChangeListWriter;
        ComposerChangeListWriter composerChangeListWriter2;
        int i2;
        SlotTable slotTable;
        Anchor anchor;
        SlotReader slotReader;
        int[] iArr;
        MutableIntObjectMap mutableIntObjectMap;
        ChangeList changeList;
        int i3;
        int i5;
        SlotTable slotTable2;
        SlotReader slotReader2;
        final ChangeList changeList2;
        int i7 = 1;
        ComposerChangeListWriter composerChangeListWriter3 = this.changeListWriter;
        ChangeList changeList3 = this.lateChanges;
        ChangeList changeListCk = composerChangeListWriter3.getChangeList();
        try {
            composerChangeListWriter3.eF(changeList3);
            this.changeListWriter.M7();
            int size = references.size();
            int i8 = 0;
            int i9 = 0;
            while (i9 < size) {
                try {
                    Pair pair = (Pair) references.get(i9);
                    final MovableContentStateReference movableContentStateReference = (MovableContentStateReference) pair.component1();
                    MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) pair.component2();
                    Anchor anchor2 = movableContentStateReference.getAnchor();
                    int iXMQ = movableContentStateReference.getSlotTable().xMQ(anchor2);
                    IntRef intRef = new IntRef(i8, i7, null);
                    this.changeListWriter.O(intRef, anchor2);
                    if (movableContentStateReference2 == null) {
                        if (Intrinsics.areEqual(movableContentStateReference.getSlotTable(), this.insertTable)) {
                            xg();
                        }
                        final SlotReader slotReaderNY = movableContentStateReference.getSlotTable().nY();
                        try {
                            slotReaderNY.jB(iXMQ);
                            this.changeListWriter.g(iXMQ);
                            changeList2 = new ChangeList();
                            slotReader2 = slotReaderNY;
                            i2 = i7;
                        } catch (Throwable th) {
                            th = th;
                            slotReader2 = slotReaderNY;
                        }
                        try {
                            T3L(this, null, null, null, null, new Function0<Unit>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    ComposerChangeListWriter composerChangeListWriter4 = this.f30099n.changeListWriter;
                                    ChangeList changeList4 = changeList2;
                                    ComposerImpl composerImpl = this.f30099n;
                                    SlotReader slotReader3 = slotReaderNY;
                                    MovableContentStateReference movableContentStateReference3 = movableContentStateReference;
                                    ChangeList changeList5 = composerChangeListWriter4.getChangeList();
                                    try {
                                        composerChangeListWriter4.eF(changeList4);
                                        SlotReader reader = composerImpl.getReader();
                                        int[] iArr2 = composerImpl.nodeCountOverrides;
                                        MutableIntObjectMap mutableIntObjectMap2 = composerImpl.providerUpdates;
                                        composerImpl.nodeCountOverrides = null;
                                        composerImpl.providerUpdates = null;
                                        try {
                                            composerImpl.EF(slotReader3);
                                            ComposerChangeListWriter composerChangeListWriter5 = composerImpl.changeListWriter;
                                            boolean implicitRootStart = composerChangeListWriter5.getImplicitRootStart();
                                            try {
                                                composerChangeListWriter5.E(false);
                                                composerImpl.lLA(movableContentStateReference3.getContent(), movableContentStateReference3.getLocals(), movableContentStateReference3.getCom.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD java.lang.String(), true);
                                                composerChangeListWriter5.E(implicitRootStart);
                                                Unit unit = Unit.INSTANCE;
                                            } catch (Throwable th2) {
                                                composerChangeListWriter5.E(implicitRootStart);
                                                throw th2;
                                            }
                                        } finally {
                                            composerImpl.EF(reader);
                                            composerImpl.nodeCountOverrides = iArr2;
                                            composerImpl.providerUpdates = mutableIntObjectMap2;
                                        }
                                    } finally {
                                        composerChangeListWriter4.eF(changeList5);
                                    }
                                }
                            }, 15, null);
                            this.changeListWriter.Z(changeList2, intRef);
                            Unit unit = Unit.INSTANCE;
                            slotReader2.nr();
                            composerChangeListWriter2 = composerChangeListWriter3;
                            i3 = size;
                            i5 = i9;
                        } catch (Throwable th2) {
                            th = th2;
                            slotReader2.nr();
                            throw th;
                        }
                    } else {
                        i2 = i7;
                        MovableContentState movableContentStateHI = this.parentContext.HI(movableContentStateReference2);
                        if (movableContentStateHI == null || (slotTable = movableContentStateHI.getSlotTable()) == null) {
                            slotTable = movableContentStateReference2.getSlotTable();
                        }
                        if (movableContentStateHI == null || (slotTable2 = movableContentStateHI.getSlotTable()) == null || (anchor = slotTable2.KN(i8)) == null) {
                            anchor = movableContentStateReference2.getAnchor();
                        }
                        List listR = ComposerKt.r(slotTable, anchor);
                        if (!listR.isEmpty()) {
                            this.changeListWriter.rl(listR, intRef);
                            if (Intrinsics.areEqual(movableContentStateReference.getSlotTable(), this.slotTable)) {
                                int iXMQ2 = this.slotTable.xMQ(anchor2);
                                g6(iXMQ2, Th(iXMQ2) + listR.size());
                            }
                        }
                        this.changeListWriter.t(movableContentStateHI, this.parentContext, movableContentStateReference2, movableContentStateReference);
                        SlotReader slotReaderNY2 = slotTable.nY();
                        try {
                            SlotReader reader = getReader();
                            int[] iArr2 = this.nodeCountOverrides;
                            MutableIntObjectMap mutableIntObjectMap2 = this.providerUpdates;
                            this.nodeCountOverrides = null;
                            this.providerUpdates = null;
                            try {
                                EF(slotReaderNY2);
                                int iXMQ3 = slotTable.xMQ(anchor);
                                slotReaderNY2.jB(iXMQ3);
                                this.changeListWriter.g(iXMQ3);
                                ChangeList changeList4 = new ChangeList();
                                ComposerChangeListWriter composerChangeListWriter4 = this.changeListWriter;
                                ChangeList changeListCk2 = composerChangeListWriter4.getChangeList();
                                try {
                                    composerChangeListWriter4.eF(changeList4);
                                    slotReader = slotReaderNY2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    iArr = iArr2;
                                    mutableIntObjectMap = mutableIntObjectMap2;
                                    slotReader = slotReaderNY2;
                                }
                                try {
                                    ComposerChangeListWriter composerChangeListWriter5 = this.changeListWriter;
                                    i3 = size;
                                    boolean zIk = composerChangeListWriter5.getImplicitRootStart();
                                    try {
                                        composerChangeListWriter5.E(false);
                                        ControlledComposition composition = movableContentStateReference2.getComposition();
                                        ControlledComposition composition2 = movableContentStateReference.getComposition();
                                        Integer numValueOf = Integer.valueOf(slotReader.getCurrent());
                                        List invalidations = movableContentStateReference2.getInvalidations();
                                        try {
                                            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$2$1$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                    invoke2();
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    this.f30101n.lLA(movableContentStateReference.getContent(), movableContentStateReference.getLocals(), movableContentStateReference.getCom.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD java.lang.String(), true);
                                                }
                                            };
                                            ComposerChangeListWriter composerChangeListWriter6 = composerChangeListWriter3;
                                            changeList = changeListCk2;
                                            composerChangeListWriter2 = composerChangeListWriter6;
                                            i5 = i9;
                                            mutableIntObjectMap = mutableIntObjectMap2;
                                            iArr = iArr2;
                                            try {
                                                mI(composition, composition2, numValueOf, invalidations, function0);
                                                try {
                                                    composerChangeListWriter5.E(zIk);
                                                    try {
                                                        composerChangeListWriter4.eF(changeList);
                                                        this.changeListWriter.Z(changeList4, intRef);
                                                        Unit unit2 = Unit.INSTANCE;
                                                        try {
                                                            EF(reader);
                                                            this.nodeCountOverrides = iArr;
                                                            this.providerUpdates = mutableIntObjectMap;
                                                            try {
                                                                slotReader.nr();
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                composerChangeListWriter = composerChangeListWriter2;
                                                                composerChangeListWriter.eF(changeListCk);
                                                                throw th;
                                                            }
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            slotReader.nr();
                                                            throw th;
                                                        }
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        EF(reader);
                                                        this.nodeCountOverrides = iArr;
                                                        this.providerUpdates = mutableIntObjectMap;
                                                        throw th;
                                                    }
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    composerChangeListWriter4.eF(changeList);
                                                    throw th;
                                                }
                                            } catch (Throwable th8) {
                                                th = th8;
                                                composerChangeListWriter5.E(zIk);
                                                throw th;
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                            iArr = iArr2;
                                            mutableIntObjectMap = mutableIntObjectMap2;
                                            changeList = changeListCk2;
                                            composerChangeListWriter5.E(zIk);
                                            throw th;
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                        iArr = iArr2;
                                        mutableIntObjectMap = mutableIntObjectMap2;
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                    iArr = iArr2;
                                    mutableIntObjectMap = mutableIntObjectMap2;
                                    changeList = changeListCk2;
                                    composerChangeListWriter4.eF(changeList);
                                    throw th;
                                }
                            } catch (Throwable th12) {
                                th = th12;
                                iArr = iArr2;
                                mutableIntObjectMap = mutableIntObjectMap2;
                                slotReader = slotReaderNY2;
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            slotReader = slotReaderNY2;
                        }
                    }
                    this.changeListWriter.FX();
                    i9 = i5 + 1;
                    i7 = i2;
                    size = i3;
                    composerChangeListWriter3 = composerChangeListWriter2;
                    i8 = 0;
                } catch (Throwable th14) {
                    th = th14;
                    composerChangeListWriter2 = composerChangeListWriter3;
                }
            }
            ComposerChangeListWriter composerChangeListWriter7 = composerChangeListWriter3;
            this.changeListWriter.KN();
            this.changeListWriter.g(0);
            composerChangeListWriter7.eF(changeListCk);
        } catch (Throwable th15) {
            th = th15;
            composerChangeListWriter = composerChangeListWriter3;
        }
    }

    private static final void JVN(ComposerImpl composerImpl, List list, int i2) {
        int iE2 = composerImpl.reader.E2(i2) + i2;
        int iE22 = i2 + 1;
        while (iE22 < iE2) {
            if (composerImpl.reader.e(iE22)) {
                MovableContentStateReference movableContentStateReferenceZmq = Zmq(composerImpl, iE22);
                if (movableContentStateReferenceZmq != null) {
                    list.add(movableContentStateReferenceZmq);
                }
            } else if (composerImpl.reader.O(iE22)) {
                JVN(composerImpl, list, iE22);
            }
            iE22 += composerImpl.reader.E2(iE22);
        }
    }

    private final void Org() {
        this.changeListWriter.HI();
        if (!Stack.Uo(this.pendingStack)) {
            ComposerKt.Z("Start/end imbalance");
        }
        piY();
    }

    private final void Rl() {
        if (this.writer.getClosed()) {
            SlotWriter slotWriterG = this.insertTable.g();
            this.writer = slotWriterG;
            slotWriterG.Bu();
            this.writerHasAProvider = false;
            this.providerCache = null;
        }
    }

    static /* synthetic */ Object T3L(ComposerImpl composerImpl, ControlledComposition controlledComposition, ControlledComposition controlledComposition2, Integer num, List list, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            controlledComposition = null;
        }
        if ((i2 & 2) != 0) {
            controlledComposition2 = null;
        }
        if ((i2 & 4) != 0) {
            num = null;
        }
        if ((i2 & 8) != 0) {
            list = CollectionsKt.emptyList();
        }
        return composerImpl.mI(controlledComposition, controlledComposition2, num, list, function0);
    }

    private final int Th(int group) {
        int i2;
        if (group >= 0) {
            int[] iArr = this.nodeCountOverrides;
            return (iArr == null || (i2 = iArr[group]) < 0) ? this.reader.rV9(group) : i2;
        }
        MutableIntIntMap mutableIntIntMap = this.nodeCountVirtualOverrides;
        if (mutableIntIntMap == null || !mutableIntIntMap.n(group)) {
            return 0;
        }
        return mutableIntIntMap.t(group);
    }

    private final void UF(int groupBeingRemoved) {
        boolean zNHg = this.reader.nHg(groupBeingRemoved);
        if (zNHg) {
            this.changeListWriter.xMQ();
            this.changeListWriter.aYN(this.reader.wTp(groupBeingRemoved));
        }
        xVH(this, groupBeingRemoved, groupBeingRemoved, zNHg, 0);
        this.changeListWriter.xMQ();
        if (zNHg) {
            this.changeListWriter.te();
        }
    }

    private final void Uf(Anchor anchor) {
        if (this.insertFixups.Uo()) {
            this.changeListWriter.XQ(anchor, this.insertTable);
        } else {
            this.changeListWriter.S(anchor, this.insertTable, this.insertFixups);
            this.insertFixups = new FixupList();
        }
    }

    private final void Vvq() {
        this.groupNodeCount += this.reader.P5();
    }

    private static final MovableContentStateReference X4T(ComposerImpl composerImpl, int i2, List list) {
        Object objFD = composerImpl.reader.fD(i2);
        Intrinsics.checkNotNull(objFD, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        MovableContent movableContent = (MovableContent) objFD;
        Object objTe = composerImpl.reader.te(i2, 0);
        Anchor anchorN = composerImpl.reader.n(i2);
        List listViF = ComposerKt.ViF(composerImpl.invalidations, i2, composerImpl.reader.E2(i2) + i2);
        ArrayList arrayList = new ArrayList(listViF.size());
        int size = listViF.size();
        for (int i3 = 0; i3 < size; i3++) {
            Invalidation invalidation = (Invalidation) listViF.get(i3);
            arrayList.add(TuplesKt.to(invalidation.getScope(), invalidation.getInstances()));
        }
        return new MovableContentStateReference(movableContent, objTe, composerImpl.getComposition(), composerImpl.slotTable, anchorN, arrayList, composerImpl.ofS(i2), list);
    }

    private final void XNZ() {
        if (this.nodeExpected) {
            ComposerKt.Z("A call to createNode(), emitNode() or useNode() expected");
        }
    }

    private static final MovableContentStateReference Zmq(ComposerImpl composerImpl, int i2) {
        int iIF = composerImpl.reader.iF(i2);
        Object objFD = composerImpl.reader.fD(i2);
        ArrayList arrayList = null;
        if (iIF != 126665345 || !(objFD instanceof MovableContent)) {
            return null;
        }
        if (composerImpl.reader.O(i2)) {
            ArrayList arrayList2 = new ArrayList();
            JVN(composerImpl, arrayList2, i2);
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return X4T(composerImpl, i2, arrayList);
    }

    private final void eWT(boolean isNode) {
        int iHashCode;
        int iWPU;
        List list;
        List list2;
        int iHashCode2;
        int iO = this.parentStateStack.O() - 1;
        if (getInserting()) {
            int parent = this.writer.getParent();
            int iPiY = this.writer.piY(parent);
            Object objIjL = this.writer.ijL(parent);
            Object objDR0 = this.writer.dR0(parent);
            if (objIjL != null) {
                iHashCode2 = Integer.hashCode(objIjL instanceof Enum ? ((Enum) objIjL).ordinal() : objIjL.hashCode()) ^ Integer.rotateRight(getCompoundKeyHash(), 3);
            } else if (objDR0 == null || iPiY != 207 || Intrinsics.areEqual(objDR0, Composer.INSTANCE.n())) {
                iHashCode2 = Integer.rotateRight(iO ^ getCompoundKeyHash(), 3) ^ Integer.hashCode(iPiY);
            } else {
                this.compoundKeyHash = Integer.rotateRight(Integer.rotateRight(iO ^ getCompoundKeyHash(), 3) ^ Integer.hashCode(objDR0.hashCode()), 3);
            }
            this.compoundKeyHash = Integer.rotateRight(iHashCode2, 3);
        } else {
            int parent2 = this.reader.getParent();
            int iIF = this.reader.iF(parent2);
            Object objFD = this.reader.fD(parent2);
            Object objNY = this.reader.nY(parent2);
            if (objFD != null) {
                iHashCode = Integer.hashCode(objFD instanceof Enum ? ((Enum) objFD).ordinal() : objFD.hashCode()) ^ Integer.rotateRight(getCompoundKeyHash(), 3);
            } else if (objNY == null || iIF != 207 || Intrinsics.areEqual(objNY, Composer.INSTANCE.n())) {
                iHashCode = Integer.rotateRight(iO ^ getCompoundKeyHash(), 3) ^ Integer.hashCode(iIF);
            } else {
                this.compoundKeyHash = Integer.rotateRight(Integer.rotateRight(iO ^ getCompoundKeyHash(), 3) ^ Integer.hashCode(objNY.hashCode()), 3);
            }
            this.compoundKeyHash = Integer.rotateRight(iHashCode, 3);
        }
        int i2 = this.groupNodeCount;
        Pending pending = this.pending;
        if (pending != null && pending.getKeyInfos().size() > 0) {
            List keyInfos = pending.getKeyInfos();
            List usedKeys = pending.getUsedKeys();
            Set setO = ListUtilsKt.O(usedKeys);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = usedKeys.size();
            int size2 = keyInfos.size();
            int i3 = 0;
            int i5 = 0;
            int iHI = 0;
            while (i3 < size2) {
                KeyInfo keyInfo = (KeyInfo) keyInfos.get(i3);
                if (setO.contains(keyInfo)) {
                    list = keyInfos;
                    if (!linkedHashSet.contains(keyInfo)) {
                        if (i5 < size) {
                            KeyInfo keyInfo2 = (KeyInfo) usedKeys.get(i5);
                            if (keyInfo2 != keyInfo) {
                                int iUo = pending.Uo(keyInfo2);
                                linkedHashSet.add(keyInfo2);
                                if (iUo != iHI) {
                                    int iHI2 = pending.HI(keyInfo2);
                                    list2 = usedKeys;
                                    this.changeListWriter.ViF(pending.getStartIndex() + iUo, iHI + pending.getStartIndex(), iHI2);
                                    pending.mUb(iUo, iHI, iHI2);
                                } else {
                                    list2 = usedKeys;
                                }
                            } else {
                                list2 = usedKeys;
                                i3++;
                            }
                            i5++;
                            iHI += pending.HI(keyInfo2);
                            keyInfos = list;
                            usedKeys = list2;
                        }
                    }
                    keyInfos = list;
                } else {
                    this.changeListWriter.P5(pending.Uo(keyInfo) + pending.getStartIndex(), keyInfo.getNodes());
                    pending.ty(keyInfo.getLocation(), 0);
                    this.changeListWriter.nY(keyInfo.getLocation());
                    this.reader.jB(keyInfo.getLocation());
                    p0N();
                    this.reader.P5();
                    list = keyInfos;
                    ComposerKt.P5(this.invalidations, keyInfo.getLocation(), keyInfo.getLocation() + this.reader.E2(keyInfo.getLocation()));
                }
                i3++;
                keyInfos = list;
            }
            this.changeListWriter.xMQ();
            if (keyInfos.size() > 0) {
                this.changeListWriter.nY(this.reader.getEnd());
                this.reader.M7();
            }
        }
        boolean inserting = getInserting();
        if (!inserting && (iWPU = this.reader.WPU()) > 0) {
            this.changeListWriter.J(iWPU);
        }
        int i7 = this.nodeIndex;
        while (!this.reader.T()) {
            int current = this.reader.getCurrent();
            p0N();
            this.changeListWriter.P5(i7, this.reader.P5());
            ComposerKt.P5(this.invalidations, current, this.reader.getCurrent());
        }
        if (inserting) {
            if (isNode) {
                this.insertFixups.nr();
                i2 = 1;
            }
            this.reader.J2();
            int parent3 = this.writer.getParent();
            this.writer.M7();
            if (!this.reader.Z()) {
                int iER = ER(parent3);
                this.writer.p5();
                this.writer.wTp(true);
                Uf(this.insertAnchor);
                this.inserting = false;
                if (!this.slotTable.isEmpty()) {
                    g6(iER, 0);
                    Mh(iER, i2);
                }
            }
        } else {
            if (isNode) {
                this.changeListWriter.te();
            }
            this.changeListWriter.Uo();
            int parent4 = this.reader.getParent();
            if (i2 != Th(parent4)) {
                Mh(parent4, i2);
            }
            if (isNode) {
                i2 = 1;
            }
            this.reader.Uo();
            this.changeListWriter.xMQ();
        }
        mYa(i2, inserting);
    }

    private final void f(PersistentCompositionLocalMap providers) {
        MutableIntObjectMap mutableIntObjectMap = this.providerUpdates;
        if (mutableIntObjectMap == null) {
            mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
            this.providerUpdates = mutableIntObjectMap;
        }
        mutableIntObjectMap.r(this.reader.getCurrent(), providers);
    }

    private final void fcU(int group, int nearestCommonRoot) {
        if (group <= 0 || group == nearestCommonRoot) {
            return;
        }
        fcU(this.reader.Xw(group), nearestCommonRoot);
        if (this.reader.nHg(group)) {
            this.changeListWriter.aYN(a63(this.reader, group));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0005, B:5:0x0010, B:7:0x0022, B:11:0x002c, B:10:0x0028, B:14:0x0033, B:16:0x0039, B:18:0x003f), top: B:23:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object mI(ControlledComposition from, ControlledComposition to, Integer index, List invalidations, Function0 block) {
        Object objInvoke;
        boolean z2 = this.isComposing;
        int i2 = this.nodeIndex;
        try {
            this.isComposing = true;
            this.nodeIndex = 0;
            int size = invalidations.size();
            for (int i3 = 0; i3 < size; i3++) {
                Pair pair = (Pair) invalidations.get(i3);
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) pair.component1();
                Object objComponent2 = pair.component2();
                if (objComponent2 != null) {
                    Aum(recomposeScopeImpl, objComponent2);
                } else {
                    Aum(recomposeScopeImpl, null);
                }
            }
            if (from == null) {
                objInvoke = block.invoke();
            } else {
                objInvoke = from.gh(to, index != null ? index.intValue() : -1, block);
                if (objInvoke == null) {
                }
            }
            this.isComposing = z2;
            this.nodeIndex = i2;
            return objInvoke;
        } catch (Throwable th) {
            this.isComposing = z2;
            this.nodeIndex = i2;
            throw th;
        }
    }

    private final void mYa(int expectedNodeCount, boolean inserting) {
        Pending pending = (Pending) Stack.gh(this.pendingStack);
        if (pending != null && !inserting) {
            pending.qie(pending.getGroupIndex() + 1);
        }
        this.pending = pending;
        this.nodeIndex = this.parentStateStack.Uo() + expectedNodeCount;
        this.rGroupIndex = this.parentStateStack.Uo();
        this.groupNodeCount = this.parentStateStack.Uo() + expectedNodeCount;
    }

    private final void nO(int key) {
        Zn(key, null, GroupKind.INSTANCE.n(), null);
    }

    private final void p0N() {
        UF(this.reader.getCurrent());
        this.changeListWriter.U();
    }

    private final PersistentCompositionLocalMap pJg() {
        PersistentCompositionLocalMap persistentCompositionLocalMap = this.providerCache;
        return persistentCompositionLocalMap != null ? persistentCompositionLocalMap : ofS(this.reader.getParent());
    }

    private final void qm(boolean isNode, Pending newPending) {
        Stack.qie(this.pendingStack, this.pending);
        this.pending = newPending;
        this.parentStateStack.KN(this.groupNodeCount);
        this.parentStateStack.KN(this.rGroupIndex);
        this.parentStateStack.KN(this.nodeIndex);
        if (isNode) {
            this.nodeIndex = 0;
        }
        this.groupNodeCount = 0;
        this.rGroupIndex = 0;
    }

    private final int tFV(int group) {
        int iXw = this.reader.Xw(group) + 1;
        int i2 = 0;
        while (iXw < group) {
            if (!this.reader.X(iXw)) {
                i2++;
            }
            iXw += this.reader.E2(iXw);
        }
        return i2;
    }

    private final void ub(int oldGroup, int newGroup, int commonRoot) {
        SlotReader slotReader = this.reader;
        int iBzg = ComposerKt.bzg(slotReader, oldGroup, newGroup, commonRoot);
        while (oldGroup > 0 && oldGroup != iBzg) {
            if (slotReader.nHg(oldGroup)) {
                this.changeListWriter.te();
            }
            oldGroup = slotReader.Xw(oldGroup);
        }
        fcU(newGroup, iBzg);
    }

    private final void v0j(boolean isNode, Object data) {
        if (isNode) {
            this.reader.eF();
            return;
        }
        if (data != null && this.reader.qie() != data) {
            this.changeListWriter.a(data);
        }
        this.reader.p5();
    }

    private final void vl(int key, Object dataKey) {
        Zn(key, dataKey, GroupKind.INSTANCE.n(), null);
    }

    private static final int xVH(ComposerImpl composerImpl, int i2, int i3, boolean z2, int i5) {
        SlotReader slotReader = composerImpl.reader;
        if (!slotReader.e(i3)) {
            if (!slotReader.O(i3)) {
                if (slotReader.nHg(i3)) {
                    return 1;
                }
                return slotReader.rV9(i3);
            }
            int iE2 = slotReader.E2(i3) + i3;
            int iXVH = 0;
            for (int iE22 = i3 + 1; iE22 < iE2; iE22 += slotReader.E2(iE22)) {
                boolean zNHg = slotReader.nHg(iE22);
                if (zNHg) {
                    composerImpl.changeListWriter.xMQ();
                    composerImpl.changeListWriter.aYN(slotReader.wTp(iE22));
                }
                iXVH += xVH(composerImpl, i2, iE22, zNHg || z2, zNHg ? 0 : i5 + iXVH);
                if (zNHg) {
                    composerImpl.changeListWriter.xMQ();
                    composerImpl.changeListWriter.te();
                }
            }
            if (slotReader.nHg(i3)) {
                return 1;
            }
            return iXVH;
        }
        int iIF = slotReader.iF(i3);
        Object objFD = slotReader.fD(i3);
        if (iIF == 126665345 && (objFD instanceof MovableContent)) {
            MovableContentStateReference movableContentStateReferenceZmq = Zmq(composerImpl, i3);
            if (movableContentStateReferenceZmq != null) {
                composerImpl.parentContext.rl(movableContentStateReferenceZmq);
                composerImpl.changeListWriter.v();
                composerImpl.changeListWriter.bzg(composerImpl.getComposition(), composerImpl.parentContext, movableContentStateReferenceZmq);
            }
            if (!z2 || i3 == i2) {
                return slotReader.rV9(i3);
            }
            composerImpl.changeListWriter.mUb(i5, i3);
            return 0;
        }
        if (iIF != 206 || !Intrinsics.areEqual(objFD, ComposerKt.N())) {
            if (slotReader.nHg(i3)) {
                return 1;
            }
            return slotReader.rV9(i3);
        }
        Object objTe = slotReader.te(i3, 0);
        CompositionContextHolder compositionContextHolder = objTe instanceof CompositionContextHolder ? (CompositionContextHolder) objTe : null;
        if (compositionContextHolder != null) {
            for (ComposerImpl composerImpl2 : compositionContextHolder.getRef().getComposers()) {
                composerImpl2.HBN();
                composerImpl.parentContext.o(composerImpl2.getComposition());
            }
        }
        return slotReader.rV9(i3);
    }

    private final void xg() {
        if (!this.writer.getClosed()) {
            ComposerKt.Z("Check failed");
        }
        HV();
    }

    private final void xzo() {
        if (!this.nodeExpected) {
            ComposerKt.Z("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.nodeExpected = false;
    }

    private final void y() {
        this.groupNodeCount = this.reader.S();
        this.reader.M7();
    }

    public final void C() {
        Stack.n(this.invalidateStack);
        this.invalidations.clear();
        this.changes.rl();
        this.providerUpdates = null;
    }

    public final void EF(SlotReader slotReader) {
        this.reader = slotReader;
    }

    public final RecomposeScopeImpl EWS() {
        ArrayList arrayList = this.invalidateStack;
        if (this.childrenComposing == 0 && Stack.KN(arrayList)) {
            return (RecomposeScopeImpl) Stack.xMQ(arrayList);
        }
        return null;
    }

    public final boolean GD() {
        return this.childrenComposing > 0;
    }

    @Override // androidx.compose.runtime.Composer
    /* JADX INFO: renamed from: J2, reason: from getter */
    public boolean getInserting() {
        return this.inserting;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Lp6(MutableScatterMap invalidationsRequested) {
        Object[] objArr = invalidationsRequested.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
        Object[] objArr2 = invalidationsRequested.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
        long[] jArr = invalidationsRequested.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i3; i5++) {
                        if ((255 & j2) < 128) {
                            int i7 = (i2 << 3) + i5;
                            Object obj = objArr[i7];
                            Object obj2 = objArr2[i7];
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                            Anchor anchor = recomposeScopeImpl.getAnchor();
                            if (anchor != null) {
                                int location = anchor.getLocation();
                                List list = this.invalidations;
                                if (obj2 == ScopeInvalidated.f30372n) {
                                    obj2 = null;
                                }
                                list.add(new Invalidation(recomposeScopeImpl, location, obj2));
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    } else if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        CollectionsKt.sortWith(this.invalidations, ComposerKt.KN);
    }

    public final void Mx() {
        Trace trace = Trace.f30884n;
        Object objN = trace.n("Compose:Composer.dispose");
        try {
            this.parentContext.XQ(this);
            C();
            getApplier().clear();
            this.isDisposed = true;
            Unit unit = Unit.INSTANCE;
            trace.rl(objN);
        } catch (Throwable th) {
            Trace.f30884n.rl(objN);
            throw th;
        }
    }

    /* JADX INFO: renamed from: Po6, reason: from getter */
    public ControlledComposition getComposition() {
        return this.composition;
    }

    public final void QZ6(Function0 block) {
        if (this.isComposing) {
            ComposerKt.Z("Preparing a composition while composing is not supported");
        }
        this.isComposing = true;
        try {
            block.invoke();
        } finally {
            this.isComposing = false;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void T() {
        Zn(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, null, GroupKind.INSTANCE.t(), null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.runtime.Composer
    public CompositionContext U() {
        vl(Sdk.SDKError.Reason.AD_ALREADY_FAILED_VALUE, ComposerKt.N());
        if (getInserting()) {
            SlotWriter.ul(this.writer, 0, 1, null);
        }
        Object objW = W();
        CompositionContextHolder compositionContextHolder = objW instanceof CompositionContextHolder ? (CompositionContextHolder) objW : null;
        if (compositionContextHolder == null) {
            int compoundKeyHash = getCompoundKeyHash();
            boolean z2 = this.forceRecomposeScopes;
            boolean z3 = this.sourceMarkersEnabled;
            ControlledComposition composition = getComposition();
            CompositionImpl compositionImpl = composition instanceof CompositionImpl ? (CompositionImpl) composition : null;
            compositionContextHolder = new CompositionContextHolder(new CompositionContextImpl(compoundKeyHash, z2, z3, compositionImpl != null ? compositionImpl.getObserverHolder() : null));
            wKp(compositionContextHolder);
        }
        compositionContextHolder.getRef().g(pJg());
        ul();
        return compositionContextHolder.getRef();
    }

    @Override // androidx.compose.runtime.Composer
    public void Uo(boolean changed) {
        if (!(this.groupNodeCount == 0)) {
            ComposerKt.Z("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (getInserting()) {
            return;
        }
        if (!changed) {
            y();
            return;
        }
        int current = this.reader.getCurrent();
        int iMUb = this.reader.mUb();
        this.changeListWriter.nr();
        ComposerKt.P5(this.invalidations, current, iMUb);
        this.reader.M7();
    }

    public final boolean VwL(MutableScatterMap invalidationsRequested, ShouldPauseCallback shouldPause) {
        if (!this.changes.O()) {
            ComposerKt.Z("Expected applyChanges() to have been called");
        }
        if (ScopeMap.KN(invalidationsRequested) <= 0 && this.invalidations.isEmpty() && !this.forciblyRecompose) {
            return false;
        }
        this.shouldPauseCallback = shouldPause;
        try {
            G7(invalidationsRequested, null);
            this.shouldPauseCallback = null;
            return this.changes.J2();
        } catch (Throwable th) {
            this.shouldPauseCallback = null;
            throw th;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void WPU(MovableContent value, Object parameter) {
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        lLA(value, pJg(), parameter, false);
    }

    @Override // androidx.compose.runtime.Composer
    public void X(int key, Object dataKey) {
        Zn(key, dataKey, GroupKind.INSTANCE.n(), null);
    }

    @Override // androidx.compose.runtime.Composer
    public void aYN(Function0 effect) {
        this.changeListWriter.M(effect);
    }

    @Override // androidx.compose.runtime.Composer
    public void bzg(RecomposeScope scope) {
        RecomposeScopeImpl recomposeScopeImpl = scope instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) scope : null;
        if (recomposeScopeImpl == null) {
            return;
        }
        recomposeScopeImpl.rV9(true);
    }

    @Override // androidx.compose.runtime.Composer
    public CoroutineContext ck() {
        return this.parentContext.getEffectCoroutineContext();
    }

    @Override // androidx.compose.runtime.Composer
    public void e() {
        Zn(-127, null, GroupKind.INSTANCE.n(), null);
    }

    @Override // androidx.compose.runtime.Composer
    public void eF(int key) {
        if (this.pending != null) {
            Zn(key, null, GroupKind.INSTANCE.n(), null);
            return;
        }
        XNZ();
        this.compoundKeyHash = this.rGroupIndex ^ Integer.rotateLeft(Integer.rotateLeft(getCompoundKeyHash(), 3) ^ key, 3);
        this.rGroupIndex++;
        SlotReader slotReader = this.reader;
        if (getInserting()) {
            slotReader.t();
            this.writer.xVH(key, Composer.INSTANCE.n());
            qm(false, null);
            return;
        }
        if (slotReader.ty() == key && !slotReader.o()) {
            slotReader.p5();
            qm(false, null);
            return;
        }
        if (!slotReader.T()) {
            int i2 = this.nodeIndex;
            int current = slotReader.getCurrent();
            p0N();
            this.changeListWriter.P5(i2, slotReader.P5());
            ComposerKt.P5(this.invalidations, current, slotReader.getCurrent());
        }
        slotReader.t();
        this.inserting = true;
        this.providerCache = null;
        Rl();
        SlotWriter slotWriter = this.writer;
        slotWriter.T();
        int currentGroup = slotWriter.getCurrentGroup();
        slotWriter.xVH(key, Composer.INSTANCE.n());
        this.insertAnchor = slotWriter.fD(currentGroup);
        qm(false, null);
    }

    @Override // androidx.compose.runtime.Composer
    public CompositionData fD() {
        CompositionData compositionData = this._compositionData;
        if (compositionData != null) {
            return compositionData;
        }
        CompositionDataImpl compositionDataImpl = new CompositionDataImpl(getComposition());
        this._compositionData = compositionDataImpl;
        return compositionDataImpl;
    }

    @Override // androidx.compose.runtime.Composer
    public void g() {
        if (this.reusing && this.reader.getParent() == this.reusingGroup) {
            this.reusingGroup = -1;
            this.reusing = false;
        }
        eWT(false);
    }

    @Override // androidx.compose.runtime.Composer
    public ScopeUpdateScope gh() {
        Anchor anchorN;
        RecomposeScopeImpl recomposeScopeImpl = null;
        RecomposeScopeImpl recomposeScopeImpl2 = Stack.KN(this.invalidateStack) ? (RecomposeScopeImpl) Stack.gh(this.invalidateStack) : null;
        if (recomposeScopeImpl2 != null) {
            recomposeScopeImpl2.N(false);
            Function1 function1KN = recomposeScopeImpl2.KN(this.compositionToken);
            if (function1KN != null) {
                this.changeListWriter.J2(function1KN, getComposition());
            }
            if (recomposeScopeImpl2.Ik()) {
                recomposeScopeImpl2.s7N(false);
                this.changeListWriter.gh(recomposeScopeImpl2);
            }
        }
        if (recomposeScopeImpl2 != null && !recomposeScopeImpl2.o() && (recomposeScopeImpl2.Z() || this.forceRecomposeScopes)) {
            if (recomposeScopeImpl2.getAnchor() == null) {
                if (getInserting()) {
                    SlotWriter slotWriter = this.writer;
                    anchorN = slotWriter.fD(slotWriter.getParent());
                } else {
                    SlotReader slotReader = this.reader;
                    anchorN = slotReader.n(slotReader.getParent());
                }
                recomposeScopeImpl2.fD(anchorN);
            }
            recomposeScopeImpl2.e(false);
            recomposeScopeImpl = recomposeScopeImpl2;
        }
        eWT(false);
        return recomposeScopeImpl;
    }

    /* JADX INFO: renamed from: hRu, reason: from getter */
    public final ChangeList getDeferredChanges() {
        return this.deferredChanges;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final SlotReader getReader() {
        return this.reader;
    }

    @Override // androidx.compose.runtime.Composer
    /* JADX INFO: renamed from: jB, reason: from getter */
    public int getCompoundKeyHash() {
        return this.compoundKeyHash;
    }

    /* JADX INFO: renamed from: kSg, reason: from getter */
    public final boolean getIsComposing() {
        return this.isComposing;
    }

    public final void m(MutableScatterMap invalidationsRequested, Function2 content, ShouldPauseCallback shouldPause) {
        if (!this.changes.O()) {
            ComposerKt.Z("Expected applyChanges() to have been called");
        }
        this.shouldPauseCallback = shouldPause;
        try {
            G7(invalidationsRequested, content);
        } finally {
            this.shouldPauseCallback = null;
        }
    }

    @Override // androidx.compose.runtime.Composer
    /* JADX INFO: renamed from: mUb, reason: from getter */
    public Applier getApplier() {
        return this.applier;
    }

    public final void n1() {
        if (!(!this.isComposing && this.reusingGroup == 100)) {
            PreconditionsKt.n("Cannot disable reuse from root if it was caused by other groups");
        }
        this.reusingGroup = -1;
        this.reusing = false;
    }

    public final void o9() {
        this.reusingGroup = 100;
        this.reusing = true;
    }

    @Override // androidx.compose.runtime.Composer
    public void qie() {
        Zn(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, null, GroupKind.INSTANCE.rl(), null);
        this.nodeExpected = true;
    }

    public final void s(Object value) {
        if (value instanceof RememberObserver) {
            RememberObserverHolder rememberObserverHolder = new RememberObserverHolder((RememberObserver) value, Qu());
            if (getInserting()) {
                this.changeListWriter.Xw(rememberObserverHolder);
            }
            this.abandonSet.add(value);
            value = rememberObserverHolder;
        }
        wKp(value);
    }

    @Override // androidx.compose.runtime.Composer
    public void te(int key) {
        Zn(key, null, GroupKind.INSTANCE.n(), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void uG() {
        int iRotateLeft;
        if (this.invalidations.isEmpty()) {
            Vvq();
            return;
        }
        SlotReader slotReader = this.reader;
        int iTy = slotReader.ty();
        Object objHI = slotReader.HI();
        Object objQie = slotReader.qie();
        int i2 = this.rGroupIndex;
        if (objHI != null) {
            iRotateLeft = Integer.rotateLeft((objHI instanceof Enum ? ((Enum) objHI).ordinal() : objHI.hashCode()) ^ Integer.rotateLeft(getCompoundKeyHash(), 3), 3);
        } else {
            if (objQie != null && iTy == 207 && !Intrinsics.areEqual(objQie, Composer.INSTANCE.n())) {
                this.compoundKeyHash = Integer.rotateLeft(objQie.hashCode() ^ Integer.rotateLeft(getCompoundKeyHash(), 3), 3) ^ i2;
                v0j(slotReader.N(), null);
                Bu();
                slotReader.Uo();
                if (objHI == null) {
                    if (objHI instanceof Enum) {
                        this.compoundKeyHash = Integer.rotateRight(Integer.hashCode(((Enum) objHI).ordinal()) ^ Integer.rotateRight(getCompoundKeyHash(), 3), 3);
                        return;
                    } else {
                        this.compoundKeyHash = Integer.rotateRight(Integer.hashCode(objHI.hashCode()) ^ Integer.rotateRight(getCompoundKeyHash(), 3), 3);
                        return;
                    }
                }
                if (objQie == null || iTy != 207 || Intrinsics.areEqual(objQie, Composer.INSTANCE.n())) {
                    this.compoundKeyHash = Integer.rotateRight(Integer.rotateRight(getCompoundKeyHash() ^ i2, 3) ^ Integer.hashCode(iTy), 3);
                    return;
                } else {
                    this.compoundKeyHash = Integer.rotateRight(Integer.hashCode(objQie.hashCode()) ^ Integer.rotateRight(getCompoundKeyHash() ^ i2, 3), 3);
                    return;
                }
            }
            iRotateLeft = Integer.rotateLeft(Integer.rotateLeft(getCompoundKeyHash(), 3) ^ iTy, 3) ^ i2;
        }
        this.compoundKeyHash = iRotateLeft;
        v0j(slotReader.N(), null);
        Bu();
        slotReader.Uo();
        if (objHI == null) {
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void wTp() {
        if (!(this.groupNodeCount == 0)) {
            ComposerKt.Z("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (getInserting()) {
            return;
        }
        RecomposeScopeImpl recomposeScopeImplEWS = EWS();
        if (recomposeScopeImplEWS != null) {
            recomposeScopeImplEWS.iF();
        }
        if (this.invalidations.isEmpty()) {
            y();
        } else {
            Bu();
        }
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [androidx.compose.runtime.ComposerImpl$derivedStateObserver$1] */
    public ComposerImpl(Applier applier, CompositionContext compositionContext, SlotTable slotTable, Set set, ChangeList changeList, ChangeList changeList2, ControlledComposition controlledComposition) {
        boolean z2;
        this.applier = applier;
        this.parentContext = compositionContext;
        this.slotTable = slotTable;
        this.abandonSet = set;
        this.changes = changeList;
        this.lateChanges = changeList2;
        this.composition = controlledComposition;
        if (!compositionContext.getCollectingSourceInformation() && !compositionContext.nr()) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.sourceMarkersEnabled = z2;
        this.derivedStateObserver = new DerivedStateObserver() { // from class: androidx.compose.runtime.ComposerImpl$derivedStateObserver$1
            @Override // androidx.compose.runtime.DerivedStateObserver
            public void n(DerivedState derivedState) {
                ComposerImpl composerImpl = this.f30097n;
                composerImpl.childrenComposing--;
            }

            @Override // androidx.compose.runtime.DerivedStateObserver
            public void rl(DerivedState derivedState) {
                this.f30097n.childrenComposing++;
            }
        };
        this.invalidateStack = Stack.t(null, 1, null);
        SlotReader slotReaderNY = slotTable.nY();
        slotReaderNY.nr();
        this.reader = slotReaderNY;
        SlotTable slotTable2 = new SlotTable();
        if (compositionContext.getCollectingSourceInformation()) {
            slotTable2.az();
        }
        if (compositionContext.nr()) {
            slotTable2.qie();
        }
        this.insertTable = slotTable2;
        SlotWriter slotWriterG = slotTable2.g();
        slotWriterG.wTp(true);
        this.writer = slotWriterG;
        this.changeListWriter = new ComposerChangeListWriter(this, this.changes);
        SlotReader slotReaderNY2 = this.insertTable.nY();
        try {
            Anchor anchorN = slotReaderNY2.n(0);
            slotReaderNY2.nr();
            this.insertAnchor = anchorN;
            this.insertFixups = new FixupList();
        } catch (Throwable th) {
            slotReaderNY2.nr();
            throw th;
        }
    }

    private final void Jk() {
        ul();
        this.parentContext.t();
        ul();
        this.changeListWriter.qie();
        Org();
        this.reader.nr();
        this.forciblyRecompose = false;
        this.providersInvalid = ComposerKt.ck(this.providersInvalidStack.Uo());
    }

    private final int K(SlotReader slotReader, int i2) {
        Object objNY;
        if (slotReader.X(i2)) {
            Object objFD = slotReader.fD(i2);
            if (objFD != null) {
                if (objFD instanceof Enum) {
                    return ((Enum) objFD).ordinal();
                }
                if (objFD instanceof MovableContent) {
                    return 126665345;
                }
                return objFD.hashCode();
            }
            return 0;
        }
        int iIF = slotReader.iF(i2);
        if (iIF == 207 && (objNY = slotReader.nY(i2)) != null && !Intrinsics.areEqual(objNY, Composer.INSTANCE.n())) {
            return objNY.hashCode();
        }
        return iIF;
    }

    private final void M() {
        piY();
        Stack.n(this.pendingStack);
        this.parentStateStack.n();
        this.entersStack.n();
        this.providersInvalidStack.n();
        this.providerUpdates = null;
        this.insertFixups.rl();
        this.compoundKeyHash = 0;
        this.childrenComposing = 0;
        this.nodeExpected = false;
        this.inserting = false;
        this.reusing = false;
        this.isComposing = false;
        this.forciblyRecompose = false;
        this.reusingGroup = -1;
        if (!this.reader.getClosed()) {
            this.reader.nr();
        }
        if (!this.writer.getClosed()) {
            HV();
        }
    }

    private final void Mh(int group, int newCount) {
        int iTh = Th(group);
        if (iTh != newCount) {
            int i2 = newCount - iTh;
            int iO = Stack.O(this.pendingStack) - 1;
            while (group != -1) {
                int iTh2 = Th(group) + i2;
                g6(group, iTh2);
                int i3 = iO;
                while (true) {
                    if (-1 < i3) {
                        Pending pending = (Pending) Stack.mUb(this.pendingStack, i3);
                        if (pending != null && pending.ty(group, iTh2)) {
                            iO = i3 - 1;
                            break;
                        }
                        i3--;
                    } else {
                        break;
                    }
                }
                if (group < 0) {
                    group = this.reader.getParent();
                } else if (!this.reader.nHg(group)) {
                    group = this.reader.Xw(group);
                } else {
                    return;
                }
            }
        }
    }

    private final Anchor Qu() {
        int i2;
        int i3;
        if (getInserting()) {
            if (!ComposerKt.wTp(this.writer)) {
                return null;
            }
            int currentGroup = this.writer.getCurrentGroup() - 1;
            int iUhV = this.writer.UhV(currentGroup);
            while (true) {
                int i5 = iUhV;
                i3 = currentGroup;
                currentGroup = i5;
                if (currentGroup == this.writer.getParent() || currentGroup < 0) {
                    break;
                }
                iUhV = this.writer.UhV(currentGroup);
            }
            return this.writer.fD(i3);
        }
        if (!ComposerKt.s7N(this.reader)) {
            return null;
        }
        int current = this.reader.getCurrent() - 1;
        int iXw = this.reader.Xw(current);
        while (true) {
            int i7 = iXw;
            i2 = current;
            current = i7;
            if (current == this.reader.getParent() || current < 0) {
                break;
            }
            iXw = this.reader.Xw(current);
        }
        return this.reader.n(i2);
    }

    private final void Toy(Object value) {
        W();
        wKp(value);
    }

    private final Object UhV(SlotReader slotReader) {
        return slotReader.wTp(slotReader.getParent());
    }

    private final Object a63(SlotReader slotReader, int i2) {
        return slotReader.wTp(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void dR0() {
        RecomposeScopeImpl recomposeScopeImpl;
        boolean z2;
        if (!getInserting()) {
            Invalidation invalidationU = ComposerKt.U(this.invalidations, this.reader.getParent());
            Object objS7N = this.reader.s7N();
            if (Intrinsics.areEqual(objS7N, Composer.INSTANCE.n())) {
                ControlledComposition composition = getComposition();
                Intrinsics.checkNotNull(composition, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
                recomposeScopeImpl = new RecomposeScopeImpl((CompositionImpl) composition);
                wKp(recomposeScopeImpl);
            } else {
                Intrinsics.checkNotNull(objS7N, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                recomposeScopeImpl = (RecomposeScopeImpl) objS7N;
            }
            if (invalidationU == null) {
                boolean zAz = recomposeScopeImpl.az();
                if (zAz) {
                    recomposeScopeImpl.X(false);
                }
                if (!zAz) {
                    z2 = false;
                }
            } else {
                z2 = true;
            }
            recomposeScopeImpl.N(z2);
            Stack.qie(this.invalidateStack, recomposeScopeImpl);
            recomposeScopeImpl.bzg(this.compositionToken);
            if (recomposeScopeImpl.ty()) {
                recomposeScopeImpl.T(false);
                recomposeScopeImpl.s7N(true);
                this.changeListWriter.B(recomposeScopeImpl);
                return;
            }
            return;
        }
        ControlledComposition composition2 = getComposition();
        Intrinsics.checkNotNull(composition2, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
        RecomposeScopeImpl recomposeScopeImpl2 = new RecomposeScopeImpl((CompositionImpl) composition2);
        Stack.qie(this.invalidateStack, recomposeScopeImpl2);
        wKp(recomposeScopeImpl2);
        recomposeScopeImpl2.bzg(this.compositionToken);
    }

    private final void g6(int group, int count) {
        if (Th(group) != count) {
            if (group < 0) {
                MutableIntIntMap mutableIntIntMap = this.nodeCountVirtualOverrides;
                if (mutableIntIntMap == null) {
                    mutableIntIntMap = new MutableIntIntMap(0, 1, null);
                    this.nodeCountVirtualOverrides = mutableIntIntMap;
                }
                mutableIntIntMap.Ik(group, count);
                return;
            }
            int[] iArr = this.nodeCountOverrides;
            if (iArr == null) {
                int[] iArr2 = new int[this.reader.getGroupsSize()];
                ArraysKt.fill$default(iArr2, -1, 0, 0, 6, (Object) null);
                this.nodeCountOverrides = iArr2;
                iArr = iArr2;
            }
            iArr[group] = count;
        }
    }

    private final PersistentCompositionLocalMap jO(PersistentCompositionLocalMap parentScope, PersistentCompositionLocalMap currentProviders) {
        PersistentCompositionLocalMap.Builder builderN = parentScope.n();
        builderN.putAll(currentProviders);
        PersistentCompositionLocalMap persistentCompositionLocalMapBuild = builderN.build();
        vl(204, ComposerKt.T());
        Toy(persistentCompositionLocalMapBuild);
        Toy(currentProviders);
        ul();
        return persistentCompositionLocalMapBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void lLA(final MovableContent content, PersistentCompositionLocalMap locals, final Object parameter, boolean force) {
        X(126665345, content);
        Toy(parameter);
        int compoundKeyHash = getCompoundKeyHash();
        try {
            this.compoundKeyHash = 126665345;
            boolean z2 = false;
            if (getInserting()) {
                SlotWriter.ul(this.writer, 0, 1, null);
            }
            if (!getInserting() && !Intrinsics.areEqual(this.reader.qie(), locals)) {
                z2 = true;
            }
            if (z2) {
                f(locals);
            }
            Zn(Sdk.SDKError.Reason.AD_CONSUMED_VALUE, ComposerKt.iF(), GroupKind.INSTANCE.n(), locals);
            this.providerCache = null;
            if (getInserting() && !force) {
                this.writerHasAProvider = true;
                SlotWriter slotWriter = this.writer;
                this.parentContext.qie(new MovableContentStateReference(content, parameter, getComposition(), this.insertTable, slotWriter.fD(slotWriter.UhV(slotWriter.getParent())), CollectionsKt.emptyList(), pJg(), null));
            } else {
                boolean z3 = this.providersInvalid;
                this.providersInvalid = z2;
                Utils_jvmKt.rl(this, ComposableLambdaKt.rl(316014703, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$invokeMovableContentLambda$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        n(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer, int i2) {
                        if (!composer.HI((i2 & 3) != 2, i2 & 1)) {
                            composer.wTp();
                            return;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(316014703, i2, -1, "androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.<anonymous> (Composer.kt:3386)");
                        }
                        content.getContent().invoke(parameter, composer, 0);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }
                }));
                this.providersInvalid = z3;
            }
            ul();
            this.providerCache = null;
            this.compoundKeyHash = compoundKeyHash;
            P5();
        } catch (Throwable th) {
            ul();
            this.providerCache = null;
            this.compoundKeyHash = compoundKeyHash;
            P5();
            throw th;
        }
    }

    private final PersistentCompositionLocalMap ofS(int group) {
        PersistentCompositionLocalMap persistentCompositionLocalMap;
        if (getInserting() && this.writerHasAProvider) {
            int parent = this.writer.getParent();
            while (parent > 0) {
                if (this.writer.piY(parent) == 202 && Intrinsics.areEqual(this.writer.ijL(parent), ComposerKt.iF())) {
                    Object objDR0 = this.writer.dR0(parent);
                    Intrinsics.checkNotNull(objDR0, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    PersistentCompositionLocalMap persistentCompositionLocalMap2 = (PersistentCompositionLocalMap) objDR0;
                    this.providerCache = persistentCompositionLocalMap2;
                    return persistentCompositionLocalMap2;
                }
                parent = this.writer.UhV(parent);
            }
        }
        if (this.reader.getGroupsSize() > 0) {
            while (group > 0) {
                if (this.reader.iF(group) == 202 && Intrinsics.areEqual(this.reader.fD(group), ComposerKt.iF())) {
                    MutableIntObjectMap mutableIntObjectMap = this.providerUpdates;
                    if (mutableIntObjectMap == null || (persistentCompositionLocalMap = (PersistentCompositionLocalMap) mutableIntObjectMap.rl(group)) == null) {
                        Object objNY = this.reader.nY(group);
                        Intrinsics.checkNotNull(objNY, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        persistentCompositionLocalMap = (PersistentCompositionLocalMap) objNY;
                    }
                    this.providerCache = persistentCompositionLocalMap;
                    return persistentCompositionLocalMap;
                }
                group = this.reader.Xw(group);
            }
        }
        PersistentCompositionLocalMap persistentCompositionLocalMap3 = this.parentProvider;
        this.providerCache = persistentCompositionLocalMap3;
        return persistentCompositionLocalMap3;
    }

    public final boolean Aum(RecomposeScopeImpl scope, Object instance) {
        Anchor anchor = scope.getAnchor();
        if (anchor == null) {
            return false;
        }
        int iNr = anchor.nr(this.reader.getTable());
        if (this.isComposing && iNr >= this.reader.getCurrent()) {
            ComposerKt.nHg(this.invalidations, iNr, scope, instance);
            return true;
        }
        return false;
    }

    @Override // androidx.compose.runtime.Composer
    public void E(ProvidedValue[] values) {
        PersistentCompositionLocalMap persistentCompositionLocalMapJO;
        PersistentCompositionLocalMap persistentCompositionLocalMapPJg = pJg();
        vl(201, ComposerKt.X());
        boolean z2 = true;
        boolean z3 = false;
        if (getInserting()) {
            persistentCompositionLocalMapJO = jO(persistentCompositionLocalMapPJg, CompositionLocalMapKt.nr(values, persistentCompositionLocalMapPJg, null, 4, null));
            this.writerHasAProvider = true;
        } else {
            Object objG = this.reader.g(0);
            Intrinsics.checkNotNull(objG, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            PersistentCompositionLocalMap persistentCompositionLocalMap = (PersistentCompositionLocalMap) objG;
            Object objG2 = this.reader.g(1);
            Intrinsics.checkNotNull(objG2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            PersistentCompositionLocalMap persistentCompositionLocalMap2 = (PersistentCompositionLocalMap) objG2;
            PersistentCompositionLocalMap persistentCompositionLocalMapT = CompositionLocalMapKt.t(values, persistentCompositionLocalMapPJg, persistentCompositionLocalMap2);
            if (xMQ() && !this.reusing && Intrinsics.areEqual(persistentCompositionLocalMap2, persistentCompositionLocalMapT)) {
                Vvq();
                persistentCompositionLocalMapJO = persistentCompositionLocalMap;
            } else {
                persistentCompositionLocalMapJO = jO(persistentCompositionLocalMapPJg, persistentCompositionLocalMapT);
                if (!this.reusing && Intrinsics.areEqual(persistentCompositionLocalMapJO, persistentCompositionLocalMap)) {
                    z2 = false;
                }
                z3 = z2;
            }
        }
        if (z3 && !getInserting()) {
            f(persistentCompositionLocalMapJO);
        }
        this.providersInvalidStack.KN(ComposerKt.Ik(this.providersInvalid));
        this.providersInvalid = z3;
        this.providerCache = persistentCompositionLocalMapJO;
        Zn(Sdk.SDKError.Reason.AD_CONSUMED_VALUE, ComposerKt.iF(), GroupKind.INSTANCE.n(), persistentCompositionLocalMapJO);
    }

    @Override // androidx.compose.runtime.Composer
    public boolean E2(Object value) {
        if (W() != value) {
            wKp(value);
            return true;
        }
        return false;
    }

    @Override // androidx.compose.runtime.Composer
    public CompositionLocalMap Ik() {
        return pJg();
    }

    @Override // androidx.compose.runtime.Composer
    public Composer KN(int key) {
        eF(key);
        dR0();
        return this;
    }

    @Override // androidx.compose.runtime.Composer
    public void M7() {
        ul();
    }

    @Override // androidx.compose.runtime.Composer
    public void N(ProvidedValue value) {
        ValueHolder valueHolder;
        PersistentCompositionLocalMap persistentCompositionLocalMapPJg = pJg();
        vl(201, ComposerKt.X());
        Object objIF = iF();
        if (Intrinsics.areEqual(objIF, Composer.INSTANCE.n())) {
            valueHolder = null;
        } else {
            Intrinsics.checkNotNull(objIF, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            valueHolder = (ValueHolder) objIF;
        }
        CompositionLocal compositionLocal = value.getCompositionLocal();
        Intrinsics.checkNotNull(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
        ValueHolder valueHolderRl = compositionLocal.rl(value, valueHolder);
        boolean zAreEqual = Intrinsics.areEqual(valueHolderRl, valueHolder);
        if (!zAreEqual) {
            o(valueHolderRl);
        }
        boolean z2 = true;
        boolean z3 = false;
        if (getInserting()) {
            if (value.getCanOverride() || !CompositionLocalMapKt.n(persistentCompositionLocalMapPJg, compositionLocal)) {
                persistentCompositionLocalMapPJg = persistentCompositionLocalMapPJg.nr(compositionLocal, valueHolderRl);
            }
            this.writerHasAProvider = true;
        } else {
            SlotReader slotReader = this.reader;
            Object objNY = slotReader.nY(slotReader.getCurrent());
            Intrinsics.checkNotNull(objNY, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            PersistentCompositionLocalMap persistentCompositionLocalMap = (PersistentCompositionLocalMap) objNY;
            if ((xMQ() && zAreEqual) || (!value.getCanOverride() && CompositionLocalMapKt.n(persistentCompositionLocalMapPJg, compositionLocal))) {
                if ((zAreEqual && !this.providersInvalid) || !this.providersInvalid) {
                    persistentCompositionLocalMapPJg = persistentCompositionLocalMap;
                }
            } else {
                persistentCompositionLocalMapPJg = persistentCompositionLocalMapPJg.nr(compositionLocal, valueHolderRl);
            }
            if (!this.reusing && persistentCompositionLocalMap == persistentCompositionLocalMapPJg) {
                z2 = false;
            }
            z3 = z2;
        }
        if (z3 && !getInserting()) {
            f(persistentCompositionLocalMapPJg);
        }
        this.providersInvalidStack.KN(ComposerKt.Ik(this.providersInvalid));
        this.providersInvalid = z3;
        this.providerCache = persistentCompositionLocalMapPJg;
        Zn(Sdk.SDKError.Reason.AD_CONSUMED_VALUE, ComposerKt.iF(), GroupKind.INSTANCE.n(), persistentCompositionLocalMapPJg);
    }

    @Override // androidx.compose.runtime.Composer
    public boolean O(char value) {
        Object objW = W();
        if ((objW instanceof Character) && value == ((Character) objW).charValue()) {
            return false;
        }
        wKp(Character.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public void P5() {
        ul();
    }

    public final Object RQ() {
        if (getInserting()) {
            XNZ();
            return Composer.INSTANCE.n();
        }
        Object objS7N = this.reader.s7N();
        if (this.reusing && !(objS7N instanceof ReusableRememberObserver)) {
            return Composer.INSTANCE.n();
        }
        if (objS7N instanceof RememberObserverHolder) {
            return ((RememberObserverHolder) objS7N).getWrapped();
        }
        return objS7N;
    }

    @Override // androidx.compose.runtime.Composer
    public void S() {
        ul();
        RecomposeScopeImpl recomposeScopeImplEWS = EWS();
        if (recomposeScopeImplEWS != null && recomposeScopeImplEWS.Z()) {
            recomposeScopeImplEWS.E2(true);
        }
    }

    public final Object W() {
        if (getInserting()) {
            XNZ();
            return Composer.INSTANCE.n();
        }
        Object objS7N = this.reader.s7N();
        if (this.reusing && !(objS7N instanceof ReusableRememberObserver)) {
            return Composer.INSTANCE.n();
        }
        return objS7N;
    }

    @Override // androidx.compose.runtime.Composer
    public void Xw() {
        ul();
    }

    @Override // androidx.compose.runtime.Composer
    public void Z() {
        ul();
        ul();
        this.providersInvalid = ComposerKt.ck(this.providersInvalidStack.Uo());
        this.providerCache = null;
    }

    @Override // androidx.compose.runtime.Composer
    public void az(Object value, Function2 block) {
        if (getInserting()) {
            this.insertFixups.KN(value, block);
        } else {
            this.changeListWriter.I(value, block);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public Object iF() {
        return RQ();
    }

    @Override // androidx.compose.runtime.Composer
    public boolean n(boolean value) {
        Object objW = W();
        if ((objW instanceof Boolean) && value == ((Boolean) objW).booleanValue()) {
            return false;
        }
        wKp(Boolean.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public void nHg(int key, Object dataKey) {
        if (!getInserting() && this.reader.ty() == key && !Intrinsics.areEqual(this.reader.qie(), dataKey) && this.reusingGroup < 0) {
            this.reusingGroup = this.reader.getCurrent();
            this.reusing = true;
        }
        Zn(key, null, GroupKind.INSTANCE.n(), dataKey);
    }

    @Override // androidx.compose.runtime.Composer
    public RecomposeScope nY() {
        return EWS();
    }

    @Override // androidx.compose.runtime.Composer
    public boolean nr(long value) {
        Object objW = W();
        if ((objW instanceof Long) && value == ((Number) objW).longValue()) {
            return false;
        }
        wKp(Long.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public void o(Object value) {
        s(value);
    }

    @Override // androidx.compose.runtime.Composer
    public boolean p5(Object value) {
        if (!Intrinsics.areEqual(W(), value)) {
            wKp(value);
            return true;
        }
        return false;
    }

    @Override // androidx.compose.runtime.Composer
    public void r() {
        xzo();
        if (getInserting()) {
            ComposerKt.Z("useNode() called while inserting");
        }
        Object objUhV = UhV(this.reader);
        this.changeListWriter.aYN(objUhV);
        if (this.reusing && (objUhV instanceof ComposeNodeLifecycleCallback)) {
            this.changeListWriter.Nxk(objUhV);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public boolean rV9() {
        RecomposeScopeImpl recomposeScopeImplEWS;
        if (!xMQ() || this.providersInvalid || ((recomposeScopeImplEWS = EWS()) != null && recomposeScopeImplEWS.qie())) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean rl(float value) {
        Object objW = W();
        if ((objW instanceof Float) && value == ((Number) objW).floatValue()) {
            return false;
        }
        wKp(Float.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public void s7N(Function0 factory) {
        xzo();
        if (!getInserting()) {
            ComposerKt.Z("createNode() can only be called when inserting");
        }
        int iT = this.parentStateStack.t();
        SlotWriter slotWriter = this.writer;
        Anchor anchorFD = slotWriter.fD(slotWriter.getParent());
        this.groupNodeCount++;
        this.insertFixups.t(factory, iT, anchorFD);
    }

    @Override // androidx.compose.runtime.Composer
    public boolean t(int value) {
        Object objW = W();
        if ((objW instanceof Integer) && value == ((Number) objW).intValue()) {
            return false;
        }
        wKp(Integer.valueOf(value));
        return true;
    }

    public void tUK(List references) {
        try {
            How(references);
            piY();
        } catch (Throwable th) {
            M();
            throw th;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public Object ty(CompositionLocal key) {
        return CompositionLocalMapKt.rl(pJg(), key);
    }

    @Override // androidx.compose.runtime.Composer
    public void v() {
        ul();
        ul();
        this.providersInvalid = ComposerKt.ck(this.providersInvalidStack.Uo());
        this.providerCache = null;
    }

    public final void wKp(Object value) {
        if (getInserting()) {
            this.writer.Zn(value);
            return;
        }
        if (this.reader.getHadNext()) {
            int iIk = this.reader.Ik() - 1;
            if (this.changeListWriter.r()) {
                ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
                SlotReader slotReader = this.reader;
                composerChangeListWriter.D(value, slotReader.n(slotReader.getParent()), iIk);
                return;
            }
            this.changeListWriter.GR(value, iIk);
            return;
        }
        ComposerChangeListWriter composerChangeListWriter2 = this.changeListWriter;
        SlotReader slotReader2 = this.reader;
        composerChangeListWriter2.n(slotReader2.n(slotReader2.getParent()), value);
    }

    @Override // androidx.compose.runtime.Composer
    public boolean xMQ() {
        RecomposeScopeImpl recomposeScopeImplEWS;
        if (!getInserting() && !this.reusing && !this.providersInvalid && (recomposeScopeImplEWS = EWS()) != null && !recomposeScopeImplEWS.HI() && !this.forciblyRecompose) {
            return true;
        }
        return false;
    }
}
