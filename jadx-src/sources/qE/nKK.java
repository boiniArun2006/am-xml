package qE;

import com.squareup.moshi.JsonReader;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSource;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class nKK {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final nKK f72310n = new nKK();

    public final Map n(String oracleResponse) {
        Intrinsics.checkNotNullParameter(oracleResponse, "oracleResponse");
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        JsonReader jsonReaderOf = JsonReader.of(new Buffer().writeUtf8(oracleResponse));
        try {
            Intrinsics.checkNotNull(jsonReaderOf);
            xFr.aC.J2(jsonReaderOf, "settings");
            jsonReaderOf.beginObject();
            while (jsonReaderOf.hasNext()) {
                String strNextName = jsonReaderOf.nextName();
                Intrinsics.checkNotNullExpressionValue(strNextName, "nextName(...)");
                BufferedSource bufferedSourceNextSource = jsonReaderOf.nextSource();
                try {
                    String utf8 = bufferedSourceNextSource.readUtf8();
                    CloseableKt.closeFinally(bufferedSourceNextSource, null);
                    mapCreateMapBuilder.put(strNextName, utf8);
                } finally {
                }
            }
            Unit unit = Unit.INSTANCE;
            jsonReaderOf.endObject();
            CloseableKt.closeFinally(jsonReaderOf, null);
            return qf.rl(MapsKt.build(mapCreateMapBuilder));
        } finally {
        }
    }

    private nKK() {
    }
}
