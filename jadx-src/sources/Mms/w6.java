package Mms;

import Du.AbstractC1338n;
import Du.QaP;
import EJn.Pl;
import EJn.Xo;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.safedk.android.analytics.brandsafety.l;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
abstract class w6 extends QaP implements kotlinx.serialization.json.fuX {
    private final String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final kotlinx.serialization.json.Dsr f6739O;
    protected final kotlinx.serialization.json.CN3 Uo;
    private final kotlinx.serialization.json.n nr;

    public /* synthetic */ w6(kotlinx.serialization.json.n nVar, kotlinx.serialization.json.Dsr dsr, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, dsr, str);
    }

    private final Void Org(kotlinx.serialization.json.qf qfVar, String str, String str2) {
        StringBuilder sb;
        String str3;
        if (StringsKt.startsWith$default(str, CmcdData.OBJECT_TYPE_INIT_SEGMENT, false, 2, (Object) null)) {
            sb = new StringBuilder();
            str3 = "an ";
        } else {
            sb = new StringBuilder();
            str3 = "a ";
        }
        sb.append(str3);
        sb.append(str);
        throw Ew.J2(-1, "Failed to parse literal '" + qfVar + "' as " + sb.toString() + " value at element: " + mYa(str2), eTf().toString());
    }

    @Override // Du.QaP
    protected String Nxk(String parentName, String childName) {
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract kotlinx.serialization.json.Dsr m(String str);

    public abstract kotlinx.serialization.json.Dsr qm();

    public void t(EJn.Wre descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    public /* synthetic */ w6(kotlinx.serialization.json.n nVar, kotlinx.serialization.json.Dsr dsr, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, dsr, (i2 & 4) != 0 ? null : str, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.dT
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public double U(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        kotlinx.serialization.json.Dsr dsrM = m(tag);
        if (dsrM instanceof kotlinx.serialization.json.qf) {
            kotlinx.serialization.json.qf qfVar = (kotlinx.serialization.json.qf) dsrM;
            try {
                double dUo = kotlinx.serialization.json.C.Uo(qfVar);
                if (nr().O().rl()) {
                    return dUo;
                }
                if (Double.isInfinite(dUo) || Double.isNaN(dUo)) {
                    throw Ew.n(Double.valueOf(dUo), tag, eTf().toString());
                }
                return dUo;
            } catch (IllegalArgumentException unused) {
                Org(qfVar, "double", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw Ew.J2(-1, "Expected " + Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.qf.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(dsrM.getClass()).getSimpleName() + " as the serialized body of double at element: " + mYa(tag), dsrM.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.dT
    /* JADX INFO: renamed from: G7, reason: merged with bridge method [inline-methods] */
    public float M7(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        kotlinx.serialization.json.Dsr dsrM = m(tag);
        if (dsrM instanceof kotlinx.serialization.json.qf) {
            kotlinx.serialization.json.qf qfVar = (kotlinx.serialization.json.qf) dsrM;
            try {
                float fKN = kotlinx.serialization.json.C.KN(qfVar);
                if (nr().O().rl()) {
                    return fKN;
                }
                if (Float.isInfinite(fKN) || Float.isNaN(fKN)) {
                    throw Ew.n(Float.valueOf(fKN), tag, eTf().toString());
                }
                return fKN;
            } catch (IllegalArgumentException unused) {
                Org(qfVar, "float", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw Ew.J2(-1, "Expected " + Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.qf.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(dsrM.getClass()).getSimpleName() + " as the serialized body of float at element: " + mYa(tag), dsrM.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.dT
    /* JADX INFO: renamed from: Jk, reason: merged with bridge method [inline-methods] */
    public String FX(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        kotlinx.serialization.json.Dsr dsrM = m(tag);
        if (!(dsrM instanceof kotlinx.serialization.json.qf)) {
            throw Ew.J2(-1, "Expected " + Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.qf.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(dsrM.getClass()).getSimpleName() + " as the serialized body of string at element: " + mYa(tag), dsrM.toString());
        }
        kotlinx.serialization.json.qf qfVar = (kotlinx.serialization.json.qf) dsrM;
        if (!(qfVar instanceof kotlinx.serialization.json.r)) {
            throw Ew.J2(-1, "Expected string value for a non-null key '" + tag + "', got null literal instead at element: " + mYa(tag), eTf().toString());
        }
        kotlinx.serialization.json.r rVar = (kotlinx.serialization.json.r) qfVar;
        if (rVar.J2() || nr().O().Ik()) {
            return rVar.t();
        }
        throw Ew.J2(-1, "String literal for key '" + tag + "' should be quoted at element: " + mYa(tag) + ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", eTf().toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.dT
    /* JADX INFO: renamed from: Mx, reason: merged with bridge method [inline-methods] */
    public int P5(String tag, EJn.Wre enumDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        kotlinx.serialization.json.n nVarNr = nr();
        kotlinx.serialization.json.Dsr dsrM = m(tag);
        String strKN = enumDescriptor.KN();
        if (dsrM instanceof kotlinx.serialization.json.qf) {
            return DAz.gh(enumDescriptor, nVarNr, ((kotlinx.serialization.json.qf) dsrM).t(), null, 4, null);
        }
        throw Ew.J2(-1, "Expected " + Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.qf.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(dsrM.getClass()).getSimpleName() + " as the serialized body of " + strKN + " at element: " + mYa(tag), dsrM.toString());
    }

    protected final String Rl() {
        return this.J2;
    }

    @Override // Du.dT, gi.I28
    public gi.I28 az(EJn.Wre descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return B() != null ? super.az(descriptor) : new qf(nr(), qm(), this.J2).az(descriptor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.dT
    /* JADX INFO: renamed from: eWT, reason: merged with bridge method [inline-methods] */
    public int eF(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        kotlinx.serialization.json.Dsr dsrM = m(tag);
        if (dsrM instanceof kotlinx.serialization.json.qf) {
            kotlinx.serialization.json.qf qfVar = (kotlinx.serialization.json.qf) dsrM;
            try {
                long jQie = kotlinx.serialization.json.C.qie(qfVar);
                Integer numValueOf = (-2147483648L > jQie || jQie > 2147483647L) ? null : Integer.valueOf((int) jQie);
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
                Org(qfVar, l.f62668w, tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                Org(qfVar, l.f62668w, tag);
                throw new KotlinNothingValueException();
            }
        }
        throw Ew.J2(-1, "Expected " + Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.qf.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(dsrM.getClass()).getSimpleName() + " as the serialized body of " + l.f62668w + " at element: " + mYa(tag), dsrM.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.dT
    /* JADX INFO: renamed from: fcU, reason: merged with bridge method [inline-methods] */
    public gi.I28 p5(String tag, EJn.Wre inlineDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        if (!iF.rl(inlineDescriptor)) {
            return super.p5(tag, inlineDescriptor);
        }
        kotlinx.serialization.json.n nVarNr = nr();
        kotlinx.serialization.json.Dsr dsrM = m(tag);
        String strKN = inlineDescriptor.KN();
        if (dsrM instanceof kotlinx.serialization.json.qf) {
            return new afx(pO.n(nVarNr, ((kotlinx.serialization.json.qf) dsrM).t()), nr());
        }
        throw Ew.J2(-1, "Expected " + Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.qf.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(dsrM.getClass()).getSimpleName() + " as the serialized body of " + strKN + " at element: " + mYa(tag), dsrM.toString());
    }

    public final String mYa(String currentTag) {
        Intrinsics.checkNotNullParameter(currentTag, "currentTag");
        return z() + '.' + currentTag;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.dT
    /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
    public short M(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        kotlinx.serialization.json.Dsr dsrM = m(tag);
        if (dsrM instanceof kotlinx.serialization.json.qf) {
            kotlinx.serialization.json.qf qfVar = (kotlinx.serialization.json.qf) dsrM;
            try {
                long jQie = kotlinx.serialization.json.C.qie(qfVar);
                Short shValueOf = (-32768 > jQie || jQie > 32767) ? null : Short.valueOf((short) jQie);
                if (shValueOf != null) {
                    return shValueOf.shortValue();
                }
                Org(qfVar, "short", tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                Org(qfVar, "short", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw Ew.J2(-1, "Expected " + Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.qf.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(dsrM.getClass()).getSimpleName() + " as the serialized body of short at element: " + mYa(tag), dsrM.toString());
    }

    @Override // kotlinx.serialization.json.fuX
    public kotlinx.serialization.json.n nr() {
        return this.nr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.dT
    /* JADX INFO: renamed from: ofS, reason: merged with bridge method [inline-methods] */
    public char jB(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        kotlinx.serialization.json.Dsr dsrM = m(tag);
        if (dsrM instanceof kotlinx.serialization.json.qf) {
            kotlinx.serialization.json.qf qfVar = (kotlinx.serialization.json.qf) dsrM;
            try {
                return StringsKt.single(qfVar.t());
            } catch (IllegalArgumentException unused) {
                Org(qfVar, "char", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw Ew.J2(-1, "Expected " + Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.qf.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(dsrM.getClass()).getSimpleName() + " as the serialized body of char at element: " + mYa(tag), dsrM.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.dT
    /* JADX INFO: renamed from: pJg, reason: merged with bridge method [inline-methods] */
    public byte Xw(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        kotlinx.serialization.json.Dsr dsrM = m(tag);
        if (dsrM instanceof kotlinx.serialization.json.qf) {
            kotlinx.serialization.json.qf qfVar = (kotlinx.serialization.json.qf) dsrM;
            try {
                long jQie = kotlinx.serialization.json.C.qie(qfVar);
                Byte bValueOf = (-128 > jQie || jQie > 127) ? null : Byte.valueOf((byte) jQie);
                if (bValueOf != null) {
                    return bValueOf.byteValue();
                }
                Org(qfVar, "byte", tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                Org(qfVar, "byte", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw Ew.J2(-1, "Expected " + Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.qf.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(dsrM.getClass()).getSimpleName() + " as the serialized body of byte at element: " + mYa(tag), dsrM.toString());
    }

    @Override // gi.I28
    public Object qie(XA.w6 deserializer) {
        kotlinx.serialization.json.qf qfVarMUb;
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (!(deserializer instanceof AbstractC1338n) || nr().O().ck()) {
            return deserializer.deserialize(this);
        }
        AbstractC1338n abstractC1338n = (AbstractC1338n) deserializer;
        String strT = Zs.t(abstractC1338n.getDescriptor(), nr());
        kotlinx.serialization.json.Dsr dsrKN = KN();
        String strKN = abstractC1338n.getDescriptor().KN();
        if (dsrKN instanceof kotlinx.serialization.json.nKK) {
            kotlinx.serialization.json.nKK nkk = (kotlinx.serialization.json.nKK) dsrKN;
            kotlinx.serialization.json.Dsr dsr = (kotlinx.serialization.json.Dsr) nkk.get(strT);
            try {
                XA.w6 w6VarN = XA.Dsr.n((AbstractC1338n) deserializer, this, (dsr == null || (qfVarMUb = kotlinx.serialization.json.C.mUb(dsr)) == null) ? null : kotlinx.serialization.json.C.J2(qfVarMUb));
                Intrinsics.checkNotNull(w6VarN, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                return mz.rl(nr(), strT, nkk, w6VarN);
            } catch (SerializationException e2) {
                String message = e2.getMessage();
                Intrinsics.checkNotNull(message);
                throw Ew.J2(-1, message, nkk.toString());
            }
        }
        throw Ew.J2(-1, "Expected " + Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.nKK.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(dsrKN.getClass()).getSimpleName() + " as the serialized body of " + strKN + " at element: " + z(), dsrKN.toString());
    }

    @Override // gi.I28
    public gi.w6 rl(EJn.Wre descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        kotlinx.serialization.json.Dsr dsrETf = eTf();
        EJn.Pl kind = descriptor.getKind();
        if (Intrinsics.areEqual(kind, Xo.n.f2284n) || (kind instanceof EJn.Ml)) {
            kotlinx.serialization.json.n nVarNr = nr();
            String strKN = descriptor.KN();
            if (dsrETf instanceof kotlinx.serialization.json.w6) {
                return new Lu(nVarNr, (kotlinx.serialization.json.w6) dsrETf);
            }
            throw Ew.J2(-1, "Expected " + Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.w6.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(dsrETf.getClass()).getSimpleName() + " as the serialized body of " + strKN + " at element: " + z(), dsrETf.toString());
        }
        if (!Intrinsics.areEqual(kind, Xo.w6.f2285n)) {
            kotlinx.serialization.json.n nVarNr2 = nr();
            String strKN2 = descriptor.KN();
            if (dsrETf instanceof kotlinx.serialization.json.nKK) {
                return new rv6(nVarNr2, (kotlinx.serialization.json.nKK) dsrETf, this.J2, null, 8, null);
            }
            throw Ew.J2(-1, "Expected " + Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.nKK.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(dsrETf.getClass()).getSimpleName() + " as the serialized body of " + strKN2 + " at element: " + z(), dsrETf.toString());
        }
        kotlinx.serialization.json.n nVarNr3 = nr();
        EJn.Wre wreN = LEl.n(descriptor.Uo(0), nVarNr3.n());
        EJn.Pl kind2 = wreN.getKind();
        if ((kind2 instanceof EJn.I28) || Intrinsics.areEqual(kind2, Pl.n.f2281n)) {
            kotlinx.serialization.json.n nVarNr4 = nr();
            String strKN3 = descriptor.KN();
            if (dsrETf instanceof kotlinx.serialization.json.nKK) {
                return new K(nVarNr4, (kotlinx.serialization.json.nKK) dsrETf);
            }
            throw Ew.J2(-1, "Expected " + Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.nKK.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(dsrETf.getClass()).getSimpleName() + " as the serialized body of " + strKN3 + " at element: " + z(), dsrETf.toString());
        }
        if (!nVarNr3.O().t()) {
            throw Ew.nr(wreN);
        }
        kotlinx.serialization.json.n nVarNr5 = nr();
        String strKN4 = descriptor.KN();
        if (dsrETf instanceof kotlinx.serialization.json.w6) {
            return new Lu(nVarNr5, (kotlinx.serialization.json.w6) dsrETf);
        }
        throw Ew.J2(-1, "Expected " + Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.w6.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(dsrETf.getClass()).getSimpleName() + " as the serialized body of " + strKN4 + " at element: " + z(), dsrETf.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.dT
    /* JADX INFO: renamed from: ul, reason: merged with bridge method [inline-methods] */
    public long E(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        kotlinx.serialization.json.Dsr dsrM = m(tag);
        if (dsrM instanceof kotlinx.serialization.json.qf) {
            kotlinx.serialization.json.qf qfVar = (kotlinx.serialization.json.qf) dsrM;
            try {
                return kotlinx.serialization.json.C.qie(qfVar);
            } catch (IllegalArgumentException unused) {
                Org(qfVar, "long", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw Ew.J2(-1, "Expected " + Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.qf.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(dsrM.getClass()).getSimpleName() + " as the serialized body of long at element: " + mYa(tag), dsrM.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.dT
    /* JADX INFO: renamed from: xg, reason: merged with bridge method [inline-methods] */
    public boolean bzg(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        kotlinx.serialization.json.Dsr dsrM = m(tag);
        if (dsrM instanceof kotlinx.serialization.json.qf) {
            kotlinx.serialization.json.qf qfVar = (kotlinx.serialization.json.qf) dsrM;
            try {
                Boolean boolO = kotlinx.serialization.json.C.O(qfVar);
                if (boolO != null) {
                    return boolO.booleanValue();
                }
                Org(qfVar, "boolean", tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                Org(qfVar, "boolean", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw Ew.J2(-1, "Expected " + Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.qf.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(dsrM.getClass()).getSimpleName() + " as the serialized body of boolean at element: " + mYa(tag), dsrM.toString());
    }

    private w6(kotlinx.serialization.json.n nVar, kotlinx.serialization.json.Dsr dsr, String str) {
        this.nr = nVar;
        this.f6739O = dsr;
        this.J2 = str;
        this.Uo = nr().O();
    }

    @Override // gi.I28
    public boolean E2() {
        return !(eTf() instanceof kotlinx.serialization.json.afx);
    }

    @Override // kotlinx.serialization.json.fuX
    public kotlinx.serialization.json.Dsr KN() {
        return eTf();
    }

    protected final kotlinx.serialization.json.Dsr eTf() {
        kotlinx.serialization.json.Dsr dsrM;
        String str = (String) B();
        if (str != null && (dsrM = m(str)) != null) {
            return dsrM;
        }
        return qm();
    }

    @Override // gi.I28, gi.w6
    /* JADX INFO: renamed from: n */
    public DGv.Ml getSerializersModule() {
        return nr().n();
    }
}
