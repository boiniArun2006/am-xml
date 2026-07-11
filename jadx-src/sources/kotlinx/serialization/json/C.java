package kotlinx.serialization.json;

import Du.Zs;
import Mms.l4Z;
import Mms.yg;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class C {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final EJn.Wre f70255n = Zs.n("kotlinx.serialization.json.JsonUnquotedLiteral", WY.j.T(StringCompanionObject.INSTANCE));

    public static final String J2(qf qfVar) {
        Intrinsics.checkNotNullParameter(qfVar, "<this>");
        if (qfVar instanceof afx) {
            return null;
        }
        return qfVar.t();
    }

    public static final float KN(qf qfVar) {
        Intrinsics.checkNotNullParameter(qfVar, "<this>");
        return Float.parseFloat(qfVar.t());
    }

    public static final Boolean O(qf qfVar) {
        Intrinsics.checkNotNullParameter(qfVar, "<this>");
        return l4Z.nr(qfVar.t());
    }

    public static final double Uo(qf qfVar) {
        Intrinsics.checkNotNullParameter(qfVar, "<this>");
        return Double.parseDouble(qfVar.t());
    }

    public static final EJn.Wre gh() {
        return f70255n;
    }

    public static final qf mUb(Dsr dsr) {
        Intrinsics.checkNotNullParameter(dsr, "<this>");
        qf qfVar = dsr instanceof qf ? (qf) dsr : null;
        if (qfVar != null) {
            return qfVar;
        }
        nr(dsr, "JsonPrimitive");
        throw new KotlinNothingValueException();
    }

    public static final qf n(Boolean bool) {
        return bool == null ? afx.INSTANCE : new r(bool, false, null, 4, null);
    }

    private static final Void nr(Dsr dsr, String str) {
        throw new IllegalArgumentException("Element " + Reflection.getOrCreateKotlinClass(dsr.getClass()) + " is not a " + str);
    }

    public static final long qie(qf qfVar) {
        Intrinsics.checkNotNullParameter(qfVar, "<this>");
        return new yg(qfVar.t()).ck();
    }

    public static final qf rl(Number number) {
        return number == null ? afx.INSTANCE : new r(number, false, null, 4, null);
    }

    public static final qf t(String str) {
        return str == null ? afx.INSTANCE : new r(str, true, null, 4, null);
    }

    public static final nKK xMQ(Dsr dsr) {
        Intrinsics.checkNotNullParameter(dsr, "<this>");
        nKK nkk = dsr instanceof nKK ? (nKK) dsr : null;
        if (nkk != null) {
            return nkk;
        }
        nr(dsr, "JsonObject");
        throw new KotlinNothingValueException();
    }
}
