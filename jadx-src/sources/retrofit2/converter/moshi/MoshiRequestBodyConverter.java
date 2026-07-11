package retrofit2.converter.moshi;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonWriter;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import retrofit2.Converter;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class MoshiRequestBodyConverter<T> implements Converter<T, RequestBody> {
    private static final MediaType MEDIA_TYPE = MediaType.get("application/json; charset=UTF-8");
    private final JsonAdapter<T> adapter;

    @Override // retrofit2.Converter
    public RequestBody convert(T t3) throws IOException {
        Buffer buffer = new Buffer();
        this.adapter.toJson(JsonWriter.of(buffer), t3);
        return RequestBody.create(MEDIA_TYPE, buffer.readByteString());
    }

    MoshiRequestBodyConverter(JsonAdapter<T> jsonAdapter) {
        this.adapter = jsonAdapter;
    }
}
