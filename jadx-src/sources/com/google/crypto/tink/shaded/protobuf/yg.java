package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class yg {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final yg f60036t = new yg();
    private final ConcurrentMap rl = new ConcurrentHashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final OU f60037n = new nKK();

    public static yg n() {
        return f60036t;
    }

    public mz rl(Class cls, mz mzVar) {
        SPz.rl(cls, "messageType");
        SPz.rl(mzVar, "schema");
        return (mz) this.rl.putIfAbsent(cls, mzVar);
    }

    public mz t(Class cls) {
        mz mzVarRl;
        SPz.rl(cls, "messageType");
        mz mzVarCreateSchema = (mz) this.rl.get(cls);
        return (mzVarCreateSchema != null || (mzVarRl = rl(cls, (mzVarCreateSchema = this.f60037n.createSchema(cls)))) == null) ? mzVarCreateSchema : mzVarRl;
    }

    private yg() {
    }

    public mz nr(Object obj) {
        return t(obj.getClass());
    }
}
