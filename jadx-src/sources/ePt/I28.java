package ePt;

import ePt.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final I28 f63626n = n().J2(10485760).nr(200).rl(10000).t(604800000).O(81920).n();

    abstract long J2();

    abstract int O();

    abstract int nr();

    abstract int rl();

    abstract long t();

    static abstract class j {
        abstract j J2(long j2);

        abstract j O(int i2);

        abstract I28 n();

        abstract j nr(int i2);

        abstract j rl(int i2);

        abstract j t(long j2);

        j() {
        }
    }

    static j n() {
        return new j.n();
    }

    I28() {
    }
}
