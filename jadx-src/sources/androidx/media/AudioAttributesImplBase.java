package androidx.media;

import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f39125n = 0;
    int rl = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f39126t = 0;
    int nr = -1;

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.rl == audioAttributesImplBase.n() && this.f39126t == audioAttributesImplBase.rl() && this.f39125n == audioAttributesImplBase.nr() && this.nr == audioAttributesImplBase.nr;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.rl), Integer.valueOf(this.f39126t), Integer.valueOf(this.f39125n), Integer.valueOf(this.nr)});
    }

    public int n() {
        return this.rl;
    }

    public int nr() {
        return this.f39125n;
    }

    public int rl() {
        int i2 = this.f39126t;
        int iT = t();
        if (iT == 6) {
            i2 |= 4;
        } else if (iT == 7) {
            i2 |= 1;
        }
        return i2 & 273;
    }

    public int t() {
        int i2 = this.nr;
        return i2 != -1 ? i2 : AudioAttributesCompat.n(false, this.f39126t, this.f39125n);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.nr != -1) {
            sb.append(" stream=");
            sb.append(this.nr);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.rl(this.f39125n));
        sb.append(" content=");
        sb.append(this.rl);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f39126t).toUpperCase());
        return sb.toString();
    }

    AudioAttributesImplBase() {
    }
}
