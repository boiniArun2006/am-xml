package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.core.Animation;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "", "", c.f62177j, "()Ljava/util/Map;"}, k = 3, mv = {1, 9, 0})
final class Utils_androidKt$createTransitionInfo$values$2 extends Lambda implements Function0<Map<Long, Object>> {
    final /* synthetic */ Lazy J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ long f34101O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Animation f34102n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ long f34103t;

    @Override // kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Map invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Long.valueOf(Utils_androidKt.rl(this.J2)), this.f34102n.J2(Utils_androidKt.t(Utils_androidKt.rl(this.J2))));
        linkedHashMap.put(Long.valueOf(this.f34103t), this.f34102n.J2(Utils_androidKt.t(this.f34103t)));
        long jRl = Utils_androidKt.rl(this.J2);
        while (jRl <= this.f34103t) {
            linkedHashMap.put(Long.valueOf(jRl), this.f34102n.J2(Utils_androidKt.t(jRl)));
            jRl += this.f34101O;
        }
        return linkedHashMap;
    }
}
