package xFr;

import com.squareup.moshi.JsonReader;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import okio.BufferedSource;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class aC {
    public static final void J2(JsonReader jsonReader, String key) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (Intrinsics.areEqual(jsonReader.nextName(), key)) {
                return;
            } else {
                jsonReader.skipValue();
            }
        }
        throw new NoSuchElementException("Key not found: " + key);
    }

    public static final List O(JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "<this>");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            Intrinsics.checkNotNullExpressionValue(strNextName, "nextName(...)");
            listCreateListBuilder.add(strNextName);
            jsonReader.skipValue();
        }
        Unit unit = Unit.INSTANCE;
        jsonReader.endObject();
        return CollectionsKt.build(listCreateListBuilder);
    }

    public static final String nr(JsonReader jsonReader, String key) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            Intrinsics.checkNotNullExpressionValue(strNextName, "nextName(...)");
            if (Intrinsics.areEqual(strNextName, key)) {
                BufferedSource bufferedSourceNextSource = jsonReader.nextSource();
                try {
                    String utf8 = bufferedSourceNextSource.readUtf8();
                    CloseableKt.closeFinally(bufferedSourceNextSource, null);
                    return utf8;
                } finally {
                }
            } else {
                jsonReader.skipValue();
            }
        }
        Unit unit = Unit.INSTANCE;
        jsonReader.endObject();
        return null;
    }

    public static final int rl(final JsonReader jsonReader) {
        Intrinsics.checkNotNullParameter(jsonReader, "<this>");
        return SequencesKt.count(SequencesKt.generateSequence(new Function0() { // from class: xFr.Dsr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return aC.t(jsonReader);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(JsonReader jsonReader) throws IOException {
        if (jsonReader.hasNext()) {
            jsonReader.skipValue();
            return Unit.INSTANCE;
        }
        return null;
    }
}
