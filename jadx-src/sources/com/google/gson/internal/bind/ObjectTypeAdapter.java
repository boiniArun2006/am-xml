package com.google.gson.internal.bind;

import T6s.CN3;
import com.google.gson.Gson;
import com.google.gson.Pl;
import com.google.gson.Xo;
import com.google.gson.eO;
import com.google.gson.qz;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class ObjectTypeAdapter extends Xo {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final eO f60945t = J2(qz.f61023n);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Gson f60946n;
    private final Pl rl;

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f60948n;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f60948n = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60948n[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60948n[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60948n[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f60948n[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f60948n[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private ObjectTypeAdapter(Gson gson, Pl pl) {
        this.f60946n = gson;
        this.rl = pl;
    }

    private static eO J2(final Pl pl) {
        return new eO() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
            @Override // com.google.gson.eO
            public Xo n(Gson gson, TypeToken typeToken) {
                if (typeToken.getRawType() != Object.class) {
                    return null;
                }
                return new ObjectTypeAdapter(gson, pl);
            }
        };
    }

    private Object KN(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i2 = j.f60948n[jsonToken.ordinal()];
        if (i2 == 1) {
            jsonReader.beginArray();
            return new ArrayList();
        }
        if (i2 != 2) {
            return null;
        }
        jsonReader.beginObject();
        return new CN3();
    }

    public static eO O(Pl pl) {
        return pl == qz.f61023n ? f60945t : J2(pl);
    }

    private Object Uo(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i2 = j.f60948n[jsonToken.ordinal()];
        if (i2 == 3) {
            return jsonReader.nextString();
        }
        if (i2 == 4) {
            return this.rl.n(jsonReader);
        }
        if (i2 == 5) {
            return Boolean.valueOf(jsonReader.nextBoolean());
        }
        if (i2 == 6) {
            jsonReader.nextNull();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + jsonToken);
    }

    @Override // com.google.gson.Xo
    public void nr(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        Xo adapter = this.f60946n.getAdapter(obj.getClass());
        if (!(adapter instanceof ObjectTypeAdapter)) {
            adapter.nr(jsonWriter, obj);
        } else {
            jsonWriter.beginObject();
            jsonWriter.endObject();
        }
    }

    @Override // com.google.gson.Xo
    public Object rl(JsonReader jsonReader) throws IOException {
        String strNextName;
        boolean z2;
        JsonToken jsonTokenPeek = jsonReader.peek();
        Object objKN = KN(jsonReader, jsonTokenPeek);
        if (objKN == null) {
            return Uo(jsonReader, jsonTokenPeek);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (jsonReader.hasNext()) {
                if (objKN instanceof Map) {
                    strNextName = jsonReader.nextName();
                } else {
                    strNextName = null;
                }
                JsonToken jsonTokenPeek2 = jsonReader.peek();
                Object objKN2 = KN(jsonReader, jsonTokenPeek2);
                if (objKN2 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (objKN2 == null) {
                    objKN2 = Uo(jsonReader, jsonTokenPeek2);
                }
                if (objKN instanceof List) {
                    ((List) objKN).add(objKN2);
                } else {
                    ((Map) objKN).put(strNextName, objKN2);
                }
                if (z2) {
                    arrayDeque.addLast(objKN);
                    objKN = objKN2;
                }
            } else {
                if (objKN instanceof List) {
                    jsonReader.endArray();
                } else {
                    jsonReader.endObject();
                }
                if (arrayDeque.isEmpty()) {
                    return objKN;
                }
                objKN = arrayDeque.removeLast();
            }
        }
    }
}
