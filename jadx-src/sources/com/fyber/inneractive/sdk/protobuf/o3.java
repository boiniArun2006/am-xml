package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class o3 {
    public static void a(Object obj, Object obj2) {
        ((z0) obj).unknownFields = (n3) obj2;
    }

    public static boolean a(Object obj, s2 s2Var) throws n1 {
        int iE = s2Var.e();
        int i2 = iE >>> 3;
        int i3 = iE & 7;
        if (i3 == 0) {
            ((n3) obj).a(i2 << 3, Long.valueOf(s2Var.o()));
            return true;
        }
        if (i3 == 1) {
            ((n3) obj).a((i2 << 3) | 1, Long.valueOf(s2Var.g()));
            return true;
        }
        if (i3 == 2) {
            ((n3) obj).a((i2 << 3) | 2, s2Var.a());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 == 5) {
                ((n3) obj).a(5 | (i2 << 3), Integer.valueOf(s2Var.q()));
                return true;
            }
            int i5 = n1.f56624a;
            throw new m1();
        }
        n3 n3Var = new n3();
        int i7 = i2 << 3;
        int i8 = 4 | i7;
        while (s2Var.s() != Integer.MAX_VALUE && a((Object) n3Var, s2Var)) {
        }
        if (i8 == s2Var.e()) {
            n3Var.f56630e = false;
            ((n3) obj).a(i7 | 3, n3Var);
            return true;
        }
        throw new n1("Protocol message end-group tag did not match expected tag.");
    }
}
