package com.google.gson.internal;

import AlA.Ml;
import AlA.w6;
import com.google.gson.Gson;
import com.google.gson.Xo;
import com.google.gson.eO;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Excluder implements eO, Cloneable {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final Excluder f60921Z = new Excluder();
    private boolean J2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List f60924o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List f60925r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private double f60923n = -1.0d;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f60926t = 136;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f60922O = true;

    class j extends Xo {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ TypeToken f60927O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Xo f60928n;
        final /* synthetic */ Gson nr;
        final /* synthetic */ boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f60929t;

        j(boolean z2, boolean z3, Gson gson, TypeToken typeToken) {
            this.rl = z2;
            this.f60929t = z3;
            this.nr = gson;
            this.f60927O = typeToken;
        }

        private Xo O() {
            Xo xo = this.f60928n;
            if (xo != null) {
                return xo;
            }
            Xo delegateAdapter = this.nr.getDelegateAdapter(Excluder.this, this.f60927O);
            this.f60928n = delegateAdapter;
            return delegateAdapter;
        }

        @Override // com.google.gson.Xo
        public void nr(JsonWriter jsonWriter, Object obj) throws IOException {
            if (this.f60929t) {
                jsonWriter.nullValue();
            } else {
                O().nr(jsonWriter, obj);
            }
        }

        @Override // com.google.gson.Xo
        public Object rl(JsonReader jsonReader) throws IOException {
            if (!this.rl) {
                return O().rl(jsonReader);
            }
            jsonReader.skipValue();
            return null;
        }
    }

    private boolean az(w6 w6Var) {
        if (w6Var != null) {
            return this.f60923n >= w6Var.value();
        }
        return true;
    }

    private boolean ty(Ml ml) {
        if (ml != null) {
            return this.f60923n < ml.value();
        }
        return true;
    }

    private boolean J2(Class cls, boolean z2) {
        Iterator it = (z2 ? this.f60925r : this.f60924o).iterator();
        if (!it.hasNext()) {
            return false;
        }
        android.support.v4.media.j.n(it.next());
        throw null;
    }

    private boolean O(Class cls) {
        if (this.f60923n != -1.0d && !HI((w6) cls.getAnnotation(w6.class), (Ml) cls.getAnnotation(Ml.class))) {
            return true;
        }
        if (this.f60922O || !gh(cls)) {
            return mUb(cls);
        }
        return true;
    }

    private boolean mUb(Class cls) {
        if (Enum.class.isAssignableFrom(cls) || qie(cls)) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    public boolean KN(Field field, boolean z2) {
        AlA.j jVar;
        if ((this.f60926t & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f60923n != -1.0d && !HI((w6) field.getAnnotation(w6.class), (Ml) field.getAnnotation(Ml.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.J2 && ((jVar = (AlA.j) field.getAnnotation(AlA.j.class)) == null || (!z2 ? jVar.deserialize() : jVar.serialize()))) {
            return true;
        }
        if ((!this.f60922O && gh(field.getType())) || mUb(field.getType())) {
            return true;
        }
        List list = z2 ? this.f60925r : this.f60924o;
        if (list.isEmpty()) {
            return false;
        }
        new n(field);
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        android.support.v4.media.j.n(it.next());
        throw null;
    }

    public Excluder() {
        List list = Collections.EMPTY_LIST;
        this.f60925r = list;
        this.f60924o = list;
    }

    private boolean HI(w6 w6Var, Ml ml) {
        if (az(w6Var) && ty(ml)) {
            return true;
        }
        return false;
    }

    private boolean gh(Class cls) {
        if (cls.isMemberClass() && !qie(cls)) {
            return true;
        }
        return false;
    }

    private boolean qie(Class cls) {
        if ((cls.getModifiers() & 8) != 0) {
            return true;
        }
        return false;
    }

    public Excluder Ik(int... iArr) {
        Excluder excluderClone = clone();
        excluderClone.f60926t = 0;
        for (int i2 : iArr) {
            excluderClone.f60926t = i2 | excluderClone.f60926t;
        }
        return excluderClone;
    }

    public Excluder ck(com.google.gson.j jVar, boolean z2, boolean z3) {
        Excluder excluderClone = clone();
        if (z2) {
            ArrayList arrayList = new ArrayList(this.f60925r);
            excluderClone.f60925r = arrayList;
            arrayList.add(jVar);
        }
        if (z3) {
            ArrayList arrayList2 = new ArrayList(this.f60924o);
            excluderClone.f60924o = arrayList2;
            arrayList2.add(jVar);
        }
        return excluderClone;
    }

    @Override // com.google.gson.eO
    public Xo n(Gson gson, TypeToken typeToken) {
        boolean z2;
        boolean z3;
        Class rawType = typeToken.getRawType();
        boolean zO = O(rawType);
        if (!zO && !J2(rawType, true)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!zO && !J2(rawType, false)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z2 && !z3) {
            return null;
        }
        return new j(z3, z2, gson, typeToken);
    }

    public boolean nr(Class cls, boolean z2) {
        if (!O(cls) && !J2(cls, z2)) {
            return false;
        }
        return true;
    }

    public Excluder r(double d2) {
        Excluder excluderClone = clone();
        excluderClone.f60923n = d2;
        return excluderClone;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public Excluder t() {
        Excluder excluderClone = clone();
        excluderClone.f60922O = false;
        return excluderClone;
    }

    public Excluder xMQ() {
        Excluder excluderClone = clone();
        excluderClone.J2 = true;
        return excluderClone;
    }
}
