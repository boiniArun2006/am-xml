package Mms;

import Du.AbstractC1338n;
import EJn.Xo;
import Mms.Zs;
import com.caoccao.javet.values.primitive.V8ValueNull;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.InterfaceC2252c;

/* JADX INFO: renamed from: Mms.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class C1415m extends gi.n implements InterfaceC2252c {
    private final kotlinx.serialization.json.CN3 J2;
    private String KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final DGv.Ml f6728O;
    private boolean Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Pl f6729n;
    private final InterfaceC2252c[] nr;
    private final kotlinx.serialization.json.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final O f6730t;
    private String xMQ;

    public C1415m(Pl composer, kotlinx.serialization.json.n json, O mode, InterfaceC2252c[] interfaceC2252cArr) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f6729n = composer;
        this.rl = json;
        this.f6730t = mode;
        this.nr = interfaceC2252cArr;
        this.f6728O = nr().n();
        this.J2 = nr().O();
        int iOrdinal = mode.ordinal();
        if (interfaceC2252cArr != null) {
            InterfaceC2252c interfaceC2252c = interfaceC2252cArr[iOrdinal];
            if (interfaceC2252c == null && interfaceC2252c == this) {
                return;
            }
            interfaceC2252cArr[iOrdinal] = this;
        }
    }

    /* JADX INFO: renamed from: Mms.m$j */
    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[O.values().length];
            try {
                iArr[O.J2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[O.f6707r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[O.f6706o.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void s7N(String str, String str2) {
        this.f6729n.t();
        T(str);
        this.f6729n.J2(':');
        this.f6729n.ck();
        T(str2);
    }

    @Override // gi.n, gi.Wre
    public void E2(int i2) {
        if (this.Uo) {
            T(String.valueOf(i2));
        } else {
            this.f6729n.xMQ(i2);
        }
    }

    @Override // gi.n, gi.Wre
    public void HI(EJn.Wre enumDescriptor, int i2) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        T(enumDescriptor.O(i2));
    }

    @Override // gi.n, gi.Wre
    public void Ik() {
        this.f6729n.gh(V8ValueNull.NULL);
    }

    @Override // gi.n, gi.Wre
    public gi.Wre J2(EJn.Wre descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (iF.rl(descriptor)) {
            Pl uGc = this.f6729n;
            if (!(uGc instanceof UGc)) {
                uGc = new UGc(uGc.f6714n, this.Uo);
            }
            return new C1415m(uGc, nr(), this.f6730t, (InterfaceC2252c[]) null);
        }
        if (iF.n(descriptor)) {
            Pl xo = this.f6729n;
            if (!(xo instanceof Xo)) {
                xo = new Xo(xo.f6714n, this.Uo);
            }
            return new C1415m(xo, nr(), this.f6730t, (InterfaceC2252c[]) null);
        }
        if (this.KN == null) {
            return super.J2(descriptor);
        }
        this.xMQ = descriptor.KN();
        return this;
    }

    @Override // gi.n, gi.Wre
    public void KN(byte b2) {
        if (this.Uo) {
            T(String.valueOf((int) b2));
        } else {
            this.f6729n.O(b2);
        }
    }

    @Override // gi.n
    public boolean N(EJn.Wre descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i3 = j.$EnumSwitchMapping$0[this.f6730t.ordinal()];
        if (i3 != 1) {
            boolean z2 = false;
            if (i3 != 2) {
                if (i3 != 3) {
                    if (!this.f6729n.n()) {
                        this.f6729n.J2(',');
                    }
                    this.f6729n.t();
                    T(DAz.KN(descriptor, nr(), i2));
                    this.f6729n.J2(':');
                    this.f6729n.ck();
                } else {
                    if (i2 == 0) {
                        this.Uo = true;
                    }
                    if (i2 == 1) {
                        this.f6729n.J2(',');
                        this.f6729n.ck();
                        this.Uo = false;
                    }
                }
            } else if (this.f6729n.n()) {
                this.Uo = true;
                this.f6729n.t();
            } else {
                if (i2 % 2 == 0) {
                    this.f6729n.J2(',');
                    this.f6729n.t();
                    z2 = true;
                } else {
                    this.f6729n.J2(':');
                    this.f6729n.ck();
                }
                this.Uo = z2;
            }
        } else {
            if (!this.f6729n.n()) {
                this.f6729n.J2(',');
            }
            this.f6729n.t();
        }
        return true;
    }

    @Override // gi.n, gi.Wre
    public void T(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f6729n.ty(value);
    }

    @Override // gi.n, gi.Wre
    public void Uo(double d2) {
        if (this.Uo) {
            T(String.valueOf(d2));
        } else {
            this.f6729n.Uo(d2);
        }
        if (this.J2.rl()) {
            return;
        }
        if (Double.isInfinite(d2) || Double.isNaN(d2)) {
            throw Ew.rl(Double.valueOf(d2), this.f6729n.f6714n.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    @Override // gi.Wre
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ViF(XA.eO serializer, Object obj) {
        String strT;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (nr().O().ck()) {
            serializer.serialize(this, obj);
            return;
        }
        boolean z2 = serializer instanceof AbstractC1338n;
        if (z2) {
            strT = nr().O().J2() != kotlinx.serialization.json.j.f70272n ? Zs.t(serializer.getDescriptor(), nr()) : null;
        } else {
            int i2 = Zs.j.$EnumSwitchMapping$0[nr().O().J2().ordinal()];
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                EJn.Pl kind = serializer.getDescriptor().getKind();
                if (Intrinsics.areEqual(kind, Xo.j.f2283n) || Intrinsics.areEqual(kind, Xo.Ml.f2282n)) {
                }
            }
        }
        if (z2) {
            AbstractC1338n abstractC1338n = (AbstractC1338n) serializer;
            if (obj == null) {
                throw new IllegalArgumentException(("Value for serializer " + abstractC1338n.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            XA.eO eOVarRl = XA.Dsr.rl(abstractC1338n, this, obj);
            if (strT != null) {
                Zs.O(serializer, eOVarRl, strT);
                Zs.rl(eOVarRl.getDescriptor().getKind());
            }
            Intrinsics.checkNotNull(eOVarRl, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>");
            serializer = eOVarRl;
        }
        if (strT != null) {
            String strKN = serializer.getDescriptor().KN();
            this.KN = strT;
            this.xMQ = strKN;
        }
        serializer.serialize(this, obj);
    }

    @Override // gi.n, gi.Ml
    public void X(EJn.Wre descriptor, int i2, XA.eO serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (obj != null || this.J2.mUb()) {
            super.X(descriptor, i2, serializer, obj);
        }
    }

    @Override // gi.n, gi.Wre
    public void XQ(boolean z2) {
        if (this.Uo) {
            T(String.valueOf(z2));
        } else {
            this.f6729n.az(z2);
        }
    }

    @Override // gi.n, gi.Wre
    public void aYN(float f3) {
        if (this.Uo) {
            T(String.valueOf(f3));
        } else {
            this.f6729n.KN(f3);
        }
        if (this.J2.rl()) {
            return;
        }
        if (Float.isInfinite(f3) || Float.isNaN(f3)) {
            throw Ew.rl(Float.valueOf(f3), this.f6729n.f6714n.toString());
        }
    }

    @Override // gi.n, gi.Wre
    public void az(long j2) {
        if (this.Uo) {
            T(String.valueOf(j2));
        } else {
            this.f6729n.mUb(j2);
        }
    }

    @Override // kotlinx.serialization.json.InterfaceC2252c
    public void iF(kotlinx.serialization.json.Dsr element) {
        Intrinsics.checkNotNullParameter(element, "element");
        if (this.KN == null || (element instanceof kotlinx.serialization.json.nKK)) {
            ViF(kotlinx.serialization.json.QJ.f70267n, element);
        } else {
            Zs.nr(this.xMQ, element);
            throw new KotlinNothingValueException();
        }
    }

    @Override // gi.Wre
    /* JADX INFO: renamed from: n */
    public DGv.Ml getSerializersModule() {
        return this.f6728O;
    }

    @Override // kotlinx.serialization.json.InterfaceC2252c
    public kotlinx.serialization.json.n nr() {
        return this.rl;
    }

    @Override // gi.n, gi.Wre
    public void o(short s2) {
        if (this.Uo) {
            T(String.valueOf((int) s2));
        } else {
            this.f6729n.qie(s2);
        }
    }

    @Override // gi.Ml
    public boolean r(EJn.Wre descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.J2.xMQ();
    }

    @Override // gi.n, gi.Wre
    public gi.Ml rl(EJn.Wre descriptor) {
        InterfaceC2252c interfaceC2252c;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        O oRl = LEl.rl(nr(), descriptor);
        char c2 = oRl.f6708n;
        if (c2 != 0) {
            this.f6729n.J2(c2);
            this.f6729n.rl();
        }
        String str = this.KN;
        if (str != null) {
            String strKN = this.xMQ;
            if (strKN == null) {
                strKN = descriptor.KN();
            }
            s7N(str, strKN);
            this.KN = null;
            this.xMQ = null;
        }
        if (this.f6730t == oRl) {
            return this;
        }
        InterfaceC2252c[] interfaceC2252cArr = this.nr;
        return (interfaceC2252cArr == null || (interfaceC2252c = interfaceC2252cArr[oRl.ordinal()]) == null) ? new C1415m(this.f6729n, nr(), oRl, this.nr) : interfaceC2252c;
    }

    @Override // gi.n, gi.Ml
    public void t(EJn.Wre descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (this.f6730t.f6709t != 0) {
            this.f6729n.Ik();
            this.f6729n.nr();
            this.f6729n.J2(this.f6730t.f6709t);
        }
    }

    @Override // gi.n, gi.Wre
    public void nY(char c2) {
        T(String.valueOf(c2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1415m(g9s output, kotlinx.serialization.json.n json, O mode, InterfaceC2252c[] modeReuseCache) {
        this(r.n(output, json), json, mode, modeReuseCache);
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(modeReuseCache, "modeReuseCache");
    }
}
