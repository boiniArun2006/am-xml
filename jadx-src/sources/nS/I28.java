package nS;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class I28 implements WkR.Ml, WkR.Wre {
    private final WkR.w6 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Map f71153O;
    private final boolean Uo;
    private final Map nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final JsonWriter f71155t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private I28 f71154n = null;
    private boolean rl = true;

    private void ViF() throws IOException {
        if (!this.rl) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        I28 i28 = this.f71154n;
        if (i28 != null) {
            i28.ViF();
            this.f71154n.rl = false;
            this.f71154n = null;
            this.f71155t.endObject();
        }
    }

    private boolean Z(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private I28 aYN(String str, Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        ViF();
        this.f71155t.name(str);
        return gh(obj, false);
    }

    I28 S(WkR.w6 w6Var, Object obj, boolean z2) throws IOException {
        if (!z2) {
            this.f71155t.beginObject();
        }
        w6Var.n(obj, this);
        if (!z2) {
            this.f71155t.endObject();
        }
        return this;
    }

    public I28 ck(String str, Object obj) {
        return this.Uo ? aYN(str, obj) : WPU(str, obj);
    }

    I28 gh(Object obj, boolean z2) {
        if (z2 && Z(obj)) {
            throw new EncodingException(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f71155t.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f71155t.value((Number) obj);
            return this;
        }
        int i2 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f71155t.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    gh(it.next(), false);
                }
                this.f71155t.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f71155t.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        ck((String) key, entry.getValue());
                    } catch (ClassCastException e2) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e2);
                    }
                }
                this.f71155t.endObject();
                return this;
            }
            WkR.w6 w6Var = (WkR.w6) this.nr.get(obj.getClass());
            if (w6Var != null) {
                return S(w6Var, obj, z2);
            }
            WkR.I28 i28 = (WkR.I28) this.f71153O.get(obj.getClass());
            if (i28 != null) {
                i28.n(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return S(this.J2, obj, z2);
            }
            if (obj instanceof Wre) {
                xMQ(((Wre) obj).getNumber());
                return this;
            }
            nr(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return o((byte[]) obj);
        }
        this.f71155t.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i2 < length) {
                this.f71155t.value(r6[i2]);
                i2++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i2 < length2) {
                mUb(jArr[i2]);
                i2++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i2 < length3) {
                this.f71155t.value(dArr[i2]);
                i2++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i2 < length4) {
                this.f71155t.value(zArr[i2]);
                i2++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                gh(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                gh(obj2, false);
            }
        }
        this.f71155t.endArray();
        return this;
    }

    I28(Writer writer, Map map, Map map2, WkR.w6 w6Var, boolean z2) {
        this.f71155t = new JsonWriter(writer);
        this.nr = map;
        this.f71153O = map2;
        this.J2 = w6Var;
        this.Uo = z2;
    }

    private I28 WPU(String str, Object obj) throws IOException {
        ViF();
        this.f71155t.name(str);
        if (obj == null) {
            this.f71155t.nullValue();
            return this;
        }
        return gh(obj, false);
    }

    public I28 HI(String str, long j2) throws IOException {
        ViF();
        this.f71155t.name(str);
        return mUb(j2);
    }

    public I28 Ik(String str, boolean z2) throws IOException {
        ViF();
        this.f71155t.name(str);
        return J2(z2);
    }

    public I28 KN(double d2) throws IOException {
        ViF();
        this.f71155t.value(d2);
        return this;
    }

    @Override // WkR.Ml
    public WkR.Ml O(WkR.n nVar, boolean z2) {
        return Ik(nVar.rl(), z2);
    }

    @Override // WkR.Ml
    public WkR.Ml Uo(WkR.n nVar, Object obj) {
        return ck(nVar.rl(), obj);
    }

    void XQ() {
        ViF();
        this.f71155t.flush();
    }

    public I28 az(String str, double d2) throws IOException {
        ViF();
        this.f71155t.name(str);
        return KN(d2);
    }

    public I28 mUb(long j2) throws IOException {
        ViF();
        this.f71155t.value(j2);
        return this;
    }

    @Override // WkR.Ml
    public WkR.Ml n(WkR.n nVar, int i2) {
        return ty(nVar.rl(), i2);
    }

    public I28 o(byte[] bArr) throws IOException {
        ViF();
        if (bArr == null) {
            this.f71155t.nullValue();
            return this;
        }
        this.f71155t.value(Base64.encodeToString(bArr, 2));
        return this;
    }

    @Override // WkR.Wre
    /* JADX INFO: renamed from: qie, reason: merged with bridge method [inline-methods] */
    public I28 nr(String str) throws IOException {
        ViF();
        this.f71155t.value(str);
        return this;
    }

    @Override // WkR.Wre
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public I28 J2(boolean z2) throws IOException {
        ViF();
        this.f71155t.value(z2);
        return this;
    }

    @Override // WkR.Ml
    public WkR.Ml rl(WkR.n nVar, long j2) {
        return HI(nVar.rl(), j2);
    }

    @Override // WkR.Ml
    public WkR.Ml t(WkR.n nVar, double d2) {
        return az(nVar.rl(), d2);
    }

    public I28 ty(String str, int i2) throws IOException {
        ViF();
        this.f71155t.name(str);
        return xMQ(i2);
    }

    public I28 xMQ(int i2) throws IOException {
        ViF();
        this.f71155t.value(i2);
        return this;
    }
}
