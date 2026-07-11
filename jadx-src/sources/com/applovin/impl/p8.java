package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class p8 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p8 f49696f = new p8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p8 f49697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f49698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f49699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected String f49700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final List f49701e;

    public p8(String str, Map map, p8 p8Var) {
        this.f49697a = p8Var;
        this.f49698b = str;
        this.f49699c = Collections.unmodifiableMap(map);
        this.f49701e = new ArrayList();
    }

    public Map a() {
        return this.f49699c;
    }

    public List b() {
        return Collections.unmodifiableList(this.f49701e);
    }

    public String c() {
        return this.f49698b;
    }

    public List a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        ArrayList arrayList = new ArrayList(this.f49701e.size());
        for (p8 p8Var : this.f49701e) {
            if (str.equalsIgnoreCase(p8Var.c())) {
                arrayList.add(p8Var);
            }
        }
        return arrayList;
    }

    public p8 b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        if (this.f49701e.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        while (!arrayList.isEmpty()) {
            p8 p8Var = (p8) arrayList.get(0);
            arrayList.remove(0);
            if (str.equalsIgnoreCase(p8Var.c())) {
                return p8Var;
            }
            arrayList.addAll(p8Var.b());
        }
        return null;
    }

    public p8 c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        for (p8 p8Var : this.f49701e) {
            if (str.equalsIgnoreCase(p8Var.c())) {
                return p8Var;
            }
        }
        return null;
    }

    public String d() {
        return this.f49700d;
    }

    public String toString() {
        return "XmlNode{elementName='" + this.f49698b + "', text='" + this.f49700d + "', attributes=" + this.f49699c + '}';
    }

    private p8() {
        this.f49697a = null;
        this.f49698b = "";
        this.f49699c = Collections.EMPTY_MAP;
        this.f49700d = "";
        this.f49701e = Collections.EMPTY_LIST;
    }
}
