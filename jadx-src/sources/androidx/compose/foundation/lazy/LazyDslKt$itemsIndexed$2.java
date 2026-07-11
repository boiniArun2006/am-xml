package androidx.compose.foundation.lazy;

import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "index", "", c.f62177j, "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
public final class LazyDslKt$itemsIndexed$2 extends Lambda implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Function2 f18015n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ List f18016t;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return n(num.intValue());
    }

    public final Object n(int i2) {
        return this.f18015n.invoke(Integer.valueOf(i2), this.f18016t.get(i2));
    }
}
