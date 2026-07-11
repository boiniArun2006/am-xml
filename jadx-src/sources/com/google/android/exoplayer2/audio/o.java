package com.google.android.exoplayer2.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class o {
    private long J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private long f57689O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f57690n;
    private long nr;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f57691t;

    private static final class j {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private long f57692O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final AudioTrack f57693n;
        private long nr;
        private final AudioTimestamp rl = new AudioTimestamp();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private long f57694t;

        public long n() {
            return this.f57692O;
        }

        public long rl() {
            return this.rl.nanoTime / 1000;
        }

        public boolean t() {
            boolean timestamp = this.f57693n.getTimestamp(this.rl);
            if (timestamp) {
                long j2 = this.rl.framePosition;
                if (this.nr > j2) {
                    this.f57694t++;
                }
                this.nr = j2;
                this.f57692O = j2 + (this.f57694t << 32);
            }
            return timestamp;
        }

        public j(AudioTrack audioTrack) {
            this.f57693n = audioTrack;
        }
    }

    public void J2() {
        KN(4);
    }

    private void KN(int i2) {
        this.rl = i2;
        if (i2 == 0) {
            this.f57689O = 0L;
            this.J2 = -1L;
            this.f57691t = System.nanoTime() / 1000;
            this.nr = 10000L;
            return;
        }
        if (i2 == 1) {
            this.nr = 10000L;
            return;
        }
        if (i2 == 2 || i2 == 3) {
            this.nr = 10000000L;
        } else {
            if (i2 != 4) {
                throw new IllegalStateException();
            }
            this.nr = 500000L;
        }
    }

    public boolean O(long j2) {
        j jVar = this.f57690n;
        if (jVar == null || j2 - this.f57689O < this.nr) {
            return false;
        }
        this.f57689O = j2;
        boolean zT2 = jVar.t();
        int i2 = this.rl;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (zT2) {
                        Uo();
                        return zT2;
                    }
                } else if (!zT2) {
                    Uo();
                    return zT2;
                }
            } else {
                if (!zT2) {
                    Uo();
                    return zT2;
                }
                if (this.f57690n.n() > this.J2) {
                    KN(2);
                    return zT2;
                }
            }
        } else {
            if (zT2) {
                if (this.f57690n.rl() < this.f57691t) {
                    return false;
                }
                this.J2 = this.f57690n.n();
                KN(1);
                return zT2;
            }
            if (j2 - this.f57691t > 500000) {
                KN(3);
            }
        }
        return zT2;
    }

    public void Uo() {
        if (this.f57690n != null) {
            KN(0);
        }
    }

    public void n() {
        if (this.rl == 4) {
            Uo();
        }
    }

    public boolean nr() {
        return this.rl == 2;
    }

    public long rl() {
        j jVar = this.f57690n;
        if (jVar != null) {
            return jVar.n();
        }
        return -1L;
    }

    public long t() {
        j jVar = this.f57690n;
        if (jVar != null) {
            return jVar.rl();
        }
        return -9223372036854775807L;
    }

    public o(AudioTrack audioTrack) {
        if (Util.SDK_INT >= 19) {
            this.f57690n = new j(audioTrack);
            Uo();
        } else {
            this.f57690n = null;
            KN(3);
        }
    }
}
