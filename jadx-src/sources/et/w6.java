package et;

import com.bendingspoons.serialization.json.adapters.LocalDateJsonAdapter;
import com.bendingspoons.serialization.json.adapters.LocalDateTimeJsonAdapter;
import com.bendingspoons.serialization.json.adapters.LocalTimeJsonAdapter;
import com.bendingspoons.serialization.json.adapters.LocaleJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.adapters.Rfc3339DateJsonAdapter;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Moshi f63879n;

    static {
        Moshi moshiBuild = n(new Moshi.Builder()).build();
        Intrinsics.checkNotNullExpressionValue(moshiBuild, "build(...)");
        f63879n = moshiBuild;
    }

    public static final Moshi.Builder n(Moshi.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        builder.add((JsonAdapter.Factory) new KotlinJsonAdapterFactory());
        builder.add(Date.class, new Rfc3339DateJsonAdapter().nullSafe());
        builder.add(LocalDate.class, new LocalDateJsonAdapter().nullSafe());
        builder.add(LocalTime.class, new LocalTimeJsonAdapter().nullSafe());
        builder.add(LocalDateTime.class, new LocalDateTimeJsonAdapter().nullSafe());
        builder.add(Locale.class, new LocaleJsonAdapter().nullSafe());
        return builder;
    }

    public static /* synthetic */ Moshi nr(Map map, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            map = MapsKt.emptyMap();
        }
        if ((i2 & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        return t(map, list);
    }

    public static final Moshi rl() {
        return f63879n;
    }

    public static final Moshi t(Map extraAdapters, List extraFactories) {
        Intrinsics.checkNotNullParameter(extraAdapters, "extraAdapters");
        Intrinsics.checkNotNullParameter(extraFactories, "extraFactories");
        Moshi.Builder builder = new Moshi.Builder();
        for (Map.Entry entry : extraAdapters.entrySet()) {
            builder.add(JvmClassMappingKt.getJavaClass((KClass) entry.getKey()), (JsonAdapter) entry.getValue());
        }
        Iterator it = extraFactories.iterator();
        while (it.hasNext()) {
            builder.add((JsonAdapter.Factory) it.next());
        }
        n(builder);
        Moshi moshiBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(moshiBuild, "build(...)");
        return moshiBuild;
    }
}
