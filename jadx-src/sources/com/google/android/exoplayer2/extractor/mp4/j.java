package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
abstract class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f57831n;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.mp4.j$j, reason: collision with other inner class name */
    static final class C0767j extends j {
        public final List nr;
        public final long rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final List f57832t;

        public C0767j J2(int i2) {
            int size = this.nr.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0767j c0767j = (C0767j) this.nr.get(i3);
                if (c0767j.f57831n == i2) {
                    return c0767j;
                }
            }
            return null;
        }

        public void O(n nVar) {
            this.f57832t.add(nVar);
        }

        public n Uo(int i2) {
            int size = this.f57832t.size();
            for (int i3 = 0; i3 < size; i3++) {
                n nVar = (n) this.f57832t.get(i3);
                if (nVar.f57831n == i2) {
                    return nVar;
                }
            }
            return null;
        }

        public void nr(C0767j c0767j) {
            this.nr.add(c0767j);
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.j
        public String toString() {
            return j.n(this.f57831n) + " leaves: " + Arrays.toString(this.f57832t.toArray()) + " containers: " + Arrays.toString(this.nr.toArray());
        }

        public C0767j(int i2, long j2) {
            super(i2);
            this.rl = j2;
            this.f57832t = new ArrayList();
            this.nr = new ArrayList();
        }
    }

    public static int rl(int i2) {
        return i2 & 16777215;
    }

    public static int t(int i2) {
        return (i2 >> 24) & 255;
    }

    static final class n extends j {
        public final ParsableByteArray rl;

        public n(int i2, ParsableByteArray parsableByteArray) {
            super(i2);
            this.rl = parsableByteArray;
        }
    }

    public static String n(int i2) {
        return "" + ((char) ((i2 >> 24) & 255)) + ((char) ((i2 >> 16) & 255)) + ((char) ((i2 >> 8) & 255)) + ((char) (i2 & 255));
    }

    public String toString() {
        return n(this.f57831n);
    }

    public j(int i2) {
        this.f57831n = i2;
    }
}
