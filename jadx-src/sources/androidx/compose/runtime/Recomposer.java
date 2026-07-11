package androidx.compose.runtime;

import GJW.AbstractC1363t;
import GJW.Dsr;
import GJW.Pl;
import GJW.YzO;
import GJW.eO;
import GJW.g9s;
import GJW.xuv;
import TFv.Lu;
import TFv.SPz;
import TFv.fuX;
import TFv.rv6;
import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectList;
import androidx.collection.ObjectListKt;
import androidx.collection.ScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.collection.MultiValueMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.internal.Utils_androidKt;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.tooling.CompositionRegistrationObserver;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000¼\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 Ø\u00012\u00020\u0001:\nÙ\u0001Ú\u0001Û\u0001Ü\u0001Ý\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ \u0010#\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0082@¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b%\u0010&JN\u0010/\u001a\u00020\u00072<\u0010.\u001a8\b\u0001\u0012\u0004\u0012\u00020(\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b( \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070+\u0012\u0006\u0012\u0004\u0018\u00010,0'¢\u0006\u0002\b-H\u0082@¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0013H\u0002¢\u0006\u0004\b1\u0010\u001cJ)\u00104\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001a\u001a\u00020\u00132\u000e\u00103\u001a\n\u0012\u0004\u0012\u00020,\u0018\u000102H\u0002¢\u0006\u0004\b4\u00105J3\u00109\u001a\b\u0012\u0004\u0012\u00020\u0013062\f\u00108\u001a\b\u0012\u0004\u0012\u000207062\u000e\u00103\u001a\n\u0012\u0004\u0012\u00020,\u0018\u000102H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0007H\u0002¢\u0006\u0004\b;\u0010\u0019J#\u0010=\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00070<2\u0006\u0010\u001a\u001a\u00020\u0013H\u0002¢\u0006\u0004\b=\u0010>J3\u0010?\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00070<2\u0006\u0010\u001a\u001a\u00020\u00132\u000e\u00103\u001a\n\u0012\u0004\u0012\u00020,\u0018\u000102H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020\u00072\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020\u0007H\u0086@¢\u0006\u0004\bE\u0010&J\r\u0010F\u001a\u00020\u0007¢\u0006\u0004\bF\u0010\u0019J\r\u0010G\u001a\u00020\u0007¢\u0006\u0004\bG\u0010\u0019J\u0010\u0010H\u001a\u00020\u0007H\u0086@¢\u0006\u0004\bH\u0010&J*\u0010L\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00132\u0011\u0010K\u001a\r\u0012\u0004\u0012\u00020\u00070I¢\u0006\u0002\bJH\u0010¢\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u00020\u00072\u0006\u0010O\u001a\u00020NH\u0010¢\u0006\u0004\bP\u0010QJ\r\u0010R\u001a\u00020\u0007¢\u0006\u0004\bR\u0010\u0019J\r\u0010S\u001a\u00020\u0007¢\u0006\u0004\bS\u0010\u0019J\u001d\u0010W\u001a\u00020\u00072\f\u0010V\u001a\b\u0012\u0004\u0012\u00020U0TH\u0010¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0013H\u0010¢\u0006\u0004\bY\u0010\u001cJ\u0017\u0010Z\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0013H\u0010¢\u0006\u0004\bZ\u0010\u001cJ\u0017\u0010\\\u001a\u00020\u00072\u0006\u0010[\u001a\u000207H\u0010¢\u0006\u0004\b\\\u0010]J\u0017\u0010^\u001a\u00020\u00072\u0006\u0010[\u001a\u000207H\u0010¢\u0006\u0004\b^\u0010]J+\u0010c\u001a\u00020\u00072\u0006\u0010[\u001a\u0002072\u0006\u0010`\u001a\u00020_2\n\u0010b\u001a\u0006\u0012\u0002\b\u00030aH\u0010¢\u0006\u0004\bc\u0010dJ\u0017\u0010e\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0013H\u0010¢\u0006\u0004\be\u0010\u001cJ\u0019\u0010f\u001a\u0004\u0018\u00010_2\u0006\u0010[\u001a\u000207H\u0010¢\u0006\u0004\bf\u0010gR$\u0010m\u001a\u00020h2\u0006\u0010i\u001a\u00020h8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bL\u0010j\u001a\u0004\bk\u0010lR\u0014\u0010p\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010oR\u0014\u0010s\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0018\u0010v\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010y\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u001a\u0010}\u001a\b\u0012\u0004\u0012\u00020\u00130z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u001e\u0010\u007f\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010|R\u001f\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020,028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001e\u0010\u0086\u0001\u001a\t\u0012\u0004\u0012\u00020\u00130\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001c\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130z8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010|R\u001c\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u0002070z8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010|R2\u0010\u008e\u0001\u001a\u0018\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u00010,0\u008c\u0001\u0012\u0004\u0012\u0002070\u008b\u00018\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\n\u0005\b\\\u0010\u008d\u0001R\u0017\u0010\u0091\u0001\u001a\u00030\u008f\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bZ\u0010\u0090\u0001R#\u0010\u0093\u0001\u001a\u000f\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020_0\u0092\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bc\u0010\u008d\u0001R)\u0010\u0094\u0001\u001a\u000f\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u0002070\u008b\u00018\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\n\u0005\bf\u0010\u008d\u0001R\u001f\u0010\u0095\u0001\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010|R!\u0010\u0098\u0001\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R \u0010\u009a\u0001\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bP\u0010\u0099\u0001R\u0019\u0010\u009d\u0001\u001a\u00030\u009b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\be\u0010\u009c\u0001R\u0019\u0010\u009f\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009e\u0001R\u001c\u0010£\u0001\u001a\u0005\u0018\u00010 \u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0018\u0010¤\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bY\u0010\u009e\u0001R\u001f\u0010©\u0001\u001a\n\u0012\u0005\u0012\u00030¦\u00010¥\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R&\u0010\u00ad\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00020N\u0018\u0001020ª\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u0018\u0010±\u0001\u001a\u00030®\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u001e\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b\u0084\u0001\u0010´\u0001R*\u0010º\u0001\u001a\f\u0012\u0005\u0012\u00030¶\u0001\u0018\u00010µ\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u000f\n\u0006\b·\u0001\u0010¸\u0001\u0012\u0005\b¹\u0001\u0010\u0019R\u001c\u0010¾\u0001\u001a\u00070»\u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u001d\u0010Á\u0001\u001a\b\u0012\u0004\u0012\u00020\u0013068BX\u0082\u0004¢\u0006\b\u001a\u0006\b¿\u0001\u0010À\u0001R\u0016\u0010Ã\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÂ\u0001\u0010\fR\u0016\u0010Å\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÄ\u0001\u0010\fR\u0016\u0010Ç\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÆ\u0001\u0010\fR\u0016\u0010É\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÈ\u0001\u0010\fR\u0016\u0010Ë\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÊ\u0001\u0010\fR\u0016\u0010Í\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÌ\u0001\u0010\fR\u0017\u0010Î\u0001\u001a\u00020\u00028PX\u0090\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010´\u0001R\u001c\u0010Ò\u0001\u001a\n\u0012\u0005\u0012\u00030¦\u00010Ï\u00018F¢\u0006\b\u001a\u0006\bÐ\u0001\u0010Ñ\u0001R\u0018\u0010Ô\u0001\u001a\u00030\u009b\u00018PX\u0090\u0004¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010Ó\u0001R\u0015\u0010Õ\u0001\u001a\u00020\n8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bt\u0010\fR\u0015\u0010Ö\u0001\u001a\u00020\n8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bw\u0010\fR\u0015\u0010×\u0001\u001a\u00020\n8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b{\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Þ\u0001"}, d2 = {"Landroidx/compose/runtime/Recomposer;", "Landroidx/compose/runtime/CompositionContext;", "Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "LGJW/Pl;", "", "m", "()LGJW/Pl;", "", "hRu", "()Z", "LGJW/xuv;", "callingJob", CmcdData.OBJECT_TYPE_INIT_SEGMENT, "(LGJW/xuv;)V", "", "e", "Landroidx/compose/runtime/ControlledComposition;", "failedInitialComposition", "recoverable", "HV", "(Ljava/lang/Throwable;Landroidx/compose/runtime/ControlledComposition;Z)V", "z", "()V", "composition", "K", "(Landroidx/compose/runtime/ControlledComposition;)V", "Nxk", "UhV", "Landroidx/compose/runtime/MonotonicFrameClock;", "parentFrameClock", "Landroidx/compose/runtime/ProduceFrameSignal;", "frameSignal", "tUK", "(Landroidx/compose/runtime/MonotonicFrameClock;Landroidx/compose/runtime/ProduceFrameSignal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "k", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function3;", "LGJW/vd;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "EWS", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Rl", "Landroidx/collection/MutableScatterSet;", "modifiedValues", "Org", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/collection/MutableScatterSet;)Landroidx/compose/runtime/ControlledComposition;", "", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "mYa", "(Ljava/util/List;Landroidx/collection/MutableScatterSet;)Ljava/util/List;", "eTf", "Lkotlin/Function1;", "Po6", "(Landroidx/compose/runtime/ControlledComposition;)Lkotlin/jvm/functions/Function1;", "lLA", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/collection/MutableScatterSet;)Lkotlin/jvm/functions/Function1;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "snapshot", "Y", "(Landroidx/compose/runtime/snapshots/MutableSnapshot;)V", "ER", "dR0", "piY", "n1", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "r", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "Jk", "How", "", "Landroidx/compose/runtime/tooling/CompositionData;", "table", "ck", "(Ljava/util/Set;)V", "S", "az", "reference", "qie", "(Landroidx/compose/runtime/MovableContentStateReference;)V", "rl", "Landroidx/compose/runtime/MovableContentState;", "data", "Landroidx/compose/runtime/Applier;", "applier", "ty", "(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentState;Landroidx/compose/runtime/Applier;)V", "o", "HI", "(Landroidx/compose/runtime/MovableContentStateReference;)Landroidx/compose/runtime/MovableContentState;", "", "<set-?>", "J", "xg", "()J", "changeCount", "Landroidx/compose/runtime/BroadcastFrameClock;", "Landroidx/compose/runtime/BroadcastFrameClock;", "broadcastFrameClock", "t", "Ljava/lang/Object;", "stateLock", "nr", "LGJW/xuv;", "runnerJob", "O", "Ljava/lang/Throwable;", "closeCause", "", "J2", "Ljava/util/List;", "_knownCompositions", "Uo", "_knownCompositionsCache", "KN", "Landroidx/collection/MutableScatterSet;", "snapshotInvalidations", "Landroidx/compose/runtime/collection/MutableVector;", "xMQ", "Landroidx/compose/runtime/collection/MutableVector;", "compositionInvalidations", "mUb", "compositionsAwaitingApply", "gh", "movableContentAwaitingInsert", "Landroidx/compose/runtime/collection/MultiValueMap;", "Landroidx/compose/runtime/MovableContent;", "Landroidx/collection/MutableScatterMap;", "movableContentRemoved", "Landroidx/compose/runtime/NestedContentMap;", "Landroidx/compose/runtime/NestedContentMap;", "movableContentNestedStatesAvailable", "Landroidx/collection/MutableScatterMap;", "movableContentStatesAvailable", "movableContentNestedExtractionsPending", "failedCompositions", "Ik", "Ljava/util/Set;", "compositionsRemoved", "LGJW/Pl;", "workContinuation", "", "I", "concurrentCompositionsOutstanding", "Z", "isClosed", "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "XQ", "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "errorState", "frameClockPaused", "LTFv/SPz;", "Landroidx/compose/runtime/Recomposer$State;", "WPU", "LTFv/SPz;", "_state", "Landroidx/compose/runtime/internal/SnapshotThreadLocal;", "aYN", "Landroidx/compose/runtime/internal/SnapshotThreadLocal;", "pausedScopes", "LGJW/g9s;", "ViF", "LGJW/g9s;", "effectJob", "nY", "Lkotlin/coroutines/CoroutineContext;", "()Lkotlin/coroutines/CoroutineContext;", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/runtime/tooling/CompositionRegistrationObserver;", "g", "Landroidx/collection/MutableObjectList;", "getRegistrationObservers$annotations", "registrationObservers", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "te", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "recomposerInfo", "eWT", "()Ljava/util/List;", "knownCompositions", "C", "hasBroadcastFrameClockAwaitersLocked", "ofS", "hasBroadcastFrameClockAwaiters", "ul", "shouldKeepRecomposing", "fcU", "hasSchedulingWork", "G7", "hasFrameWorkLocked", "Mx", "hasConcurrentFrameWorkLocked", "recomposeCoroutineContext", "LTFv/rv6;", "pJg", "()LTFv/rv6;", "currentState", "()I", "compoundHashKey", "collectingCallByInformation", "collectingParameterInformation", "collectingSourceInformation", "iF", "Companion", "HotReloadable", "RecomposerErrorState", "RecomposerInfoImpl", "State", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 7 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 8 ObjectList.kt\nandroidx/collection/ObjectList\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 ObjectList.kt\nandroidx/collection/MutableObjectList\n+ 11 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 12 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 13 Composition.kt\nandroidx/compose/runtime/CompositionKt\n+ 14 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 15 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 16 Extensions.kt\nandroidx/compose/runtime/collection/ExtensionsKt\n+ 17 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 18 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1791:1\n1404#1,3:1906\n1403#1,7:1909\n1411#1:1921\n1404#1,3:1947\n1403#1,7:1950\n1411#1:1962\n1404#1,3:1989\n1403#1,7:1992\n1411#1:2068\n27#2:1792\n33#2,2:1796\n33#2,2:1800\n33#2,2:1804\n33#2,2:1806\n33#2,2:1814\n33#2,2:1816\n33#2,2:1818\n33#2,2:1820\n33#2,2:1837\n33#2,2:1839\n33#2,2:1841\n33#2,2:1843\n33#2,2:1864\n33#2,2:1874\n33#2,2:1876\n33#2,2:1878\n33#2,2:1886\n33#2,2:1898\n33#2,2:1902\n33#2,2:1904\n33#2,2:1922\n33#2,2:1936\n33#2,2:2002\n33#2,2:2055\n33#2,2:2069\n33#2,2:2092\n33#2,2:2096\n33#2,2:2098\n33#2,2:2100\n33#2,2:2104\n33#2,2:2108\n33#2,2:2110\n33#2,2:2112\n33#2,2:2114\n33#2,2:2141\n33#2,2:2143\n33#2,2:2145\n1101#3:1793\n1083#3,2:1794\n519#4:1798\n423#4,9:1828\n519#4:1888\n519#4:2094\n519#4:2095\n646#4,2:2102\n641#4,2:2106\n1#5:1799\n1#5:2052\n1247#6,2:1802\n33#7,6:1808\n33#7,6:1822\n33#7,6:1868\n33#7,6:1880\n90#7,2:1938\n33#7,6:1940\n92#7:1946\n113#7,3:1963\n33#7,4:1966\n116#7,2:1970\n118#7,2:1979\n38#7:1981\n120#7:1982\n81#7,3:2004\n33#7,6:2007\n84#7:2013\n90#7,2:2014\n33#7,6:2016\n92#7:2022\n105#7,2:2027\n33#7,6:2029\n107#7:2035\n105#7,2:2036\n33#7,6:2038\n107#7:2044\n203#7,3:2045\n33#7,4:2048\n38#7:2053\n206#7:2054\n222#7,3:2057\n63#7,6:2060\n225#7:2066\n33#7,6:2147\n287#8,4:1845\n292#8:1851\n287#8,6:1852\n287#8,6:1858\n287#8,4:2073\n292#8:2079\n287#8,6:2081\n1855#9,2:1849\n1549#9:2023\n1620#9,3:2024\n919#10,2:1866\n919#10,2:2077\n314#11,9:1889\n323#11,2:1900\n148#12,5:1916\n148#12,5:1957\n148#12,3:1999\n152#12:2067\n148#12,5:2087\n311#13,6:1924\n311#13,6:1930\n372#14,7:1972\n4665#15:1983\n4643#15,5:1984\n23#16,2:2071\n25#16:2080\n357#17,4:2116\n329#17,6:2120\n339#17,3:2127\n342#17,9:2131\n361#17:2140\n1399#18:2126\n1270#18:2130\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n*L\n1132#1:1906,3\n1132#1:1909,7\n1132#1:1921\n1258#1:1947,3\n1258#1:1950,7\n1258#1:1962\n1281#1:1989,3\n1281#1:1992,7\n1281#1:2068\n211#1:1792\n315#1:1796,2\n366#1:1800,2\n450#1:1804,2\n456#1:1806,2\n468#1:1814,2\n475#1:1816,2\n478#1:1818,2\n490#1:1820,2\n503#1:1837,2\n511#1:1839,2\n743#1:1841,2\n770#1:1843,2\n815#1:1864,2\n837#1:1874,2\n850#1:1876,2\n866#1:1878,2\n1005#1:1886,2\n1017#1:1898,2\n1102#1:1902,2\n1117#1:1904,2\n1143#1:1922,2\n1222#1:1936,2\n1285#1:2002,2\n1343#1:2055,2\n1365#1:2069,2\n1435#1:2092,2\n1472#1:2096,2\n1485#1:2098,2\n1518#1:2100,2\n1526#1:2104,2\n1536#1:2108,2\n1544#1:2110,2\n1552#1:2112,2\n1575#1:2114,2\n1588#1:2141,2\n1599#1:2143,2\n1228#1:2145,2\n230#1:1793\n230#1:1794,2\n349#1:1798\n501#1:1828,9\n1007#1:1888\n1437#1:2094\n1444#1:2095\n1520#1:2102,2\n1528#1:2106,2\n1340#1:2052\n366#1:1802,2\n460#1:1808,6\n497#1:1822,6\n823#1:1868,6\n867#1:1880,6\n1223#1:1938,2\n1223#1:1940,6\n1223#1:1946\n1278#1:1963,3\n1278#1:1966,4\n1278#1:1970,2\n1278#1:1979,2\n1278#1:1981\n1278#1:1982\n1287#1:2004,3\n1287#1:2007,6\n1287#1:2013\n1299#1:2014,2\n1299#1:2016,6\n1299#1:2022\n1332#1:2027,2\n1332#1:2029,6\n1332#1:2035\n1332#1:2036,2\n1332#1:2038,6\n1332#1:2044\n1340#1:2045,3\n1340#1:2048,4\n1340#1:2053\n1340#1:2054\n1346#1:2057,3\n1346#1:2060,6\n1346#1:2066\n1557#1:2147,6\n787#1:1845,4\n787#1:1851\n800#1:1852,6\n808#1:1858,6\n1372#1:2073,4\n1372#1:2079\n1377#1:2081,6\n788#1:1849,2\n1308#1:2023\n1308#1:2024,3\n822#1:1866,2\n1372#1:2077,2\n1016#1:1889,9\n1016#1:1900,2\n1132#1:1916,5\n1258#1:1957,5\n1281#1:1999,3\n1281#1:2067\n1409#1:2087,5\n1179#1:1924,6\n1196#1:1930,6\n1278#1:1972,7\n1280#1:1983\n1280#1:1984,5\n1372#1:2071,2\n1372#1:2080\n1580#1:2116,4\n1580#1:2120,6\n1580#1:2127,3\n1580#1:2131,9\n1580#1:2140\n1580#1:2126\n1580#1:2130\n*E\n"})
public final class Recomposer extends CompositionContext {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private final MutableScatterMap movableContentNestedExtractionsPending;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private Set compositionsRemoved;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final List _knownCompositions;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private MutableScatterSet snapshotInvalidations;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Throwable closeCause;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private boolean frameClockPaused;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private List _knownCompositionsCache;

    /* JADX INFO: renamed from: ViF, reason: from kotlin metadata */
    private final g9s effectJob;

    /* JADX INFO: renamed from: WPU, reason: from kotlin metadata */
    private final SPz _state;

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private RecomposerErrorState errorState;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private boolean isClosed;

    /* JADX INFO: renamed from: aYN, reason: from kotlin metadata */
    private final SnapshotThreadLocal pausedScopes;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final NestedContentMap movableContentNestedStatesAvailable;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private List failedCompositions;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private MutableObjectList registrationObservers;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final List movableContentAwaitingInsert;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final List compositionsAwaitingApply;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private long changeCount;

    /* JADX INFO: renamed from: nY, reason: from kotlin metadata */
    private final CoroutineContext effectCoroutineContext;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private xuv runnerJob;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int concurrentCompositionsOutstanding;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final MutableScatterMap movableContentRemoved;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Pl workContinuation;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final BroadcastFrameClock broadcastFrameClock;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Object stateLock;

    /* JADX INFO: renamed from: te, reason: from kotlin metadata */
    private final RecomposerInfoImpl recomposerInfo;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final MutableScatterMap movableContentStatesAvailable;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final MutableVector compositionInvalidations;

    /* JADX INFO: renamed from: iF, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int fD = 8;
    private static final SPz E2 = Lu.n(ExtensionsKt.t());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicReference f30276e = new AtomicReference(Boolean.FALSE);

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\tR4\u0010\u000f\u001a\"\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bj\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R$\u0010\u0013\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004R\u00020\u00050\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/Recomposer$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "Landroidx/compose/runtime/Recomposer;", "info", "", "t", "(Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;)V", "nr", "Ljava/util/concurrent/atomic/AtomicReference;", "", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/internal/AtomicReference;", "_hotReloadEnabled", "Ljava/util/concurrent/atomic/AtomicReference;", "LTFv/SPz;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "_runningRecomposers", "LTFv/SPz;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1791:1\n1360#2:1792\n1446#2,5:1793\n1855#2,2:1798\n1855#2,2:1812\n1855#2,2:1814\n1603#2,9:1816\n1855#2:1825\n1856#2:1827\n1612#2:1828\n1603#2,9:1829\n1855#2:1838\n1856#2:1840\n1612#2:1841\n33#3,6:1800\n33#3,6:1806\n1#4:1826\n1#4:1839\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$Companion\n*L\n1654#1:1792\n1654#1:1793,5\n1662#1:1798,2\n1668#1:1812,2\n1673#1:1814,2\n1687#1:1816,9\n1687#1:1825\n1687#1:1827\n1687#1:1828\n1690#1:1829,9\n1690#1:1838\n1690#1:1840\n1690#1:1841\n1665#1:1800,6\n1666#1:1806,6\n1687#1:1826\n1690#1:1839\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void nr(RecomposerInfoImpl info) {
            PersistentSet persistentSet;
            PersistentSet persistentSetRemove;
            do {
                persistentSet = (PersistentSet) Recomposer.E2.getValue();
                persistentSetRemove = persistentSet.remove((Object) info);
                if (persistentSet == persistentSetRemove) {
                    return;
                }
            } while (!Recomposer.E2.Uo(persistentSet, persistentSetRemove));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void t(RecomposerInfoImpl info) {
            PersistentSet persistentSet;
            PersistentSet persistentSetAdd;
            do {
                persistentSet = (PersistentSet) Recomposer.E2.getValue();
                persistentSetAdd = persistentSet.add((Object) info);
                if (persistentSet == persistentSetAdd) {
                    return;
                }
            } while (!Recomposer.E2.Uo(persistentSet, persistentSetAdd));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/Recomposer$HotReloadable;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class HotReloadable {
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "Landroidx/compose/runtime/RecomposerErrorInfo;", "", "recoverable", "", "cause", "<init>", "(ZLjava/lang/Throwable;)V", c.f62177j, "Z", "getRecoverable", "()Z", "rl", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class RecomposerErrorState implements RecomposerErrorInfo {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final boolean recoverable;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private final Throwable cause;

        /* JADX INFO: renamed from: n, reason: from getter */
        public Throwable getCause() {
            return this.cause;
        }

        public RecomposerErrorState(boolean z2, Throwable th) {
            this.recoverable = z2;
            this.cause = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "Landroidx/compose/runtime/RecomposerInfo;", "<init>", "(Landroidx/compose/runtime/Recomposer;)V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$RecomposerInfoImpl\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1791:1\n33#2,2:1792\n33#2,2:1794\n33#2,2:1812\n203#3,3:1796\n33#3,4:1799\n38#3:1804\n206#3:1805\n33#3,6:1806\n203#3,3:1814\n33#3,4:1817\n38#3:1822\n206#3:1823\n81#3,3:1824\n33#3,4:1827\n38#3:1832\n84#3:1833\n1#4:1803\n1#4:1821\n1#4:1831\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$RecomposerInfoImpl\n*L\n390#1:1792,2\n394#1:1794,2\n402#1:1812,2\n396#1:1796,3\n396#1:1799,4\n396#1:1804\n396#1:1805\n397#1:1806,6\n404#1:1814,3\n404#1:1817,4\n404#1:1822\n404#1:1823\n405#1:1824,3\n405#1:1827,4\n405#1:1832\n405#1:1833\n396#1:1803\n404#1:1821\n*E\n"})
    final class RecomposerInfoImpl implements RecomposerInfo {
        public RecomposerInfoImpl() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/Recomposer$State;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "O", "J2", "r", "o", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State {

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f30288S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private static final /* synthetic */ State[] f30289Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final State f30290n = new State("ShutDown", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final State f30293t = new State("ShuttingDown", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final State f30287O = new State("Inactive", 2);
        public static final State J2 = new State("InactivePendingWork", 3);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final State f30292r = new State("Idle", 4);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final State f30291o = new State("PendingWork", 5);

        private static final /* synthetic */ State[] n() {
            return new State[]{f30290n, f30293t, f30287O, J2, f30292r, f30291o};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f30289Z.clone();
        }

        static {
            State[] stateArrN = n();
            f30289Z = stateArrN;
            f30288S = EnumEntriesKt.enumEntries(stateArrN);
        }

        private State(String str, int i2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hRu() {
        List listEWT;
        boolean zG7;
        int i2 = 1;
        synchronized (this.stateLock) {
            if (this.snapshotInvalidations.O()) {
                return G7();
            }
            Set setN = ScatterSetWrapperKt.n(this.snapshotInvalidations);
            DefaultConstructorMarker defaultConstructorMarker = null;
            int i3 = 0;
            this.snapshotInvalidations = new MutableScatterSet(i3, i2, defaultConstructorMarker);
            synchronized (this.stateLock) {
                listEWT = eWT();
            }
            try {
                int size = listEWT.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ((ControlledComposition) listEWT.get(i5)).HI(setN);
                    if (((State) this._state.getValue()).compareTo(State.f30293t) <= 0) {
                        break;
                    }
                }
                synchronized (this.stateLock) {
                    this.snapshotInvalidations = new MutableScatterSet(i3, i2, defaultConstructorMarker);
                    Unit unit = Unit.INSTANCE;
                }
                synchronized (this.stateLock) {
                    if (m() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zG7 = G7();
                }
                return zG7;
            } catch (Throwable th) {
                synchronized (this.stateLock) {
                    this.snapshotInvalidations.gh(setN);
                    throw th;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean J2() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public int KN() {
        return 1000;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean O() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void ck(Set table) {
    }

    private final boolean C() {
        return !this.frameClockPaused && this.broadcastFrameClock.mUb();
    }

    private final boolean G7() {
        return this.compositionInvalidations.getSize() != 0 || C();
    }

    static /* synthetic */ void GD(Recomposer recomposer, Throwable th, ControlledComposition controlledComposition, boolean z2, int i2, Object obj) throws Throwable {
        if ((i2 & 2) != 0) {
            controlledComposition = null;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        recomposer.HV(th, controlledComposition, z2);
    }

    private final void HV(Throwable e2, ControlledComposition failedInitialComposition, boolean recoverable) throws Throwable {
        int i2 = 0;
        if (!((Boolean) f30276e.get()).booleanValue() || (e2 instanceof ComposeRuntimeError)) {
            synchronized (this.stateLock) {
                RecomposerErrorState recomposerErrorState = this.errorState;
                if (recomposerErrorState != null) {
                    throw recomposerErrorState.getCause();
                }
                this.errorState = new RecomposerErrorState(false, e2);
                Unit unit = Unit.INSTANCE;
            }
            throw e2;
        }
        synchronized (this.stateLock) {
            try {
                Utils_androidKt.n("Error was captured in composition while live edit was enabled.", e2);
                this.compositionsAwaitingApply.clear();
                this.compositionInvalidations.KN();
                this.snapshotInvalidations = new MutableScatterSet(i2, 1, null);
                this.movableContentAwaitingInsert.clear();
                MultiValueMap.t(this.movableContentRemoved);
                this.movableContentStatesAvailable.gh();
                this.errorState = new RecomposerErrorState(recoverable, e2);
                if (failedInitialComposition != null) {
                    UhV(failedInitialComposition);
                }
                m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void K(ControlledComposition composition) {
        if (this._knownCompositions.remove(composition)) {
            this._knownCompositionsCache = null;
            MutableObjectList mutableObjectList = this.registrationObservers;
            if (mutableObjectList != null) {
                Object[] objArr = mutableObjectList.content;
                int i2 = mutableObjectList._size;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((CompositionRegistrationObserver) objArr[i3]).rl(this, composition);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Mx() {
        return !this.compositionsAwaitingApply.isEmpty() || C();
    }

    private final void Nxk(ControlledComposition composition) {
        this._knownCompositions.add(composition);
        this._knownCompositionsCache = null;
        MutableObjectList mutableObjectList = this.registrationObservers;
        if (mutableObjectList != null) {
            Object[] objArr = mutableObjectList.content;
            int i2 = mutableObjectList._size;
            for (int i3 = 0; i3 < i2; i3++) {
                ((CompositionRegistrationObserver) objArr[i3]).n(this, composition);
            }
        }
    }

    private final Function1 Po6(final ControlledComposition composition) {
        return new Function1<Object, Unit>() { // from class: androidx.compose.runtime.Recomposer$readObserverOf$1
            {
                super(1);
            }

            public final void n(Object obj) {
                composition.t(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                n(obj);
                return Unit.INSTANCE;
            }
        };
    }

    private final void Rl(ControlledComposition composition) {
        synchronized (this.stateLock) {
            List list = this.movableContentAwaitingInsert;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (Intrinsics.areEqual(((MovableContentStateReference) list.get(i2)).getComposition(), composition)) {
                    Unit unit = Unit.INSTANCE;
                    ArrayList arrayList = new ArrayList();
                    qm(arrayList, this, composition);
                    while (!arrayList.isEmpty()) {
                        mYa(arrayList, null);
                        qm(arrayList, this, composition);
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UhV(ControlledComposition composition) {
        List arrayList = this.failedCompositions;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.failedCompositions = arrayList;
        }
        if (!arrayList.contains(composition)) {
            arrayList.add(composition);
        }
        K(composition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void eTf() {
        int i2;
        ObjectList objectListJ2;
        synchronized (this.stateLock) {
            try {
                if (MultiValueMap.gh(this.movableContentRemoved)) {
                    ObjectList objectListIk = MultiValueMap.Ik(this.movableContentRemoved);
                    MultiValueMap.t(this.movableContentRemoved);
                    this.movableContentNestedStatesAvailable.rl();
                    MultiValueMap.t(this.movableContentNestedExtractionsPending);
                    MutableObjectList mutableObjectList = new MutableObjectList(objectListIk.get_size());
                    Object[] objArr = objectListIk.content;
                    int i3 = objectListIk._size;
                    for (int i5 = 0; i5 < i3; i5++) {
                        MovableContentStateReference movableContentStateReference = (MovableContentStateReference) objArr[i5];
                        mutableObjectList.ty(TuplesKt.to(movableContentStateReference, this.movableContentStatesAvailable.O(movableContentStateReference)));
                    }
                    this.movableContentStatesAvailable.gh();
                    objectListJ2 = mutableObjectList;
                } else {
                    objectListJ2 = ObjectListKt.J2();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object[] objArr2 = objectListJ2.content;
        int i7 = objectListJ2._size;
        for (i2 = 0; i2 < i7; i2++) {
            Pair pair = (Pair) objArr2[i2];
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) pair.component1();
            MovableContentState movableContentState = (MovableContentState) pair.component2();
            if (movableContentState != null) {
                movableContentStateReference2.getComposition().xMQ(movableContentState);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List eWT() {
        List listEmptyList = this._knownCompositionsCache;
        if (listEmptyList == null) {
            List list = this._knownCompositions;
            listEmptyList = list.isEmpty() ? CollectionsKt.emptyList() : new ArrayList(list);
            this._knownCompositionsCache = listEmptyList;
        }
        return listEmptyList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean fcU() {
        boolean z2;
        synchronized (this.stateLock) {
            if (this.snapshotInvalidations.J2() || this.compositionInvalidations.getSize() != 0) {
                z2 = true;
            } else if (!C()) {
                z2 = false;
            }
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(xuv callingJob) {
        synchronized (this.stateLock) {
            Throwable th = this.closeCause;
            if (th != null) {
                throw th;
            }
            if (((State) this._state.getValue()).compareTo(State.f30293t) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (this.runnerJob != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            this.runnerJob = callingJob;
            m();
        }
    }

    private final Function1 lLA(final ControlledComposition composition, final MutableScatterSet modifiedValues) {
        return new Function1<Object, Unit>() { // from class: androidx.compose.runtime.Recomposer$writeObserverOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void n(Object obj) {
                composition.o(obj);
                MutableScatterSet mutableScatterSet = modifiedValues;
                if (mutableScatterSet != null) {
                    mutableScatterSet.xMQ(obj);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                n(obj);
                return Unit.INSTANCE;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pl m() {
        State state;
        int i2 = 0;
        int i3 = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (((State) this._state.getValue()).compareTo(State.f30293t) <= 0) {
            z();
            this.snapshotInvalidations = new MutableScatterSet(i2, i3, defaultConstructorMarker);
            this.compositionInvalidations.KN();
            this.compositionsAwaitingApply.clear();
            this.movableContentAwaitingInsert.clear();
            this.failedCompositions = null;
            Pl pl = this.workContinuation;
            if (pl != null) {
                Pl.j.n(pl, null, 1, null);
            }
            this.workContinuation = null;
            this.errorState = null;
            return null;
        }
        if (this.errorState != null) {
            state = State.f30287O;
        } else if (this.runnerJob == null) {
            this.snapshotInvalidations = new MutableScatterSet(i2, i3, defaultConstructorMarker);
            this.compositionInvalidations.KN();
            state = C() ? State.J2 : State.f30287O;
        } else {
            state = (this.compositionInvalidations.getSize() == 0 && !this.snapshotInvalidations.J2() && this.compositionsAwaitingApply.isEmpty() && this.movableContentAwaitingInsert.isEmpty() && this.concurrentCompositionsOutstanding <= 0 && !C()) ? State.f30292r : State.f30291o;
        }
        this._state.setValue(state);
        if (state != State.f30291o) {
            return null;
        }
        Pl pl3 = this.workContinuation;
        this.workContinuation = null;
        return pl3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0141, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0146, code lost:
    
        if (r4 >= r3) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0152, code lost:
    
        if (((kotlin.Pair) r10.get(r4)).getSecond() == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0154, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0157, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0165, code lost:
    
        if (r9 >= r4) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0167, code lost:
    
        r11 = (kotlin.Pair) r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0171, code lost:
    
        if (r11.getSecond() != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0173, code lost:
    
        r11 = (androidx.compose.runtime.MovableContentStateReference) r11.getFirst();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017c, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x017d, code lost:
    
        if (r11 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x017f, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0182, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0185, code lost:
    
        r4 = r16.stateLock;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0187, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0188, code lost:
    
        kotlin.collections.CollectionsKt.addAll(r16.movableContentAwaitingInsert, r3);
        r3 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018f, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0190, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x019e, code lost:
    
        if (r9 >= r4) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a0, code lost:
    
        r11 = r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ab, code lost:
    
        if (((kotlin.Pair) r11).getSecond() == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01ad, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b0, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01b3, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List mYa(List references, MutableScatterSet modifiedValues) {
        ArrayList<Pair> arrayList;
        NestedMovableContent nestedMovableContentNr;
        HashMap map = new HashMap(references.size());
        int size = references.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = references.get(i2);
            ControlledComposition composition = ((MovableContentStateReference) obj).getComposition();
            Object arrayList2 = map.get(composition);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(composition, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            ControlledComposition controlledComposition = (ControlledComposition) entry.getKey();
            List list = (List) entry.getValue();
            if (controlledComposition.Ik()) {
                ComposerKt.Z("Check failed");
            }
            MutableSnapshot mutableSnapshotHI = Snapshot.INSTANCE.HI(Po6(controlledComposition), lLA(controlledComposition, modifiedValues));
            try {
                Snapshot snapshotQie = mutableSnapshotHI.qie();
                try {
                    synchronized (this.stateLock) {
                        try {
                            arrayList = new ArrayList(list.size());
                            int size2 = list.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                MovableContentStateReference movableContentStateReference = (MovableContentStateReference) list.get(i3);
                                Object objAz = MultiValueMap.az(this.movableContentRemoved, movableContentStateReference.getContent());
                                MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) objAz;
                                if (movableContentStateReference2 != null) {
                                    this.movableContentNestedStatesAvailable.O(movableContentStateReference2);
                                }
                                arrayList.add(TuplesKt.to(movableContentStateReference, objAz));
                            }
                            if (ComposeRuntimeFlags.isMovingNestedMovableContentEnabled) {
                                int size3 = arrayList.size();
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= size3) {
                                        break;
                                    }
                                    Pair pair = (Pair) arrayList.get(i5);
                                    if (pair.getSecond() == null && this.movableContentNestedStatesAvailable.t(((MovableContentStateReference) pair.getFirst()).getContent())) {
                                        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                                        for (Pair pair2 : arrayList) {
                                            if (pair2.getSecond() == null && (nestedMovableContentNr = this.movableContentNestedStatesAvailable.nr(((MovableContentStateReference) pair2.getFirst()).getContent())) != null) {
                                                MovableContentStateReference content = nestedMovableContentNr.getContent();
                                                MultiValueMap.n(this.movableContentNestedExtractionsPending, nestedMovableContentNr.getAndroidx.media3.extractor.text.ttml.TtmlNode.RUBY_CONTAINER java.lang.String(), content);
                                                pair2 = TuplesKt.to(pair2.getFirst(), content);
                                            }
                                            arrayList3.add(pair2);
                                        }
                                        arrayList = arrayList3;
                                    } else {
                                        i5++;
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                    int size4 = arrayList.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size4) {
                            break;
                        }
                        if (((Pair) arrayList.get(i7)).getSecond() != null) {
                            break;
                        }
                        i7++;
                    }
                    controlledComposition.mUb(arrayList);
                    Unit unit = Unit.INSTANCE;
                    mutableSnapshotHI.o(snapshotQie);
                } catch (Throwable th) {
                    mutableSnapshotHI.o(snapshotQie);
                    throw th;
                }
            } finally {
                Y(mutableSnapshotHI);
            }
        }
        return CollectionsKt.toList(map.keySet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean ofS() {
        boolean zC2;
        synchronized (this.stateLock) {
            zC2 = C();
        }
        return zC2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a2, code lost:
    
        if (r5.jB(r10, r0) != r1) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00a2 -> B:13:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object tUK(MonotonicFrameClock monotonicFrameClock, ProduceFrameSignal produceFrameSignal, Continuation continuation) {
        Recomposer$runFrameLoop$1 recomposer$runFrameLoop$1;
        List arrayList;
        List arrayList2;
        Recomposer recomposer;
        final List list;
        final List list2;
        final Recomposer recomposer2;
        MonotonicFrameClock monotonicFrameClock2;
        final ProduceFrameSignal produceFrameSignal2;
        Object obj;
        if (continuation instanceof Recomposer$runFrameLoop$1) {
            recomposer$runFrameLoop$1 = (Recomposer$runFrameLoop$1) continuation;
            int i2 = recomposer$runFrameLoop$1.f30315S;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                recomposer$runFrameLoop$1.f30315S = i2 - Integer.MIN_VALUE;
            } else {
                recomposer$runFrameLoop$1 = new Recomposer$runFrameLoop$1(this, continuation);
            }
        }
        Object obj2 = recomposer$runFrameLoop$1.f30318o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = recomposer$runFrameLoop$1.f30315S;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj2);
            arrayList = new ArrayList();
            arrayList2 = new ArrayList();
            recomposer = this;
            obj = recomposer.stateLock;
            recomposer$runFrameLoop$1.f30317n = recomposer;
            recomposer$runFrameLoop$1.f30320t = monotonicFrameClock;
            recomposer$runFrameLoop$1.f30314O = produceFrameSignal;
            recomposer$runFrameLoop$1.J2 = arrayList;
            recomposer$runFrameLoop$1.f30319r = arrayList2;
            recomposer$runFrameLoop$1.f30315S = 1;
            if (produceFrameSignal.t(obj, recomposer$runFrameLoop$1) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = (List) recomposer$runFrameLoop$1.f30319r;
            list = (List) recomposer$runFrameLoop$1.J2;
            produceFrameSignal2 = (ProduceFrameSignal) recomposer$runFrameLoop$1.f30314O;
            monotonicFrameClock2 = (MonotonicFrameClock) recomposer$runFrameLoop$1.f30320t;
            recomposer2 = (Recomposer) recomposer$runFrameLoop$1.f30317n;
            ResultKt.throwOnFailure(obj2);
            arrayList = list;
            produceFrameSignal = produceFrameSignal2;
            arrayList2 = list2;
            monotonicFrameClock = monotonicFrameClock2;
            recomposer = recomposer2;
            obj = recomposer.stateLock;
            recomposer$runFrameLoop$1.f30317n = recomposer;
            recomposer$runFrameLoop$1.f30320t = monotonicFrameClock;
            recomposer$runFrameLoop$1.f30314O = produceFrameSignal;
            recomposer$runFrameLoop$1.J2 = arrayList;
            recomposer$runFrameLoop$1.f30319r = arrayList2;
            recomposer$runFrameLoop$1.f30315S = 1;
            if (produceFrameSignal.t(obj, recomposer$runFrameLoop$1) != coroutine_suspended) {
                recomposer2 = recomposer;
                monotonicFrameClock2 = monotonicFrameClock;
                list2 = arrayList2;
                produceFrameSignal2 = produceFrameSignal;
                list = arrayList;
                Function1<Long, Pl> function1 = new Function1<Long, Pl>() { // from class: androidx.compose.runtime.Recomposer$runFrameLoop$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final Pl n(long j2) {
                        Object objN;
                        int i5;
                        Pl plM;
                        if (this.f30322n.ofS()) {
                            Recomposer recomposer3 = this.f30322n;
                            Trace trace = Trace.f30884n;
                            objN = trace.n("Recomposer:animation");
                            try {
                                recomposer3.broadcastFrameClock.gh(j2);
                                Snapshot.INSTANCE.ty();
                                Unit unit = Unit.INSTANCE;
                                trace.rl(objN);
                            } finally {
                            }
                        }
                        Recomposer recomposer4 = this.f30322n;
                        List list3 = list;
                        List list4 = list2;
                        ProduceFrameSignal produceFrameSignal3 = produceFrameSignal2;
                        objN = Trace.f30884n.n("Recomposer:recompose");
                        try {
                            recomposer4.hRu();
                            synchronized (recomposer4.stateLock) {
                                try {
                                    List list5 = recomposer4.compositionsAwaitingApply;
                                    int size = list5.size();
                                    for (int i7 = 0; i7 < size; i7++) {
                                        list4.add((ControlledComposition) list5.get(i7));
                                    }
                                    recomposer4.compositionsAwaitingApply.clear();
                                    MutableVector mutableVector = recomposer4.compositionInvalidations;
                                    Object[] objArr = mutableVector.content;
                                    int size2 = mutableVector.getSize();
                                    for (int i8 = 0; i8 < size2; i8++) {
                                        list3.add((ControlledComposition) objArr[i8]);
                                    }
                                    recomposer4.compositionInvalidations.KN();
                                    produceFrameSignal3.O();
                                    Unit unit2 = Unit.INSTANCE;
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            MutableScatterSet mutableScatterSet = new MutableScatterSet(0, 1, null);
                            try {
                                int size3 = list3.size();
                                for (int i9 = 0; i9 < size3; i9++) {
                                    ControlledComposition controlledCompositionOrg = recomposer4.Org((ControlledComposition) list3.get(i9), mutableScatterSet);
                                    if (controlledCompositionOrg != null) {
                                        list4.add(controlledCompositionOrg);
                                    }
                                }
                                list3.clear();
                                if (!list4.isEmpty()) {
                                    recomposer4.changeCount = recomposer4.getChangeCount() + 1;
                                }
                                try {
                                    int size4 = list4.size();
                                    for (i5 = 0; i5 < size4; i5++) {
                                        ((ControlledComposition) list4.get(i5)).ck();
                                    }
                                    list4.clear();
                                    synchronized (recomposer4.stateLock) {
                                        plM = recomposer4.m();
                                    }
                                    return plM;
                                } catch (Throwable th2) {
                                    list4.clear();
                                    throw th2;
                                }
                            } catch (Throwable th3) {
                                list3.clear();
                                throw th3;
                            }
                        } finally {
                        }
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Pl invoke(Long l2) {
                        return n(l2.longValue());
                    }
                };
                recomposer$runFrameLoop$1.f30317n = recomposer2;
                recomposer$runFrameLoop$1.f30320t = monotonicFrameClock2;
                recomposer$runFrameLoop$1.f30314O = produceFrameSignal2;
                recomposer$runFrameLoop$1.J2 = list;
                recomposer$runFrameLoop$1.f30319r = list2;
                recomposer$runFrameLoop$1.f30315S = 2;
            }
            return coroutine_suspended;
        }
        list2 = (List) recomposer$runFrameLoop$1.f30319r;
        list = (List) recomposer$runFrameLoop$1.J2;
        produceFrameSignal2 = (ProduceFrameSignal) recomposer$runFrameLoop$1.f30314O;
        monotonicFrameClock2 = (MonotonicFrameClock) recomposer$runFrameLoop$1.f30320t;
        recomposer2 = (Recomposer) recomposer$runFrameLoop$1.f30317n;
        ResultKt.throwOnFailure(obj2);
        Function1<Long, Pl> function12 = new Function1<Long, Pl>() { // from class: androidx.compose.runtime.Recomposer$runFrameLoop$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Pl n(long j2) {
                Object objN;
                int i5;
                Pl plM;
                if (this.f30322n.ofS()) {
                    Recomposer recomposer3 = this.f30322n;
                    Trace trace = Trace.f30884n;
                    objN = trace.n("Recomposer:animation");
                    try {
                        recomposer3.broadcastFrameClock.gh(j2);
                        Snapshot.INSTANCE.ty();
                        Unit unit = Unit.INSTANCE;
                        trace.rl(objN);
                    } finally {
                    }
                }
                Recomposer recomposer4 = this.f30322n;
                List list3 = list;
                List list4 = list2;
                ProduceFrameSignal produceFrameSignal3 = produceFrameSignal2;
                objN = Trace.f30884n.n("Recomposer:recompose");
                try {
                    recomposer4.hRu();
                    synchronized (recomposer4.stateLock) {
                        try {
                            List list5 = recomposer4.compositionsAwaitingApply;
                            int size = list5.size();
                            for (int i7 = 0; i7 < size; i7++) {
                                list4.add((ControlledComposition) list5.get(i7));
                            }
                            recomposer4.compositionsAwaitingApply.clear();
                            MutableVector mutableVector = recomposer4.compositionInvalidations;
                            Object[] objArr = mutableVector.content;
                            int size2 = mutableVector.getSize();
                            for (int i8 = 0; i8 < size2; i8++) {
                                list3.add((ControlledComposition) objArr[i8]);
                            }
                            recomposer4.compositionInvalidations.KN();
                            produceFrameSignal3.O();
                            Unit unit2 = Unit.INSTANCE;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    MutableScatterSet mutableScatterSet = new MutableScatterSet(0, 1, null);
                    try {
                        int size3 = list3.size();
                        for (int i9 = 0; i9 < size3; i9++) {
                            ControlledComposition controlledCompositionOrg = recomposer4.Org((ControlledComposition) list3.get(i9), mutableScatterSet);
                            if (controlledCompositionOrg != null) {
                                list4.add(controlledCompositionOrg);
                            }
                        }
                        list3.clear();
                        if (!list4.isEmpty()) {
                            recomposer4.changeCount = recomposer4.getChangeCount() + 1;
                        }
                        try {
                            int size4 = list4.size();
                            for (i5 = 0; i5 < size4; i5++) {
                                ((ControlledComposition) list4.get(i5)).ck();
                            }
                            list4.clear();
                            synchronized (recomposer4.stateLock) {
                                plM = recomposer4.m();
                            }
                            return plM;
                        } catch (Throwable th2) {
                            list4.clear();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        list3.clear();
                        throw th3;
                    }
                } finally {
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Pl invoke(Long l2) {
                return n(l2.longValue());
            }
        };
        recomposer$runFrameLoop$1.f30317n = recomposer2;
        recomposer$runFrameLoop$1.f30320t = monotonicFrameClock2;
        recomposer$runFrameLoop$1.f30314O = produceFrameSignal2;
        recomposer$runFrameLoop$1.J2 = list;
        recomposer$runFrameLoop$1.f30319r = list2;
        recomposer$runFrameLoop$1.f30315S = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean ul() {
        boolean z2;
        synchronized (this.stateLock) {
            z2 = this.isClosed;
        }
        if (!z2) {
            return true;
        }
        Iterator it = this.effectJob.getChildren().iterator();
        while (it.hasNext()) {
            if (((xuv) it.next()).isActive()) {
                return true;
            }
        }
        return false;
    }

    private final void z() {
        MutableObjectList mutableObjectList = this.registrationObservers;
        if (mutableObjectList != null) {
            Object[] objArr = mutableObjectList.content;
            int i2 = mutableObjectList._size;
            for (int i3 = 0; i3 < i2; i3++) {
                CompositionRegistrationObserver compositionRegistrationObserver = (CompositionRegistrationObserver) objArr[i3];
                Iterator it = eWT().iterator();
                while (it.hasNext()) {
                    compositionRegistrationObserver.rl(this, (ControlledComposition) it.next());
                }
            }
        }
        this._knownCompositions.clear();
        this._knownCompositionsCache = CollectionsKt.emptyList();
    }

    public final Object ER(Continuation continuation) {
        Object objEWS = EWS(new Recomposer$runRecomposeAndApplyChanges$2(this, null), continuation);
        return objEWS == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEWS : Unit.INSTANCE;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public MovableContentState HI(MovableContentStateReference reference) {
        MovableContentState movableContentState;
        synchronized (this.stateLock) {
            movableContentState = (MovableContentState) this.movableContentStatesAvailable.XQ(reference);
        }
        return movableContentState;
    }

    public final void How() {
        Pl plM;
        synchronized (this.stateLock) {
            if (this.frameClockPaused) {
                this.frameClockPaused = false;
                plM = m();
            } else {
                plM = null;
            }
        }
        if (plM != null) {
            Result.Companion companion = Result.INSTANCE;
            plM.resumeWith(Result.m313constructorimpl(Unit.INSTANCE));
        }
    }

    public final void Jk() {
        synchronized (this.stateLock) {
            this.frameClockPaused = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void S(ControlledComposition composition) {
        synchronized (this.stateLock) {
            K(composition);
            this.compositionInvalidations.ck(composition);
            this.compositionsAwaitingApply.remove(composition);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void az(ControlledComposition composition) {
        Pl plM;
        synchronized (this.stateLock) {
            if (this.compositionInvalidations.xMQ(composition)) {
                plM = null;
            } else {
                this.compositionInvalidations.rl(composition);
                plM = m();
            }
        }
        if (plM != null) {
            Result.Companion companion = Result.INSTANCE;
            plM.resumeWith(Result.m313constructorimpl(Unit.INSTANCE));
        }
    }

    public final void dR0() {
        synchronized (this.stateLock) {
            try {
                if (((State) this._state.getValue()).compareTo(State.f30292r) >= 0) {
                    this._state.setValue(State.f30293t);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        xuv.j.rl(this.effectJob, null, 1, null);
    }

    @Override // androidx.compose.runtime.CompositionContext
    public CoroutineContext gh() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean nr() {
        return ((Boolean) f30276e.get()).booleanValue();
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void o(ControlledComposition composition) {
        synchronized (this.stateLock) {
            try {
                Set linkedHashSet = this.compositionsRemoved;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.compositionsRemoved = linkedHashSet;
                }
                linkedHashSet.add(composition);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final rv6 pJg() {
        return this._state;
    }

    public final void piY() {
        if (this.effectJob.rl()) {
            synchronized (this.stateLock) {
                this.isClosed = true;
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void qie(MovableContentStateReference reference) {
        Pl plM;
        synchronized (this.stateLock) {
            this.movableContentAwaitingInsert.add(reference);
            plM = m();
        }
        if (plM != null) {
            Result.Companion companion = Result.INSTANCE;
            plM.resumeWith(Result.m313constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void r(RecomposeScopeImpl scope) {
        MutableScatterSet mutableScatterSetN = (MutableScatterSet) this.pausedScopes.n();
        if (mutableScatterSetN == null) {
            mutableScatterSetN = ScatterSetKt.n();
            this.pausedScopes.rl(mutableScatterSetN);
        }
        mutableScatterSetN.xMQ(scope);
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void rl(MovableContentStateReference reference) {
        synchronized (this.stateLock) {
            try {
                MultiValueMap.n(this.movableContentRemoved, reference.getContent(), reference);
                if (reference.getNestedReferences() != null) {
                    ijL(this, reference, reference);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    @Override // androidx.compose.runtime.CompositionContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ty(MovableContentStateReference reference, MovableContentState data, Applier applier) {
        synchronized (this.stateLock) {
            try {
                this.movableContentStatesAvailable.aYN(reference, data);
                ObjectList objectListKN = MultiValueMap.KN(this.movableContentNestedExtractionsPending, reference);
                if (objectListKN.KN()) {
                    ScatterMap scatterMapT = data.t(applier, objectListKN);
                    Object[] objArr = scatterMapT.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
                    Object[] objArr2 = scatterMapT.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
                    long[] jArr = scatterMapT.metadata;
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
                                        this.movableContentStatesAvailable.aYN((MovableContentStateReference) obj, (MovableContentState) objArr2[i7]);
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
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public CoroutineContext getEffectCoroutineContext() {
        return this.effectCoroutineContext;
    }

    /* JADX INFO: renamed from: xg, reason: from getter */
    public final long getChangeCount() {
        return this.changeCount;
    }

    public Recomposer(CoroutineContext coroutineContext) {
        BroadcastFrameClock broadcastFrameClock = new BroadcastFrameClock(new Function0<Unit>() { // from class: androidx.compose.runtime.Recomposer$broadcastFrameClock$1
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
                Pl plM;
                Object obj = this.f30296n.stateLock;
                Recomposer recomposer = this.f30296n;
                synchronized (obj) {
                    plM = recomposer.m();
                    if (((Recomposer.State) recomposer._state.getValue()).compareTo(Recomposer.State.f30293t) <= 0) {
                        throw YzO.n("Recomposer shutdown; frame clock awaiter will never resume", recomposer.closeCause);
                    }
                }
                if (plM != null) {
                    Result.Companion companion = Result.INSTANCE;
                    plM.resumeWith(Result.m313constructorimpl(Unit.INSTANCE));
                }
            }
        });
        this.broadcastFrameClock = broadcastFrameClock;
        this.stateLock = new Object();
        this._knownCompositions = new ArrayList();
        this.snapshotInvalidations = new MutableScatterSet(0, 1, null);
        this.compositionInvalidations = new MutableVector(new ControlledComposition[16], 0);
        this.compositionsAwaitingApply = new ArrayList();
        this.movableContentAwaitingInsert = new ArrayList();
        this.movableContentRemoved = MultiValueMap.O(null, 1, null);
        this.movableContentNestedStatesAvailable = new NestedContentMap();
        this.movableContentStatesAvailable = ScatterMapKt.t();
        this.movableContentNestedExtractionsPending = MultiValueMap.O(null, 1, null);
        this._state = Lu.n(State.f30287O);
        this.pausedScopes = new SnapshotThreadLocal();
        g9s g9sVarN = AbstractC1363t.n((xuv) coroutineContext.get(xuv.nr));
        g9sVarN.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(final Throwable th) {
                Pl pl;
                Pl pl3;
                CancellationException cancellationExceptionN = YzO.n("Recomposer effect job completed", th);
                Object obj = this.f30297n.stateLock;
                final Recomposer recomposer = this.f30297n;
                synchronized (obj) {
                    try {
                        xuv xuvVar = recomposer.runnerJob;
                        pl = null;
                        if (xuvVar != null) {
                            recomposer._state.setValue(Recomposer.State.f30293t);
                            if (recomposer.isClosed) {
                                if (recomposer.workContinuation != null) {
                                    pl3 = recomposer.workContinuation;
                                }
                                recomposer.workContinuation = null;
                                xuvVar.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                                        invoke2(th2);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Throwable th2) {
                                        Object obj2 = recomposer.stateLock;
                                        Recomposer recomposer2 = recomposer;
                                        Throwable th3 = th;
                                        synchronized (obj2) {
                                            if (th3 == null) {
                                                th3 = null;
                                            } else if (th2 != null) {
                                                try {
                                                    if (th2 instanceof CancellationException) {
                                                        th2 = null;
                                                    }
                                                    if (th2 != null) {
                                                        ExceptionsKt.addSuppressed(th3, th2);
                                                    }
                                                } catch (Throwable th4) {
                                                    throw th4;
                                                }
                                            }
                                            recomposer2.closeCause = th3;
                                            recomposer2._state.setValue(Recomposer.State.f30290n);
                                            Unit unit = Unit.INSTANCE;
                                        }
                                    }
                                });
                                pl = pl3;
                            } else {
                                xuvVar.cancel(cancellationExceptionN);
                            }
                            pl3 = null;
                            recomposer.workContinuation = null;
                            xuvVar.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                                    invoke2(th2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Throwable th2) {
                                    Object obj2 = recomposer.stateLock;
                                    Recomposer recomposer2 = recomposer;
                                    Throwable th3 = th;
                                    synchronized (obj2) {
                                        if (th3 == null) {
                                            th3 = null;
                                        } else if (th2 != null) {
                                            try {
                                                if (th2 instanceof CancellationException) {
                                                    th2 = null;
                                                }
                                                if (th2 != null) {
                                                    ExceptionsKt.addSuppressed(th3, th2);
                                                }
                                            } catch (Throwable th4) {
                                                throw th4;
                                            }
                                        }
                                        recomposer2.closeCause = th3;
                                        recomposer2._state.setValue(Recomposer.State.f30290n);
                                        Unit unit = Unit.INSTANCE;
                                    }
                                }
                            });
                            pl = pl3;
                        } else {
                            recomposer.closeCause = cancellationExceptionN;
                            recomposer._state.setValue(Recomposer.State.f30290n);
                            Unit unit = Unit.INSTANCE;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (pl != null) {
                    Result.Companion companion = Result.INSTANCE;
                    pl.resumeWith(Result.m313constructorimpl(Unit.INSTANCE));
                }
            }
        });
        this.effectJob = g9sVarN;
        this.effectCoroutineContext = coroutineContext.plus(broadcastFrameClock).plus(g9sVarN);
        this.recomposerInfo = new RecomposerInfoImpl();
    }

    private final Object EWS(Function3 function3, Continuation continuation) {
        Object objUo = Dsr.Uo(this.broadcastFrameClock, new Recomposer$recompositionRunner$2(this, function3, MonotonicFrameClockKt.n(continuation.getContext()), null), continuation);
        if (objUo == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objUo;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ControlledComposition Org(final ControlledComposition composition, final MutableScatterSet modifiedValues) {
        Set set;
        if (composition.Ik() || composition.getDisposed() || ((set = this.compositionsRemoved) != null && set.contains(composition))) {
            return null;
        }
        MutableSnapshot mutableSnapshotHI = Snapshot.INSTANCE.HI(Po6(composition), lLA(composition, modifiedValues));
        try {
            Snapshot snapshotQie = mutableSnapshotHI.qie();
            if (modifiedValues != null) {
                try {
                    if (modifiedValues.J2()) {
                        composition.ty(new Function0<Unit>() { // from class: androidx.compose.runtime.Recomposer$performRecompose$1$1
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
                                MutableScatterSet mutableScatterSet = modifiedValues;
                                ControlledComposition controlledComposition = composition;
                                Object[] objArr = mutableScatterSet.elements;
                                long[] jArr = mutableScatterSet.metadata;
                                int length = jArr.length - 2;
                                if (length < 0) {
                                    return;
                                }
                                int i2 = 0;
                                while (true) {
                                    long j2 = jArr[i2];
                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                                        for (int i5 = 0; i5 < i3; i5++) {
                                            if ((255 & j2) < 128) {
                                                controlledComposition.o(objArr[(i2 << 3) + i5]);
                                            }
                                            j2 >>= 8;
                                        }
                                        if (i3 != 8) {
                                            return;
                                        }
                                    }
                                    if (i2 == length) {
                                        return;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    mutableSnapshotHI.o(snapshotQie);
                    throw th;
                }
            }
            boolean zQie = composition.qie();
            mutableSnapshotHI.o(snapshotQie);
            if (!zQie) {
                return null;
            }
            return composition;
        } finally {
            Y(mutableSnapshotHI);
        }
    }

    private final void Y(MutableSnapshot snapshot) {
        try {
            if (!(snapshot.E2() instanceof SnapshotApplyResult.Failure)) {
            } else {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            snapshot.nr();
        }
    }

    private static final void ijL(Recomposer recomposer, MovableContentStateReference movableContentStateReference, MovableContentStateReference movableContentStateReference2) {
        List nestedReferences = movableContentStateReference2.getNestedReferences();
        if (nestedReferences != null) {
            int size = nestedReferences.size();
            for (int i2 = 0; i2 < size; i2++) {
                MovableContentStateReference movableContentStateReference3 = (MovableContentStateReference) nestedReferences.get(i2);
                recomposer.movableContentNestedStatesAvailable.n(movableContentStateReference3.getContent(), new NestedMovableContent(movableContentStateReference3, movableContentStateReference));
                ijL(recomposer, movableContentStateReference, movableContentStateReference3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object k(Continuation continuation) {
        eO eOVar;
        if (!fcU()) {
            eO eOVar2 = new eO(IntrinsicsKt.intercepted(continuation), 1);
            eOVar2.e();
            synchronized (this.stateLock) {
                if (!fcU()) {
                    this.workContinuation = eOVar2;
                    eOVar = null;
                } else {
                    eOVar = eOVar2;
                }
            }
            if (eOVar != null) {
                Result.Companion companion = Result.INSTANCE;
                eOVar.resumeWith(Result.m313constructorimpl(Unit.INSTANCE));
            }
            Object objWPU = eOVar2.WPU();
            if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objWPU;
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    private static final void qm(List list, Recomposer recomposer, ControlledComposition controlledComposition) {
        list.clear();
        synchronized (recomposer.stateLock) {
            try {
                Iterator it = recomposer.movableContentAwaitingInsert.iterator();
                while (it.hasNext()) {
                    MovableContentStateReference movableContentStateReference = (MovableContentStateReference) it.next();
                    if (Intrinsics.areEqual(movableContentStateReference.getComposition(), controlledComposition)) {
                        list.add(movableContentStateReference);
                        it.remove();
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void n(ControlledComposition composition, Function2 content) throws Throwable {
        Throwable th;
        boolean zIk = composition.Ik();
        try {
            Snapshot.Companion companion = Snapshot.INSTANCE;
            MutableSnapshot mutableSnapshotHI = companion.HI(Po6(composition), lLA(composition, null));
            try {
                Snapshot snapshotQie = mutableSnapshotHI.qie();
                try {
                    composition.nr(content);
                    Unit unit = Unit.INSTANCE;
                    mutableSnapshotHI.o(snapshotQie);
                    Y(mutableSnapshotHI);
                    if (!zIk) {
                        companion.J2();
                    }
                    synchronized (this.stateLock) {
                        try {
                            if (((State) this._state.getValue()).compareTo(State.f30293t) > 0) {
                                try {
                                    if (!eWT().contains(composition)) {
                                        Nxk(composition);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                            try {
                                Rl(composition);
                                try {
                                    composition.ck();
                                    composition.O();
                                    if (!zIk) {
                                        companion.J2();
                                    }
                                } catch (Throwable th3) {
                                    GD(this, th3, null, false, 6, null);
                                }
                            } catch (Throwable th4) {
                                HV(th4, composition, true);
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                } catch (Throwable th6) {
                    try {
                        mutableSnapshotHI.o(snapshotQie);
                        throw th6;
                    } catch (Throwable th7) {
                        th = th7;
                        Throwable th8 = th;
                        try {
                            Y(mutableSnapshotHI);
                            throw th8;
                        } catch (Throwable th9) {
                            th = th9;
                            HV(th, composition, true);
                        }
                    }
                }
            } catch (Throwable th10) {
                th = th10;
            }
        } catch (Throwable th11) {
            th = th11;
        }
    }

    public final Object n1(Continuation continuation) {
        Object objNY = fuX.nY(pJg(), new Recomposer$join$2(null), continuation);
        if (objNY == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objNY;
        }
        return Unit.INSTANCE;
    }
}
