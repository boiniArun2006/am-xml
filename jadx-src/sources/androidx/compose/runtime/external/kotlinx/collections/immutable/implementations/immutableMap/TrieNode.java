package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.PreconditionsKt;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b.\b\u0000\u0018\u0000 _*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0004\u0085\u0001\u0086\u0001B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB)\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007¢\u0006\u0004\b\u000b\u0010\rJ\u001b\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00028\u00012\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J3\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ;\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001f\u0010 J+\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b!\u0010\"J?\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00028\u00012\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\b%\u0010&J?\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\b)\u0010*J?\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b+\u0010,J-\u0010-\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b-\u0010.J5\u0010/\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b/\u00100JQ\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00072\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00028\u00002\u0006\u00103\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b5\u00106JK\u00107\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00028\u00002\u0006\u00103\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u0004H\u0002¢\u0006\u0004\b7\u00108JS\u00109\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00028\u00002\u0006\u00103\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b9\u0010:J]\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010;\u001a\u00020\u00042\u0006\u0010<\u001a\u00028\u00002\u0006\u0010=\u001a\u00028\u00012\u0006\u0010>\u001a\u00020\u00042\u0006\u0010?\u001a\u00028\u00002\u0006\u0010@\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\bA\u0010BJ-\u0010C\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\bC\u0010.JA\u0010D\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\bD\u0010EJ%\u0010G\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010F\u001a\u00020\u0004H\u0002¢\u0006\u0004\bG\u0010HJ9\u0010I\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010F\u001a\u00020\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0004\bK\u0010LJ\u0019\u0010M\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0004\bM\u0010NJ-\u0010O\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e2\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0001H\u0002¢\u0006\u0004\bO\u0010PJ?\u0010Q\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\bQ\u0010RJ%\u0010S\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0004\bS\u0010TJ9\u0010U\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00028\u00002\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\bU\u0010VJA\u0010W\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\bW\u0010RJ?\u0010[\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010Z\u001a\u00020Y2\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b[\u0010\\J[\u0010]\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020Y2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020\u0004H\u0002¢\u0006\u0004\b_\u0010`J#\u0010a\u001a\u00020\u00132\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\ba\u0010bJW\u0010d\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\bd\u0010eJ_\u0010f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020\u0004H\u0000¢\u0006\u0004\bh\u0010`J\u0017\u0010i\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\bi\u0010\u0015J\u0017\u0010j\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\bj\u0010kJ\u0017\u0010l\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\bl\u0010kJ#\u0010m\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010'\u001a\u00020\u0004H\u0000¢\u0006\u0004\bm\u0010HJ%\u0010o\u001a\u00020\u00132\u0006\u0010n\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u00104\u001a\u00020\u0004¢\u0006\u0004\bo\u0010pJ'\u0010q\u001a\u0004\u0018\u00018\u00012\u0006\u0010n\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u00104\u001a\u00020\u0004¢\u0006\u0004\bq\u0010rJQ\u0010s\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u00104\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020Y2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#¢\u0006\u0004\bs\u0010tJ;\u0010u\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e2\u0006\u0010n\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u0004¢\u0006\u0004\bu\u0010vJM\u0010w\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010n\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#¢\u0006\u0004\bw\u0010xJ3\u0010y\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010n\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u00104\u001a\u00020\u0004¢\u0006\u0004\by\u0010zJG\u0010{\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010n\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u00104\u001a\u00020\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#¢\u0006\u0004\b{\u0010|JO\u0010}\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010n\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#¢\u0006\u0004\b}\u0010xR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u007fR\u0017\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010\u0080\u0001R8\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00072\u000f\u0010\u0081\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00078\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0005\b5\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001¨\u0006\u0087\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "K", "V", "", "", "dataMap", "nodeMap", "", V8ValueTypedArray.PROPERTY_BUFFER, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "ownedBy", "<init>", "(II[Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "(II[Ljava/lang/Object;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "rl", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "t", "positionMask", "", "r", "(I)Z", "keyIndex", "Z", "(I)Ljava/lang/Object;", "E", "key", "value", "o", "(ILjava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "owner", "te", "(ILjava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "eF", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "mutator", "v", "(ILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "nodeIndex", "newNode", "p5", "(IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "wTp", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "P5", "(II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "nHg", "(IILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "newKeyHash", "newKey", "newValue", IV8ValueArray.FUNCTION_SHIFT, "nr", "(IIILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)[Ljava/lang/Object;", "S", "(IIILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "iF", "(IIILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "keyHash1", "key1", "value1", "keyHash2", "key2", "value2", "XQ", "(ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "U", "N", "(IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", CmcdData.OBJECT_TYPE_INIT_SEGMENT, "mUb", "(I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "g", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "J2", "(Ljava/lang/Object;)Z", "Uo", "(Ljava/lang/Object;)Ljava/lang/Object;", "KN", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "WPU", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "xMQ", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "ViF", "(Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "nY", "otherNode", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;", "intersectionCounter", "aYN", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "e", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "O", "()I", "qie", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;)Z", "targetNode", "M7", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "s7N", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "az", "Ik", "ty", "(I)I", "bzg", "rV9", "keyHash", "gh", "(ILjava/lang/Object;I)Z", "HI", "(ILjava/lang/Object;I)Ljava/lang/Object;", "E2", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "Xw", "(ILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "fD", "(ILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "jB", "(ILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "X", "(ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, c.f62177j, "I", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "<set-?>", "[Ljava/lang/Object;", "ck", "()[Ljava/lang/Object;", "Companion", "ModificationResult", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode\n+ 2 ForEachOneBit.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ForEachOneBitKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 4 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,899:1\n10#2,9:900\n10#2,9:914\n10#2,9:923\n57#3,5:909\n84#4:932\n1#5:933\n*S KotlinDebug\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode\n*L\n630#1:900,9\n648#1:914,9\n652#1:923,9\n640#1:909,5\n700#1:932\n700#1:933\n*E\n"})
public final class TrieNode<K, V> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int dataMap;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private Object[] buffer;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private int nodeMap;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutabilityOwnership ownedBy;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int J2 = 8;
    private static final TrieNode Uo = new TrieNode(0, 0, new Object[0]);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", c.f62177j, "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TrieNode n() {
            return TrieNode.Uo;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR.\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "K", "V", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "node", "", "sizeDelta", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;I)V", c.f62177j, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "t", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;)V", "rl", "I", "()I", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,899:1\n1#2:900\n*E\n"})
    public static final class ModificationResult<K, V> {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private TrieNode node;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private final int sizeDelta;

        /* JADX INFO: renamed from: n, reason: from getter */
        public final TrieNode getNode() {
            return this.node;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final int getSizeDelta() {
            return this.sizeDelta;
        }

        public final void t(TrieNode trieNode) {
            this.node = trieNode;
        }

        public ModificationResult(TrieNode trieNode, int i2) {
            this.node = trieNode;
            this.sizeDelta = i2;
        }
    }

    public TrieNode(int i2, int i3, Object[] objArr, MutabilityOwnership mutabilityOwnership) {
        this.dataMap = i2;
        this.nodeMap = i3;
        this.ownedBy = mutabilityOwnership;
        this.buffer = objArr;
    }

    private final TrieNode S(int keyIndex, int positionMask, int newKeyHash, Object newKey, Object newValue, int shift) {
        return new TrieNode(this.dataMap ^ positionMask, this.nodeMap | positionMask, nr(keyIndex, positionMask, newKeyHash, newKey, newValue, shift, null));
    }

    private final boolean qie(TrieNode otherNode) {
        if (this == otherNode) {
            return true;
        }
        if (this.nodeMap != otherNode.nodeMap || this.dataMap != otherNode.dataMap) {
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

    public final Object HI(int keyHash, Object key, int shift) {
        int iJ2 = 1 << TrieNodeKt.J2(keyHash, shift);
        if (Ik(iJ2)) {
            int iTy = ty(iJ2);
            if (Intrinsics.areEqual(key, Z(iTy))) {
                return E(iTy);
            }
            return null;
        }
        if (!r(iJ2)) {
            return null;
        }
        TrieNode trieNodeRV9 = rV9(bzg(iJ2));
        return shift == 30 ? trieNodeRV9.Uo(key) : trieNodeRV9.HI(keyHash, key, shift + 5);
    }

    public final TrieNode T(int keyHash, Object key, Object value, int shift, PersistentHashMapBuilder mutator) {
        int iJ2 = 1 << TrieNodeKt.J2(keyHash, shift);
        if (Ik(iJ2)) {
            int iTy = ty(iJ2);
            if (Intrinsics.areEqual(key, Z(iTy)) && Intrinsics.areEqual(value, E(iTy))) {
                return N(iTy, iJ2, mutator);
            }
        } else if (r(iJ2)) {
            int iBzg = bzg(iJ2);
            TrieNode trieNodeRV9 = rV9(iBzg);
            return s7N(trieNodeRV9, shift == 30 ? trieNodeRV9.nY(key, value, mutator) : trieNodeRV9.T(keyHash, key, value, shift + 5, mutator), iBzg, iJ2, mutator.getOwnership());
        }
        return this;
    }

    public final TrieNode X(int keyHash, Object key, int shift, PersistentHashMapBuilder mutator) {
        int iJ2 = 1 << TrieNodeKt.J2(keyHash, shift);
        if (Ik(iJ2)) {
            int iTy = ty(iJ2);
            if (Intrinsics.areEqual(key, Z(iTy))) {
                return N(iTy, iJ2, mutator);
            }
        } else if (r(iJ2)) {
            int iBzg = bzg(iJ2);
            TrieNode trieNodeRV9 = rV9(iBzg);
            return s7N(trieNodeRV9, shift == 30 ? trieNodeRV9.ViF(key, mutator) : trieNodeRV9.X(keyHash, key, shift + 5, mutator), iBzg, iJ2, mutator.getOwnership());
        }
        return this;
    }

    public final ModificationResult Xw(int keyHash, Object key, Object value, int shift) {
        ModificationResult modificationResultXw;
        int iJ2 = 1 << TrieNodeKt.J2(keyHash, shift);
        if (Ik(iJ2)) {
            int iTy = ty(iJ2);
            if (!Intrinsics.areEqual(key, Z(iTy))) {
                return S(iTy, iJ2, keyHash, key, value, shift).rl();
            }
            if (E(iTy) == value) {
                return null;
            }
            return eF(iTy, value).t();
        }
        if (!r(iJ2)) {
            return o(iJ2, key, value).rl();
        }
        int iBzg = bzg(iJ2);
        TrieNode trieNodeRV9 = rV9(iBzg);
        if (shift == 30) {
            modificationResultXw = trieNodeRV9.KN(key, value);
            if (modificationResultXw == null) {
                return null;
            }
        } else {
            modificationResultXw = trieNodeRV9.Xw(keyHash, key, value, shift + 5);
            if (modificationResultXw == null) {
                return null;
            }
        }
        modificationResultXw.t(p5(iBzg, iJ2, modificationResultXw.getNode()));
        return modificationResultXw;
    }

    public final boolean gh(int keyHash, Object key, int shift) {
        int iJ2 = 1 << TrieNodeKt.J2(keyHash, shift);
        if (Ik(iJ2)) {
            return Intrinsics.areEqual(key, Z(ty(iJ2)));
        }
        if (!r(iJ2)) {
            return false;
        }
        TrieNode trieNodeRV9 = rV9(bzg(iJ2));
        return shift == 30 ? trieNodeRV9.J2(key) : trieNodeRV9.gh(keyHash, key, shift + 5);
    }

    public final TrieNode jB(int keyHash, Object key, int shift) {
        int iJ2 = 1 << TrieNodeKt.J2(keyHash, shift);
        if (Ik(iJ2)) {
            int iTy = ty(iJ2);
            if (Intrinsics.areEqual(key, Z(iTy))) {
                return U(iTy, iJ2);
            }
        } else if (r(iJ2)) {
            int iBzg = bzg(iJ2);
            TrieNode trieNodeRV9 = rV9(iBzg);
            return M7(trieNodeRV9, shift == 30 ? trieNodeRV9.xMQ(key) : trieNodeRV9.jB(keyHash, key, shift + 5), iBzg, iJ2);
        }
        return this;
    }

    private final Object E(int keyIndex) {
        return this.buffer[keyIndex + 1];
    }

    private final boolean J2(Object key) {
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!Intrinsics.areEqual(key, this.buffer[first])) {
                if (first != last) {
                    first += step;
                }
            }
            return true;
        }
        return false;
    }

    private final ModificationResult KN(Object key, Object value) {
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!Intrinsics.areEqual(key, Z(first))) {
                if (first != last) {
                    first += step;
                }
            }
            if (value == E(first)) {
                return null;
            }
            Object[] objArr = this.buffer;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[first + 1] = value;
            return new TrieNode(0, 0, objArrCopyOf).t();
        }
        return new TrieNode(0, 0, TrieNodeKt.Uo(this.buffer, 0, key, value)).rl();
    }

    private final TrieNode M7(TrieNode targetNode, TrieNode newNode, int nodeIndex, int positionMask) {
        return newNode == null ? P5(nodeIndex, positionMask) : targetNode != newNode ? p5(nodeIndex, positionMask, newNode) : this;
    }

    private final int O() {
        if (this.nodeMap == 0) {
            return this.buffer.length / 2;
        }
        int iBitCount = Integer.bitCount(this.dataMap);
        int length = this.buffer.length;
        for (int i2 = iBitCount * 2; i2 < length; i2++) {
            iBitCount += rV9(i2).O();
        }
        return iBitCount;
    }

    private final TrieNode P5(int nodeIndex, int positionMask) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        return new TrieNode(this.dataMap, positionMask ^ this.nodeMap, TrieNodeKt.xMQ(objArr, nodeIndex));
    }

    private final TrieNode U(int keyIndex, int positionMask) {
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        return new TrieNode(positionMask ^ this.dataMap, this.nodeMap, TrieNodeKt.KN(objArr, keyIndex));
    }

    private final Object Uo(Object key) {
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
            return null;
        }
        while (!Intrinsics.areEqual(key, Z(first))) {
            if (first == last) {
                return null;
            }
            first += step;
        }
        return E(first);
    }

    private final TrieNode ViF(Object key, PersistentHashMapBuilder mutator) {
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!Intrinsics.areEqual(key, Z(first))) {
                if (first != last) {
                    first += step;
                }
            }
            return g(first, mutator);
        }
        return this;
    }

    private final TrieNode WPU(Object key, Object value, PersistentHashMapBuilder mutator) {
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!Intrinsics.areEqual(key, Z(first))) {
                if (first != last) {
                    first += step;
                }
            }
            mutator.xMQ(E(first));
            if (this.ownedBy == mutator.getOwnership()) {
                this.buffer[first + 1] = value;
                return this;
            }
            mutator.KN(mutator.getModCount() + 1);
            Object[] objArr = this.buffer;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[first + 1] = value;
            return new TrieNode(0, 0, objArrCopyOf, mutator.getOwnership());
        }
        mutator.gh(mutator.size() + 1);
        return new TrieNode(0, 0, TrieNodeKt.Uo(this.buffer, 0, key, value), mutator.getOwnership());
    }

    private final TrieNode XQ(int keyHash1, Object key1, Object value1, int keyHash2, Object key2, Object value2, int shift, MutabilityOwnership owner) {
        if (shift > 30) {
            return new TrieNode(0, 0, new Object[]{key1, value1, key2, value2}, owner);
        }
        int iJ2 = TrieNodeKt.J2(keyHash1, shift);
        int iJ22 = TrieNodeKt.J2(keyHash2, shift);
        if (iJ2 != iJ22) {
            return new TrieNode((1 << iJ2) | (1 << iJ22), 0, iJ2 < iJ22 ? new Object[]{key1, value1, key2, value2} : new Object[]{key2, value2, key1, value1}, owner);
        }
        return new TrieNode(0, 1 << iJ2, new Object[]{XQ(keyHash1, key1, value1, keyHash2, key2, value2, shift + 5, owner)}, owner);
    }

    private final Object Z(int keyIndex) {
        return this.buffer[keyIndex];
    }

    private final TrieNode aYN(TrieNode otherNode, DeltaCounter intersectionCounter, MutabilityOwnership owner) {
        CommonFunctionsKt.n(this.nodeMap == 0);
        CommonFunctionsKt.n(this.dataMap == 0);
        CommonFunctionsKt.n(otherNode.nodeMap == 0);
        CommonFunctionsKt.n(otherNode.dataMap == 0);
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + otherNode.buffer.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        int length = this.buffer.length;
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, otherNode.buffer.length), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                if (J2(otherNode.buffer[first])) {
                    intersectionCounter.t(intersectionCounter.getCount() + 1);
                } else {
                    Object[] objArr2 = otherNode.buffer;
                    objArrCopyOf[length] = objArr2[first];
                    objArrCopyOf[length + 1] = objArr2[first + 1];
                    length += 2;
                }
                if (first == last) {
                    break;
                }
                first += step;
            }
        }
        if (length == this.buffer.length) {
            return this;
        }
        if (length == otherNode.buffer.length) {
            return otherNode;
        }
        if (length == objArrCopyOf.length) {
            return new TrieNode(0, 0, objArrCopyOf, owner);
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
        return new TrieNode(0, 0, objArrCopyOf2, owner);
    }

    private final TrieNode e(TrieNode otherNode, int positionMask, int shift, DeltaCounter intersectionCounter, PersistentHashMapBuilder mutator) {
        if (r(positionMask)) {
            TrieNode trieNodeRV9 = rV9(bzg(positionMask));
            if (otherNode.r(positionMask)) {
                return trieNodeRV9.E2(otherNode.rV9(otherNode.bzg(positionMask)), shift + 5, intersectionCounter, mutator);
            }
            if (!otherNode.Ik(positionMask)) {
                return trieNodeRV9;
            }
            int iTy = otherNode.ty(positionMask);
            Object objZ = otherNode.Z(iTy);
            Object objE = otherNode.E(iTy);
            int size = mutator.size();
            TrieNode trieNodeFD = trieNodeRV9.fD(objZ != null ? objZ.hashCode() : 0, objZ, objE, shift + 5, mutator);
            if (mutator.size() == size) {
                intersectionCounter.t(intersectionCounter.getCount() + 1);
            }
            return trieNodeFD;
        }
        if (!otherNode.r(positionMask)) {
            int iTy2 = ty(positionMask);
            Object objZ2 = Z(iTy2);
            Object objE2 = E(iTy2);
            int iTy3 = otherNode.ty(positionMask);
            Object objZ3 = otherNode.Z(iTy3);
            return XQ(objZ2 != null ? objZ2.hashCode() : 0, objZ2, objE2, objZ3 != null ? objZ3.hashCode() : 0, objZ3, otherNode.E(iTy3), shift + 5, mutator.getOwnership());
        }
        TrieNode trieNodeRV92 = otherNode.rV9(otherNode.bzg(positionMask));
        if (!Ik(positionMask)) {
            return trieNodeRV92;
        }
        int iTy4 = ty(positionMask);
        Object objZ4 = Z(iTy4);
        int i2 = shift + 5;
        if (!trieNodeRV92.gh(objZ4 != null ? objZ4.hashCode() : 0, objZ4, i2)) {
            return trieNodeRV92.fD(objZ4 != null ? objZ4.hashCode() : 0, objZ4, E(iTy4), i2, mutator);
        }
        intersectionCounter.t(intersectionCounter.getCount() + 1);
        return trieNodeRV92;
    }

    private final TrieNode eF(int keyIndex, Object value) {
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[keyIndex + 1] = value;
        return new TrieNode(this.dataMap, this.nodeMap, objArrCopyOf);
    }

    private final TrieNode iF(int keyIndex, int positionMask, int newKeyHash, Object newKey, Object newValue, int shift, MutabilityOwnership owner) {
        if (this.ownedBy != owner) {
            return new TrieNode(this.dataMap ^ positionMask, positionMask | this.nodeMap, nr(keyIndex, positionMask, newKeyHash, newKey, newValue, shift, owner), owner);
        }
        this.buffer = nr(keyIndex, positionMask, newKeyHash, newKey, newValue, shift, owner);
        this.dataMap ^= positionMask;
        this.nodeMap |= positionMask;
        return this;
    }

    private final TrieNode mUb(int i2) {
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        return new TrieNode(0, 0, TrieNodeKt.KN(objArr, i2));
    }

    private final TrieNode nHg(int nodeIndex, int positionMask, MutabilityOwnership owner) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        if (this.ownedBy != owner) {
            return new TrieNode(this.dataMap, positionMask ^ this.nodeMap, TrieNodeKt.xMQ(objArr, nodeIndex), owner);
        }
        this.buffer = TrieNodeKt.xMQ(objArr, nodeIndex);
        this.nodeMap ^= positionMask;
        return this;
    }

    private final TrieNode nY(Object key, Object value, PersistentHashMapBuilder mutator) {
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                if (!Intrinsics.areEqual(key, Z(first)) || !Intrinsics.areEqual(value, E(first))) {
                    if (first == last) {
                        break;
                    }
                    first += step;
                } else {
                    return g(first, mutator);
                }
            }
        }
        return this;
    }

    private final TrieNode p5(int nodeIndex, int positionMask, TrieNode newNode) {
        Object[] objArr = newNode.buffer;
        if (objArr.length != 2 || newNode.nodeMap != 0) {
            Object[] objArr2 = this.buffer;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[nodeIndex] = newNode;
            return new TrieNode(this.dataMap, this.nodeMap, objArrCopyOf);
        }
        if (this.buffer.length == 1) {
            newNode.dataMap = this.nodeMap;
            return newNode;
        }
        return new TrieNode(this.dataMap ^ positionMask, positionMask ^ this.nodeMap, TrieNodeKt.gh(this.buffer, nodeIndex, ty(positionMask), objArr[0], objArr[1]));
    }

    private final boolean r(int positionMask) {
        return (positionMask & this.nodeMap) != 0;
    }

    private final ModificationResult rl() {
        return new ModificationResult(this, 1);
    }

    private final TrieNode s7N(TrieNode targetNode, TrieNode newNode, int nodeIndex, int positionMask, MutabilityOwnership owner) {
        return newNode == null ? nHg(nodeIndex, positionMask, owner) : (this.ownedBy == owner || targetNode != newNode) ? wTp(nodeIndex, newNode, owner) : this;
    }

    private final ModificationResult t() {
        return new ModificationResult(this, 0);
    }

    private final TrieNode v(int keyIndex, Object value, PersistentHashMapBuilder mutator) {
        if (this.ownedBy == mutator.getOwnership()) {
            this.buffer[keyIndex + 1] = value;
            return this;
        }
        mutator.KN(mutator.getModCount() + 1);
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[keyIndex + 1] = value;
        return new TrieNode(this.dataMap, this.nodeMap, objArrCopyOf, mutator.getOwnership());
    }

    private final TrieNode wTp(int nodeIndex, TrieNode newNode, MutabilityOwnership owner) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1 && newNode.buffer.length == 2 && newNode.nodeMap == 0) {
            newNode.dataMap = this.nodeMap;
            return newNode;
        }
        if (this.ownedBy == owner) {
            objArr[nodeIndex] = newNode;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[nodeIndex] = newNode;
        return new TrieNode(this.dataMap, this.nodeMap, objArrCopyOf, owner);
    }

    private final TrieNode xMQ(Object key) {
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!Intrinsics.areEqual(key, Z(first))) {
                if (first != last) {
                    first += step;
                }
            }
            return mUb(first);
        }
        return this;
    }

    public final TrieNode E2(TrieNode otherNode, int shift, DeltaCounter intersectionCounter, PersistentHashMapBuilder mutator) {
        if (this == otherNode) {
            intersectionCounter.rl(O());
            return this;
        }
        int i2 = shift;
        if (i2 > 30) {
            return aYN(otherNode, intersectionCounter, mutator.getOwnership());
        }
        int i3 = this.nodeMap | otherNode.nodeMap;
        int i5 = this.dataMap;
        int i7 = otherNode.dataMap;
        int i8 = (i5 ^ i7) & (~i3);
        int i9 = i5 & i7;
        while (i9 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i9);
            if (Intrinsics.areEqual(Z(ty(iLowestOneBit)), otherNode.Z(otherNode.ty(iLowestOneBit)))) {
                i8 |= iLowestOneBit;
            } else {
                i3 |= iLowestOneBit;
            }
            i9 ^= iLowestOneBit;
        }
        int i10 = 0;
        if (!((i3 & i8) == 0)) {
            PreconditionsKt.rl("Check failed.");
        }
        TrieNode trieNode = (Intrinsics.areEqual(this.ownedBy, mutator.getOwnership()) && this.dataMap == i8 && this.nodeMap == i3) ? this : new TrieNode(i8, i3, new Object[(Integer.bitCount(i8) * 2) + Integer.bitCount(i3)]);
        int i11 = i3;
        int i12 = 0;
        while (i11 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i11);
            Object[] objArr = trieNode.buffer;
            objArr[(objArr.length - 1) - i12] = e(otherNode, iLowestOneBit2, i2, intersectionCounter, mutator);
            i12++;
            i11 ^= iLowestOneBit2;
            i2 = shift;
        }
        while (i8 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i8);
            int i13 = i10 * 2;
            if (otherNode.Ik(iLowestOneBit3)) {
                int iTy = otherNode.ty(iLowestOneBit3);
                trieNode.buffer[i13] = otherNode.Z(iTy);
                trieNode.buffer[i13 + 1] = otherNode.E(iTy);
                if (Ik(iLowestOneBit3)) {
                    intersectionCounter.t(intersectionCounter.getCount() + 1);
                }
            } else {
                int iTy2 = ty(iLowestOneBit3);
                trieNode.buffer[i13] = Z(iTy2);
                trieNode.buffer[i13 + 1] = E(iTy2);
            }
            i10++;
            i8 ^= iLowestOneBit3;
        }
        return qie(trieNode) ? this : otherNode.qie(trieNode) ? otherNode : trieNode;
    }

    public final boolean Ik(int positionMask) {
        return (positionMask & this.dataMap) != 0;
    }

    public final int az() {
        return Integer.bitCount(this.dataMap);
    }

    public final int bzg(int positionMask) {
        return (this.buffer.length - 1) - Integer.bitCount((positionMask - 1) & this.nodeMap);
    }

    /* JADX INFO: renamed from: ck, reason: from getter */
    public final Object[] getBuffer() {
        return this.buffer;
    }

    public final TrieNode rV9(int nodeIndex) {
        Object obj = this.buffer[nodeIndex];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (TrieNode) obj;
    }

    public final int ty(int positionMask) {
        return Integer.bitCount((positionMask - 1) & this.dataMap) * 2;
    }

    private final TrieNode N(int keyIndex, int positionMask, PersistentHashMapBuilder mutator) {
        mutator.gh(mutator.size() - 1);
        mutator.xMQ(E(keyIndex));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.ownedBy != mutator.getOwnership()) {
            return new TrieNode(positionMask ^ this.dataMap, this.nodeMap, TrieNodeKt.KN(this.buffer, keyIndex), mutator.getOwnership());
        }
        this.buffer = TrieNodeKt.KN(this.buffer, keyIndex);
        this.dataMap ^= positionMask;
        return this;
    }

    private final TrieNode g(int i2, PersistentHashMapBuilder mutator) {
        mutator.gh(mutator.size() - 1);
        mutator.xMQ(E(i2));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.ownedBy == mutator.getOwnership()) {
            this.buffer = TrieNodeKt.KN(this.buffer, i2);
            return this;
        }
        return new TrieNode(0, 0, TrieNodeKt.KN(this.buffer, i2), mutator.getOwnership());
    }

    private final Object[] nr(int keyIndex, int positionMask, int newKeyHash, Object newKey, Object newValue, int shift, MutabilityOwnership owner) {
        int iHashCode;
        Object objZ = Z(keyIndex);
        if (objZ != null) {
            iHashCode = objZ.hashCode();
        } else {
            iHashCode = 0;
        }
        TrieNode trieNodeXQ = XQ(iHashCode, objZ, E(keyIndex), newKeyHash, newKey, newValue, shift + 5, owner);
        return TrieNodeKt.mUb(this.buffer, keyIndex, bzg(positionMask) + 1, trieNodeXQ);
    }

    private final TrieNode o(int positionMask, Object key, Object value) {
        return new TrieNode(positionMask | this.dataMap, this.nodeMap, TrieNodeKt.Uo(this.buffer, ty(positionMask), key, value));
    }

    private final TrieNode te(int positionMask, Object key, Object value, MutabilityOwnership owner) {
        int iTy = ty(positionMask);
        if (this.ownedBy != owner) {
            return new TrieNode(positionMask | this.dataMap, this.nodeMap, TrieNodeKt.Uo(this.buffer, iTy, key, value), owner);
        }
        this.buffer = TrieNodeKt.Uo(this.buffer, iTy, key, value);
        this.dataMap = positionMask | this.dataMap;
        return this;
    }

    public final TrieNode fD(int keyHash, Object key, Object value, int shift, PersistentHashMapBuilder mutator) {
        PersistentHashMapBuilder persistentHashMapBuilder;
        TrieNode trieNodeFD;
        int iJ2 = 1 << TrieNodeKt.J2(keyHash, shift);
        if (Ik(iJ2)) {
            int iTy = ty(iJ2);
            if (Intrinsics.areEqual(key, Z(iTy))) {
                mutator.xMQ(E(iTy));
                if (E(iTy) == value) {
                    return this;
                }
                return v(iTy, value, mutator);
            }
            mutator.gh(mutator.size() + 1);
            return iF(iTy, iJ2, keyHash, key, value, shift, mutator.getOwnership());
        }
        if (r(iJ2)) {
            int iBzg = bzg(iJ2);
            TrieNode trieNodeRV9 = rV9(iBzg);
            if (shift == 30) {
                trieNodeFD = trieNodeRV9.WPU(key, value, mutator);
                persistentHashMapBuilder = mutator;
            } else {
                persistentHashMapBuilder = mutator;
                trieNodeFD = trieNodeRV9.fD(keyHash, key, value, shift + 5, persistentHashMapBuilder);
            }
            if (trieNodeRV9 == trieNodeFD) {
                return this;
            }
            return wTp(iBzg, trieNodeFD, persistentHashMapBuilder.getOwnership());
        }
        mutator.gh(mutator.size() + 1);
        return te(iJ2, key, value, mutator.getOwnership());
    }

    public TrieNode(int i2, int i3, Object[] objArr) {
        this(i2, i3, objArr, null);
    }
}
