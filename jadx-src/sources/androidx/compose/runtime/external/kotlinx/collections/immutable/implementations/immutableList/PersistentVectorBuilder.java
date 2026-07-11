package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import com.caoccao.javet.values.reference.IV8ValueArray;
import com.caoccao.javet.values.reference.V8ValueTypedArray;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.l;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010*\n\u0002\b\u0012\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u001f\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b \u0010!JA\u0010&\u001a\u00020%2\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b&\u0010'JA\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010)\u001a\u00020\nH\u0002¢\u0006\u0004\b*\u0010+J?\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010,\u001a\u00020\n2\u000e\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070-H\u0002¢\u0006\u0004\b/\u00100JG\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00101\u001a\u00020\n2\u0014\u00102\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u0006H\u0002¢\u0006\u0004\b3\u00104JO\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00101\u001a\u00020\n2\u0006\u0010)\u001a\u00020\n2\u0014\u00105\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060-H\u0002¢\u0006\u0004\b6\u00107J1\u00109\u001a\u00020%2\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00108\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00028\u0000H\u0002¢\u0006\u0004\b9\u0010:JI\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010)\u001a\u00020\n2\u0006\u00108\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00072\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b=\u0010>J]\u0010D\u001a\u00020%2\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?2\u0006\u00108\u001a\u00020\n2\u0006\u0010A\u001a\u00020\n2\u0016\u00102\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u0010B\u001a\u00020\n2\u000e\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\bD\u0010EJW\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010F\u001a\u00020\n2\u0006\u0010A\u001a\u00020\n2\u0016\u00102\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u0010B\u001a\u00020\n2\u000e\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\bG\u0010HJm\u0010K\u001a\u00020%2\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?2\u0006\u00108\u001a\u00020\n2\u000e\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010J\u001a\u00020\n2\u0016\u00102\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u0010B\u001a\u00020\n2\u000e\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\bK\u0010LJ\u001f\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u00108\u001a\u00020\nH\u0002¢\u0006\u0004\bM\u0010NJ;\u0010O\u001a\u0004\u0018\u00010\u00072\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00101\u001a\u00020\n2\u0006\u0010)\u001a\u00020\n2\u0006\u00108\u001a\u00020\nH\u0002¢\u0006\u0004\bO\u0010PJ?\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010)\u001a\u00020\n2\u0006\u00108\u001a\u00020\n2\u0006\u0010Q\u001a\u00020;H\u0002¢\u0006\u0004\bR\u0010SJ1\u0010T\u001a\u00020%2\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00101\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nH\u0002¢\u0006\u0004\bT\u0010UJA\u0010V\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010)\u001a\u00020\n2\u0006\u00101\u001a\u00020\n2\u0006\u0010Q\u001a\u00020;H\u0002¢\u0006\u0004\bV\u0010SJ#\u0010Y\u001a\u00020\u00152\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150WH\u0002¢\u0006\u0004\bY\u0010ZJ1\u0010[\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b[\u0010\u001cJ7\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u00108\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nH\u0002¢\u0006\u0004\b\\\u0010]J3\u0010`\u001a\u00020\n2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150W2\u0006\u0010^\u001a\u00020\n2\u0006\u0010_\u001a\u00020;H\u0002¢\u0006\u0004\b`\u0010aJC\u0010c\u001a\u00020\n2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150W2\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010b\u001a\u00020\n2\u0006\u0010_\u001a\u00020;H\u0002¢\u0006\u0004\bc\u0010dJw\u0010h\u001a\u00020\n2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150W2\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010b\u001a\u00020\n2\u0006\u0010e\u001a\u00020\n2\u0006\u0010_\u001a\u00020;2\u0014\u0010g\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060f2\u0014\u00102\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060fH\u0002¢\u0006\u0004\bh\u0010iJG\u0010k\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010)\u001a\u00020\n2\u0006\u00108\u001a\u00020\n2\u0006\u0010R\u001a\u00028\u00002\u0006\u0010j\u001a\u00020;H\u0002¢\u0006\u0004\bk\u0010>J%\u0010m\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060l2\u0006\u00108\u001a\u00020\nH\u0002¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u00020\nH\u0000¢\u0006\u0004\bo\u0010\u000fJ\u0015\u0010p\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\bp\u0010qJ\u0017\u0010r\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00028\u0000H\u0016¢\u0006\u0004\br\u0010sJ\u001d\u0010t\u001a\u00020\u00152\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?H\u0016¢\u0006\u0004\bt\u0010uJ\u001f\u0010r\u001a\u00020%2\u0006\u00108\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00028\u0000H\u0016¢\u0006\u0004\br\u0010vJ%\u0010t\u001a\u00020\u00152\u0006\u00108\u001a\u00020\n2\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?H\u0016¢\u0006\u0004\bt\u0010wJ\u0018\u0010x\u001a\u00028\u00002\u0006\u00108\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\bx\u0010yJ\u0017\u0010z\u001a\u00028\u00002\u0006\u00108\u001a\u00020\nH\u0016¢\u0006\u0004\bz\u0010yJ\u001d\u0010{\u001a\u00020\u00152\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?H\u0016¢\u0006\u0004\b{\u0010uJ!\u0010|\u001a\u00020\u00152\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150W¢\u0006\u0004\b|\u0010ZJ \u0010}\u001a\u00028\u00002\u0006\u00108\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b}\u0010~J\u0019\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u007fH\u0096\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0019\u0010\u0083\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0082\u0001H\u0016¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J \u0010\u0083\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0082\u00012\u0006\u00108\u001a\u00020\nH\u0016¢\u0006\u0005\b\u0083\u0001\u0010nR\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R!\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bM\u0010\u0087\u0001R\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b/\u0010\u0087\u0001R&\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bo\u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u0010\u000f\"\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0019\u0010\u008e\u0001\u001a\u00030\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001e\u0010\u008d\u0001R;\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0011\u0010\u008f\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b\\\u0010\u0087\u0001\u001a\u0005\b\u0090\u0001\u0010!R8\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000f\u0010\u008f\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0006\b\u0091\u0001\u0010\u0087\u0001\u001a\u0005\b\u0092\u0001\u0010!R'\u0010\u0010\u001a\u00020\n2\u0007\u0010\u008f\u0001\u001a\u00020\n8\u0016@RX\u0096\u000e¢\u0006\u000e\n\u0005\bT\u0010\u0088\u0001\u001a\u0005\b\u0093\u0001\u0010\u000f¨\u0006\u0094\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "E", "Lkotlin/collections/AbstractMutableList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "vector", "", "", "vectorRoot", "vectorTail", "", "rootShift", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;[Ljava/lang/Object;[Ljava/lang/Object;I)V", "N", "()I", "size", "rV9", "(I)I", "v", V8ValueTypedArray.PROPERTY_BUFFER, "", "az", "([Ljava/lang/Object;)Z", "HI", "([Ljava/lang/Object;)[Ljava/lang/Object;", "distance", "ck", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "element", "r", "(Ljava/lang/Object;)[Ljava/lang/Object;", "Ik", "()[Ljava/lang/Object;", "root", "filledTail", "newTail", "", "ViF", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)V", "tail", IV8ValueArray.FUNCTION_SHIFT, "nY", "([Ljava/lang/Object;[Ljava/lang/Object;I)[Ljava/lang/Object;", "bufferIndex", "", "sourceIterator", "O", "([Ljava/lang/Object;ILjava/util/Iterator;)[Ljava/lang/Object;", "rootSize", "buffers", "aYN", "([Ljava/lang/Object;I[[Ljava/lang/Object;)[Ljava/lang/Object;", "buffersIterator", "WPU", "([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;", "index", "qie", "([Ljava/lang/Object;ILjava/lang/Object;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;", "elementCarry", "gh", "([Ljava/lang/Object;IILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "", "elements", "rightShift", "nullBuffers", "nextBuffer", "mUb", "(Ljava/util/Collection;II[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "startLeafIndex", "s7N", "(II[[Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "startBuffer", "startBufferSize", "wTp", "(Ljava/util/Collection;I[Ljava/lang/Object;I[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "t", "(I)[Ljava/lang/Object;", "X", "([Ljava/lang/Object;III)Ljava/lang/Object;", "tailCarry", "e", "([Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "S", "([Ljava/lang/Object;II)V", "XQ", "Lkotlin/Function1;", "predicate", "iF", "(Lkotlin/jvm/functions/Function1;)Z", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "o", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "tailSize", "bufferRef", "fD", "(Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)I", "bufferSize", "te", "(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)I", "toBufferSize", "", "recyclableBuffers", "g", "(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;Ljava/util/List;Ljava/util/List;)I", "oldElementCarry", "nHg", "", "ty", "(I)Ljava/util/ListIterator;", "J2", "build", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", l.f62657l, "(Ljava/lang/Object;)Z", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/lang/Object;)V", "(ILjava/util/Collection;)Z", "get", "(I)Ljava/lang/Object;", "removeAt", "removeAll", "E2", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "", V8ValueBuiltInSymbol.PROPERTY_ITERATOR, "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", c.f62177j, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "[Ljava/lang/Object;", "I", "KN", "setRootShift$runtime_release", "(I)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "ownership", "<set-?>", "Uo", "Z", "xMQ", "getSize", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPersistentVectorBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentVectorBuilder.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,995:1\n33#2,5:996\n33#2,5:1001\n33#2,5:1007\n33#2,5:1012\n33#2,5:1017\n1#3:1006\n*S KotlinDebug\n*F\n+ 1 PersistentVectorBuilder.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder\n*L\n242#1:996,5\n243#1:1001,5\n480#1:1007,5\n746#1:1012,5\n769#1:1017,5\n*E\n"})
public final class PersistentVectorBuilder<E> extends AbstractMutableList<E> implements PersistentList.Builder<E> {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private int rootShift;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Object[] vectorTail;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private Object[] tail;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private PersistentList vector;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Object[] root;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private MutabilityOwnership ownership = new MutabilityOwnership();

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Object[] vectorRoot;

    private final void S(Object[] root, int rootSize, int shift) {
        if (shift == 0) {
            this.root = null;
            if (root == null) {
                root = new Object[0];
            }
            this.tail = root;
            this.size = rootSize;
            this.rootShift = shift;
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Intrinsics.checkNotNull(root);
        Object[] objArrXQ = XQ(root, shift, rootSize, objectRef);
        Intrinsics.checkNotNull(objArrXQ);
        Object value = objectRef.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.tail = (Object[]) value;
        this.size = rootSize;
        if (objArrXQ[1] == null) {
            this.root = (Object[]) objArrXQ[0];
            this.rootShift = shift - 5;
        } else {
            this.root = objArrXQ;
            this.rootShift = shift;
        }
    }

    private final boolean az(Object[] buffer) {
        return buffer.length == 33 && buffer[32] == this.ownership;
    }

    private final Object[] o(Object[] root, int index, int shift) {
        if (!(shift >= 0)) {
            PreconditionsKt.n("shift should be positive");
        }
        if (shift == 0) {
            return root;
        }
        int iN = UtilsKt.n(index, shift);
        Object obj = root[iN];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objO = o((Object[]) obj, index, shift - 5);
        if (iN < 31) {
            int i2 = iN + 1;
            if (root[i2] != null) {
                if (az(root)) {
                    ArraysKt.fill(root, (Object) null, i2, 32);
                }
                root = ArraysKt.copyInto(root, Ik(), 0, 0, i2);
            }
        }
        if (objO == root[iN]) {
            return root;
        }
        Object[] objArrHI = HI(root);
        objArrHI[iN] = objO;
        return objArrHI;
    }

    private final int te(Function1 predicate, Object[] buffer, int bufferSize, ObjectRef bufferRef) {
        Object[] objArrHI = buffer;
        int i2 = bufferSize;
        boolean z2 = false;
        for (int i3 = 0; i3 < bufferSize; i3++) {
            Object obj = buffer[i3];
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                if (!z2) {
                    objArrHI = HI(buffer);
                    z2 = true;
                    i2 = i3;
                }
            } else if (z2) {
                objArrHI[i2] = obj;
                i2++;
            }
        }
        bufferRef.rl(objArrHI);
        return i2;
    }

    private final void wTp(Collection elements, int index, Object[] startBuffer, int startBufferSize, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        Object[] objArrIk;
        if (!(nullBuffers >= 1)) {
            PreconditionsKt.n("requires at least one nullBuffer");
        }
        Object[] objArrHI = HI(startBuffer);
        buffers[0] = objArrHI;
        int i2 = index & 31;
        int size = ((index + elements.size()) - 1) & 31;
        int i3 = (startBufferSize - i2) + size;
        if (i3 < 32) {
            ArraysKt.copyInto(objArrHI, nextBuffer, size + 1, i2, startBufferSize);
        } else {
            int i5 = i3 - 31;
            if (nullBuffers == 1) {
                objArrIk = objArrHI;
            } else {
                objArrIk = Ik();
                nullBuffers--;
                buffers[nullBuffers] = objArrIk;
            }
            int i7 = startBufferSize - i5;
            ArraysKt.copyInto(objArrHI, nextBuffer, 0, i7, startBufferSize);
            ArraysKt.copyInto(objArrHI, objArrIk, size + 1, i2, i7);
            nextBuffer = objArrIk;
        }
        Iterator<E> it = elements.iterator();
        O(objArrHI, i2, it);
        for (int i8 = 1; i8 < nullBuffers; i8++) {
            buffers[i8] = O(Ik(), 0, it);
        }
        O(nextBuffer, 0, it);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object element) {
        ((AbstractList) this).modCount++;
        int iV = v();
        if (iV < 32) {
            Object[] objArrHI = HI(this.tail);
            objArrHI[iV] = element;
            this.tail = objArrHI;
            this.size = size() + 1;
        } else {
            ViF(this.root, this.tail, r(element));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iV = v();
        Iterator<E> it = elements.iterator();
        if (32 - iV >= elements.size()) {
            this.tail = O(HI(this.tail), iV, it);
            this.size = size() + elements.size();
        } else {
            int size = ((elements.size() + iV) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = O(HI(this.tail), iV, it);
            for (int i2 = 1; i2 < size; i2++) {
                objArr[i2] = O(Ik(), 0, it);
            }
            this.root = aYN(this.root, N(), objArr);
            this.tail = O(Ik(), 0, it);
            this.size = size() + elements.size();
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    private final Object[] HI(Object[] buffer) {
        return buffer == null ? Ik() : az(buffer) ? buffer : ArraysKt.copyInto$default(buffer, Ik(), 0, 0, RangesKt.coerceAtMost(buffer.length, 32), 6, (Object) null);
    }

    private final Object[] Ik() {
        Object[] objArr = new Object[33];
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] O(Object[] buffer, int bufferIndex, Iterator sourceIterator) {
        while (bufferIndex < 32 && sourceIterator.hasNext()) {
            buffer[bufferIndex] = sourceIterator.next();
            bufferIndex++;
        }
        return buffer;
    }

    private final Object[] T(Object[] root, int size) {
        if (!((size & 31) == 0)) {
            PreconditionsKt.n("invalid size");
        }
        if (size == 0) {
            this.rootShift = 0;
            return null;
        }
        int i2 = size - 1;
        while (true) {
            int i3 = this.rootShift;
            if ((i2 >> i3) != 0) {
                return o(root, i2, i3);
            }
            this.rootShift = i3 - 5;
            Object[] objArr = root[0];
            Intrinsics.checkNotNull(objArr, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            root = objArr;
        }
    }

    private final Object[] XQ(Object[] root, int shift, int rootSize, ObjectRef tailCarry) {
        Object[] objArrXQ;
        int iN = UtilsKt.n(rootSize - 1, shift);
        if (shift == 5) {
            tailCarry.rl(root[iN]);
            objArrXQ = null;
        } else {
            Object obj = root[iN];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrXQ = XQ((Object[]) obj, shift - 5, rootSize, tailCarry);
        }
        if (objArrXQ == null && iN == 0) {
            return null;
        }
        Object[] objArrHI = HI(root);
        objArrHI[iN] = objArrXQ;
        return objArrHI;
    }

    private final int fD(Function1 predicate, int tailSize, ObjectRef bufferRef) {
        int iTe = te(predicate, this.tail, tailSize, bufferRef);
        if (iTe == tailSize) {
            CommonFunctionsKt.n(bufferRef.getValue() == this.tail);
            return tailSize;
        }
        Object value = bufferRef.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        ArraysKt.fill(objArr, (Object) null, iTe, tailSize);
        this.tail = objArr;
        this.size = size() - (tailSize - iTe);
        return iTe;
    }

    private final void mUb(Collection elements, int index, int rightShift, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        Object[] objArr;
        if (this.root == null) {
            throw new IllegalStateException("root is null");
        }
        int i2 = index >> 5;
        Object[] objArrS7N = s7N(i2, rightShift, buffers, nullBuffers, nextBuffer);
        int iN = nullBuffers - (((N() >> 5) - 1) - i2);
        if (iN < nullBuffers) {
            Object[] objArr2 = buffers[iN];
            Intrinsics.checkNotNull(objArr2);
            objArr = objArr2;
        } else {
            objArr = nextBuffer;
        }
        wTp(elements, index, objArrS7N, 32, buffers, iN, objArr);
    }

    private final Object[] r(Object element) {
        Object[] objArr = new Object[33];
        objArr[0] = element;
        objArr[32] = this.ownership;
        return objArr;
    }

    private final int rV9(int size) {
        return size <= 32 ? size : size - UtilsKt.nr(size);
    }

    private final Object[] s7N(int startLeafIndex, int rightShift, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        if (this.root == null) {
            throw new IllegalStateException("root is null");
        }
        ListIterator listIteratorTy = ty(N() >> 5);
        while (listIteratorTy.previousIndex() != startLeafIndex) {
            Object[] objArr = (Object[]) listIteratorTy.previous();
            ArraysKt.copyInto(objArr, nextBuffer, 0, 32 - rightShift, 32);
            nextBuffer = ck(objArr, rightShift);
            nullBuffers--;
            buffers[nullBuffers] = nextBuffer;
        }
        return (Object[]) listIteratorTy.previous();
    }

    private final ListIterator ty(int index) {
        Object[] objArr = this.root;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iN = N() >> 5;
        ListImplementation.rl(index, iN);
        int i2 = this.rootShift;
        return i2 == 0 ? new SingleElementListIterator(objArr, index) : new TrieIterator(objArr, index, iN, i2 / 5);
    }

    public final int J2() {
        return ((AbstractList) this).modCount;
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final int getRootShift() {
        return this.rootShift;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final Object[] getRoot() {
        return this.root;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder
    public PersistentList build() {
        PersistentList persistentVector;
        if (this.root == this.vectorRoot && this.tail == this.vectorTail) {
            persistentVector = this.vector;
        } else {
            this.ownership = new MutabilityOwnership();
            Object[] objArr = this.root;
            this.vectorRoot = objArr;
            Object[] objArr2 = this.tail;
            this.vectorTail = objArr2;
            if (objArr != null) {
                Object[] objArr3 = this.root;
                Intrinsics.checkNotNull(objArr3);
                persistentVector = new PersistentVector(objArr3, this.tail, size(), this.rootShift);
            } else if (objArr2.length == 0) {
                persistentVector = UtilsKt.rl();
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(this.tail, size());
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                persistentVector = new SmallPersistentVector(objArrCopyOf);
            }
        }
        this.vector = persistentVector;
        return persistentVector;
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.size;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int index) {
        ListImplementation.rl(index, size());
        return new PersistentVectorMutableIterator(this, index);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(final Collection elements) {
        return E2(new Function1<E, Boolean>() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder.removeAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(elements.contains(obj));
            }
        });
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final Object[] getTail() {
        return this.tail;
    }

    public PersistentVectorBuilder(PersistentList persistentList, Object[] objArr, Object[] objArr2, int i2) {
        this.vector = persistentList;
        this.vectorRoot = objArr;
        this.vectorTail = objArr2;
        this.rootShift = i2;
        this.root = this.vectorRoot;
        this.tail = this.vectorTail;
        this.size = this.vector.size();
    }

    private final int N() {
        if (size() <= 32) {
            return 0;
        }
        return UtilsKt.nr(size());
    }

    private final void ViF(Object[] root, Object[] filledTail, Object[] newTail) {
        int size = size() >> 5;
        int i2 = this.rootShift;
        if (size > (1 << i2)) {
            this.root = nY(r(root), filledTail, this.rootShift + 5);
            this.tail = newTail;
            this.rootShift += 5;
            this.size = size() + 1;
            return;
        }
        if (root == null) {
            this.root = filledTail;
            this.tail = newTail;
            this.size = size() + 1;
        } else {
            this.root = nY(root, filledTail, i2);
            this.tail = newTail;
            this.size = size() + 1;
        }
    }

    private final Object[] WPU(Object[] root, int rootSize, int shift, Iterator buffersIterator) {
        boolean z2;
        if (!buffersIterator.hasNext()) {
            PreconditionsKt.n("invalid buffersIterator");
        }
        if (shift >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            PreconditionsKt.n("negative shift");
        }
        if (shift == 0) {
            return (Object[]) buffersIterator.next();
        }
        Object[] objArrHI = HI(root);
        int iN = UtilsKt.n(rootSize, shift);
        int i2 = shift - 5;
        objArrHI[iN] = WPU((Object[]) objArrHI[iN], rootSize, i2, buffersIterator);
        while (true) {
            iN++;
            if (iN >= 32 || !buffersIterator.hasNext()) {
                break;
            }
            objArrHI[iN] = WPU((Object[]) objArrHI[iN], 0, i2, buffersIterator);
        }
        return objArrHI;
    }

    private final Object X(Object[] root, int rootSize, int shift, int index) {
        boolean z2;
        int size = size() - rootSize;
        if (index < size) {
            z2 = true;
        } else {
            z2 = false;
        }
        CommonFunctionsKt.n(z2);
        if (size == 1) {
            Object obj = this.tail[0];
            S(root, rootSize, shift);
            return obj;
        }
        Object[] objArr = this.tail;
        Object obj2 = objArr[index];
        Object[] objArrCopyInto = ArraysKt.copyInto(objArr, HI(objArr), index, index + 1, size);
        objArrCopyInto[size - 1] = null;
        this.root = root;
        this.tail = objArrCopyInto;
        this.size = (rootSize + size) - 1;
        this.rootShift = shift;
        return obj2;
    }

    private final Object[] aYN(Object[] root, int rootSize, Object[][] buffers) {
        Object[] objArrHI;
        Iterator it = ArrayIteratorKt.iterator(buffers);
        int i2 = rootSize >> 5;
        int i3 = this.rootShift;
        if (i2 < (1 << i3)) {
            objArrHI = WPU(root, rootSize, i3, it);
        } else {
            objArrHI = HI(root);
        }
        while (it.hasNext()) {
            this.rootShift += 5;
            objArrHI = r(objArrHI);
            int i5 = this.rootShift;
            WPU(objArrHI, 1 << i5, i5, it);
        }
        return objArrHI;
    }

    private final Object[] ck(Object[] buffer, int distance) {
        if (az(buffer)) {
            return ArraysKt.copyInto(buffer, buffer, distance, 0, 32 - distance);
        }
        return ArraysKt.copyInto(buffer, Ik(), distance, 0, 32 - distance);
    }

    private final Object[] e(Object[] root, int shift, int index, ObjectRef tailCarry) {
        int iN = UtilsKt.n(index, shift);
        int iN2 = 31;
        if (shift == 0) {
            Object obj = root[iN];
            Object[] objArrCopyInto = ArraysKt.copyInto(root, HI(root), iN, iN + 1, 32);
            objArrCopyInto[31] = tailCarry.getValue();
            tailCarry.rl(obj);
            return objArrCopyInto;
        }
        if (root[31] == null) {
            iN2 = UtilsKt.n(N() - 1, shift);
        }
        Object[] objArrHI = HI(root);
        int i2 = shift - 5;
        int i3 = iN + 1;
        if (i3 <= iN2) {
            while (true) {
                Object obj2 = objArrHI[iN2];
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrHI[iN2] = e((Object[]) obj2, i2, 0, tailCarry);
                if (iN2 == i3) {
                    break;
                }
                iN2--;
            }
        }
        Object obj3 = objArrHI[iN];
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrHI[iN] = e((Object[]) obj3, i2, index, tailCarry);
        return objArrHI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int g(Function1 predicate, Object[] buffer, int bufferSize, int toBufferSize, ObjectRef bufferRef, List recyclableBuffers, List buffers) {
        Object[] objArrIk;
        if (az(buffer)) {
            recyclableBuffers.add(buffer);
        }
        Object value = bufferRef.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        Object[] objArr2 = objArr;
        for (int i2 = 0; i2 < bufferSize; i2++) {
            Object obj = buffer[i2];
            if (!((Boolean) predicate.invoke(obj)).booleanValue()) {
                if (toBufferSize == 32) {
                    if (!recyclableBuffers.isEmpty()) {
                        objArrIk = (Object[]) recyclableBuffers.remove(recyclableBuffers.size() - 1);
                    } else {
                        objArrIk = Ik();
                    }
                    objArr2 = objArrIk;
                    toBufferSize = 0;
                }
                objArr2[toBufferSize] = obj;
                toBufferSize++;
            }
        }
        bufferRef.rl(objArr2);
        if (objArr != bufferRef.getValue()) {
            buffers.add(objArr);
        }
        return toBufferSize;
    }

    private final Object[] gh(Object[] root, int shift, int index, Object element, ObjectRef elementCarry) {
        Object obj;
        int iN = UtilsKt.n(index, shift);
        if (shift == 0) {
            elementCarry.rl(root[31]);
            Object[] objArrCopyInto = ArraysKt.copyInto(root, HI(root), iN + 1, iN, 31);
            objArrCopyInto[iN] = element;
            return objArrCopyInto;
        }
        Object[] objArrHI = HI(root);
        int i2 = shift - 5;
        Object obj2 = objArrHI[iN];
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrHI[iN] = gh((Object[]) obj2, i2, index, element, elementCarry);
        while (true) {
            iN++;
            if (iN >= 32 || (obj = objArrHI[iN]) == null) {
                break;
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrHI[iN] = gh((Object[]) obj, i2, 0, elementCarry.getValue(), elementCarry);
        }
        return objArrHI;
    }

    private final boolean iF(Function1 predicate) {
        Object[] objArrWPU;
        int iV = v();
        ObjectRef objectRef = new ObjectRef(null);
        if (this.root == null) {
            if (fD(predicate, iV, objectRef) == iV) {
                return false;
            }
            return true;
        }
        ListIterator listIteratorTy = ty(0);
        int iTe = 32;
        while (iTe == 32 && listIteratorTy.hasNext()) {
            iTe = te(predicate, (Object[]) listIteratorTy.next(), 32, objectRef);
        }
        if (iTe == 32) {
            CommonFunctionsKt.n(!listIteratorTy.hasNext());
            int iFD = fD(predicate, iV, objectRef);
            if (iFD == 0) {
                S(this.root, size(), this.rootShift);
            }
            if (iFD == iV) {
                return false;
            }
            return true;
        }
        int iPreviousIndex = listIteratorTy.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iG = iTe;
        while (listIteratorTy.hasNext()) {
            iG = g(predicate, (Object[]) listIteratorTy.next(), 32, iG, objectRef, arrayList2, arrayList);
        }
        int iG2 = g(predicate, this.tail, iV, iG, objectRef, arrayList2, arrayList);
        Object value = objectRef.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        ArraysKt.fill(objArr, (Object) null, iG2, 32);
        if (arrayList.isEmpty()) {
            objArrWPU = this.root;
            Intrinsics.checkNotNull(objArrWPU);
        } else {
            objArrWPU = WPU(this.root, iPreviousIndex, this.rootShift, arrayList.iterator());
        }
        int size = iPreviousIndex + (arrayList.size() << 5);
        this.root = T(objArrWPU, size);
        this.tail = objArr;
        this.size = size + iG2;
        return true;
    }

    private final Object[] nHg(Object[] root, int shift, int index, Object e2, ObjectRef oldElementCarry) {
        int iN = UtilsKt.n(index, shift);
        Object[] objArrHI = HI(root);
        if (shift == 0) {
            if (objArrHI != root) {
                ((AbstractList) this).modCount++;
            }
            oldElementCarry.rl(objArrHI[iN]);
            objArrHI[iN] = e2;
            return objArrHI;
        }
        Object obj = objArrHI[iN];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrHI[iN] = nHg((Object[]) obj, shift - 5, index, e2, oldElementCarry);
        return objArrHI;
    }

    private final Object[] nY(Object[] root, Object[] tail, int shift) {
        int iN = UtilsKt.n(size() - 1, shift);
        Object[] objArrHI = HI(root);
        if (shift == 5) {
            objArrHI[iN] = tail;
            return objArrHI;
        }
        objArrHI[iN] = nY((Object[]) objArrHI[iN], tail, shift - 5);
        return objArrHI;
    }

    private final void qie(Object[] root, int index, Object element) {
        int iV = v();
        Object[] objArrHI = HI(this.tail);
        if (iV < 32) {
            ArraysKt.copyInto(this.tail, objArrHI, index + 1, index, iV);
            objArrHI[index] = element;
            this.root = root;
            this.tail = objArrHI;
            this.size = size() + 1;
            return;
        }
        Object[] objArr = this.tail;
        Object obj = objArr[31];
        ArraysKt.copyInto(objArr, objArrHI, index + 1, index, 31);
        objArrHI[index] = element;
        ViF(root, objArrHI, r(obj));
    }

    private final Object[] t(int index) {
        if (N() <= index) {
            return this.tail;
        }
        Object[] objArr = this.root;
        Intrinsics.checkNotNull(objArr);
        for (int i2 = this.rootShift; i2 > 0; i2 -= 5) {
            Object[] objArr2 = objArr[UtilsKt.n(index, i2)];
            Intrinsics.checkNotNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final int v() {
        return rV9(size());
    }

    public final boolean E2(Function1 predicate) {
        boolean zIF = iF(predicate);
        if (zIF) {
            ((AbstractList) this).modCount++;
        }
        return zIF;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int index) {
        ListImplementation.n(index, size());
        return t(index)[index & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator();
    }

    @Override // kotlin.collections.AbstractMutableList
    public Object removeAt(int index) {
        ListImplementation.n(index, size());
        ((AbstractList) this).modCount++;
        int iN = N();
        if (index >= iN) {
            return X(this.root, iN, this.rootShift, index - iN);
        }
        ObjectRef objectRef = new ObjectRef(this.tail[0]);
        Object[] objArr = this.root;
        Intrinsics.checkNotNull(objArr);
        X(e(objArr, this.rootShift, index, objectRef), iN, this.rootShift, 0);
        return objectRef.getValue();
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public Object set(int index, Object element) {
        ListImplementation.n(index, size());
        if (N() <= index) {
            Object[] objArrHI = HI(this.tail);
            if (objArrHI != this.tail) {
                ((AbstractList) this).modCount++;
            }
            int i2 = index & 31;
            Object obj = objArrHI[i2];
            objArrHI[i2] = element;
            this.tail = objArrHI;
            return obj;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] objArr = this.root;
        Intrinsics.checkNotNull(objArr);
        this.root = nHg(objArr, this.rootShift, index, element, objectRef);
        return objectRef.getValue();
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int index, Object element) {
        ListImplementation.rl(index, size());
        if (index == size()) {
            add(element);
            return;
        }
        ((AbstractList) this).modCount++;
        int iN = N();
        if (index >= iN) {
            qie(this.root, index - iN, element);
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] objArr = this.root;
        Intrinsics.checkNotNull(objArr);
        qie(gh(objArr, this.rootShift, index, element, objectRef), 0, objectRef.getValue());
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection elements) {
        PersistentVectorBuilder<E> persistentVectorBuilder;
        Collection collection;
        Object[] objArrCopyInto;
        Object[][] objArr;
        ListImplementation.rl(index, size());
        if (index == size()) {
            return addAll(elements);
        }
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (index >> 5) << 5;
        int size = (((size() - i2) + elements.size()) - 1) / 32;
        if (size == 0) {
            CommonFunctionsKt.n(index >= N());
            int i3 = index & 31;
            int size2 = ((index + elements.size()) - 1) & 31;
            Object[] objArr2 = this.tail;
            Object[] objArrCopyInto2 = ArraysKt.copyInto(objArr2, HI(objArr2), size2 + 1, i3, v());
            O(objArrCopyInto2, i3, elements.iterator());
            this.tail = objArrCopyInto2;
            this.size = size() + elements.size();
            return true;
        }
        Object[][] objArr3 = new Object[size][];
        int iV = v();
        int iRV9 = rV9(size() + elements.size());
        if (index >= N()) {
            objArrCopyInto = Ik();
            objArr = objArr3;
            persistentVectorBuilder = this;
            collection = elements;
            persistentVectorBuilder.wTp(collection, index, this.tail, iV, objArr, size, objArrCopyInto);
        } else {
            persistentVectorBuilder = this;
            collection = elements;
            if (iRV9 > iV) {
                int i5 = iRV9 - iV;
                Object[] objArrCk = ck(persistentVectorBuilder.tail, i5);
                persistentVectorBuilder.mUb(collection, index, i5, objArr3, size, objArrCk);
                objArr = objArr3;
                objArrCopyInto = objArrCk;
            } else {
                int i7 = iV - iRV9;
                objArrCopyInto = ArraysKt.copyInto(persistentVectorBuilder.tail, Ik(), 0, i7, iV);
                int i8 = 32 - i7;
                Object[] objArrCk2 = ck(persistentVectorBuilder.tail, i8);
                int i9 = size - 1;
                objArr3[i9] = objArrCk2;
                persistentVectorBuilder.mUb(collection, index, i8, objArr3, i9, objArrCk2);
                collection = collection;
                objArr = objArr3;
                persistentVectorBuilder = persistentVectorBuilder;
            }
        }
        persistentVectorBuilder.root = aYN(persistentVectorBuilder.root, i2, objArr);
        persistentVectorBuilder.tail = objArrCopyInto;
        persistentVectorBuilder.size = size() + collection.size();
        return true;
    }
}
