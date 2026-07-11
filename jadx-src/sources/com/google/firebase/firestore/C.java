package com.google.firebase.firestore;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import wqP.AbstractC2418c;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class C {
    private static final Pattern rl = Pattern.compile("[~*/\\[\\]]");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final C f60299t = new C(pUk.z.f72033t);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final pUk.z f60300n;

    private C(List list) {
        this.f60300n = pUk.z.r(list);
    }

    public static C t(String... strArr) {
        AbstractC2418c.n(strArr.length > 0, "Invalid field path. Provided path must not be empty.", new Object[0]);
        int i2 = 0;
        while (i2 < strArr.length) {
            String str = strArr[i2];
            boolean z2 = (str == null || str.isEmpty()) ? false : true;
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid field name at argument ");
            i2++;
            sb.append(i2);
            sb.append(". Field names must not be null or empty.");
            AbstractC2418c.n(z2, sb.toString(), new Object[0]);
        }
        return new C(Arrays.asList(strArr));
    }

    static C n(String str) {
        AbstractC2418c.t(str, "Provided field path must not be null.");
        AbstractC2418c.n(!rl.matcher(str).find(), "Use FieldPath.of() for field names containing '~*/[]'.", new Object[0]);
        try {
            return t(str.split("\\.", -1));
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException("Invalid field path (" + str + "). Paths must not be empty, begin with '.', end with '.', or contain '..'");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C.class != obj.getClass()) {
            return false;
        }
        return this.f60300n.equals(((C) obj).f60300n);
    }

    public int hashCode() {
        return this.f60300n.hashCode();
    }

    pUk.z rl() {
        return this.f60300n;
    }

    public String toString() {
        return this.f60300n.toString();
    }

    private C(pUk.z zVar) {
        this.f60300n = zVar;
    }
}
