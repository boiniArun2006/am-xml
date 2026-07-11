package qu;

import com.bendingspoons.oracle.models.ErrorResponse;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi._MoshiKotlinExtensionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class aC implements Function0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Moshi f72494n;

    public aC(Moshi moshi) {
        this.f72494n = moshi;
    }

    @Override // kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final JsonAdapter invoke() {
        return _MoshiKotlinExtensionsKt.adapter(this.f72494n, Reflection.typeOf(ErrorResponse.class));
    }
}
