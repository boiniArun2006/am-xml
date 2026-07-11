package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.Xo;
import com.google.gson.aC;
import com.google.gson.eO;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class TreeTypeAdapter extends Ml {
    private volatile Xo J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f60959O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final Gson f60960n;
    private final n nr;
    private final TypeToken rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final eO f60961t;

    private static final class SingleTypeFactory implements eO {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final Class f60962O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final TypeToken f60963n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f60964t;

        @Override // com.google.gson.eO
        public Xo n(Gson gson, TypeToken typeToken) {
            TypeToken typeToken2 = this.f60963n;
            if (typeToken2 != null ? typeToken2.equals(typeToken) || (this.f60964t && this.f60963n.getType() == typeToken.getRawType()) : this.f60962O.isAssignableFrom(typeToken.getRawType())) {
                return new TreeTypeAdapter(null, null, gson, typeToken, this);
            }
            return null;
        }
    }

    private final class n {
        private n() {
        }
    }

    public TreeTypeAdapter(aC aCVar, com.google.gson.I28 i28, Gson gson, TypeToken typeToken, eO eOVar, boolean z2) {
        this.nr = new n();
        this.f60960n = gson;
        this.rl = typeToken;
        this.f60961t = eOVar;
        this.f60959O = z2;
    }

    private Xo J2() {
        Xo xo = this.J2;
        if (xo != null) {
            return xo;
        }
        Xo delegateAdapter = this.f60960n.getDelegateAdapter(this.f60961t, this.rl);
        this.J2 = delegateAdapter;
        return delegateAdapter;
    }

    @Override // com.google.gson.internal.bind.Ml
    public Xo O() {
        return J2();
    }

    @Override // com.google.gson.Xo
    public void nr(JsonWriter jsonWriter, Object obj) {
        J2().nr(jsonWriter, obj);
    }

    @Override // com.google.gson.Xo
    public Object rl(JsonReader jsonReader) {
        return J2().rl(jsonReader);
    }

    public TreeTypeAdapter(aC aCVar, com.google.gson.I28 i28, Gson gson, TypeToken typeToken, eO eOVar) {
        this(aCVar, i28, gson, typeToken, eOVar, true);
    }
}
