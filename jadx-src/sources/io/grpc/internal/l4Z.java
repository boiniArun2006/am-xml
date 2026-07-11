package io.grpc.internal;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class l4Z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Logger f68629n = Logger.getLogger(l4Z.class.getName());

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f68630n;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f68630n = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68630n[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68630n[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f68630n[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f68630n[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f68630n[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static Object n(String str) {
        JsonReader jsonReader = new JsonReader(new StringReader(str));
        try {
            Object objO = O(jsonReader);
            try {
                return objO;
            } catch (IOException e2) {
                return objO;
            }
        } finally {
            try {
                jsonReader.close();
            } catch (IOException e22) {
                f68629n.log(Level.WARNING, "Failed to close", (Throwable) e22);
            }
        }
    }

    private static Object O(JsonReader jsonReader) {
        t1.Xo.S(jsonReader.hasNext(), "unexpected end of JSON");
        switch (j.f68630n[jsonReader.peek().ordinal()]) {
            case 1:
                return rl(jsonReader);
            case 2:
                return nr(jsonReader);
            case 3:
                return jsonReader.nextString();
            case 4:
                return Double.valueOf(jsonReader.nextDouble());
            case 5:
                return Boolean.valueOf(jsonReader.nextBoolean());
            case 6:
                return t(jsonReader);
            default:
                throw new IllegalStateException("Bad token: " + jsonReader.getPath());
        }
    }

    private static Map nr(JsonReader jsonReader) throws IOException {
        boolean z2;
        jsonReader.beginObject();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (jsonReader.hasNext()) {
            linkedHashMap.put(jsonReader.nextName(), O(jsonReader));
        }
        if (jsonReader.peek() == JsonToken.END_OBJECT) {
            z2 = true;
        } else {
            z2 = false;
        }
        t1.Xo.S(z2, "Bad token: " + jsonReader.getPath());
        jsonReader.endObject();
        return Collections.unmodifiableMap(linkedHashMap);
    }

    private static List rl(JsonReader jsonReader) throws IOException {
        boolean z2;
        jsonReader.beginArray();
        ArrayList arrayList = new ArrayList();
        while (jsonReader.hasNext()) {
            arrayList.add(O(jsonReader));
        }
        if (jsonReader.peek() == JsonToken.END_ARRAY) {
            z2 = true;
        } else {
            z2 = false;
        }
        t1.Xo.S(z2, "Bad token: " + jsonReader.getPath());
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    private static Void t(JsonReader jsonReader) throws IOException {
        jsonReader.nextNull();
        return null;
    }
}
