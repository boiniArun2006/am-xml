package qE;

import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class lej {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final lej f72308n = new lej();

    /* JADX INFO: Access modifiers changed from: private */
    public static final String t(String str, String str2) {
        Buffer buffer = new Buffer();
        JsonWriter jsonWriterOf = JsonWriter.of(buffer);
        Intrinsics.checkNotNull(jsonWriterOf);
        try {
            jsonWriterOf.setSerializeNulls(true);
            jsonWriterOf.beginObject();
            JsonReader jsonReaderOf = JsonReader.of(new Buffer().writeUtf8(str));
            try {
                Intrinsics.checkNotNull(jsonReaderOf);
                jsonReaderOf.beginObject();
                while (jsonReaderOf.hasNext()) {
                    String strNextName = jsonReaderOf.nextName();
                    Intrinsics.checkNotNullExpressionValue(strNextName, "nextName(...)");
                    if (Intrinsics.areEqual(strNextName, "settings")) {
                        jsonReaderOf.skipValue();
                    } else {
                        jsonWriterOf.name(strNextName);
                        jsonWriterOf.jsonValue(jsonReaderOf.readJsonValue());
                    }
                }
                Unit unit = Unit.INSTANCE;
                jsonReaderOf.endObject();
                CloseableKt.closeFinally(jsonReaderOf, null);
                jsonWriterOf.flush();
                buffer.writeUtf8(",\"settings\":");
                buffer.writeUtf8(str2);
                jsonWriterOf.endObject();
                CloseableKt.closeFinally(jsonWriterOf, null);
                return buffer.readUtf8();
            } finally {
            }
        } finally {
        }
    }

    public final x0X.n rl(final String oracleResponse, final String settingsJson) {
        Intrinsics.checkNotNullParameter(oracleResponse, "oracleResponse");
        Intrinsics.checkNotNullParameter(settingsJson, "settingsJson");
        return x0X.w6.n(new Function0() { // from class: qE.Ln
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return lej.t(oracleResponse, settingsJson);
            }
        });
    }

    private lej() {
    }
}
