package i1;

import com.bendingspoons.spidersense.domain.entities.CompleteDebugEvent;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Lazy f68101n = LazyKt.lazy(new Function0() { // from class: i1.j
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return n.rl();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAdapter rl() {
        return new Moshi.Builder().add((JsonAdapter.Factory) new KotlinJsonAdapterFactory()).build().adapter(CompleteDebugEvent.class).nullSafe().serializeNulls();
    }

    private final JsonAdapter t() {
        Object value = this.f68101n.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (JsonAdapter) value;
    }

    public final String O(CompleteDebugEvent completeDebugEvent) {
        Intrinsics.checkNotNullParameter(completeDebugEvent, "completeDebugEvent");
        String json = t().toJson(completeDebugEvent);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }

    public final CompleteDebugEvent nr(String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return (CompleteDebugEvent) t().fromJson(json);
    }
}
