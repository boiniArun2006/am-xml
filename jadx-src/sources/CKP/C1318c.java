package CKP;

import CKP.s4;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: CKP.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class C1318c {
    private static C1318c KN;
    public static final j Uo = new j(null);
    private final Method J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Method f872O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Class f873n;
    private final Method nr;
    private final Class rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Method f874t;

    /* JADX INFO: renamed from: CKP.c$j */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized C1318c rl() {
            C1318c c1318cN;
            c1318cN = C1318c.n();
            if (c1318cN == null) {
                c1318cN = n();
            }
            return c1318cN;
        }

        private j() {
        }

        private final C1318c n() {
            Class clsN = s4.n("com.android.billingclient.api.SkuDetailsParams");
            Class clsN2 = s4.n("com.android.billingclient.api.SkuDetailsParams$Builder");
            if (clsN == null || clsN2 == null) {
                return null;
            }
            Method methodNr = s4.nr(clsN, "newBuilder", new Class[0]);
            Method methodNr2 = s4.nr(clsN2, "setType", String.class);
            Method methodNr3 = s4.nr(clsN2, "setSkusList", List.class);
            Method methodNr4 = s4.nr(clsN2, "build", new Class[0]);
            if (methodNr == null || methodNr2 == null || methodNr3 == null || methodNr4 == null) {
                return null;
            }
            C1318c.rl(new C1318c(clsN, clsN2, methodNr, methodNr2, methodNr3, methodNr4));
            return C1318c.n();
        }
    }

    public C1318c(Class skuDetailsParamsClazz, Class builderClazz, Method newBuilderMethod, Method setTypeMethod, Method setSkusListMethod, Method buildMethod) {
        Intrinsics.checkNotNullParameter(skuDetailsParamsClazz, "skuDetailsParamsClazz");
        Intrinsics.checkNotNullParameter(builderClazz, "builderClazz");
        Intrinsics.checkNotNullParameter(newBuilderMethod, "newBuilderMethod");
        Intrinsics.checkNotNullParameter(setTypeMethod, "setTypeMethod");
        Intrinsics.checkNotNullParameter(setSkusListMethod, "setSkusListMethod");
        Intrinsics.checkNotNullParameter(buildMethod, "buildMethod");
        this.f873n = skuDetailsParamsClazz;
        this.rl = builderClazz;
        this.f874t = newBuilderMethod;
        this.nr = setTypeMethod;
        this.f872O = setSkusListMethod;
        this.J2 = buildMethod;
    }

    public static final /* synthetic */ C1318c n() {
        if (VmF.j.nr(C1318c.class)) {
            return null;
        }
        try {
            return KN;
        } catch (Throwable th) {
            VmF.j.rl(th, C1318c.class);
            return null;
        }
    }

    public static final /* synthetic */ void rl(C1318c c1318c) {
        if (VmF.j.nr(C1318c.class)) {
            return;
        }
        try {
            KN = c1318c;
        } catch (Throwable th) {
            VmF.j.rl(th, C1318c.class);
        }
    }

    public final Class nr() {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            return this.f873n;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    public final Object t(s4.n productType, List list) {
        Object objO;
        Object objO2;
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(productType, "productType");
            Object objO3 = s4.O(this.f873n, this.f874t, null, new Object[0]);
            if (objO3 == null || (objO = s4.O(this.rl, this.nr, objO3, productType.rl())) == null || (objO2 = s4.O(this.rl, this.f872O, objO, list)) == null) {
                return null;
            }
            return s4.O(this.rl, this.J2, objO2, new Object[0]);
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }
}
