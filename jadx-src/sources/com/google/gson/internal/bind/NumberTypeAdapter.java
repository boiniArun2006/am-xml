package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.Pl;
import com.google.gson.Xo;
import com.google.gson.eO;
import com.google.gson.qz;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class NumberTypeAdapter extends Xo {
    private static final eO rl = J2(qz.f61025t);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Pl f60942n;

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f60944n;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f60944n = iArr;
            try {
                iArr[JsonToken.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60944n[JsonToken.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60944n[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static eO J2(Pl pl) {
        return new eO() { // from class: com.google.gson.internal.bind.NumberTypeAdapter.1
            @Override // com.google.gson.eO
            public Xo n(Gson gson, TypeToken typeToken) {
                if (typeToken.getRawType() == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    public static eO O(Pl pl) {
        return pl == qz.f61025t ? rl : J2(pl);
    }

    private NumberTypeAdapter(Pl pl) {
        this.f60942n = pl;
    }

    @Override // com.google.gson.Xo
    /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
    public void nr(JsonWriter jsonWriter, Number number) throws IOException {
        jsonWriter.value(number);
    }

    @Override // com.google.gson.Xo
    /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
    public Number rl(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        int i2 = j.f60944n[jsonTokenPeek.ordinal()];
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                throw new JsonSyntaxException("Expecting number, got: " + jsonTokenPeek + "; at path " + jsonReader.getPath());
            }
            return this.f60942n.n(jsonReader);
        }
        jsonReader.nextNull();
        return null;
    }
}
