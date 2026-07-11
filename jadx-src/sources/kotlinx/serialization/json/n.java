package kotlinx.serialization.json;

import Mms.M;
import Mms.O;
import Mms.P;
import Mms.mz;
import Mms.pO;
import Mms.yg;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class n implements XA.g9s {
    public static final j nr = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CN3 f70276n;
    private final DGv.Ml rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Mms.ci f70277t;

    public static final class j extends n {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
            super(new CN3(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null), DGv.Wre.n(), null);
        }
    }

    public /* synthetic */ n(CN3 cn3, DGv.Ml ml, DefaultConstructorMarker defaultConstructorMarker) {
        this(cn3, ml);
    }

    private n(CN3 cn3, DGv.Ml ml) {
        this.f70276n = cn3;
        this.rl = ml;
        this.f70277t = new Mms.ci();
    }

    public final Mms.ci J2() {
        return this.f70277t;
    }

    public final CN3 O() {
        return this.f70276n;
    }

    @Override // XA.Pl
    public DGv.Ml n() {
        return this.rl;
    }

    public final Object nr(XA.w6 deserializer, Dsr element) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(element, "element");
        return mz.n(this, element, deserializer);
    }

    @Override // XA.g9s
    public final String rl(XA.eO serializer, Object obj) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        M m2 = new M();
        try {
            Mms.iwV.n(this, m2, serializer, obj);
            return m2.toString();
        } finally {
            m2.Uo();
        }
    }

    @Override // XA.g9s
    public final Object t(XA.w6 deserializer, String string) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(string, "string");
        yg ygVarN = pO.n(this, string);
        Object objQie = new P(this, O.f6703O, ygVarN, deserializer.getDescriptor(), null).qie(deserializer);
        ygVarN.aYN();
        return objQie;
    }
}
