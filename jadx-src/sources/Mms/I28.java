package Mms;

import Du.AbstractC1338n;
import Du.FKk;
import EJn.Pl;
import EJn.Xo;
import Mms.Zs;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.InterfaceC2252c;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
abstract class I28 extends FKk implements InterfaceC2252c {
    private String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private String f6684O;
    protected final kotlinx.serialization.json.CN3 nr;
    private final kotlinx.serialization.json.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Function1 f6685t;

    public static final class j extends gi.n {
        final /* synthetic */ String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ EJn.Wre f6687t;

        j(String str, EJn.Wre wre) {
            this.rl = str;
            this.f6687t = wre;
        }

        @Override // gi.n, gi.Wre
        public void T(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            I28.this.ul(this.rl, new kotlinx.serialization.json.r(value, false, this.f6687t));
        }

        @Override // gi.Wre
        /* JADX INFO: renamed from: n */
        public DGv.Ml getSerializersModule() {
            return I28.this.nr().n();
        }
    }

    public static final class n extends gi.n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final DGv.Ml f6688n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f6689t;

        n(String str) {
            this.f6689t = str;
            this.f6688n = I28.this.nr().n();
        }

        @Override // gi.Wre
        /* JADX INFO: renamed from: n */
        public DGv.Ml getSerializersModule() {
            return this.f6688n;
        }

        public final void s7N(String s2) {
            Intrinsics.checkNotNullParameter(s2, "s");
            I28.this.ul(this.f6689t, new kotlinx.serialization.json.r(s2, false, null, 4, null));
        }

        @Override // gi.n, gi.Wre
        public void E2(int i2) {
            s7N(Long.toString(((long) UInt.m408constructorimpl(i2)) & 4294967295L, 10));
        }

        @Override // gi.n, gi.Wre
        public void KN(byte b2) {
            s7N(UByte.m375toStringimpl(UByte.m331constructorimpl(b2)));
        }

        @Override // gi.n, gi.Wre
        public void az(long j2) {
            s7N(fuX.n(ULong.m487constructorimpl(j2), 10));
        }

        @Override // gi.n, gi.Wre
        public void o(short s2) {
            s7N(UShort.m638toStringimpl(UShort.m594constructorimpl(s2)));
        }
    }

    public /* synthetic */ I28(kotlinx.serialization.json.n nVar, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, function1);
    }

    @Override // Du.FKk
    protected String J(String parentName, String childName) {
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    public abstract kotlinx.serialization.json.Dsr Mx();

    @Override // gi.Wre
    public void g() {
    }

    public abstract void ul(String str, kotlinx.serialization.json.Dsr dsr);

    private I28(kotlinx.serialization.json.n nVar, Function1 function1) {
        this.rl = nVar;
        this.f6685t = function1;
        this.nr = nVar.O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Nxk(I28 i28, kotlinx.serialization.json.Dsr node) {
        Intrinsics.checkNotNullParameter(node, "node");
        i28.ul((String) i28.eF(), node);
        return Unit.INSTANCE;
    }

    private final n eWT(String str) {
        return new n(str);
    }

    private final j fcU(String str, EJn.Wre wre) {
        return new j(str, wre);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.AZy
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void M7(String tag, String value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(value, "value");
        ul(tag, kotlinx.serialization.json.C.t(value));
    }

    @Override // Du.FKk
    protected String D(EJn.Wre descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return DAz.KN(descriptor, this.rl, i2);
    }

    protected final Function1 G7() {
        return this.f6685t;
    }

    @Override // Du.AZy, gi.Wre
    public gi.Wre J2(EJn.Wre descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (E() == null) {
            return new Ln(this.rl, this.f6685t).J2(descriptor);
        }
        if (this.f6684O != null) {
            this.J2 = descriptor.KN();
        }
        return super.J2(descriptor);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    @Override // gi.Wre
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ViF(XA.eO serializer, Object obj) {
        String strT;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (E() == null && AbstractC1417p.t(LEl.n(serializer.getDescriptor(), getSerializersModule()))) {
            new Ln(this.rl, this.f6685t).ViF(serializer, obj);
            return;
        }
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
            this.f6684O = strT;
            this.J2 = strKN;
        }
        serializer.serialize(this, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.AZy
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void nHg(String tag, boolean z2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        ul(tag, kotlinx.serialization.json.C.n(Boolean.valueOf(z2)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.AZy
    /* JADX INFO: renamed from: dR0, reason: merged with bridge method [inline-methods] */
    public void wTp(String tag, char c2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        ul(tag, kotlinx.serialization.json.C.t(String.valueOf(c2)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.AZy
    /* JADX INFO: renamed from: eTf, reason: merged with bridge method [inline-methods] */
    public void jB(String tag, int i2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        ul(tag, kotlinx.serialization.json.C.rl(Integer.valueOf(i2)));
    }

    @Override // kotlinx.serialization.json.InterfaceC2252c
    public void iF(kotlinx.serialization.json.Dsr element) {
        Intrinsics.checkNotNullParameter(element, "element");
        if (this.f6684O == null || (element instanceof kotlinx.serialization.json.nKK)) {
            ViF(kotlinx.serialization.json.QJ.f70267n, element);
        } else {
            Zs.nr(this.J2, element);
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.AZy
    /* JADX INFO: renamed from: ijL, reason: merged with bridge method [inline-methods] */
    public void bzg(String tag, float f3) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        ul(tag, kotlinx.serialization.json.C.rl(Float.valueOf(f3)));
        if (this.nr.rl()) {
            return;
        }
        if (Float.isInfinite(f3) || Float.isNaN(f3)) {
            throw Ew.t(Float.valueOf(f3), tag, Mx().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.AZy
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void s7N(String tag, byte b2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        ul(tag, kotlinx.serialization.json.C.rl(Byte.valueOf(b2)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.AZy
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public gi.Wre Xw(String tag, EJn.Wre inlineDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        return iF.rl(inlineDescriptor) ? eWT(tag) : iF.n(inlineDescriptor) ? fcU(tag, inlineDescriptor) : super.Xw(tag, inlineDescriptor);
    }

    @Override // gi.Wre
    /* JADX INFO: renamed from: n */
    public final DGv.Ml getSerializersModule() {
        return this.rl.n();
    }

    @Override // kotlinx.serialization.json.InterfaceC2252c
    public final kotlinx.serialization.json.n nr() {
        return this.rl;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.AZy
    /* JADX INFO: renamed from: ofS, reason: merged with bridge method [inline-methods] */
    public void P5(String tag, short s2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        ul(tag, kotlinx.serialization.json.C.rl(Short.valueOf(s2)));
    }

    @Override // Du.AZy
    protected void p5(EJn.Wre descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f6685t.invoke(Mx());
    }

    protected void pJg(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        ul(tag, kotlinx.serialization.json.afx.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.AZy
    /* JADX INFO: renamed from: piY, reason: merged with bridge method [inline-methods] */
    public void rV9(String tag, EJn.Wre enumDescriptor, int i2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        ul(tag, kotlinx.serialization.json.C.t(enumDescriptor.O(i2)));
    }

    @Override // gi.Ml
    public boolean r(EJn.Wre descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.nr.xMQ();
    }

    @Override // gi.Wre
    public gi.Ml rl(EJn.Wre descriptor) {
        I28 hVar;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Function1 function1 = E() == null ? this.f6685t : new Function1() { // from class: Mms.Ml
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return I28.Nxk(this.f6702n, (kotlinx.serialization.json.Dsr) obj);
            }
        };
        EJn.Pl kind = descriptor.getKind();
        if (Intrinsics.areEqual(kind, Xo.n.f2284n) || (kind instanceof EJn.Ml)) {
            hVar = new h(this.rl, function1);
        } else if (Intrinsics.areEqual(kind, Xo.w6.f2285n)) {
            kotlinx.serialization.json.n nVar = this.rl;
            EJn.Wre wreN = LEl.n(descriptor.Uo(0), nVar.n());
            EJn.Pl kind2 = wreN.getKind();
            if ((kind2 instanceof EJn.I28) || Intrinsics.areEqual(kind2, Pl.n.f2281n)) {
                hVar = new psW(this.rl, function1);
            } else {
                if (!nVar.O().t()) {
                    throw Ew.nr(wreN);
                }
                hVar = new h(this.rl, function1);
            }
        } else {
            hVar = new vd(this.rl, function1);
        }
        String str = this.f6684O;
        if (str != null) {
            if (hVar instanceof psW) {
                psW psw = (psW) hVar;
                psw.ul("key", kotlinx.serialization.json.C.t(str));
                String strKN = this.J2;
                if (strKN == null) {
                    strKN = descriptor.KN();
                }
                psw.ul("value", kotlinx.serialization.json.C.t(strKN));
            } else {
                String strKN2 = this.J2;
                if (strKN2 == null) {
                    strKN2 = descriptor.KN();
                }
                hVar.ul(str, kotlinx.serialization.json.C.t(strKN2));
            }
            this.f6684O = null;
            this.J2 = null;
        }
        return hVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.AZy
    /* JADX INFO: renamed from: xg, reason: merged with bridge method [inline-methods] */
    public void U(String tag, long j2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        ul(tag, kotlinx.serialization.json.C.rl(Long.valueOf(j2)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.AZy
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void v(String tag, double d2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        ul(tag, kotlinx.serialization.json.C.rl(Double.valueOf(d2)));
        if (this.nr.rl()) {
            return;
        }
        if (Double.isInfinite(d2) || Double.isNaN(d2)) {
            throw Ew.t(Double.valueOf(d2), tag, Mx().toString());
        }
    }

    @Override // gi.Wre
    public void Ik() {
        String str = (String) E();
        if (str == null) {
            this.f6685t.invoke(kotlinx.serialization.json.afx.INSTANCE);
        } else {
            pJg(str);
        }
    }
}
