package com.fyber.inneractive.sdk.player.exoplayer2;

import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new n();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f55852A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.metadata.b f55856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f55857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f55858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f55859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f55860h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.drm.d f55861i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f55862j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f55863k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f55864l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f55865m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f55866n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f55867o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final byte[] f55868p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.video.c f55869q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f55870r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f55871s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f55872t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f55873u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f55874v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f55875w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f55876x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f55877y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f55878z;

    public o(String str, String str2, String str3, String str4, int i2, int i3, int i5, int i7, float f3, int i8, float f4, byte[] bArr, int i9, com.fyber.inneractive.sdk.player.exoplayer2.video.c cVar, int i10, int i11, int i12, int i13, int i14, int i15, String str5, int i16, long j2, List list, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar, com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVar) {
        this.f55853a = str;
        this.f55857e = str2;
        this.f55858f = str3;
        this.f55855c = str4;
        this.f55854b = i2;
        this.f55859g = i3;
        this.f55862j = i5;
        this.f55863k = i7;
        this.f55864l = f3;
        this.f55865m = i8;
        this.f55866n = f4;
        this.f55868p = bArr;
        this.f55867o = i9;
        this.f55869q = cVar;
        this.f55870r = i10;
        this.f55871s = i11;
        this.f55872t = i12;
        this.f55873u = i13;
        this.f55874v = i14;
        this.f55876x = i15;
        this.f55877y = str5;
        this.f55878z = i16;
        this.f55875w = j2;
        this.f55860h = list == null ? Collections.EMPTY_LIST : list;
        this.f55861i = dVar;
        this.f55856d = bVar;
    }

    public static o a(String str, String str2, int i2, int i3, int i5, List list, int i7, float f3, byte[] bArr, int i8, com.fyber.inneractive.sdk.player.exoplayer2.video.c cVar, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar) {
        return new o(str, null, str2, null, -1, i2, i3, i5, -1.0f, i7, f3, bArr, i8, cVar, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, dVar, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f55854b == oVar.f55854b && this.f55859g == oVar.f55859g && this.f55862j == oVar.f55862j && this.f55863k == oVar.f55863k && this.f55864l == oVar.f55864l && this.f55865m == oVar.f55865m && this.f55866n == oVar.f55866n && this.f55867o == oVar.f55867o && this.f55870r == oVar.f55870r && this.f55871s == oVar.f55871s && this.f55872t == oVar.f55872t && this.f55873u == oVar.f55873u && this.f55874v == oVar.f55874v && this.f55875w == oVar.f55875w && this.f55876x == oVar.f55876x && z.a(this.f55853a, oVar.f55853a) && z.a(this.f55877y, oVar.f55877y) && this.f55878z == oVar.f55878z && z.a(this.f55857e, oVar.f55857e) && z.a(this.f55858f, oVar.f55858f) && z.a(this.f55855c, oVar.f55855c) && z.a(this.f55861i, oVar.f55861i) && z.a(this.f55856d, oVar.f55856d) && z.a(this.f55869q, oVar.f55869q) && Arrays.equals(this.f55868p, oVar.f55868p) && this.f55860h.size() == oVar.f55860h.size()) {
                for (int i2 = 0; i2 < this.f55860h.size(); i2++) {
                    if (!Arrays.equals((byte[]) this.f55860h.get(i2), (byte[]) oVar.f55860h.get(i2))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static o a(String str, String str2, int i2, int i3, int i5, int i7, List list, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar, String str3) {
        return a(str, str2, i2, i3, i5, i7, -1, -1, -1, list, dVar, 0, str3, null);
    }

    public final int b() {
        int i2;
        int i3 = this.f55862j;
        if (i3 == -1 || (i2 = this.f55863k) == -1) {
            return -1;
        }
        return i3 * i2;
    }

    public final int hashCode() {
        if (this.f55852A == 0) {
            String str = this.f55853a;
            int iHashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.f55857e;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f55858f;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f55855c;
            int iHashCode4 = (((((((((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f55854b) * 31) + this.f55862j) * 31) + this.f55863k) * 31) + this.f55870r) * 31) + this.f55871s) * 31;
            String str5 = this.f55877y;
            int iHashCode5 = (((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f55878z) * 31;
            com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar = this.f55861i;
            int iHashCode6 = (iHashCode5 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVar = this.f55856d;
            this.f55852A = iHashCode6 + (bVar != null ? Arrays.hashCode(bVar.f55816a) : 0);
        }
        return this.f55852A;
    }

    public final String toString() {
        return "Format(" + this.f55853a + ", " + this.f55857e + ", " + this.f55858f + ", " + this.f55854b + ", " + this.f55877y + ", [" + this.f55862j + ", " + this.f55863k + ", " + this.f55864l + "], [" + this.f55870r + ", " + this.f55871s + "])";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f55853a);
        parcel.writeString(this.f55857e);
        parcel.writeString(this.f55858f);
        parcel.writeString(this.f55855c);
        parcel.writeInt(this.f55854b);
        parcel.writeInt(this.f55859g);
        parcel.writeInt(this.f55862j);
        parcel.writeInt(this.f55863k);
        parcel.writeFloat(this.f55864l);
        parcel.writeInt(this.f55865m);
        parcel.writeFloat(this.f55866n);
        parcel.writeInt(this.f55868p != null ? 1 : 0);
        byte[] bArr = this.f55868p;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f55867o);
        parcel.writeParcelable(this.f55869q, i2);
        parcel.writeInt(this.f55870r);
        parcel.writeInt(this.f55871s);
        parcel.writeInt(this.f55872t);
        parcel.writeInt(this.f55873u);
        parcel.writeInt(this.f55874v);
        parcel.writeInt(this.f55876x);
        parcel.writeString(this.f55877y);
        parcel.writeInt(this.f55878z);
        parcel.writeLong(this.f55875w);
        int size = this.f55860h.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray((byte[]) this.f55860h.get(i3));
        }
        parcel.writeParcelable(this.f55861i, 0);
        parcel.writeParcelable(this.f55856d, 0);
    }

    public static o a(String str, String str2, int i2, int i3, int i5, int i7, int i8, int i9, int i10, List list, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar, int i11, String str3, com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVar) {
        return new o(str, null, str2, null, i2, i3, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i5, i7, i8, i9, i10, i11, str3, -1, Long.MAX_VALUE, list, dVar, bVar);
    }

    public static o a(String str, String str2, int i2, String str3, int i3, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar, long j2, List list) {
        return new o(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str3, i3, j2, list, dVar, null);
    }

    public static o a(String str, String str2, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar) {
        return new o(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, dVar, null);
    }

    public final MediaFormat a() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f55858f);
        String str = this.f55877y;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        a(mediaFormat, "max-input-size", this.f55859g);
        a(mediaFormat, "width", this.f55862j);
        a(mediaFormat, "height", this.f55863k);
        float f3 = this.f55864l;
        if (f3 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f3);
        }
        a(mediaFormat, "rotation-degrees", this.f55865m);
        a(mediaFormat, "channel-count", this.f55870r);
        a(mediaFormat, "sample-rate", this.f55871s);
        a(mediaFormat, "encoder-delay", this.f55873u);
        a(mediaFormat, "encoder-padding", this.f55874v);
        for (int i2 = 0; i2 < this.f55860h.size(); i2++) {
            mediaFormat.setByteBuffer(m.a("csd-", i2), ByteBuffer.wrap((byte[]) this.f55860h.get(i2)));
        }
        com.fyber.inneractive.sdk.player.exoplayer2.video.c cVar = this.f55869q;
        if (cVar != null) {
            a(mediaFormat, "color-transfer", cVar.f56268c);
            a(mediaFormat, "color-standard", cVar.f56266a);
            a(mediaFormat, "color-range", cVar.f56267b);
            byte[] bArr = cVar.f56269d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public o(Parcel parcel) {
        this.f55853a = parcel.readString();
        this.f55857e = parcel.readString();
        this.f55858f = parcel.readString();
        this.f55855c = parcel.readString();
        this.f55854b = parcel.readInt();
        this.f55859g = parcel.readInt();
        this.f55862j = parcel.readInt();
        this.f55863k = parcel.readInt();
        this.f55864l = parcel.readFloat();
        this.f55865m = parcel.readInt();
        this.f55866n = parcel.readFloat();
        this.f55868p = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.f55867o = parcel.readInt();
        this.f55869q = (com.fyber.inneractive.sdk.player.exoplayer2.video.c) parcel.readParcelable(com.fyber.inneractive.sdk.player.exoplayer2.video.c.class.getClassLoader());
        this.f55870r = parcel.readInt();
        this.f55871s = parcel.readInt();
        this.f55872t = parcel.readInt();
        this.f55873u = parcel.readInt();
        this.f55874v = parcel.readInt();
        this.f55876x = parcel.readInt();
        this.f55877y = parcel.readString();
        this.f55878z = parcel.readInt();
        this.f55875w = parcel.readLong();
        int i2 = parcel.readInt();
        this.f55860h = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            this.f55860h.add(parcel.createByteArray());
        }
        this.f55861i = (com.fyber.inneractive.sdk.player.exoplayer2.drm.d) parcel.readParcelable(com.fyber.inneractive.sdk.player.exoplayer2.drm.d.class.getClassLoader());
        this.f55856d = (com.fyber.inneractive.sdk.player.exoplayer2.metadata.b) parcel.readParcelable(com.fyber.inneractive.sdk.player.exoplayer2.metadata.b.class.getClassLoader());
    }

    public static void a(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }
}
