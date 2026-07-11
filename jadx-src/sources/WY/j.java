package WY;

import Du.B;
import Du.C;
import Du.C1337m;
import Du.C1339o;
import Du.C1343z;
import Du.D;
import Du.Dsr;
import Du.Ew;
import Du.FPL;
import Du.IE;
import Du.IG;
import Du.M;
import Du.Mf;
import Du.Mo;
import Du.OA;
import Du.Pmq;
import Du.QJ;
import Du.RzR;
import Du.U;
import Du.V;
import Du.VoU;
import Du.Wre;
import Du.Y5;
import Du.Z;
import Du.afx;
import Du.eZk;
import Du.fg;
import Du.fuX;
import Du.gnv;
import Du.iF;
import Du.mz;
import Du.pq;
import Du.rv6;
import Du.s6u;
import Du.t6;
import Du.zpl;
import XA.Ml;
import com.alightcreative.time.Kw.znsSxz;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.Unit;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.time.Duration;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class j {
    public static final Ml E2(IntCompanionObject intCompanionObject) {
        Intrinsics.checkNotNullParameter(intCompanionObject, "<this>");
        return iF.f2020n;
    }

    public static final Ml HI(Ml aSerializer, Ml bSerializer, Ml cSerializer) {
        Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
        Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
        Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
        return new V(aSerializer, bSerializer, cSerializer);
    }

    public static final Ml Ik() {
        return VoU.f1997t;
    }

    public static final Ml J2() {
        return M.f1969t;
    }

    public static final Ml KN(Ml elementSerializer) {
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new Wre(elementSerializer);
    }

    public static final Ml N(Duration.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return Ew.f1957n;
    }

    public static final Ml O() {
        return afx.f2004t;
    }

    public static final Ml S(UInt.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return s6u.f2050n;
    }

    public static final Ml T(StringCompanionObject stringCompanionObject) {
        Intrinsics.checkNotNullParameter(stringCompanionObject, "<this>");
        return Y5.f2000n;
    }

    public static final Ml Uo() {
        return C1337m.f2025t;
    }

    public static final Ml ViF(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, znsSxz.nYypbuF);
        return IE.rl;
    }

    public static final Ml WPU(ULong.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return D.f1949n;
    }

    public static final Ml X(ShortCompanionObject shortCompanionObject) {
        Intrinsics.checkNotNullParameter(shortCompanionObject, "<this>");
        return FPL.f1958n;
    }

    public static final Ml XQ(UByte.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return Mo.f1974n;
    }

    public static final Ml Z(Ml ml) {
        Intrinsics.checkNotNullParameter(ml, "<this>");
        return ml.getDescriptor().rl() ? ml : new pq(ml);
    }

    public static final Ml aYN(UShort.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return U.f1992n;
    }

    public static final Ml az(Ml keySerializer, Ml valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new B(keySerializer, valueSerializer);
    }

    public static final Ml ck() {
        return OA.f1977t;
    }

    public static final Ml e(LongCompanionObject longCompanionObject) {
        Intrinsics.checkNotNullParameter(longCompanionObject, "<this>");
        return fg.f2014n;
    }

    public static final Ml fD(FloatCompanionObject floatCompanionObject) {
        Intrinsics.checkNotNullParameter(floatCompanionObject, "<this>");
        return rv6.f2048n;
    }

    public static final Ml g(ByteCompanionObject byteCompanionObject) {
        Intrinsics.checkNotNullParameter(byteCompanionObject, "<this>");
        return C1339o.f2035n;
    }

    public static final Ml gh(Ml keySerializer, Ml valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new mz(keySerializer, valueSerializer);
    }

    public static final Ml iF(DoubleCompanionObject doubleCompanionObject) {
        Intrinsics.checkNotNullParameter(doubleCompanionObject, "<this>");
        return Z.f2001n;
    }

    public static final Ml mUb(Ml keySerializer, Ml ml) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(ml, znsSxz.SIOw);
        return new Mf(keySerializer, ml);
    }

    public static final Ml n(KClass kClass, Ml elementSerializer) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new Pmq(kClass, elementSerializer);
    }

    public static final Ml nHg(Uuid.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return zpl.f2058n;
    }

    public static final Ml nY(BooleanCompanionObject booleanCompanionObject) {
        Intrinsics.checkNotNullParameter(booleanCompanionObject, "<this>");
        return Dsr.f1956n;
    }

    public static final Ml nr() {
        return C1343z.f2056t;
    }

    public static final Ml o() {
        return t6.f2051t;
    }

    public static final Ml qie() {
        return RzR.f1988n;
    }

    public static final Ml r() {
        return eZk.f2013t;
    }

    public static final Ml rl() {
        return fuX.f2015t;
    }

    public static final Ml t() {
        return C.f1946t;
    }

    public static final Ml te(CharCompanionObject charCompanionObject) {
        Intrinsics.checkNotNullParameter(charCompanionObject, "<this>");
        return QJ.f1982n;
    }

    public static final Ml ty() {
        return IG.f1962t;
    }

    public static final Ml xMQ() {
        return gnv.f2017t;
    }
}
