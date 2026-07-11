package ykr;

import com.bendingspoons.pico.data.repository.internal.entity.picoEvent.PicoInternalEventData;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Lazy f76187n = LazyKt.lazy(new Function0() { // from class: ykr.j
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return n.rl();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAdapter rl() {
        return new Moshi.Builder().add((JsonAdapter.Factory) new KotlinJsonAdapterFactory()).build().adapter(PicoInternalEventData.class).nullSafe().serializeNulls();
    }

    private final JsonAdapter t() {
        Object value = this.f76187n.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (JsonAdapter) value;
    }

    public final QAv.j O(String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        PicoInternalEventData picoInternalEventData = (PicoInternalEventData) t().fromJson(json);
        if (picoInternalEventData != null) {
            return picoInternalEventData.toDomain();
        }
        return null;
    }

    public final String nr(QAv.j event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String json = t().toJson(xuN.j.rl(event));
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }
}
