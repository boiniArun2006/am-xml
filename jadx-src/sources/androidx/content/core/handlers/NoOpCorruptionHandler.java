package androidx.content.core.handlers;

import androidx.content.core.CorruptionException;
import androidx.content.core.CorruptionHandler;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/datastore/core/handlers/NoOpCorruptionHandler;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/CorruptionHandler;", "<init>", "()V", "Landroidx/datastore/core/CorruptionException;", "ex", c.f62177j, "(Landroidx/datastore/core/CorruptionException;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NoOpCorruptionHandler<T> implements CorruptionHandler<T> {
    @Override // androidx.content.core.CorruptionHandler
    public Object n(CorruptionException corruptionException, Continuation continuation) throws CorruptionException {
        throw corruptionException;
    }
}
