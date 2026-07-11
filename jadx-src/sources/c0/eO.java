package c0;

import android.graphics.ColorSpace;
import coil.memory.MemoryCache;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class eO {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Xo f43497n = new j();

    public static final class j implements Xo {
        @Override // c0.Xo
        public boolean equals(Object obj, Object obj2) {
            if (obj == obj2) {
                return true;
            }
            if (!(obj instanceof FjR.fuX) || !(obj2 instanceof FjR.fuX)) {
                return Intrinsics.areEqual(obj, obj2);
            }
            FjR.fuX fux = (FjR.fuX) obj;
            FjR.fuX fux2 = (FjR.fuX) obj2;
            return Intrinsics.areEqual(fux.qie(), fux2.qie()) && Intrinsics.areEqual(fux.az(), fux2.az()) && Intrinsics.areEqual(fux.X(), fux2.X()) && Intrinsics.areEqual(fux.te(), fux2.te()) && Intrinsics.areEqual(fux.r(), fux2.r()) && fux.mUb() == fux2.mUb() && Intrinsics.areEqual(fux.gh(), fux2.gh()) && Intrinsics.areEqual(fux.bzg(), fux2.bzg()) && Intrinsics.areEqual(fux.aYN(), fux2.aYN()) && fux.Uo() == fux2.Uo() && fux.KN() == fux2.KN() && fux.xMQ() == fux2.xMQ() && fux.N() == fux2.N() && fux.iF() == fux2.iF() && fux.o() == fux2.o() && fux.fD() == fux2.fD() && Intrinsics.areEqual(fux.s7N(), fux2.s7N()) && fux.nHg() == fux2.nHg() && fux.T() == fux2.T() && Intrinsics.areEqual(fux.E2(), fux2.E2());
        }

        @Override // c0.Xo
        public int hashCode(Object obj) {
            if (!(obj instanceof FjR.fuX)) {
                if (obj != null) {
                    return obj.hashCode();
                }
                return 0;
            }
            FjR.fuX fux = (FjR.fuX) obj;
            int iHashCode = ((fux.qie().hashCode() * 31) + fux.az().hashCode()) * 31;
            MemoryCache.Key keyX = fux.X();
            int iHashCode2 = (iHashCode + (keyX != null ? keyX.hashCode() : 0)) * 31;
            MemoryCache.Key keyTe = fux.te();
            int iHashCode3 = (iHashCode2 + (keyTe != null ? keyTe.hashCode() : 0)) * 31;
            String strR = fux.r();
            int iHashCode4 = (((iHashCode3 + (strR != null ? strR.hashCode() : 0)) * 31) + fux.mUb().hashCode()) * 31;
            ColorSpace colorSpaceGh = fux.gh();
            return ((((((((((((((((((((((((((iHashCode4 + (colorSpaceGh != null ? colorSpaceGh.hashCode() : 0)) * 31) + fux.bzg().hashCode()) * 31) + fux.aYN().hashCode()) * 31) + Boolean.hashCode(fux.Uo())) * 31) + Boolean.hashCode(fux.KN())) * 31) + Boolean.hashCode(fux.xMQ())) * 31) + Boolean.hashCode(fux.N())) * 31) + fux.iF().hashCode()) * 31) + fux.o().hashCode()) * 31) + fux.fD().hashCode()) * 31) + fux.s7N().hashCode()) * 31) + fux.nHg().hashCode()) * 31) + fux.T().hashCode()) * 31) + fux.E2().hashCode();
        }

        j() {
        }
    }

    public static final Xo n() {
        return f43497n;
    }
}
