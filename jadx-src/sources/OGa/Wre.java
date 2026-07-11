package OGa;

import OGa.Ml;
import com.google.android.exoplayer2.C;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class Wre implements WkR.Ml {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Dsr f7292O = new Dsr(this);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private OutputStream f7293n;
    private final WkR.w6 nr;
    private final Map rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f7294t;
    private static final Charset J2 = Charset.forName(C.UTF8_NAME);
    private static final WkR.n Uo = WkR.n.n("key").rl(OGa.j.rl().t(1).n()).n();
    private static final WkR.n KN = WkR.n.n("value").rl(OGa.j.rl().t(2).n()).n();
    private static final WkR.w6 xMQ = new WkR.w6() { // from class: OGa.I28
        @Override // WkR.w6
        public final void n(Object obj, Object obj2) {
            Wre.nr((Map.Entry) obj, (WkR.Ml) obj2);
        }
    };

    @Override // WkR.Ml
    /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
    public Wre n(WkR.n nVar, int i2) {
        return KN(nVar, i2, true);
    }

    @Override // WkR.Ml
    public WkR.Ml Uo(WkR.n nVar, Object obj) {
        return HI(nVar, obj, true);
    }

    @Override // WkR.Ml
    /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
    public Wre O(WkR.n nVar, boolean z2) {
        return qie(nVar, z2, true);
    }

    @Override // WkR.Ml
    public WkR.Ml t(WkR.n nVar, double d2) {
        return az(nVar, d2, true);
    }

    @Override // WkR.Ml
    /* JADX INFO: renamed from: xMQ, reason: merged with bridge method [inline-methods] */
    public Wre rl(WkR.n nVar, long j2) {
        return mUb(nVar, j2, true);
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f7295n;

        static {
            int[] iArr = new int[Ml.j.values().length];
            f7295n = iArr;
            try {
                iArr[Ml.j.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7295n[Ml.j.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7295n[Ml.j.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private long Ik(WkR.w6 w6Var, Object obj) throws IOException {
        n nVar = new n();
        try {
            OutputStream outputStream = this.f7293n;
            this.f7293n = nVar;
            try {
                w6Var.n(obj, this);
                this.f7293n = outputStream;
                long jN = nVar.n();
                nVar.close();
                return jN;
            } catch (Throwable th) {
                this.f7293n = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                nVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static int S(WkR.n nVar) {
        Ml ml = (Ml) nVar.t(Ml.class);
        if (ml != null) {
            return ml.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private void WPU(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            this.f7293n.write((i2 & 127) | 128);
            i2 >>>= 7;
        }
        this.f7293n.write(i2 & 127);
    }

    private static Ml XQ(WkR.n nVar) {
        Ml ml = (Ml) nVar.t(Ml.class);
        if (ml != null) {
            return ml;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private void aYN(long j2) throws IOException {
        while (((-128) & j2) != 0) {
            this.f7293n.write((((int) j2) & 127) | 128);
            j2 >>>= 7;
        }
        this.f7293n.write(((int) j2) & 127);
    }

    public static /* synthetic */ void nr(Map.Entry entry, WkR.Ml ml) {
        ml.Uo(Uo, entry.getKey());
        ml.Uo(KN, entry.getValue());
    }

    private Wre o(WkR.I28 i28, WkR.n nVar, Object obj, boolean z2) {
        this.f7292O.rl(nVar, z2);
        i28.n(obj, this.f7292O);
        return this;
    }

    WkR.Ml HI(WkR.n nVar, Object obj, boolean z2) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z2 || charSequence.length() != 0) {
                    WPU((S(nVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(J2);
                    WPU(bytes.length);
                    this.f7293n.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    HI(nVar, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    r(xMQ, nVar, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    return az(nVar, ((Double) obj).doubleValue(), z2);
                }
                if (obj instanceof Float) {
                    return ty(nVar, ((Float) obj).floatValue(), z2);
                }
                if (obj instanceof Number) {
                    return mUb(nVar, ((Number) obj).longValue(), z2);
                }
                if (obj instanceof Boolean) {
                    return qie(nVar, ((Boolean) obj).booleanValue(), z2);
                }
                if (!(obj instanceof byte[])) {
                    WkR.w6 w6Var = (WkR.w6) this.rl.get(obj.getClass());
                    if (w6Var != null) {
                        return r(w6Var, nVar, obj, z2);
                    }
                    WkR.I28 i28 = (WkR.I28) this.f7294t.get(obj.getClass());
                    return i28 != null ? o(i28, nVar, obj, z2) : obj instanceof w6 ? n(nVar, ((w6) obj).getNumber()) : obj instanceof Enum ? n(nVar, ((Enum) obj).ordinal()) : r(this.nr, nVar, obj, z2);
                }
                byte[] bArr = (byte[]) obj;
                if (!z2 || bArr.length != 0) {
                    WPU((S(nVar) << 3) | 2);
                    WPU(bArr.length);
                    this.f7293n.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    Wre KN(WkR.n nVar, int i2, boolean z2) throws IOException {
        if (!z2 || i2 != 0) {
            Ml mlXQ = XQ(nVar);
            int i3 = j.f7295n[mlXQ.intEncoding().ordinal()];
            if (i3 == 1) {
                WPU(mlXQ.tag() << 3);
                WPU(i2);
                return this;
            }
            if (i3 == 2) {
                WPU(mlXQ.tag() << 3);
                WPU((i2 << 1) ^ (i2 >> 31));
                return this;
            }
            if (i3 == 3) {
                WPU((mlXQ.tag() << 3) | 5);
                this.f7293n.write(ck(4).putInt(i2).array());
                return this;
            }
        }
        return this;
    }

    Wre Z(Object obj) {
        if (obj == null) {
            return this;
        }
        WkR.w6 w6Var = (WkR.w6) this.rl.get(obj.getClass());
        if (w6Var != null) {
            w6Var.n(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }

    WkR.Ml az(WkR.n nVar, double d2, boolean z2) throws IOException {
        if (z2 && d2 == 0.0d) {
            return this;
        }
        WPU((S(nVar) << 3) | 1);
        this.f7293n.write(ck(8).putDouble(d2).array());
        return this;
    }

    Wre mUb(WkR.n nVar, long j2, boolean z2) throws IOException {
        if (!z2 || j2 != 0) {
            Ml mlXQ = XQ(nVar);
            int i2 = j.f7295n[mlXQ.intEncoding().ordinal()];
            if (i2 == 1) {
                WPU(mlXQ.tag() << 3);
                aYN(j2);
                return this;
            }
            if (i2 == 2) {
                WPU(mlXQ.tag() << 3);
                aYN((j2 >> 63) ^ (j2 << 1));
                return this;
            }
            if (i2 == 3) {
                WPU((mlXQ.tag() << 3) | 1);
                this.f7293n.write(ck(8).putLong(j2).array());
                return this;
            }
        }
        return this;
    }

    WkR.Ml ty(WkR.n nVar, float f3, boolean z2) throws IOException {
        if (z2 && f3 == 0.0f) {
            return this;
        }
        WPU((S(nVar) << 3) | 5);
        this.f7293n.write(ck(4).putFloat(f3).array());
        return this;
    }

    Wre(OutputStream outputStream, Map map, Map map2, WkR.w6 w6Var) {
        this.f7293n = outputStream;
        this.rl = map;
        this.f7294t = map2;
        this.nr = w6Var;
    }

    private static ByteBuffer ck(int i2) {
        return ByteBuffer.allocate(i2).order(ByteOrder.LITTLE_ENDIAN);
    }

    private Wre r(WkR.w6 w6Var, WkR.n nVar, Object obj, boolean z2) throws IOException {
        long jIk = Ik(w6Var, obj);
        if (z2 && jIk == 0) {
            return this;
        }
        WPU((S(nVar) << 3) | 2);
        aYN(jIk);
        w6Var.n(obj, this);
        return this;
    }

    Wre qie(WkR.n nVar, boolean z2, boolean z3) {
        return KN(nVar, z2 ? 1 : 0, z3);
    }
}
