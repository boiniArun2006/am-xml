package com.google.gson.internal.bind;

import com.google.gson.CN3;
import com.google.gson.Dsr;
import com.google.gson.Wre;
import com.google.gson.fuX;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.text.Typography;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class n extends JsonReader {
    private int[] J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private String[] f61003O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Object[] f61004n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f61005t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Reader f61002r = new j();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Object f61001o = new Object();

    class j extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i2, int i3) {
            throw new AssertionError();
        }

        j() {
        }
    }

    private String getPath(boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append(Typography.dollar);
        int i2 = 0;
        while (true) {
            int i3 = this.f61005t;
            if (i2 >= i3) {
                return sb.toString();
            }
            Object[] objArr = this.f61004n;
            Object obj = objArr[i2];
            if (obj instanceof com.google.gson.Ml) {
                i2++;
                if (i2 < i3 && (objArr[i2] instanceof Iterator)) {
                    int i5 = this.J2[i2];
                    if (z2 && i5 > 0 && (i2 == i3 - 1 || i2 == i3 - 2)) {
                        i5--;
                    }
                    sb.append('[');
                    sb.append(i5);
                    sb.append(']');
                }
            } else if ((obj instanceof fuX) && (i2 = i2 + 1) < i3 && (objArr[i2] instanceof Iterator)) {
                sb.append('.');
                String str = this.f61003O[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
            i2++;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String getPreviousPath() {
        return getPath(true);
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextName() {
        return Uo(false);
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$n, reason: collision with other inner class name */
    static /* synthetic */ class C0817n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f61006n;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f61006n = iArr;
            try {
                iArr[JsonToken.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f61006n[JsonToken.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f61006n[JsonToken.END_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f61006n[JsonToken.END_DOCUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public n(Wre wre) {
        super(f61002r);
        this.f61004n = new Object[32];
        this.f61005t = 0;
        this.f61003O = new String[32];
        this.J2 = new int[32];
        U(wre);
    }

    private Object T() {
        Object[] objArr = this.f61004n;
        int i2 = this.f61005t - 1;
        this.f61005t = i2;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    private void U(Object obj) {
        int i2 = this.f61005t;
        Object[] objArr = this.f61004n;
        if (i2 == objArr.length) {
            int i3 = i2 * 2;
            this.f61004n = Arrays.copyOf(objArr, i3);
            this.J2 = Arrays.copyOf(this.J2, i3);
            this.f61003O = (String[]) Arrays.copyOf(this.f61003O, i3);
        }
        Object[] objArr2 = this.f61004n;
        int i5 = this.f61005t;
        this.f61005t = i5 + 1;
        objArr2[i5] = obj;
    }

    private String Uo(boolean z2) {
        n(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) Z()).next();
        String str = (String) entry.getKey();
        this.f61003O[this.f61005t - 1] = z2 ? "<skipped>" : str;
        U(entry.getValue());
        return str;
    }

    private Object Z() {
        return this.f61004n[this.f61005t - 1];
    }

    private String locationString() {
        return " at path " + getPath();
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginArray() {
        n(JsonToken.BEGIN_ARRAY);
        U(((com.google.gson.Ml) Z()).iterator());
        this.J2[this.f61005t - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginObject() {
        n(JsonToken.BEGIN_OBJECT);
        U(((fuX) Z()).entrySet().iterator());
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f61004n = new Object[]{f61001o};
        this.f61005t = 1;
    }

    @Override // com.google.gson.stream.JsonReader
    public void endArray() {
        n(JsonToken.END_ARRAY);
        T();
        T();
        int i2 = this.f61005t;
        if (i2 > 0) {
            int[] iArr = this.J2;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public void endObject() {
        n(JsonToken.END_OBJECT);
        this.f61003O[this.f61005t - 1] = null;
        T();
        T();
        int i2 = this.f61005t;
        if (i2 > 0) {
            int[] iArr = this.J2;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public void jB() {
        n(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) Z()).next();
        U(entry.getValue());
        U(new Dsr((String) entry.getKey()));
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean nextBoolean() {
        n(JsonToken.BOOLEAN);
        boolean zXMQ = ((Dsr) T()).xMQ();
        int i2 = this.f61005t;
        if (i2 > 0) {
            int[] iArr = this.J2;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return zXMQ;
    }

    @Override // com.google.gson.stream.JsonReader
    public void nextNull() {
        n(JsonToken.NULL);
        T();
        int i2 = this.f61005t;
        if (i2 > 0) {
            int[] iArr = this.J2;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public JsonToken peek() throws MalformedJsonException {
        if (this.f61005t == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object objZ = Z();
        if (objZ instanceof Iterator) {
            boolean z2 = this.f61004n[this.f61005t - 2] instanceof fuX;
            Iterator it = (Iterator) objZ;
            if (!it.hasNext()) {
                return z2 ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z2) {
                return JsonToken.NAME;
            }
            U(it.next());
            return peek();
        }
        if (objZ instanceof fuX) {
            return JsonToken.BEGIN_OBJECT;
        }
        if (objZ instanceof com.google.gson.Ml) {
            return JsonToken.BEGIN_ARRAY;
        }
        if (objZ instanceof Dsr) {
            Dsr dsr = (Dsr) objZ;
            if (dsr.r()) {
                return JsonToken.STRING;
            }
            if (dsr.HI()) {
                return JsonToken.BOOLEAN;
            }
            if (dsr.Ik()) {
                return JsonToken.NUMBER;
            }
            throw new AssertionError();
        }
        if (objZ instanceof CN3) {
            return JsonToken.NULL;
        }
        if (objZ == f61001o) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new MalformedJsonException("Custom JsonElement subclass " + objZ.getClass().getName() + " is not supported");
    }

    @Override // com.google.gson.stream.JsonReader
    public String toString() {
        return n.class.getSimpleName() + locationString();
    }

    private void n(JsonToken jsonToken) {
        if (peek() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + locationString());
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean hasNext() throws MalformedJsonException {
        JsonToken jsonTokenPeek = peek();
        if (jsonTokenPeek != JsonToken.END_OBJECT && jsonTokenPeek != JsonToken.END_ARRAY && jsonTokenPeek != JsonToken.END_DOCUMENT) {
            return true;
        }
        return false;
    }

    @Override // com.google.gson.stream.JsonReader
    public double nextDouble() throws MalformedJsonException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
        }
        double dMUb = ((Dsr) Z()).mUb();
        if (!isLenient() && (Double.isNaN(dMUb) || Double.isInfinite(dMUb))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + dMUb);
        }
        T();
        int i2 = this.f61005t;
        if (i2 > 0) {
            int[] iArr = this.J2;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return dMUb;
    }

    @Override // com.google.gson.stream.JsonReader
    public int nextInt() throws MalformedJsonException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
        }
        int iGh = ((Dsr) Z()).gh();
        T();
        int i2 = this.f61005t;
        if (i2 > 0) {
            int[] iArr = this.J2;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return iGh;
    }

    @Override // com.google.gson.stream.JsonReader
    public long nextLong() throws MalformedJsonException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
        }
        long jQie = ((Dsr) Z()).qie();
        T();
        int i2 = this.f61005t;
        if (i2 > 0) {
            int[] iArr = this.J2;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return jQie;
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextString() throws MalformedJsonException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.NUMBER) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
        }
        String strTy = ((Dsr) T()).ty();
        int i2 = this.f61005t;
        if (i2 > 0) {
            int[] iArr = this.J2;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return strTy;
    }

    Wre rl() throws MalformedJsonException {
        JsonToken jsonTokenPeek = peek();
        if (jsonTokenPeek != JsonToken.NAME && jsonTokenPeek != JsonToken.END_ARRAY && jsonTokenPeek != JsonToken.END_OBJECT && jsonTokenPeek != JsonToken.END_DOCUMENT) {
            Wre wre = (Wre) Z();
            skipValue();
            return wre;
        }
        throw new IllegalStateException("Unexpected " + jsonTokenPeek + " when reading a JsonElement.");
    }

    @Override // com.google.gson.stream.JsonReader
    public void skipValue() throws MalformedJsonException {
        int i2 = C0817n.f61006n[peek().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        T();
                        int i3 = this.f61005t;
                        if (i3 > 0) {
                            int[] iArr = this.J2;
                            int i5 = i3 - 1;
                            iArr[i5] = iArr[i5] + 1;
                            return;
                        }
                        return;
                    }
                    return;
                }
                endObject();
                return;
            }
            endArray();
            return;
        }
        Uo(true);
    }

    @Override // com.google.gson.stream.JsonReader
    public String getPath() {
        return getPath(false);
    }
}
