package coil.memory;

import Be4.Dsr;
import FjR.Pl;
import FjR.Xo;
import Z.w6;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.memory.MemoryCache;
import fVb.j;
import fVb.n;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kYF.C;
import kYF.SPz;
import kYF.aC;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class w6 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f43891t = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final eQ.fuX f43892n;
    private final Pl rl;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean O(FjR.fuX fux, MemoryCache.Key key, MemoryCache.n nVar, Z.fuX fux2, Z.CN3 cn3) {
        boolean z2;
        double d2;
        int i2;
        boolean zNr = nr(nVar);
        if (Z.n.rl(fux2)) {
            return !zNr;
        }
        String str = (String) key.getExtras().get("coil#transformation_size");
        if (str != null) {
            return Intrinsics.areEqual(str, fux2.toString());
        }
        int width = nVar.n().getWidth();
        int height = nVar.n().getHeight();
        Z.w6 w6VarNr = fux2.nr();
        int i3 = w6VarNr instanceof w6.j ? ((w6.j) w6VarNr).f12273n : Integer.MAX_VALUE;
        Z.w6 w6VarT = fux2.t();
        int i5 = w6VarT instanceof w6.j ? ((w6.j) w6VarT).f12273n : Integer.MAX_VALUE;
        double dT = Dsr.t(width, height, i3, i5, cn3);
        boolean zN = aC.n(fux);
        if (zN) {
            double dCoerceAtMost = RangesKt.coerceAtMost(dT, 1.0d);
            d2 = 1.0d;
            z2 = false;
            if (Math.abs(((double) i3) - (((double) width) * dCoerceAtMost)) <= 1.0d || Math.abs(((double) i5) - (dCoerceAtMost * ((double) height))) <= 1.0d) {
                return true;
            }
        } else {
            z2 = false;
            d2 = 1.0d;
            if (C.r(i3)) {
                i2 = 1;
            } else {
                i2 = 1;
                if (Math.abs(i3 - width) <= 1) {
                }
            }
            if (C.r(i5) || Math.abs(i5 - height) <= i2) {
                return i2;
            }
        }
        if (dT != d2 && !zN) {
            return z2;
        }
        if (dT <= d2 || !zNr) {
            return true;
        }
        return z2;
    }

    public final Xo Uo(n.j jVar, FjR.fuX fux, MemoryCache.Key key, MemoryCache.n nVar) {
        return new Xo(new BitmapDrawable(fux.qie().getResources(), nVar.n()), fux, Be4.CN3.f517n, key, rl(nVar), nr(nVar), C.o(jVar));
    }

    public final boolean t(FjR.fuX fux, MemoryCache.Key key, MemoryCache.n nVar, Z.fuX fux2, Z.CN3 cn3) {
        if (this.rl.t(fux, kYF.j.t(nVar.n()))) {
            return O(fux, key, nVar, fux2, cn3);
        }
        return false;
    }

    public w6(eQ.fuX fux, Pl pl, SPz sPz) {
        this.f43892n = fux;
        this.rl = pl;
    }

    private final boolean nr(MemoryCache.n nVar) {
        Boolean bool;
        Object obj = nVar.rl().get("coil#is_sampled");
        if (obj instanceof Boolean) {
            bool = (Boolean) obj;
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final String rl(MemoryCache.n nVar) {
        Object obj = nVar.rl().get("coil#disk_cache_key");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final MemoryCache.Key J2(FjR.fuX fux, Object obj, FjR.C c2, eQ.w6 w6Var) {
        MemoryCache.Key keyTe = fux.te();
        if (keyTe != null) {
            return keyTe;
        }
        w6Var.O(fux, obj);
        String strJ2 = this.f43892n.getComponents().J2(obj, c2);
        w6Var.xMQ(fux, strJ2);
        if (strJ2 == null) {
            return null;
        }
        List listBzg = fux.bzg();
        Map mapO = fux.E2().O();
        if (listBzg.isEmpty() && mapO.isEmpty()) {
            return new MemoryCache.Key(strJ2, null, 2, null);
        }
        Map mutableMap = MapsKt.toMutableMap(mapO);
        if (!listBzg.isEmpty()) {
            List listBzg2 = fux.bzg();
            if (listBzg2.size() <= 0) {
                mutableMap.put("coil#transformation_size", c2.HI().toString());
            } else {
                android.support.v4.media.j.n(listBzg2.get(0));
                StringBuilder sb = new StringBuilder();
                sb.append("coil#transformation_");
                sb.append(0);
                throw null;
            }
        }
        return new MemoryCache.Key(strJ2, mutableMap);
    }

    public final boolean KN(MemoryCache.Key key, FjR.fuX fux, j.n nVar) {
        MemoryCache memoryCacheT;
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        if (fux.iF().t() && (memoryCacheT = this.f43892n.t()) != null && key != null) {
            Drawable drawableO = nVar.O();
            if (drawableO instanceof BitmapDrawable) {
                bitmapDrawable = (BitmapDrawable) drawableO;
            } else {
                bitmapDrawable = null;
            }
            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("coil#is_sampled", Boolean.valueOf(nVar.J2()));
                String strNr = nVar.nr();
                if (strNr != null) {
                    linkedHashMap.put("coil#disk_cache_key", strNr);
                }
                memoryCacheT.t(key, new MemoryCache.n(bitmap, linkedHashMap));
                return true;
            }
        }
        return false;
    }

    public final MemoryCache.n n(FjR.fuX fux, MemoryCache.Key key, Z.fuX fux2, Z.CN3 cn3) {
        MemoryCache.n nVarRl;
        if (!fux.iF().rl()) {
            return null;
        }
        MemoryCache memoryCacheT = this.f43892n.t();
        if (memoryCacheT != null) {
            nVarRl = memoryCacheT.rl(key);
        } else {
            nVarRl = null;
        }
        if (nVarRl == null || !t(fux, key, nVarRl, fux2, cn3)) {
            return null;
        }
        return nVarRl;
    }
}
