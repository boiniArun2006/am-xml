package androidx.content.core;

import GJW.vd;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/io/File;", "it", "Landroidx/datastore/core/InterProcessCoordinator;", c.f62177j, "(Ljava/io/File;)Landroidx/datastore/core/InterProcessCoordinator;"}, k = 3, mv = {1, 8, 0})
final class MultiProcessDataStoreFactory$create$1 extends Lambda implements Function1<File, InterProcessCoordinator> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ vd f37569n;

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final InterProcessCoordinator invoke(File it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new MultiProcessCoordinator(this.f37569n.getCoroutineContext(), it);
    }
}
