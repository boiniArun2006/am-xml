package com.google.android.exoplayer2.extractor.avi;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class Ml {
    private int J2;
    private int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f57764O;
    private int Uo;
    private long[] gh;
    private int mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final TrackOutput f57765n;
    private final long nr;
    private int[] qie;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f57766t;
    private int xMQ;

    public long Uo() {
        return O(1);
    }

    private SeekPoint KN(int i2) {
        return new SeekPoint(((long) this.qie[i2]) * Uo(), this.gh[i2]);
    }

    private long O(int i2) {
        return (this.nr * ((long) i2)) / ((long) this.f57764O);
    }

    private static int nr(int i2, int i3) {
        return (((i2 % 10) + 48) << 8) | ((i2 / 10) + 48) | i3;
    }

    public void HI(long j2) {
        if (this.mUb == 0) {
            this.KN = 0;
        } else {
            this.KN = this.qie[Util.binarySearchFloor(this.gh, j2, true, true)];
        }
    }

    public long J2() {
        return O(this.KN);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public boolean az(ExtractorInput extractorInput) {
        int i2 = this.Uo;
        int iSampleData = i2 - this.f57765n.sampleData((DataReader) extractorInput, i2, false);
        this.Uo = iSampleData;
        boolean z2 = iSampleData == 0;
        if (z2) {
            if (this.J2 > 0) {
                this.f57765n.sampleMetadata(J2(), qie() ? 1 : 0, this.J2, 0, null);
            }
            n();
        }
        return z2;
    }

    public void gh() {
        this.xMQ++;
    }

    public boolean mUb(int i2) {
        return this.rl == i2 || this.f57766t == i2;
    }

    public void n() {
        this.KN++;
    }

    public boolean qie() {
        return Arrays.binarySearch(this.qie, this.KN) >= 0;
    }

    public void rl(long j2) {
        if (this.mUb == this.qie.length) {
            long[] jArr = this.gh;
            this.gh = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.qie;
            this.qie = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.gh;
        int i2 = this.mUb;
        jArr2[i2] = j2;
        this.qie[i2] = this.xMQ;
        this.mUb = i2 + 1;
    }

    public void t() {
        this.gh = Arrays.copyOf(this.gh, this.mUb);
        this.qie = Arrays.copyOf(this.qie, this.mUb);
    }

    public void ty(int i2) {
        this.J2 = i2;
        this.Uo = i2;
    }

    public Ml(int i2, int i3, long j2, int i5, TrackOutput trackOutput) {
        int i7;
        int iNr;
        boolean z2 = true;
        if (i3 != 1 && i3 != 2) {
            z2 = false;
        }
        Assertions.checkArgument(z2);
        this.nr = j2;
        this.f57764O = i5;
        this.f57765n = trackOutput;
        if (i3 == 2) {
            i7 = 1667497984;
        } else {
            i7 = 1651965952;
        }
        this.rl = nr(i2, i7);
        if (i3 == 2) {
            iNr = nr(i2, 1650720768);
        } else {
            iNr = -1;
        }
        this.f57766t = iNr;
        this.gh = new long[512];
        this.qie = new int[512];
    }

    public SeekMap.SeekPoints xMQ(long j2) {
        int iUo = (int) (j2 / Uo());
        int iBinarySearchFloor = Util.binarySearchFloor(this.qie, iUo, true, true);
        if (this.qie[iBinarySearchFloor] == iUo) {
            return new SeekMap.SeekPoints(KN(iBinarySearchFloor));
        }
        SeekPoint seekPointKN = KN(iBinarySearchFloor);
        int i2 = iBinarySearchFloor + 1;
        if (i2 < this.gh.length) {
            return new SeekMap.SeekPoints(seekPointKN, KN(i2));
        }
        return new SeekMap.SeekPoints(seekPointKN);
    }
}
