package com.applovin.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class s3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f49912c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f49913d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s3 f49914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s3 f49915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final s3 f49916g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f49917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Set f49918b;

    public enum a {
        SESSION("session"),
        INSTALL("install");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f49922a;

        public String b() {
            return this.f49922a;
        }

        a(String str) {
            this.f49922a = str;
        }
    }

    public interface b {
        Object a(Object obj);
    }

    protected boolean a(Object obj) {
        return obj instanceof s3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s3)) {
            return false;
        }
        s3 s3Var = (s3) obj;
        if (!s3Var.a(this)) {
            return false;
        }
        String strA = a();
        String strA2 = s3Var.a();
        if (strA != null ? !strA.equals(strA2) : strA2 != null) {
            return false;
        }
        Set setB = b();
        Set setB2 = s3Var.b();
        return setB != null ? setB.equals(setB2) : setB2 == null;
    }

    static {
        a aVar = a.SESSION;
        f49914e = a("ars", aVar, a.INSTALL);
        f49915f = a("ar", aVar);
        f49916g = a("ttdasi_ms", aVar);
    }

    public String a() {
        return this.f49917a;
    }

    public Set b() {
        return this.f49918b;
    }

    public String toString() {
        return this.f49917a;
    }

    private s3(String str, Set set) {
        this.f49917a = str;
        this.f49918b = set;
    }

    private static s3 a(String str, a... aVarArr) {
        Set set = f49912c;
        if (!set.contains(str)) {
            s3 s3Var = new s3(str, new HashSet(Arrays.asList(aVarArr)));
            set.add(str);
            f49913d.put(str, s3Var);
            return s3Var;
        }
        throw new IllegalArgumentException("Key has already been used: " + str);
    }

    public int hashCode() {
        int iHashCode;
        String strA = a();
        int iHashCode2 = 43;
        if (strA == null) {
            iHashCode = 43;
        } else {
            iHashCode = strA.hashCode();
        }
        Set setB = b();
        int i2 = (iHashCode + 59) * 59;
        if (setB != null) {
            iHashCode2 = setB.hashCode();
        }
        return i2 + iHashCode2;
    }

    public boolean a(a aVar) {
        return this.f49918b.contains(aVar);
    }

    public static s3 a(String str) {
        return (s3) f49913d.get(str);
    }
}
