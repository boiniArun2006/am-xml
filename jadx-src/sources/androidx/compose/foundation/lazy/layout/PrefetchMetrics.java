package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\"\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00050\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/lazy/layout/PrefetchMetrics;", "", "<init>", "()V", "contentType", "Landroidx/compose/foundation/lazy/layout/Averages;", c.f62177j, "(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/layout/Averages;", "", "rl", "(Ljava/lang/Object;)J", "t", "timeNanos", "", "nr", "(Ljava/lang/Object;J)V", "O", "Landroidx/compose/foundation/lazy/layout/Averages;", "overallAverage", "Landroidx/collection/MutableScatterMap;", "Landroidx/collection/MutableScatterMap;", "averagesByContentType", "Ljava/lang/Object;", "lastUsedContentType", "lastUsedAverage", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyLayoutPrefetchState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/PrefetchMetrics\n+ 2 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,541:1\n683#2:542\n1#3:543\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/PrefetchMetrics\n*L\n170#1:542\n170#1:543\n*E\n"})
public final class PrefetchMetrics {

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private Averages lastUsedAverage;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Object lastUsedContentType;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Averages overallAverage = new Averages();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final MutableScatterMap averagesByContentType = ScatterMapKt.t();

    private final Averages n(Object contentType) {
        Averages averages = this.lastUsedAverage;
        if (this.lastUsedContentType == contentType && averages != null) {
            return averages;
        }
        MutableScatterMap mutableScatterMap = this.averagesByContentType;
        Object objO = mutableScatterMap.O(contentType);
        if (objO == null) {
            objO = this.overallAverage.rl();
            mutableScatterMap.aYN(contentType, objO);
        }
        Averages averages2 = (Averages) objO;
        this.lastUsedContentType = contentType;
        this.lastUsedAverage = averages2;
        return averages2;
    }

    public final void O(Object contentType, long timeNanos) {
        this.overallAverage.J2(timeNanos);
        n(contentType).J2(timeNanos);
    }

    public final void nr(Object contentType, long timeNanos) {
        this.overallAverage.O(timeNanos);
        n(contentType).O(timeNanos);
    }

    public final long rl(Object contentType) {
        return n(contentType).getCompositionTimeNanos();
    }

    public final long t(Object contentType) {
        return n(contentType).getMeasureTimeNanos();
    }
}
