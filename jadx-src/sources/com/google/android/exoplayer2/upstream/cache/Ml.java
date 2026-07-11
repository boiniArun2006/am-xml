package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class Ml {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private DefaultContentMetadata f58445O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f58446n;
    private final ArrayList nr;
    public final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final TreeSet f58447t;

    private static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final long f58448n;
        public final long rl;

        public boolean n(long j2, long j3) {
            long j4 = this.rl;
            if (j4 == -1) {
                return j2 >= this.f58448n;
            }
            if (j3 == -1) {
                return false;
            }
            long j5 = this.f58448n;
            return j5 <= j2 && j2 + j3 <= j5 + j4;
        }

        public boolean rl(long j2, long j3) {
            long j4 = this.f58448n;
            if (j4 > j2) {
                return j3 == -1 || j2 + j3 > j4;
            }
            long j5 = this.rl;
            return j5 == -1 || j4 + j5 > j2;
        }

        public j(long j2, long j3) {
            this.f58448n = j2;
            this.rl = j3;
        }
    }

    public Ml(int i2, String str) {
        this(i2, str, DefaultContentMetadata.EMPTY);
    }

    public boolean KN(long j2, long j3) {
        for (int i2 = 0; i2 < this.nr.size(); i2++) {
            if (((j) this.nr.get(i2)).n(j2, j3)) {
                return true;
            }
        }
        return false;
    }

    public void az(long j2) {
        for (int i2 = 0; i2 < this.nr.size(); i2++) {
            if (((j) this.nr.get(i2)).f58448n == j2) {
                this.nr.remove(i2);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Ml.class == obj.getClass()) {
            Ml ml = (Ml) obj;
            if (this.f58446n == ml.f58446n && this.rl.equals(ml.rl) && this.f58447t.equals(ml.f58447t) && this.f58445O.equals(ml.f58445O)) {
                return true;
            }
        }
        return false;
    }

    public boolean mUb(long j2, long j3) {
        for (int i2 = 0; i2 < this.nr.size(); i2++) {
            if (((j) this.nr.get(i2)).rl(j2, j3)) {
                return false;
            }
        }
        this.nr.add(new j(j2, j3));
        return true;
    }

    public Ml(int i2, String str, DefaultContentMetadata defaultContentMetadata) {
        this.f58446n = i2;
        this.rl = str;
        this.f58445O = defaultContentMetadata;
        this.f58447t = new TreeSet();
        this.nr = new ArrayList();
    }

    public TreeSet J2() {
        return this.f58447t;
    }

    public fuX O(long j2, long j3) {
        fuX fuxJ2 = fuX.J2(this.rl, j2);
        fuX fux = (fuX) this.f58447t.floor(fuxJ2);
        if (fux != null && fux.position + fux.length > j2) {
            return fux;
        }
        fuX fux2 = (fuX) this.f58447t.ceiling(fuxJ2);
        if (fux2 != null) {
            long j4 = fux2.position - j2;
            j3 = j3 == -1 ? j4 : Math.min(j4, j3);
        }
        return fuX.nr(this.rl, j2, j3);
    }

    public boolean Uo() {
        return this.f58447t.isEmpty();
    }

    public boolean gh(CacheSpan cacheSpan) {
        if (!this.f58447t.remove(cacheSpan)) {
            return false;
        }
        File file = cacheSpan.file;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public int hashCode() {
        return (((this.f58446n * 31) + this.rl.hashCode()) * 31) + this.f58445O.hashCode();
    }

    public void n(fuX fux) {
        this.f58447t.add(fux);
    }

    public DefaultContentMetadata nr() {
        return this.f58445O;
    }

    public fuX qie(fuX fux, long j2, boolean z2) {
        long j3;
        Assertions.checkState(this.f58447t.remove(fux));
        File file = (File) Assertions.checkNotNull(fux.file);
        if (z2) {
            j3 = j2;
            File fileUo = fuX.Uo((File) Assertions.checkNotNull(file.getParentFile()), this.f58446n, fux.position, j3);
            if (file.renameTo(fileUo)) {
                file = fileUo;
            } else {
                Log.w("CachedContent", "Failed to rename " + file + " to " + fileUo);
            }
        } else {
            j3 = j2;
        }
        fuX fuxN = fux.n(file, j3);
        this.f58447t.add(fuxN);
        return fuxN;
    }

    public boolean rl(ContentMetadataMutations contentMetadataMutations) {
        this.f58445O = this.f58445O.copyWithMutationsApplied(contentMetadataMutations);
        return !r2.equals(r0);
    }

    public long t(long j2, long j3) {
        Assertions.checkArgument(j2 >= 0);
        Assertions.checkArgument(j3 >= 0);
        fuX fuxO = O(j2, j3);
        if (fuxO.isHoleSpan()) {
            return -Math.min(fuxO.isOpenEnded() ? Long.MAX_VALUE : fuxO.length, j3);
        }
        long j4 = j2 + j3;
        long j5 = j4 >= 0 ? j4 : Long.MAX_VALUE;
        long jMax = fuxO.position + fuxO.length;
        if (jMax < j5) {
            for (fuX fux : this.f58447t.tailSet(fuxO, false)) {
                long j6 = fux.position;
                if (j6 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j6 + fux.length);
                if (jMax >= j5) {
                    break;
                }
            }
        }
        return Math.min(jMax - j2, j3);
    }

    public boolean xMQ() {
        return this.nr.isEmpty();
    }
}
