package HI0;

import com.alightcreative.account.LicenseBenefitAdapter;
import com.alightcreative.ext.TimestampAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class Lu {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Moshi f3822n;

    static {
        Moshi moshiBuild = new Moshi.Builder().add(new LicenseBenefitAdapter()).add(new TimestampAdapter()).addLast((JsonAdapter.Factory) new KotlinJsonAdapterFactory()).build();
        Intrinsics.checkNotNullExpressionValue(moshiBuild, "build(...)");
        f3822n = moshiBuild;
    }

    public static final Moshi n() {
        return f3822n;
    }

    public static final JsonAdapter rl(Moshi moshi, Class type) {
        Intrinsics.checkNotNullParameter(moshi, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        JsonAdapter jsonAdapterAdapter = moshi.adapter(Types.newParameterizedType(List.class, type));
        Intrinsics.checkNotNull(jsonAdapterAdapter);
        return jsonAdapterAdapter;
    }

    public static final List t(Moshi moshi, Class type, String json) {
        Intrinsics.checkNotNullParameter(moshi, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(json, "json");
        return (List) rl(moshi, type).fromJson(json);
    }
}
