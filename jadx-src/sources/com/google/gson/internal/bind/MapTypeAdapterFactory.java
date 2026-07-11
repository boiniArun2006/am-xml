package com.google.gson.internal.bind;

import T6s.fuX;
import T6s.o;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.google.gson.Dsr;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.Wre;
import com.google.gson.Xo;
import com.google.gson.eO;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class MapTypeAdapterFactory implements eO {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final T6s.w6 f60938n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final boolean f60939t;

    private final class j extends Xo {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Xo f60940n;
        private final Xo rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final fuX f60941t;

        public j(Gson gson, Type type, Xo xo, Type type2, Xo xo2, fuX fux) {
            this.f60940n = new I28(gson, xo, type);
            this.rl = new I28(gson, xo2, type2);
            this.f60941t = fux;
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
        public void nr(JsonWriter jsonWriter, Map map) throws IOException {
            if (map == null) {
                jsonWriter.nullValue();
                return;
            }
            if (!MapTypeAdapterFactory.this.f60939t) {
                jsonWriter.beginObject();
                for (Map.Entry entry : map.entrySet()) {
                    jsonWriter.name(String.valueOf(entry.getKey()));
                    this.rl.nr(jsonWriter, entry.getValue());
                }
                jsonWriter.endObject();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i2 = 0;
            boolean z2 = false;
            for (Map.Entry entry2 : map.entrySet()) {
                Wre wreT = this.f60940n.t(entry2.getKey());
                arrayList.add(wreT);
                arrayList2.add(entry2.getValue());
                z2 |= wreT.O() || wreT.Uo();
            }
            if (!z2) {
                jsonWriter.beginObject();
                int size = arrayList.size();
                while (i2 < size) {
                    jsonWriter.name(O((Wre) arrayList.get(i2)));
                    this.rl.nr(jsonWriter, arrayList2.get(i2));
                    i2++;
                }
                jsonWriter.endObject();
                return;
            }
            jsonWriter.beginArray();
            int size2 = arrayList.size();
            while (i2 < size2) {
                jsonWriter.beginArray();
                o.n((Wre) arrayList.get(i2), jsonWriter);
                this.rl.nr(jsonWriter, arrayList2.get(i2));
                jsonWriter.endArray();
                i2++;
            }
            jsonWriter.endArray();
        }

        private String O(Wre wre) {
            if (wre.KN()) {
                Dsr dsrNr = wre.nr();
                if (dsrNr.Ik()) {
                    return String.valueOf(dsrNr.az());
                }
                if (dsrNr.HI()) {
                    return Boolean.toString(dsrNr.xMQ());
                }
                if (dsrNr.r()) {
                    return dsrNr.ty();
                }
                throw new AssertionError();
            }
            if (wre.J2()) {
                return V8ValueNull.NULL;
            }
            throw new AssertionError();
        }

        @Override // com.google.gson.Xo
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public Map rl(JsonReader jsonReader) throws IOException {
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (jsonTokenPeek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Map map = (Map) this.f60941t.n();
            if (jsonTokenPeek == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginArray();
                    Object objRl = this.f60940n.rl(jsonReader);
                    if (map.put(objRl, this.rl.rl(jsonReader)) == null) {
                        jsonReader.endArray();
                    } else {
                        throw new JsonSyntaxException("duplicate key: " + objRl);
                    }
                }
                jsonReader.endArray();
                return map;
            }
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                T6s.I28.INSTANCE.promoteNameToValue(jsonReader);
                Object objRl2 = this.f60940n.rl(jsonReader);
                if (map.put(objRl2, this.rl.rl(jsonReader)) != null) {
                    throw new JsonSyntaxException("duplicate key: " + objRl2);
                }
            }
            jsonReader.endObject();
            return map;
        }
    }

    private Xo rl(Gson gson, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? TypeAdapters.J2 : gson.getAdapter(TypeToken.get(type));
    }

    public MapTypeAdapterFactory(T6s.w6 w6Var, boolean z2) {
        this.f60938n = w6Var;
        this.f60939t = z2;
    }

    @Override // com.google.gson.eO
    public Xo n(Gson gson, TypeToken typeToken) {
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type[] typeArrMUb = T6s.n.mUb(type, rawType);
        return new j(gson, typeArrMUb[0], rl(gson, typeArrMUb[0]), typeArrMUb[1], gson.getAdapter(TypeToken.get(typeArrMUb[1])), this.f60938n.rl(typeToken));
    }
}
