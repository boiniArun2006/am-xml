package androidx.compose.ui.tooling.animation.clock;

import com.caoccao.javet.values.reference.IV8ValueMap;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\" \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013²\u0006\u001c\u0010\u0010\u001a\u00020\u0000\"\u0004\b\u0000\u0010\r\"\b\b\u0001\u0010\u000f*\u00020\u000e8\nX\u008a\u0084\u0002²\u0006(\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\r\"\b\b\u0001\u0010\u000f*\u00020\u000e8\nX\u008a\u0084\u0002²\u0006(\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\r\"\b\b\u0001\u0010\u000f*\u00020\u000e8\nX\u008a\u0084\u0002"}, d2 = {"", "timeNs", "nr", "(J)J", "timeMs", "t", "", "", c.f62177j, "Ljava/util/List;", "getIGNORE_TRANSITIONS", "()Ljava/util/List;", "IGNORE_TRANSITIONS", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "startTimeMs", "", IV8ValueMap.FUNCTION_VALUES, "ui-tooling_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.android.kt\nandroidx/compose/ui/tooling/animation/clock/Utils_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 7 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,260:1\n1360#2:261\n1446#2,5:262\n30#3:267\n30#3:269\n80#4:268\n80#4:270\n80#4:272\n80#4:274\n53#4,3:276\n53#4,3:280\n53#4,3:284\n53#4,3:288\n32#5:271\n32#5:273\n33#6:275\n33#6:279\n30#7:283\n30#7:287\n123#8:291\n118#8:292\n113#8:293\n*S KotlinDebug\n*F\n+ 1 Utils.android.kt\nandroidx/compose/ui/tooling/animation/clock/Utils_androidKt\n*L\n56#1:261\n56#1:262,5\n189#1:267\n190#1:269\n189#1:268\n190#1:270\n194#1:272\n195#1:274\n199#1:276,3\n200#1:280,3\n204#1:284,3\n205#1:288,3\n194#1:271\n195#1:273\n199#1:275\n200#1:279\n204#1:283\n205#1:287\n161#1:291\n161#1:292\n161#1:293\n*E\n"})
public final class Utils_androidKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final List f34099n = CollectionsKt.listOf("TransformOriginInterruptionHandling");

    public static final long t(long j2) {
        return j2 * 1000000;
    }

    public static final long nr(long j2) {
        return (j2 + ((long) 999999)) / ((long) 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long rl(Lazy lazy) {
        return ((Number) lazy.getValue()).longValue();
    }
}
