package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class h {

    public static abstract class I28 {

        class j extends Ml {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ int f59707n;
            final /* synthetic */ I28 rl;

            j(I28 i28, int i2) {
                this.f59707n = i2;
                this.rl = i28;
            }

            @Override // com.google.common.collect.h.Ml
            public M O() {
                return K.rl(this.rl.t(), new w6(this.f59707n));
            }
        }

        public Ml n() {
            return rl(2);
        }

        abstract Map t();

        public Ml rl(int i2) {
            Pl.rl(i2, "expectedValuesPerKey");
            return new j(this, i2);
        }

        I28() {
        }
    }

    public static abstract class Ml extends h {
        Ml() {
            super(null);
        }

        public abstract M O();
    }

    class j extends I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f59708n;

        j(int i2) {
            this.f59708n = i2;
        }

        @Override // com.google.common.collect.h.I28
        Map t() {
            return yg.t(this.f59708n);
        }
    }

    class n extends I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Comparator f59709n;

        n(Comparator comparator) {
            this.f59709n = comparator;
        }

        @Override // com.google.common.collect.h.I28
        Map t() {
            return new TreeMap(this.f59709n);
        }
    }

    private static final class w6 implements t1.UGc, Serializable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f59710n;

        @Override // t1.UGc
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public List get() {
            return new ArrayList(this.f59710n);
        }

        w6(int i2) {
            this.f59710n = Pl.rl(i2, "expectedValuesPerKey");
        }
    }

    /* synthetic */ h(j jVar) {
        this();
    }

    private h() {
    }

    public static I28 n() {
        return rl(8);
    }

    public static I28 rl(int i2) {
        Pl.rl(i2, "expectedKeys");
        return new j(i2);
    }

    public static I28 nr(Comparator comparator) {
        t1.Xo.HI(comparator);
        return new n(comparator);
    }

    public static I28 t() {
        return nr(iF.t());
    }
}
