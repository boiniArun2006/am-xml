package com.google.gson.internal.sql;

import com.google.gson.eO;
import com.google.gson.internal.bind.j;
import java.sql.Date;
import java.sql.Timestamp;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class j {
    public static final eO J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final eO f61014O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final boolean f61015n;
    public static final eO nr;
    public static final j.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j.n f61016t;

    /* JADX INFO: renamed from: com.google.gson.internal.sql.j$j, reason: collision with other inner class name */
    class C0818j extends j.n {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.j.n
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public Date nr(java.util.Date date) {
            return new Date(date.getTime());
        }

        C0818j(Class cls) {
            super(cls);
        }
    }

    class n extends j.n {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.j.n
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public Timestamp nr(java.util.Date date) {
            return new Timestamp(date.getTime());
        }

        n(Class cls) {
            super(cls);
        }
    }

    static {
        boolean z2;
        try {
            Class.forName("java.sql.Date");
            z2 = true;
        } catch (ClassNotFoundException unused) {
            z2 = false;
        }
        f61015n = z2;
        if (z2) {
            rl = new C0818j(Date.class);
            f61016t = new n(Timestamp.class);
            nr = SqlDateTypeAdapter.rl;
            f61014O = SqlTimeTypeAdapter.rl;
            J2 = SqlTimestampTypeAdapter.rl;
            return;
        }
        rl = null;
        f61016t = null;
        nr = null;
        f61014O = null;
        J2 = null;
    }
}
