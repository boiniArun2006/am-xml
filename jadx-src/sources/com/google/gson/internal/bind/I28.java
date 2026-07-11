package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.Xo;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class I28 extends Xo {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Gson f60935n;
    private final Xo rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Type f60936t;

    private static boolean J2(Xo xo) {
        Xo xoO;
        while ((xo instanceof Ml) && (xoO = ((Ml) xo).O()) != xo) {
            xo = xoO;
        }
        return xo instanceof ReflectiveTypeAdapterFactory.n;
    }

    private static Type O(Type type, Object obj) {
        return obj != null ? ((type instanceof Class) || (type instanceof TypeVariable)) ? obj.getClass() : type : type;
    }

    @Override // com.google.gson.Xo
    public void nr(JsonWriter jsonWriter, Object obj) {
        Xo adapter = this.rl;
        Type typeO = O(this.f60936t, obj);
        if (typeO != this.f60936t) {
            adapter = this.f60935n.getAdapter(TypeToken.get(typeO));
            if ((adapter instanceof ReflectiveTypeAdapterFactory.n) && !J2(this.rl)) {
                adapter = this.rl;
            }
        }
        adapter.nr(jsonWriter, obj);
    }

    @Override // com.google.gson.Xo
    public Object rl(JsonReader jsonReader) {
        return this.rl.rl(jsonReader);
    }

    I28(Gson gson, Xo xo, Type type) {
        this.f60935n = gson;
        this.rl = xo;
        this.f60936t = type;
    }
}
