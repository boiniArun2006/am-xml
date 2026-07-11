package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "it", "", c.f62177j, "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
final class AbstractPersistentList$retainAll$1 extends Lambda implements Function1<Object, Boolean> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Collection f30561n;

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(!this.f30561n.contains(obj));
    }
}
