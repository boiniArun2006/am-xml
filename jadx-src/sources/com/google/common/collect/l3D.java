package com.google.common.collect;

import java.util.Comparator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class l3D {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final l3D f59719n = new j();
    private static final l3D rl = new n(-1);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final l3D f59720t = new n(1);

    class j extends l3D {
        j() {
            super(null);
        }

        @Override // com.google.common.collect.l3D
        public int xMQ() {
            return 0;
        }

        l3D gh(int i2) {
            return i2 < 0 ? l3D.rl : i2 > 0 ? l3D.f59720t : l3D.f59719n;
        }

        @Override // com.google.common.collect.l3D
        public l3D J2(Object obj, Object obj2, Comparator comparator) {
            return gh(comparator.compare(obj, obj2));
        }

        @Override // com.google.common.collect.l3D
        public l3D KN(boolean z2, boolean z3) {
            return gh(Boolean.compare(z3, z2));
        }

        @Override // com.google.common.collect.l3D
        public l3D O(long j2, long j3) {
            return gh(Long.compare(j2, j3));
        }

        @Override // com.google.common.collect.l3D
        public l3D Uo(boolean z2, boolean z3) {
            return gh(Boolean.compare(z2, z3));
        }

        @Override // com.google.common.collect.l3D
        public l3D nr(int i2, int i3) {
            return gh(Integer.compare(i2, i3));
        }
    }

    private static final class n extends l3D {
        final int nr;

        n(int i2) {
            super(null);
            this.nr = i2;
        }

        @Override // com.google.common.collect.l3D
        public l3D J2(Object obj, Object obj2, Comparator comparator) {
            return this;
        }

        @Override // com.google.common.collect.l3D
        public l3D KN(boolean z2, boolean z3) {
            return this;
        }

        @Override // com.google.common.collect.l3D
        public l3D O(long j2, long j3) {
            return this;
        }

        @Override // com.google.common.collect.l3D
        public l3D Uo(boolean z2, boolean z3) {
            return this;
        }

        @Override // com.google.common.collect.l3D
        public l3D nr(int i2, int i3) {
            return this;
        }

        @Override // com.google.common.collect.l3D
        public int xMQ() {
            return this.nr;
        }
    }

    /* synthetic */ l3D(j jVar) {
        this();
    }

    public abstract l3D J2(Object obj, Object obj2, Comparator comparator);

    public abstract l3D KN(boolean z2, boolean z3);

    public abstract l3D O(long j2, long j3);

    public abstract l3D Uo(boolean z2, boolean z3);

    public abstract l3D nr(int i2, int i3);

    public abstract int xMQ();

    private l3D() {
    }

    public static l3D mUb() {
        return f59719n;
    }
}
