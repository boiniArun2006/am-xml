package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f55358a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f55359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f55360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f55361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f55362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f55363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f55364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f55365h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f55366i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f55367j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f55368k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f55369l;

    /* JADX WARN: Removed duplicated region for block: B:47:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d5  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, IOException {
        long j2;
        g gVar;
        long j3;
        long jMin;
        long j4;
        long j5;
        int i2;
        int i3 = this.f55362e;
        long j6 = 0;
        if (i3 == 0) {
            j2 = 0;
            long j7 = bVar.f54726c;
            this.f55364g = j7;
            this.f55362e = 1;
            long j9 = this.f55360c - 65307;
            if (j9 > j7) {
                return j9;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                long j10 = this.f55365h;
                if (j10 == 0) {
                    i2 = 3;
                    j3 = 2;
                } else {
                    long j11 = this.f55366i;
                    long j12 = this.f55367j;
                    if (j11 == j12) {
                        j5 = this.f55368k;
                    } else {
                        long j13 = bVar.f54726c;
                        if (a(bVar, j12)) {
                            this.f55358a.a(bVar, false);
                            bVar.f54728e = 0;
                            g gVar2 = this.f55358a;
                            long j14 = gVar2.f55385b;
                            long j15 = j10 - j14;
                            int i5 = gVar2.f55387d + gVar2.f55388e;
                            if (j15 < 0 || j15 > 72000) {
                                if (j15 < 0) {
                                    this.f55367j = j13;
                                    this.f55369l = j14;
                                    j3 = 2;
                                } else {
                                    j3 = 2;
                                    long j16 = i5;
                                    long j17 = bVar.f54726c + j16;
                                    this.f55366i = j17;
                                    this.f55368k = j14;
                                    if ((this.f55367j - j17) + j16 < SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
                                        bVar.a(i5);
                                        jMin = -(this.f55368k + 2);
                                        j4 = 0;
                                    }
                                    if (jMin < j4) {
                                    }
                                }
                                long j18 = this.f55367j;
                                long j19 = this.f55366i;
                                long j20 = j18 - j19;
                                if (j20 < SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
                                    this.f55367j = j19;
                                    j4 = 0;
                                    jMin = j19;
                                } else {
                                    j4 = 0;
                                    jMin = Math.min(Math.max(((j20 * j15) / (this.f55369l - this.f55368k)) + (bVar.f54726c - ((long) (i5 * (j15 <= 0 ? 2 : 1)))), j19), this.f55367j - 1);
                                }
                                if (jMin < j4) {
                                }
                            } else {
                                bVar.a(i5);
                                j5 = this.f55358a.f55385b;
                            }
                        } else {
                            jMin = this.f55366i;
                            if (jMin == j13) {
                                throw new IOException("No ogg page can be found.");
                            }
                            j4 = 0;
                            j3 = 2;
                            if (jMin < j4) {
                                return jMin;
                            }
                            long j21 = this.f55365h;
                            j6 = -(jMin + j3);
                            this.f55358a.a(bVar, false);
                            while (true) {
                                g gVar3 = this.f55358a;
                                if (gVar3.f55385b >= j21) {
                                    break;
                                }
                                bVar.a(gVar3.f55387d + gVar3.f55388e);
                                g gVar4 = this.f55358a;
                                long j22 = gVar4.f55385b;
                                gVar4.a(bVar, false);
                                j6 = j22;
                            }
                            bVar.f54728e = 0;
                            i2 = 3;
                        }
                    }
                    jMin = -(j5 + 2);
                    j4 = 0;
                    j3 = 2;
                    if (jMin < j4) {
                    }
                }
                this.f55362e = i2;
                return -(j6 + j3);
            }
            j2 = 0;
        }
        if (!a(bVar, this.f55360c)) {
            throw new EOFException();
        }
        g gVar5 = this.f55358a;
        gVar5.f55384a = 0;
        gVar5.f55385b = j2;
        gVar5.f55386c = 0;
        gVar5.f55387d = 0;
        gVar5.f55388e = 0;
        while (true) {
            gVar = this.f55358a;
            if ((gVar.f55384a & 4) == 4 || bVar.f54726c >= this.f55360c) {
                break;
            }
            gVar.a(bVar, false);
            g gVar6 = this.f55358a;
            bVar.a(gVar6.f55387d + gVar6.f55388e);
        }
        this.f55363f = gVar.f55385b;
        this.f55362e = 3;
        return this.f55364g;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.q b() {
        if (this.f55363f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public final long c(long j2) {
        int i2 = this.f55362e;
        if (i2 != 3 && i2 != 2) {
            throw new IllegalArgumentException();
        }
        long j3 = j2 == 0 ? 0L : (((long) this.f55361d.f55404i) * j2) / 1000000;
        this.f55365h = j3;
        this.f55362e = 2;
        this.f55366i = this.f55359b;
        this.f55367j = this.f55360c;
        this.f55368k = 0L;
        this.f55369l = this.f55363f;
        return j3;
    }

    public b(long j2, long j3, l lVar, int i2, long j4) {
        if (j2 >= 0 && j3 > j2) {
            this.f55361d = lVar;
            this.f55359b = j2;
            this.f55360c = j3;
            if (i2 == j3 - j2) {
                this.f55363f = j4;
                this.f55362e = 3;
                return;
            } else {
                this.f55362e = 0;
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, long j2) throws InterruptedException, EOFException {
        int i2;
        long jMin = Math.min(j2 + 3, this.f55360c);
        int i3 = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            long j3 = bVar.f54726c;
            int i5 = 0;
            if (((long) i3) + j3 > jMin && (i3 = (int) (jMin - j3)) < 4) {
                return false;
            }
            bVar.a(bArr, 0, i3, false);
            while (true) {
                i2 = i3 - 3;
                if (i5 < i2) {
                    if (bArr[i5] == 79 && bArr[i5 + 1] == 103 && bArr[i5 + 2] == 103 && bArr[i5 + 3] == 83) {
                        bVar.a(i5);
                        return true;
                    }
                    i5++;
                }
            }
            bVar.a(i2);
        }
    }
}
