package Mms;

import Du.AbstractC1338n;
import EJn.Pl;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class P extends gi.j implements kotlinx.serialization.json.fuX {
    private int J2;
    private final kotlinx.serialization.json.CN3 KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final DGv.Ml f6711O;
    private j Uo;
    public final Mms.j nr;
    private final kotlinx.serialization.json.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final O f6712t;
    private final Z xMQ;

    private final boolean M7(j jVar, String str) {
        if (jVar == null || !Intrinsics.areEqual(jVar.f6713n, str)) {
            return false;
        }
        jVar.f6713n = null;
        return true;
    }

    @Override // gi.j, gi.I28
    public Void gh() {
        return null;
    }

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public String f6713n;

        public j(String str) {
            this.f6713n = str;
        }
    }

    public /* synthetic */ class n {
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
            try {
                iArr[O.f6703O.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public P(kotlinx.serialization.json.n json, O mode, Mms.j lexer, EJn.Wre descriptor, j jVar) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.rl = json;
        this.f6712t = mode;
        this.nr = lexer;
        this.f6711O = json.n();
        this.J2 = -1;
        this.Uo = jVar;
        kotlinx.serialization.json.CN3 cn3O = json.O();
        this.KN = cn3O;
        this.xMQ = cn3O.mUb() ? null : new Z(descriptor);
    }

    private final boolean U(EJn.Wre wre, String str) {
        if (DAz.az(wre, this.rl) || M7(this.Uo, str)) {
            this.nr.N(this.KN.Ik());
        } else {
            this.nr.rl.rl();
            this.nr.g(str);
        }
        return this.nr.v();
    }

    private final int Xw(EJn.Wre wre) {
        int iXMQ;
        boolean zV2;
        boolean zV3 = this.nr.v();
        while (true) {
            boolean z2 = true;
            if (!this.nr.J2()) {
                if (zV3 && !this.rl.O().nr()) {
                    Ew.KN(this.nr, null, 1, null);
                    throw new KotlinNothingValueException();
                }
                Z z3 = this.xMQ;
                if (z3 != null) {
                    return z3.nr();
                }
                return -1;
            }
            String strJB = jB();
            this.nr.az(':');
            iXMQ = DAz.xMQ(wre, this.rl, strJB);
            if (iXMQ == -3) {
                zV2 = false;
            } else {
                if (!this.KN.Uo() || !v(wre, iXMQ)) {
                    break;
                }
                zV2 = this.nr.v();
                z2 = false;
            }
            zV3 = z2 ? U(wre, strJB) : zV2;
        }
        Z z4 = this.xMQ;
        if (z4 != null) {
            z4.t(iXMQ);
        }
        return iXMQ;
    }

    private final int bzg() {
        int i2 = this.J2;
        boolean zV2 = false;
        boolean z2 = i2 % 2 != 0;
        if (!z2) {
            this.nr.az(':');
        } else if (i2 != -1) {
            zV2 = this.nr.v();
        }
        if (!this.nr.J2()) {
            if (!zV2 || this.rl.O().nr()) {
                return -1;
            }
            Ew.KN(this.nr, null, 1, null);
            throw new KotlinNothingValueException();
        }
        if (z2) {
            if (this.J2 == -1) {
                Mms.j jVar = this.nr;
                int i3 = jVar.f6723n;
                if (zV2) {
                    Mms.j.nY(jVar, "Unexpected leading comma", i3, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                Mms.j jVar2 = this.nr;
                boolean z3 = zV2;
                int i5 = jVar2.f6723n;
                if (!z3) {
                    Mms.j.nY(jVar2, "Expected comma after the key-value pair", i5, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        int i7 = this.J2 + 1;
        this.J2 = i7;
        return i7;
    }

    private final String jB() {
        return this.KN.Ik() ? this.nr.Z() : this.nr.mUb();
    }

    private final int rV9() {
        boolean zV2 = this.nr.v();
        if (!this.nr.J2()) {
            if (!zV2 || this.rl.O().nr()) {
                return -1;
            }
            Ew.Uo(this.nr, "array");
            throw new KotlinNothingValueException();
        }
        int i2 = this.J2;
        if (i2 != -1 && !zV2) {
            Mms.j.nY(this.nr, "Expected end of the array or comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i3 = i2 + 1;
        this.J2 = i3;
        return i3;
    }

    private final boolean v(EJn.Wre wre, int i2) {
        String strX;
        kotlinx.serialization.json.n nVar = this.rl;
        boolean zXMQ = wre.xMQ(i2);
        EJn.Wre wreUo = wre.Uo(i2);
        if (zXMQ && !wreUo.rl() && this.nr.rV9(true)) {
            return true;
        }
        if (!Intrinsics.areEqual(wreUo.getKind(), Pl.n.f2281n) || ((wreUo.rl() && this.nr.rV9(false)) || (strX = this.nr.X(this.KN.Ik())) == null)) {
            return false;
        }
        int iXMQ = DAz.xMQ(wreUo, nVar, strX);
        boolean z2 = !nVar.O().mUb() && wreUo.rl();
        if (iXMQ == -3 && (zXMQ || z2)) {
            this.nr.Ik();
            return true;
        }
        return false;
    }

    private final void wTp() {
        if (this.nr.e() != 4) {
            return;
        }
        Mms.j.nY(this.nr, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // gi.j, gi.I28
    public boolean E2() {
        Z z2 = this.xMQ;
        return ((z2 != null ? z2.rl() : false) || Mms.j.bzg(this.nr, false, 1, null)) ? false : true;
    }

    @Override // kotlinx.serialization.json.fuX
    public kotlinx.serialization.json.Dsr KN() {
        return new Md(this.rl.O(), this.nr).O();
    }

    @Override // gi.j, gi.I28
    public byte N() {
        long jTy = this.nr.ty();
        byte b2 = (byte) jTy;
        if (jTy == b2) {
            return b2;
        }
        Mms.j.nY(this.nr, "Failed to parse byte for input '" + jTy + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // gi.j, gi.I28
    public int S(EJn.Wre enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return DAz.mUb(enumDescriptor, this.rl, g(), " at path " + this.nr.rl.n());
    }

    @Override // gi.j, gi.I28
    public boolean WPU() {
        return this.nr.KN();
    }

    @Override // gi.j, gi.I28
    public double Z() {
        Mms.j jVar = this.nr;
        String strO = jVar.o();
        try {
            double d2 = Double.parseDouble(strO);
            if (this.rl.O().rl()) {
                return d2;
            }
            if (!Double.isInfinite(d2) && !Double.isNaN(d2)) {
                return d2;
            }
            Ew.gh(this.nr, Double.valueOf(d2));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            Mms.j.nY(jVar, "Failed to parse type 'double' for input '" + strO + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // gi.j, gi.I28
    public char aYN() {
        String strO = this.nr.o();
        if (strO.length() == 1) {
            return strO.charAt(0);
        }
        Mms.j.nY(this.nr, "Expected single char, but got '" + strO + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // gi.j, gi.I28
    public gi.I28 az(EJn.Wre descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return iF.rl(descriptor) ? new afx(this.nr, this.rl) : super.az(descriptor);
    }

    @Override // gi.j, gi.w6
    public Object fD(EJn.Wre descriptor, int i2, XA.w6 deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        boolean z2 = this.f6712t == O.f6707r && (i2 & 1) == 0;
        if (z2) {
            this.nr.rl.nr();
        }
        Object objFD = super.fD(descriptor, i2, deserializer, obj);
        if (z2) {
            this.nr.rl.J2(objFD);
        }
        return objFD;
    }

    @Override // gi.j, gi.I28
    public String g() {
        return this.KN.Ik() ? this.nr.Z() : this.nr.Ik();
    }

    @Override // gi.I28, gi.w6
    /* JADX INFO: renamed from: n */
    public DGv.Ml getSerializersModule() {
        return this.f6711O;
    }

    @Override // gi.w6
    public int nY(EJn.Wre descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i2 = n.$EnumSwitchMapping$0[this.f6712t.ordinal()];
        int iRV9 = i2 != 2 ? i2 != 4 ? rV9() : Xw(descriptor) : bzg();
        if (this.f6712t != O.f6707r) {
            this.nr.rl.Uo(iRV9);
        }
        return iRV9;
    }

    @Override // kotlinx.serialization.json.fuX
    public final kotlinx.serialization.json.n nr() {
        return this.rl;
    }

    @Override // gi.j, gi.I28
    public float o() {
        Mms.j jVar = this.nr;
        String strO = jVar.o();
        try {
            float f3 = Float.parseFloat(strO);
            if (this.rl.O().rl()) {
                return f3;
            }
            if (!Float.isInfinite(f3) && !Float.isNaN(f3)) {
                return f3;
            }
            Ew.gh(this.nr, Float.valueOf(f3));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            Mms.j.nY(jVar, "Failed to parse type 'float' for input '" + strO + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015b  */
    @Override // gi.I28
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object qie(XA.w6 deserializer) {
        String message;
        kotlinx.serialization.json.qf qfVarMUb;
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        try {
        } catch (MissingFieldException e2) {
            message = e2.getMessage();
            Intrinsics.checkNotNull(message);
            if (!StringsKt.contains$default((CharSequence) message, (CharSequence) "at path", false, 2, (Object) null)) {
            }
        }
        if ((deserializer instanceof AbstractC1338n) && !this.rl.O().ck()) {
            String strT = Zs.t(((AbstractC1338n) deserializer).getDescriptor(), this.rl);
            String strE2 = this.nr.E2(strT, this.KN.Ik());
            if (strE2 != null) {
                try {
                    XA.w6 w6VarN = XA.Dsr.n((AbstractC1338n) deserializer, this, strE2);
                    Intrinsics.checkNotNull(w6VarN, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.StreamingJsonDecoder.decodeSerializableValue>");
                    this.Uo = new j(strT);
                    return w6VarN.deserialize(this);
                } catch (SerializationException e3) {
                    String message2 = e3.getMessage();
                    Intrinsics.checkNotNull(message2);
                    String strRemoveSuffix = StringsKt.removeSuffix(StringsKt.substringBefore$default(message2, '\n', (String) null, 2, (Object) null), (CharSequence) ".");
                    String message3 = e3.getMessage();
                    Intrinsics.checkNotNull(message3);
                    Mms.j.nY(this.nr, strRemoveSuffix, 0, StringsKt.substringAfter(message3, '\n', ""), 2, null);
                    throw new KotlinNothingValueException();
                }
            }
            if (deserializer != null && !nr().O().ck()) {
                String strT2 = Zs.t(((AbstractC1338n) deserializer).getDescriptor(), nr());
                kotlinx.serialization.json.Dsr dsrKN = KN();
                String strKN = ((AbstractC1338n) deserializer).getDescriptor().KN();
                if (dsrKN instanceof kotlinx.serialization.json.nKK) {
                    kotlinx.serialization.json.nKK nkk = (kotlinx.serialization.json.nKK) dsrKN;
                    kotlinx.serialization.json.Dsr dsr = (kotlinx.serialization.json.Dsr) nkk.get(strT2);
                    try {
                        XA.w6 w6VarN2 = XA.Dsr.n((AbstractC1338n) deserializer, this, (dsr == null || (qfVarMUb = kotlinx.serialization.json.C.mUb(dsr)) == null) ? null : kotlinx.serialization.json.C.J2(qfVarMUb));
                        Intrinsics.checkNotNull(w6VarN2, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                        return mz.rl(nr(), strT2, nkk, w6VarN2);
                    } catch (SerializationException e4) {
                        String message4 = e4.getMessage();
                        Intrinsics.checkNotNull(message4);
                        throw Ew.J2(-1, message4, nkk.toString());
                    }
                }
                throw Ew.J2(-1, "Expected " + Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.nKK.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(dsrKN.getClass()).getSimpleName() + " as the serialized body of " + strKN + " at element: " + this.nr.rl.n(), dsrKN.toString());
            }
            return deserializer.deserialize(this);
            message = e2.getMessage();
            Intrinsics.checkNotNull(message);
            if (!StringsKt.contains$default((CharSequence) message, (CharSequence) "at path", false, 2, (Object) null)) {
                throw e2;
            }
            throw new MissingFieldException(e2.getMissingFields(), e2.getMessage() + " at path: " + this.nr.rl.n(), e2);
        }
        return deserializer.deserialize(this);
    }

    @Override // gi.j, gi.I28
    public short r() {
        long jTy = this.nr.ty();
        short s2 = (short) jTy;
        if (jTy == s2) {
            return s2;
        }
        Mms.j.nY(this.nr, "Failed to parse short for input '" + jTy + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // gi.j, gi.I28
    public gi.w6 rl(EJn.Wre descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        O oRl = LEl.rl(this.rl, descriptor);
        this.nr.rl.t(descriptor);
        this.nr.az(oRl.f6708n);
        wTp();
        int i2 = n.$EnumSwitchMapping$0[oRl.ordinal()];
        return (i2 == 1 || i2 == 2 || i2 == 3) ? new P(this.rl, oRl, this.nr, descriptor, this.Uo) : (this.f6712t == oRl && this.rl.O().mUb()) ? this : new P(this.rl, oRl, this.nr, descriptor, this.Uo);
    }

    @Override // gi.j, gi.w6
    public void t(EJn.Wre descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor.nr() == 0 && DAz.az(descriptor, this.rl)) {
            P5(descriptor);
        }
        if (this.nr.v() && !this.rl.O().nr()) {
            Ew.Uo(this.nr, "");
            throw new KotlinNothingValueException();
        }
        this.nr.az(this.f6712t.f6709t);
        this.nr.rl.rl();
    }

    @Override // gi.j, gi.I28
    public long ty() {
        return this.nr.ty();
    }

    @Override // gi.j, gi.I28
    public int xMQ() {
        long jTy = this.nr.ty();
        int i2 = (int) jTy;
        if (jTy == i2) {
            return i2;
        }
        Mms.j.nY(this.nr, "Failed to parse int for input '" + jTy + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final void P5(EJn.Wre wre) {
        while (nY(wre) != -1) {
        }
    }
}
